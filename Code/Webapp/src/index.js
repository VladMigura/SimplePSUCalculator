import React from 'react';
import ReactDOM from 'react-dom';
import App from './containers/App';
import { BrowserRouter, Route } from 'react-router-dom'
import { Provider } from 'react-redux'
import configureStore from './store';
const store = configureStore();

const root = document.getElementById('root');

ReactDOM.render(
  <Provider store={store}>
    <BrowserRouter>
      <div>
        <Route exact path="/" component={App} />
        <Route path="/motherboard" component={App} />
        <Route path="/gpu" component={App} />
        <Route path="/final" component={App} />
        <Route path="/result" component={App} />
      </div>
    </BrowserRouter>
  </Provider>,
  root
);

