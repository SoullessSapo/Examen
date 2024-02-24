1. Se arroja la excepción cuando entra como parámetro una edad negativa, cuando los días de antelación tienen un valor negativo y, además, se ingresa una tarifa base menor a cero.
2. edad:
      | Número | Clase de Equivalencia          | Resultado  |
      | ------ | ------------------------------ | ---------- |
      | 0 <    | No se aceptan edades negativas | Incorrecto |
      | 0-18   | Edad menor de edad             | Correcto   |
      | 19-65  | Edad para adulto               | Correcto   |
      | 66-118 | Edad para adulto mayor         | Correcto   |
      | 118 >  | No se aceptan edades tan altas | Incorrecto |
   
   tarifabase:
      |Número   | Clase equivalencia              | Resultado   |
      | ------  | ------------------------------  | ----------  |
      |0 <      | tarifa negativa para un vuelo   | Incorrecto  |
      |0        | tarifa gratis                   | Correcto    |
      |0 >      | tarifa válida para un vuelo     | Correcto    |
   
   diasantelacion:
     |Número | Clase equivalencia   | Resultado|
     |------ |--------------------  |----------|
     |0 <    | ya no tiene validez  |Incorrecto|
     |0-20   | no aplica descuento  |Correcto  |
     |20 >   | aplica descuento     |Correcto  |



