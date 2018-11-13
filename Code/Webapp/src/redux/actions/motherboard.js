import { 
    LOAD_MOTHERBOARD_BEGIN,
    LOAD_MOTHERBOARD_SUCCESS,
    LOAD_MOTHERBOARD_FAILURE,
  } from 'constants/index';
  import API from 'utils/api'

  const fetchMotherboardBegin = () => ({
    type: LOAD_MOTHERBOARD_BEGIN,
  });
  
  const fetchMotherboardSuccess = payload => ({
    type: LOAD_MOTHERBOARD_SUCCESS,
    payload,
  });
  
  const fetchMotherboardFailure = payload => ({
    type: LOAD_MOTHERBOARD_FAILURE,
    payload,
  });

  export function loadMotherboard(supportedCpuSocket) {
    return dispatch => {
        dispatch(fetchMotherboardBegin())
        API.get('/motherboards',{
            params:{
                supportedCpuSocket
            }
        })
        .then(response=> {
            dispatch(fetchMotherboardSuccess(response.data))
        }).catch(error=>{
            fetchMotherboardFailure(error)
            })
    }
}
