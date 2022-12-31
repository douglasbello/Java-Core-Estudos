package db;

import java.io.Serial;

public class DbIntegrityException extends RuntimeException {
    @Serial
    public static final long serialVersionUID = 1L;

    public DbIntegrityException(String msg) {
        super(msg);
    }
}
