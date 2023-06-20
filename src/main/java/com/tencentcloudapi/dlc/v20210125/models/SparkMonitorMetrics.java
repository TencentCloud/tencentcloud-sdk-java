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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkMonitorMetrics extends AbstractModel{

    /**
    * shuffle写溢出到COS数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShuffleWriteBytesCos")
    @Expose
    private Long ShuffleWriteBytesCos;

    /**
    * shuffle写数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShuffleWriteBytesTotal")
    @Expose
    private Long ShuffleWriteBytesTotal;

    /**
     * Get shuffle写溢出到COS数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShuffleWriteBytesCos shuffle写溢出到COS数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShuffleWriteBytesCos() {
        return this.ShuffleWriteBytesCos;
    }

    /**
     * Set shuffle写溢出到COS数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShuffleWriteBytesCos shuffle写溢出到COS数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShuffleWriteBytesCos(Long ShuffleWriteBytesCos) {
        this.ShuffleWriteBytesCos = ShuffleWriteBytesCos;
    }

    /**
     * Get shuffle写数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShuffleWriteBytesTotal shuffle写数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShuffleWriteBytesTotal() {
        return this.ShuffleWriteBytesTotal;
    }

    /**
     * Set shuffle写数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShuffleWriteBytesTotal shuffle写数据量，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShuffleWriteBytesTotal(Long ShuffleWriteBytesTotal) {
        this.ShuffleWriteBytesTotal = ShuffleWriteBytesTotal;
    }

    public SparkMonitorMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkMonitorMetrics(SparkMonitorMetrics source) {
        if (source.ShuffleWriteBytesCos != null) {
            this.ShuffleWriteBytesCos = new Long(source.ShuffleWriteBytesCos);
        }
        if (source.ShuffleWriteBytesTotal != null) {
            this.ShuffleWriteBytesTotal = new Long(source.ShuffleWriteBytesTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShuffleWriteBytesCos", this.ShuffleWriteBytesCos);
        this.setParamSimple(map, prefix + "ShuffleWriteBytesTotal", this.ShuffleWriteBytesTotal);

    }
}

