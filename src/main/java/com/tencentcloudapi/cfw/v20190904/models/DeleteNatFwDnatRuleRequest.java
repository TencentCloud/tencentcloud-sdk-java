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

public class DeleteNatFwDnatRuleRequest extends AbstractModel {

    /**
    * 0：cfw新增模式，1：cfw接入模式。
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 防火墙实例id，该字段必须传递。
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * 添加或删除操作的Dnat规则列表。
    */
    @SerializedName("DnatRules")
    @Expose
    private CfwNatDnatRule [] DnatRules;

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
     * @return DnatRules 添加或删除操作的Dnat规则列表。
     */
    public CfwNatDnatRule [] getDnatRules() {
        return this.DnatRules;
    }

    /**
     * Set 添加或删除操作的Dnat规则列表。
     * @param DnatRules 添加或删除操作的Dnat规则列表。
     */
    public void setDnatRules(CfwNatDnatRule [] DnatRules) {
        this.DnatRules = DnatRules;
    }

    public DeleteNatFwDnatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNatFwDnatRuleRequest(DeleteNatFwDnatRuleRequest source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.CfwInstance != null) {
            this.CfwInstance = new String(source.CfwInstance);
        }
        if (source.DnatRules != null) {
            this.DnatRules = new CfwNatDnatRule[source.DnatRules.length];
            for (int i = 0; i < source.DnatRules.length; i++) {
                this.DnatRules[i] = new CfwNatDnatRule(source.DnatRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);
        this.setParamArrayObj(map, prefix + "DnatRules.", this.DnatRules);

    }
}

