import { routerReducer } from 'react-router-redux';
import { combineReducers } from 'redux';
import proccesorReducer from './proccesor/index';
import motherboardReducer from './motherboard/index';
import gpuReducer from './gpu/index';
import filterReducer from './filters/index';
import resultReducer from './result/index';

export default combineReducers({
  routing: routerReducer,
  processor: proccesorReducer,
  filter: filterReducer,
  motherboard: motherboardReducer,
  gpu: gpuReducer,
  result: resultReducer
});