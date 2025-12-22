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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsImportInfo extends AbstractModel {

    /**
    * 导入模式。
1. 导入历史数据
2. 导入实时数据
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 开始时间。 单位:秒级时间戳。

    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间。 单位：秒级时间戳。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 最大延迟时间。单位：s

导入模式为 2: 导入实时数据时必填
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * 检查间隔。单位：s

导入模式为 2: 导入实时数据时必填
    */
    @SerializedName("CheckInterval")
    @Expose
    private Long CheckInterval;

    /**
     * Get 导入模式。
1. 导入历史数据
2. 导入实时数据 
     * @return Type 导入模式。
1. 导入历史数据
2. 导入实时数据
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 导入模式。
1. 导入历史数据
2. 导入实时数据
     * @param Type 导入模式。
1. 导入历史数据
2. 导入实时数据
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 开始时间。 单位:秒级时间戳。
 
     * @return StartTime 开始时间。 单位:秒级时间戳。

     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。 单位:秒级时间戳。

     * @param StartTime 开始时间。 单位:秒级时间戳。

     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 单位：秒级时间戳。 
     * @return EndTime 结束时间。 单位：秒级时间戳。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。 单位：秒级时间戳。
     * @param EndTime 结束时间。 单位：秒级时间戳。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 最大延迟时间。单位：s

导入模式为 2: 导入实时数据时必填 
     * @return MaxDelay 最大延迟时间。单位：s

导入模式为 2: 导入实时数据时必填
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set 最大延迟时间。单位：s

导入模式为 2: 导入实时数据时必填
     * @param MaxDelay 最大延迟时间。单位：s

导入模式为 2: 导入实时数据时必填
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get 检查间隔。单位：s

导入模式为 2: 导入实时数据时必填 
     * @return CheckInterval 检查间隔。单位：s

导入模式为 2: 导入实时数据时必填
     */
    public Long getCheckInterval() {
        return this.CheckInterval;
    }

    /**
     * Set 检查间隔。单位：s

导入模式为 2: 导入实时数据时必填
     * @param CheckInterval 检查间隔。单位：s

导入模式为 2: 导入实时数据时必填
     */
    public void setCheckInterval(Long CheckInterval) {
        this.CheckInterval = CheckInterval;
    }

    public EsImportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsImportInfo(EsImportInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.CheckInterval != null) {
            this.CheckInterval = new Long(source.CheckInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "CheckInterval", this.CheckInterval);

    }
}

