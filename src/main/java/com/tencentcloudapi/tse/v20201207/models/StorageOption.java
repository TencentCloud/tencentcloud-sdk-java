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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageOption extends AbstractModel{

    /**
    * 存储对象，分为snap和txn两种
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 存储类型，分为三类CLOUD_PREMIUM/CLOUD_SSD/CLOUD_SSD_PLUS，分别对应高性能云硬盘、SSD云硬盘、增强型SSD云硬盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 存储容量，[50, 3200]的范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
     * Get 存储对象，分为snap和txn两种
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 存储对象，分为snap和txn两种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 存储对象，分为snap和txn两种
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 存储对象，分为snap和txn两种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 存储类型，分为三类CLOUD_PREMIUM/CLOUD_SSD/CLOUD_SSD_PLUS，分别对应高性能云硬盘、SSD云硬盘、增强型SSD云硬盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 存储类型，分为三类CLOUD_PREMIUM/CLOUD_SSD/CLOUD_SSD_PLUS，分别对应高性能云硬盘、SSD云硬盘、增强型SSD云硬盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 存储类型，分为三类CLOUD_PREMIUM/CLOUD_SSD/CLOUD_SSD_PLUS，分别对应高性能云硬盘、SSD云硬盘、增强型SSD云硬盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 存储类型，分为三类CLOUD_PREMIUM/CLOUD_SSD/CLOUD_SSD_PLUS，分别对应高性能云硬盘、SSD云硬盘、增强型SSD云硬盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 存储容量，[50, 3200]的范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Capacity 存储容量，[50, 3200]的范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 存储容量，[50, 3200]的范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param Capacity 存储容量，[50, 3200]的范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    public StorageOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageOption(StorageOption source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);

    }
}

