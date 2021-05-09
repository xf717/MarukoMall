package com.db.chaomaxs.userweb.manager.user;


import com.db.chaomaxs.common.framework.context.BaseContextHandler;
import com.db.chaomaxs.common.framework.msg.ObjectRestResponse;
import com.db.chaomaxs.common.framework.msg.TableResultResponse;
import com.db.chaomaxs.companyservice.rpc.collect.dto.CompanyUserCollectRespDTO;
import com.db.chaomaxs.companyservice.rpc.collect.dto.UserCollectPageReqDTO;
import com.db.chaomaxs.companyservice.rpc.collect.dto.UserCollectRespDTO;
import com.db.chaomaxs.companyservice.rpc.collect.facade.CompanyUserCollectRpcFacade;
import com.db.chaomaxs.userweb.controller.user.dto.CompanyUserCollectPageDTO;
import com.db.chaomaxs.userweb.controller.user.vo.CompanyUserCollectVO;
import com.db.chaomaxs.userweb.convert.user.CompanyUserCollectConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * CompanyUserCollectManager
 *
 * @author xiaofeng
 * @date 2021-03-26 10:18:33
 */
@Service
@Validated
public class CompanyUserCollectManager {

    @Autowired
    private CompanyUserCollectRpcFacade companyUserCollectRpcFacade;

    /**
     * 根据Id查找
     *
     * @param id
     * @return
     */
    public CompanyUserCollectVO getCompanyUserCollectById(Long id) {
        ObjectRestResponse<CompanyUserCollectRespDTO> objectRestResponse = companyUserCollectRpcFacade.getCompanyUserCollectById(id);
        objectRestResponse.checkError();
        // TODO: 2021/4/29 公共调用
        return null;
    }

    /**
     * 查找数据显示分页
     *
     * @param pageReqDTO 分页参数
     * @return
     */
    public TableResultResponse<CompanyUserCollectVO> pageCompanyUserCollect(CompanyUserCollectPageDTO pageReqDTO) {
        UserCollectPageReqDTO reqDTO=CompanyUserCollectConvert.INSTANCE.convert(pageReqDTO);
        reqDTO.setUserId(BaseContextHandler.getUserId());
        TableResultResponse<UserCollectRespDTO> tableResultResponse = companyUserCollectRpcFacade
                .userPage(reqDTO);
        tableResultResponse.checkError();
        // TODO: 2021/4/29 公共调用
        return null;
    }


}
