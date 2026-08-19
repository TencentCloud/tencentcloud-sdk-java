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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatRulesResponse extends AbstractModel {

    /**
    * <p>Dnat规则列表</p>
    */
    @SerializedName("DnatRules")
    @Expose
    private NatDnatRuleItem [] DnatRules;

    /**
    * <p>Snat规则列表</p>
    */
    @SerializedName("SnatRules")
    @Expose
    private NatSnatRuleItem [] SnatRules;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Dnat规则列表</p> 
     * @return DnatRules <p>Dnat规则列表</p>
     */
    public NatDnatRuleItem [] getDnatRules() {
        return this.DnatRules;
    }

    /**
     * Set <p>Dnat规则列表</p>
     * @param DnatRules <p>Dnat规则列表</p>
     */
    public void setDnatRules(NatDnatRuleItem [] DnatRules) {
        this.DnatRules = DnatRules;
    }

    /**
     * Get <p>Snat规则列表</p> 
     * @return SnatRules <p>Snat规则列表</p>
     */
    public NatSnatRuleItem [] getSnatRules() {
        return this.SnatRules;
    }

    /**
     * Set <p>Snat规则列表</p>
     * @param SnatRules <p>Snat规则列表</p>
     */
    public void setSnatRules(NatSnatRuleItem [] SnatRules) {
        this.SnatRules = SnatRules;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNatRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatRulesResponse(DescribeNatRulesResponse source) {
        if (source.DnatRules != null) {
            this.DnatRules = new NatDnatRuleItem[source.DnatRules.length];
            for (int i = 0; i < source.DnatRules.length; i++) {
                this.DnatRules[i] = new NatDnatRuleItem(source.DnatRules[i]);
            }
        }
        if (source.SnatRules != null) {
            this.SnatRules = new NatSnatRuleItem[source.SnatRules.length];
            for (int i = 0; i < source.SnatRules.length; i++) {
                this.SnatRules[i] = new NatSnatRuleItem(source.SnatRules[i]);
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
        this.setParamArrayObj(map, prefix + "DnatRules.", this.DnatRules);
        this.setParamArrayObj(map, prefix + "SnatRules.", this.SnatRules);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

