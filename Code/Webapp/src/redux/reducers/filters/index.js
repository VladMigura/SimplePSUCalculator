import { 
    LOAD_FILTER_BEGIN,
    LOAD_FILTER_SUCCESS,
    LOAD_FILTER_FAILURE,
  } from 'constants/index';
  const initialState = {
    filters: [],
    loading: true,
    error: null,
  };

  export default function filterReducer(state = initialState, action) {
      switch(action.type){
          case LOAD_FILTER_BEGIN:
            return {
                ...state,
                loading: true,
                error: null,
            }
          case LOAD_FILTER_SUCCESS:
             return {
                ...state,
                loading: false,
                filters: action.payload,
            };  
            case LOAD_FILTER_FAILURE:
               return {
                  ...state,
                  loading: false,
                  error: action.payload,
            }; 
            default:
              return state

      }
  }