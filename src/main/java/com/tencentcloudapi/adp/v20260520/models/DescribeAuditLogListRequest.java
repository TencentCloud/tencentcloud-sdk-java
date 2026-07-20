/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogListRequest extends AbstractModel {

    /**
    * <p>空间id</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>每页数量</p><p>取值范围：[1, 100]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>es查询起始位置</p><p>对应接口返回SearchAfter</p>
    */
    @SerializedName("SearchAfter")
    @Expose
    private String [] SearchAfter;

    /**
    * <p>参数过滤</p><p>支持 Action,BizObject,Content<br>支持SpaceId,AccountUin,AppId(最多100个)<br>支持startTime,endTime(秒时间戳)</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
     * Get <p>空间id</p> 
     * @return SpaceId <p>空间id</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>空间id</p>
     * @param SpaceId <p>空间id</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>每页数量</p><p>取值范围：[1, 100]</p> 
     * @return Limit <p>每页数量</p><p>取值范围：[1, 100]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量</p><p>取值范围：[1, 100]</p>
     * @param Limit <p>每页数量</p><p>取值范围：[1, 100]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>es查询起始位置</p><p>对应接口返回SearchAfter</p> 
     * @return SearchAfter <p>es查询起始位置</p><p>对应接口返回SearchAfter</p>
     */
    public String [] getSearchAfter() {
        return this.SearchAfter;
    }

    /**
     * Set <p>es查询起始位置</p><p>对应接口返回SearchAfter</p>
     * @param SearchAfter <p>es查询起始位置</p><p>对应接口返回SearchAfter</p>
     */
    public void setSearchAfter(String [] SearchAfter) {
        this.SearchAfter = SearchAfter;
    }

    /**
     * Get <p>参数过滤</p><p>支持 Action,BizObject,Content<br>支持SpaceId,AccountUin,AppId(最多100个)<br>支持startTime,endTime(秒时间戳)</p> 
     * @return FilterList <p>参数过滤</p><p>支持 Action,BizObject,Content<br>支持SpaceId,AccountUin,AppId(最多100个)<br>支持startTime,endTime(秒时间戳)</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>参数过滤</p><p>支持 Action,BizObject,Content<br>支持SpaceId,AccountUin,AppId(最多100个)<br>支持startTime,endTime(秒时间戳)</p>
     * @param FilterList <p>参数过滤</p><p>支持 Action,BizObject,Content<br>支持SpaceId,AccountUin,AppId(最多100个)<br>支持startTime,endTime(秒时间戳)</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    public DescribeAuditLogListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditLogListRequest(DescribeAuditLogListRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchAfter != null) {
            this.SearchAfter = new String[source.SearchAfter.length];
            for (int i = 0; i < source.SearchAfter.length; i++) {
                this.SearchAfter[i] = new String(source.SearchAfter[i]);
            }
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SearchAfter.", this.SearchAfter);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);

    }
}

