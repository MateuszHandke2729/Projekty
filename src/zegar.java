public class zegar{
    public static void main(String[] args) {

        int[] tab = new int[4];
        tab[0]=2;
        tab[1]=4;
        tab[2]=5;
        tab[3]=9;
        int min1 = 0, min2 = 0, godz1 = -1, godz2 = 0;
        int kontrolna1 = 0; int miejsce1 = 0, miejsce2 = 0, miejsce3 = 0;

        for(int j=0; j<=3; j++){
            if(tab[j]==2){
                kontrolna1 = 1;
                godz1 = 2;
                miejsce1 = j;
            }
        }
        for (int ii = 0; ii <= 3; ii++){
            if (tab[ii] == 1 && godz1==-1){
                kontrolna1 = 1;
                godz1 = 1;
                miejsce1 = ii;
            }
        }
        for (int i = 0; i <= 3; i++){
            if (tab[i] == 0 && godz1==-1){
                kontrolna1 = 1;
                godz1 = 0;
                miejsce1 = i;
            }
        }
        if(godz1==-1){
            System.out.println("Nie można utworzyć godziny");
        }
        int kontrolna2 = 0;
        if(kontrolna1==1 && godz1==2) {
            for (int i = 0; i <= 3; i++) {
                if (i == miejsce1) {

                }
                else {
                    if (tab[i] == 3) {
                        kontrolna2 = 1;
                        godz2 = tab[i];
                        miejsce2 = i;
                        break;
                    }
                }
            }
            if(kontrolna2==0) {
                for (int i = 0; i <= 3; i++) {
                    if (i == miejsce1) {

                    }
                    else {
                        if (tab[i] == 2) {
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0) {
                for (int i = 0; i <= 3; i++) {
                    if (i == miejsce1) {
                    }
                    else {
                        if (tab[i] == 1) {
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0) {
                for (int i = 0; i <= 3; i++) {
                    if (i == miejsce1){
                    }
                    else{
                        if (tab[i] == 0) {
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if(kontrolna2==0) {
                System.out.println("Nie można utworzyć godziny");
            }
            int kontrolna3 = 0;
            if(kontrolna2==1){
                for (int i = 0; i <= 3; i++) {
                    if (i == miejsce1 || i==miejsce2) {

                    }
                    else{
                        if (tab[i] == 5) {
                            kontrolna3 = 1;
                            min1 = tab[i];
                            miejsce3 = i;
                            break;
                        }
                    }
                }
                if (kontrolna3 == 0){
                    for (int i = 0; i <= 3; i++) {
                        if (i == miejsce1 || i == miejsce2) {
                        }
                        else {
                            if (tab[i] == 4) {
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                                break;
                            }
                        }
                    }
                }
                if (kontrolna3 == 0) {
                    for (int i = 0; i <= 3; i++) {
                        if (i == miejsce1 || i == miejsce2) {
                        }
                        else {
                            if (tab[i] == 3) {
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                                break;
                            }
                        }
                    }
                }
                if (kontrolna3 == 0) {
                    for (int i = 0; i <= 3; i++) {
                        if (i == miejsce1 || i == miejsce2) {
                        }
                        else {
                            if (tab[i] == 2) {
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                                break;
                            }
                        }
                    }
                }
                if (kontrolna3 == 0) {
                    for (int i = 0; i <= 3; i++) {
                        if (i == miejsce1 || i == miejsce2) {
                        }
                        else {
                            if (tab[i] == 1) {
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                                break;
                            }
                        }
                    }
                }
                if (kontrolna3 == 0) {
                    for (int i = 0; i <= 3; i++) {
                        if (i == miejsce1 || i == miejsce2) {
                        }
                        else {
                            if (tab[i] == 0) {
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                                break;
                            }
                        }
                    }
                }
                if(kontrolna3==0) {
                    System.out.println("Nie można zbudować godziny");
                }
                if(kontrolna3==1) {
                    for (int i = 0; i <= 3; i++) {
                        if (i == miejsce1 || i == miejsce2 || i == miejsce3) {
                        }
                        else {
                            min2 = tab[i];
                        }
                    }
                }
                System.out.println("Godzina: " +godz1+godz2+":"+min1+min2);
            }
        }
        if(kontrolna1==1 && (godz1==1 || godz1==0)){
            for (int i = 0; i <= 3; i++) {
                if (i == miejsce1) {
                }
                else {
                    if (tab[i] == 9) {
                        kontrolna2 = 1;
                        godz2 = tab[i];
                        miejsce2 = i;
                        break;
                    }
                }
            }
            if (kontrolna2 == 0) {
                for (int i = 0; i <= 3; i++) {
                    if (i == miejsce1) {
                    }
                    else {
                        if (tab[i] == 8) {
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0) {
                for (int i = 0; i <= 3; i++) {
                    if (i == miejsce1) {
                    }
                    else {
                        if (tab[i] == 7) {
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0) {
                for (int i = 0; i <= 3; i++) {
                    if (i == miejsce1) {
                    }
                    else {
                        if (tab[i] == 6) {
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0) {
                for (int i = 0; i <= 3; i++) {
                    if (i == miejsce1) {
                    }
                    else{
                        if (tab[i] == 5){
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0){
                for (int i = 0; i <= 3; i++){
                    if (i == miejsce1){
                    }
                    else{
                        if (tab[i] == 4){
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0){
                for (int i = 0; i <= 3; i++){
                    if (i == miejsce1){
                    }
                    else{
                        if (tab[i] == 3){
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0){
                for (int i = 0; i <= 3; i++){
                    if (i == miejsce1){
                    }
                    else{
                        if (tab[i] == 2){
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0){
                for (int i = 0; i <= 3; i++){
                    if (i == miejsce1){
                    }
                    else{
                        if (tab[i] == 1){
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0){
                for (int i = 0; i <= 3; i++){
                    if (i == miejsce1){
                    }
                    else{
                        if (tab[i] == 0){
                            kontrolna2 = 1;
                            godz2 = tab[i];
                            miejsce2 = i;
                            break;
                        }
                    }
                }
            }
            if (kontrolna2 == 0){
                System.out.println("Nie da sie utworzyc godziny");
            }
            int kontrolna3 = 0;
            if (kontrolna2 == 1){
                for (int i = 0; i <= 3; i++){
                    if (i == miejsce1 || i == miejsce2){
                    }
                    else{
                        if (tab[i] == 5){
                            kontrolna3 = 1;
                            min1 = tab[i];
                            miejsce3 = i;
                        }
                    }
                }
                if (kontrolna3 == 0){
                    for (int i = 0; i <= 3; i++){
                        if (i == miejsce1 || i == miejsce2){
                        }
                        else{
                            if (tab[i] == 4){
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                            }
                        }
                    }
                }
                if (kontrolna3 == 0){
                    for (int i = 0; i <= 3; i++){
                        if (i == miejsce1 || i == miejsce2){
                        }
                        else{
                            if (tab[i] == 3){
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                            }
                        }
                    }
                }
                if (kontrolna3 == 0){
                    for (int i = 0; i <= 3; i++){
                        if (i == miejsce1 || i == miejsce2){
                        }
                        else{
                            if (tab[i] == 2){
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                            }
                        }
                    }
                }
                if (kontrolna3 == 0){
                    for (int i = 0; i <= 3; i++){
                        if (i == miejsce1 || i == miejsce2){
                        }
                        else{
                            if (tab[i] == 1){
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                            }
                        }
                    }
                }
                if (kontrolna3 == 0){
                    for (int i = 0; i <= 3; i++){
                        if (i == miejsce1 || i == miejsce2){
                        }
                        else{
                            if (tab[i] == 0){
                                kontrolna3 = 1;
                                min1 = tab[i];
                                miejsce3 = i;
                            }
                        }
                    }
                }
                if (kontrolna3 == 0){
                    System.out.println("Nie da sie zbudowac godziny");
                }
                if (kontrolna3 == 1){
                    for (int i = 0; i <= 3; i++){
                        if (i == miejsce1 || i == miejsce2 || i == miejsce3){
                        }
                        else{
                            min2 = tab[i];
                        }
                    }
                }
            }
            System.out.println("Godzina: " +godz1+godz2+":"+min1+min2);

        }
    }
}
