
public interface RPGCharacter {
    void atk(); //โจมตี
    void def(); //ป้องกัน
    void useSpecialAbility(); //ใช้ skill พิเศษ
    void useItem();  // ใช้ item



}
 interface Warrior extends RPGCharacter{
    void performSpecialAbility();
}

 interface Mage extends RPGCharacter{
    void castSpell();   // ร่ายเวทได้จ้า
}

 interface Assassin extends RPGCharacter{
    void invisibility();  // หายตั๋ว
}

 interface Archer extends RPGCharacter{
    void  heavyShot();  // ยิงหนักๆเกาะแตกซะแหลกขาด
}

