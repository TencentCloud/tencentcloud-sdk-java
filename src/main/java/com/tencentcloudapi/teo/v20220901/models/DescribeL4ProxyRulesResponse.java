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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeL4ProxyRulesResponse extends AbstractModel {

    /**
    * 转发规则总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 转发规则列表。	
    */
    @SerializedName("L4ProxyRules")
    @Expose
    private L4ProxyRule [] L4ProxyRules;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 转发规则总数。 
     * @return TotalCount 转发规则总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 转发规则总数。
     * @param TotalCount 转发规则总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 转发规则列表。	 
     * @return L4ProxyRules 转发规则列表。	
     */
    public L4ProxyRule [] getL4ProxyRules() {
        return this.L4ProxyRules;
    }

    /**
     * Set 转发规则列表。	
     * @param L4ProxyRules 转发规则列表。	
     */
    public void setL4ProxyRules(L4ProxyRule [] L4ProxyRules) {
        this.L4ProxyRules = L4ProxyRules;
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

    public DescribeL4ProxyRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeL4ProxyRulesResponse(DescribeL4ProxyRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.L4ProxyRules != null) {
            this.L4ProxyRules = new L4ProxyRule[source.L4ProxyRules.length];
            for (int i = 0; i < source.L4ProxyRules.length; i++) {
                this.L4ProxyRules[i] = new L4ProxyRule(source.L4ProxyRules[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "L4ProxyRules.", this.L4ProxyRules);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

