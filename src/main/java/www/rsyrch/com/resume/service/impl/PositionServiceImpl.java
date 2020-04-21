package www.rsyrch.com.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.rsyrch.com.resume.dao.PositionMapper;
import www.rsyrch.com.resume.pojo.Position;
import www.rsyrch.com.resume.service.PositionService;
import java.util.Date;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public int addPosition(int id, String name) {
        Position position = new Position();
        if(id != 0) {
            position.setFatherid(id);
        }
        position.setName(name);
        position.setCreatetime(new Date());
        int status = positionMapper.insert(position);
        return status;
    }
}
