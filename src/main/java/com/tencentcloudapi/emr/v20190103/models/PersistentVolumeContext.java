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

public class PersistentVolumeContext extends AbstractModel{

    /**
    * 磁盘大小，单位为GB。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 磁盘类型。CLOUD_PREMIUM;CLOUD_SSD
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskNum")
    @Expose
    private Long DiskNum;

    /**
     * Get 磁盘大小，单位为GB。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 磁盘大小，单位为GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘大小，单位为GB。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 磁盘大小，单位为GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 磁盘类型。CLOUD_PREMIUM;CLOUD_SSD
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 磁盘类型。CLOUD_PREMIUM;CLOUD_SSD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型。CLOUD_PREMIUM;CLOUD_SSD
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 磁盘类型。CLOUD_PREMIUM;CLOUD_SSD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskNum 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskNum() {
        return this.DiskNum;
    }

    /**
     * Set 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskNum 磁盘数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskNum(Long DiskNum) {
        this.DiskNum = DiskNum;
    }

    public PersistentVolumeContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersistentVolumeContext(PersistentVolumeContext source) {
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskNum != null) {
            this.DiskNum = new Long(source.DiskNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskNum", this.DiskNum);

    }
}

