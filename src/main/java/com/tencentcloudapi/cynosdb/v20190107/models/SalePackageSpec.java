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

public class SalePackageSpec extends AbstractModel{

    /**
    * 资源包使用地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * 资源包类型
CCU-计算资源包
DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 当前版本资源包最小资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinPackageSpec")
    @Expose
    private Float MinPackageSpec;

    /**
    * 当前版本资源包最大资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxPackageSpec")
    @Expose
    private Float MaxPackageSpec;

    /**
    * 资源包有效期，单位:天
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireDay")
    @Expose
    private Long ExpireDay;

    /**
     * Get 资源包使用地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageRegion 资源包使用地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set 资源包使用地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageRegion 资源包使用地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get 资源包类型
CCU-计算资源包
DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageType 资源包类型
CCU-计算资源包
DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 资源包类型
CCU-计算资源包
DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageType 资源包类型
CCU-计算资源包
DISK-存储资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageVersion 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageVersion 资源包版本
base-基础版本，common-通用版本，enterprise-企业版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 当前版本资源包最小资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinPackageSpec 当前版本资源包最小资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMinPackageSpec() {
        return this.MinPackageSpec;
    }

    /**
     * Set 当前版本资源包最小资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinPackageSpec 当前版本资源包最小资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinPackageSpec(Float MinPackageSpec) {
        this.MinPackageSpec = MinPackageSpec;
    }

    /**
     * Get 当前版本资源包最大资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxPackageSpec 当前版本资源包最大资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMaxPackageSpec() {
        return this.MaxPackageSpec;
    }

    /**
     * Set 当前版本资源包最大资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxPackageSpec 当前版本资源包最大资源数，计算资源单位：个；存储资源：GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxPackageSpec(Float MaxPackageSpec) {
        this.MaxPackageSpec = MaxPackageSpec;
    }

    /**
     * Get 资源包有效期，单位:天
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireDay 资源包有效期，单位:天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireDay() {
        return this.ExpireDay;
    }

    /**
     * Set 资源包有效期，单位:天
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireDay 资源包有效期，单位:天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireDay(Long ExpireDay) {
        this.ExpireDay = ExpireDay;
    }

    public SalePackageSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SalePackageSpec(SalePackageSpec source) {
        if (source.PackageRegion != null) {
            this.PackageRegion = new String(source.PackageRegion);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.MinPackageSpec != null) {
            this.MinPackageSpec = new Float(source.MinPackageSpec);
        }
        if (source.MaxPackageSpec != null) {
            this.MaxPackageSpec = new Float(source.MaxPackageSpec);
        }
        if (source.ExpireDay != null) {
            this.ExpireDay = new Long(source.ExpireDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "MinPackageSpec", this.MinPackageSpec);
        this.setParamSimple(map, prefix + "MaxPackageSpec", this.MaxPackageSpec);
        this.setParamSimple(map, prefix + "ExpireDay", this.ExpireDay);

    }
}

