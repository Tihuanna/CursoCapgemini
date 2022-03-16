import {Car} from './modules/car.mjs'
import {Bike} from './modules/bike.mjs'

let carro = new Car();
carro.andar()
console.log(carro.velocidade)

let bike = new Bike();
bike.andar()
console.log(bike.velocidade)
