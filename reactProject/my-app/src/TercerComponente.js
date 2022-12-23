import React from 'react'

export const TercerComponente = (props) => {
  return (
    <div>

        <h1>TercerComponente</h1> 
        <h2> Comunicacion entre componentes</h2>
        <ul>
            <li>{props.nombre}</li>
            <li>{props.apellido}</li>
            <li>{props.ficha.grupo}</li>
        </ul>
    </div>

  )
}
