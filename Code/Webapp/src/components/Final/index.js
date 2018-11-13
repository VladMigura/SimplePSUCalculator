import React, { Component } from 'react';
import Button from 'components/Button';
import styles from './styles.scss';

class Setting extends Component {
    constructor(props) {
        super(props);
        this.state={

        }
        this.onSubmit = this.onSubmit.bind(this);
        this.onChange = this.onChange.bind(this);
        
    }
    onChange(event){
        event.preventDefault();
        this.setState({[event.target.name]:event.target.value})
        localStorage.setItem(event.target.name,event.target.value);
    }
    onSubmit(event){
        event.preventDefault();

    }
    render(){
        return(
            <form
                onSubmit={this.onSubmit}
                className={styles.settings}
            >
            <div className={styles.settgins_wrap}>
                <div className={styles.settings_item}>
                <h1>Storage</h1>
                    <div className={styles.param}>
                            <p>HDD/SSD</p>
                            <input 
                                onChange={this.onChange}
                                name="hdd"
                                type="number"
                                placeholder="1 to 4"
                                min='1'
                                max='4' 
                            />
                        </div>
                         <div className={styles.param}>
                            <p>CD/DVD</p>
                            <input 
                                onChange={this.onChange}
                                name="cd"
                                type="number"
                                placeholder="1 to 4"
                                min='1'
                                max='4' 
                            />
                         </div>
                         <div className={styles.param}>
                            <p>Blue-ray</p>
                            <input
                                onChange={this.onChange}
                                name="blueray" 
                                type="number"
                                placeholder="1 to 4"
                                min='1'
                                max='4' 
                            />
                    </div>
                </div>
                <div className={styles.settings_item}>
                <h1>RAM</h1>
                    <div className={styles.param}>
                            <p>Module</p>
                            <input 
                                onChange={this.onChange}
                                name="module" 
                                type="number"
                                placeholder="1 to 4"
                                min='1'
                                max='4' 
                            />
                        </div>
                </div>
                <div className={styles.settings_item}>
                <h1>FANs</h1>
                    <div className={styles.param}>
                            <p>FAN</p>
                            <input 
                                onChange={this.onChange}
                                name="fan" 
                                type="number"
                                placeholder="1 to 4"
                                min='1'
                                max='4' 
                            />
                        </div>
                </div>
            </div>
                <Button 
                    value="result"
                    type="submit"
                />
                
            </form>
        )
    }
}
export default Setting  