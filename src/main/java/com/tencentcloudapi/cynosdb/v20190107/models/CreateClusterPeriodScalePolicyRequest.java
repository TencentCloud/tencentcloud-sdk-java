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

public class CreateClusterPeriodScalePolicyRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>实例类型。rw读写，ro-只读</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>当天开始弹性时间。格式是小时:分钟</p>
    */
    @SerializedName("ScaleStartTime")
    @Expose
    private String ScaleStartTime;

    /**
    * <p>当天结束弹性时间。格式是小时:分钟</p>
    */
    @SerializedName("ScaleEndTime")
    @Expose
    private String ScaleEndTime;

    /**
    * <p>策略生效的起始日期时间</p>
    */
    @SerializedName("PolicyStartTime")
    @Expose
    private String PolicyStartTime;

    /**
    * <p>策略生效的截止日期时间</p>
    */
    @SerializedName("PolicyEndTime")
    @Expose
    private String PolicyEndTime;

    /**
    * <p>周期类型。day-天，week-周，month-月。</p>
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * <p>弹性规格下限</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>弹性规格上限</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>周期内的时间列表。针对PeriodType=week， 表示星期几，比如[1,3]表示星期一、星期三。同理，对于PeriodType=month，[1,3,10]表示每月的1、3、10号。PeriodType=day则该字段无效。</p>
    */
    @SerializedName("PeriodConfig")
    @Expose
    private Long [] PeriodConfig;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>实例类型。rw读写，ro-只读</p> 
     * @return InstanceType <p>实例类型。rw读写，ro-只读</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型。rw读写，ro-只读</p>
     * @param InstanceType <p>实例类型。rw读写，ro-只读</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>当天开始弹性时间。格式是小时:分钟</p> 
     * @return ScaleStartTime <p>当天开始弹性时间。格式是小时:分钟</p>
     */
    public String getScaleStartTime() {
        return this.ScaleStartTime;
    }

    /**
     * Set <p>当天开始弹性时间。格式是小时:分钟</p>
     * @param ScaleStartTime <p>当天开始弹性时间。格式是小时:分钟</p>
     */
    public void setScaleStartTime(String ScaleStartTime) {
        this.ScaleStartTime = ScaleStartTime;
    }

    /**
     * Get <p>当天结束弹性时间。格式是小时:分钟</p> 
     * @return ScaleEndTime <p>当天结束弹性时间。格式是小时:分钟</p>
     */
    public String getScaleEndTime() {
        return this.ScaleEndTime;
    }

    /**
     * Set <p>当天结束弹性时间。格式是小时:分钟</p>
     * @param ScaleEndTime <p>当天结束弹性时间。格式是小时:分钟</p>
     */
    public void setScaleEndTime(String ScaleEndTime) {
        this.ScaleEndTime = ScaleEndTime;
    }

    /**
     * Get <p>策略生效的起始日期时间</p> 
     * @return PolicyStartTime <p>策略生效的起始日期时间</p>
     */
    public String getPolicyStartTime() {
        return this.PolicyStartTime;
    }

    /**
     * Set <p>策略生效的起始日期时间</p>
     * @param PolicyStartTime <p>策略生效的起始日期时间</p>
     */
    public void setPolicyStartTime(String PolicyStartTime) {
        this.PolicyStartTime = PolicyStartTime;
    }

    /**
     * Get <p>策略生效的截止日期时间</p> 
     * @return PolicyEndTime <p>策略生效的截止日期时间</p>
     */
    public String getPolicyEndTime() {
        return this.PolicyEndTime;
    }

    /**
     * Set <p>策略生效的截止日期时间</p>
     * @param PolicyEndTime <p>策略生效的截止日期时间</p>
     */
    public void setPolicyEndTime(String PolicyEndTime) {
        this.PolicyEndTime = PolicyEndTime;
    }

    /**
     * Get <p>周期类型。day-天，week-周，month-月。</p> 
     * @return PeriodType <p>周期类型。day-天，week-周，month-月。</p>
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>周期类型。day-天，week-周，month-月。</p>
     * @param PeriodType <p>周期类型。day-天，week-周，month-月。</p>
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get <p>弹性规格下限</p> 
     * @return MinCpu <p>弹性规格下限</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>弹性规格下限</p>
     * @param MinCpu <p>弹性规格下限</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>弹性规格上限</p> 
     * @return MaxCpu <p>弹性规格上限</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>弹性规格上限</p>
     * @param MaxCpu <p>弹性规格上限</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>周期内的时间列表。针对PeriodType=week， 表示星期几，比如[1,3]表示星期一、星期三。同理，对于PeriodType=month，[1,3,10]表示每月的1、3、10号。PeriodType=day则该字段无效。</p> 
     * @return PeriodConfig <p>周期内的时间列表。针对PeriodType=week， 表示星期几，比如[1,3]表示星期一、星期三。同理，对于PeriodType=month，[1,3,10]表示每月的1、3、10号。PeriodType=day则该字段无效。</p>
     */
    public Long [] getPeriodConfig() {
        return this.PeriodConfig;
    }

    /**
     * Set <p>周期内的时间列表。针对PeriodType=week， 表示星期几，比如[1,3]表示星期一、星期三。同理，对于PeriodType=month，[1,3,10]表示每月的1、3、10号。PeriodType=day则该字段无效。</p>
     * @param PeriodConfig <p>周期内的时间列表。针对PeriodType=week， 表示星期几，比如[1,3]表示星期一、星期三。同理，对于PeriodType=month，[1,3,10]表示每月的1、3、10号。PeriodType=day则该字段无效。</p>
     */
    public void setPeriodConfig(Long [] PeriodConfig) {
        this.PeriodConfig = PeriodConfig;
    }

    public CreateClusterPeriodScalePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterPeriodScalePolicyRequest(CreateClusterPeriodScalePolicyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
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
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.PeriodConfig != null) {
            this.PeriodConfig = new Long[source.PeriodConfig.length];
            for (int i = 0; i < source.PeriodConfig.length; i++) {
                this.PeriodConfig[i] = new Long(source.PeriodConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ScaleStartTime", this.ScaleStartTime);
        this.setParamSimple(map, prefix + "ScaleEndTime", this.ScaleEndTime);
        this.setParamSimple(map, prefix + "PolicyStartTime", this.PolicyStartTime);
        this.setParamSimple(map, prefix + "PolicyEndTime", this.PolicyEndTime);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamArraySimple(map, prefix + "PeriodConfig.", this.PeriodConfig);

    }
}

