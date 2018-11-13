import { 
    LOAD_PROCCERSOR_BEGIN,
    LOAD_PROCCERSOR_SUCCESS,
    LOAD_PROCCERSOR_FAILURE, 
  } from 'constants/index';

  const initialState = {
    items: [],
    loading: true,
    error: null,
  };

  export default function proccesorReducer(state = initialState, action) {
      switch(action.type){
          case LOAD_PROCCERSOR_BEGIN:
            return {
                ...state,
                loading: true,
                error: null,
            }
          case LOAD_PROCCERSOR_SUCCESS:
             return {
                ...state,
                loading: false,
                items: action.payload,
            };  
            case LOAD_PROCCERSOR_FAILURE:
               return {
                  ...state,
                  loading: false,
                  error: action.payload,
            }; 
            default:
              return state

      }
  }