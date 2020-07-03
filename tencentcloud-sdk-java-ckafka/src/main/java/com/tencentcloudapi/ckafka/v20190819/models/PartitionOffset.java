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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartitionOffset extends AbstractModel{

    /**
    * Partition,例如"0"或"1"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * Offset,例如100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Partition,例如"0"或"1"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partition Partition,例如"0"或"1"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition,例如"0"或"1"
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partition Partition,例如"0"或"1"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Offset,例如100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset Offset,例如100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset,例如100
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset Offset,例如100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

