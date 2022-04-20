package top.fanzhengke.api.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import top.fanzhengke.api.db.domain.TbMeetingRoom;
import top.fanzhengke.api.service.TbMeetingRoomService;
import top.fanzhengke.api.db.mapper.TbMeetingRoomMapper;
import org.springframework.stereotype.Service;

/**
* @author coco
* @description 针对表【tb_meeting_room(会议室表)】的数据库操作Service实现
* @createDate 2022-04-20 13:23:32
*/
@Service
public class TbMeetingRoomServiceImpl extends ServiceImpl<TbMeetingRoomMapper, TbMeetingRoom>
implements TbMeetingRoomService {

}
