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

public class ModifyEnterpriseSecurityGroupRuleRequest extends AbstractModel {

    /**
    * <p>规则的uuid，可通过查询规则列表获取</p>
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * <p>修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态</p>
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>编辑后的企业安全组规则数据；修改规则状态不用填该字段</p>
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupRule Data;

    /**
    * <p>0是关闭,1是开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get <p>规则的uuid，可通过查询规则列表获取</p> 
     * @return RuleUuid <p>规则的uuid，可通过查询规则列表获取</p>
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set <p>规则的uuid，可通过查询规则列表获取</p>
     * @param RuleUuid <p>规则的uuid，可通过查询规则列表获取</p>
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get <p>修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态</p> 
     * @return ModifyType <p>修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态</p>
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set <p>修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态</p>
     * @param ModifyType <p>修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态</p>
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
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
     * Get <p>编辑后的企业安全组规则数据；修改规则状态不用填该字段</p> 
     * @return Data <p>编辑后的企业安全组规则数据；修改规则状态不用填该字段</p>
     */
    public SecurityGroupRule getData() {
        return this.Data;
    }

    /**
     * Set <p>编辑后的企业安全组规则数据；修改规则状态不用填该字段</p>
     * @param Data <p>编辑后的企业安全组规则数据；修改规则状态不用填该字段</p>
     */
    public void setData(SecurityGroupRule Data) {
        this.Data = Data;
    }

    /**
     * Get <p>0是关闭,1是开启</p> 
     * @return Enable <p>0是关闭,1是开启</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>0是关闭,1是开启</p>
     * @param Enable <p>0是关闭,1是开启</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyEnterpriseSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnterpriseSecurityGroupRuleRequest(ModifyEnterpriseSecurityGroupRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.Data != null) {
            this.Data = new SecurityGroupRule(source.Data);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

