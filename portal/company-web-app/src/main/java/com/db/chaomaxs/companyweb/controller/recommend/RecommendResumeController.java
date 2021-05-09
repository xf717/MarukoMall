package com.db.chaomaxs.companyweb.controller.recommend;

import com.db.chaomaxs.common.framework.msg.BaseResponse;
import com.db.chaomaxs.common.framework.msg.ObjectRestResponse;
import com.db.chaomaxs.common.framework.msg.TableResultResponse;

import com.db.chaomaxs.companyweb.controller.recommend.dto.RecommendResumeAddDTO;
import com.db.chaomaxs.companyweb.controller.recommend.dto.RecommendResumeUpdateDTO;
import com.db.chaomaxs.companyweb.controller.recommend.dto.RecommendResumeDTO;
import com.db.chaomaxs.companyweb.controller.recommend.dto.RecommendResumePageDTO;
import com.db.chaomaxs.companyweb.controller.recommend.vo.RecommendResumeVO;

import com.db.chaomaxs.companyweb.manager.recommend.RecommendResumeManager;

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
 * 推荐人才简历
 *
 * @author xiaofeng
 * @date 2021-03-29 17:09:31
 */
@Api(value = "推荐人才简历", description = "推荐人才简历", tags = "RecommendResume")
@RestController
@RequestMapping("/rest/recommendResume")
public class RecommendResumeController {

	@Autowired
	private RecommendResumeManager recommendResumeManager;

	/**
	* 添加数据
* @param  addDTO
* @return
*/
	@ApiOperation(value = "添加数据", produces = "application/json", nickname = "save")
	@PostMapping("/save")
	public BaseResponse save(@Valid @RequestBody RecommendResumeAddDTO addDTO) {
			recommendResumeManager.save(addDTO);
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
	public BaseResponse update(@Valid @RequestBody RecommendResumeUpdateDTO updateDTO) {
		recommendResumeManager.update(updateDTO);
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
			recommendResumeManager.remove(id);
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
	public ObjectRestResponse<RecommendResumeVO> getRecommendResumeById(@PathVariable("id") Long id) {
		return ObjectRestResponse.success(recommendResumeManager.getRecommendResumeById(id));
	}

	@ApiOperation(value = "根据参数查询数据,不分页", nickname = "list")
	@PostMapping("/list")
	public ObjectRestResponse<List<RecommendResumeVO>> listRecommendResumes(@Valid @RequestBody RecommendResumeDTO recommendResumeDTO) {
		List<RecommendResumeVO> list = recommendResumeManager.listRecommendResumes(recommendResumeDTO);
		return ObjectRestResponse.success(list);
	}

	@ApiOperation(value = "根据参数查询数据,分页", nickname = "page")
	@PostMapping("/page")
	public TableResultResponse<RecommendResumeVO> page(@RequestBody RecommendResumePageDTO pageReqDTO) {
		return recommendResumeManager.pageRecommendResume(pageReqDTO);
	}

}
