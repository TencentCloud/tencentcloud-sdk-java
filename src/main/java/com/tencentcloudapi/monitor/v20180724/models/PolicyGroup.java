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

public class PolicyGroup extends AbstractModel {

    /**
    * <p>是否可设为默认告警策略</p>
    */
    @SerializedName("CanSetDefault")
    @Expose
    private Boolean CanSetDefault;

    /**
    * <p>告警策略组ID</p>
    */
    @SerializedName("GroupID")
    @Expose
    private Long GroupID;

    /**
    * <p>告警策略组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * <p>是否为默认告警策略</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * <p>告警策略启用状态</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>最后修改人UIN</p>
    */
    @SerializedName("LastEditUin")
    @Expose
    private Long LastEditUin;

    /**
    * <p>未屏蔽的实例数</p>
    */
    @SerializedName("NoShieldedInstanceCount")
    @Expose
    private Long NoShieldedInstanceCount;

    /**
    * <p>父策略组ID</p>
    */
    @SerializedName("ParentGroupID")
    @Expose
    private Long ParentGroupID;

    /**
    * <p>所属项目ID</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>告警接收对象信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverInfos")
    @Expose
    private PolicyGroupReceiverInfo [] ReceiverInfos;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>总绑定实例数</p>
    */
    @SerializedName("TotalInstanceCount")
    @Expose
    private Long TotalInstanceCount;

    /**
    * <p>视图</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>是否为与关系规则</p>
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
     * Get <p>是否可设为默认告警策略</p> 
     * @return CanSetDefault <p>是否可设为默认告警策略</p>
     */
    public Boolean getCanSetDefault() {
        return this.CanSetDefault;
    }

    /**
     * Set <p>是否可设为默认告警策略</p>
     * @param CanSetDefault <p>是否可设为默认告警策略</p>
     */
    public void setCanSetDefault(Boolean CanSetDefault) {
        this.CanSetDefault = CanSetDefault;
    }

    /**
     * Get <p>告警策略组ID</p> 
     * @return GroupID <p>告警策略组ID</p>
     */
    public Long getGroupID() {
        return this.GroupID;
    }

    /**
     * Set <p>告警策略组ID</p>
     * @param GroupID <p>告警策略组ID</p>
     */
    public void setGroupID(Long GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get <p>告警策略组名称</p> 
     * @return GroupName <p>告警策略组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>告警策略组名称</p>
     * @param GroupName <p>告警策略组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>创建时间</p> 
     * @return InsertTime <p>创建时间</p>
     */
    public Long getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param InsertTime <p>创建时间</p>
     */
    public void setInsertTime(Long InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>是否为默认告警策略</p> 
     * @return IsDefault <p>是否为默认告警策略</p>
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否为默认告警策略</p>
     * @param IsDefault <p>是否为默认告警策略</p>
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>告警策略启用状态</p> 
     * @return Enable <p>告警策略启用状态</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>告警策略启用状态</p>
     * @param Enable <p>告警策略启用状态</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>最后修改人UIN</p> 
     * @return LastEditUin <p>最后修改人UIN</p>
     */
    public Long getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set <p>最后修改人UIN</p>
     * @param LastEditUin <p>最后修改人UIN</p>
     */
    public void setLastEditUin(Long LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get <p>未屏蔽的实例数</p> 
     * @return NoShieldedInstanceCount <p>未屏蔽的实例数</p>
     */
    public Long getNoShieldedInstanceCount() {
        return this.NoShieldedInstanceCount;
    }

    /**
     * Set <p>未屏蔽的实例数</p>
     * @param NoShieldedInstanceCount <p>未屏蔽的实例数</p>
     */
    public void setNoShieldedInstanceCount(Long NoShieldedInstanceCount) {
        this.NoShieldedInstanceCount = NoShieldedInstanceCount;
    }

    /**
     * Get <p>父策略组ID</p> 
     * @return ParentGroupID <p>父策略组ID</p>
     */
    public Long getParentGroupID() {
        return this.ParentGroupID;
    }

    /**
     * Set <p>父策略组ID</p>
     * @param ParentGroupID <p>父策略组ID</p>
     */
    public void setParentGroupID(Long ParentGroupID) {
        this.ParentGroupID = ParentGroupID;
    }

    /**
     * Get <p>所属项目ID</p> 
     * @return ProjectID <p>所属项目ID</p>
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set <p>所属项目ID</p>
     * @param ProjectID <p>所属项目ID</p>
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get <p>告警接收对象信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverInfos <p>告警接收对象信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PolicyGroupReceiverInfo [] getReceiverInfos() {
        return this.ReceiverInfos;
    }

    /**
     * Set <p>告警接收对象信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverInfos <p>告警接收对象信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverInfos(PolicyGroupReceiverInfo [] ReceiverInfos) {
        this.ReceiverInfos = ReceiverInfos;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Remark <p>备注信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
     * @param Remark <p>备注信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>修改时间</p> 
     * @return UpdateTime <p>修改时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param UpdateTime <p>修改时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>总绑定实例数</p> 
     * @return TotalInstanceCount <p>总绑定实例数</p>
     */
    public Long getTotalInstanceCount() {
        return this.TotalInstanceCount;
    }

    /**
     * Set <p>总绑定实例数</p>
     * @param TotalInstanceCount <p>总绑定实例数</p>
     */
    public void setTotalInstanceCount(Long TotalInstanceCount) {
        this.TotalInstanceCount = TotalInstanceCount;
    }

    /**
     * Get <p>视图</p> 
     * @return ViewName <p>视图</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>视图</p>
     * @param ViewName <p>视图</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>是否为与关系规则</p> 
     * @return IsUnionRule <p>是否为与关系规则</p>
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set <p>是否为与关系规则</p>
     * @param IsUnionRule <p>是否为与关系规则</p>
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

