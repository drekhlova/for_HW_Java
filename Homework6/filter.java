package for_HW_Java.Homework6;
import java.util.*;

public class filter {
        public static List filter(List<notebook> notebooks, Map filters) {
            List filteredNotebooks = new ArrayList();
            for (notebook notebook : notebooks) {
                boolean allFiltersMatch = true;
                for (Object filterKey : filters.keySet()) {
                    Object filterValue = filters.get(filterKey);
                    switch (filterKey.toString()) {
                        case "brand":
                            if (!notebook.getBrand().equals(filterValue)) {
                                allFiltersMatch = false;
                            }
                            break;
                        case "model":
                            if (!notebook.getModel().equals(filterValue)) {
                                allFiltersMatch = false;
                            }
                            break;
                        case "RAM":
                            if (notebook.getRAM() != (int) filterValue) {
                                allFiltersMatch = false;
                            }
                            break;
                        case "HDD":
                            if (notebook.getHDD() != (int) filterValue) {
                                allFiltersMatch = false;
                            }
                            break;
                        case "OS":
                            if (!notebook.getOS().equals(filterValue)) {
                                allFiltersMatch = false;
                            }
                            break;
                        case "color":
                            if (!notebook.getColor().equals(filterValue)) {
                                allFiltersMatch = false;
                            }
                            break;
                        case "price":
                            if (notebook.getPrice() != (double) filterValue) {
                                allFiltersMatch = false;
                            }
                            break;
                    }
                    if (!allFiltersMatch) {
                        break;
                    }
                }
                if (allFiltersMatch) {
                    filteredNotebooks.add(notebook);
                }
            }
            return filteredNotebooks;
        }
    }

