package com.github.xf717.managementweb.controller.positiontype;

import com.github.xf717.common.framework.msg.BaseResponse;
import com.github.xf717.common.framework.msg.ObjectRestResponse;
import com.github.xf717.common.framework.msg.TableResultResponse;

import com.github.xf717.managementweb.controller.positiontype.dto.PositionKeywordAddDTO;
import com.github.xf717.managementweb.controller.positiontype.dto.PositionKeywordDTO;
import com.github.xf717.managementweb.controller.positiontype.dto.PositionKeywordPageDTO;
import com.github.xf717.managementweb.controller.positiontype.dto.PositionKeywordUpdateDTO;
import com.github.xf717.managementweb.controller.positiontype.vo.PositionKeywordVO;
import com.github.xf717.managementweb.manager.positiontype.PositionKeywordManager;
import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
/**
 * 内容管理-职位关键词信息表
 *
 * @author xiaofeng
 * @date 2021-03-29 17:02:00
 */
@Api(value = "内容管理-职位关键词信息表", description = "内容管理-职位关键词信息表", tags = "PositionKeyword")
@RestController
@RequestMapping("/rest/positionKeyword")
public class PositionKeywordController {

	@Autowired
	private PositionKeywordManager positionKeywordManager;

	/**
	* 添加数据
* @param  addDTO
* @return
*/
	@ApiOperation(value = "添加数据", produces = "application/json", nickname = "save")
	@PostMapping("/save")
	public BaseResponse save(@Valid @RequestBody PositionKeywordAddDTO addDTO) {
			positionKeywordManager.save(addDTO);
		return BaseResponse.success("保存成功");
	}

	/**
	* 更新数据
* @param updateDTO
* @return
*/
	@ApiOperation(value = "更新数据", produces = "application/json", nickname = "update")
    @ApiImplicitParam(name = "id", dataType = "int", paramType = "path", required = true)
	@PutMapping("/update/{id}")
	public BaseResponse update(@Valid @RequestBody PositionKeywordUpdateDTO updateDTO) {
		positionKeywordManager.update(updateDTO);
		return BaseResponse.success("更新成功");
	}

	/**
	* 删除数据
* @param id
* @return
*/
	@ApiOperation(value = "删除数据", nickname = "remove")
	@ApiImplicitParam(name = "id", dataType = "int", paramType = "path", required = true)
	@DeleteMapping("/remove/{id}")
	public BaseResponse remove(@PathVariable("id") Long id) {
			positionKeywordManager.remove(id);
		return BaseResponse.success("删除成功");
	}

	/**
	* 获取数据
* @param id
* @return
*/
	@ApiOperation(value = "获取对象数据", nickname = "get")
	@ApiImplicitParam(name = "id", dataType = "int", paramType = "path", required = true)
	@GetMapping("/get/{id}")
	public ObjectRestResponse<PositionKeywordVO> getPositionKeywordById(@PathVariable("id") Long id) {
		return ObjectRestResponse.success(positionKeywordManager.getPositionKeywordById(id));
	}

	@ApiOperation(value = "根据参数查询数据,不分页", nickname = "list")
	@PostMapping("/list")
	public ObjectRestResponse<List<PositionKeywordVO>> listPositionKeywords(@Valid @RequestBody PositionKeywordDTO positionKeywordDTO) {
		List<PositionKeywordVO> list = positionKeywordManager.listPositionKeywords(positionKeywordDTO);
		return ObjectRestResponse.success(list);
	}

	@ApiOperation(value = "根据参数查询数据,分页", nickname = "page")
	@PostMapping("/page")
	public TableResultResponse<PositionKeywordVO> page(@RequestBody PositionKeywordPageDTO pageReqDTO) {
		return positionKeywordManager.pagePositionKeyword(pageReqDTO);
	}

}
