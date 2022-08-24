package ModeloDatos;

import java.security.AccessControlContext;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JLabel;

public class RelojDigital extends Thread {
    private JLabel jLabel1 = new JLabel();
    public RelojDigital(JLabel jLabel1) {
        super();
        this.jLabel1 = jLabel1;
    }

    @Override
    public void run() {
        super.run();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String hora = "";
        try {
            do {
                hora = sdf.format(new Date());
                jLabel1.setText(hora);
                this.sleep(500);
            }while (true);
        } catch (InterruptedException errorSleep) {
        
        } catch (Exception error) {
            
        }
    }
}
