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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveDomainCertBindings extends AbstractModel{

    /**
    * 域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 证书备注。与CertName同义。
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * 证书类型。
0：自有证书
1：腾讯云ssl托管证书
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * https状态。
1：已开启。
0：已关闭。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 证书过期时间。
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
    * 证书Id。
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
    * 腾讯云ssl的证书Id。
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
    * 规则最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 域名。 
     * @return DomainName 域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名。
     * @param DomainName 域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 证书备注。与CertName同义。 
     * @return CertificateAlias 证书备注。与CertName同义。
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set 证书备注。与CertName同义。
     * @param CertificateAlias 证书备注。与CertName同义。
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get 证书类型。
0：自有证书
1：腾讯云ssl托管证书 
     * @return CertType 证书类型。
0：自有证书
1：腾讯云ssl托管证书
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型。
0：自有证书
1：腾讯云ssl托管证书
     * @param CertType 证书类型。
0：自有证书
1：腾讯云ssl托管证书
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get https状态。
1：已开启。
0：已关闭。 
     * @return Status https状态。
1：已开启。
0：已关闭。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set https状态。
1：已开启。
0：已关闭。
     * @param Status https状态。
1：已开启。
0：已关闭。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 证书过期时间。 
     * @return CertExpireTime 证书过期时间。
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set 证书过期时间。
     * @param CertExpireTime 证书过期时间。
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    /**
     * Get 证书Id。 
     * @return CertId 证书Id。
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书Id。
     * @param CertId 证书Id。
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 腾讯云ssl的证书Id。 
     * @return CloudCertId 腾讯云ssl的证书Id。
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set 腾讯云ssl的证书Id。
     * @param CloudCertId 腾讯云ssl的证书Id。
     */
    public void setCloudCertId(String CloudCertId) {
        this.CloudCertId = CloudCertId;
    }

    /**
     * Get 规则最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 规则最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 规则最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 规则最后更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public LiveDomainCertBindings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveDomainCertBindings(LiveDomainCertBindings source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.CertificateAlias != null) {
            this.CertificateAlias = new String(source.CertificateAlias);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CertExpireTime != null) {
            this.CertExpireTime = new String(source.CertExpireTime);
        }
        if (source.CertId != null) {
            this.CertId = new Long(source.CertId);
        }
        if (source.CloudCertId != null) {
            this.CloudCertId = new String(source.CloudCertId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CertExpireTime", this.CertExpireTime);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CloudCertId", this.CloudCertId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

