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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotConfig extends AbstractModel{

    /**
    * 截图频率。可选值1～20秒
    */
    @SerializedName("TimeInterval")
    @Expose
    private Long TimeInterval;

    /**
    * 模板生效的时间段。最多包含5组时间段
    */
    @SerializedName("OperTimeSlot")
    @Expose
    private OperTimeSlot [] OperTimeSlot;

    /**
     * Get 截图频率。可选值1～20秒 
     * @return TimeInterval 截图频率。可选值1～20秒
     */
    public Long getTimeInterval() {
        return this.TimeInterval;
    }

    /**
     * Set 截图频率。可选值1～20秒
     * @param TimeInterval 截图频率。可选值1～20秒
     */
    public void setTimeInterval(Long TimeInterval) {
        this.TimeInterval = TimeInterval;
    }

    /**
     * Get 模板生效的时间段。最多包含5组时间段 
     * @return OperTimeSlot 模板生效的时间段。最多包含5组时间段
     */
    public OperTimeSlot [] getOperTimeSlot() {
        return this.OperTimeSlot;
    }

    /**
     * Set 模板生效的时间段。最多包含5组时间段
     * @param OperTimeSlot 模板生效的时间段。最多包含5组时间段
     */
    public void setOperTimeSlot(OperTimeSlot [] OperTimeSlot) {
        this.OperTimeSlot = OperTimeSlot;
    }

    public SnapshotConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotConfig(SnapshotConfig source) {
        if (source.TimeInterval != null) {
            this.TimeInterval = new Long(source.TimeInterval);
        }
        if (source.OperTimeSlot != null) {
            this.OperTimeSlot = new OperTimeSlot[source.OperTimeSlot.length];
            for (int i = 0; i < source.OperTimeSlot.length; i++) {
                this.OperTimeSlot[i] = new OperTimeSlot(source.OperTimeSlot[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeInterval", this.TimeInterval);
        this.setParamArrayObj(map, prefix + "OperTimeSlot.", this.OperTimeSlot);

    }
}

