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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBFeaturesResponse extends AbstractModel {

    /**
    * <p>是否支持数据库审计功能。</p>
    */
    @SerializedName("IsSupportAudit")
    @Expose
    private Boolean IsSupportAudit;

    /**
    * <p>开启审计是否需要升级内核版本。</p>
    */
    @SerializedName("AuditNeedUpgrade")
    @Expose
    private Boolean AuditNeedUpgrade;

    /**
    * <p>是否支持数据库加密功能。</p>
    */
    @SerializedName("IsSupportEncryption")
    @Expose
    private Boolean IsSupportEncryption;

    /**
    * <p>开启加密是否需要升级内核版本。</p>
    */
    @SerializedName("EncryptionNeedUpgrade")
    @Expose
    private Boolean EncryptionNeedUpgrade;

    /**
    * <p>是否为异地只读实例。</p>
    */
    @SerializedName("IsRemoteRo")
    @Expose
    private Boolean IsRemoteRo;

    /**
    * <p>主实例所在地域。<br>说明：此参数可能返回空值，您可忽略此出参返回值。如需获取实例所在地域详情，您可调用 <a href="https://cloud.tencent.com/document/product/236/15872">查询实例列表</a> 接口查询。</p>
    */
    @SerializedName("MasterRegion")
    @Expose
    private String MasterRegion;

    /**
    * <p>是否支持小版本升级。</p>
    */
    @SerializedName("IsSupportUpdateSubVersion")
    @Expose
    private Boolean IsSupportUpdateSubVersion;

    /**
    * <p>当前内核版本。</p>
    */
    @SerializedName("CurrentSubVersion")
    @Expose
    private String CurrentSubVersion;

    /**
    * <p>可供升级的内核版本。</p>
    */
    @SerializedName("TargetSubVersion")
    @Expose
    private String TargetSubVersion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否支持数据库审计功能。</p> 
     * @return IsSupportAudit <p>是否支持数据库审计功能。</p>
     */
    public Boolean getIsSupportAudit() {
        return this.IsSupportAudit;
    }

    /**
     * Set <p>是否支持数据库审计功能。</p>
     * @param IsSupportAudit <p>是否支持数据库审计功能。</p>
     */
    public void setIsSupportAudit(Boolean IsSupportAudit) {
        this.IsSupportAudit = IsSupportAudit;
    }

    /**
     * Get <p>开启审计是否需要升级内核版本。</p> 
     * @return AuditNeedUpgrade <p>开启审计是否需要升级内核版本。</p>
     */
    public Boolean getAuditNeedUpgrade() {
        return this.AuditNeedUpgrade;
    }

    /**
     * Set <p>开启审计是否需要升级内核版本。</p>
     * @param AuditNeedUpgrade <p>开启审计是否需要升级内核版本。</p>
     */
    public void setAuditNeedUpgrade(Boolean AuditNeedUpgrade) {
        this.AuditNeedUpgrade = AuditNeedUpgrade;
    }

    /**
     * Get <p>是否支持数据库加密功能。</p> 
     * @return IsSupportEncryption <p>是否支持数据库加密功能。</p>
     */
    public Boolean getIsSupportEncryption() {
        return this.IsSupportEncryption;
    }

    /**
     * Set <p>是否支持数据库加密功能。</p>
     * @param IsSupportEncryption <p>是否支持数据库加密功能。</p>
     */
    public void setIsSupportEncryption(Boolean IsSupportEncryption) {
        this.IsSupportEncryption = IsSupportEncryption;
    }

    /**
     * Get <p>开启加密是否需要升级内核版本。</p> 
     * @return EncryptionNeedUpgrade <p>开启加密是否需要升级内核版本。</p>
     */
    public Boolean getEncryptionNeedUpgrade() {
        return this.EncryptionNeedUpgrade;
    }

    /**
     * Set <p>开启加密是否需要升级内核版本。</p>
     * @param EncryptionNeedUpgrade <p>开启加密是否需要升级内核版本。</p>
     */
    public void setEncryptionNeedUpgrade(Boolean EncryptionNeedUpgrade) {
        this.EncryptionNeedUpgrade = EncryptionNeedUpgrade;
    }

    /**
     * Get <p>是否为异地只读实例。</p> 
     * @return IsRemoteRo <p>是否为异地只读实例。</p>
     */
    public Boolean getIsRemoteRo() {
        return this.IsRemoteRo;
    }

    /**
     * Set <p>是否为异地只读实例。</p>
     * @param IsRemoteRo <p>是否为异地只读实例。</p>
     */
    public void setIsRemoteRo(Boolean IsRemoteRo) {
        this.IsRemoteRo = IsRemoteRo;
    }

    /**
     * Get <p>主实例所在地域。<br>说明：此参数可能返回空值，您可忽略此出参返回值。如需获取实例所在地域详情，您可调用 <a href="https://cloud.tencent.com/document/product/236/15872">查询实例列表</a> 接口查询。</p> 
     * @return MasterRegion <p>主实例所在地域。<br>说明：此参数可能返回空值，您可忽略此出参返回值。如需获取实例所在地域详情，您可调用 <a href="https://cloud.tencent.com/document/product/236/15872">查询实例列表</a> 接口查询。</p>
     */
    public String getMasterRegion() {
        return this.MasterRegion;
    }

    /**
     * Set <p>主实例所在地域。<br>说明：此参数可能返回空值，您可忽略此出参返回值。如需获取实例所在地域详情，您可调用 <a href="https://cloud.tencent.com/document/product/236/15872">查询实例列表</a> 接口查询。</p>
     * @param MasterRegion <p>主实例所在地域。<br>说明：此参数可能返回空值，您可忽略此出参返回值。如需获取实例所在地域详情，您可调用 <a href="https://cloud.tencent.com/document/product/236/15872">查询实例列表</a> 接口查询。</p>
     */
    public void setMasterRegion(String MasterRegion) {
        this.MasterRegion = MasterRegion;
    }

    /**
     * Get <p>是否支持小版本升级。</p> 
     * @return IsSupportUpdateSubVersion <p>是否支持小版本升级。</p>
     */
    public Boolean getIsSupportUpdateSubVersion() {
        return this.IsSupportUpdateSubVersion;
    }

    /**
     * Set <p>是否支持小版本升级。</p>
     * @param IsSupportUpdateSubVersion <p>是否支持小版本升级。</p>
     */
    public void setIsSupportUpdateSubVersion(Boolean IsSupportUpdateSubVersion) {
        this.IsSupportUpdateSubVersion = IsSupportUpdateSubVersion;
    }

    /**
     * Get <p>当前内核版本。</p> 
     * @return CurrentSubVersion <p>当前内核版本。</p>
     */
    public String getCurrentSubVersion() {
        return this.CurrentSubVersion;
    }

    /**
     * Set <p>当前内核版本。</p>
     * @param CurrentSubVersion <p>当前内核版本。</p>
     */
    public void setCurrentSubVersion(String CurrentSubVersion) {
        this.CurrentSubVersion = CurrentSubVersion;
    }

    /**
     * Get <p>可供升级的内核版本。</p> 
     * @return TargetSubVersion <p>可供升级的内核版本。</p>
     */
    public String getTargetSubVersion() {
        return this.TargetSubVersion;
    }

    /**
     * Set <p>可供升级的内核版本。</p>
     * @param TargetSubVersion <p>可供升级的内核版本。</p>
     */
    public void setTargetSubVersion(String TargetSubVersion) {
        this.TargetSubVersion = TargetSubVersion;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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

