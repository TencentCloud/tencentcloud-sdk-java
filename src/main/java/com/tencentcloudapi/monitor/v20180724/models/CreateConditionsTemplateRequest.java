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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConditionsTemplateRequest extends AbstractModel {

    /**
    * <p>固定值，monitor</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>视图名</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>组名</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>是否为与关系</p>
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>父ID</p>
    */
    @SerializedName("ParentGroupID")
    @Expose
    private Long ParentGroupID;

    /**
    * <p>是否屏蔽</p>
    */
    @SerializedName("IsShielded")
    @Expose
    private Long IsShielded;

    /**
    * <p>复合告警表达式</p>
    */
    @SerializedName("ComplexExpression")
    @Expose
    private String ComplexExpression;

    /**
    * <p>指标告警条件</p>
    */
    @SerializedName("Conditions")
    @Expose
    private ModifyConditionsTemplateRequestCondition [] Conditions;

    /**
    * <p>事件告警条件</p>
    */
    @SerializedName("EventConditions")
    @Expose
    private ModifyConditionsTemplateRequestEventCondition [] EventConditions;

    /**
     * Get <p>固定值，monitor</p> 
     * @return Module <p>固定值，monitor</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，monitor</p>
     * @param Module <p>固定值，monitor</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>视图名</p> 
     * @return ViewName <p>视图名</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>视图名</p>
     * @param ViewName <p>视图名</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>组名</p> 
     * @return GroupName <p>组名</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>组名</p>
     * @param GroupName <p>组名</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>是否为与关系</p> 
     * @return IsUnionRule <p>是否为与关系</p>
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set <p>是否为与关系</p>
     * @param IsUnionRule <p>是否为与关系</p>
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>父ID</p> 
     * @return ParentGroupID <p>父ID</p>
     */
    public Long getParentGroupID() {
        return this.ParentGroupID;
    }

    /**
     * Set <p>父ID</p>
     * @param ParentGroupID <p>父ID</p>
     */
    public void setParentGroupID(Long ParentGroupID) {
        this.ParentGroupID = ParentGroupID;
    }

    /**
     * Get <p>是否屏蔽</p> 
     * @return IsShielded <p>是否屏蔽</p>
     */
    public Long getIsShielded() {
        return this.IsShielded;
    }

    /**
     * Set <p>是否屏蔽</p>
     * @param IsShielded <p>是否屏蔽</p>
     */
    public void setIsShielded(Long IsShielded) {
        this.IsShielded = IsShielded;
    }

    /**
     * Get <p>复合告警表达式</p> 
     * @return ComplexExpression <p>复合告警表达式</p>
     */
    public String getComplexExpression() {
        return this.ComplexExpression;
    }

    /**
     * Set <p>复合告警表达式</p>
     * @param ComplexExpression <p>复合告警表达式</p>
     */
    public void setComplexExpression(String ComplexExpression) {
        this.ComplexExpression = ComplexExpression;
    }

    /**
     * Get <p>指标告警条件</p> 
     * @return Conditions <p>指标告警条件</p>
     */
    public ModifyConditionsTemplateRequestCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set <p>指标告警条件</p>
     * @param Conditions <p>指标告警条件</p>
     */
    public void setConditions(ModifyConditionsTemplateRequestCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get <p>事件告警条件</p> 
     * @return EventConditions <p>事件告警条件</p>
     */
    public ModifyConditionsTemplateRequestEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set <p>事件告警条件</p>
     * @param EventConditions <p>事件告警条件</p>
     */
    public void setEventConditions(ModifyConditionsTemplateRequestEventCondition [] EventConditions) {
        this.EventConditions = EventConditions;
    }

    public CreateConditionsTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConditionsTemplateRequest(CreateConditionsTemplateRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ParentGroupID != null) {
            this.ParentGroupID = new Long(source.ParentGroupID);
        }
        if (source.IsShielded != null) {
            this.IsShielded = new Long(source.IsShielded);
        }
        if (source.ComplexExpression != null) {
            this.ComplexExpression = new String(source.ComplexExpression);
        }
        if (source.Conditions != null) {
            this.Conditions = new ModifyConditionsTemplateRequestCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new ModifyConditionsTemplateRequestCondition(source.Conditions[i]);
            }
        }
        if (source.EventConditions != null) {
            this.EventConditions = new ModifyConditionsTemplateRequestEventCondition[source.EventConditions.length];
            for (int i = 0; i < source.EventConditions.length; i++) {
                this.EventConditions[i] = new ModifyConditionsTemplateRequestEventCondition(source.EventConditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ParentGroupID", this.ParentGroupID);
        this.setParamSimple(map, prefix + "IsShielded", this.IsShielded);
        this.setParamSimple(map, prefix + "ComplexExpression", this.ComplexExpression);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "EventConditions.", this.EventConditions);

    }
}

