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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Registry extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 实例名称
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * 实例规格
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例的公共访问地址
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * 实例创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域Id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 是否支持匿名
    */
    @SerializedName("EnableAnonymous")
    @Expose
    private Boolean EnableAnonymous;

    /**
    * Token有效时间
    */
    @SerializedName("TokenValidTime")
    @Expose
    private Long TokenValidTime;

    /**
    * 实例内部访问地址
    */
    @SerializedName("InternalEndpoint")
    @Expose
    private String InternalEndpoint;

    /**
    * 实例云标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
     * Get 实例ID 
     * @return RegistryId 实例ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例ID
     * @param RegistryId 实例ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 实例名称 
     * @return RegistryName 实例名称
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set 实例名称
     * @param RegistryName 实例名称
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get 实例规格 
     * @return RegistryType 实例规格
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 实例规格
     * @param RegistryType 实例规格
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 实例状态 
     * @return Status 实例状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例的公共访问地址 
     * @return PublicDomain 实例的公共访问地址
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set 实例的公共访问地址
     * @param PublicDomain 实例的公共访问地址
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get 实例创建时间 
     * @return CreatedAt 实例创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 实例创建时间
     * @param CreatedAt 实例创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域Id 
     * @return RegionId 地域Id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域Id
     * @param RegionId 地域Id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 是否支持匿名 
     * @return EnableAnonymous 是否支持匿名
     */
    public Boolean getEnableAnonymous() {
        return this.EnableAnonymous;
    }

    /**
     * Set 是否支持匿名
     * @param EnableAnonymous 是否支持匿名
     */
    public void setEnableAnonymous(Boolean EnableAnonymous) {
        this.EnableAnonymous = EnableAnonymous;
    }

    /**
     * Get Token有效时间 
     * @return TokenValidTime Token有效时间
     */
    public Long getTokenValidTime() {
        return this.TokenValidTime;
    }

    /**
     * Set Token有效时间
     * @param TokenValidTime Token有效时间
     */
    public void setTokenValidTime(Long TokenValidTime) {
        this.TokenValidTime = TokenValidTime;
    }

    /**
     * Get 实例内部访问地址 
     * @return InternalEndpoint 实例内部访问地址
     */
    public String getInternalEndpoint() {
        return this.InternalEndpoint;
    }

    /**
     * Set 实例内部访问地址
     * @param InternalEndpoint 实例内部访问地址
     */
    public void setInternalEndpoint(String InternalEndpoint) {
        this.InternalEndpoint = InternalEndpoint;
    }

    /**
     * Get 实例云标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification 实例云标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 实例云标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification 实例云标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "EnableAnonymous", this.EnableAnonymous);
        this.setParamSimple(map, prefix + "TokenValidTime", this.TokenValidTime);
        this.setParamSimple(map, prefix + "InternalEndpoint", this.InternalEndpoint);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

