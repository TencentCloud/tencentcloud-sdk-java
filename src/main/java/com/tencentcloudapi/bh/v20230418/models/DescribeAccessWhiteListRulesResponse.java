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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessWhiteListRulesResponse extends AbstractModel {

    /**
    * 记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 访问白名单规则列表
    */
    @SerializedName("AccessWhiteListRuleSet")
    @Expose
    private AccessWhiteListRule [] AccessWhiteListRuleSet;

    /**
    * 是否放开全部来源IP，如果为true，TotalCount为0，AccessWhiteListRuleSet为空
    */
    @SerializedName("AllowAny")
    @Expose
    private Boolean AllowAny;

    /**
    * 是否开启自动添加来源IP, 如果为true, 在开启访问白名单的情况下将自动添加来源IP
    */
    @SerializedName("AllowAuto")
    @Expose
    private Boolean AllowAuto;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 记录总数 
     * @return TotalCount 记录总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 记录总数
     * @param TotalCount 记录总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 访问白名单规则列表 
     * @return AccessWhiteListRuleSet 访问白名单规则列表
     */
    public AccessWhiteListRule [] getAccessWhiteListRuleSet() {
        return this.AccessWhiteListRuleSet;
    }

    /**
     * Set 访问白名单规则列表
     * @param AccessWhiteListRuleSet 访问白名单规则列表
     */
    public void setAccessWhiteListRuleSet(AccessWhiteListRule [] AccessWhiteListRuleSet) {
        this.AccessWhiteListRuleSet = AccessWhiteListRuleSet;
    }

    /**
     * Get 是否放开全部来源IP，如果为true，TotalCount为0，AccessWhiteListRuleSet为空 
     * @return AllowAny 是否放开全部来源IP，如果为true，TotalCount为0，AccessWhiteListRuleSet为空
     */
    public Boolean getAllowAny() {
        return this.AllowAny;
    }

    /**
     * Set 是否放开全部来源IP，如果为true，TotalCount为0，AccessWhiteListRuleSet为空
     * @param AllowAny 是否放开全部来源IP，如果为true，TotalCount为0，AccessWhiteListRuleSet为空
     */
    public void setAllowAny(Boolean AllowAny) {
        this.AllowAny = AllowAny;
    }

    /**
     * Get 是否开启自动添加来源IP, 如果为true, 在开启访问白名单的情况下将自动添加来源IP 
     * @return AllowAuto 是否开启自动添加来源IP, 如果为true, 在开启访问白名单的情况下将自动添加来源IP
     */
    public Boolean getAllowAuto() {
        return this.AllowAuto;
    }

    /**
     * Set 是否开启自动添加来源IP, 如果为true, 在开启访问白名单的情况下将自动添加来源IP
     * @param AllowAuto 是否开启自动添加来源IP, 如果为true, 在开启访问白名单的情况下将自动添加来源IP
     */
    public void setAllowAuto(Boolean AllowAuto) {
        this.AllowAuto = AllowAuto;
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

    public DescribeAccessWhiteListRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessWhiteListRulesResponse(DescribeAccessWhiteListRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AccessWhiteListRuleSet != null) {
            this.AccessWhiteListRuleSet = new AccessWhiteListRule[source.AccessWhiteListRuleSet.length];
            for (int i = 0; i < source.AccessWhiteListRuleSet.length; i++) {
                this.AccessWhiteListRuleSet[i] = new AccessWhiteListRule(source.AccessWhiteListRuleSet[i]);
            }
        }
        if (source.AllowAny != null) {
            this.AllowAny = new Boolean(source.AllowAny);
        }
        if (source.AllowAuto != null) {
            this.AllowAuto = new Boolean(source.AllowAuto);
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
        this.setParamArrayObj(map, prefix + "AccessWhiteListRuleSet.", this.AccessWhiteListRuleSet);
        this.setParamSimple(map, prefix + "AllowAny", this.AllowAny);
        this.setParamSimple(map, prefix + "AllowAuto", this.AllowAuto);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

