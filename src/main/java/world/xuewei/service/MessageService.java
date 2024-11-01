package world.xuewei.service;

import org.springframework.stereotype.Service;
import world.xuewei.dao.MessageMapper;
import world.xuewei.entity.Message;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Message)表业务接口实现类
 *
 * <p>
 * ==========================================================================
 
 */
@Service
public class MessageService {

    @Resource
    private MessageMapper messageMapper;

    public boolean insert(Message message) {
        return messageMapper.insert(message) == 1;
    }


    public boolean deleteById(Integer id) {
        return messageMapper.deleteById(id) == 1;
    }


    public boolean deleteAllByTeacherId(Integer id) {
        return messageMapper.deleteAllByTeacherId(id);
    }


    public Message getById(Integer id) {
        return messageMapper.getById(id);
    }


    public List<Message> listMessages() {
        return messageMapper.listMessages();
    }


    public List<Message> listMessages(Message message) {
        return messageMapper.listMessages(message);
    }


    public int countMessages(Message message) {
        return messageMapper.countMessages(message);
    }


    public boolean update(Message message) {
        return messageMapper.update(message) == 1;
    }

}