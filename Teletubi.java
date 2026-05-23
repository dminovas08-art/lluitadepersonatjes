public class Teletubi extends Personatge {

    private boolean furiaActiva = false;
    private final int BONUS_FURIA = 8;

    public Teletubi(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void ferAccio(Personatge oponent) {
        int accio = Dau.tirar(2);
        if (accio == 1) {
            atacarNormal(oponent);
        } else {
            atacarEspecial(oponent);
        }
        if (furiaActiva) {
            furiaActiva = false;
        }
    }

    private void atacarNormal(Personatge oponent) {
        int mal = Dau.tirar(10);

        if (furiaActiva) {
            mal += mal * BONUS_FURIA;
            System.out.println(getNom() + " està ENFADAT i fa un atac potenciat!");
        }

        atacarAmbMal(oponent, mal);
    }

    private void atacarEspecial(Personatge oponent) {
        int mal = Dau.tirar(10) + 5;

        if (furiaActiva) {
            mal += mal * BONUS_FURIA;
            System.out.println(getNom() + " està ENFADAT i fa un ATAC ESPECIAL potenciat!");
        }

        System.out.println(getNom() + " fa un ATAC ESPECIAL!");
        atacarAmbMal(oponent, mal);
    }

    @Override
    public void rebreMal( int mal) {
        super.rebreMal(mal);

        if (esViu()) {
            furiaActiva = true;
            System.out.println(getNom() + " entra en ESTAT DE FÚRIA!");
        }
    }
}
