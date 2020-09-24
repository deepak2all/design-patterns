package creational.singleton.log4;

public enum EnumSingleton {
	INSTANCE;
	
	String config;
	
    public String getConfig() {
        return config;
    }
    public void setValue(String config) {
        this.config = config;
    }
}
