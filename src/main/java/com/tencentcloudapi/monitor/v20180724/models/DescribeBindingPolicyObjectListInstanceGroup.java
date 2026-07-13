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

public class DescribeBindingPolicyObjectListInstanceGroup extends AbstractModel {

    /**
    * <p>实例分组id</p>
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * <p>告警策略类型名称</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>最后编辑uin</p>
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * <p>实例分组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>实例数量</p>
    */
    @SerializedName("InstanceSum")
    @Expose
    private Long InstanceSum;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
    * <p>实例所在的地域集合</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
     * Get <p>实例分组id</p> 
     * @return InstanceGroupId <p>实例分组id</p>
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set <p>实例分组id</p>
     * @param InstanceGroupId <p>实例分组id</p>
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get <p>告警策略类型名称</p> 
     * @return ViewName <p>告警策略类型名称</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>告警策略类型名称</p>
     * @param ViewName <p>告警策略类型名称</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>最后编辑uin</p> 
     * @return LastEditUin <p>最后编辑uin</p>
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set <p>最后编辑uin</p>
     * @param LastEditUin <p>最后编辑uin</p>
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get <p>实例分组名称</p> 
     * @return GroupName <p>实例分组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>实例分组名称</p>
     * @param GroupName <p>实例分组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>实例数量</p> 
     * @return InstanceSum <p>实例数量</p>
     */
    public Long getInstanceSum() {
        return this.InstanceSum;
    }

    /**
     * Set <p>实例数量</p>
     * @param InstanceSum <p>实例数量</p>
     */
    public void setInstanceSum(Long InstanceSum) {
        this.InstanceSum = InstanceSum;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get <p>实例所在的地域集合</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regions <p>实例所在的地域集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>实例所在的地域集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regions <p>实例所在的地域集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    public DescribeBindingPolicyObjectListInstanceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindingPolicyObjectListInstanceGroup(DescribeBindingPolicyObjectListInstanceGroup source) {
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.LastEditUin != null) {
            this.LastEditUin = new String(source.LastEditUin);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InstanceSum != null) {
            this.InstanceSum = new Long(source.InstanceSum);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new Long(source.InsertTime);
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "LastEditUin", this.LastEditUin);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceSum", this.InstanceSum);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);

    }
}

