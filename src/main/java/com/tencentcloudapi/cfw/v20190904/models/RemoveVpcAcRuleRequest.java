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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveVpcAcRuleRequest extends AbstractModel {

    /**
    * <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p>
    */
    @SerializedName("RuleUuids")
    @Expose
    private Long [] RuleUuids;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>仅当RuleUuids为-1时有效；0：删除Ipv4规则，1：删除Ipv6规则；默认为Ipv4类型规则</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
     * Get <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p> 
     * @return RuleUuids <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p>
     */
    public Long [] getRuleUuids() {
        return this.RuleUuids;
    }

    /**
     * Set <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p>
     * @param RuleUuids <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p>
     */
    public void setRuleUuids(Long [] RuleUuids) {
        this.RuleUuids = RuleUuids;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul> 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get <p>仅当RuleUuids为-1时有效；0：删除Ipv4规则，1：删除Ipv6规则；默认为Ipv4类型规则</p> 
     * @return IpVersion <p>仅当RuleUuids为-1时有效；0：删除Ipv4规则，1：删除Ipv6规则；默认为Ipv4类型规则</p>
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>仅当RuleUuids为-1时有效；0：删除Ipv4规则，1：删除Ipv6规则；默认为Ipv4类型规则</p>
     * @param IpVersion <p>仅当RuleUuids为-1时有效；0：删除Ipv4规则，1：删除Ipv6规则；默认为Ipv4类型规则</p>
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    public RemoveVpcAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveVpcAcRuleRequest(RemoveVpcAcRuleRequest source) {
        if (source.RuleUuids != null) {
            this.RuleUuids = new Long[source.RuleUuids.length];
            for (int i = 0; i < source.RuleUuids.length; i++) {
                this.RuleUuids[i] = new Long(source.RuleUuids[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleUuids.", this.RuleUuids);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

