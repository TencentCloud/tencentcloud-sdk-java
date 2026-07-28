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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ability extends AbstractModel {

    /**
    * <p>是否支持从可用区</p>
    */
    @SerializedName("IsSupportSlaveZone")
    @Expose
    private String IsSupportSlaveZone;

    /**
    * <p>不支持从可用区的原因</p>
    */
    @SerializedName("NonsupportSlaveZoneReason")
    @Expose
    private String NonsupportSlaveZoneReason;

    /**
    * <p>是否支持RO实例</p>
    */
    @SerializedName("IsSupportRo")
    @Expose
    private String IsSupportRo;

    /**
    * <p>不支持RO实例的原因</p>
    */
    @SerializedName("NonsupportRoReason")
    @Expose
    private String NonsupportRoReason;

    /**
    * <p>是否支持手动发起快照备份</p>
    */
    @SerializedName("IsSupportManualSnapshot")
    @Expose
    private String IsSupportManualSnapshot;

    /**
    * <p>是否支持透明数据加密</p>
    */
    @SerializedName("IsSupportTransparentDataEncryption")
    @Expose
    private String IsSupportTransparentDataEncryption;

    /**
    * <p>不支持透明数据加密原因</p>
    */
    @SerializedName("NoSupportTransparentDataEncryptionReason")
    @Expose
    private String NoSupportTransparentDataEncryptionReason;

    /**
    * <p>是否支持手动发起逻辑备份</p>
    */
    @SerializedName("IsSupportManualLogic")
    @Expose
    private String IsSupportManualLogic;

    /**
    * <p>是否支持开启全局加密</p>
    */
    @SerializedName("IsSupportGlobalEncryption")
    @Expose
    private String IsSupportGlobalEncryption;

    /**
    * <p>不支持全局加密的原因</p>
    */
    @SerializedName("NoSupportGlobalEncryptionReason")
    @Expose
    private String NoSupportGlobalEncryptionReason;

    /**
    * <p>不支持透明加密原因状态码</p>
    */
    @SerializedName("NoSupportTransparentDataEncryptionReasonCode")
    @Expose
    private String NoSupportTransparentDataEncryptionReasonCode;

    /**
    * <p>不支持全局加密原因状态码</p>
    */
    @SerializedName("NoSupportGlobalEncryptionReasonCode")
    @Expose
    private String NoSupportGlobalEncryptionReasonCode;

    /**
     * Get <p>是否支持从可用区</p> 
     * @return IsSupportSlaveZone <p>是否支持从可用区</p>
     */
    public String getIsSupportSlaveZone() {
        return this.IsSupportSlaveZone;
    }

    /**
     * Set <p>是否支持从可用区</p>
     * @param IsSupportSlaveZone <p>是否支持从可用区</p>
     */
    public void setIsSupportSlaveZone(String IsSupportSlaveZone) {
        this.IsSupportSlaveZone = IsSupportSlaveZone;
    }

    /**
     * Get <p>不支持从可用区的原因</p> 
     * @return NonsupportSlaveZoneReason <p>不支持从可用区的原因</p>
     */
    public String getNonsupportSlaveZoneReason() {
        return this.NonsupportSlaveZoneReason;
    }

    /**
     * Set <p>不支持从可用区的原因</p>
     * @param NonsupportSlaveZoneReason <p>不支持从可用区的原因</p>
     */
    public void setNonsupportSlaveZoneReason(String NonsupportSlaveZoneReason) {
        this.NonsupportSlaveZoneReason = NonsupportSlaveZoneReason;
    }

    /**
     * Get <p>是否支持RO实例</p> 
     * @return IsSupportRo <p>是否支持RO实例</p>
     */
    public String getIsSupportRo() {
        return this.IsSupportRo;
    }

    /**
     * Set <p>是否支持RO实例</p>
     * @param IsSupportRo <p>是否支持RO实例</p>
     */
    public void setIsSupportRo(String IsSupportRo) {
        this.IsSupportRo = IsSupportRo;
    }

    /**
     * Get <p>不支持RO实例的原因</p> 
     * @return NonsupportRoReason <p>不支持RO实例的原因</p>
     */
    public String getNonsupportRoReason() {
        return this.NonsupportRoReason;
    }

    /**
     * Set <p>不支持RO实例的原因</p>
     * @param NonsupportRoReason <p>不支持RO实例的原因</p>
     */
    public void setNonsupportRoReason(String NonsupportRoReason) {
        this.NonsupportRoReason = NonsupportRoReason;
    }

    /**
     * Get <p>是否支持手动发起快照备份</p> 
     * @return IsSupportManualSnapshot <p>是否支持手动发起快照备份</p>
     */
    public String getIsSupportManualSnapshot() {
        return this.IsSupportManualSnapshot;
    }

    /**
     * Set <p>是否支持手动发起快照备份</p>
     * @param IsSupportManualSnapshot <p>是否支持手动发起快照备份</p>
     */
    public void setIsSupportManualSnapshot(String IsSupportManualSnapshot) {
        this.IsSupportManualSnapshot = IsSupportManualSnapshot;
    }

    /**
     * Get <p>是否支持透明数据加密</p> 
     * @return IsSupportTransparentDataEncryption <p>是否支持透明数据加密</p>
     */
    public String getIsSupportTransparentDataEncryption() {
        return this.IsSupportTransparentDataEncryption;
    }

    /**
     * Set <p>是否支持透明数据加密</p>
     * @param IsSupportTransparentDataEncryption <p>是否支持透明数据加密</p>
     */
    public void setIsSupportTransparentDataEncryption(String IsSupportTransparentDataEncryption) {
        this.IsSupportTransparentDataEncryption = IsSupportTransparentDataEncryption;
    }

    /**
     * Get <p>不支持透明数据加密原因</p> 
     * @return NoSupportTransparentDataEncryptionReason <p>不支持透明数据加密原因</p>
     */
    public String getNoSupportTransparentDataEncryptionReason() {
        return this.NoSupportTransparentDataEncryptionReason;
    }

    /**
     * Set <p>不支持透明数据加密原因</p>
     * @param NoSupportTransparentDataEncryptionReason <p>不支持透明数据加密原因</p>
     */
    public void setNoSupportTransparentDataEncryptionReason(String NoSupportTransparentDataEncryptionReason) {
        this.NoSupportTransparentDataEncryptionReason = NoSupportTransparentDataEncryptionReason;
    }

    /**
     * Get <p>是否支持手动发起逻辑备份</p> 
     * @return IsSupportManualLogic <p>是否支持手动发起逻辑备份</p>
     */
    public String getIsSupportManualLogic() {
        return this.IsSupportManualLogic;
    }

    /**
     * Set <p>是否支持手动发起逻辑备份</p>
     * @param IsSupportManualLogic <p>是否支持手动发起逻辑备份</p>
     */
    public void setIsSupportManualLogic(String IsSupportManualLogic) {
        this.IsSupportManualLogic = IsSupportManualLogic;
    }

    /**
     * Get <p>是否支持开启全局加密</p> 
     * @return IsSupportGlobalEncryption <p>是否支持开启全局加密</p>
     */
    public String getIsSupportGlobalEncryption() {
        return this.IsSupportGlobalEncryption;
    }

    /**
     * Set <p>是否支持开启全局加密</p>
     * @param IsSupportGlobalEncryption <p>是否支持开启全局加密</p>
     */
    public void setIsSupportGlobalEncryption(String IsSupportGlobalEncryption) {
        this.IsSupportGlobalEncryption = IsSupportGlobalEncryption;
    }

    /**
     * Get <p>不支持全局加密的原因</p> 
     * @return NoSupportGlobalEncryptionReason <p>不支持全局加密的原因</p>
     */
    public String getNoSupportGlobalEncryptionReason() {
        return this.NoSupportGlobalEncryptionReason;
    }

    /**
     * Set <p>不支持全局加密的原因</p>
     * @param NoSupportGlobalEncryptionReason <p>不支持全局加密的原因</p>
     */
    public void setNoSupportGlobalEncryptionReason(String NoSupportGlobalEncryptionReason) {
        this.NoSupportGlobalEncryptionReason = NoSupportGlobalEncryptionReason;
    }

    /**
     * Get <p>不支持透明加密原因状态码</p> 
     * @return NoSupportTransparentDataEncryptionReasonCode <p>不支持透明加密原因状态码</p>
     */
    public String getNoSupportTransparentDataEncryptionReasonCode() {
        return this.NoSupportTransparentDataEncryptionReasonCode;
    }

    /**
     * Set <p>不支持透明加密原因状态码</p>
     * @param NoSupportTransparentDataEncryptionReasonCode <p>不支持透明加密原因状态码</p>
     */
    public void setNoSupportTransparentDataEncryptionReasonCode(String NoSupportTransparentDataEncryptionReasonCode) {
        this.NoSupportTransparentDataEncryptionReasonCode = NoSupportTransparentDataEncryptionReasonCode;
    }

    /**
     * Get <p>不支持全局加密原因状态码</p> 
     * @return NoSupportGlobalEncryptionReasonCode <p>不支持全局加密原因状态码</p>
     */
    public String getNoSupportGlobalEncryptionReasonCode() {
        return this.NoSupportGlobalEncryptionReasonCode;
    }

    /**
     * Set <p>不支持全局加密原因状态码</p>
     * @param NoSupportGlobalEncryptionReasonCode <p>不支持全局加密原因状态码</p>
     */
    public void setNoSupportGlobalEncryptionReasonCode(String NoSupportGlobalEncryptionReasonCode) {
        this.NoSupportGlobalEncryptionReasonCode = NoSupportGlobalEncryptionReasonCode;
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
        if (source.IsSupportManualLogic != null) {
            this.IsSupportManualLogic = new String(source.IsSupportManualLogic);
        }
        if (source.IsSupportGlobalEncryption != null) {
            this.IsSupportGlobalEncryption = new String(source.IsSupportGlobalEncryption);
        }
        if (source.NoSupportGlobalEncryptionReason != null) {
            this.NoSupportGlobalEncryptionReason = new String(source.NoSupportGlobalEncryptionReason);
        }
        if (source.NoSupportTransparentDataEncryptionReasonCode != null) {
            this.NoSupportTransparentDataEncryptionReasonCode = new String(source.NoSupportTransparentDataEncryptionReasonCode);
        }
        if (source.NoSupportGlobalEncryptionReasonCode != null) {
            this.NoSupportGlobalEncryptionReasonCode = new String(source.NoSupportGlobalEncryptionReasonCode);
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
        this.setParamSimple(map, prefix + "IsSupportManualLogic", this.IsSupportManualLogic);
        this.setParamSimple(map, prefix + "IsSupportGlobalEncryption", this.IsSupportGlobalEncryption);
        this.setParamSimple(map, prefix + "NoSupportGlobalEncryptionReason", this.NoSupportGlobalEncryptionReason);
        this.setParamSimple(map, prefix + "NoSupportTransparentDataEncryptionReasonCode", this.NoSupportTransparentDataEncryptionReasonCode);
        this.setParamSimple(map, prefix + "NoSupportGlobalEncryptionReasonCode", this.NoSupportGlobalEncryptionReasonCode);

    }
}

