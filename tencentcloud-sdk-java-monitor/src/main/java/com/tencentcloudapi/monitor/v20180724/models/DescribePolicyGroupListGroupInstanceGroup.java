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

public class DescribePolicyGroupListGroupInstanceGroup extends AbstractModel{

    /**
    * 实例分组名称id
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * 策略类型视图名称
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 最近编辑的用户uin
    */
    @SerializedName("LastEditUin")
    @Expose
    private String LastEditUin;

    /**
    * 实例分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 实例数量
    */
    @SerializedName("InstanceSum")
    @Expose
    private Long InstanceSum;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 创建时间
    */
    @SerializedName("InsertTime")
    @Expose
    private Long InsertTime;

    /**
     * Get 实例分组名称id 
     * @return InstanceGroupId 实例分组名称id
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例分组名称id
     * @param InstanceGroupId 实例分组名称id
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 策略类型视图名称 
     * @return ViewName 策略类型视图名称
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 策略类型视图名称
     * @param ViewName 策略类型视图名称
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 最近编辑的用户uin 
     * @return LastEditUin 最近编辑的用户uin
     */
    public String getLastEditUin() {
        return this.LastEditUin;
    }

    /**
     * Set 最近编辑的用户uin
     * @param LastEditUin 最近编辑的用户uin
     */
    public void setLastEditUin(String LastEditUin) {
        this.LastEditUin = LastEditUin;
    }

    /**
     * Get 实例分组名称 
     * @return GroupName 实例分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 实例分组名称
     * @param GroupName 实例分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 实例数量 
     * @return InstanceSum 实例数量
     */
    public Long getInstanceSum() {
        return this.InstanceSum;
    }

    /**
     * Set 实例数量
     * @param InstanceSum 实例数量
     */
    public void setInstanceSum(Long InstanceSum) {
        this.InstanceSum = InstanceSum;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    }
}

