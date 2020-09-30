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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvInfo extends AbstractModel{

    /**
    * 账户下该环境唯一标识
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数据库列表
    */
    @SerializedName("Databases")
    @Expose
    private DatabasesInfo [] Databases;

    /**
    * 存储列表
    */
    @SerializedName("Storages")
    @Expose
    private StorageInfo [] Storages;

    /**
    * 函数列表
    */
    @SerializedName("Functions")
    @Expose
    private FunctionInfo [] Functions;

    /**
    * tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 云日志服务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogServices")
    @Expose
    private LogServiceInfo [] LogServices;

    /**
    * 静态资源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaticStorages")
    @Expose
    private StaticStorageInfo [] StaticStorages;

    /**
    * 是否到期自动降为免费版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAutoDegrade")
    @Expose
    private Boolean IsAutoDegrade;

    /**
    * 环境渠道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvChannel")
    @Expose
    private String EnvChannel;

    /**
    * 支付方式。包含以下取值：
<li> prepayment：预付费</li>
<li> postpaid：后付费</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 是否为默认环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 环境所属地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 账户下该环境唯一标识 
     * @return EnvId 账户下该环境唯一标识
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 账户下该环境唯一标识
     * @param EnvId 账户下该环境唯一标识
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li> 
     * @return Source 环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li>
     * @param Source 环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符 
     * @return Alias 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     * @param Alias 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后修改时间 
     * @return UpdateTime 最后修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后修改时间
     * @param UpdateTime 最后修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li> 
     * @return Status 环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     * @param Status 环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数据库列表 
     * @return Databases 数据库列表
     */
    public DatabasesInfo [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set 数据库列表
     * @param Databases 数据库列表
     */
    public void setDatabases(DatabasesInfo [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get 存储列表 
     * @return Storages 存储列表
     */
    public StorageInfo [] getStorages() {
        return this.Storages;
    }

    /**
     * Set 存储列表
     * @param Storages 存储列表
     */
    public void setStorages(StorageInfo [] Storages) {
        this.Storages = Storages;
    }

    /**
     * Get 函数列表 
     * @return Functions 函数列表
     */
    public FunctionInfo [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set 函数列表
     * @param Functions 函数列表
     */
    public void setFunctions(FunctionInfo [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName 套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName 套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 云日志服务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogServices 云日志服务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogServiceInfo [] getLogServices() {
        return this.LogServices;
    }

    /**
     * Set 云日志服务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogServices 云日志服务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogServices(LogServiceInfo [] LogServices) {
        this.LogServices = LogServices;
    }

    /**
     * Get 静态资源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaticStorages 静态资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StaticStorageInfo [] getStaticStorages() {
        return this.StaticStorages;
    }

    /**
     * Set 静态资源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaticStorages 静态资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaticStorages(StaticStorageInfo [] StaticStorages) {
        this.StaticStorages = StaticStorages;
    }

    /**
     * Get 是否到期自动降为免费版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAutoDegrade 是否到期自动降为免费版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAutoDegrade() {
        return this.IsAutoDegrade;
    }

    /**
     * Set 是否到期自动降为免费版
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAutoDegrade 是否到期自动降为免费版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAutoDegrade(Boolean IsAutoDegrade) {
        this.IsAutoDegrade = IsAutoDegrade;
    }

    /**
     * Get 环境渠道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvChannel 环境渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvChannel() {
        return this.EnvChannel;
    }

    /**
     * Set 环境渠道
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvChannel 环境渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvChannel(String EnvChannel) {
        this.EnvChannel = EnvChannel;
    }

    /**
     * Get 支付方式。包含以下取值：
<li> prepayment：预付费</li>
<li> postpaid：后付费</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 支付方式。包含以下取值：
<li> prepayment：预付费</li>
<li> postpaid：后付费</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 支付方式。包含以下取值：
<li> prepayment：预付费</li>
<li> postpaid：后付费</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 支付方式。包含以下取值：
<li> prepayment：预付费</li>
<li> postpaid：后付费</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 是否为默认环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault 是否为默认环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault 是否为默认环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 环境所属地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 环境所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 环境所属地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 环境所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);
        this.setParamArrayObj(map, prefix + "Storages.", this.Storages);
        this.setParamArrayObj(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamArrayObj(map, prefix + "LogServices.", this.LogServices);
        this.setParamArrayObj(map, prefix + "StaticStorages.", this.StaticStorages);
        this.setParamSimple(map, prefix + "IsAutoDegrade", this.IsAutoDegrade);
        this.setParamSimple(map, prefix + "EnvChannel", this.EnvChannel);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

