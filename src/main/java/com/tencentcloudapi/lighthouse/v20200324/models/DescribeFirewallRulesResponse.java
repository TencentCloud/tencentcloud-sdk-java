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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirewallRulesResponse extends AbstractModel{

    /**
    * 符合条件的防火墙规则数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 防火墙规则详细信息列表。
    */
    @SerializedName("FirewallRuleSet")
    @Expose
    private FirewallRuleInfo [] FirewallRuleSet;

    /**
    * 防火墙版本号。
    */
    @SerializedName("FirewallVersion")
    @Expose
    private Long FirewallVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的防火墙规则数量。 
     * @return TotalCount 符合条件的防火墙规则数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的防火墙规则数量。
     * @param TotalCount 符合条件的防火墙规则数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 防火墙规则详细信息列表。 
     * @return FirewallRuleSet 防火墙规则详细信息列表。
     */
    public FirewallRuleInfo [] getFirewallRuleSet() {
        return this.FirewallRuleSet;
    }

    /**
     * Set 防火墙规则详细信息列表。
     * @param FirewallRuleSet 防火墙规则详细信息列表。
     */
    public void setFirewallRuleSet(FirewallRuleInfo [] FirewallRuleSet) {
        this.FirewallRuleSet = FirewallRuleSet;
    }

    /**
     * Get 防火墙版本号。 
     * @return FirewallVersion 防火墙版本号。
     */
    public Long getFirewallVersion() {
        return this.FirewallVersion;
    }

    /**
     * Set 防火墙版本号。
     * @param FirewallVersion 防火墙版本号。
     */
    public void setFirewallVersion(Long FirewallVersion) {
        this.FirewallVersion = FirewallVersion;
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

    public DescribeFirewallRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirewallRulesResponse(DescribeFirewallRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.FirewallRuleSet != null) {
            this.FirewallRuleSet = new FirewallRuleInfo[source.FirewallRuleSet.length];
            for (int i = 0; i < source.FirewallRuleSet.length; i++) {
                this.FirewallRuleSet[i] = new FirewallRuleInfo(source.FirewallRuleSet[i]);
            }
        }
        if (source.FirewallVersion != null) {
            this.FirewallVersion = new Long(source.FirewallVersion);
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
        this.setParamArrayObj(map, prefix + "FirewallRuleSet.", this.FirewallRuleSet);
        this.setParamSimple(map, prefix + "FirewallVersion", this.FirewallVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

