package com.example.demo.controller;

import com.example.demo.common.BaseResponse;
import com.example.demo.model.TCommArea;
import com.example.demo.model.TCommAreaExample;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findUserById")
    public User findUserById(@RequestParam(value = "id") Integer id) {
        User user = null;
        try {
            user = userService.findUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @GetMapping("/aaa")
    public void aaa() {

        TCommAreaExample example = new TCommAreaExample();
        TCommAreaExample.Criteria criteria = example.createCriteria();
        criteria.andLevelTypeEqualTo(3);
        //执行查询
        List<TCommArea> commAreaList = userService.selectByExample(example);

        for (TCommArea tCommArea : commAreaList) {

            TCommArea parent = userService.selectByPrimaryKey(Long.valueOf(tCommArea.getParentId()));
            String sb = "100000," + parent.getParentId() +
                    "," +
                    tCommArea.getParentId() + "," +
                    tCommArea.getId();
            tCommArea.setPath(sb);
            userService.updateByPrimaryKey(tCommArea);
        }
    }

    @GetMapping("/bbb")
    public BaseResponse bbb() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(userService.getColumnInfoList());
        return baseResponse;
    }
}