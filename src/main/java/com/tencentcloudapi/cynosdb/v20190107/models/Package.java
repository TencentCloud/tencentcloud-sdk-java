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

public class Package extends AbstractModel {

    /**
    * AppID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 资源包唯一ID
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 资源包名称
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 资源包类型
CCU-计算资源包，DISK-存储资源包
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 资源包总量
    */
    @SerializedName("PackageTotalSpec")
    @Expose
    private Float PackageTotalSpec;

    /**
    * 资源包已使用量
    */
    @SerializedName("PackageUsedSpec")
    @Expose
    private Float PackageUsedSpec;

    /**
    * 是否还有库存余量
    */
    @SerializedName("HasQuota")
    @Expose
    private Boolean HasQuota;

    /**
    * 绑定实例信息
    */
    @SerializedName("BindInstanceInfos")
    @Expose
    private BindInstanceInfo [] BindInstanceInfos;

    /**
    * 生效时间：2022-07-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 失效时间：2022-08-01 00:00:00
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 资源包历史绑定（已解绑）实例信息
    */
    @SerializedName("HistoryBindResourceInfos")
    @Expose
    private BindInstanceInfo [] HistoryBindResourceInfos;

    /**
     * Get AppID 
     * @return AppId AppID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppID
     * @param AppId AppID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 资源包唯一ID 
     * @return PackageId 资源包唯一ID
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 资源包唯一ID
     * @param PackageId 资源包唯一ID
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 资源包名称 
     * @return PackageName 资源包名称
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 资源包名称
     * @param PackageName 资源包名称
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 资源包类型
CCU-计算资源包，DISK-存储资源包 
     * @return PackageType 资源包类型
CCU-计算资源包，DISK-存储资源包
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 资源包类型
CCU-计算资源包，DISK-存储资源包
     * @param PackageType 资源包类型
CCU-计算资源包，DISK-存储资源包
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用 
     * @return PackageRegion 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
     * @param PackageRegion 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。 
     * @return Status 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
     * @param Status 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 资源包总量 
     * @return PackageTotalSpec 资源包总量
     */
    public Float getPackageTotalSpec() {
        return this.PackageTotalSpec;
    }

    /**
     * Set 资源包总量
     * @param PackageTotalSpec 资源包总量
     */
    public void setPackageTotalSpec(Float PackageTotalSpec) {
        this.PackageTotalSpec = PackageTotalSpec;
    }

    /**
     * Get 资源包已使用量 
     * @return PackageUsedSpec 资源包已使用量
     */
    public Float getPackageUsedSpec() {
        return this.PackageUsedSpec;
    }

    /**
     * Set 资源包已使用量
     * @param PackageUsedSpec 资源包已使用量
     */
    public void setPackageUsedSpec(Float PackageUsedSpec) {
        this.PackageUsedSpec = PackageUsedSpec;
    }

    /**
     * Get 是否还有库存余量 
     * @return HasQuota 是否还有库存余量
     */
    public Boolean getHasQuota() {
        return this.HasQuota;
    }

    /**
     * Set 是否还有库存余量
     * @param HasQuota 是否还有库存余量
     */
    public void setHasQuota(Boolean HasQuota) {
        this.HasQuota = HasQuota;
    }

    /**
     * Get 绑定实例信息 
     * @return BindInstanceInfos 绑定实例信息
     */
    public BindInstanceInfo [] getBindInstanceInfos() {
        return this.BindInstanceInfos;
    }

    /**
     * Set 绑定实例信息
     * @param BindInstanceInfos 绑定实例信息
     */
    public void setBindInstanceInfos(BindInstanceInfo [] BindInstanceInfos) {
        this.BindInstanceInfos = BindInstanceInfos;
    }

    /**
     * Get 生效时间：2022-07-01 00:00:00 
     * @return StartTime 生效时间：2022-07-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 生效时间：2022-07-01 00:00:00
     * @param StartTime 生效时间：2022-07-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 失效时间：2022-08-01 00:00:00 
     * @return ExpireTime 失效时间：2022-08-01 00:00:00
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 失效时间：2022-08-01 00:00:00
     * @param ExpireTime 失效时间：2022-08-01 00:00:00
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 资源包历史绑定（已解绑）实例信息 
     * @return HistoryBindResourceInfos 资源包历史绑定（已解绑）实例信息
     */
    public BindInstanceInfo [] getHistoryBindResourceInfos() {
        return this.HistoryBindResourceInfos;
    }

    /**
     * Set 资源包历史绑定（已解绑）实例信息
     * @param HistoryBindResourceInfos 资源包历史绑定（已解绑）实例信息
     */
    public void setHistoryBindResourceInfos(BindInstanceInfo [] HistoryBindResourceInfos) {
        this.HistoryBindResourceInfos = HistoryBindResourceInfos;
    }

    public Package() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Package(Package source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.PackageRegion != null) {
            this.PackageRegion = new String(source.PackageRegion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PackageTotalSpec != null) {
            this.PackageTotalSpec = new Float(source.PackageTotalSpec);
        }
        if (source.PackageUsedSpec != null) {
            this.PackageUsedSpec = new Float(source.PackageUsedSpec);
        }
        if (source.HasQuota != null) {
            this.HasQuota = new Boolean(source.HasQuota);
        }
        if (source.BindInstanceInfos != null) {
            this.BindInstanceInfos = new BindInstanceInfo[source.BindInstanceInfos.length];
            for (int i = 0; i < source.BindInstanceInfos.length; i++) {
                this.BindInstanceInfos[i] = new BindInstanceInfo(source.BindInstanceInfos[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.HistoryBindResourceInfos != null) {
            this.HistoryBindResourceInfos = new BindInstanceInfo[source.HistoryBindResourceInfos.length];
            for (int i = 0; i < source.HistoryBindResourceInfos.length; i++) {
                this.HistoryBindResourceInfos[i] = new BindInstanceInfo(source.HistoryBindResourceInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PackageTotalSpec", this.PackageTotalSpec);
        this.setParamSimple(map, prefix + "PackageUsedSpec", this.PackageUsedSpec);
        this.setParamSimple(map, prefix + "HasQuota", this.HasQuota);
        this.setParamArrayObj(map, prefix + "BindInstanceInfos.", this.BindInstanceInfos);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArrayObj(map, prefix + "HistoryBindResourceInfos.", this.HistoryBindResourceInfos);

    }
}

