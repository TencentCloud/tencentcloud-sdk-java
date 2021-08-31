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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineRuleInfo extends AbstractModel{

    /**
    * 检测项名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 检测项描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 修复建议
    */
    @SerializedName("FixMessage")
    @Expose
    private String FixMessage;

    /**
    * 危害等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 检测项id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 最后检测时间
    */
    @SerializedName("LastScanAt")
    @Expose
    private String LastScanAt;

    /**
    * 具体原因说明
    */
    @SerializedName("RuleRemark")
    @Expose
    private String RuleRemark;

    /**
    * 唯一Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 唯一事件ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get 检测项名称 
     * @return RuleName 检测项名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 检测项名称
     * @param RuleName 检测项名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 检测项描述 
     * @return Description 检测项描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 检测项描述
     * @param Description 检测项描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 修复建议 
     * @return FixMessage 修复建议
     */
    public String getFixMessage() {
        return this.FixMessage;
    }

    /**
     * Set 修复建议
     * @param FixMessage 修复建议
     */
    public void setFixMessage(String FixMessage) {
        this.FixMessage = FixMessage;
    }

    /**
     * Get 危害等级 
     * @return Level 危害等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危害等级
     * @param Level 危害等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 检测项id 
     * @return RuleId 检测项id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 检测项id
     * @param RuleId 检测项id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 最后检测时间 
     * @return LastScanAt 最后检测时间
     */
    public String getLastScanAt() {
        return this.LastScanAt;
    }

    /**
     * Set 最后检测时间
     * @param LastScanAt 最后检测时间
     */
    public void setLastScanAt(String LastScanAt) {
        this.LastScanAt = LastScanAt;
    }

    /**
     * Get 具体原因说明 
     * @return RuleRemark 具体原因说明
     */
    public String getRuleRemark() {
        return this.RuleRemark;
    }

    /**
     * Set 具体原因说明
     * @param RuleRemark 具体原因说明
     */
    public void setRuleRemark(String RuleRemark) {
        this.RuleRemark = RuleRemark;
    }

    /**
     * Get 唯一Uuid 
     * @return Uuid 唯一Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 唯一Uuid
     * @param Uuid 唯一Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 唯一事件ID 
     * @return EventId 唯一事件ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 唯一事件ID
     * @param EventId 唯一事件ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public BaselineRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRuleInfo(BaselineRuleInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FixMessage != null) {
            this.FixMessage = new String(source.FixMessage);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.LastScanAt != null) {
            this.LastScanAt = new String(source.LastScanAt);
        }
        if (source.RuleRemark != null) {
            this.RuleRemark = new String(source.RuleRemark);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FixMessage", this.FixMessage);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "LastScanAt", this.LastScanAt);
        this.setParamSimple(map, prefix + "RuleRemark", this.RuleRemark);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

