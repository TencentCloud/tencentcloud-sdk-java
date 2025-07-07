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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCustomerRequest extends AbstractModel {

    /**
    * 企业名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 百分比取值范围为30-100
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * 企业ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 周期测绘时间
    */
    @SerializedName("ScanCron")
    @Expose
    private String ScanCron;

    /**
    * 是否立即启动
    */
    @SerializedName("IsScanNow")
    @Expose
    private Boolean IsScanNow;

    /**
    * 是否启用周期测绘
    */
    @SerializedName("EnableCron")
    @Expose
    private Boolean EnableCron;

    /**
    * 是否扫描子公司
    */
    @SerializedName("EnableScanSubEnterprise")
    @Expose
    private Boolean EnableScanSubEnterprise;

    /**
    * 是否授权
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * 授权开始时间
    */
    @SerializedName("AuthStartAt")
    @Expose
    private String AuthStartAt;

    /**
    * 授权结束时间
    */
    @SerializedName("AuthEndAt")
    @Expose
    private String AuthEndAt;

    /**
    * 授权文件id
    */
    @SerializedName("AuthFile")
    @Expose
    private String AuthFile;

    /**
    * 测绘时间配置项，采用json字符串格式
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 企业图标
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 并发
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 子公司拓展层次
    */
    @SerializedName("SubCompanyLevel")
    @Expose
    private Long SubCompanyLevel;

    /**
    * 是否包含完整的扫描
    */
    @SerializedName("IsIncludeFullScan")
    @Expose
    private Boolean IsIncludeFullScan;

    /**
     * Get 企业名称 
     * @return Name 企业名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 企业名称
     * @param Name 企业名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 百分比取值范围为30-100 
     * @return Percent 百分比取值范围为30-100
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 百分比取值范围为30-100
     * @param Percent 百分比取值范围为30-100
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息 
     * @return ScanType 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息
     * @param ScanType 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get 企业ID 
     * @return Id 企业ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 企业ID
     * @param Id 企业ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 周期测绘时间 
     * @return ScanCron 周期测绘时间
     */
    public String getScanCron() {
        return this.ScanCron;
    }

    /**
     * Set 周期测绘时间
     * @param ScanCron 周期测绘时间
     */
    public void setScanCron(String ScanCron) {
        this.ScanCron = ScanCron;
    }

    /**
     * Get 是否立即启动 
     * @return IsScanNow 是否立即启动
     */
    public Boolean getIsScanNow() {
        return this.IsScanNow;
    }

    /**
     * Set 是否立即启动
     * @param IsScanNow 是否立即启动
     */
    public void setIsScanNow(Boolean IsScanNow) {
        this.IsScanNow = IsScanNow;
    }

    /**
     * Get 是否启用周期测绘 
     * @return EnableCron 是否启用周期测绘
     */
    public Boolean getEnableCron() {
        return this.EnableCron;
    }

    /**
     * Set 是否启用周期测绘
     * @param EnableCron 是否启用周期测绘
     */
    public void setEnableCron(Boolean EnableCron) {
        this.EnableCron = EnableCron;
    }

    /**
     * Get 是否扫描子公司 
     * @return EnableScanSubEnterprise 是否扫描子公司
     */
    public Boolean getEnableScanSubEnterprise() {
        return this.EnableScanSubEnterprise;
    }

    /**
     * Set 是否扫描子公司
     * @param EnableScanSubEnterprise 是否扫描子公司
     */
    public void setEnableScanSubEnterprise(Boolean EnableScanSubEnterprise) {
        this.EnableScanSubEnterprise = EnableScanSubEnterprise;
    }

    /**
     * Get 是否授权 
     * @return EnableAuth 是否授权
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set 是否授权
     * @param EnableAuth 是否授权
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get 授权开始时间 
     * @return AuthStartAt 授权开始时间
     */
    public String getAuthStartAt() {
        return this.AuthStartAt;
    }

    /**
     * Set 授权开始时间
     * @param AuthStartAt 授权开始时间
     */
    public void setAuthStartAt(String AuthStartAt) {
        this.AuthStartAt = AuthStartAt;
    }

    /**
     * Get 授权结束时间 
     * @return AuthEndAt 授权结束时间
     */
    public String getAuthEndAt() {
        return this.AuthEndAt;
    }

    /**
     * Set 授权结束时间
     * @param AuthEndAt 授权结束时间
     */
    public void setAuthEndAt(String AuthEndAt) {
        this.AuthEndAt = AuthEndAt;
    }

    /**
     * Get 授权文件id 
     * @return AuthFile 授权文件id
     */
    public String getAuthFile() {
        return this.AuthFile;
    }

    /**
     * Set 授权文件id
     * @param AuthFile 授权文件id
     */
    public void setAuthFile(String AuthFile) {
        this.AuthFile = AuthFile;
    }

    /**
     * Get 测绘时间配置项，采用json字符串格式 
     * @return ScanTime 测绘时间配置项，采用json字符串格式
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 测绘时间配置项，采用json字符串格式
     * @param ScanTime 测绘时间配置项，采用json字符串格式
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 企业图标 
     * @return Icon 企业图标
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 企业图标
     * @param Icon 企业图标
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 并发 
     * @return Qps 并发
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 并发
     * @param Qps 并发
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 子公司拓展层次 
     * @return SubCompanyLevel 子公司拓展层次
     */
    public Long getSubCompanyLevel() {
        return this.SubCompanyLevel;
    }

    /**
     * Set 子公司拓展层次
     * @param SubCompanyLevel 子公司拓展层次
     */
    public void setSubCompanyLevel(Long SubCompanyLevel) {
        this.SubCompanyLevel = SubCompanyLevel;
    }

    /**
     * Get 是否包含完整的扫描 
     * @return IsIncludeFullScan 是否包含完整的扫描
     */
    public Boolean getIsIncludeFullScan() {
        return this.IsIncludeFullScan;
    }

    /**
     * Set 是否包含完整的扫描
     * @param IsIncludeFullScan 是否包含完整的扫描
     */
    public void setIsIncludeFullScan(Boolean IsIncludeFullScan) {
        this.IsIncludeFullScan = IsIncludeFullScan;
    }

    public ModifyCustomerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomerRequest(ModifyCustomerRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ScanCron != null) {
            this.ScanCron = new String(source.ScanCron);
        }
        if (source.IsScanNow != null) {
            this.IsScanNow = new Boolean(source.IsScanNow);
        }
        if (source.EnableCron != null) {
            this.EnableCron = new Boolean(source.EnableCron);
        }
        if (source.EnableScanSubEnterprise != null) {
            this.EnableScanSubEnterprise = new Boolean(source.EnableScanSubEnterprise);
        }
        if (source.EnableAuth != null) {
            this.EnableAuth = new Boolean(source.EnableAuth);
        }
        if (source.AuthStartAt != null) {
            this.AuthStartAt = new String(source.AuthStartAt);
        }
        if (source.AuthEndAt != null) {
            this.AuthEndAt = new String(source.AuthEndAt);
        }
        if (source.AuthFile != null) {
            this.AuthFile = new String(source.AuthFile);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.SubCompanyLevel != null) {
            this.SubCompanyLevel = new Long(source.SubCompanyLevel);
        }
        if (source.IsIncludeFullScan != null) {
            this.IsIncludeFullScan = new Boolean(source.IsIncludeFullScan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ScanCron", this.ScanCron);
        this.setParamSimple(map, prefix + "IsScanNow", this.IsScanNow);
        this.setParamSimple(map, prefix + "EnableCron", this.EnableCron);
        this.setParamSimple(map, prefix + "EnableScanSubEnterprise", this.EnableScanSubEnterprise);
        this.setParamSimple(map, prefix + "EnableAuth", this.EnableAuth);
        this.setParamSimple(map, prefix + "AuthStartAt", this.AuthStartAt);
        this.setParamSimple(map, prefix + "AuthEndAt", this.AuthEndAt);
        this.setParamSimple(map, prefix + "AuthFile", this.AuthFile);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "SubCompanyLevel", this.SubCompanyLevel);
        this.setParamSimple(map, prefix + "IsIncludeFullScan", this.IsIncludeFullScan);

    }
}

