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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Package extends AbstractModel{

    /**
    * AppID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 资源包名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 资源包类型
CCU-计算资源包，DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 资源包总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageTotalSpec")
    @Expose
    private Float PackageTotalSpec;

    /**
    * 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageUsedSpec")
    @Expose
    private Float PackageUsedSpec;

    /**
    * 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasQuota")
    @Expose
    private Boolean HasQuota;

    /**
    * 绑定实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindInstanceInfos")
    @Expose
    private BindInstanceInfo [] BindInstanceInfos;

    /**
    * 生效时间：2022-07-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 失效时间：2022-08-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get AppID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId AppID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId AppID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 资源包名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName 资源包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 资源包名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName 资源包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 资源包类型
CCU-计算资源包，DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageType 资源包类型
CCU-计算资源包，DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 资源包类型
CCU-计算资源包，DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageType 资源包类型
CCU-计算资源包，DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageRegion 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageRegion 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源包状态
creating-创建中；
using-使用中；
expired-已过期；
normal_finish-使用完；
apply_refund-申请退费中；
refund-已退费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 资源包总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageTotalSpec 资源包总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPackageTotalSpec() {
        return this.PackageTotalSpec;
    }

    /**
     * Set 资源包总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageTotalSpec 资源包总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageTotalSpec(Float PackageTotalSpec) {
        this.PackageTotalSpec = PackageTotalSpec;
    }

    /**
     * Get 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageUsedSpec 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPackageUsedSpec() {
        return this.PackageUsedSpec;
    }

    /**
     * Set 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageUsedSpec 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageUsedSpec(Float PackageUsedSpec) {
        this.PackageUsedSpec = PackageUsedSpec;
    }

    /**
     * Get 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasQuota 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasQuota() {
        return this.HasQuota;
    }

    /**
     * Set 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasQuota 资源包已使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasQuota(Boolean HasQuota) {
        this.HasQuota = HasQuota;
    }

    /**
     * Get 绑定实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindInstanceInfos 绑定实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BindInstanceInfo [] getBindInstanceInfos() {
        return this.BindInstanceInfos;
    }

    /**
     * Set 绑定实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindInstanceInfos 绑定实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindInstanceInfos(BindInstanceInfo [] BindInstanceInfos) {
        this.BindInstanceInfos = BindInstanceInfos;
    }

    /**
     * Get 生效时间：2022-07-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 生效时间：2022-07-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 生效时间：2022-07-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 生效时间：2022-07-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 失效时间：2022-08-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 失效时间：2022-08-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 失效时间：2022-08-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 失效时间：2022-08-01 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
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

    }
}

