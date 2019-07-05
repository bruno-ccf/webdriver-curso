package suporte;

import com.sun.jna.platform.win32.Sspi;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generation {

    public static String dataHoraParaArquivo() {

        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss").format(ts);

    }
}
