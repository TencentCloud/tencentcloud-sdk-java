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

public class Customer extends AbstractModel {

    /**
    * <p>企业ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>企业名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>股权占比</p>
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p>
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * <p>创建账号</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>腾讯云客户AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>腾讯云客户Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
    * <p>周期测绘时间</p>
    */
    @SerializedName("ScanCron")
    @Expose
    private String ScanCron;

    /**
    * <p>是否启用周期测绘</p>
    */
    @SerializedName("EnableCron")
    @Expose
    private Boolean EnableCron;

    /**
    * <p>是否扫描子公司</p>
    */
    @SerializedName("EnableScanSubEnterprise")
    @Expose
    private Boolean EnableScanSubEnterprise;

    /**
    * <p>是否授权</p>
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * <p>授权开始时间</p>
    */
    @SerializedName("AuthStartAt")
    @Expose
    private String AuthStartAt;

    /**
    * <p>授权结束时间</p>
    */
    @SerializedName("AuthEndAt")
    @Expose
    private String AuthEndAt;

    /**
    * <p>授权文件id</p>
    */
    @SerializedName("AuthFile")
    @Expose
    private String AuthFile;

    /**
    * <p>测绘时间配置项</p>
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * <p>图标</p>
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * <p>关键字</p>
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * <p>Qps设置，10-500，默认100</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>子公司拓展层次</p>
    */
    @SerializedName("SubCompanyLevel")
    @Expose
    private Long SubCompanyLevel;

    /**
    * <p>是否包含完整扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIncludeFullScan")
    @Expose
    private Boolean IsIncludeFullScan;

    /**
    * <p>是否识别集团成员</p>
    */
    @SerializedName("EnableGroupMemberDiscovered")
    @Expose
    private Boolean EnableGroupMemberDiscovered;

    /**
    * <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p>
    */
    @SerializedName("SingleIPTaskLimit")
    @Expose
    private Long SingleIPTaskLimit;

    /**
    * <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p>
    */
    @SerializedName("PortScanQps")
    @Expose
    private Long PortScanQps;

    /**
     * Get <p>企业ID</p> 
     * @return Id <p>企业ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>企业ID</p>
     * @param Id <p>企业ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>企业名称</p> 
     * @return Name <p>企业名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>企业名称</p>
     * @param Name <p>企业名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>股权占比</p> 
     * @return Percent <p>股权占比</p>
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set <p>股权占比</p>
     * @param Percent <p>股权占比</p>
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p> 
     * @return ScanType <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p>
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p>
     * @param ScanType <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p>
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>创建账号</p> 
     * @return Creator <p>创建账号</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建账号</p>
     * @param Creator <p>创建账号</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>腾讯云客户AppId</p> 
     * @return AppId <p>腾讯云客户AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>腾讯云客户AppId</p>
     * @param AppId <p>腾讯云客户AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>腾讯云客户Uin</p> 
     * @return Uin <p>腾讯云客户Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>腾讯云客户Uin</p>
     * @param Uin <p>腾讯云客户Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateAt <p>创建时间</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateAt <p>创建时间</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateAt <p>更新时间</p>
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateAt <p>更新时间</p>
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    /**
     * Get <p>周期测绘时间</p> 
     * @return ScanCron <p>周期测绘时间</p>
     */
    public String getScanCron() {
        return this.ScanCron;
    }

    /**
     * Set <p>周期测绘时间</p>
     * @param ScanCron <p>周期测绘时间</p>
     */
    public void setScanCron(String ScanCron) {
        this.ScanCron = ScanCron;
    }

    /**
     * Get <p>是否启用周期测绘</p> 
     * @return EnableCron <p>是否启用周期测绘</p>
     */
    public Boolean getEnableCron() {
        return this.EnableCron;
    }

    /**
     * Set <p>是否启用周期测绘</p>
     * @param EnableCron <p>是否启用周期测绘</p>
     */
    public void setEnableCron(Boolean EnableCron) {
        this.EnableCron = EnableCron;
    }

    /**
     * Get <p>是否扫描子公司</p> 
     * @return EnableScanSubEnterprise <p>是否扫描子公司</p>
     */
    public Boolean getEnableScanSubEnterprise() {
        return this.EnableScanSubEnterprise;
    }

    /**
     * Set <p>是否扫描子公司</p>
     * @param EnableScanSubEnterprise <p>是否扫描子公司</p>
     */
    public void setEnableScanSubEnterprise(Boolean EnableScanSubEnterprise) {
        this.EnableScanSubEnterprise = EnableScanSubEnterprise;
    }

    /**
     * Get <p>是否授权</p> 
     * @return EnableAuth <p>是否授权</p>
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set <p>是否授权</p>
     * @param EnableAuth <p>是否授权</p>
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get <p>授权开始时间</p> 
     * @return AuthStartAt <p>授权开始时间</p>
     */
    public String getAuthStartAt() {
        return this.AuthStartAt;
    }

    /**
     * Set <p>授权开始时间</p>
     * @param AuthStartAt <p>授权开始时间</p>
     */
    public void setAuthStartAt(String AuthStartAt) {
        this.AuthStartAt = AuthStartAt;
    }

    /**
     * Get <p>授权结束时间</p> 
     * @return AuthEndAt <p>授权结束时间</p>
     */
    public String getAuthEndAt() {
        return this.AuthEndAt;
    }

    /**
     * Set <p>授权结束时间</p>
     * @param AuthEndAt <p>授权结束时间</p>
     */
    public void setAuthEndAt(String AuthEndAt) {
        this.AuthEndAt = AuthEndAt;
    }

    /**
     * Get <p>授权文件id</p> 
     * @return AuthFile <p>授权文件id</p>
     */
    public String getAuthFile() {
        return this.AuthFile;
    }

    /**
     * Set <p>授权文件id</p>
     * @param AuthFile <p>授权文件id</p>
     */
    public void setAuthFile(String AuthFile) {
        this.AuthFile = AuthFile;
    }

    /**
     * Get <p>测绘时间配置项</p> 
     * @return ScanTime <p>测绘时间配置项</p>
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set <p>测绘时间配置项</p>
     * @param ScanTime <p>测绘时间配置项</p>
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get <p>图标</p> 
     * @return Icon <p>图标</p>
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set <p>图标</p>
     * @param Icon <p>图标</p>
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get <p>关键字</p> 
     * @return Keywords <p>关键字</p>
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>关键字</p>
     * @param Keywords <p>关键字</p>
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>Qps设置，10-500，默认100</p> 
     * @return Qps <p>Qps设置，10-500，默认100</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>Qps设置，10-500，默认100</p>
     * @param Qps <p>Qps设置，10-500，默认100</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>子公司拓展层次</p> 
     * @return SubCompanyLevel <p>子公司拓展层次</p>
     */
    public Long getSubCompanyLevel() {
        return this.SubCompanyLevel;
    }

    /**
     * Set <p>子公司拓展层次</p>
     * @param SubCompanyLevel <p>子公司拓展层次</p>
     */
    public void setSubCompanyLevel(Long SubCompanyLevel) {
        this.SubCompanyLevel = SubCompanyLevel;
    }

    /**
     * Get <p>是否包含完整扫描</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIncludeFullScan <p>是否包含完整扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsIncludeFullScan() {
        return this.IsIncludeFullScan;
    }

    /**
     * Set <p>是否包含完整扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIncludeFullScan <p>是否包含完整扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIncludeFullScan(Boolean IsIncludeFullScan) {
        this.IsIncludeFullScan = IsIncludeFullScan;
    }

    /**
     * Get <p>是否识别集团成员</p> 
     * @return EnableGroupMemberDiscovered <p>是否识别集团成员</p>
     */
    public Boolean getEnableGroupMemberDiscovered() {
        return this.EnableGroupMemberDiscovered;
    }

    /**
     * Set <p>是否识别集团成员</p>
     * @param EnableGroupMemberDiscovered <p>是否识别集团成员</p>
     */
    public void setEnableGroupMemberDiscovered(Boolean EnableGroupMemberDiscovered) {
        this.EnableGroupMemberDiscovered = EnableGroupMemberDiscovered;
    }

    /**
     * Get <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p> 
     * @return SingleIPTaskLimit <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p>
     */
    public Long getSingleIPTaskLimit() {
        return this.SingleIPTaskLimit;
    }

    /**
     * Set <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p>
     * @param SingleIPTaskLimit <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p>
     */
    public void setSingleIPTaskLimit(Long SingleIPTaskLimit) {
        this.SingleIPTaskLimit = SingleIPTaskLimit;
    }

    /**
     * Get <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p> 
     * @return PortScanQps <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p>
     */
    public Long getPortScanQps() {
        return this.PortScanQps;
    }

    /**
     * Set <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p>
     * @param PortScanQps <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p>
     */
    public void setPortScanQps(Long PortScanQps) {
        this.PortScanQps = PortScanQps;
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
        if (source.SingleIPTaskLimit != null) {
            this.SingleIPTaskLimit = new Long(source.SingleIPTaskLimit);
        }
        if (source.PortScanQps != null) {
            this.PortScanQps = new Long(source.PortScanQps);
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
        this.setParamSimple(map, prefix + "SingleIPTaskLimit", this.SingleIPTaskLimit);
        this.setParamSimple(map, prefix + "PortScanQps", this.PortScanQps);

    }
}

