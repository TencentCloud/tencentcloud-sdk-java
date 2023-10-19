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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRansomDefenseTrendResponse extends AbstractModel {

    /**
    * 勒索事件数量
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 影响行业数量
    */
    @SerializedName("IndustryCount")
    @Expose
    private Long IndustryCount;

    /**
    * 开通勒索的公司数量
    */
    @SerializedName("CompanyCount")
    @Expose
    private Long CompanyCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 勒索事件数量 
     * @return EventCount 勒索事件数量
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 勒索事件数量
     * @param EventCount 勒索事件数量
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 影响行业数量 
     * @return IndustryCount 影响行业数量
     */
    public Long getIndustryCount() {
        return this.IndustryCount;
    }

    /**
     * Set 影响行业数量
     * @param IndustryCount 影响行业数量
     */
    public void setIndustryCount(Long IndustryCount) {
        this.IndustryCount = IndustryCount;
    }

    /**
     * Get 开通勒索的公司数量 
     * @return CompanyCount 开通勒索的公司数量
     */
    public Long getCompanyCount() {
        return this.CompanyCount;
    }

    /**
     * Set 开通勒索的公司数量
     * @param CompanyCount 开通勒索的公司数量
     */
    public void setCompanyCount(Long CompanyCount) {
        this.CompanyCount = CompanyCount;
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

    public DescribeRansomDefenseTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRansomDefenseTrendResponse(DescribeRansomDefenseTrendResponse source) {
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.IndustryCount != null) {
            this.IndustryCount = new Long(source.IndustryCount);
        }
        if (source.CompanyCount != null) {
            this.CompanyCount = new Long(source.CompanyCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "IndustryCount", this.IndustryCount);
        this.setParamSimple(map, prefix + "CompanyCount", this.CompanyCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

