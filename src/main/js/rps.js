const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class Rps extends React.Component {

    constructor(props) {
        super(props);
        this.state = {games: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/rps/games'}).done(response => {
            this.setState({games: response.entity._embedded.games});
        });
    }

    render() {
        return (
            <GameList games={this.state.games}/>
        )
    }
}

class GameList extends React.Component{
    render() {
        const games = this.props.games.map(game =>
            <Game key={game._links.self.href} game={game}/>
        );
        return (
            <table>
                <tbody>
                <tr>
                    <th>user name</th>
                    <th>wins</th>
                    <th>losses</th>
                    <th>draws</th>
                </tr>
                {games}
                </tbody>
            </table>
        )
    }
}

class Game extends React.Component{
    render() {
        return (
            <tr>
                <td>{this.props.game.userName}</td>
                <td>{this.props.game.wins}</td>
                <td>{this.props.game.losses}</td>
                <td>{this.props.game.draws}</td>
            </tr>
        )
    }
}

ReactDOM.render(
    <Rps />,
    document.getElementById('react')
)
