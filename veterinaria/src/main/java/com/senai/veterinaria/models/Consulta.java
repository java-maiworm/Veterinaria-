package com.senai.veterinaria.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta {
        private Long id;
        private int idAnimal;
        private int idConta;
        private LocalDateTime dataInicio;
        private LocalDateTime dataFinal;
    
        public Consulta() {}
    
        public Consulta( int idAnimal, int idConta, 
        LocalDateTime dataInicio, LocalDateTime dataFinal){
            this.idAnimal = idAnimal;
            this.idConta = idConta;
            this.dataInicio = dataInicio;
            this.dataFinal = dataFinal;
        }

        

}
