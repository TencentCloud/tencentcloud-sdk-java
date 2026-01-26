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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstance extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 产品编码
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品编码
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 地域编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 实例状态：
NORMAL 正常，
ISOLATED 已隔离
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 续费标识：
NOTIFY_AND_MANUAL_RENEW 手动续费，
NOTIFY_AND_AUTO_RENEW 自动续费，
DISABLE_NOTIFY_AND_MANUAL_RENEW 到期不续
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 实例到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 实例别名：用户在控制台为实例设置的名称，如果未设置，则默认为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 产品名称：用户所采购的各类云产品，例如：云服务器 CVM
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 项目名称：实例归属的项目，用户在控制台给实例自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 自动续费周期长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewPeriod")
    @Expose
    private Long RenewPeriod;

    /**
    * 自动续费周期单位：y 年，m 月
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewPeriodUnit")
    @Expose
    private String RenewPeriodUnit;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 产品编码 
     * @return ProductCode 产品编码
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品编码
     * @param ProductCode 产品编码
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子产品编码 
     * @return SubProductCode 子产品编码
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品编码
     * @param SubProductCode 子产品编码
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 地域编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionCode 地域编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地域编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionCode 地域编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 实例状态：
NORMAL 正常，
ISOLATED 已隔离
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例状态：
NORMAL 正常，
ISOLATED 已隔离
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态：
NORMAL 正常，
ISOLATED 已隔离
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例状态：
NORMAL 正常，
ISOLATED 已隔离
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 续费标识：
NOTIFY_AND_MANUAL_RENEW 手动续费，
NOTIFY_AND_AUTO_RENEW 自动续费，
DISABLE_NOTIFY_AND_MANUAL_RENEW 到期不续
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 续费标识：
NOTIFY_AND_MANUAL_RENEW 手动续费，
NOTIFY_AND_AUTO_RENEW 自动续费，
DISABLE_NOTIFY_AND_MANUAL_RENEW 到期不续
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标识：
NOTIFY_AND_MANUAL_RENEW 手动续费，
NOTIFY_AND_AUTO_RENEW 自动续费，
DISABLE_NOTIFY_AND_MANUAL_RENEW 到期不续
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 续费标识：
NOTIFY_AND_MANUAL_RENEW 手动续费，
NOTIFY_AND_AUTO_RENEW 自动续费，
DISABLE_NOTIFY_AND_MANUAL_RENEW 到期不续
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 实例到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 实例到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 实例到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 实例到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 实例别名：用户在控制台为实例设置的名称，如果未设置，则默认为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例别名：用户在控制台为实例设置的名称，如果未设置，则默认为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例别名：用户在控制台为实例设置的名称，如果未设置，则默认为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例别名：用户在控制台为实例设置的名称，如果未设置，则默认为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 产品名称：用户所采购的各类云产品，例如：云服务器 CVM
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 产品名称：用户所采购的各类云产品，例如：云服务器 CVM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称：用户所采购的各类云产品，例如：云服务器 CVM
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 产品名称：用户所采购的各类云产品，例如：云服务器 CVM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 项目名称：实例归属的项目，用户在控制台给实例自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称：实例归属的项目，用户在控制台给实例自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称：实例归属的项目，用户在控制台给实例自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称：实例归属的项目，用户在控制台给实例自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 自动续费周期长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewPeriod 自动续费周期长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewPeriod() {
        return this.RenewPeriod;
    }

    /**
     * Set 自动续费周期长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewPeriod 自动续费周期长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewPeriod(Long RenewPeriod) {
        this.RenewPeriod = RenewPeriod;
    }

    /**
     * Get 自动续费周期单位：y 年，m 月
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewPeriodUnit 自动续费周期单位：y 年，m 月
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewPeriodUnit() {
        return this.RenewPeriodUnit;
    }

    /**
     * Set 自动续费周期单位：y 年，m 月
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewPeriodUnit 自动续费周期单位：y 年，m 月
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewPeriodUnit(String RenewPeriodUnit) {
        this.RenewPeriodUnit = RenewPeriodUnit;
    }

    public RenewInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstance(RenewInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RenewPeriod != null) {
            this.RenewPeriod = new Long(source.RenewPeriod);
        }
        if (source.RenewPeriodUnit != null) {
            this.RenewPeriodUnit = new String(source.RenewPeriodUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RenewPeriod", this.RenewPeriod);
        this.setParamSimple(map, prefix + "RenewPeriodUnit", this.RenewPeriodUnit);

    }
}

