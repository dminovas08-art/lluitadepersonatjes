public class EquipSanador extends Equip {
    public EquipSanador(String nom) {
        super(nom);
        afegirPersonatge(new CuranderDavid("Curander", this));
    }
}
