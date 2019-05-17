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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest  extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private Integer ProductId;

    /**
    * VPC设置参数
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * 软件列表
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * 资源描述
    */
    @SerializedName("ResourceSpec")
    @Expose
    private ResourceSpec ResourceSpec;

    /**
    * 支持HA
    */
    @SerializedName("SupportHA")
    @Expose
    private Integer SupportHA;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 计费类型
    */
    @SerializedName("PayMode")
    @Expose
    private Integer PayMode;

    /**
    * 集群位置信息
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 时间长度
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * 时间单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 登录配置
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 客户端Token
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * COS设置参数
    */
    @SerializedName("COSSettings")
    @Expose
    private COSSettings COSSettings;

    /**
    * 安全组ID
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * 预执行脚本设置
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings PreExecutedFileSettings;

    /**
    * 自动续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Integer AutoRenew;

    /**
    * 是否需要外网Ip。支持填NEED_MASTER_WAN，不支持使用NOT_NEED_MASTER_WAN，默认使用NEED_MASTER_WAN
    */
    @SerializedName("NeedMasterWan")
    @Expose
    private String NeedMasterWan;

    /**
     * 获取产品ID
     * @return ProductId 产品ID
     */
    public Integer getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(Integer ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取VPC设置参数
     * @return VPCSettings VPC设置参数
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * 设置VPC设置参数
     * @param VPCSettings VPC设置参数
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * 获取软件列表
     * @return Software 软件列表
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * 设置软件列表
     * @param Software 软件列表
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * 获取资源描述
     * @return ResourceSpec 资源描述
     */
    public ResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * 设置资源描述
     * @param ResourceSpec 资源描述
     */
    public void setResourceSpec(ResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * 获取支持HA
     * @return SupportHA 支持HA
     */
    public Integer getSupportHA() {
        return this.SupportHA;
    }

    /**
     * 设置支持HA
     * @param SupportHA 支持HA
     */
    public void setSupportHA(Integer SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * 获取实例名称
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取计费类型
     * @return PayMode 计费类型
     */
    public Integer getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置计费类型
     * @param PayMode 计费类型
     */
    public void setPayMode(Integer PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取集群位置信息
     * @return Placement 集群位置信息
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * 设置集群位置信息
     * @param Placement 集群位置信息
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * 获取时间长度
     * @return TimeSpan 时间长度
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置时间长度
     * @param TimeSpan 时间长度
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取时间单位
     * @return TimeUnit 时间单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置时间单位
     * @param TimeUnit 时间单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取登录配置
     * @return LoginSettings 登录配置
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * 设置登录配置
     * @param LoginSettings 登录配置
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * 获取客户端Token
     * @return ClientToken 客户端Token
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * 设置客户端Token
     * @param ClientToken 客户端Token
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * 获取COS设置参数
     * @return COSSettings COS设置参数
     */
    public COSSettings getCOSSettings() {
        return this.COSSettings;
    }

    /**
     * 设置COS设置参数
     * @param COSSettings COS设置参数
     */
    public void setCOSSettings(COSSettings COSSettings) {
        this.COSSettings = COSSettings;
    }

    /**
     * 获取安全组ID
     * @return SgId 安全组ID
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * 设置安全组ID
     * @param SgId 安全组ID
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * 获取预执行脚本设置
     * @return PreExecutedFileSettings 预执行脚本设置
     */
    public PreExecuteFileSettings getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * 设置预执行脚本设置
     * @param PreExecutedFileSettings 预执行脚本设置
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * 获取自动续费
     * @return AutoRenew 自动续费
     */
    public Integer getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * 设置自动续费
     * @param AutoRenew 自动续费
     */
    public void setAutoRenew(Integer AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * 获取是否需要外网Ip。支持填NEED_MASTER_WAN，不支持使用NOT_NEED_MASTER_WAN，默认使用NEED_MASTER_WAN
     * @return NeedMasterWan 是否需要外网Ip。支持填NEED_MASTER_WAN，不支持使用NOT_NEED_MASTER_WAN，默认使用NEED_MASTER_WAN
     */
    public String getNeedMasterWan() {
        return this.NeedMasterWan;
    }

    /**
     * 设置是否需要外网Ip。支持填NEED_MASTER_WAN，不支持使用NOT_NEED_MASTER_WAN，默认使用NEED_MASTER_WAN
     * @param NeedMasterWan 是否需要外网Ip。支持填NEED_MASTER_WAN，不支持使用NOT_NEED_MASTER_WAN，默认使用NEED_MASTER_WAN
     */
    public void setNeedMasterWan(String NeedMasterWan) {
        this.NeedMasterWan = NeedMasterWan;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "COSSettings.", this.COSSettings);
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "NeedMasterWan", this.NeedMasterWan);

    }
}

