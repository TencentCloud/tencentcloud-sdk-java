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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRuleResponse extends AbstractModel{

    /**
    * 事件集id
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * 事件规则id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 事件规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 事件规则状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 使能开关
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 事件规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 事件模式
    */
    @SerializedName("EventPattern")
    @Expose
    private String EventPattern;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 更新时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 事件集id 
     * @return EventBusId 事件集id
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集id
     * @param EventBusId 事件集id
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get 事件规则id 
     * @return RuleId 事件规则id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 事件规则id
     * @param RuleId 事件规则id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 事件规则名称 
     * @return RuleName 事件规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 事件规则名称
     * @param RuleName 事件规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 事件规则状态 
     * @return Status 事件规则状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 事件规则状态
     * @param Status 事件规则状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 使能开关 
     * @return Enable 使能开关
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 使能开关
     * @param Enable 使能开关
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 事件规则描述 
     * @return Description 事件规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件规则描述
     * @param Description 事件规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 事件模式 
     * @return EventPattern 事件模式
     */
    public String getEventPattern() {
        return this.EventPattern;
    }

    /**
     * Set 事件模式
     * @param EventPattern 事件模式
     */
    public void setEventPattern(String EventPattern) {
        this.EventPattern = EventPattern;
    }

    /**
     * Get 创建时间 
     * @return AddTime 创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
     * @param AddTime 创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 更新时间 
     * @return ModTime 更新时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set 更新时间
     * @param ModTime 更新时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
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

    public GetRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRuleResponse(GetRuleResponse source) {
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EventPattern != null) {
            this.EventPattern = new String(source.EventPattern);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EventPattern", this.EventPattern);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

