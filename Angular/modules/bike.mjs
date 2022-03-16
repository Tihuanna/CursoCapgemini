class Bike {
    velocidade = 0

    andar(){
        if(this.velocidade > 0) console.log("bicicleta em movimento")
        this.velocidade = 5
    }
}

export {Bike} ;