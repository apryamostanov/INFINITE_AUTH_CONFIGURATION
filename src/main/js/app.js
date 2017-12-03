'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {majorVersions: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/majorVersion'}).done(response => {
			this.setState({majorVersions: response.entity._embedded.majorVersions});
		});
	}

	render() {
		return (
			<majorVersionList majorVersions={this.state.majorVersions}/>
		)
	}
}
// end::app[]

// tag::majorVersion-list[]
class majorVersionList extends React.Component{
	render() {
		var majorVersions = this.props.majorVersions.map(majorVersion =>
			<majorVersion key={majorVersion._links.self.href} majorVersion={majorVersion}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Major Version</th>
					</tr>
					{majorVersions}
				</tbody>
			</table>
		)
	}
}
// end::majorVersion-list[]

// tag::majorVersion[]
class majorVersion extends React.Component{
	render() {
		return (
			<tr>
				<td>{ this.props.majorVersion.majorVersion}</td>
			</tr>
		)
	}
}
// end::majorVersion[]

// tag::render[]
ReactDOM.render(
	<App />,
	document.getElementById('react')
)
// end::render[]

