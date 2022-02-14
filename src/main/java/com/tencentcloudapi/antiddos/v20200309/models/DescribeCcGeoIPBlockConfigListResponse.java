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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCcGeoIPBlockConfigListResponse extends AbstractModel{

    /**
    * CC地域封禁策略列表总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * CC地域封禁策略列表详情
    */
    @SerializedName("CcGeoIpPolicyList")
    @Expose
    private CcGeoIpPolicyNew [] CcGeoIpPolicyList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CC地域封禁策略列表总数 
     * @return Total CC地域封禁策略列表总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set CC地域封禁策略列表总数
     * @param Total CC地域封禁策略列表总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get CC地域封禁策略列表详情 
     * @return CcGeoIpPolicyList CC地域封禁策略列表详情
     */
    public CcGeoIpPolicyNew [] getCcGeoIpPolicyList() {
        return this.CcGeoIpPolicyList;
    }

    /**
     * Set CC地域封禁策略列表详情
     * @param CcGeoIpPolicyList CC地域封禁策略列表详情
     */
    public void setCcGeoIpPolicyList(CcGeoIpPolicyNew [] CcGeoIpPolicyList) {
        this.CcGeoIpPolicyList = CcGeoIpPolicyList;
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

    public DescribeCcGeoIPBlockConfigListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcGeoIPBlockConfigListResponse(DescribeCcGeoIPBlockConfigListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CcGeoIpPolicyList != null) {
            this.CcGeoIpPolicyList = new CcGeoIpPolicyNew[source.CcGeoIpPolicyList.length];
            for (int i = 0; i < source.CcGeoIpPolicyList.length; i++) {
                this.CcGeoIpPolicyList[i] = new CcGeoIpPolicyNew(source.CcGeoIpPolicyList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "CcGeoIpPolicyList.", this.CcGeoIpPolicyList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

