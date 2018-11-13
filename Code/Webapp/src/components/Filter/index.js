import React, { Component } from 'react';
import Button from 'components/Button';
import Select from 'components/Select';
import styles from './styles.scss';

class  Filter extends Component {
    constructor(props){
        super(props);
        this.onChange = this.onChange.bind(this);
}
            
   onChange(event){
        this.setState({[event.target.name]:event.target.value})
        console.log('here')
    }
    render(){
        const { 
            filters,
            onChange
        } = this.props

        return (
            <div className={styles.filter}>
            {
                Object.keys(filters).map(item=>{
                    return(
                        <Select
                            name={item}
                            onChange={this.onChange}
                            filterValue={Object.values(filters)}
                        />
                    )
                })
            }       
                <Button 
                    value="Accept" 
                />
            </div>
        )
    }
}

export default Filter;
