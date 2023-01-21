public class CantDriveException extends Exception {
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public CantDriveException(String message, Driver driver) {
        super(message);
        this.driver = driver;
    }
}
