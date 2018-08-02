public class Rectangle {
    float x1, x2, y1, y2;
    Rectangle(float x1, float y1, float x2, float y2){
        // соортируем координаты по оси x по возрастанию
        if (x1<=x2){
            this.x1 = x1;
            this.x2 = x2;
        }
        else {
            this.x1 = x2;
            this.x2 = x1;
        }
        // соортируем координаты по оси y по возрастанию
        if (y1<=y2){
            this.y1 = y1;
            this.y2 = y2;
        }
        else {
            this.y1 = y2;
            this.y2 = y1;
        }

    }
    // метод возвращает длину пересечения прямоугольников по оси x
    float getCrossLenghtX (Rectangle otherRectangle){
        float crossLenghtX;
        // если прямоугольники не пересекаются, возвращаем -1
        if((x2<=otherRectangle.x1)||(x1>=otherRectangle.x2)){
            crossLenghtX = -1;
        }
        // один прямоугольник охватывает второй
        else if ((x1>=otherRectangle.x1)&&(x2<=otherRectangle.x2)) {
            crossLenghtX = x2-x1;
        }
        else if ((x1<=otherRectangle.x1)&&(x2>=otherRectangle.x2)) {
            crossLenghtX = otherRectangle.x2-otherRectangle.x1;
        }
        // прямоугольники просто пересекаются
        else if (x1> otherRectangle.x1) {
            crossLenghtX = otherRectangle.x2 - x1;
        }
        else crossLenghtX = x2 - otherRectangle.x1;
        return crossLenghtX;
    }
    // метод возвращает длину пересечения прямоугольников по оси y
    float getCrossLenghtY (Rectangle otherRectangle){
        float crossLenghtY;
        // если прямоугольники не пересекаются, возвращаем -1
        if((y2<=otherRectangle.y1)||(y1>=otherRectangle.y2)){
            crossLenghtY = -1;
        }
        // один прямоугольник охватывает второй
        else if ((y1>=otherRectangle.y1)&&(y2<=otherRectangle.y2)) {
            crossLenghtY = y2-y1;
        }
        else if ((y1<=otherRectangle.y1)&&(y2>=otherRectangle.y2)) {
            crossLenghtY = otherRectangle.y2-otherRectangle.y1;
        }
        // прямоугольники просто пересекаются
        else if (y1> otherRectangle.y1) {
            crossLenghtY = otherRectangle.y2 - y1;
        }
        else crossLenghtY = y2 - otherRectangle.y1;
        return crossLenghtY;
    }

}
