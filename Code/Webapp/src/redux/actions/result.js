import { 
    LOAD_RESULT_BEGIN,
    LOAD_RESULT_SUCCESS,
    LOAD_RESULT_FAILURE,
  } from 'constants/index';
  import API from 'utils/api'

  
const fetchResultBegin = () => ({
    type: LOAD_RESULT_BEGIN,
  });
  
  const fetchResultSuccess = payload => ({
    type: LOAD_RESULT_SUCCESS,
    payload,
  });
  
  const fetchResultFailure = payload => ({
    type: LOAD_RESULT_FAILURE,
    payload,
  });

  export function loadResult(cpuTdpValue, videocardTdpValue, hddSsdCount, cdDvdCount,
    bluRayCount, ramModulesCount, fansCount ) {
      return dispatch => {
          dispatch(fetchResultBegin())
          API.get('/result',{
              params:{
                cpuTdpValue,
                videocardTdpValue,
                hddSsdCount,
                cdDvdCount,
                bluRayCount,
                ramModulesCount,
                fansCount,
              }
          })
          .then(response=> {
              dispatch(fetchResultSuccess(response.data))
          }).catch(error=>{
                dispatch(fetchResultFailure(error))
              })
      }
  }
