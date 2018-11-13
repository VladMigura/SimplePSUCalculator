import React from 'react';
import Button from '@material-ui/core/Button';

const style = {
  background: '#85CE36',
  color: '#fff'
}

function CustomButton (props) {
  return (
    <Button onClick={props.onClick} type={props.type} style={style}>
      {props.value}
    </Button>
  )
}

export default CustomButton;