package mda.practico_1;

@SuppressWarnings({"DuplicateExpressions", "ConstantConditions"})
public class Triangle {

    public boolean esEscaleno(int sideA, int sideB, int sideC){
        return (sideA != sideB && sideA != sideC && sideB != sideC);
    }

    public boolean esIsosceles(int sideA, int sideB, int sideC){
        return (sideA == sideB && sideA != sideC) || (sideC == sideB && sideC != sideA) || (sideA == sideC && sideC != sideB);
    }

    public boolean esEquilatero(int sideA, int sideB, int sideC){
        return (sideA == sideB && sideB == sideC);
    }

    public boolean esRecto (int sideA, int sideB, int sideC){
        boolean result = false;
        if(esEquilatero(sideA,sideB,sideC)){
            result = false;
        }
        else if(esIsosceles(sideA,sideB,sideC)){
            if(sideA == sideB){
                if((sideA*sideA + sideB*sideB) == sideC*sideC){
                    result = true;
                }
            }
            else if(sideA == sideC){
                if((sideA*sideA + sideC*sideC) == sideB*sideB){
                    result = true;
                }
            }
            else if(sideB == sideC){
                if((sideB*sideB + sideC*sideC) == sideA*sideA){
                    result = true;
                }
            }
        }
        else{
            // es escaleno
            if(sideA > sideB && sideA > sideC){
                result = sideA*sideA == sideB*sideB + sideC*sideC;
            }
            else if(sideB > sideA && sideB > sideC){
                result = sideB*sideB == sideA*sideA + sideC*sideC;
            }
            else{
                result = sideC*sideC == sideA*sideA + sideB*sideB;
            }
        }

        return  result;
    }


}
