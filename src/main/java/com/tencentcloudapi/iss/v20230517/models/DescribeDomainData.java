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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainData extends AbstractModel {

    /**
    * 域名ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 播放域名
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * CNAME 记录值
    */
    @SerializedName("InternalDomain")
    @Expose
    private String InternalDomain;

    /**
    * 是否上传证书（0：否，1：是）
    */
    @SerializedName("HaveCert")
    @Expose
    private Long HaveCert;

    /**
    * 服务节点 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 服务节点名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 用户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 域名类型 0:拉流域名 1:推流域名
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
     * Get 域名ID 
     * @return Id 域名ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 域名ID
     * @param Id 域名ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 播放域名 
     * @return PlayDomain 播放域名
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set 播放域名
     * @param PlayDomain 播放域名
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get CNAME 记录值 
     * @return InternalDomain CNAME 记录值
     */
    public String getInternalDomain() {
        return this.InternalDomain;
    }

    /**
     * Set CNAME 记录值
     * @param InternalDomain CNAME 记录值
     */
    public void setInternalDomain(String InternalDomain) {
        this.InternalDomain = InternalDomain;
    }

    /**
     * Get 是否上传证书（0：否，1：是） 
     * @return HaveCert 是否上传证书（0：否，1：是）
     */
    public Long getHaveCert() {
        return this.HaveCert;
    }

    /**
     * Set 是否上传证书（0：否，1：是）
     * @param HaveCert 是否上传证书（0：否，1：是）
     */
    public void setHaveCert(Long HaveCert) {
        this.HaveCert = HaveCert;
    }

    /**
     * Get 服务节点 ID 
     * @return ClusterId 服务节点 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 服务节点 ID
     * @param ClusterId 服务节点 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 服务节点名称 
     * @return ClusterName 服务节点名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 服务节点名称
     * @param ClusterName 服务节点名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 用户ID 
     * @return AppId 用户ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户ID
     * @param AppId 用户ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 证书ID 
     * @return CertId 证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID
     * @param CertId 证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 域名类型 0:拉流域名 1:推流域名 
     * @return DomainType 域名类型 0:拉流域名 1:推流域名
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set 域名类型 0:拉流域名 1:推流域名
     * @param DomainType 域名类型 0:拉流域名 1:推流域名
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    public DescribeDomainData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainData(DescribeDomainData source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PlayDomain != null) {
            this.PlayDomain = new String(source.PlayDomain);
        }
        if (source.InternalDomain != null) {
            this.InternalDomain = new String(source.InternalDomain);
        }
        if (source.HaveCert != null) {
            this.HaveCert = new Long(source.HaveCert);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "InternalDomain", this.InternalDomain);
        this.setParamSimple(map, prefix + "HaveCert", this.HaveCert);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);

    }
}

