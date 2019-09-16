package Task06;

class Auto {

    private boolean fourWheelDrive;         //комплектация с полным приводом или нет
    private int enginePower;                 //мощность двигателя

    Auto(boolean fourWheelDrive, int enginePower) {
        this.fourWheelDrive = fourWheelDrive;
        this.enginePower = enginePower;
    }

    int cost() {                             //метод для расчета стоимости авто в зависимости от привода и мощности двигателя
        if (fourWheelDrive) {
            return enginePower * 200 * 2;    //если привод полный то умножаем стоимость на 2
        } else {
            return enginePower * 100;
        }


    }
}

