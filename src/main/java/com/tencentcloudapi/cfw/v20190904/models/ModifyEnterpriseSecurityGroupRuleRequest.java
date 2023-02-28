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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEnterpriseSecurityGroupRuleRequest extends AbstractModel{

    /**
    * 规则的uuid，可通过查询规则列表获取
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * 修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * 编辑后的企业安全组规则数据；修改规则状态不用填该字段
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupRule Data;

    /**
    * 0是关闭,1是开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 规则的uuid，可通过查询规则列表获取 
     * @return RuleUuid 规则的uuid，可通过查询规则列表获取
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set 规则的uuid，可通过查询规则列表获取
     * @param RuleUuid 规则的uuid，可通过查询规则列表获取
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get 修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态 
     * @return ModifyType 修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态
     * @param ModifyType 修改类型，0：修改规则内容；1：修改单条规则开关状态；2：修改所有规则开关状态
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get 编辑后的企业安全组规则数据；修改规则状态不用填该字段 
     * @return Data 编辑后的企业安全组规则数据；修改规则状态不用填该字段
     */
    public SecurityGroupRule getData() {
        return this.Data;
    }

    /**
     * Set 编辑后的企业安全组规则数据；修改规则状态不用填该字段
     * @param Data 编辑后的企业安全组规则数据；修改规则状态不用填该字段
     */
    public void setData(SecurityGroupRule Data) {
        this.Data = Data;
    }

    /**
     * Get 0是关闭,1是开启 
     * @return Enable 0是关闭,1是开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 0是关闭,1是开启
     * @param Enable 0是关闭,1是开启
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
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

