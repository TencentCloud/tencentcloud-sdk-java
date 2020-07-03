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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticsDataInfo extends AbstractModel{

    /**
    * 对应的时间点
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 统计数据值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private Float Data;

    /**
     * Get 对应的时间点 
     * @return Time 对应的时间点
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 对应的时间点
     * @param Time 对应的时间点
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 统计数据值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 统计数据值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getData() {
        return this.Data;
    }

    /**
     * Set 统计数据值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 统计数据值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(Float Data) {
        this.Data = Data;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

