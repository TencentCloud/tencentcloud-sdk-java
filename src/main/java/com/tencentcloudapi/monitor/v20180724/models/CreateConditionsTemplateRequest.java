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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConditionsTemplateRequest extends AbstractModel {

    /**
    * 固定值，monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 视图名
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 是否为与关系
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 父ID
    */
    @SerializedName("ParentGroupID")
    @Expose
    private Long ParentGroupID;

    /**
    * 是否屏蔽
    */
    @SerializedName("IsShielded")
    @Expose
    private Long IsShielded;

    /**
    * 复合告警表达式
    */
    @SerializedName("ComplexExpression")
    @Expose
    private String ComplexExpression;

    /**
    * 指标告警条件
    */
    @SerializedName("Conditions")
    @Expose
    private ModifyConditionsTemplateRequestCondition [] Conditions;

    /**
    * 事件告警条件
    */
    @SerializedName("EventConditions")
    @Expose
    private ModifyConditionsTemplateRequestEventCondition [] EventConditions;

    /**
     * Get 固定值，monitor 
     * @return Module 固定值，monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，monitor
     * @param Module 固定值，monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 视图名 
     * @return ViewName 视图名
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 视图名
     * @param ViewName 视图名
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 组名 
     * @return GroupName 组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 组名
     * @param GroupName 组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 是否为与关系 
     * @return IsUnionRule 是否为与关系
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set 是否为与关系
     * @param IsUnionRule 是否为与关系
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 父ID 
     * @return ParentGroupID 父ID
     */
    public Long getParentGroupID() {
        return this.ParentGroupID;
    }

    /**
     * Set 父ID
     * @param ParentGroupID 父ID
     */
    public void setParentGroupID(Long ParentGroupID) {
        this.ParentGroupID = ParentGroupID;
    }

    /**
     * Get 是否屏蔽 
     * @return IsShielded 是否屏蔽
     */
    public Long getIsShielded() {
        return this.IsShielded;
    }

    /**
     * Set 是否屏蔽
     * @param IsShielded 是否屏蔽
     */
    public void setIsShielded(Long IsShielded) {
        this.IsShielded = IsShielded;
    }

    /**
     * Get 复合告警表达式 
     * @return ComplexExpression 复合告警表达式
     */
    public String getComplexExpression() {
        return this.ComplexExpression;
    }

    /**
     * Set 复合告警表达式
     * @param ComplexExpression 复合告警表达式
     */
    public void setComplexExpression(String ComplexExpression) {
        this.ComplexExpression = ComplexExpression;
    }

    /**
     * Get 指标告警条件 
     * @return Conditions 指标告警条件
     */
    public ModifyConditionsTemplateRequestCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 指标告警条件
     * @param Conditions 指标告警条件
     */
    public void setConditions(ModifyConditionsTemplateRequestCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 事件告警条件 
     * @return EventConditions 事件告警条件
     */
    public ModifyConditionsTemplateRequestEventCondition [] getEventConditions() {
        return this.EventConditions;
    }

    /**
     * Set 事件告警条件
     * @param EventConditions 事件告警条件
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

