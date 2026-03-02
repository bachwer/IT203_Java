package Session15.Ex6;

public class Main {
    public static void main(String[] args) {

        System.out.println("========= 1. TEST BỆNH NHÂN CHỜ KHÁM (QUEUE) =========");

        PatientWaitingQueue waitingQueue = new PatientWaitingQueue();

        Patient p1 = new Patient("BN001", "Nguyen Van A", 30, "Nam");
        Patient p2 = new Patient("BN002", "Tran Thi B", 25, "Nu");
        Patient p3 = new Patient("BN003", "Le Van C", 40, "Nam");

        waitingQueue.addPatient(p1);
        waitingQueue.addPatient(p2);
        waitingQueue.addPatient(p3);

        System.out.println("Tổng bệnh nhân đang chờ: " + waitingQueue.getTotalPatients());

        System.out.println("Gọi khám: " + waitingQueue.callNextPatient());
        System.out.println("Gọi khám: " + waitingQueue.callNextPatient());
        System.out.println("Gọi khám: " + waitingQueue.callNextPatient());

        System.out.println("Còn lại: " + waitingQueue.getTotalPatients());


        System.out.println("\n========= 2. TEST LỊCH SỬ CHỈNH SỬA (STACK) =========");

        MedicalRecordHistory history = new MedicalRecordHistory("MR001");

        history.addEdit(new EditAction("Thêm triệu chứng sốt", "Dr. An", "11"));
        history.addEdit(new EditAction("Cập nhật huyết áp", "Dr. Bình", "12"));
        history.addEdit(new EditAction("Thêm kết quả xét nghiệm máu", "Dr. Cường", "13"));

        System.out.println("Chỉnh sửa gần nhất: " + history.getLastEdit());

        System.out.println("Hoàn tác: " + history.undoLastEdit());
        System.out.println("Hoàn tác: " + history.undoLastEdit());
        System.out.println("Hoàn tác: " + history.undoLastEdit());


        System.out.println("\n========= 3. TEST HỆ THỐNG GỌI SỐ (QUEUE) =========");

        TicketSystem ticketSystem = new TicketSystem();

        Ticket t1 = ticketSystem.issueTicket();
        Ticket t2 = ticketSystem.issueTicket();
        Ticket t3 = ticketSystem.issueTicket();

        System.out.println("Phát số: " + t1.getTicketNumber());
        System.out.println("Phát số: " + t2.getTicketNumber());
        System.out.println("Phát số: " + t3.getTicketNumber());

        System.out.println("Gọi số: " + ticketSystem.callNext().getTicketNumber());
        System.out.println("Gọi số: " + ticketSystem.callNext().getTicketNumber());
        System.out.println("Gọi số: " + ticketSystem.callNext().getTicketNumber());


        System.out.println("\n========= 4. TEST UNDO NHẬP LIỆU (STACK) =========");

        UndoManager undoManager = new UndoManager(3);

        undoManager.addAction(new InputAction("name", "Nguyen Van A", "Nguyen Van B"));
        undoManager.addAction(new InputAction("age", "30", "31"));
        undoManager.addAction(new InputAction("address", "Ha Noi", "Da Nang"));

        // vượt quá maxUndoSteps để test loại bỏ phần tử cũ nhất
        undoManager.addAction(new InputAction("phone", "0901", "0902"));

        InputAction undo1 = undoManager.undo();
        System.out.println("Undo: " + undo1.getFieldName() +
                " | Trước: " + undo1.getOldValue() +
                " | Sau: " + undo1.getNewValue());

        InputAction undo2 = undoManager.undo();
        System.out.println("Undo: " + undo2.getFieldName() +
                " | Trước: " + undo2.getOldValue() +
                " | Sau: " + undo2.getNewValue());

        InputAction undo3 = undoManager.undo();
        if (undo3 != null) {
            System.out.println("Undo: " + undo3.getFieldName());
        } else {
            System.out.println("Không còn thao tác để undo");
        }
    }
}