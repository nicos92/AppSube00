import org.example.Saldo;
import org.junit.*;


public class SaldoTest {

    private final Saldo saldoTest = new Saldo(0.0);

    @Test
    public void getSaldoTest() {
        double saldo = saldoTest.getSaldo();
        Assert.assertEquals(0.0, saldo, 0.0);
    }

    @Test
    public void setSaldoTest(){
        double saldo = 0.5;
        saldoTest.setSaldo(saldo);
        Assert.assertEquals( 0.5, saldoTest.getSaldo(), 0.5);
    }

    @Test
    public void cargarSaldoTest(){
        saldoTest.cargarSaldo(1.5);
        Assert.assertEquals(1.5, 0.0, 1.5);
    }

    @Test
    public void toStringTest(){
        Assert.assertEquals(""+ saldoTest.getSaldo(), saldoTest.toString());
    }
}
