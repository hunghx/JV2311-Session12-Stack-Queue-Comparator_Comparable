import java.util.*;

public class Main {
    public static void main(String[] args) {
     // Cấu trúc Stack  - FILO
        Stack<String> stack = new Stack<>();
        // thêm mới phần tử vào ngăn xếp
        stack.push("Nguyễn Văn A");
        stack.push("Nguyễn Văn B");
        stack.push("Nguyễn Văn C");

        // Lấy phần tử trên cùng của ngăn xếp
//        System.out.println(stack.pop()); // vừa lấy vừa xóa , ném ra ngoại lệ nếu rỗng
//        System.out.println(stack.peek()); // lấy nhưng không xóa , ném ra ngoại lệ nếu rỗng
        int index = stack.search("Nguyễn Văn A");
        System.out.println(index);
        // duyệt Stack
//        for (String item: stack){
//            System.out.println(item);
//        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
        // Câ trúc dữ liệu Queue  : hàng đợi FIFO
        Queue<String> priorityQueue = new PriorityQueue<>();
        Queue<String> arrayDeque = new ArrayDeque<>();
        //thm mới vào hàng đơi
        arrayDeque.offer("HTML");
        arrayDeque.offer("CSS");
        arrayDeque.offer("JS");
        // lấy ra phần tử dầu tiên của hàng đợi
//        System.out.println(arrayDeque.peek()); // lấy ptu đầu ko xóa không sinh ra ngoại lệ , nếu queue rỗng thì trả về null
//        System.out.println(arrayDeque.remove()); // lấy và xóa ptu đầu , sinh ra ngoại lệ nếu rỗng
//        System.out.println(arrayDeque.element()); //  lấy ptu đầu ko xóa không sinh ra ngoại lệ , nếu queue rỗng thì ném ra ngoại lệ
//        System.out.println(arrayDeque.poll()); // lấy và xóa ptu đầu , ko ra ngoại lệ nếu rỗng
        // duyet Queue
        while (!arrayDeque.isEmpty()){
            System.out.println(arrayDeque.remove());
        }

        // Comparator và Comparable : Inteface
        // Comparator : compare()
        // Comparable : compareTo()

        //  FunctionalInterface : interface có duy nhất 1 phương thức trưu tượng
        Comparator<String> comparator = (o1,o2)-> o2.compareTo(o1);
        Comparator<Student> studentComparator = (o1,o2)-> o1.getBirthday().compareTo(o2.getBirthday());
       List<Student> studentList  = new ArrayList<>();
        Collections.sort(studentList,studentComparator.reversed());
        // sắp xếp lại theo điêm trung bình qiamr dần
        Collections.sort(studentList,(o1,o2)->o2.getdTB().compareTo(o1.getdTB()));


    }
}