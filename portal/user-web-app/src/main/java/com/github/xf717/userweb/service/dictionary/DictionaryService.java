package com.github.xf717.userweb.service.dictionary;

import com.github.xf717.common.framework.msg.ObjectRestResponse;
import com.github.xf717.common.framework.util.CollectionUtils;
import com.github.xf717.systemservice.rpc.dict.dto.DataDictionaryItemRespDTO;
import com.github.xf717.systemservice.rpc.dict.dto.DataDictionaryTypeListIdsReqDTO;
import com.github.xf717.systemservice.rpc.dict.facade.DataDictionaryItemRpcFacade;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author momo
 * @date 2021-04-27 14:48
 */
@Service
public class DictionaryService {

    @Autowired
    private DataDictionaryItemRpcFacade dataDictionaryItemRpcFacade;

    public Map<Long, String> getByIds(Set<Long> ids) {
        Map<Long, String> map = Maps.newHashMap();
        DataDictionaryTypeListIdsReqDTO reqDTO = new DataDictionaryTypeListIdsReqDTO();
        reqDTO.setIds(Lists.newArrayList(ids));
        ObjectRestResponse<List<DataDictionaryItemRespDTO>> objectRestResponse = dataDictionaryItemRpcFacade.listDataDictionaryItemByIds(reqDTO);
        List<DataDictionaryItemRespDTO> respDTOList = objectRestResponse.getData();
        if (CollectionUtils.isEmpty(respDTOList)) {
            return map;
        }
        map = respDTOList.stream().collect(Collectors.toMap(DataDictionaryItemRespDTO::getId, DataDictionaryItemRespDTO::getDictText));
        return map;
    }
}
