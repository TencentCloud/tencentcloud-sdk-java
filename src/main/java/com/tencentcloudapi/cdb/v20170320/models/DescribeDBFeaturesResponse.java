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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBFeaturesResponse extends AbstractModel{

    /**
    * 是否支持数据库审计功能。
    */
    @SerializedName("IsSupportAudit")
    @Expose
    private Boolean IsSupportAudit;

    /**
    * 开启审计是否需要升级内核版本。
    */
    @SerializedName("AuditNeedUpgrade")
    @Expose
    private Boolean AuditNeedUpgrade;

    /**
    * 是否支持数据库加密功能。
    */
    @SerializedName("IsSupportEncryption")
    @Expose
    private Boolean IsSupportEncryption;

    /**
    * 开启加密是否需要升级内核版本。
    */
    @SerializedName("EncryptionNeedUpgrade")
    @Expose
    private Boolean EncryptionNeedUpgrade;

    /**
    * 是否为异地只读实例。
    */
    @SerializedName("IsRemoteRo")
    @Expose
    private Boolean IsRemoteRo;

    /**
    * 主实例所在地域。
    */
    @SerializedName("MasterRegion")
    @Expose
    private String MasterRegion;

    /**
    * 是否支持小版本升级。
    */
    @SerializedName("IsSupportUpdateSubVersion")
    @Expose
    private Boolean IsSupportUpdateSubVersion;

    /**
    * 当前内核版本。
    */
    @SerializedName("CurrentSubVersion")
    @Expose
    private String CurrentSubVersion;

    /**
    * 可供升级的内核版本。
    */
    @SerializedName("TargetSubVersion")
    @Expose
    private String TargetSubVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否支持数据库审计功能。 
     * @return IsSupportAudit 是否支持数据库审计功能。
     */
    public Boolean getIsSupportAudit() {
        return this.IsSupportAudit;
    }

    /**
     * Set 是否支持数据库审计功能。
     * @param IsSupportAudit 是否支持数据库审计功能。
     */
    public void setIsSupportAudit(Boolean IsSupportAudit) {
        this.IsSupportAudit = IsSupportAudit;
    }

    /**
     * Get 开启审计是否需要升级内核版本。 
     * @return AuditNeedUpgrade 开启审计是否需要升级内核版本。
     */
    public Boolean getAuditNeedUpgrade() {
        return this.AuditNeedUpgrade;
    }

    /**
     * Set 开启审计是否需要升级内核版本。
     * @param AuditNeedUpgrade 开启审计是否需要升级内核版本。
     */
    public void setAuditNeedUpgrade(Boolean AuditNeedUpgrade) {
        this.AuditNeedUpgrade = AuditNeedUpgrade;
    }

    /**
     * Get 是否支持数据库加密功能。 
     * @return IsSupportEncryption 是否支持数据库加密功能。
     */
    public Boolean getIsSupportEncryption() {
        return this.IsSupportEncryption;
    }

    /**
     * Set 是否支持数据库加密功能。
     * @param IsSupportEncryption 是否支持数据库加密功能。
     */
    public void setIsSupportEncryption(Boolean IsSupportEncryption) {
        this.IsSupportEncryption = IsSupportEncryption;
    }

    /**
     * Get 开启加密是否需要升级内核版本。 
     * @return EncryptionNeedUpgrade 开启加密是否需要升级内核版本。
     */
    public Boolean getEncryptionNeedUpgrade() {
        return this.EncryptionNeedUpgrade;
    }

    /**
     * Set 开启加密是否需要升级内核版本。
     * @param EncryptionNeedUpgrade 开启加密是否需要升级内核版本。
     */
    public void setEncryptionNeedUpgrade(Boolean EncryptionNeedUpgrade) {
        this.EncryptionNeedUpgrade = EncryptionNeedUpgrade;
    }

    /**
     * Get 是否为异地只读实例。 
     * @return IsRemoteRo 是否为异地只读实例。
     */
    public Boolean getIsRemoteRo() {
        return this.IsRemoteRo;
    }

    /**
     * Set 是否为异地只读实例。
     * @param IsRemoteRo 是否为异地只读实例。
     */
    public void setIsRemoteRo(Boolean IsRemoteRo) {
        this.IsRemoteRo = IsRemoteRo;
    }

    /**
     * Get 主实例所在地域。 
     * @return MasterRegion 主实例所在地域。
     */
    public String getMasterRegion() {
        return this.MasterRegion;
    }

    /**
     * Set 主实例所在地域。
     * @param MasterRegion 主实例所在地域。
     */
    public void setMasterRegion(String MasterRegion) {
        this.MasterRegion = MasterRegion;
    }

    /**
     * Get 是否支持小版本升级。 
     * @return IsSupportUpdateSubVersion 是否支持小版本升级。
     */
    public Boolean getIsSupportUpdateSubVersion() {
        return this.IsSupportUpdateSubVersion;
    }

    /**
     * Set 是否支持小版本升级。
     * @param IsSupportUpdateSubVersion 是否支持小版本升级。
     */
    public void setIsSupportUpdateSubVersion(Boolean IsSupportUpdateSubVersion) {
        this.IsSupportUpdateSubVersion = IsSupportUpdateSubVersion;
    }

    /**
     * Get 当前内核版本。 
     * @return CurrentSubVersion 当前内核版本。
     */
    public String getCurrentSubVersion() {
        return this.CurrentSubVersion;
    }

    /**
     * Set 当前内核版本。
     * @param CurrentSubVersion 当前内核版本。
     */
    public void setCurrentSubVersion(String CurrentSubVersion) {
        this.CurrentSubVersion = CurrentSubVersion;
    }

    /**
     * Get 可供升级的内核版本。 
     * @return TargetSubVersion 可供升级的内核版本。
     */
    public String getTargetSubVersion() {
        return this.TargetSubVersion;
    }

    /**
     * Set 可供升级的内核版本。
     * @param TargetSubVersion 可供升级的内核版本。
     */
    public void setTargetSubVersion(String TargetSubVersion) {
        this.TargetSubVersion = TargetSubVersion;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBFeaturesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBFeaturesResponse(DescribeDBFeaturesResponse source) {
        if (source.IsSupportAudit != null) {
            this.IsSupportAudit = new Boolean(source.IsSupportAudit);
        }
        if (source.AuditNeedUpgrade != null) {
            this.AuditNeedUpgrade = new Boolean(source.AuditNeedUpgrade);
        }
        if (source.IsSupportEncryption != null) {
            this.IsSupportEncryption = new Boolean(source.IsSupportEncryption);
        }
        if (source.EncryptionNeedUpgrade != null) {
            this.EncryptionNeedUpgrade = new Boolean(source.EncryptionNeedUpgrade);
        }
        if (source.IsRemoteRo != null) {
            this.IsRemoteRo = new Boolean(source.IsRemoteRo);
        }
        if (source.MasterRegion != null) {
            this.MasterRegion = new String(source.MasterRegion);
        }
        if (source.IsSupportUpdateSubVersion != null) {
            this.IsSupportUpdateSubVersion = new Boolean(source.IsSupportUpdateSubVersion);
        }
        if (source.CurrentSubVersion != null) {
            this.CurrentSubVersion = new String(source.CurrentSubVersion);
        }
        if (source.TargetSubVersion != null) {
            this.TargetSubVersion = new String(source.TargetSubVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupportAudit", this.IsSupportAudit);
        this.setParamSimple(map, prefix + "AuditNeedUpgrade", this.AuditNeedUpgrade);
        this.setParamSimple(map, prefix + "IsSupportEncryption", this.IsSupportEncryption);
        this.setParamSimple(map, prefix + "EncryptionNeedUpgrade", this.EncryptionNeedUpgrade);
        this.setParamSimple(map, prefix + "IsRemoteRo", this.IsRemoteRo);
        this.setParamSimple(map, prefix + "MasterRegion", this.MasterRegion);
        this.setParamSimple(map, prefix + "IsSupportUpdateSubVersion", this.IsSupportUpdateSubVersion);
        this.setParamSimple(map, prefix + "CurrentSubVersion", this.CurrentSubVersion);
        this.setParamSimple(map, prefix + "TargetSubVersion", this.TargetSubVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

