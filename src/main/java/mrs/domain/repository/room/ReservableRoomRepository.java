package mrs.domain.repository.room;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.ReservableRoomId;

public interface ReservableRoomRepository extends JpaRepository<ReservableRoom, ReservableRoomId>{
	List<ReservableRoom> findByReservableRoomId_reservedDateOrderByReservableRoomId_RoomIdAsc(LocalDate ReservedDate);
}
