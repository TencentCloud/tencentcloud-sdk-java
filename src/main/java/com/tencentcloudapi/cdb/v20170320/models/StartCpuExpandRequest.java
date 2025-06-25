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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartCpuExpandRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 扩容类型，支持自动扩容和自定义扩容。
说明：1. auto 表示自动扩容。2. manual 表示自定义扩容，扩容时间为立即生效。3. timeInterval 表示自定义扩容，扩容时间为按时间段。4. period 表示自定义扩容，扩容时间为按周期。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 自定义扩容时，扩容的 CPU 核心数。
说明：1. Type 为 manual、timeInterval、period 时必传。2. 扩容的 CPU 核心数上限为当前实例 CPU 核心数，比如8核16G最大可手动扩容的 CPU 核心数为8，即范围为1 - 8。
    */
    @SerializedName("ExpandCpu")
    @Expose
    private Long ExpandCpu;

    /**
    * 自动扩容策略。Type 为 auto 时必传。
    */
    @SerializedName("AutoStrategy")
    @Expose
    private AutoStrategy AutoStrategy;

    /**
    * 按时间段扩容策略。
说明：当 Type 为 timeInterval 时，TimeIntervalStrategy 必填。
    */
    @SerializedName("TimeIntervalStrategy")
    @Expose
    private TimeIntervalStrategy TimeIntervalStrategy;

    /**
    * 按周期扩容策略。
说明：当 Type 为 period 时，PeriodStrategy 必填。
    */
    @SerializedName("PeriodStrategy")
    @Expose
    private PeriodStrategy PeriodStrategy;

    /**
     * Get 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 扩容类型，支持自动扩容和自定义扩容。
说明：1. auto 表示自动扩容。2. manual 表示自定义扩容，扩容时间为立即生效。3. timeInterval 表示自定义扩容，扩容时间为按时间段。4. period 表示自定义扩容，扩容时间为按周期。 
     * @return Type 扩容类型，支持自动扩容和自定义扩容。
说明：1. auto 表示自动扩容。2. manual 表示自定义扩容，扩容时间为立即生效。3. timeInterval 表示自定义扩容，扩容时间为按时间段。4. period 表示自定义扩容，扩容时间为按周期。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 扩容类型，支持自动扩容和自定义扩容。
说明：1. auto 表示自动扩容。2. manual 表示自定义扩容，扩容时间为立即生效。3. timeInterval 表示自定义扩容，扩容时间为按时间段。4. period 表示自定义扩容，扩容时间为按周期。
     * @param Type 扩容类型，支持自动扩容和自定义扩容。
说明：1. auto 表示自动扩容。2. manual 表示自定义扩容，扩容时间为立即生效。3. timeInterval 表示自定义扩容，扩容时间为按时间段。4. period 表示自定义扩容，扩容时间为按周期。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 自定义扩容时，扩容的 CPU 核心数。
说明：1. Type 为 manual、timeInterval、period 时必传。2. 扩容的 CPU 核心数上限为当前实例 CPU 核心数，比如8核16G最大可手动扩容的 CPU 核心数为8，即范围为1 - 8。 
     * @return ExpandCpu 自定义扩容时，扩容的 CPU 核心数。
说明：1. Type 为 manual、timeInterval、period 时必传。2. 扩容的 CPU 核心数上限为当前实例 CPU 核心数，比如8核16G最大可手动扩容的 CPU 核心数为8，即范围为1 - 8。
     */
    public Long getExpandCpu() {
        return this.ExpandCpu;
    }

    /**
     * Set 自定义扩容时，扩容的 CPU 核心数。
说明：1. Type 为 manual、timeInterval、period 时必传。2. 扩容的 CPU 核心数上限为当前实例 CPU 核心数，比如8核16G最大可手动扩容的 CPU 核心数为8，即范围为1 - 8。
     * @param ExpandCpu 自定义扩容时，扩容的 CPU 核心数。
说明：1. Type 为 manual、timeInterval、period 时必传。2. 扩容的 CPU 核心数上限为当前实例 CPU 核心数，比如8核16G最大可手动扩容的 CPU 核心数为8，即范围为1 - 8。
     */
    public void setExpandCpu(Long ExpandCpu) {
        this.ExpandCpu = ExpandCpu;
    }

    /**
     * Get 自动扩容策略。Type 为 auto 时必传。 
     * @return AutoStrategy 自动扩容策略。Type 为 auto 时必传。
     */
    public AutoStrategy getAutoStrategy() {
        return this.AutoStrategy;
    }

    /**
     * Set 自动扩容策略。Type 为 auto 时必传。
     * @param AutoStrategy 自动扩容策略。Type 为 auto 时必传。
     */
    public void setAutoStrategy(AutoStrategy AutoStrategy) {
        this.AutoStrategy = AutoStrategy;
    }

    /**
     * Get 按时间段扩容策略。
说明：当 Type 为 timeInterval 时，TimeIntervalStrategy 必填。 
     * @return TimeIntervalStrategy 按时间段扩容策略。
说明：当 Type 为 timeInterval 时，TimeIntervalStrategy 必填。
     */
    public TimeIntervalStrategy getTimeIntervalStrategy() {
        return this.TimeIntervalStrategy;
    }

    /**
     * Set 按时间段扩容策略。
说明：当 Type 为 timeInterval 时，TimeIntervalStrategy 必填。
     * @param TimeIntervalStrategy 按时间段扩容策略。
说明：当 Type 为 timeInterval 时，TimeIntervalStrategy 必填。
     */
    public void setTimeIntervalStrategy(TimeIntervalStrategy TimeIntervalStrategy) {
        this.TimeIntervalStrategy = TimeIntervalStrategy;
    }

    /**
     * Get 按周期扩容策略。
说明：当 Type 为 period 时，PeriodStrategy 必填。 
     * @return PeriodStrategy 按周期扩容策略。
说明：当 Type 为 period 时，PeriodStrategy 必填。
     */
    public PeriodStrategy getPeriodStrategy() {
        return this.PeriodStrategy;
    }

    /**
     * Set 按周期扩容策略。
说明：当 Type 为 period 时，PeriodStrategy 必填。
     * @param PeriodStrategy 按周期扩容策略。
说明：当 Type 为 period 时，PeriodStrategy 必填。
     */
    public void setPeriodStrategy(PeriodStrategy PeriodStrategy) {
        this.PeriodStrategy = PeriodStrategy;
    }

    public StartCpuExpandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartCpuExpandRequest(StartCpuExpandRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExpandCpu != null) {
            this.ExpandCpu = new Long(source.ExpandCpu);
        }
        if (source.AutoStrategy != null) {
            this.AutoStrategy = new AutoStrategy(source.AutoStrategy);
        }
        if (source.TimeIntervalStrategy != null) {
            this.TimeIntervalStrategy = new TimeIntervalStrategy(source.TimeIntervalStrategy);
        }
        if (source.PeriodStrategy != null) {
            this.PeriodStrategy = new PeriodStrategy(source.PeriodStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpandCpu", this.ExpandCpu);
        this.setParamObj(map, prefix + "AutoStrategy.", this.AutoStrategy);
        this.setParamObj(map, prefix + "TimeIntervalStrategy.", this.TimeIntervalStrategy);
        this.setParamObj(map, prefix + "PeriodStrategy.", this.PeriodStrategy);

    }
}

