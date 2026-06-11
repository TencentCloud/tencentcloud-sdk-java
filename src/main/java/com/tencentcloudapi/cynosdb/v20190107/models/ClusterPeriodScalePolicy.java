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

public class ClusterPeriodScalePolicy extends AbstractModel {

    /**
    * <p>策略ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>实例类型。rw-读写类型，ro-只读类型。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>弹性下限, 后续废弃, 请使用MinCcu</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>弹性上限,后续废弃，请使用MaxCcu</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>弹性开始时间</p>
    */
    @SerializedName("ScaleStartTime")
    @Expose
    private String ScaleStartTime;

    /**
    * <p>弹性结束时间</p>
    */
    @SerializedName("ScaleEndTime")
    @Expose
    private String ScaleEndTime;

    /**
    * <p>策略有效起始日期时间</p>
    */
    @SerializedName("PolicyStartTime")
    @Expose
    private String PolicyStartTime;

    /**
    * <p>策略有效截止日期时间</p>
    */
    @SerializedName("PolicyEndTime")
    @Expose
    private String PolicyEndTime;

    /**
    * <p>周期类型。day-天， week-星期，month-月</p>
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * <p>在周期内的时间配置。对于week，表示星期几；对于month，表示几号。对于day，此参数不生效。</p>
    */
    @SerializedName("PeriodConfig")
    @Expose
    private Long [] PeriodConfig;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>策略状态。normal-正常，expired-过期, deleted-删除</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>策略ID</p> 
     * @return PolicyId <p>策略ID</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>策略ID</p>
     * @param PolicyId <p>策略ID</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>实例类型。rw-读写类型，ro-只读类型。</p> 
     * @return InstanceType <p>实例类型。rw-读写类型，ro-只读类型。</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型。rw-读写类型，ro-只读类型。</p>
     * @param InstanceType <p>实例类型。rw-读写类型，ro-只读类型。</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>弹性下限, 后续废弃, 请使用MinCcu</p> 
     * @return MinCpu <p>弹性下限, 后续废弃, 请使用MinCcu</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>弹性下限, 后续废弃, 请使用MinCcu</p>
     * @param MinCpu <p>弹性下限, 后续废弃, 请使用MinCcu</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>弹性上限,后续废弃，请使用MaxCcu</p> 
     * @return MaxCpu <p>弹性上限,后续废弃，请使用MaxCcu</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>弹性上限,后续废弃，请使用MaxCcu</p>
     * @param MaxCpu <p>弹性上限,后续废弃，请使用MaxCcu</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>弹性开始时间</p> 
     * @return ScaleStartTime <p>弹性开始时间</p>
     */
    public String getScaleStartTime() {
        return this.ScaleStartTime;
    }

    /**
     * Set <p>弹性开始时间</p>
     * @param ScaleStartTime <p>弹性开始时间</p>
     */
    public void setScaleStartTime(String ScaleStartTime) {
        this.ScaleStartTime = ScaleStartTime;
    }

    /**
     * Get <p>弹性结束时间</p> 
     * @return ScaleEndTime <p>弹性结束时间</p>
     */
    public String getScaleEndTime() {
        return this.ScaleEndTime;
    }

    /**
     * Set <p>弹性结束时间</p>
     * @param ScaleEndTime <p>弹性结束时间</p>
     */
    public void setScaleEndTime(String ScaleEndTime) {
        this.ScaleEndTime = ScaleEndTime;
    }

    /**
     * Get <p>策略有效起始日期时间</p> 
     * @return PolicyStartTime <p>策略有效起始日期时间</p>
     */
    public String getPolicyStartTime() {
        return this.PolicyStartTime;
    }

    /**
     * Set <p>策略有效起始日期时间</p>
     * @param PolicyStartTime <p>策略有效起始日期时间</p>
     */
    public void setPolicyStartTime(String PolicyStartTime) {
        this.PolicyStartTime = PolicyStartTime;
    }

    /**
     * Get <p>策略有效截止日期时间</p> 
     * @return PolicyEndTime <p>策略有效截止日期时间</p>
     */
    public String getPolicyEndTime() {
        return this.PolicyEndTime;
    }

    /**
     * Set <p>策略有效截止日期时间</p>
     * @param PolicyEndTime <p>策略有效截止日期时间</p>
     */
    public void setPolicyEndTime(String PolicyEndTime) {
        this.PolicyEndTime = PolicyEndTime;
    }

    /**
     * Get <p>周期类型。day-天， week-星期，month-月</p> 
     * @return PeriodType <p>周期类型。day-天， week-星期，month-月</p>
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>周期类型。day-天， week-星期，month-月</p>
     * @param PeriodType <p>周期类型。day-天， week-星期，month-月</p>
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get <p>在周期内的时间配置。对于week，表示星期几；对于month，表示几号。对于day，此参数不生效。</p> 
     * @return PeriodConfig <p>在周期内的时间配置。对于week，表示星期几；对于month，表示几号。对于day，此参数不生效。</p>
     */
    public Long [] getPeriodConfig() {
        return this.PeriodConfig;
    }

    /**
     * Set <p>在周期内的时间配置。对于week，表示星期几；对于month，表示几号。对于day，此参数不生效。</p>
     * @param PeriodConfig <p>在周期内的时间配置。对于week，表示星期几；对于month，表示几号。对于day，此参数不生效。</p>
     */
    public void setPeriodConfig(Long [] PeriodConfig) {
        this.PeriodConfig = PeriodConfig;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>策略状态。normal-正常，expired-过期, deleted-删除</p> 
     * @return Status <p>策略状态。normal-正常，expired-过期, deleted-删除</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>策略状态。normal-正常，expired-过期, deleted-删除</p>
     * @param Status <p>策略状态。normal-正常，expired-过期, deleted-删除</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ClusterPeriodScalePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterPeriodScalePolicy(ClusterPeriodScalePolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.ScaleStartTime != null) {
            this.ScaleStartTime = new String(source.ScaleStartTime);
        }
        if (source.ScaleEndTime != null) {
            this.ScaleEndTime = new String(source.ScaleEndTime);
        }
        if (source.PolicyStartTime != null) {
            this.PolicyStartTime = new String(source.PolicyStartTime);
        }
        if (source.PolicyEndTime != null) {
            this.PolicyEndTime = new String(source.PolicyEndTime);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.PeriodConfig != null) {
            this.PeriodConfig = new Long[source.PeriodConfig.length];
            for (int i = 0; i < source.PeriodConfig.length; i++) {
                this.PeriodConfig[i] = new Long(source.PeriodConfig[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "ScaleStartTime", this.ScaleStartTime);
        this.setParamSimple(map, prefix + "ScaleEndTime", this.ScaleEndTime);
        this.setParamSimple(map, prefix + "PolicyStartTime", this.PolicyStartTime);
        this.setParamSimple(map, prefix + "PolicyEndTime", this.PolicyEndTime);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamArraySimple(map, prefix + "PeriodConfig.", this.PeriodConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

