/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentCorpsRequest extends AbstractModel{

    /**
    * 每页数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 渠道ID
    */
    @SerializedName("AgentId")
    @Expose
    private Long AgentId;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
     * Get 每页数量 
     * @return PageSize 每页数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量
     * @param PageSize 每页数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页数 
     * @return PageNumber 页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页数
     * @param PageNumber 页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 渠道ID 
     * @return AgentId 渠道ID
     */
    public Long getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 渠道ID
     * @param AgentId 渠道ID
     */
    public void setAgentId(Long AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    public DescribeAgentCorpsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentCorpsRequest(DescribeAgentCorpsRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.AgentId != null) {
            this.AgentId = new Long(source.AgentId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);

    }
}

