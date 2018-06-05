//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javafx.scene.shape.Rectangle;

public class Dc {
    public static final Dc zero = new Dc(0, 0);
    public static final Dc none = new Dc(-9999, -9999);
    public static final Dc left = new Dc(-1, 0);
    public static final Dc right = new Dc(1, 0);
    public static final Dc top = new Dc(0, -1);
    public static final Dc bottom = new Dc(0, 1);
    public static final Dc topLeft = new Dc(-1, -1);
    public static final Dc topRight = new Dc(1, -1);
    public static final Dc bottomLeft = new Dc(-1, 1);
    public static final Dc bottomRight = new Dc(1, 1);
    public String content;
    public float x;
    public float y;
    public int xInt;
    public int yInt;
    public double xDouble;
    public double yDouble;
    public short xShort;
    public short yShort;

    public Dc(float x, float y) {
        this.x = x;
        this.y = y;
        this.xInt = Math.round(x);
        this.yInt = Math.round(y);
        this.xDouble = (double)x;
        this.yDouble = (double)y;
        this.xShort = (short)((int)x);
        this.yShort = (short)((int)y);
    }

    public Dc(String inline) {
        String[] coordinates = inline.split(",");
        this.x = Float.parseFloat(coordinates[0]);
        this.y = Float.parseFloat(coordinates[1]);
        this.xInt = Math.round(Float.parseFloat(coordinates[0]));
        this.yInt = Math.round(Float.parseFloat(coordinates[1]));
        this.xDouble = (double)Float.parseFloat(coordinates[0]);
        this.yDouble = (double)Float.parseFloat(coordinates[1]);
        this.xShort = (short)((int)Float.parseFloat(coordinates[0]));
        this.yShort = (short)((int)Float.parseFloat(coordinates[1]));
    }

    public Dc(Rectangle rect) {
        this.x = (float)rect.getX();
        this.y = (float)rect.getY();
        this.xInt = (int)Math.round(rect.getX());
        this.yInt = (int)Math.round(rect.getY());
        this.xDouble = rect.getX();
        this.yDouble = rect.getY();
        this.xShort = (short)((int)rect.getX());
        this.yShort = (short)((int)rect.getY());
    }

    public Dc(float both) {
        this.x = both;
        this.y = both;
        this.xInt = Math.round(both);
        this.yInt = Math.round(both);
        this.xDouble = (double)both;
        this.yDouble = (double)both;
        this.xShort = (short)((int)both);
        this.yShort = (short)((int)both);
    }

    public Dc(int x, int y) {
        this.x = (float)x;
        this.y = (float)y;
        this.xInt = Math.round((float)x);
        this.yInt = Math.round((float)y);
        this.xDouble = (double)x;
        this.yDouble = (double)y;
        this.xShort = (short)Math.round((float)x);
        this.yShort = (short)Math.round((float)y);
    }

    public Dc(int both) {
        this.x = (float)both;
        this.y = (float)both;
        this.xInt = Math.round((float)both);
        this.yInt = Math.round((float)both);
        this.xDouble = (double)both;
        this.yDouble = (double)both;
        this.xShort = (short)Math.round((float)both);
        this.yShort = (short)Math.round((float)both);
    }

    public Dc(double x, double y) {
        this.x = (float)x;
        this.y = (float)y;
        this.xInt = (int)Math.round(x);
        this.yInt = (int)Math.round(y);
        this.xDouble = x;
        this.yDouble = y;
        this.xShort = (short)((int)Math.round(x));
        this.yShort = (short)((int)Math.round(y));
    }

    public Dc(double both) {
        this.x = (float)both;
        this.y = (float)both;
        this.xInt = (int)Math.round(both);
        this.yInt = (int)Math.round(both);
        this.xDouble = both;
        this.yDouble = both;
        this.xShort = (short)((int)Math.round(both));
        this.yShort = (short)((int)Math.round(both));
    }

    public Dc(short x, short y) {
        this.x = (float)x;
        this.y = (float)y;
        this.xInt = x;
        this.yInt = y;
        this.xDouble = (double)x;
        this.yDouble = (double)y;
        this.xShort = x;
        this.yShort = y;
    }

    public Dc(short both) {
        this.x = (float)both;
        this.y = (float)both;
        this.xInt = both;
        this.yInt = both;
        this.xDouble = (double)both;
        this.yDouble = (double)both;
        this.xShort = both;
        this.yShort = both;
    }

    public Dc(Dc pos) {
        this.x = pos.x;
        this.y = pos.y;
        this.xInt = Math.round(pos.x);
        this.yInt = Math.round(pos.y);
        this.xDouble = (double)pos.x;
        this.yDouble = (double)pos.y;
        this.xShort = (short)Math.round(pos.x);
        this.yShort = (short)Math.round(pos.y);
    }

    public Dc() {
        this.x = 0.0F;
        this.y = 0.0F;
        this.xInt = 0;
        this.yInt = 0;
        this.xDouble = 0.0D;
        this.yDouble = 0.0D;
        this.xShort = 0;
        this.yShort = 0;
    }

    public static Dc[] addX(Dc[] position, float value) {
        Dc[] array = (Dc[])position.clone();

        for(int i = 0; i < array.length; ++i) {
            array[i].x += value;
        }

        return array;
    }

    public static Dc[] addY(Dc[] position, float value) {
        Dc[] array = (Dc[])position.clone();

        for(int i = 0; i < array.length; ++i) {
            array[i].y += value;
        }

        return array;
    }

    public static List<Dc> addX(List<Dc> position, float value) {
        List<Dc> list = new LinkedList();
        Iterator var4 = position.iterator();

        while(var4.hasNext()) {
            Dc pos = (Dc)var4.next();
            list.add(pos);
        }

        for(int i = 0; i < list.size(); ++i) {
            Dc var10000 = (Dc)list.get(i);
            var10000.x += value;
        }

        return list;
    }

    public static List<Dc> addY(List<Dc> position, float value) {
        List<Dc> list = new LinkedList();
        Iterator var4 = position.iterator();

        while(var4.hasNext()) {
            Dc pos = (Dc)var4.next();
            list.add(pos);
        }

        for(int i = 0; i < list.size(); ++i) {
            Dc var10000 = (Dc)list.get(i);
            var10000.y += value;
        }

        return list;
    }

    public static List<Dc> add(List<Dc> position, float x, float y) {
        List<Dc> list = new LinkedList();
        Iterator var5 = position.iterator();

        while(var5.hasNext()) {
            Dc pos = (Dc)var5.next();
            list.add(pos);
        }

        for(int i = 0; i < list.size(); ++i) {
            Dc var10000 = (Dc)list.get(i);
            var10000.y += y;
            var10000 = (Dc)list.get(i);
            var10000.x += x;
        }

        return list;
    }

    public static Dc add(Dc position, float x, float y) {
        Dc pos = new Dc(position);
        pos.setX(pos.x() + x);
        pos.setY(pos.y() + y);
        return pos;
    }

    public static Dc[] add(Dc[] position, float x, float y) {
        Dc[] array = (Dc[])position.clone();

        for(int i = 0; i < array.length; ++i) {
            array[i].x += x;
            array[i].y += y;
        }

        return array;
    }

    public static Dc[] mul(Dc[] position, float x, float y) {
        Dc[] array = (Dc[])position.clone();

        for(int i = 0; i < array.length; ++i) {
            array[i].x *= x;
            array[i].y *= y;
        }

        return array;
    }

    public static List<Dc> mul(List<Dc> position, float x, float y) {
        List<Dc> list = new LinkedList();
        Iterator var5 = position.iterator();

        while(var5.hasNext()) {
            Dc pos = (Dc)var5.next();
            list.add(pos);
        }

        for(int i = 0; i < list.size(); ++i) {
            Dc var10000 = (Dc)list.get(i);
            var10000.y *= y;
            var10000 = (Dc)list.get(i);
            var10000.x *= x;
        }

        return list;
    }

    public static Dc[][] range(Dc fromPos, Dc toPos) {
        Dc from = min(fromPos, toPos);
        Dc to = max(fromPos, toPos);
        int xDist = (int)Math.abs(from.x - to.x) + 1;
        int yDist = (int)Math.abs(from.y - to.y) + 1;
        Dc[][] range = new Dc[xDist][yDist];

        for(int x = 0; x < xDist; ++x) {
            for(int y = 0; y < yDist; ++y) {
                int posX = (int)Math.min(from.x, to.x);
                int posY = (int)Math.min(from.y, to.y);
                range[x][y] = new Dc(posX + x, posY + y);
            }
        }

        return range;
    }

    public static Dc min(Dc fromPos, Dc toPos) {
        Dc minimum = new Dc();
        minimum.setX(fromPos.x <= toPos.x ? fromPos.x : toPos.x);
        minimum.setY(fromPos.y <= toPos.y ? fromPos.y : toPos.y);
        return minimum;
    }

    public static Dc max(Dc fromPos, Dc toPos) {
        Dc maximum = new Dc();
        maximum.setX(fromPos.x >= toPos.x ? fromPos.x : toPos.x);
        maximum.setY(fromPos.y >= toPos.y ? fromPos.y : toPos.y);
        return maximum;
    }

    public static boolean contains(Dc[] positions, Dc searchedPos) {
        for(int i = 0; i < positions.length; ++i) {
            if (equals(positions[i], searchedPos)) {
                return true;
            }
        }

        return false;
    }

    public static Dc[] containsIn(Dc[] posA, Dc[] posB) {
        List<Dc> positions = new LinkedList();

        for(int i = 0; i < posA.length; ++i) {
            if (contains(posA, posB[i])) {
                positions.add(posB[i]);
            }
        }

        return convertToArray(positions);
    }

    public static List<Dc> containsIn(List<Dc> posA, List<Dc> posB) {
        List<Dc> positions = new LinkedList();

        for(int i = 0; i < posA.size(); ++i) {
            if (contains(posA, (Dc)posB.get(i))) {
                positions.add((Dc)posB.get(i));
            }
        }

        return positions;
    }

    public static List<Dc> containsIn(Dc[] posA, List<Dc> posB) {
        List<Dc> positions = new LinkedList();

        for(int i = 0; i < posA.length; ++i) {
            if (contains(posA, (Dc)posB.get(i))) {
                positions.add((Dc)posB.get(i));
            }
        }

        return positions;
    }

    public static Dc[] containsOut(Dc[] posA, Dc[] posB) {
        List<Dc> positions = new LinkedList();

        for(int i = 0; i < posA.length; ++i) {
            if (!contains(posA, posB[i])) {
                positions.add(posB[i]);
            }
        }

        return convertToArray(positions);
    }

    public static List<Dc> containsOut(List<Dc> posA, List<Dc> posB) {
        List<Dc> positions = new LinkedList();

        for(int i = 0; i < posA.size(); ++i) {
            if (!contains(posA, (Dc)posB.get(i))) {
                positions.add((Dc)posB.get(i));
            }
        }

        return positions;
    }

    public static List<Dc> containsOut(Dc[] posA, List<Dc> posB) {
        List<Dc> positions = new LinkedList();

        for(int i = 0; i < posA.length; ++i) {
            if (!contains(posA, (Dc)posB.get(i))) {
                positions.add((Dc)posB.get(i));
            }
        }

        return positions;
    }

    public static Dc[] convertToArray(List<Dc> list) {
        Dc[] array = new Dc[list.size()];

        for(int i = 0; i < list.size(); ++i) {
            array[i] = (Dc)list.get(i);
        }

        return array;
    }

    public static boolean contains(List<Dc> positions, Dc searchedPos) {
        for(int i = 0; i < positions.size(); ++i) {
            if (equals((Dc)positions.get(i), searchedPos)) {
                return true;
            }
        }

        return false;
    }

    public static boolean equals(Dc from, Dc to) {
        return from.x == to.x && from.y == to.y;
    }

    public Dc addX(float value) {
        return new Dc(this.x() + value, this.y());
    }

    public Dc addY(float value) {
        return new Dc(this.y(), this.y() + value);
    }

    public Dc add(float value) {
        return new Dc(this.x() + value, this.y() + value);
    }

    public Dc add(float x, float y) {
        return new Dc(this.x() + x, this.y() + y);
    }

    public Dc sub(float x, float y) {
        return new Dc(this.x() - x, this.y() - y);
    }

    public Dc subY(float value) {
        return new Dc(this.y() - value);
    }

    public Dc subX(float value) {
        return new Dc(this.x() - value);
    }

    public Dc mul(float value) {
        return new Dc(this.x() * value, this.y() * value);
    }

    public Dc mul(float x, float y) {
        return new Dc(this.x() * x, this.y() * y);
    }

    public Dc mulX(float value) {
        return new Dc(this.x() * value);
    }

    public Dc mulY(float value) {
        return new Dc(this.y() * value);
    }

    public Dc div(float value) {
        return new Dc(this.x() / value, this.y() / value);
    }

    public Dc div(float x, float y) {
        return new Dc(this.x() / x, this.y() / y);
    }

    public Dc divX(float value) {
        return new Dc(this.x() / value);
    }

    public Dc divY(float value) {
        return new Dc(this.y() / value);
    }

    public Dc sub(float value) {
        return new Dc(this.x() - value, this.y() - value);
    }

    public Dc add(Dc pos) {
        return new Dc(this.x() + pos.x(), this.y() + pos.y());
    }

    public Dc sub(Dc pos) {
        return new Dc(this.x() - pos.x(), this.y() - pos.y());
    }

    public Dc mul(Dc pos) {
        return new Dc(this.x() * pos.x(), this.y() * pos.y());
    }

    public Dc div(Dc pos) {
        return new Dc(this.x() / pos.x(), this.y() / pos.y());
    }

    public Dc getRounded() {
        return new Dc(Math.round(this.x), Math.round(this.y));
    }

    public Dc flat() {
        return new Dc((int)this.x(), (int)this.y());
    }

    public Dc abs() {
        return new Dc(Math.abs(this.x()), Math.abs(this.y()));
    }

    public Dc pow(float value) {
        return new Dc((float)Math.pow((double)this.x(), (double)value), (float)Math.pow((double)this.y(), (double)value));
    }

    public Dc powX(float value) {
        return new Dc((float)Math.pow((double)this.x(), (double)value), this.y());
    }

    public Dc powY(float value) {
        return new Dc(this.y(), (float)Math.pow((double)this.x(), (double)value));
    }

    public Dc sqrt() {
        return new Dc((float)Math.sqrt((double)this.x()), (float)Math.sqrt((double)this.x()));
    }

    public Dc sqrtX() {
        return new Dc((float)Math.sqrt((double)this.x()), this.y());
    }

    public Dc sqrtY() {
        return new Dc(this.x(), (float)Math.sqrt((double)this.y()));
    }

    public boolean isZero() {
        return this.equals(zero);
    }

    public Dc setZero() {
        return this.set(zero);
    }

    public Dc sub(Dc... positions) {
        Dc result = new Dc();
        if (positions.length == 0) {
            return this;
        } else {
            for(int i = 0; i < positions.length; ++i) {
                result.sub(positions[i].x(), positions[i].y());
            }

            return result;
        }
    }

    public Dc add(Dc... positions) {
        Dc result = new Dc();
        if (positions.length == 0) {
            return this;
        } else {
            for(int i = 0; i < positions.length; ++i) {
                result.add(positions[i].x(), positions[i].y());
            }

            return result;
        }
    }

    public Dc mul(Dc... positions) {
        Dc result = new Dc();
        if (positions.length == 0) {
            return this;
        } else {
            for(int i = 0; i < positions.length; ++i) {
                result.mul(positions[i].x(), positions[i].y());
            }

            return result;
        }
    }

    public Dc div(Dc... positions) {
        Dc result = new Dc();
        if (positions.length == 0) {
            return this;
        } else {
            for(int i = 0; i < positions.length; ++i) {
                result.div(positions[i].x(), positions[i].y());
            }

            return result;
        }
    }

    public Dc center(float squareSize) {
        return new Dc(this.x + squareSize / 2.0F, this.y + squareSize / 2.0F);
    }

    public Dc center(float w, float h) {
        return new Dc(this.x + w / 2.0F, this.y + h / 2.0F);
    }

    public boolean equals(Dc to) {
        return Math.abs(this.x() - to.x()) < 0.001F && Math.abs(this.y() - to.y()) < 0.001F;
    }

    public Dc set(float x, float y) {
        this.y = y;
        this.yInt = Math.round(y);
        this.yDouble = (double)y;
        this.yShort = (short)Math.round(y);
        this.x = x;
        this.xInt = Math.round(x);
        this.xDouble = (double)x;
        this.xShort = (short)Math.round(x);
        return this;
    }

    public Dc set(int x, int y) {
        this.y = (float)y;
        this.yInt = Math.round((float)y);
        this.yDouble = (double)y;
        this.yShort = (short)Math.round((float)y);
        this.x = (float)x;
        this.xInt = Math.round((float)x);
        this.xDouble = (double)x;
        this.xShort = (short)Math.round((float)x);
        return this;
    }

    public Dc set(Dc pos) {
        this.y = pos.y;
        this.yInt = Math.round(pos.y);
        this.yDouble = (double)pos.y;
        this.yShort = (short)Math.round(pos.y);
        this.x = pos.x;
        this.xInt = Math.round(pos.x);
        this.xDouble = (double)pos.x;
        this.xShort = (short)Math.round(pos.x);
        return this;
    }

    public float x() {
        return this.x;
    }

    public Dc setX(float x) {
        this.x = x;
        this.xInt = Math.round(x);
        this.xDouble = (double)x;
        this.xShort = (short)((int)x);
        return this;
    }

    public float y() {
        return this.y;
    }

    public Dc setY(float y) {
        this.y = y;
        this.yInt = Math.round(y);
        this.yDouble = (double)y;
        this.yShort = (short)((int)y);
        return this;
    }

    public int intX() {
        return this.xInt;
    }

    public int intY() {
        return this.yInt;
    }

    public double doubleX() {
        return this.xDouble;
    }

    public double doubleY() {
        return this.yDouble;
    }

    public short shortX() {
        return this.xShort;
    }

    public short shortY() {
        return this.yShort;
    }
}
