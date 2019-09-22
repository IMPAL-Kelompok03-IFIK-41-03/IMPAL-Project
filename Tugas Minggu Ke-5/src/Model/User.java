package Model;

/**
 *
 * @author Ifdhal Hadi
 * 
 */
public class User {
    private String nama;
    private char NISN;
    private String alamat;
    private char noHP;
    private String email;

    public User(String nama, char NISN, String alamat, char noHP, String email) {
        this.nama = nama;
        this.NISN = NISN;
        this.alamat = alamat;
        this.noHP = noHP;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getNISN() {
        return NISN;
    }

    public void setNISN(char NISN) {
        this.NISN = NISN;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public char getNoHP() {
        return noHP;
    }

    public void setNoHP(char noHP) {
        this.noHP = noHP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void inputDataRegistrasi() {
        
    }
}
