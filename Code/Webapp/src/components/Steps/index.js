import React, { Component, Fragment } from 'react';
import Button from 'components/Button';
import Filter from 'components/Filter';
import Setting from 'components/Final';
import Element from 'components/Element';
import Loader from 'react-loader';
import connect from 'react-redux/es/connect/connect';
import { loadProccesor } from 'redux/actions/proccesor';
import { 
    loadFilters,
    loadMotherboardFilters,
} from 'redux/actions/filter';
import { loadGPU } from 'redux/actions/gpu';
import { loadResult } from 'redux/actions/result';
import { loadMotherboard } from 'redux/actions/motherboard';

import styles from './styles.scss';

class Steps extends Component {
    constructor(props) {
        super(props);
        this.state = {

        }
        this.onChange = this.onChange.bind(this);
    }
    componentWillMount(){
        if(this.props.path==='/')
        {
            this.props.loadProccesor();
            this.props.loadFilters();
        }
        if(this.props.path==='/motherboard')
        {
            this.props.loadMotherboard('AM4');
            this.props.loadMotherboardFilters();
        }
        if(this.props.path==='/gpu')
        {
            this.props.loadGPU();
            this.props.loadMotherboardFilters();
        }
        if(this.props.path==='/result')
        {
            this.props.loadResult(
                95,
                100,
                parseInt(localStorage.getItem('hdd'),10),
                parseInt(localStorage.getItem('cd'),10),
                parseInt(localStorage.getItem('blueray'),10),
                parseInt(localStorage.getItem('module'),10),
                parseInt(localStorage.getItem('fan'),10)
                );
        }
    }
    onChange(event){
        this.setState({[event.target.name]:event.target.value})
    }
    render(){
        const { 
            items,
            motherboard,
            gpu,
            result
         } = this.props
         console.log(result.result.powerSupplyUnits);
         switch(this.props.path){
            case '/':
             return(  
                <Fragment>
                    {
                        
                    }
                    <Loader loaded={!this.props.isLoading}>
                    <div className={styles.buttons}>
                        <Button 
                            value="STEP 1. CPU"
                        />
                        <Button 
                            value="STEP 2. Motherboard"
                        />
                        <Button 
                            value="STEP 3. GPU"
                        />
                        <Button 
                            value="STEP 4. Finaly"
                        />
                        <Button 
                            value="STEP 5. Result"
                        />
                    </div>
                   <div className={styles.steps}>
                        <Filter 
                            onChange={this.onChange}
                            filters={this.props.filters}
                        />
                            <div className={styles.elements}>
                                {
                                    items.items.map((item,iterator)=>{
                                        return (
                                        <Element 
                                            id={item.id}
                                            imageUrl={item.imageURL}
                                            title={item.name}
                                            describe={  
                                                [
                                                `price: ${item.price}`,
                                                `clockFrequency: ${item.clockFrequency}`,
                                                `family: ${item.family}`,
                                                `maxClockFrequency: ${item.maxClockFrequency}`,
                                                `numOfCores: ${item.numOfCores}`,
                                                `numOfThreads: ${item.numOfThreads}`,
                                                `socket: ${item.socket}`,
                                                `tdp: ${item.tdp}`,
                                                `vendor: ${item.vendor}`,
                                                `yearOfIssue: ${item.yearOfIssue}`,
    
                                                ]
                                            }
                                        />
                                        )
                                    })
                                }
                            </div>
                   </div> 
                   </Loader>
                </Fragment>
            )
            case '/motherboard':
            return(  
                <Fragment>
                    <Loader loaded={!this.props.isMotherboardLoding}>
                    <div className={styles.buttons}>
                        <Button 
                            value="STEP 1. CPU"
                        />
                        <Button 
                            value="STEP 2. Motherboard"
                        />
                        <Button 
                            value="STEP 3. GPU"
                        />
                        <Button 
                            value="STEP 4. Finaly"
                        />
                        <Button 
                            value="STEP 5. Result"
                        />
                    </div>
                   <div className={styles.steps}>
                        <Filter 
                            onChange={this.onChange}
                            filters={this.props.filters}
                        />
                            <div className={styles.elements}>
                                {
                                    motherboard.motherboard.map((item,iterator)=>{
                                        return (
                                        <Element 
                                            id={item.id}
                                            imageUrl={item.imageURL}
                                            title={item.name}
                                            describe={  
                                                [
                                                `price: ${item.price}`,
                                                `chipset: ${item.chipset}`,
                                                `socket: ${item.socket}`,                   
                                                `vendor: ${item.vendor}`,              
                                                `form: ${item.form}`,
                                                `typeOfMemory: ${item.typeOfMemory}`,
                                                `numOfMemorySlots: ${item.numOfMemorySlots}`,
                                                `maxMemoryVolume: ${item.maxMemoryVolume}`,
                                                `numOfMemoryChannels: ${item.numOfMemoryChannels}`,
                                                `builtInGraphics: ${item.builtInGraphics}`,
                                                `vendor: ${item.vendor}`,
                                                `yearOfIssue: ${item.yearOfIssue}`,
    
                                                ]
                                            }
                                        />
                                        )
                                    })
                                }
                            </div>
                   </div> 
                   </Loader>
                </Fragment>
            )
            case '/gpu':
            return(  
                <Fragment>
                    <Loader loaded={!this.props.isGpuLoading}>
                    <div className={styles.buttons}>
                        <Button 
                            value="STEP 1. CPU"
                        />
                        <Button 
                            value="STEP 2. Motherboard"
                        />
                        <Button 
                            value="STEP 3. GPU"
                        />
                        <Button 
                            value="STEP 4. Finaly"
                        />
                        <Button 
                            value="STEP 5. Result"
                        />
                    </div>
                   <div className={styles.steps}>
                        <Filter 
                            onChange={this.onChange}
                            filters={this.props.filters}
                        />
                            <div className={styles.elements}>
                                {
                                    gpu.gpu.map((item,iterator)=>{
                                        return (
                                        <Element 
                                            id={item.id}
                                            imageUrl={item.imageURL}
                                            title={item.name}
                                            describe={  
                                                [
                                                `price: ${item.price}`,
                                                `clockFrequency: ${item.clockFrequency}`,
                                                `family: ${item.family}`,
                                                `maxClockFrequency: ${item.maxClockFrequency}`,
                                                `numOfCores: ${item.numOfCores}`,
                                                `numOfThreads: ${item.numOfThreads}`,
                                                `socket: ${item.socket}`,
                                                `tdp: ${item.tdp}`,
                                                `vendor: ${item.vendor}`,
                                                `yearOfIssue: ${item.yearOfIssue}`,
    
                                                ]
                                            }
                                        />
                                        )
                                    })
                                }
                            </div>
                   </div> 
                   </Loader>
                </Fragment>
            )
            case '/final':
            return(  
                <Fragment>
                    <div className={styles.buttons}>
                        <Button 
                            value="STEP 1. CPU"
                        />
                        <Button 
                            value="STEP 2. Motherboard"
                        />
                        <Button 
                            value="STEP 3. GPU"
                        />
                        <Button 
                            value="STEP 4. Finaly"
                        />
                        <Button 
                            value="STEP 5. Result"
                        />
                    </div>
                   <div className={styles.steps}>
                       <Setting />
                   </div> 
                </Fragment>
            )
               case '/result':
             return(  
                <Fragment>
                    <Loader loaded={!this.props.isResultLoading}>
                    <div className={styles.buttons}>
                        <Button 
                            value="STEP 1. CPU"
                        />
                        <Button 
                            value="STEP 2. Motherboard"
                        />
                        <Button 
                            value="STEP 3. GPU"
                        />
                        <Button 
                            value="STEP 4. Finaly"
                        />
                        <Button 
                            value="STEP 5. Result"
                        />
                    </div>
                   <div className={styles.steps}>
                            <div className={styles.elements}>
                                {
                                    result.result.powerSupplyUnits!==undefined?
                                     result.result.powerSupplyUnits.map((item,iterator)=>{
                                        return (
                                        <Element 
                                            id={item.id}
                                            imageUrl={item.imageURL}
                                            title={item.name}
                                            describe={  
                                                [
                                                `price: ${item.price}`,
                                                `clockFrequency: ${item.clockFrequency}`,
                                                `family: ${item.family}`,
                                                `maxClockFrequency: ${item.maxClockFrequency}`,
                                                `numOfCores: ${item.numOfCores}`,
                                                `numOfThreads: ${item.numOfThreads}`,
                                                `socket: ${item.socket}`,
                                                `tdp: ${item.tdp}`,
                                                `vendor: ${item.vendor}`,
                                                `yearOfIssue: ${item.yearOfIssue}`,
    
                                                ]
                                            }
                                        />
                                        )
                                    }):null
                                }
                            </div>
                   </div> 
                   </Loader>
                </Fragment>
            )
        }
   
    }
}

const mapStateToProps = state => {
  return {
    items: state.processor,
    isLoading: state.processor.loading,
    isMotherboardLoding: state.motherboard.loading,
    isGpuLoading: state.gpu.loading,
    filters: state.filter.filters,
    motherboard: state.motherboard,
    gpu: state.gpu,
    isResultLoading: state.result.loading,
    result :state.result
  }
}

export default connect(mapStateToProps, { loadProccesor, loadFilters, loadMotherboard, loadMotherboardFilters, loadGPU, loadResult })(Steps)
