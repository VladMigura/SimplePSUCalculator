import { 
    LOAD_GPU_BEGIN,
    LOAD_GPU_SUCCESS,
    LOAD_GPU_FAILURE,
  } from 'constants/index';

  const initialState = {
    gpu: [],
    loading: true,
    error: null,
  };

  export default function gpuReducer(state = initialState, action) {
      switch(action.type){
          case LOAD_GPU_BEGIN:
            return {
                ...state,
                loading: true,
                error: null,
            }
          case LOAD_GPU_SUCCESS:
             return {
                ...state,
                loading: false,
                gpu: action.payload,
            };  
            case LOAD_GPU_FAILURE:
               return {
                  ...state,
                  loading: false,
                  error: action.payload,
            }; 
            default:
              return state

      }
  }