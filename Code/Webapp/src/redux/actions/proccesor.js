import { 
    LOAD_PROCCERSOR_BEGIN,
    LOAD_PROCCERSOR_SUCCESS,
    LOAD_PROCCERSOR_FAILURE,
  } from 'constants/index';
  import API from 'utils/api'

  
const fetchProccesorBegin = () => ({
    type: LOAD_PROCCERSOR_BEGIN,
  });
  
  const fetchProccesorSuccess = payload => ({
    type: LOAD_PROCCERSOR_SUCCESS,
    payload,
  });
  
  const fetchProccesorFailure = payload => ({
    type: LOAD_PROCCERSOR_FAILURE,
    payload,
  });

  export function loadProccesor() {
      return dispatch => {
          dispatch(fetchProccesorBegin())
          API.get('/processors')
          .then(response=> {
              dispatch(fetchProccesorSuccess(response.data))
          }).catch(error=>{
                  fetchProccesorFailure(error)
              })
      }
  }
