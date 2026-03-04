package M2ClassF_TheoryW5

fun main() {
    val listMatkul:List<Matakuliah> = listOf(
        Wajib(),
        Elective()
    );
    println("banyak tipe matkul: $listMatkul");

    //panggil method anak anak
    for(mku in listMatkul) {
        mku.set_matkul(3);
        //cara pertama panggil method yang berbeda utk all anak class
        if(mku is Wajib) {
            mku.ada_seminar()
        } else if(mku is Elective) {
            mku.ada_praktek();
        }
        //cara dua panggil method berbeda untuk all anak class
        when(mku) {
            is Wajib -> {
                println("wajib dari when: ");
                mku.ada_seminar();
            }
            is Elective -> {
                println("elective dari when: ");
                mku.ada_praktek();
            }
        }
    }


    //val wjb = Wajib();
    //wjb.set_matkul(3);

    //val elc = Elective();
    //elc.set_matkul(2);
}