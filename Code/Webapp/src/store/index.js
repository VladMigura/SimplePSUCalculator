import { createStore, applyMiddleware, compose } from 'redux';
import { createLogger } from 'redux-logger';
import thunk from 'redux-thunk';
import reducers from '../redux/reducers/index';

const enhancers = [];
let middleware = [thunk];

const configureStore = () => {
  const devToolsExtension = window.__REDUX_DEVTOOLS_EXTENSION__;

  if (typeof devToolsExtension === 'function') {
    enhancers.push(devToolsExtension());
  }

  const logger = createLogger({
    collapsed: true,
  });

  middleware = [...middleware, logger];

  const store = createStore(
    reducers,
    compose(applyMiddleware(...middleware), ...enhancers)
  );

  return store;
};

export default configureStore;
