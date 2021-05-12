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

public class PodVolume extends AbstractModel{

    /**
    * 存储类型，可为"pvc"，"hostpath"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeType")
    @Expose
    private String VolumeType;

    /**
    * 当VolumeType为"pvc"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PVCVolume")
    @Expose
    private PersistentVolumeContext PVCVolume;

    /**
    * 当VolumeType为"hostpath"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostVolume")
    @Expose
    private HostVolumeContext HostVolume;

    /**
     * Get 存储类型，可为"pvc"，"hostpath"。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeType 存储类型，可为"pvc"，"hostpath"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVolumeType() {
        return this.VolumeType;
    }

    /**
     * Set 存储类型，可为"pvc"，"hostpath"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeType 存储类型，可为"pvc"，"hostpath"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeType(String VolumeType) {
        this.VolumeType = VolumeType;
    }

    /**
     * Get 当VolumeType为"pvc"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PVCVolume 当VolumeType为"pvc"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PersistentVolumeContext getPVCVolume() {
        return this.PVCVolume;
    }

    /**
     * Set 当VolumeType为"pvc"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PVCVolume 当VolumeType为"pvc"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPVCVolume(PersistentVolumeContext PVCVolume) {
        this.PVCVolume = PVCVolume;
    }

    /**
     * Get 当VolumeType为"hostpath"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostVolume 当VolumeType为"hostpath"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostVolumeContext getHostVolume() {
        return this.HostVolume;
    }

    /**
     * Set 当VolumeType为"hostpath"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostVolume 当VolumeType为"hostpath"时，该字段生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostVolume(HostVolumeContext HostVolume) {
        this.HostVolume = HostVolume;
    }

    public PodVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodVolume(PodVolume source) {
        if (source.VolumeType != null) {
            this.VolumeType = new String(source.VolumeType);
        }
        if (source.PVCVolume != null) {
            this.PVCVolume = new PersistentVolumeContext(source.PVCVolume);
        }
        if (source.HostVolume != null) {
            this.HostVolume = new HostVolumeContext(source.HostVolume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeType", this.VolumeType);
        this.setParamObj(map, prefix + "PVCVolume.", this.PVCVolume);
        this.setParamObj(map, prefix + "HostVolume.", this.HostVolume);

    }
}

