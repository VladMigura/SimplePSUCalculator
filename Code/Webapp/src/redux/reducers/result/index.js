import { 
    LOAD_RESULT_BEGIN,
    LOAD_RESULT_SUCCESS,
    LOAD_RESULT_FAILURE,
  } from 'constants/index';

  const initialState = {
    result: [],
    loading: true,
    error: null,
  };

  export default function resultReducer(state = initialState, action) {
      switch(action.type){
          case LOAD_RESULT_BEGIN:
            return {
                ...state,
                loading: true,
                error: null,
            }
          case LOAD_RESULT_SUCCESS:
             return {
                ...state,
                loading: false,
                result: action.payload,
            };  
            case LOAD_RESULT_FAILURE:
               return {
                  ...state,
                  loading: false,
                  error: action.payload,
            }; 
            default:
              return state

      }
  }