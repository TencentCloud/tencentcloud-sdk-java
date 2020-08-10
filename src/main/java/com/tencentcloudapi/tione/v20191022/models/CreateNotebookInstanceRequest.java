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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNotebookInstanceRequest extends AbstractModel{

    /**
    * Notebook实例名称，不能超过63个字符
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$”
    */
    @SerializedName("NotebookInstanceName")
    @Expose
    private String NotebookInstanceName;

    /**
    * Notebook算力类型
参考https://cloud.tencent.com/document/product/851/41239
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 数据卷大小(GB)
用户持久化Notebook实例的数据
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * 外网访问权限，可取值Enabled/Disabled
开启后，Notebook实例可以具有访问外网80，443端口的权限
    */
    @SerializedName("DirectInternetAccess")
    @Expose
    private String DirectInternetAccess;

    /**
    * Root用户权限，可取值Enabled/Disabled
开启后，Notebook实例可以切换至root用户执行命令
    */
    @SerializedName("RootAccess")
    @Expose
    private String RootAccess;

    /**
    * 子网ID
如果需要Notebook实例访问VPC内的资源，则需要选择对应的子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 生命周期脚本名称
必须是已存在的生命周期脚本，具体参考https://cloud.tencent.com/document/product/851/43140
    */
    @SerializedName("LifecycleScriptsName")
    @Expose
    private String LifecycleScriptsName;

    /**
    * 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139
    */
    @SerializedName("DefaultCodeRepository")
    @Expose
    private String DefaultCodeRepository;

    /**
    * 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139
    */
    @SerializedName("AdditionalCodeRepositories")
    @Expose
    private String [] AdditionalCodeRepositories;

    /**
    * 已弃用，请使用ClsConfig配置。
是否开启CLS日志服务，可取值Enabled/Disabled，默认为Disabled
开启后，Notebook运行的日志会收集到CLS中，CLS会产生费用，请根据需要选择
    */
    @SerializedName("ClsAccess")
    @Expose
    private String ClsAccess;

    /**
    * 自动停止配置
选择定时停止Notebook实例
    */
    @SerializedName("StoppingCondition")
    @Expose
    private StoppingCondition StoppingCondition;

    /**
    * 自动停止，可取值Enabled/Disabled
取值为Disabled的时候StoppingCondition将被忽略
取值为Enabled的时候读取StoppingCondition作为自动停止的配置
    */
    @SerializedName("AutoStopping")
    @Expose
    private String AutoStopping;

    /**
    * 接入日志的配置，默认接入免费日志
    */
    @SerializedName("ClsConfig")
    @Expose
    private ClsConfig ClsConfig;

    /**
     * Get Notebook实例名称，不能超过63个字符
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$” 
     * @return NotebookInstanceName Notebook实例名称，不能超过63个字符
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$”
     */
    public String getNotebookInstanceName() {
        return this.NotebookInstanceName;
    }

    /**
     * Set Notebook实例名称，不能超过63个字符
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$”
     * @param NotebookInstanceName Notebook实例名称，不能超过63个字符
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$”
     */
    public void setNotebookInstanceName(String NotebookInstanceName) {
        this.NotebookInstanceName = NotebookInstanceName;
    }

    /**
     * Get Notebook算力类型
参考https://cloud.tencent.com/document/product/851/41239 
     * @return InstanceType Notebook算力类型
参考https://cloud.tencent.com/document/product/851/41239
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Notebook算力类型
参考https://cloud.tencent.com/document/product/851/41239
     * @param InstanceType Notebook算力类型
参考https://cloud.tencent.com/document/product/851/41239
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 数据卷大小(GB)
用户持久化Notebook实例的数据 
     * @return VolumeSizeInGB 数据卷大小(GB)
用户持久化Notebook实例的数据
     */
    public Long getVolumeSizeInGB() {
        return this.VolumeSizeInGB;
    }

    /**
     * Set 数据卷大小(GB)
用户持久化Notebook实例的数据
     * @param VolumeSizeInGB 数据卷大小(GB)
用户持久化Notebook实例的数据
     */
    public void setVolumeSizeInGB(Long VolumeSizeInGB) {
        this.VolumeSizeInGB = VolumeSizeInGB;
    }

    /**
     * Get 外网访问权限，可取值Enabled/Disabled
开启后，Notebook实例可以具有访问外网80，443端口的权限 
     * @return DirectInternetAccess 外网访问权限，可取值Enabled/Disabled
开启后，Notebook实例可以具有访问外网80，443端口的权限
     */
    public String getDirectInternetAccess() {
        return this.DirectInternetAccess;
    }

    /**
     * Set 外网访问权限，可取值Enabled/Disabled
开启后，Notebook实例可以具有访问外网80，443端口的权限
     * @param DirectInternetAccess 外网访问权限，可取值Enabled/Disabled
开启后，Notebook实例可以具有访问外网80，443端口的权限
     */
    public void setDirectInternetAccess(String DirectInternetAccess) {
        this.DirectInternetAccess = DirectInternetAccess;
    }

    /**
     * Get Root用户权限，可取值Enabled/Disabled
开启后，Notebook实例可以切换至root用户执行命令 
     * @return RootAccess Root用户权限，可取值Enabled/Disabled
开启后，Notebook实例可以切换至root用户执行命令
     */
    public String getRootAccess() {
        return this.RootAccess;
    }

    /**
     * Set Root用户权限，可取值Enabled/Disabled
开启后，Notebook实例可以切换至root用户执行命令
     * @param RootAccess Root用户权限，可取值Enabled/Disabled
开启后，Notebook实例可以切换至root用户执行命令
     */
    public void setRootAccess(String RootAccess) {
        this.RootAccess = RootAccess;
    }

    /**
     * Get 子网ID
如果需要Notebook实例访问VPC内的资源，则需要选择对应的子网 
     * @return SubnetId 子网ID
如果需要Notebook实例访问VPC内的资源，则需要选择对应的子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
如果需要Notebook实例访问VPC内的资源，则需要选择对应的子网
     * @param SubnetId 子网ID
如果需要Notebook实例访问VPC内的资源，则需要选择对应的子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 生命周期脚本名称
必须是已存在的生命周期脚本，具体参考https://cloud.tencent.com/document/product/851/43140 
     * @return LifecycleScriptsName 生命周期脚本名称
必须是已存在的生命周期脚本，具体参考https://cloud.tencent.com/document/product/851/43140
     */
    public String getLifecycleScriptsName() {
        return this.LifecycleScriptsName;
    }

    /**
     * Set 生命周期脚本名称
必须是已存在的生命周期脚本，具体参考https://cloud.tencent.com/document/product/851/43140
     * @param LifecycleScriptsName 生命周期脚本名称
必须是已存在的生命周期脚本，具体参考https://cloud.tencent.com/document/product/851/43140
     */
    public void setLifecycleScriptsName(String LifecycleScriptsName) {
        this.LifecycleScriptsName = LifecycleScriptsName;
    }

    /**
     * Get 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139 
     * @return DefaultCodeRepository 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139
     */
    public String getDefaultCodeRepository() {
        return this.DefaultCodeRepository;
    }

    /**
     * Set 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139
     * @param DefaultCodeRepository 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139
     */
    public void setDefaultCodeRepository(String DefaultCodeRepository) {
        this.DefaultCodeRepository = DefaultCodeRepository;
    }

    /**
     * Get 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139 
     * @return AdditionalCodeRepositories 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139
     */
    public String [] getAdditionalCodeRepositories() {
        return this.AdditionalCodeRepositories;
    }

    /**
     * Set 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139
     * @param AdditionalCodeRepositories 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
参考https://cloud.tencent.com/document/product/851/43139
     */
    public void setAdditionalCodeRepositories(String [] AdditionalCodeRepositories) {
        this.AdditionalCodeRepositories = AdditionalCodeRepositories;
    }

    /**
     * Get 已弃用，请使用ClsConfig配置。
是否开启CLS日志服务，可取值Enabled/Disabled，默认为Disabled
开启后，Notebook运行的日志会收集到CLS中，CLS会产生费用，请根据需要选择 
     * @return ClsAccess 已弃用，请使用ClsConfig配置。
是否开启CLS日志服务，可取值Enabled/Disabled，默认为Disabled
开启后，Notebook运行的日志会收集到CLS中，CLS会产生费用，请根据需要选择
     */
    public String getClsAccess() {
        return this.ClsAccess;
    }

    /**
     * Set 已弃用，请使用ClsConfig配置。
是否开启CLS日志服务，可取值Enabled/Disabled，默认为Disabled
开启后，Notebook运行的日志会收集到CLS中，CLS会产生费用，请根据需要选择
     * @param ClsAccess 已弃用，请使用ClsConfig配置。
是否开启CLS日志服务，可取值Enabled/Disabled，默认为Disabled
开启后，Notebook运行的日志会收集到CLS中，CLS会产生费用，请根据需要选择
     */
    public void setClsAccess(String ClsAccess) {
        this.ClsAccess = ClsAccess;
    }

    /**
     * Get 自动停止配置
选择定时停止Notebook实例 
     * @return StoppingCondition 自动停止配置
选择定时停止Notebook实例
     */
    public StoppingCondition getStoppingCondition() {
        return this.StoppingCondition;
    }

    /**
     * Set 自动停止配置
选择定时停止Notebook实例
     * @param StoppingCondition 自动停止配置
选择定时停止Notebook实例
     */
    public void setStoppingCondition(StoppingCondition StoppingCondition) {
        this.StoppingCondition = StoppingCondition;
    }

    /**
     * Get 自动停止，可取值Enabled/Disabled
取值为Disabled的时候StoppingCondition将被忽略
取值为Enabled的时候读取StoppingCondition作为自动停止的配置 
     * @return AutoStopping 自动停止，可取值Enabled/Disabled
取值为Disabled的时候StoppingCondition将被忽略
取值为Enabled的时候读取StoppingCondition作为自动停止的配置
     */
    public String getAutoStopping() {
        return this.AutoStopping;
    }

    /**
     * Set 自动停止，可取值Enabled/Disabled
取值为Disabled的时候StoppingCondition将被忽略
取值为Enabled的时候读取StoppingCondition作为自动停止的配置
     * @param AutoStopping 自动停止，可取值Enabled/Disabled
取值为Disabled的时候StoppingCondition将被忽略
取值为Enabled的时候读取StoppingCondition作为自动停止的配置
     */
    public void setAutoStopping(String AutoStopping) {
        this.AutoStopping = AutoStopping;
    }

    /**
     * Get 接入日志的配置，默认接入免费日志 
     * @return ClsConfig 接入日志的配置，默认接入免费日志
     */
    public ClsConfig getClsConfig() {
        return this.ClsConfig;
    }

    /**
     * Set 接入日志的配置，默认接入免费日志
     * @param ClsConfig 接入日志的配置，默认接入免费日志
     */
    public void setClsConfig(ClsConfig ClsConfig) {
        this.ClsConfig = ClsConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookInstanceName", this.NotebookInstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamSimple(map, prefix + "DirectInternetAccess", this.DirectInternetAccess);
        this.setParamSimple(map, prefix + "RootAccess", this.RootAccess);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LifecycleScriptsName", this.LifecycleScriptsName);
        this.setParamSimple(map, prefix + "DefaultCodeRepository", this.DefaultCodeRepository);
        this.setParamArraySimple(map, prefix + "AdditionalCodeRepositories.", this.AdditionalCodeRepositories);
        this.setParamSimple(map, prefix + "ClsAccess", this.ClsAccess);
        this.setParamObj(map, prefix + "StoppingCondition.", this.StoppingCondition);
        this.setParamSimple(map, prefix + "AutoStopping", this.AutoStopping);
        this.setParamObj(map, prefix + "ClsConfig.", this.ClsConfig);

    }
}

