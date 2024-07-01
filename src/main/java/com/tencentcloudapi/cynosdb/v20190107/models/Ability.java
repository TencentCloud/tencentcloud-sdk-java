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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ability extends AbstractModel {

    /**
    * 是否支持从可用区
    */
    @SerializedName("IsSupportSlaveZone")
    @Expose
    private String IsSupportSlaveZone;

    /**
    * 不支持从可用区的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonsupportSlaveZoneReason")
    @Expose
    private String NonsupportSlaveZoneReason;

    /**
    * 是否支持RO实例
    */
    @SerializedName("IsSupportRo")
    @Expose
    private String IsSupportRo;

    /**
    * 不支持RO实例的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonsupportRoReason")
    @Expose
    private String NonsupportRoReason;

    /**
    * 是否支持手动发起快照备份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportManualSnapshot")
    @Expose
    private String IsSupportManualSnapshot;

    /**
    * 是否支持透明数据加密
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportTransparentDataEncryption")
    @Expose
    private String IsSupportTransparentDataEncryption;

    /**
    * 不支持透明数据加密原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoSupportTransparentDataEncryptionReason")
    @Expose
    private String NoSupportTransparentDataEncryptionReason;

    /**
     * Get 是否支持从可用区 
     * @return IsSupportSlaveZone 是否支持从可用区
     */
    public String getIsSupportSlaveZone() {
        return this.IsSupportSlaveZone;
    }

    /**
     * Set 是否支持从可用区
     * @param IsSupportSlaveZone 是否支持从可用区
     */
    public void setIsSupportSlaveZone(String IsSupportSlaveZone) {
        this.IsSupportSlaveZone = IsSupportSlaveZone;
    }

    /**
     * Get 不支持从可用区的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonsupportSlaveZoneReason 不支持从可用区的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNonsupportSlaveZoneReason() {
        return this.NonsupportSlaveZoneReason;
    }

    /**
     * Set 不支持从可用区的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonsupportSlaveZoneReason 不支持从可用区的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonsupportSlaveZoneReason(String NonsupportSlaveZoneReason) {
        this.NonsupportSlaveZoneReason = NonsupportSlaveZoneReason;
    }

    /**
     * Get 是否支持RO实例 
     * @return IsSupportRo 是否支持RO实例
     */
    public String getIsSupportRo() {
        return this.IsSupportRo;
    }

    /**
     * Set 是否支持RO实例
     * @param IsSupportRo 是否支持RO实例
     */
    public void setIsSupportRo(String IsSupportRo) {
        this.IsSupportRo = IsSupportRo;
    }

    /**
     * Get 不支持RO实例的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonsupportRoReason 不支持RO实例的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNonsupportRoReason() {
        return this.NonsupportRoReason;
    }

    /**
     * Set 不支持RO实例的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonsupportRoReason 不支持RO实例的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonsupportRoReason(String NonsupportRoReason) {
        this.NonsupportRoReason = NonsupportRoReason;
    }

    /**
     * Get 是否支持手动发起快照备份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportManualSnapshot 是否支持手动发起快照备份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsSupportManualSnapshot() {
        return this.IsSupportManualSnapshot;
    }

    /**
     * Set 是否支持手动发起快照备份
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportManualSnapshot 是否支持手动发起快照备份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportManualSnapshot(String IsSupportManualSnapshot) {
        this.IsSupportManualSnapshot = IsSupportManualSnapshot;
    }

    /**
     * Get 是否支持透明数据加密
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportTransparentDataEncryption 是否支持透明数据加密
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsSupportTransparentDataEncryption() {
        return this.IsSupportTransparentDataEncryption;
    }

    /**
     * Set 是否支持透明数据加密
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportTransparentDataEncryption 是否支持透明数据加密
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportTransparentDataEncryption(String IsSupportTransparentDataEncryption) {
        this.IsSupportTransparentDataEncryption = IsSupportTransparentDataEncryption;
    }

    /**
     * Get 不支持透明数据加密原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoSupportTransparentDataEncryptionReason 不支持透明数据加密原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNoSupportTransparentDataEncryptionReason() {
        return this.NoSupportTransparentDataEncryptionReason;
    }

    /**
     * Set 不支持透明数据加密原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoSupportTransparentDataEncryptionReason 不支持透明数据加密原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoSupportTransparentDataEncryptionReason(String NoSupportTransparentDataEncryptionReason) {
        this.NoSupportTransparentDataEncryptionReason = NoSupportTransparentDataEncryptionReason;
    }

    public Ability() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ability(Ability source) {
        if (source.IsSupportSlaveZone != null) {
            this.IsSupportSlaveZone = new String(source.IsSupportSlaveZone);
        }
        if (source.NonsupportSlaveZoneReason != null) {
            this.NonsupportSlaveZoneReason = new String(source.NonsupportSlaveZoneReason);
        }
        if (source.IsSupportRo != null) {
            this.IsSupportRo = new String(source.IsSupportRo);
        }
        if (source.NonsupportRoReason != null) {
            this.NonsupportRoReason = new String(source.NonsupportRoReason);
        }
        if (source.IsSupportManualSnapshot != null) {
            this.IsSupportManualSnapshot = new String(source.IsSupportManualSnapshot);
        }
        if (source.IsSupportTransparentDataEncryption != null) {
            this.IsSupportTransparentDataEncryption = new String(source.IsSupportTransparentDataEncryption);
        }
        if (source.NoSupportTransparentDataEncryptionReason != null) {
            this.NoSupportTransparentDataEncryptionReason = new String(source.NoSupportTransparentDataEncryptionReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupportSlaveZone", this.IsSupportSlaveZone);
        this.setParamSimple(map, prefix + "NonsupportSlaveZoneReason", this.NonsupportSlaveZoneReason);
        this.setParamSimple(map, prefix + "IsSupportRo", this.IsSupportRo);
        this.setParamSimple(map, prefix + "NonsupportRoReason", this.NonsupportRoReason);
        this.setParamSimple(map, prefix + "IsSupportManualSnapshot", this.IsSupportManualSnapshot);
        this.setParamSimple(map, prefix + "IsSupportTransparentDataEncryption", this.IsSupportTransparentDataEncryption);
        this.setParamSimple(map, prefix + "NoSupportTransparentDataEncryptionReason", this.NoSupportTransparentDataEncryptionReason);

    }
}

