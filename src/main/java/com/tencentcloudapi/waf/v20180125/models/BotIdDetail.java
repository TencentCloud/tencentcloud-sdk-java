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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotIdDetail extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名称
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 规则开关
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 规则动作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 规则类型
    */
    @SerializedName("BotIdType")
    @Expose
    private String BotIdType;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * 插入时间
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 影响
    */
    @SerializedName("Influence")
    @Expose
    private String Influence;

    /**
    * 重定向路径
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
    * 是否关联事件
    */
    @SerializedName("HasEvent")
    @Expose
    private Boolean HasEvent;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return BotId 规则名称
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 规则名称
     * @param BotId 规则名称
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 规则开关 
     * @return Status 规则开关
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关
     * @param Status 规则开关
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 规则动作 
     * @return Action 规则动作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 规则动作
     * @param Action 规则动作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 规则类型 
     * @return BotIdType 规则类型
     */
    public String getBotIdType() {
        return this.BotIdType;
    }

    /**
     * Set 规则类型
     * @param BotIdType 规则类型
     */
    public void setBotIdType(String BotIdType) {
        this.BotIdType = BotIdType;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 插入时间 
     * @return InsertTime 插入时间
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 插入时间
     * @param InsertTime 插入时间
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 影响 
     * @return Influence 影响
     */
    public String getInfluence() {
        return this.Influence;
    }

    /**
     * Set 影响
     * @param Influence 影响
     */
    public void setInfluence(String Influence) {
        this.Influence = Influence;
    }

    /**
     * Get 重定向路径 
     * @return Redirect 重定向路径
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set 重定向路径
     * @param Redirect 重定向路径
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * Get 是否关联事件 
     * @return HasEvent 是否关联事件
     */
    public Boolean getHasEvent() {
        return this.HasEvent;
    }

    /**
     * Set 是否关联事件
     * @param HasEvent 是否关联事件
     */
    public void setHasEvent(Boolean HasEvent) {
        this.HasEvent = HasEvent;
    }

    public BotIdDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotIdDetail(BotIdDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.BotIdType != null) {
            this.BotIdType = new String(source.BotIdType);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new Long(source.InsertTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Influence != null) {
            this.Influence = new String(source.Influence);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
        if (source.HasEvent != null) {
            this.HasEvent = new Boolean(source.HasEvent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "BotIdType", this.BotIdType);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Influence", this.Influence);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);
        this.setParamSimple(map, prefix + "HasEvent", this.HasEvent);

    }
}

