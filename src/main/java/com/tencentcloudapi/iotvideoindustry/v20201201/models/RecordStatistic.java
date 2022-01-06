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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordStatistic extends AbstractModel{

    /**
    * 时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 统计结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private RecordStatisticValue Value;

    /**
     * Get 时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 统计结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 统计结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordStatisticValue getValue() {
        return this.Value;
    }

    /**
     * Set 统计结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 统计结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(RecordStatisticValue Value) {
        this.Value = Value;
    }

    public RecordStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordStatistic(RecordStatistic source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Value != null) {
            this.Value = new RecordStatisticValue(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

