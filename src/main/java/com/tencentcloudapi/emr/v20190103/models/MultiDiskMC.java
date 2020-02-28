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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiDiskMC extends AbstractModel{

    /**
    * 该类型云盘个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 云盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
     * Get 该类型云盘个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 该类型云盘个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该类型云盘个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 该类型云盘个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 云盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Volume 云盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 云盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Volume 云盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

