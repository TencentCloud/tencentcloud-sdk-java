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

public class SetNatFwDnatRuleRequest extends AbstractModel{

    /**
    * 0：cfw新增模式，1：cfw接入模式。
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 操作类型，可选值：add，del，modify。
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 防火墙实例id，该字段必须传递。
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * 添加或删除操作的Dnat规则列表。
    */
    @SerializedName("AddOrDelDnatRules")
    @Expose
    private CfwNatDnatRule [] AddOrDelDnatRules;

    /**
    * 修改操作的原始Dnat规则
    */
    @SerializedName("OriginDnat")
    @Expose
    private CfwNatDnatRule OriginDnat;

    /**
    * 修改操作的新的Dnat规则
    */
    @SerializedName("NewDnat")
    @Expose
    private CfwNatDnatRule NewDnat;

    /**
     * Get 0：cfw新增模式，1：cfw接入模式。 
     * @return Mode 0：cfw新增模式，1：cfw接入模式。
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 0：cfw新增模式，1：cfw接入模式。
     * @param Mode 0：cfw新增模式，1：cfw接入模式。
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 操作类型，可选值：add，del，modify。 
     * @return OperationType 操作类型，可选值：add，del，modify。
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型，可选值：add，del，modify。
     * @param OperationType 操作类型，可选值：add，del，modify。
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 防火墙实例id，该字段必须传递。 
     * @return CfwInstance 防火墙实例id，该字段必须传递。
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set 防火墙实例id，该字段必须传递。
     * @param CfwInstance 防火墙实例id，该字段必须传递。
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get 添加或删除操作的Dnat规则列表。 
     * @return AddOrDelDnatRules 添加或删除操作的Dnat规则列表。
     */
    public CfwNatDnatRule [] getAddOrDelDnatRules() {
        return this.AddOrDelDnatRules;
    }

    /**
     * Set 添加或删除操作的Dnat规则列表。
     * @param AddOrDelDnatRules 添加或删除操作的Dnat规则列表。
     */
    public void setAddOrDelDnatRules(CfwNatDnatRule [] AddOrDelDnatRules) {
        this.AddOrDelDnatRules = AddOrDelDnatRules;
    }

    /**
     * Get 修改操作的原始Dnat规则 
     * @return OriginDnat 修改操作的原始Dnat规则
     */
    public CfwNatDnatRule getOriginDnat() {
        return this.OriginDnat;
    }

    /**
     * Set 修改操作的原始Dnat规则
     * @param OriginDnat 修改操作的原始Dnat规则
     */
    public void setOriginDnat(CfwNatDnatRule OriginDnat) {
        this.OriginDnat = OriginDnat;
    }

    /**
     * Get 修改操作的新的Dnat规则 
     * @return NewDnat 修改操作的新的Dnat规则
     */
    public CfwNatDnatRule getNewDnat() {
        return this.NewDnat;
    }

    /**
     * Set 修改操作的新的Dnat规则
     * @param NewDnat 修改操作的新的Dnat规则
     */
    public void setNewDnat(CfwNatDnatRule NewDnat) {
        this.NewDnat = NewDnat;
    }

    public SetNatFwDnatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetNatFwDnatRuleRequest(SetNatFwDnatRuleRequest source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.CfwInstance != null) {
            this.CfwInstance = new String(source.CfwInstance);
        }
        if (source.AddOrDelDnatRules != null) {
            this.AddOrDelDnatRules = new CfwNatDnatRule[source.AddOrDelDnatRules.length];
            for (int i = 0; i < source.AddOrDelDnatRules.length; i++) {
                this.AddOrDelDnatRules[i] = new CfwNatDnatRule(source.AddOrDelDnatRules[i]);
            }
        }
        if (source.OriginDnat != null) {
            this.OriginDnat = new CfwNatDnatRule(source.OriginDnat);
        }
        if (source.NewDnat != null) {
            this.NewDnat = new CfwNatDnatRule(source.NewDnat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);
        this.setParamArrayObj(map, prefix + "AddOrDelDnatRules.", this.AddOrDelDnatRules);
        this.setParamObj(map, prefix + "OriginDnat.", this.OriginDnat);
        this.setParamObj(map, prefix + "NewDnat.", this.NewDnat);

    }
}

