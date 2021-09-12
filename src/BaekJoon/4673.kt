package BaekJoon

package Code



fun main(args: Array<String>) {
    var arr = IntArray(10036)

    var fir : Int
    var sec : Int

    for(i in 1..10001){
        fir = i
        sec = i
        while(fir > 0){
            sec += fir % 10
            fir /= 10
        }
        arr[sec]++
    }

    for(i in 1..10000){
        if(arr[i]==0)
            println(i)
    }

}








