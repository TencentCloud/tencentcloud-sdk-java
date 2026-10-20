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

public class RuleDetail extends AbstractModel {

    /**
    * <p>规则ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>严重度</p>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * <p>动作</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>开关</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>脱敏样例</p>
    */
    @SerializedName("DesensitizeSample")
    @Expose
    private String DesensitizeSample;

    /**
    * <p>检测方向</p><p>取值范围：[0, 3]</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>规则修改时间（秒级时间戳）：租户对该规则的最近一次修改时间，从未修改则为0</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>规则ID</p> 
     * @return RuleId <p>规则ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则ID</p>
     * @param RuleId <p>规则ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>严重度</p> 
     * @return Severity <p>严重度</p>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>严重度</p>
     * @param Severity <p>严重度</p>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>动作</p> 
     * @return Action <p>动作</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>动作</p>
     * @param Action <p>动作</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>开关</p> 
     * @return Status <p>开关</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开关</p>
     * @param Status <p>开关</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>脱敏样例</p> 
     * @return DesensitizeSample <p>脱敏样例</p>
     */
    public String getDesensitizeSample() {
        return this.DesensitizeSample;
    }

    /**
     * Set <p>脱敏样例</p>
     * @param DesensitizeSample <p>脱敏样例</p>
     */
    public void setDesensitizeSample(String DesensitizeSample) {
        this.DesensitizeSample = DesensitizeSample;
    }

    /**
     * Get <p>检测方向</p><p>取值范围：[0, 3]</p> 
     * @return Direction <p>检测方向</p><p>取值范围：[0, 3]</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>检测方向</p><p>取值范围：[0, 3]</p>
     * @param Direction <p>检测方向</p><p>取值范围：[0, 3]</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>规则修改时间（秒级时间戳）：租户对该规则的最近一次修改时间，从未修改则为0</p> 
     * @return UpdateTime <p>规则修改时间（秒级时间戳）：租户对该规则的最近一次修改时间，从未修改则为0</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>规则修改时间（秒级时间戳）：租户对该规则的最近一次修改时间，从未修改则为0</p>
     * @param UpdateTime <p>规则修改时间（秒级时间戳）：租户对该规则的最近一次修改时间，从未修改则为0</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleDetail(RuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DesensitizeSample != null) {
            this.DesensitizeSample = new String(source.DesensitizeSample);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DesensitizeSample", this.DesensitizeSample);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

