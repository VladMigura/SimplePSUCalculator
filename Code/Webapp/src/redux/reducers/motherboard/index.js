import { 
    LOAD_MOTHERBOARD_BEGIN,
    LOAD_MOTHERBOARD_SUCCESS,
    LOAD_MOTHERBOARD_FAILURE,
  } from 'constants/index';

  const initialState = {
    motherboard: [],
    loading: true,
    error: null,
  };

  export default function motherboardReducer(state = initialState, action) {
      switch(action.type){
          case LOAD_MOTHERBOARD_BEGIN:
            return {
                ...state,
                loading: true,
                error: null,
            }
          case LOAD_MOTHERBOARD_SUCCESS:
             return {
                ...state,
                loading: false,
                motherboard: action.payload,
            };  
            case LOAD_MOTHERBOARD_FAILURE:
               return {
                  ...state,
                  loading: false,
                  error: action.payload,
            }; 
            default:
              return state

      }
  }