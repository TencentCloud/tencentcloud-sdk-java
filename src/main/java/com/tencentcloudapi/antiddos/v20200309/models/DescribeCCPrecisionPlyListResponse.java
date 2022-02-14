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

public class DescribeCCPrecisionPlyListResponse extends AbstractModel{

    /**
    * 策略列表总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 策略列表详情
    */
    @SerializedName("PrecisionPolicyList")
    @Expose
    private CCPrecisionPolicy [] PrecisionPolicyList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略列表总数 
     * @return Total 策略列表总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 策略列表总数
     * @param Total 策略列表总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 策略列表详情 
     * @return PrecisionPolicyList 策略列表详情
     */
    public CCPrecisionPolicy [] getPrecisionPolicyList() {
        return this.PrecisionPolicyList;
    }

    /**
     * Set 策略列表详情
     * @param PrecisionPolicyList 策略列表详情
     */
    public void setPrecisionPolicyList(CCPrecisionPolicy [] PrecisionPolicyList) {
        this.PrecisionPolicyList = PrecisionPolicyList;
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

    public DescribeCCPrecisionPlyListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCPrecisionPlyListResponse(DescribeCCPrecisionPlyListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.PrecisionPolicyList != null) {
            this.PrecisionPolicyList = new CCPrecisionPolicy[source.PrecisionPolicyList.length];
            for (int i = 0; i < source.PrecisionPolicyList.length; i++) {
                this.PrecisionPolicyList[i] = new CCPrecisionPolicy(source.PrecisionPolicyList[i]);
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
        this.setParamArrayObj(map, prefix + "PrecisionPolicyList.", this.PrecisionPolicyList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

