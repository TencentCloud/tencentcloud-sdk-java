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

public class IpsRuleDetailNew extends AbstractModel {

    /**
    * <p>规则ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * <p>规则描述</p>
    */
    @SerializedName("EventNameDesc")
    @Expose
    private String EventNameDesc;

    /**
    * <p>规则类型</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>置信度</p>
    */
    @SerializedName("Confidence")
    @Expose
    private String Confidence;

    /**
    * <p>自增id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>漏洞对象</p>
    */
    @SerializedName("VulTarget")
    @Expose
    private String VulTarget;

    /**
    * <p>漏洞编号</p>
    */
    @SerializedName("Cve")
    @Expose
    private String Cve;

    /**
    * <p>状态 0 关闭 1打开</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>0观察, 1阻断</p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * <p>默认策略</p>
    */
    @SerializedName("DefaultAction")
    @Expose
    private Long DefaultAction;

    /**
    * <p>基础防御/虚拟补丁</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>危险等级</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>FwType字段 1 border 2 nat 4 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FwType")
    @Expose
    private Long FwType;

    /**
     * Get <p>规则ID</p> 
     * @return RuleID <p>规则ID</p>
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>规则ID</p>
     * @param RuleID <p>规则ID</p>
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>规则名称</p> 
     * @return EventName <p>规则名称</p>
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set <p>规则名称</p>
     * @param EventName <p>规则名称</p>
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get <p>规则描述</p> 
     * @return EventNameDesc <p>规则描述</p>
     */
    public String getEventNameDesc() {
        return this.EventNameDesc;
    }

    /**
     * Set <p>规则描述</p>
     * @param EventNameDesc <p>规则描述</p>
     */
    public void setEventNameDesc(String EventNameDesc) {
        this.EventNameDesc = EventNameDesc;
    }

    /**
     * Get <p>规则类型</p> 
     * @return Category <p>规则类型</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>规则类型</p>
     * @param Category <p>规则类型</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>置信度</p> 
     * @return Confidence <p>置信度</p>
     */
    public String getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>置信度</p>
     * @param Confidence <p>置信度</p>
     */
    public void setConfidence(String Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>自增id</p> 
     * @return Id <p>自增id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>自增id</p>
     * @param Id <p>自增id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>漏洞对象</p> 
     * @return VulTarget <p>漏洞对象</p>
     */
    public String getVulTarget() {
        return this.VulTarget;
    }

    /**
     * Set <p>漏洞对象</p>
     * @param VulTarget <p>漏洞对象</p>
     */
    public void setVulTarget(String VulTarget) {
        this.VulTarget = VulTarget;
    }

    /**
     * Get <p>漏洞编号</p> 
     * @return Cve <p>漏洞编号</p>
     */
    public String getCve() {
        return this.Cve;
    }

    /**
     * Set <p>漏洞编号</p>
     * @param Cve <p>漏洞编号</p>
     */
    public void setCve(String Cve) {
        this.Cve = Cve;
    }

    /**
     * Get <p>状态 0 关闭 1打开</p> 
     * @return Status <p>状态 0 关闭 1打开</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态 0 关闭 1打开</p>
     * @param Status <p>状态 0 关闭 1打开</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>0观察, 1阻断</p> 
     * @return Action <p>0观察, 1阻断</p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>0观察, 1阻断</p>
     * @param Action <p>0观察, 1阻断</p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get <p>默认策略</p> 
     * @return DefaultAction <p>默认策略</p>
     */
    public Long getDefaultAction() {
        return this.DefaultAction;
    }

    /**
     * Set <p>默认策略</p>
     * @param DefaultAction <p>默认策略</p>
     */
    public void setDefaultAction(Long DefaultAction) {
        this.DefaultAction = DefaultAction;
    }

    /**
     * Get <p>基础防御/虚拟补丁</p> 
     * @return RuleType <p>基础防御/虚拟补丁</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>基础防御/虚拟补丁</p>
     * @param RuleType <p>基础防御/虚拟补丁</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>危险等级</p> 
     * @return Level <p>危险等级</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>危险等级</p>
     * @param Level <p>危险等级</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>FwType字段 1 border 2 nat 4 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FwType <p>FwType字段 1 border 2 nat 4 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFwType() {
        return this.FwType;
    }

    /**
     * Set <p>FwType字段 1 border 2 nat 4 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FwType <p>FwType字段 1 border 2 nat 4 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFwType(Long FwType) {
        this.FwType = FwType;
    }

    public IpsRuleDetailNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpsRuleDetailNew(IpsRuleDetailNew source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventNameDesc != null) {
            this.EventNameDesc = new String(source.EventNameDesc);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Confidence != null) {
            this.Confidence = new String(source.Confidence);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.VulTarget != null) {
            this.VulTarget = new String(source.VulTarget);
        }
        if (source.Cve != null) {
            this.Cve = new String(source.Cve);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.DefaultAction != null) {
            this.DefaultAction = new Long(source.DefaultAction);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.FwType != null) {
            this.FwType = new Long(source.FwType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventNameDesc", this.EventNameDesc);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "VulTarget", this.VulTarget);
        this.setParamSimple(map, prefix + "Cve", this.Cve);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "DefaultAction", this.DefaultAction);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "FwType", this.FwType);

    }
}

