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
    * 实例状态。有以下状态：
Pending, 初始化中
Deploying, 创建中
Running, 运行中
Unhealthy, 状态异常
FailedCreated, 创建失败
FailedUpdated, 更新失败
Bucket-Error, 存储桶异常
Isolate, 待回收
Deleting, 删除中
DeleteBucketFailed, 实例删除存储桶失败
DeleteFailed, 实例删除失败
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
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * 实例过期时间（预付费）
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * 实例付费类型，0表示后付费，1表示预付费
    */
    @SerializedName("PayMod")
    @Expose
    private Long PayMod;

    /**
    * 预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 是否开启实例删除保护，false表示不开启
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

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
     * Get 实例状态。有以下状态：
Pending, 初始化中
Deploying, 创建中
Running, 运行中
Unhealthy, 状态异常
FailedCreated, 创建失败
FailedUpdated, 更新失败
Bucket-Error, 存储桶异常
Isolate, 待回收
Deleting, 删除中
DeleteBucketFailed, 实例删除存储桶失败
DeleteFailed, 实例删除失败 
     * @return Status 实例状态。有以下状态：
Pending, 初始化中
Deploying, 创建中
Running, 运行中
Unhealthy, 状态异常
FailedCreated, 创建失败
FailedUpdated, 更新失败
Bucket-Error, 存储桶异常
Isolate, 待回收
Deleting, 删除中
DeleteBucketFailed, 实例删除存储桶失败
DeleteFailed, 实例删除失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态。有以下状态：
Pending, 初始化中
Deploying, 创建中
Running, 运行中
Unhealthy, 状态异常
FailedCreated, 创建失败
FailedUpdated, 更新失败
Bucket-Error, 存储桶异常
Isolate, 待回收
Deleting, 删除中
DeleteBucketFailed, 实例删除存储桶失败
DeleteFailed, 实例删除失败
     * @param Status 实例状态。有以下状态：
Pending, 初始化中
Deploying, 创建中
Running, 运行中
Unhealthy, 状态异常
FailedCreated, 创建失败
FailedUpdated, 更新失败
Bucket-Error, 存储桶异常
Isolate, 待回收
Deleting, 删除中
DeleteBucketFailed, 实例删除存储桶失败
DeleteFailed, 实例删除失败
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
     * @return TagSpecification 实例云标签
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 实例云标签
     * @param TagSpecification 实例云标签
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 实例过期时间（预付费） 
     * @return ExpiredAt 实例过期时间（预付费）
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set 实例过期时间（预付费）
     * @param ExpiredAt 实例过期时间（预付费）
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get 实例付费类型，0表示后付费，1表示预付费 
     * @return PayMod 实例付费类型，0表示后付费，1表示预付费
     */
    public Long getPayMod() {
        return this.PayMod;
    }

    /**
     * Set 实例付费类型，0表示后付费，1表示预付费
     * @param PayMod 实例付费类型，0表示后付费，1表示预付费
     */
    public void setPayMod(Long PayMod) {
        this.PayMod = PayMod;
    }

    /**
     * Get 预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知 
     * @return RenewFlag 预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知
     * @param RenewFlag 预付费续费标识，0表示手动续费，1表示自动续费，2不续费并且不通知
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 是否开启实例删除保护，false表示不开启 
     * @return DeletionProtection 是否开启实例删除保护，false表示不开启
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 是否开启实例删除保护，false表示不开启
     * @param DeletionProtection 是否开启实例删除保护，false表示不开启
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
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

    }
}

