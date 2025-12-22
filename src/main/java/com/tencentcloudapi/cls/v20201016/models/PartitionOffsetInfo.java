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

public class PartitionOffsetInfo extends AbstractModel {

    /**
    * 分区id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionId")
    @Expose
    private Long PartitionId;

    /**
    * offset点位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 分区id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionId 分区id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set 分区id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionId 分区id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionId(Long PartitionId) {
        this.PartitionId = PartitionId;
    }

    /**
     * Get offset点位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset offset点位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set offset点位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset offset点位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public PartitionOffsetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionOffsetInfo(PartitionOffsetInfo source) {
        if (source.PartitionId != null) {
            this.PartitionId = new Long(source.PartitionId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

