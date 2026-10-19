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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeRef extends AbstractModel {

    /**
    * Volume 名称；服务端在当前认证 AppId 下解析为稳定 VolumeId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * 稳定 Volume ID，格式 vol-xxxxxxxx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeId")
    @Expose
    private String VolumeId;

    /**
     * Get Volume 名称；服务端在当前认证 AppId 下解析为稳定 VolumeId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeName Volume 名称；服务端在当前认证 AppId 下解析为稳定 VolumeId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set Volume 名称；服务端在当前认证 AppId 下解析为稳定 VolumeId
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeName Volume 名称；服务端在当前认证 AppId 下解析为稳定 VolumeId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get 稳定 Volume ID，格式 vol-xxxxxxxx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeId 稳定 Volume ID，格式 vol-xxxxxxxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVolumeId() {
        return this.VolumeId;
    }

    /**
     * Set 稳定 Volume ID，格式 vol-xxxxxxxx
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeId 稳定 Volume ID，格式 vol-xxxxxxxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeId(String VolumeId) {
        this.VolumeId = VolumeId;
    }

    public VolumeRef() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeRef(VolumeRef source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.VolumeId != null) {
            this.VolumeId = new String(source.VolumeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "VolumeId", this.VolumeId);

    }
}

