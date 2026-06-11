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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterServerlessScalePlansRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 实例列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 策略类型. PolicyTypePeriodScale - 周期弹性
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private Long PlanId;

    /**
    * 分页数量限制，默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询偏移，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 按计划预期执行时间为条件查询的开始时间点，包含当前时间
    */
    @SerializedName("ExpectedStartTime")
    @Expose
    private String ExpectedStartTime;

    /**
    * 按计划预期执行时间为条件查询的结束时间点，包含当前时间
    */
    @SerializedName("ExpectedEndTime")
    @Expose
    private String ExpectedEndTime;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 实例列表 
     * @return InstanceIds 实例列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例列表
     * @param InstanceIds 实例列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 策略类型. PolicyTypePeriodScale - 周期弹性 
     * @return PolicyType 策略类型. PolicyTypePeriodScale - 周期弹性
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型. PolicyTypePeriodScale - 周期弹性
     * @param PolicyType 策略类型. PolicyTypePeriodScale - 周期弹性
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 计划ID 
     * @return PlanId 计划ID
     */
    public Long getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 计划ID
     * @param PlanId 计划ID
     */
    public void setPlanId(Long PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 分页数量限制，默认10 
     * @return Limit 分页数量限制，默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页数量限制，默认10
     * @param Limit 分页数量限制，默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询偏移，默认0 
     * @return Offset 查询偏移，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移，默认0
     * @param Offset 查询偏移，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 按计划预期执行时间为条件查询的开始时间点，包含当前时间 
     * @return ExpectedStartTime 按计划预期执行时间为条件查询的开始时间点，包含当前时间
     */
    public String getExpectedStartTime() {
        return this.ExpectedStartTime;
    }

    /**
     * Set 按计划预期执行时间为条件查询的开始时间点，包含当前时间
     * @param ExpectedStartTime 按计划预期执行时间为条件查询的开始时间点，包含当前时间
     */
    public void setExpectedStartTime(String ExpectedStartTime) {
        this.ExpectedStartTime = ExpectedStartTime;
    }

    /**
     * Get 按计划预期执行时间为条件查询的结束时间点，包含当前时间 
     * @return ExpectedEndTime 按计划预期执行时间为条件查询的结束时间点，包含当前时间
     */
    public String getExpectedEndTime() {
        return this.ExpectedEndTime;
    }

    /**
     * Set 按计划预期执行时间为条件查询的结束时间点，包含当前时间
     * @param ExpectedEndTime 按计划预期执行时间为条件查询的结束时间点，包含当前时间
     */
    public void setExpectedEndTime(String ExpectedEndTime) {
        this.ExpectedEndTime = ExpectedEndTime;
    }

    public DescribeClusterServerlessScalePlansRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterServerlessScalePlansRequest(DescribeClusterServerlessScalePlansRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PlanId != null) {
            this.PlanId = new Long(source.PlanId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ExpectedStartTime != null) {
            this.ExpectedStartTime = new String(source.ExpectedStartTime);
        }
        if (source.ExpectedEndTime != null) {
            this.ExpectedEndTime = new String(source.ExpectedEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ExpectedStartTime", this.ExpectedStartTime);
        this.setParamSimple(map, prefix + "ExpectedEndTime", this.ExpectedEndTime);

    }
}

