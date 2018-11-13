import React from 'react';
import { Link } from 'react-router-dom';
import styles from './styles.scss';

const navItem = [

]

function Header(props) {
  return(
    <div className={styles.navbar}>
      <span className={styles.logo}>
        Simple PSU Calculator
      </span>
      <nav className={styles.menu}>
        <ul className={styles.menu_items}>
          {
            navItem.map(item=>(<li key={item.key}>{ item.value }</li>))
          }
        </ul>
      </nav>
    </div>
  )
}

export default Header;