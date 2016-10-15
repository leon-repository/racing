package com.racing.controller.members;

import com.racing.controller.vo.ApiResult;
import com.racing.controller.vo.MembersVo;
import com.racing.model.repo.MembersStakeRepo;
import com.racing.service.member.MembersAccountRecordService;
import com.racing.service.member.MembersService;
import com.racing.service.member.MembersStakeService;
import com.racing.service.stake.RecordResultService;
import com.racing.service.user.UserService;
import com.racing.util.LoginStatusSaveUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/members")
public class MembersController {
    @Autowired
    MembersService membersService;
    @Autowired
    MembersAccountRecordService membersAccountRecordService;
    @Autowired
    UserService userService;
    @Autowired
    MembersStakeService membersStakeService;

    @ApiOperation("客户端-查询积分")
    @RequestMapping(value = "/point", method = RequestMethod.GET)
    public Object selectPoint(@RequestParam(required = false) String wechatSn,
                              @RequestParam(required = false) String nickName) {
        Integer userId = LoginStatusSaveUtil.getUserClientId();
        if (wechatSn == null && userId == null) {
            return ApiResult.createErrorReuslt("先登录");
        }
        return membersService.selectPoint(userId, wechatSn, nickName);
    }

    @ApiOperation("客户端-查询积分-上分")
    @RequestMapping(value = "/point/add", method = RequestMethod.PUT)
    public Object addPoint(@RequestBody MembersVo membersVo) {
        Integer userId = LoginStatusSaveUtil.getUserClientId();
        if (membersVo.getWechatSn() == null && userId == null) {
            return ApiResult.createErrorReuslt("先登录");
        }
        return membersService.updatePoint(userId, membersVo.getWechatSn(),
            membersVo.getNickName(), membersVo.getUpdatePoints(), "ADD");
    }

    @ApiOperation("客户端-查询积分-下分")
    @RequestMapping(value = "/point/subtract", method = RequestMethod.PUT)
    public Object subtractPoint(@RequestBody MembersVo membersVo) {
        Integer userId = LoginStatusSaveUtil.getUserClientId();
        if (membersVo.getWechatSn() == null && userId == null) {
            return ApiResult.createErrorReuslt("先登录");
        }
        return membersService.updatePoint(userId, membersVo.getWechatSn(),
            membersVo.getNickName(), membersVo.getUpdatePoints().subtract(membersVo.getUpdatePoints().multiply(new BigDecimal(2))), "SUBTRACT");
    }

    @ApiOperation("客户端-查询积分记录")
    @RequestMapping(value = "/point/record", method = RequestMethod.GET)
    public Object selectMembersAccountRecord(@RequestParam String wechatSn,
                                             @RequestParam(required = false, defaultValue = "1") Integer page) {
        Integer userId = LoginStatusSaveUtil.getUserClientId();
        if (wechatSn == null && userId == null) {
            return ApiResult.createErrorReuslt("先登录");
        }
        return membersService.selectMembersAccountRecord(userId, wechatSn, page);
    }

    @ApiOperation("客户端-开奖结果")
    @RequestMapping(value = "/record/result", method = RequestMethod.GET)
    public Object selectRecordResult(@RequestParam String wechatSn,
                                     @RequestParam String racingNum) {
        Integer userId = LoginStatusSaveUtil.getUserClientId();
        if (wechatSn == null && userId == null) {
            return ApiResult.createErrorReuslt("先登录");
        }
        return membersStakeService.selectByWechatSn(userId, wechatSn, racingNum);
    }
}
