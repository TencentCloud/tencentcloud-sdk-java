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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSchedulingDomainListResponse extends AbstractModel{

    /**
    * 调度域名总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 调度域名列表信息
    */
    @SerializedName("DomainList")
    @Expose
    private SchedulingDomain [] DomainList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 调度域名总数 
     * @return Total 调度域名总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 调度域名总数
     * @param Total 调度域名总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 调度域名列表信息 
     * @return DomainList 调度域名列表信息
     */
    public SchedulingDomain [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 调度域名列表信息
     * @param DomainList 调度域名列表信息
     */
    public void setDomainList(SchedulingDomain [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

