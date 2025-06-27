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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Customer extends AbstractModel {

    /**
    * 企业ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 企业名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 股权占比
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
    * 创建账号
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 腾讯云客户AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 腾讯云客户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 创建时间
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
    * 周期测绘时间
    */
    @SerializedName("ScanCron")
    @Expose
    private String ScanCron;

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
    * 测绘时间配置项
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 图标
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 关键字
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * Qps设置，10-500，默认100
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
    * 是否包含完整扫描
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIncludeFullScan")
    @Expose
    private Boolean IsIncludeFullScan;

    /**
    * 是否识别集团成员
    */
    @SerializedName("EnableGroupMemberDiscovered")
    @Expose
    private Boolean EnableGroupMemberDiscovered;

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
     * Get 股权占比 
     * @return Percent 股权占比
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 股权占比
     * @param Percent 股权占比
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
     * Get 创建账号 
     * @return Creator 创建账号
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建账号
     * @param Creator 创建账号
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 腾讯云客户AppId 
     * @return AppId 腾讯云客户AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 腾讯云客户AppId
     * @param AppId 腾讯云客户AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 腾讯云客户Uin 
     * @return Uin 腾讯云客户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云客户Uin
     * @param Uin 腾讯云客户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 创建时间 
     * @return CreateAt 创建时间
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 创建时间
     * @param CreateAt 创建时间
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 更新时间 
     * @return UpdateAt 更新时间
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set 更新时间
     * @param UpdateAt 更新时间
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
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
     * Get 测绘时间配置项 
     * @return ScanTime 测绘时间配置项
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 测绘时间配置项
     * @param ScanTime 测绘时间配置项
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 图标 
     * @return Icon 图标
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 图标
     * @param Icon 图标
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 关键字 
     * @return Keywords 关键字
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 关键字
     * @param Keywords 关键字
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get Qps设置，10-500，默认100 
     * @return Qps Qps设置，10-500，默认100
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Qps设置，10-500，默认100
     * @param Qps Qps设置，10-500，默认100
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
     * Get 是否包含完整扫描
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIncludeFullScan 是否包含完整扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsIncludeFullScan() {
        return this.IsIncludeFullScan;
    }

    /**
     * Set 是否包含完整扫描
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIncludeFullScan 是否包含完整扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIncludeFullScan(Boolean IsIncludeFullScan) {
        this.IsIncludeFullScan = IsIncludeFullScan;
    }

    /**
     * Get 是否识别集团成员 
     * @return EnableGroupMemberDiscovered 是否识别集团成员
     */
    public Boolean getEnableGroupMemberDiscovered() {
        return this.EnableGroupMemberDiscovered;
    }

    /**
     * Set 是否识别集团成员
     * @param EnableGroupMemberDiscovered 是否识别集团成员
     */
    public void setEnableGroupMemberDiscovered(Boolean EnableGroupMemberDiscovered) {
        this.EnableGroupMemberDiscovered = EnableGroupMemberDiscovered;
    }

    public Customer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Customer(Customer source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
        if (source.ScanCron != null) {
            this.ScanCron = new String(source.ScanCron);
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
        if (source.Keywords != null) {
            this.Keywords = new String(source.Keywords);
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
        if (source.EnableGroupMemberDiscovered != null) {
            this.EnableGroupMemberDiscovered = new Boolean(source.EnableGroupMemberDiscovered);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);
        this.setParamSimple(map, prefix + "ScanCron", this.ScanCron);
        this.setParamSimple(map, prefix + "EnableCron", this.EnableCron);
        this.setParamSimple(map, prefix + "EnableScanSubEnterprise", this.EnableScanSubEnterprise);
        this.setParamSimple(map, prefix + "EnableAuth", this.EnableAuth);
        this.setParamSimple(map, prefix + "AuthStartAt", this.AuthStartAt);
        this.setParamSimple(map, prefix + "AuthEndAt", this.AuthEndAt);
        this.setParamSimple(map, prefix + "AuthFile", this.AuthFile);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "SubCompanyLevel", this.SubCompanyLevel);
        this.setParamSimple(map, prefix + "IsIncludeFullScan", this.IsIncludeFullScan);
        this.setParamSimple(map, prefix + "EnableGroupMemberDiscovered", this.EnableGroupMemberDiscovered);

    }
}

