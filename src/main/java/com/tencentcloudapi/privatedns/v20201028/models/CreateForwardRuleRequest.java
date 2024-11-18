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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateForwardRuleRequest extends AbstractModel {

    /**
    * 转发规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 转发规则类型：云上到云下DOWN，云下到云上UP
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 私有域ID，可在私有域列表页面查看
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 终端节点ID
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
     * Get 转发规则名称 
     * @return RuleName 转发规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 转发规则名称
     * @param RuleName 转发规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 转发规则类型：云上到云下DOWN，云下到云上UP 
     * @return RuleType 转发规则类型：云上到云下DOWN，云下到云上UP
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 转发规则类型：云上到云下DOWN，云下到云上UP
     * @param RuleType 转发规则类型：云上到云下DOWN，云下到云上UP
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 私有域ID，可在私有域列表页面查看 
     * @return ZoneId 私有域ID，可在私有域列表页面查看
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 私有域ID，可在私有域列表页面查看
     * @param ZoneId 私有域ID，可在私有域列表页面查看
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 终端节点ID 
     * @return EndPointId 终端节点ID
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点ID
     * @param EndPointId 终端节点ID
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    public CreateForwardRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateForwardRuleRequest(CreateForwardRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);

    }
}

