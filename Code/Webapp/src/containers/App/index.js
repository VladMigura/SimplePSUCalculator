import React, { Component } from 'react';
import { Route } from 'react-router-dom';
import Header from 'components/Header';
import Steps from 'components/Steps';
import 'theme/main.scss';

class App extends Component {
    render(){
        return (
            <div>
                <Header />
                <Steps 
                  path={this.props.match.path}
                />
            </div>
        )
    }
}

export default App;