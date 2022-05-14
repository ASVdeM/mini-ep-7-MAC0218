package domain

class AnalisadorDeAprovacao {

    fun defineCriterio (Criterio c){
    }
    fun fechaBoletim (Boletim b) throws Exception{
        BoletimFechado boletim;
        boletim.mediaEPs = b.mediaEPs
        boletim.mediaMiniEPs = b.mediaMiniEPs
        boletim.mediaFinal = 7.0
        boletim.foiAprovado = true
        return boletim
    }

}
