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

public class CreateResourcePackageRequest extends AbstractModel{

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 资源包使用地域
china-中国内地通用，overseas-港澳台及海外通用
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * 资源包类型：CCU-计算资源包，DISK-存储资源包
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 资源包大小，计算资源单位：万个；存储资源：GB
    */
    @SerializedName("PackageSpec")
    @Expose
    private Float PackageSpec;

    /**
    * 资源包有效期，单位:天
    */
    @SerializedName("ExpireDay")
    @Expose
    private Long ExpireDay;

    /**
    * 购买资源包个数
    */
    @SerializedName("PackageCount")
    @Expose
    private Long PackageCount;

    /**
    * 资源包名称
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
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
     * Get 资源包类型：CCU-计算资源包，DISK-存储资源包 
     * @return PackageType 资源包类型：CCU-计算资源包，DISK-存储资源包
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 资源包类型：CCU-计算资源包，DISK-存储资源包
     * @param PackageType 资源包类型：CCU-计算资源包，DISK-存储资源包
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本 
     * @return PackageVersion 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本
     * @param PackageVersion 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 资源包大小，计算资源单位：万个；存储资源：GB 
     * @return PackageSpec 资源包大小，计算资源单位：万个；存储资源：GB
     */
    public Float getPackageSpec() {
        return this.PackageSpec;
    }

    /**
     * Set 资源包大小，计算资源单位：万个；存储资源：GB
     * @param PackageSpec 资源包大小，计算资源单位：万个；存储资源：GB
     */
    public void setPackageSpec(Float PackageSpec) {
        this.PackageSpec = PackageSpec;
    }

    /**
     * Get 资源包有效期，单位:天 
     * @return ExpireDay 资源包有效期，单位:天
     */
    public Long getExpireDay() {
        return this.ExpireDay;
    }

    /**
     * Set 资源包有效期，单位:天
     * @param ExpireDay 资源包有效期，单位:天
     */
    public void setExpireDay(Long ExpireDay) {
        this.ExpireDay = ExpireDay;
    }

    /**
     * Get 购买资源包个数 
     * @return PackageCount 购买资源包个数
     */
    public Long getPackageCount() {
        return this.PackageCount;
    }

    /**
     * Set 购买资源包个数
     * @param PackageCount 购买资源包个数
     */
    public void setPackageCount(Long PackageCount) {
        this.PackageCount = PackageCount;
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

    public CreateResourcePackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourcePackageRequest(CreateResourcePackageRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.PackageRegion != null) {
            this.PackageRegion = new String(source.PackageRegion);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.PackageSpec != null) {
            this.PackageSpec = new Float(source.PackageSpec);
        }
        if (source.ExpireDay != null) {
            this.ExpireDay = new Long(source.ExpireDay);
        }
        if (source.PackageCount != null) {
            this.PackageCount = new Long(source.PackageCount);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "PackageSpec", this.PackageSpec);
        this.setParamSimple(map, prefix + "ExpireDay", this.ExpireDay);
        this.setParamSimple(map, prefix + "PackageCount", this.PackageCount);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

