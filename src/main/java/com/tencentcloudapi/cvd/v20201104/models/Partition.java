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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Partition extends AbstractModel {

    /**
    * 磁盘名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 总容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Float Total;

    /**
    * 使用量,39.31%
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Usage")
    @Expose
    private Float Usage;

    /**
     * Get 磁盘名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 磁盘名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 磁盘名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 磁盘名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 总容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotal() {
        return this.Total;
    }

    /**
     * Set 总容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Float Total) {
        this.Total = Total;
    }

    /**
     * Get 使用量,39.31%
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Usage 使用量,39.31%
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUsage() {
        return this.Usage;
    }

    /**
     * Set 使用量,39.31%
注意：此字段可能返回 null，表示取不到有效值。
     * @param Usage 使用量,39.31%
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsage(Float Usage) {
        this.Usage = Usage;
    }

    public Partition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Partition(Partition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Total != null) {
            this.Total = new Float(source.Total);
        }
        if (source.Usage != null) {
            this.Usage = new Float(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

