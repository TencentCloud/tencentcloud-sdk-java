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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EksCiVolume extends AbstractModel{

    /**
    * Cbs Volume
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CbsVolumes")
    @Expose
    private CbsVolume [] CbsVolumes;

    /**
    * Nfs Volume
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NfsVolumes")
    @Expose
    private NfsVolume [] NfsVolumes;

    /**
     * Get Cbs Volume
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CbsVolumes Cbs Volume
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CbsVolume [] getCbsVolumes() {
        return this.CbsVolumes;
    }

    /**
     * Set Cbs Volume
注意：此字段可能返回 null，表示取不到有效值。
     * @param CbsVolumes Cbs Volume
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCbsVolumes(CbsVolume [] CbsVolumes) {
        this.CbsVolumes = CbsVolumes;
    }

    /**
     * Get Nfs Volume
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NfsVolumes Nfs Volume
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NfsVolume [] getNfsVolumes() {
        return this.NfsVolumes;
    }

    /**
     * Set Nfs Volume
注意：此字段可能返回 null，表示取不到有效值。
     * @param NfsVolumes Nfs Volume
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNfsVolumes(NfsVolume [] NfsVolumes) {
        this.NfsVolumes = NfsVolumes;
    }

    public EksCiVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EksCiVolume(EksCiVolume source) {
        if (source.CbsVolumes != null) {
            this.CbsVolumes = new CbsVolume[source.CbsVolumes.length];
            for (int i = 0; i < source.CbsVolumes.length; i++) {
                this.CbsVolumes[i] = new CbsVolume(source.CbsVolumes[i]);
            }
        }
        if (source.NfsVolumes != null) {
            this.NfsVolumes = new NfsVolume[source.NfsVolumes.length];
            for (int i = 0; i < source.NfsVolumes.length; i++) {
                this.NfsVolumes[i] = new NfsVolume(source.NfsVolumes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CbsVolumes.", this.CbsVolumes);
        this.setParamArrayObj(map, prefix + "NfsVolumes.", this.NfsVolumes);

    }
}

