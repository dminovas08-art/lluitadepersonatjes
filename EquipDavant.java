public class EquipDavant extends Equip {
    public EquipDavant(String nom) {
        super(nom);
        afegirPersonatge(new Puado("Bernat", this));
        afegirPersonatge(new MissDanger("Isaac", this));
        afegirPersonatge(new ExercitMinioms("Daniel", this));
        afegirPersonatge(new Teletubi("David", this));
    }
}
