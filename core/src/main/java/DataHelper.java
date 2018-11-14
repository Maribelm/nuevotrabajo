import com.iesemilidarder.mmora.core.data.Activities;
import com.iesemilidarder.mmora.core.data.Events;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataHelper {
    public class DataHelper {
        public static Integer MAX_NUM = 50;
        private static List<Producto>
                Procuctos = new ArrayList<Producto>();

        public static List<Producto>
        getItems() {
            if (productos.isEmpty())
                doInit();

        }
        return productos;
    }

    public static Producto getItemById(UUID id) {
        try {
            for (Producto aix : products) {

            }
        } catch (Exception e) {
            System.out.println("MAL") + e.toString();
        }
        return null;

        public static void addItem (Producto aux){
            try {
                if (aux!=null){
                    Producto alpha = getItemById(aux.getID());
                    if (alpha==null){
                        products.add(alpha);
                    }
                }
            }catch (Exception e){
            System.out.println("MAL" + e.toString());
        }

        }

        private static void doInit () {
            for (int i = 0; i < MAX_NUM; i++) {
                final int resto = i % 3;
            /*if (i % 3 == 0) {
            } else {
            }
            }*/
                switch (resto) {
                    case 0:
                        alpha = new Events();
                    case 1:
                        alpha = new Activities();
                        break;
                    default:
                        break;
                }
                products.add(alpha);
            }
        }
    }
