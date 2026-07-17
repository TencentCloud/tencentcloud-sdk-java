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

public class RemoveAclRuleRequest extends AbstractModel {

    /**
    * <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p>
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long [] RuleUuid;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>规则方向：1，入站；0，出站</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p> 
     * @return RuleUuid <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p>
     */
    public Long [] getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p>
     * @param RuleUuid <p>规则的uuid列表，可通过查询规则列表获取，注意：如果传入的是[-1]将删除所有规则</p>
     */
    public void setRuleUuid(Long [] RuleUuid) {
        this.RuleUuid = RuleUuid;
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
     * Get <p>规则方向：1，入站；0，出站</p> 
     * @return Direction <p>规则方向：1，入站；0，出站</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>规则方向：1，入站；0，出站</p>
     * @param Direction <p>规则方向：1，入站；0，出站</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public RemoveAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveAclRuleRequest(RemoveAclRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long[source.RuleUuid.length];
            for (int i = 0; i < source.RuleUuid.length; i++) {
                this.RuleUuid[i] = new Long(source.RuleUuid[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleUuid.", this.RuleUuid);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

