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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvInfo extends AbstractModel {

    /**
    * <p>账户下该环境唯一标识</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>环境来源。包含以下取值：</p><li>miniapp：微信小程序</li><li>qcloud ：腾讯云</li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最后修改时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>环境状态。包含以下取值：</p><li>NORMAL：正常可用</li><li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>数据库列表</p>
    */
    @SerializedName("Databases")
    @Expose
    private DatabasesInfo [] Databases;

    /**
    * <p>存储列表</p>
    */
    @SerializedName("Storages")
    @Expose
    private StorageInfo [] Storages;

    /**
    * <p>函数列表</p>
    */
    @SerializedName("Functions")
    @Expose
    private FunctionInfo [] Functions;

    /**
    * <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p>
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * <p>套餐中文名称，参考DescribePackages接口的返回值。</p>
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * <p>云日志服务列表</p>
    */
    @SerializedName("LogServices")
    @Expose
    private LogServiceInfo [] LogServices;

    /**
    * <p>静态资源信息</p>
    */
    @SerializedName("StaticStorages")
    @Expose
    private StaticStorageInfo [] StaticStorages;

    /**
    * <p>是否到期自动降为免费版</p>
    */
    @SerializedName("IsAutoDegrade")
    @Expose
    private Boolean IsAutoDegrade;

    /**
    * <p>环境渠道</p>
    */
    @SerializedName("EnvChannel")
    @Expose
    private String EnvChannel;

    /**
    * <p>支付方式。包含以下取值：</p><li> prepayment：预付费</li><li> postpaid：后付费</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>是否为默认环境</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * <p>环境所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>环境标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>自定义日志服务</p>
    */
    @SerializedName("CustomLogServices")
    @Expose
    private ClsInfo [] CustomLogServices;

    /**
    * <p>环境类型：baas, run, hoting, weda</p>
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * <p>是否是dau新套餐</p>
    */
    @SerializedName("IsDauPackage")
    @Expose
    private Boolean IsDauPackage;

    /**
    * <p>套餐类型:空\baas\tcbr</p>
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * <p>架构类型</p>
    */
    @SerializedName("ArchitectureType")
    @Expose
    private String ArchitectureType;

    /**
    * <p>回收标志，默认为空</p>
    */
    @SerializedName("Recycle")
    @Expose
    private String Recycle;

    /**
     * Get <p>账户下该环境唯一标识</p> 
     * @return EnvId <p>账户下该环境唯一标识</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>账户下该环境唯一标识</p>
     * @param EnvId <p>账户下该环境唯一标识</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>环境来源。包含以下取值：</p><li>miniapp：微信小程序</li><li>qcloud ：腾讯云</li> 
     * @return Source <p>环境来源。包含以下取值：</p><li>miniapp：微信小程序</li><li>qcloud ：腾讯云</li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>环境来源。包含以下取值：</p><li>miniapp：微信小程序</li><li>qcloud ：腾讯云</li>
     * @param Source <p>环境来源。包含以下取值：</p><li>miniapp：微信小程序</li><li>qcloud ：腾讯云</li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p> 
     * @return Alias <p>环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p>
     * @param Alias <p>环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后修改时间</p> 
     * @return UpdateTime <p>最后修改时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后修改时间</p>
     * @param UpdateTime <p>最后修改时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>环境状态。包含以下取值：</p><li>NORMAL：正常可用</li><li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li> 
     * @return Status <p>环境状态。包含以下取值：</p><li>NORMAL：正常可用</li><li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>环境状态。包含以下取值：</p><li>NORMAL：正常可用</li><li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     * @param Status <p>环境状态。包含以下取值：</p><li>NORMAL：正常可用</li><li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据库列表</p> 
     * @return Databases <p>数据库列表</p>
     */
    public DatabasesInfo [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set <p>数据库列表</p>
     * @param Databases <p>数据库列表</p>
     */
    public void setDatabases(DatabasesInfo [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get <p>存储列表</p> 
     * @return Storages <p>存储列表</p>
     */
    public StorageInfo [] getStorages() {
        return this.Storages;
    }

    /**
     * Set <p>存储列表</p>
     * @param Storages <p>存储列表</p>
     */
    public void setStorages(StorageInfo [] Storages) {
        this.Storages = Storages;
    }

    /**
     * Get <p>函数列表</p> 
     * @return Functions <p>函数列表</p>
     */
    public FunctionInfo [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set <p>函数列表</p>
     * @param Functions <p>函数列表</p>
     */
    public void setFunctions(FunctionInfo [] Functions) {
        this.Functions = Functions;
    }

    /**
     * Get <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p> 
     * @return PackageId <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p>
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p>
     * @param PackageId <p>tcb产品套餐ID，参考DescribePackages接口的返回值。</p>
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get <p>套餐中文名称，参考DescribePackages接口的返回值。</p> 
     * @return PackageName <p>套餐中文名称，参考DescribePackages接口的返回值。</p>
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set <p>套餐中文名称，参考DescribePackages接口的返回值。</p>
     * @param PackageName <p>套餐中文名称，参考DescribePackages接口的返回值。</p>
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get <p>云日志服务列表</p> 
     * @return LogServices <p>云日志服务列表</p>
     */
    public LogServiceInfo [] getLogServices() {
        return this.LogServices;
    }

    /**
     * Set <p>云日志服务列表</p>
     * @param LogServices <p>云日志服务列表</p>
     */
    public void setLogServices(LogServiceInfo [] LogServices) {
        this.LogServices = LogServices;
    }

    /**
     * Get <p>静态资源信息</p> 
     * @return StaticStorages <p>静态资源信息</p>
     */
    public StaticStorageInfo [] getStaticStorages() {
        return this.StaticStorages;
    }

    /**
     * Set <p>静态资源信息</p>
     * @param StaticStorages <p>静态资源信息</p>
     */
    public void setStaticStorages(StaticStorageInfo [] StaticStorages) {
        this.StaticStorages = StaticStorages;
    }

    /**
     * Get <p>是否到期自动降为免费版</p> 
     * @return IsAutoDegrade <p>是否到期自动降为免费版</p>
     */
    public Boolean getIsAutoDegrade() {
        return this.IsAutoDegrade;
    }

    /**
     * Set <p>是否到期自动降为免费版</p>
     * @param IsAutoDegrade <p>是否到期自动降为免费版</p>
     */
    public void setIsAutoDegrade(Boolean IsAutoDegrade) {
        this.IsAutoDegrade = IsAutoDegrade;
    }

    /**
     * Get <p>环境渠道</p> 
     * @return EnvChannel <p>环境渠道</p>
     */
    public String getEnvChannel() {
        return this.EnvChannel;
    }

    /**
     * Set <p>环境渠道</p>
     * @param EnvChannel <p>环境渠道</p>
     */
    public void setEnvChannel(String EnvChannel) {
        this.EnvChannel = EnvChannel;
    }

    /**
     * Get <p>支付方式。包含以下取值：</p><li> prepayment：预付费</li><li> postpaid：后付费</li> 
     * @return PayMode <p>支付方式。包含以下取值：</p><li> prepayment：预付费</li><li> postpaid：后付费</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>支付方式。包含以下取值：</p><li> prepayment：预付费</li><li> postpaid：后付费</li>
     * @param PayMode <p>支付方式。包含以下取值：</p><li> prepayment：预付费</li><li> postpaid：后付费</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>是否为默认环境</p> 
     * @return IsDefault <p>是否为默认环境</p>
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否为默认环境</p>
     * @param IsDefault <p>是否为默认环境</p>
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>环境所属地域</p> 
     * @return Region <p>环境所属地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>环境所属地域</p>
     * @param Region <p>环境所属地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>环境标签列表</p> 
     * @return Tags <p>环境标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>环境标签列表</p>
     * @param Tags <p>环境标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>自定义日志服务</p> 
     * @return CustomLogServices <p>自定义日志服务</p>
     */
    public ClsInfo [] getCustomLogServices() {
        return this.CustomLogServices;
    }

    /**
     * Set <p>自定义日志服务</p>
     * @param CustomLogServices <p>自定义日志服务</p>
     */
    public void setCustomLogServices(ClsInfo [] CustomLogServices) {
        this.CustomLogServices = CustomLogServices;
    }

    /**
     * Get <p>环境类型：baas, run, hoting, weda</p> 
     * @return EnvType <p>环境类型：baas, run, hoting, weda</p>
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set <p>环境类型：baas, run, hoting, weda</p>
     * @param EnvType <p>环境类型：baas, run, hoting, weda</p>
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get <p>是否是dau新套餐</p> 
     * @return IsDauPackage <p>是否是dau新套餐</p>
     */
    public Boolean getIsDauPackage() {
        return this.IsDauPackage;
    }

    /**
     * Set <p>是否是dau新套餐</p>
     * @param IsDauPackage <p>是否是dau新套餐</p>
     */
    public void setIsDauPackage(Boolean IsDauPackage) {
        this.IsDauPackage = IsDauPackage;
    }

    /**
     * Get <p>套餐类型:空\baas\tcbr</p> 
     * @return PackageType <p>套餐类型:空\baas\tcbr</p>
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>套餐类型:空\baas\tcbr</p>
     * @param PackageType <p>套餐类型:空\baas\tcbr</p>
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>架构类型</p> 
     * @return ArchitectureType <p>架构类型</p>
     */
    public String getArchitectureType() {
        return this.ArchitectureType;
    }

    /**
     * Set <p>架构类型</p>
     * @param ArchitectureType <p>架构类型</p>
     */
    public void setArchitectureType(String ArchitectureType) {
        this.ArchitectureType = ArchitectureType;
    }

    /**
     * Get <p>回收标志，默认为空</p> 
     * @return Recycle <p>回收标志，默认为空</p>
     */
    public String getRecycle() {
        return this.Recycle;
    }

    /**
     * Set <p>回收标志，默认为空</p>
     * @param Recycle <p>回收标志，默认为空</p>
     */
    public void setRecycle(String Recycle) {
        this.Recycle = Recycle;
    }

    public EnvInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvInfo(EnvInfo source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Databases != null) {
            this.Databases = new DatabasesInfo[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new DatabasesInfo(source.Databases[i]);
            }
        }
        if (source.Storages != null) {
            this.Storages = new StorageInfo[source.Storages.length];
            for (int i = 0; i < source.Storages.length; i++) {
                this.Storages[i] = new StorageInfo(source.Storages[i]);
            }
        }
        if (source.Functions != null) {
            this.Functions = new FunctionInfo[source.Functions.length];
            for (int i = 0; i < source.Functions.length; i++) {
                this.Functions[i] = new FunctionInfo(source.Functions[i]);
            }
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.LogServices != null) {
            this.LogServices = new LogServiceInfo[source.LogServices.length];
            for (int i = 0; i < source.LogServices.length; i++) {
                this.LogServices[i] = new LogServiceInfo(source.LogServices[i]);
            }
        }
        if (source.StaticStorages != null) {
            this.StaticStorages = new StaticStorageInfo[source.StaticStorages.length];
            for (int i = 0; i < source.StaticStorages.length; i++) {
                this.StaticStorages[i] = new StaticStorageInfo(source.StaticStorages[i]);
            }
        }
        if (source.IsAutoDegrade != null) {
            this.IsAutoDegrade = new Boolean(source.IsAutoDegrade);
        }
        if (source.EnvChannel != null) {
            this.EnvChannel = new String(source.EnvChannel);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CustomLogServices != null) {
            this.CustomLogServices = new ClsInfo[source.CustomLogServices.length];
            for (int i = 0; i < source.CustomLogServices.length; i++) {
                this.CustomLogServices[i] = new ClsInfo(source.CustomLogServices[i]);
            }
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.IsDauPackage != null) {
            this.IsDauPackage = new Boolean(source.IsDauPackage);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.ArchitectureType != null) {
            this.ArchitectureType = new String(source.ArchitectureType);
        }
        if (source.Recycle != null) {
            this.Recycle = new String(source.Recycle);
        }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "CustomLogServices.", this.CustomLogServices);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "IsDauPackage", this.IsDauPackage);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ArchitectureType", this.ArchitectureType);
        this.setParamSimple(map, prefix + "Recycle", this.Recycle);

    }
}

