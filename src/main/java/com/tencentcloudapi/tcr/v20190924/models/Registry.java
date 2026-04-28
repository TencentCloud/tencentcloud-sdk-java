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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Registry extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * <p>实例规格</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>实例状态。有以下状态：<br>Pending, 初始化中<br>Deploying, 创建中<br>Running, 运行中<br>Unhealthy, 状态异常<br>FailedCreated, 创建失败<br>FailedUpdated, 更新失败<br>Bucket-Error, 存储桶异常<br>Isolate, 待回收<br>Deleting, 删除中<br>DeleteBucketFailed, 实例删除存储桶失败<br>DeleteFailed, 实例删除失败</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>实例的公共访问地址</p>
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * <p>实例创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>地域名称</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>地域Id</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>是否支持匿名</p>
    */
    @SerializedName("EnableAnonymous")
    @Expose
    private Boolean EnableAnonymous;

    /**
    * <p>Token有效时间</p>
    */
    @SerializedName("TokenValidTime")
    @Expose
    private Long TokenValidTime;

    /**
    * <p>实例内部访问地址</p>
    */
    @SerializedName("InternalEndpoint")
    @Expose
    private String InternalEndpoint;

    /**
    * <p>实例云标签</p>
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * <p>实例过期时间（预付费）</p>
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * <p>实例付费类型，0表示后付费，1表示预付费</p>
    */
    @SerializedName("PayMod")
    @Expose
    private Long PayMod;

    /**
    * <p>预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>是否开启实例删除保护，false表示不开启</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>是否支持AI特性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AIFeature")
    @Expose
    private Boolean AIFeature;

    /**
    * <p>cos桶是否开启多AZ特性</p>
    */
    @SerializedName("EnableCosMAZ")
    @Expose
    private Boolean EnableCosMAZ;

    /**
    * <p>cos桶是否开启版本控制</p>
    */
    @SerializedName("EnableCosVersioning")
    @Expose
    private Boolean EnableCosVersioning;

    /**
     * Get <p>实例ID</p> 
     * @return RegistryId <p>实例ID</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>实例ID</p>
     * @param RegistryId <p>实例ID</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return RegistryName <p>实例名称</p>
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set <p>实例名称</p>
     * @param RegistryName <p>实例名称</p>
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get <p>实例规格</p> 
     * @return RegistryType <p>实例规格</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>实例规格</p>
     * @param RegistryType <p>实例规格</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>实例状态。有以下状态：<br>Pending, 初始化中<br>Deploying, 创建中<br>Running, 运行中<br>Unhealthy, 状态异常<br>FailedCreated, 创建失败<br>FailedUpdated, 更新失败<br>Bucket-Error, 存储桶异常<br>Isolate, 待回收<br>Deleting, 删除中<br>DeleteBucketFailed, 实例删除存储桶失败<br>DeleteFailed, 实例删除失败</p> 
     * @return Status <p>实例状态。有以下状态：<br>Pending, 初始化中<br>Deploying, 创建中<br>Running, 运行中<br>Unhealthy, 状态异常<br>FailedCreated, 创建失败<br>FailedUpdated, 更新失败<br>Bucket-Error, 存储桶异常<br>Isolate, 待回收<br>Deleting, 删除中<br>DeleteBucketFailed, 实例删除存储桶失败<br>DeleteFailed, 实例删除失败</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态。有以下状态：<br>Pending, 初始化中<br>Deploying, 创建中<br>Running, 运行中<br>Unhealthy, 状态异常<br>FailedCreated, 创建失败<br>FailedUpdated, 更新失败<br>Bucket-Error, 存储桶异常<br>Isolate, 待回收<br>Deleting, 删除中<br>DeleteBucketFailed, 实例删除存储桶失败<br>DeleteFailed, 实例删除失败</p>
     * @param Status <p>实例状态。有以下状态：<br>Pending, 初始化中<br>Deploying, 创建中<br>Running, 运行中<br>Unhealthy, 状态异常<br>FailedCreated, 创建失败<br>FailedUpdated, 更新失败<br>Bucket-Error, 存储桶异常<br>Isolate, 待回收<br>Deleting, 删除中<br>DeleteBucketFailed, 实例删除存储桶失败<br>DeleteFailed, 实例删除失败</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例的公共访问地址</p> 
     * @return PublicDomain <p>实例的公共访问地址</p>
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set <p>实例的公共访问地址</p>
     * @param PublicDomain <p>实例的公共访问地址</p>
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get <p>实例创建时间</p> 
     * @return CreatedAt <p>实例创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>实例创建时间</p>
     * @param CreatedAt <p>实例创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>地域名称</p> 
     * @return RegionName <p>地域名称</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域名称</p>
     * @param RegionName <p>地域名称</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>地域Id</p> 
     * @return RegionId <p>地域Id</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域Id</p>
     * @param RegionId <p>地域Id</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>是否支持匿名</p> 
     * @return EnableAnonymous <p>是否支持匿名</p>
     */
    public Boolean getEnableAnonymous() {
        return this.EnableAnonymous;
    }

    /**
     * Set <p>是否支持匿名</p>
     * @param EnableAnonymous <p>是否支持匿名</p>
     */
    public void setEnableAnonymous(Boolean EnableAnonymous) {
        this.EnableAnonymous = EnableAnonymous;
    }

    /**
     * Get <p>Token有效时间</p> 
     * @return TokenValidTime <p>Token有效时间</p>
     */
    public Long getTokenValidTime() {
        return this.TokenValidTime;
    }

    /**
     * Set <p>Token有效时间</p>
     * @param TokenValidTime <p>Token有效时间</p>
     */
    public void setTokenValidTime(Long TokenValidTime) {
        this.TokenValidTime = TokenValidTime;
    }

    /**
     * Get <p>实例内部访问地址</p> 
     * @return InternalEndpoint <p>实例内部访问地址</p>
     */
    public String getInternalEndpoint() {
        return this.InternalEndpoint;
    }

    /**
     * Set <p>实例内部访问地址</p>
     * @param InternalEndpoint <p>实例内部访问地址</p>
     */
    public void setInternalEndpoint(String InternalEndpoint) {
        this.InternalEndpoint = InternalEndpoint;
    }

    /**
     * Get <p>实例云标签</p> 
     * @return TagSpecification <p>实例云标签</p>
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set <p>实例云标签</p>
     * @param TagSpecification <p>实例云标签</p>
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get <p>实例过期时间（预付费）</p> 
     * @return ExpiredAt <p>实例过期时间（预付费）</p>
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set <p>实例过期时间（预付费）</p>
     * @param ExpiredAt <p>实例过期时间（预付费）</p>
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get <p>实例付费类型，0表示后付费，1表示预付费</p> 
     * @return PayMod <p>实例付费类型，0表示后付费，1表示预付费</p>
     */
    public Long getPayMod() {
        return this.PayMod;
    }

    /**
     * Set <p>实例付费类型，0表示后付费，1表示预付费</p>
     * @param PayMod <p>实例付费类型，0表示后付费，1表示预付费</p>
     */
    public void setPayMod(Long PayMod) {
        this.PayMod = PayMod;
    }

    /**
     * Get <p>预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知</p> 
     * @return RenewFlag <p>预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知</p>
     * @param RenewFlag <p>预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>是否开启实例删除保护，false表示不开启</p> 
     * @return DeletionProtection <p>是否开启实例删除保护，false表示不开启</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>是否开启实例删除保护，false表示不开启</p>
     * @param DeletionProtection <p>是否开启实例删除保护，false表示不开启</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>是否支持AI特性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AIFeature <p>是否支持AI特性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAIFeature() {
        return this.AIFeature;
    }

    /**
     * Set <p>是否支持AI特性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AIFeature <p>是否支持AI特性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAIFeature(Boolean AIFeature) {
        this.AIFeature = AIFeature;
    }

    /**
     * Get <p>cos桶是否开启多AZ特性</p> 
     * @return EnableCosMAZ <p>cos桶是否开启多AZ特性</p>
     */
    public Boolean getEnableCosMAZ() {
        return this.EnableCosMAZ;
    }

    /**
     * Set <p>cos桶是否开启多AZ特性</p>
     * @param EnableCosMAZ <p>cos桶是否开启多AZ特性</p>
     */
    public void setEnableCosMAZ(Boolean EnableCosMAZ) {
        this.EnableCosMAZ = EnableCosMAZ;
    }

    /**
     * Get <p>cos桶是否开启版本控制</p> 
     * @return EnableCosVersioning <p>cos桶是否开启版本控制</p>
     */
    public Boolean getEnableCosVersioning() {
        return this.EnableCosVersioning;
    }

    /**
     * Set <p>cos桶是否开启版本控制</p>
     * @param EnableCosVersioning <p>cos桶是否开启版本控制</p>
     */
    public void setEnableCosVersioning(Boolean EnableCosVersioning) {
        this.EnableCosVersioning = EnableCosVersioning;
    }

    public Registry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Registry(Registry source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.EnableAnonymous != null) {
            this.EnableAnonymous = new Boolean(source.EnableAnonymous);
        }
        if (source.TokenValidTime != null) {
            this.TokenValidTime = new Long(source.TokenValidTime);
        }
        if (source.InternalEndpoint != null) {
            this.InternalEndpoint = new String(source.InternalEndpoint);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new String(source.ExpiredAt);
        }
        if (source.PayMod != null) {
            this.PayMod = new Long(source.PayMod);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.AIFeature != null) {
            this.AIFeature = new Boolean(source.AIFeature);
        }
        if (source.EnableCosMAZ != null) {
            this.EnableCosMAZ = new Boolean(source.EnableCosMAZ);
        }
        if (source.EnableCosVersioning != null) {
            this.EnableCosVersioning = new Boolean(source.EnableCosVersioning);
        }
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
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "PayMod", this.PayMod);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "AIFeature", this.AIFeature);
        this.setParamSimple(map, prefix + "EnableCosMAZ", this.EnableCosMAZ);
        this.setParamSimple(map, prefix + "EnableCosVersioning", this.EnableCosVersioning);

    }
}

