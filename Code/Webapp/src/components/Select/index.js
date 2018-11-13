import React, { Component } from 'react';
import Select from '@material-ui/core/Select';
import MenuItem from '@material-ui/core/MenuItem';


const styles = theme => ({
    root: {
      display: 'flex',
      flexWrap: 'wrap',
    },
    formControl: {
      margin: theme.spacing.unit,
      minWidth: 120,
    },
    selectEmpty: {
      marginTop: theme.spacing.unit * 2,
    },
  });
  

class CustomSelect extends Component  {
  constructor(props) {
      super(props);
  }
  render(){
    const {
      filterValue,
      onChange,
      item
    } = this.props
    return (
      <select
        onChange={(event)=>onChange(event)}
        name={item}
      >     
       {
         filterValue.map((item,iterator)=>{
           return item.map(filter=>{
              return (
                <option value={filter}>{filter}</option>
  
              )
           })
         })
       }
        
     </select>
    )
  }
  
}

export default CustomSelect;