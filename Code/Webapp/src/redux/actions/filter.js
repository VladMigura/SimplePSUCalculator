import { 
    LOAD_FILTER_BEGIN,
    LOAD_FILTER_SUCCESS,
    LOAD_FILTER_FAILURE,
  } from 'constants/index';
  import API from 'utils/api'

  const loadFilterBegin = () => ({
    type: LOAD_FILTER_BEGIN,
  });
  
  const loadFilterSuccess = payload => ({
    type: LOAD_FILTER_SUCCESS,
    payload,
  });
  
  const loadFilterFailure = payload => ({
    type: LOAD_FILTER_FAILURE,
    payload,
  });

  
  export function loadFilters() {
    return dispatch => {
        dispatch(loadFilterBegin())
        API.get('/processors/filters')
        .then(response=> {
            dispatch(loadFilterSuccess(response.data))
        }).catch(error=>{
            loadFilterFailure(error)
            })
    }
}

export function loadMotherboardFilters() {
    return dispatch => {
        dispatch(loadFilterBegin())
        API.get('/motherboard/filters')
        .then(response=> {
            dispatch(loadFilterSuccess(response.data))
        }).catch(error=>{
            loadFilterFailure(error)
            })
    }
}
