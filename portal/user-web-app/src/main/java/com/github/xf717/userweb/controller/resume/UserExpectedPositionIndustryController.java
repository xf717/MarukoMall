package com.github.xf717.userweb.controller.resume;

import com.github.xf717.common.framework.msg.BaseResponse;
import com.github.xf717.common.framework.msg.ObjectRestResponse;
import com.github.xf717.userweb.controller.resume.dto.UserExpectedPositionIndustryAddDTO;
import com.github.xf717.userweb.controller.resume.dto.UserExpectedPositionIndustryUpdateDTO;
import com.github.xf717.userweb.controller.resume.vo.UserExpectedPositionIndustryVO;
import com.github.xf717.userweb.manager.resume.UserExpectedPositionIndustryManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户_期望_职位_行业
 *
 * @author wst
 * @date 2021-04-12 13:47:08
 */
@Api(value = "用户_期望_职位_行业", description = "用户_期望_职位_行业", tags = "用户_期望_职位_行业")
@RestController
@RequestMapping("/rest/userExpectedPositionIndustry")
public class UserExpectedPositionIndustryController {

  @Autowired
  private UserExpectedPositionIndustryManager userExpectedPositionIndustryManager;

  /**
   * 添加数据
   *
   * @param addDTO
   * @return
   */
  @ApiOperation(value = "添加数据", produces = "application/json", nickname = "save")
  @PostMapping("/save")
  public BaseResponse save(@Valid @RequestBody UserExpectedPositionIndustryAddDTO addDTO) {
    userExpectedPositionIndustryManager.save(addDTO);
    return BaseResponse.success("保存成功");
  }

  /**
   * 更新数据
   *
   * @param updateDTO
   * @return
   */
  @ApiOperation(value = "更新数据", produces = "application/json", nickname = "update")
  @ApiImplicitParam(name = "id", dataType = "int", paramType = "path", required = true)
  @PutMapping("/update/{id}")
  public BaseResponse update(@Valid @RequestBody UserExpectedPositionIndustryUpdateDTO updateDTO) {
    userExpectedPositionIndustryManager.update(updateDTO);
    return BaseResponse.success("更新成功");
  }

  /**
   * 删除数据
   *
   * @param id
   * @return
   */
  @ApiOperation(value = "删除数据", nickname = "remove")
  @ApiImplicitParam(name = "id", dataType = "int", paramType = "path", required = true)
  @DeleteMapping("/remove/{id}")
  public BaseResponse remove(@PathVariable("id") Long id) {
    userExpectedPositionIndustryManager.remove(id);
    return BaseResponse.success("删除成功");
  }

  /**
   * 获取数据
   *
   * @param id
   * @return
   */
  @ApiOperation(value = "获取对象数据", nickname = "get")
  @ApiImplicitParam(name = "id", dataType = "int", paramType = "path", required = true)
  @GetMapping("/get/{id}")
  public ObjectRestResponse<UserExpectedPositionIndustryVO> getUserExpectedPositionIndustryById(
      @PathVariable("id") Long id) {
    return ObjectRestResponse
        .success(userExpectedPositionIndustryManager.getUserExpectedPositionIndustryById(id));
  }


}
