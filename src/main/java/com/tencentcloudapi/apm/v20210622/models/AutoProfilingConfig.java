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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoProfilingConfig extends AbstractModel {

    /**
    * 自动CPU剖析任务开关
    */
    @SerializedName("CpuProfilingEnable")
    @Expose
    private Boolean CpuProfilingEnable;

    /**
    * 自动内存剖析任务开关
    */
    @SerializedName("MemoryProfilingEnable")
    @Expose
    private Boolean MemoryProfilingEnable;

    /**
    * 自动CPU剖析任务阈值
    */
    @SerializedName("CpuProfilingThreshold")
    @Expose
    private Long CpuProfilingThreshold;

    /**
    * 自动内存剖析任务阈值
    */
    @SerializedName("MemoryProfilingThreshold")
    @Expose
    private Long MemoryProfilingThreshold;

    /**
    * CPU自动剖析任务时长
    */
    @SerializedName("CpuProfilingDuration")
    @Expose
    private Long CpuProfilingDuration;

    /**
    * 内存自动剖析任务时长
    */
    @SerializedName("MemoryProfilingDuration")
    @Expose
    private Long MemoryProfilingDuration;

    /**
     * Get 自动CPU剖析任务开关 
     * @return CpuProfilingEnable 自动CPU剖析任务开关
     */
    public Boolean getCpuProfilingEnable() {
        return this.CpuProfilingEnable;
    }

    /**
     * Set 自动CPU剖析任务开关
     * @param CpuProfilingEnable 自动CPU剖析任务开关
     */
    public void setCpuProfilingEnable(Boolean CpuProfilingEnable) {
        this.CpuProfilingEnable = CpuProfilingEnable;
    }

    /**
     * Get 自动内存剖析任务开关 
     * @return MemoryProfilingEnable 自动内存剖析任务开关
     */
    public Boolean getMemoryProfilingEnable() {
        return this.MemoryProfilingEnable;
    }

    /**
     * Set 自动内存剖析任务开关
     * @param MemoryProfilingEnable 自动内存剖析任务开关
     */
    public void setMemoryProfilingEnable(Boolean MemoryProfilingEnable) {
        this.MemoryProfilingEnable = MemoryProfilingEnable;
    }

    /**
     * Get 自动CPU剖析任务阈值 
     * @return CpuProfilingThreshold 自动CPU剖析任务阈值
     */
    public Long getCpuProfilingThreshold() {
        return this.CpuProfilingThreshold;
    }

    /**
     * Set 自动CPU剖析任务阈值
     * @param CpuProfilingThreshold 自动CPU剖析任务阈值
     */
    public void setCpuProfilingThreshold(Long CpuProfilingThreshold) {
        this.CpuProfilingThreshold = CpuProfilingThreshold;
    }

    /**
     * Get 自动内存剖析任务阈值 
     * @return MemoryProfilingThreshold 自动内存剖析任务阈值
     */
    public Long getMemoryProfilingThreshold() {
        return this.MemoryProfilingThreshold;
    }

    /**
     * Set 自动内存剖析任务阈值
     * @param MemoryProfilingThreshold 自动内存剖析任务阈值
     */
    public void setMemoryProfilingThreshold(Long MemoryProfilingThreshold) {
        this.MemoryProfilingThreshold = MemoryProfilingThreshold;
    }

    /**
     * Get CPU自动剖析任务时长 
     * @return CpuProfilingDuration CPU自动剖析任务时长
     */
    public Long getCpuProfilingDuration() {
        return this.CpuProfilingDuration;
    }

    /**
     * Set CPU自动剖析任务时长
     * @param CpuProfilingDuration CPU自动剖析任务时长
     */
    public void setCpuProfilingDuration(Long CpuProfilingDuration) {
        this.CpuProfilingDuration = CpuProfilingDuration;
    }

    /**
     * Get 内存自动剖析任务时长 
     * @return MemoryProfilingDuration 内存自动剖析任务时长
     */
    public Long getMemoryProfilingDuration() {
        return this.MemoryProfilingDuration;
    }

    /**
     * Set 内存自动剖析任务时长
     * @param MemoryProfilingDuration 内存自动剖析任务时长
     */
    public void setMemoryProfilingDuration(Long MemoryProfilingDuration) {
        this.MemoryProfilingDuration = MemoryProfilingDuration;
    }

    public AutoProfilingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoProfilingConfig(AutoProfilingConfig source) {
        if (source.CpuProfilingEnable != null) {
            this.CpuProfilingEnable = new Boolean(source.CpuProfilingEnable);
        }
        if (source.MemoryProfilingEnable != null) {
            this.MemoryProfilingEnable = new Boolean(source.MemoryProfilingEnable);
        }
        if (source.CpuProfilingThreshold != null) {
            this.CpuProfilingThreshold = new Long(source.CpuProfilingThreshold);
        }
        if (source.MemoryProfilingThreshold != null) {
            this.MemoryProfilingThreshold = new Long(source.MemoryProfilingThreshold);
        }
        if (source.CpuProfilingDuration != null) {
            this.CpuProfilingDuration = new Long(source.CpuProfilingDuration);
        }
        if (source.MemoryProfilingDuration != null) {
            this.MemoryProfilingDuration = new Long(source.MemoryProfilingDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuProfilingEnable", this.CpuProfilingEnable);
        this.setParamSimple(map, prefix + "MemoryProfilingEnable", this.MemoryProfilingEnable);
        this.setParamSimple(map, prefix + "CpuProfilingThreshold", this.CpuProfilingThreshold);
        this.setParamSimple(map, prefix + "MemoryProfilingThreshold", this.MemoryProfilingThreshold);
        this.setParamSimple(map, prefix + "CpuProfilingDuration", this.CpuProfilingDuration);
        this.setParamSimple(map, prefix + "MemoryProfilingDuration", this.MemoryProfilingDuration);

    }
}

