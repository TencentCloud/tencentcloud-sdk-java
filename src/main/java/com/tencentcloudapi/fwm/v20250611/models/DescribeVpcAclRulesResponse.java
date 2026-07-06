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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcAclRulesResponse extends AbstractModel {

    /**
    * 规则列表
    */
    @SerializedName("Rules")
    @Expose
    private VpcAclRuleResp [] Rules;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 不过滤的总数
    */
    @SerializedName("AllTotalCount")
    @Expose
    private Long AllTotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 规则列表 
     * @return Rules 规则列表
     */
    public VpcAclRuleResp [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则列表
     * @param Rules 规则列表
     */
    public void setRules(VpcAclRuleResp [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 不过滤的总数 
     * @return AllTotalCount 不过滤的总数
     */
    public Long getAllTotalCount() {
        return this.AllTotalCount;
    }

    /**
     * Set 不过滤的总数
     * @param AllTotalCount 不过滤的总数
     */
    public void setAllTotalCount(Long AllTotalCount) {
        this.AllTotalCount = AllTotalCount;
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

    public DescribeVpcAclRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcAclRulesResponse(DescribeVpcAclRulesResponse source) {
        if (source.Rules != null) {
            this.Rules = new VpcAclRuleResp[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new VpcAclRuleResp(source.Rules[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AllTotalCount != null) {
            this.AllTotalCount = new Long(source.AllTotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "AllTotalCount", this.AllTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

