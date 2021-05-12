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

public class Point extends AbstractModel{

    /**
    * 该监控数据点生成的时间点
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 监控数据点的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get 该监控数据点生成的时间点 
     * @return Timestamp 该监控数据点生成的时间点
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 该监控数据点生成的时间点
     * @param Timestamp 该监控数据点生成的时间点
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 监控数据点的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 监控数据点的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 监控数据点的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 监控数据点的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public Point() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Point(Point source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

