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

public class DescribeCcBlackWhiteIpListResponse extends AbstractModel{

    /**
    * CC四层黑白名单策略列表总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * CC四层黑白名单策略列表详情
    */
    @SerializedName("CcBlackWhiteIpList")
    @Expose
    private CcBlackWhiteIpPolicy [] CcBlackWhiteIpList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CC四层黑白名单策略列表总数 
     * @return Total CC四层黑白名单策略列表总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set CC四层黑白名单策略列表总数
     * @param Total CC四层黑白名单策略列表总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get CC四层黑白名单策略列表详情 
     * @return CcBlackWhiteIpList CC四层黑白名单策略列表详情
     */
    public CcBlackWhiteIpPolicy [] getCcBlackWhiteIpList() {
        return this.CcBlackWhiteIpList;
    }

    /**
     * Set CC四层黑白名单策略列表详情
     * @param CcBlackWhiteIpList CC四层黑白名单策略列表详情
     */
    public void setCcBlackWhiteIpList(CcBlackWhiteIpPolicy [] CcBlackWhiteIpList) {
        this.CcBlackWhiteIpList = CcBlackWhiteIpList;
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

    public DescribeCcBlackWhiteIpListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcBlackWhiteIpListResponse(DescribeCcBlackWhiteIpListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CcBlackWhiteIpList != null) {
            this.CcBlackWhiteIpList = new CcBlackWhiteIpPolicy[source.CcBlackWhiteIpList.length];
            for (int i = 0; i < source.CcBlackWhiteIpList.length; i++) {
                this.CcBlackWhiteIpList[i] = new CcBlackWhiteIpPolicy(source.CcBlackWhiteIpList[i]);
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
        this.setParamArrayObj(map, prefix + "CcBlackWhiteIpList.", this.CcBlackWhiteIpList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

