public class CuranderDavid extends Personatge {

    public CuranderDavid(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void ferAccio(Personatge oponent) {
        int accio = Dau.tirar(2);

        if (accio == 1) {
            curar();
        } else {
            atacar(oponent);
        }
    }

    private void atacar(Personatge oponent) {
        int mal = Dau.tirar(10);
        atacarAmbMal(oponent, mal);
    }

    private void curar() {
        int quantitat = Dau.tirar(10);
        UI.mostrarCuracio(this, this, quantitat); // mostra qui cura a qui
        rebreCuracio(quantitat);
    }

}
