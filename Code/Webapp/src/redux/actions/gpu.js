import { 
    LOAD_GPU_BEGIN,
    LOAD_GPU_SUCCESS,
    LOAD_GPU_FAILURE,
  } from 'constants/index';
  import API from 'utils/api'

  const loadGPUBegin = () => ({
    type: LOAD_GPU_BEGIN,
  });
  
  const loadGPUSuccess = payload => ({
    type: LOAD_GPU_SUCCESS,
    payload,
  });
  
  const loadGPUFailure = payload => ({
    type: LOAD_GPU_FAILURE,
    payload,
  });

  export function loadGPU() {
    return dispatch => {
        dispatch(loadGPUBegin())
        API.get('/videocards')
        .then(response=> {
            dispatch(loadGPUSuccess(response.data))
        }).catch(error=>{
            loadGPUFailure(error)
            })
    }
}
