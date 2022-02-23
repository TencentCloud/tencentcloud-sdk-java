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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyGroup extends AbstractModel{

    /**
    * 是否可设为默认告警策略
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Boolean CanSetDefault;

    /**
    * 告警策略组ID
    */
    @SerializedName("GroupID")
    @Expose
    private Long GroupID;

    /**
    * 告警策略组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 创建时间
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * 是否为默认告警策略
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 告警策略启用状态
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 最后修改人UIN
    */
    @SerializedName("LastEditUin")
    @Expose
    private Long LastEditUin;

    /**
    * 未屏蔽的实例数
    */
    @SerializedName("NoShieldedInstanceCount")
    @Expose
    private Long NoShieldedInstanceCount;

    /**
    * 父策略组ID
    */
    @SerializedName("ParentGroupID")
    @Expose
    private Long ParentGroupID;

    /**
    * 所属项目ID
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 告警接收对象信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private PolicyGroupReceiverInfo [] ReceiverInfos;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 总绑定实例数
    */
    @SerializedName("TotalInstanceCount")
    @Expose
    private Long TotalInstanceCount;

    /**
    * 视图
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 是否为与关系规则
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get 是否可设为默认告警策略 
     * @return CanSetDefault 是否可设为默认告警策略
     */
    public Boolean getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set 是否可设为默认告警策略
     * @param CanSetDefault 是否可设为默认告警策略
     */
    public void setCanSetDefault(Boolean CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get 告警策略组ID 
     * @return GroupID 告警策略组ID
     */
    public Long getGroupID() {
        return this.GroupID;
    }

    /**
     * Set 告警策略组ID
     * @param GroupID 告警策略组ID
     */
    public void setGroupID(Long GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get 告警策略组名称 
     * @return GroupName 告警策略组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 告警策略组名称
     * @param GroupName 告警策略组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 创建时间 
     * @return InsertTime 创建时间
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 创建时间
     * @param InsertTime 创建时间
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 是否为默认告警策略 
     * @return IsDefault 是否为默认告警策略
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认告警策略
     * @param IsDefault 是否为默认告警策略
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 告警策略启用状态 
     * @return Enable 告警策略启用状态
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 告警策略启用状态
     * @param Enable 告警策略启用状态
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 最后修改人UIN 
     * @return LastEditUin 最后修改人UIN
     */
    public Long getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set 最后修改人UIN
     * @param LastEditUin 最后修改人UIN
     */
    public void setLastEditUin(Long LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get 未屏蔽的实例数 
     * @return NoShieldedInstanceCount 未屏蔽的实例数
     */
    public Long getNoShieldedInstanceCount() {
        return this.NoShieldedInstanceCount;
    }

    /**
     * Set 未屏蔽的实例数
     * @param NoShieldedInstanceCount 未屏蔽的实例数
     */
    public void setNoShieldedInstanceCount(Long NoShieldedInstanceCount) {
        this.NoShieldedInstanceCount = NoShieldedInstanceCount;
    }

    /**
     * Get 父策略组ID 
     * @return ParentGroupID 父策略组ID
     */
    public Long getParentGroupID() {
        return this.ParentGroupID;
    }

    /**
     * Set 父策略组ID
     * @param ParentGroupID 父策略组ID
     */
    public void setParentGroupID(Long ParentGroupID) {
        this.ParentGroupID = ParentGroupID;
    }

    /**
     * Get 所属项目ID 
     * @return ProjectID 所属项目ID
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 所属项目ID
     * @param ProjectID 所属项目ID
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 告警接收对象信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverInfos 告警接收对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PolicyGroupReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set 告警接收对象信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverInfos 告警接收对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverInfos(PolicyGroupReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 总绑定实例数 
     * @return TotalInstanceCount 总绑定实例数
     */
    public Long getTotalInstanceCount() {
        return this.TotalInstanceCount;
    }

    /**
     * Set 总绑定实例数
     * @param TotalInstanceCount 总绑定实例数
     */
    public void setTotalInstanceCount(Long TotalInstanceCount) {
        this.TotalInstanceCount = TotalInstanceCount;
    }

    /**
     * Get 视图 
     * @return ViewName 视图
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 视图
     * @param ViewName 视图
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 是否为与关系规则 
     * @return IsUnionRule 是否为与关系规则
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set 是否为与关系规则
     * @param IsUnionRule 是否为与关系规则
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    public PolicyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyGroup(PolicyGroup source) {
        if (source.CanSetDefault != null) {
            this.CanSetDefault = new Boolean(source.CanSetDefault);
        }
        if (source.GroupID != null) {
            this.GroupID = new Long(source.GroupID);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new Long(source.InsertTime);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new Long(source.LastEditUin);
        }
        if (source.NoShieldedInstanceCount != null) {
            this.NoShieldedInstanceCount = new Long(source.NoShieldedInstanceCount);
        }
        if (source.ParentGroupID != null) {
            this.ParentGroupID = new Long(source.ParentGroupID);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.ReceiverInfos != null) {
            this.ReceiverInfos = new PolicyGroupReceiverInfo[source.ReceiverInfos.length];
            for (int i = 0; i < source.ReceiverInfos.length; i++) {
                this.ReceiverInfos[i] = new PolicyGroupReceiverInfo(source.ReceiverInfos[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.TotalInstanceCount != null) {
            this.TotalInstanceCount = new Long(source.TotalInstanceCount);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanSetDefault", this.CanSetDefault);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "NoShieldedInstanceCount", this.NoShieldedInstanceCount);
        this.setParamSimple(map, prefix + "ParentGroupID", this.ParentGroupID);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamArrayObj(map, prefix + "ReceiverInfos.", this.ReceiverInfos);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TotalInstanceCount", this.TotalInstanceCount);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);

    }
}

