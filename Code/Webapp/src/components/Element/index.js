import React, { Component, Fragment } from 'react';
import Button from 'components/Button';
import Filter from 'components/Filter'
import connect from 'react-redux/es/connect/connect';
import { withRouter } from 'react-router';
import styles from './styles.scss';

class Element extends Component {
    constructor(props) {
        super(props)
        this.state = {

        }
        this.choseGPU = this.choseGPU.bind(this);
    }
    choseGPU(socket){
        localStorage.setItem('socket',socket)
    }
    render(){
        return(
            <div 
             onClick={()=>this.choseGPU(this.props.socket)}
             className={styles.element}
             >
                <img 
                    className={styles.element_icon} 
                    src={this.props.imageUrl} 
                />
                <div className={styles.describe}>
                    <h1>{this.props.title}</h1>
                    <div className={styles.description}>
                        {
                            this.props.describe.map(item=>{
                                return(
                                    <p>{item}</p>
                                )
                            })
                        }
                    </div>
                </div>
            </div>
        )
    }
}

export default Element;
