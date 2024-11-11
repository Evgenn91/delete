public enum TestEnum {
    holding("холдинг"),
    organization("организация"),
    division("подразделение"),
    filial("филиал"),
    department("департамент");

    private String name;

    private TestEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
