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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListSchedulingDomainRequest extends AbstractModel {

    /**
    * 页起始偏移，取值为(页码-1)*一页条数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 调度域名搜索
    */
    @SerializedName("FilterDomain")
    @Expose
    private String FilterDomain;

    /**
    * 运行状态 0 代表未运行  1 正在运行  2 运行异常 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 页起始偏移，取值为(页码-1)*一页条数 
     * @return Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页起始偏移，取值为(页码-1)*一页条数
     * @param Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一页条数，当Limit=0时，默认一页条数为20;最大取值为100 
     * @return Limit 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
     * @param Limit 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 调度域名搜索 
     * @return FilterDomain 调度域名搜索
     */
    public String getFilterDomain() {
        return this.FilterDomain;
    }

    /**
     * Set 调度域名搜索
     * @param FilterDomain 调度域名搜索
     */
    public void setFilterDomain(String FilterDomain) {
        this.FilterDomain = FilterDomain;
    }

    /**
     * Get 运行状态 0 代表未运行  1 正在运行  2 运行异常  
     * @return Status 运行状态 0 代表未运行  1 正在运行  2 运行异常 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 运行状态 0 代表未运行  1 正在运行  2 运行异常 
     * @param Status 运行状态 0 代表未运行  1 正在运行  2 运行异常 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DescribeListSchedulingDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListSchedulingDomainRequest(DescribeListSchedulingDomainRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterDomain != null) {
            this.FilterDomain = new String(source.FilterDomain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterDomain", this.FilterDomain);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

