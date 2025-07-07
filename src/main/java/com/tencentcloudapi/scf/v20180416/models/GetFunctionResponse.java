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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFunctionResponse extends AbstractModel {

    /**
    * 函数的最后修改时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 函数的代码
    */
    @SerializedName("CodeInfo")
    @Expose
    private String CodeInfo;

    /**
    * 函数的描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 函数的触发器列表
    */
    @SerializedName("Triggers")
    @Expose
    private Trigger [] Triggers;

    /**
    * 函数的入口
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * 函数代码大小
    */
    @SerializedName("CodeSize")
    @Expose
    private Long CodeSize;

    /**
    * 函数的超时时间
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 函数的版本
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * 函数的最大可用内存
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * 函数的运行环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 函数的名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数的私有网络
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * 是否使用GPU
    */
    @SerializedName("UseGpu")
    @Expose
    private String UseGpu;

    /**
    * 函数的环境变量
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * 代码是否正确
    */
    @SerializedName("CodeResult")
    @Expose
    private String CodeResult;

    /**
    * 代码错误信息
    */
    @SerializedName("CodeError")
    @Expose
    private String CodeError;

    /**
    * 代码错误码
    */
    @SerializedName("ErrNo")
    @Expose
    private Long ErrNo;

    /**
    * 函数的命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数绑定的角色
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 是否自动安装依赖
    */
    @SerializedName("InstallDependency")
    @Expose
    private String InstallDependency;

    /**
    * 函数状态，状态值及流转[参考说明](https://cloud.tencent.com/document/product/583/115197)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 日志投递到的Cls日志集
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * 日志投递到的Cls Topic
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * 函数ID
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 函数的标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * EipConfig配置
    */
    @SerializedName("EipConfig")
    @Expose
    private EipOutConfig EipConfig;

    /**
    * 域名信息
    */
    @SerializedName("AccessInfo")
    @Expose
    private AccessInfo AccessInfo;

    /**
    * 函数类型，取值为HTTP或者Event
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否启用L5
    */
    @SerializedName("L5Enable")
    @Expose
    private String L5Enable;

    /**
    * 函数关联的Layer版本信息
    */
    @SerializedName("Layers")
    @Expose
    private LayerVersionInfo [] Layers;

    /**
    * 函数关联的死信队列信息
    */
    @SerializedName("DeadLetterConfig")
    @Expose
    private DeadLetterConfig DeadLetterConfig;

    /**
    * 函数创建回见
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 公网访问配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicNetConfig")
    @Expose
    private PublicNetConfigOut PublicNetConfig;

    /**
    * 是否启用Ons
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnsEnable")
    @Expose
    private String OnsEnable;

    /**
    * 文件系统配置参数，用于云函数挂载文件系统
    */
    @SerializedName("CfsConfig")
    @Expose
    private CfsConfig CfsConfig;

    /**
    * 函数的计费状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.87.BD.E6.95.B0.E8.AE.A1.E8.B4.B9.E7.8A.B6.E6.80.81)
    */
    @SerializedName("AvailableStatus")
    @Expose
    private String AvailableStatus;

    /**
    * 函数版本
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 函数初始化超时时间
    */
    @SerializedName("InitTimeout")
    @Expose
    private Long InitTimeout;

    /**
    * 函数状态失败原因
    */
    @SerializedName("StatusReasons")
    @Expose
    private StatusReason [] StatusReasons;

    /**
    * 是否开启异步属性
    */
    @SerializedName("AsyncRunEnable")
    @Expose
    private String AsyncRunEnable;

    /**
    * 是否开启事件追踪
    */
    @SerializedName("TraceEnable")
    @Expose
    private String TraceEnable;

    /**
    * 镜像配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageConfig")
    @Expose
    private ImageConfig ImageConfig;

    /**
    * HTTP函数支持的访问协议。当前支持WebSockets协议。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * HTTP函数配置ProtocolType访问协议，当前协议配置的参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolParams")
    @Expose
    private ProtocolParams ProtocolParams;

    /**
    * 是否开启DNS缓存
    */
    @SerializedName("DnsCache")
    @Expose
    private String DnsCache;

    /**
    * 内网访问配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntranetConfig")
    @Expose
    private IntranetConfigOut IntranetConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 函数的最后修改时间 
     * @return ModTime 函数的最后修改时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set 函数的最后修改时间
     * @param ModTime 函数的最后修改时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get 函数的代码 
     * @return CodeInfo 函数的代码
     */
    public String getCodeInfo() {
        return this.CodeInfo;
    }

    /**
     * Set 函数的代码
     * @param CodeInfo 函数的代码
     */
    public void setCodeInfo(String CodeInfo) {
        this.CodeInfo = CodeInfo;
    }

    /**
     * Get 函数的描述信息 
     * @return Description 函数的描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 函数的描述信息
     * @param Description 函数的描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 函数的触发器列表 
     * @return Triggers 函数的触发器列表
     */
    public Trigger [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set 函数的触发器列表
     * @param Triggers 函数的触发器列表
     */
    public void setTriggers(Trigger [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * Get 函数的入口 
     * @return Handler 函数的入口
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set 函数的入口
     * @param Handler 函数的入口
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * Get 函数代码大小 
     * @return CodeSize 函数代码大小
     */
    public Long getCodeSize() {
        return this.CodeSize;
    }

    /**
     * Set 函数代码大小
     * @param CodeSize 函数代码大小
     */
    public void setCodeSize(Long CodeSize) {
        this.CodeSize = CodeSize;
    }

    /**
     * Get 函数的超时时间 
     * @return Timeout 函数的超时时间
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 函数的超时时间
     * @param Timeout 函数的超时时间
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 函数的版本 
     * @return FunctionVersion 函数的版本
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set 函数的版本
     * @param FunctionVersion 函数的版本
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get 函数的最大可用内存 
     * @return MemorySize 函数的最大可用内存
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set 函数的最大可用内存
     * @param MemorySize 函数的最大可用内存
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get 函数的运行环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Runtime 函数的运行环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 函数的运行环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param Runtime 函数的运行环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 函数的名称 
     * @return FunctionName 函数的名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数的名称
     * @param FunctionName 函数的名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数的私有网络 
     * @return VpcConfig 函数的私有网络
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set 函数的私有网络
     * @param VpcConfig 函数的私有网络
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get 是否使用GPU 
     * @return UseGpu 是否使用GPU
     */
    public String getUseGpu() {
        return this.UseGpu;
    }

    /**
     * Set 是否使用GPU
     * @param UseGpu 是否使用GPU
     */
    public void setUseGpu(String UseGpu) {
        this.UseGpu = UseGpu;
    }

    /**
     * Get 函数的环境变量 
     * @return Environment 函数的环境变量
     */
    public Environment getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 函数的环境变量
     * @param Environment 函数的环境变量
     */
    public void setEnvironment(Environment Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 代码是否正确 
     * @return CodeResult 代码是否正确
     */
    public String getCodeResult() {
        return this.CodeResult;
    }

    /**
     * Set 代码是否正确
     * @param CodeResult 代码是否正确
     */
    public void setCodeResult(String CodeResult) {
        this.CodeResult = CodeResult;
    }

    /**
     * Get 代码错误信息 
     * @return CodeError 代码错误信息
     */
    public String getCodeError() {
        return this.CodeError;
    }

    /**
     * Set 代码错误信息
     * @param CodeError 代码错误信息
     */
    public void setCodeError(String CodeError) {
        this.CodeError = CodeError;
    }

    /**
     * Get 代码错误码 
     * @return ErrNo 代码错误码
     */
    public Long getErrNo() {
        return this.ErrNo;
    }

    /**
     * Set 代码错误码
     * @param ErrNo 代码错误码
     */
    public void setErrNo(Long ErrNo) {
        this.ErrNo = ErrNo;
    }

    /**
     * Get 函数的命名空间 
     * @return Namespace 函数的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数的命名空间
     * @param Namespace 函数的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数绑定的角色 
     * @return Role 函数绑定的角色
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 函数绑定的角色
     * @param Role 函数绑定的角色
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 是否自动安装依赖 
     * @return InstallDependency 是否自动安装依赖
     */
    public String getInstallDependency() {
        return this.InstallDependency;
    }

    /**
     * Set 是否自动安装依赖
     * @param InstallDependency 是否自动安装依赖
     */
    public void setInstallDependency(String InstallDependency) {
        this.InstallDependency = InstallDependency;
    }

    /**
     * Get 函数状态，状态值及流转[参考说明](https://cloud.tencent.com/document/product/583/115197) 
     * @return Status 函数状态，状态值及流转[参考说明](https://cloud.tencent.com/document/product/583/115197)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 函数状态，状态值及流转[参考说明](https://cloud.tencent.com/document/product/583/115197)
     * @param Status 函数状态，状态值及流转[参考说明](https://cloud.tencent.com/document/product/583/115197)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 日志投递到的Cls日志集 
     * @return ClsLogsetId 日志投递到的Cls日志集
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set 日志投递到的Cls日志集
     * @param ClsLogsetId 日志投递到的Cls日志集
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get 日志投递到的Cls Topic 
     * @return ClsTopicId 日志投递到的Cls Topic
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set 日志投递到的Cls Topic
     * @param ClsTopicId 日志投递到的Cls Topic
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get 函数ID 
     * @return FunctionId 函数ID
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数ID
     * @param FunctionId 函数ID
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 函数的标签列表 
     * @return Tags 函数的标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 函数的标签列表
     * @param Tags 函数的标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get EipConfig配置 
     * @return EipConfig EipConfig配置
     */
    public EipOutConfig getEipConfig() {
        return this.EipConfig;
    }

    /**
     * Set EipConfig配置
     * @param EipConfig EipConfig配置
     */
    public void setEipConfig(EipOutConfig EipConfig) {
        this.EipConfig = EipConfig;
    }

    /**
     * Get 域名信息 
     * @return AccessInfo 域名信息
     */
    public AccessInfo getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set 域名信息
     * @param AccessInfo 域名信息
     */
    public void setAccessInfo(AccessInfo AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get 函数类型，取值为HTTP或者Event 
     * @return Type 函数类型，取值为HTTP或者Event
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 函数类型，取值为HTTP或者Event
     * @param Type 函数类型，取值为HTTP或者Event
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否启用L5 
     * @return L5Enable 是否启用L5
     */
    public String getL5Enable() {
        return this.L5Enable;
    }

    /**
     * Set 是否启用L5
     * @param L5Enable 是否启用L5
     */
    public void setL5Enable(String L5Enable) {
        this.L5Enable = L5Enable;
    }

    /**
     * Get 函数关联的Layer版本信息 
     * @return Layers 函数关联的Layer版本信息
     */
    public LayerVersionInfo [] getLayers() {
        return this.Layers;
    }

    /**
     * Set 函数关联的Layer版本信息
     * @param Layers 函数关联的Layer版本信息
     */
    public void setLayers(LayerVersionInfo [] Layers) {
        this.Layers = Layers;
    }

    /**
     * Get 函数关联的死信队列信息 
     * @return DeadLetterConfig 函数关联的死信队列信息
     */
    public DeadLetterConfig getDeadLetterConfig() {
        return this.DeadLetterConfig;
    }

    /**
     * Set 函数关联的死信队列信息
     * @param DeadLetterConfig 函数关联的死信队列信息
     */
    public void setDeadLetterConfig(DeadLetterConfig DeadLetterConfig) {
        this.DeadLetterConfig = DeadLetterConfig;
    }

    /**
     * Get 函数创建回见 
     * @return AddTime 函数创建回见
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 函数创建回见
     * @param AddTime 函数创建回见
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 公网访问配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicNetConfig 公网访问配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PublicNetConfigOut getPublicNetConfig() {
        return this.PublicNetConfig;
    }

    /**
     * Set 公网访问配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicNetConfig 公网访问配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicNetConfig(PublicNetConfigOut PublicNetConfig) {
        this.PublicNetConfig = PublicNetConfig;
    }

    /**
     * Get 是否启用Ons
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnsEnable 是否启用Ons
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOnsEnable() {
        return this.OnsEnable;
    }

    /**
     * Set 是否启用Ons
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnsEnable 是否启用Ons
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnsEnable(String OnsEnable) {
        this.OnsEnable = OnsEnable;
    }

    /**
     * Get 文件系统配置参数，用于云函数挂载文件系统 
     * @return CfsConfig 文件系统配置参数，用于云函数挂载文件系统
     */
    public CfsConfig getCfsConfig() {
        return this.CfsConfig;
    }

    /**
     * Set 文件系统配置参数，用于云函数挂载文件系统
     * @param CfsConfig 文件系统配置参数，用于云函数挂载文件系统
     */
    public void setCfsConfig(CfsConfig CfsConfig) {
        this.CfsConfig = CfsConfig;
    }

    /**
     * Get 函数的计费状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.87.BD.E6.95.B0.E8.AE.A1.E8.B4.B9.E7.8A.B6.E6.80.81) 
     * @return AvailableStatus 函数的计费状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.87.BD.E6.95.B0.E8.AE.A1.E8.B4.B9.E7.8A.B6.E6.80.81)
     */
    public String getAvailableStatus() {
        return this.AvailableStatus;
    }

    /**
     * Set 函数的计费状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.87.BD.E6.95.B0.E8.AE.A1.E8.B4.B9.E7.8A.B6.E6.80.81)
     * @param AvailableStatus 函数的计费状态，状态值[参考此处](https://cloud.tencent.com/document/product/583/47175#.E5.87.BD.E6.95.B0.E8.AE.A1.E8.B4.B9.E7.8A.B6.E6.80.81)
     */
    public void setAvailableStatus(String AvailableStatus) {
        this.AvailableStatus = AvailableStatus;
    }

    /**
     * Get 函数版本 
     * @return Qualifier 函数版本
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数版本
     * @param Qualifier 函数版本
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 函数初始化超时时间 
     * @return InitTimeout 函数初始化超时时间
     */
    public Long getInitTimeout() {
        return this.InitTimeout;
    }

    /**
     * Set 函数初始化超时时间
     * @param InitTimeout 函数初始化超时时间
     */
    public void setInitTimeout(Long InitTimeout) {
        this.InitTimeout = InitTimeout;
    }

    /**
     * Get 函数状态失败原因 
     * @return StatusReasons 函数状态失败原因
     */
    public StatusReason [] getStatusReasons() {
        return this.StatusReasons;
    }

    /**
     * Set 函数状态失败原因
     * @param StatusReasons 函数状态失败原因
     */
    public void setStatusReasons(StatusReason [] StatusReasons) {
        this.StatusReasons = StatusReasons;
    }

    /**
     * Get 是否开启异步属性 
     * @return AsyncRunEnable 是否开启异步属性
     */
    public String getAsyncRunEnable() {
        return this.AsyncRunEnable;
    }

    /**
     * Set 是否开启异步属性
     * @param AsyncRunEnable 是否开启异步属性
     */
    public void setAsyncRunEnable(String AsyncRunEnable) {
        this.AsyncRunEnable = AsyncRunEnable;
    }

    /**
     * Get 是否开启事件追踪 
     * @return TraceEnable 是否开启事件追踪
     */
    public String getTraceEnable() {
        return this.TraceEnable;
    }

    /**
     * Set 是否开启事件追踪
     * @param TraceEnable 是否开启事件追踪
     */
    public void setTraceEnable(String TraceEnable) {
        this.TraceEnable = TraceEnable;
    }

    /**
     * Get 镜像配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageConfig 镜像配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageConfig getImageConfig() {
        return this.ImageConfig;
    }

    /**
     * Set 镜像配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageConfig 镜像配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageConfig(ImageConfig ImageConfig) {
        this.ImageConfig = ImageConfig;
    }

    /**
     * Get HTTP函数支持的访问协议。当前支持WebSockets协议。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolType HTTP函数支持的访问协议。当前支持WebSockets协议。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set HTTP函数支持的访问协议。当前支持WebSockets协议。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolType HTTP函数支持的访问协议。当前支持WebSockets协议。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get HTTP函数配置ProtocolType访问协议，当前协议配置的参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolParams HTTP函数配置ProtocolType访问协议，当前协议配置的参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProtocolParams getProtocolParams() {
        return this.ProtocolParams;
    }

    /**
     * Set HTTP函数配置ProtocolType访问协议，当前协议配置的参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolParams HTTP函数配置ProtocolType访问协议，当前协议配置的参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolParams(ProtocolParams ProtocolParams) {
        this.ProtocolParams = ProtocolParams;
    }

    /**
     * Get 是否开启DNS缓存 
     * @return DnsCache 是否开启DNS缓存
     */
    public String getDnsCache() {
        return this.DnsCache;
    }

    /**
     * Set 是否开启DNS缓存
     * @param DnsCache 是否开启DNS缓存
     */
    public void setDnsCache(String DnsCache) {
        this.DnsCache = DnsCache;
    }

    /**
     * Get 内网访问配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntranetConfig 内网访问配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntranetConfigOut getIntranetConfig() {
        return this.IntranetConfig;
    }

    /**
     * Set 内网访问配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntranetConfig 内网访问配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntranetConfig(IntranetConfigOut IntranetConfig) {
        this.IntranetConfig = IntranetConfig;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetFunctionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFunctionResponse(GetFunctionResponse source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.CodeInfo != null) {
            this.CodeInfo = new String(source.CodeInfo);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Triggers != null) {
            this.Triggers = new Trigger[source.Triggers.length];
            for (int i = 0; i < source.Triggers.length; i++) {
                this.Triggers[i] = new Trigger(source.Triggers[i]);
            }
        }
        if (source.Handler != null) {
            this.Handler = new String(source.Handler);
        }
        if (source.CodeSize != null) {
            this.CodeSize = new Long(source.CodeSize);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String(source.FunctionVersion);
        }
        if (source.MemorySize != null) {
            this.MemorySize = new Long(source.MemorySize);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new VpcConfig(source.VpcConfig);
        }
        if (source.UseGpu != null) {
            this.UseGpu = new String(source.UseGpu);
        }
        if (source.Environment != null) {
            this.Environment = new Environment(source.Environment);
        }
        if (source.CodeResult != null) {
            this.CodeResult = new String(source.CodeResult);
        }
        if (source.CodeError != null) {
            this.CodeError = new String(source.CodeError);
        }
        if (source.ErrNo != null) {
            this.ErrNo = new Long(source.ErrNo);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.InstallDependency != null) {
            this.InstallDependency = new String(source.InstallDependency);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EipConfig != null) {
            this.EipConfig = new EipOutConfig(source.EipConfig);
        }
        if (source.AccessInfo != null) {
            this.AccessInfo = new AccessInfo(source.AccessInfo);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.L5Enable != null) {
            this.L5Enable = new String(source.L5Enable);
        }
        if (source.Layers != null) {
            this.Layers = new LayerVersionInfo[source.Layers.length];
            for (int i = 0; i < source.Layers.length; i++) {
                this.Layers[i] = new LayerVersionInfo(source.Layers[i]);
            }
        }
        if (source.DeadLetterConfig != null) {
            this.DeadLetterConfig = new DeadLetterConfig(source.DeadLetterConfig);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.PublicNetConfig != null) {
            this.PublicNetConfig = new PublicNetConfigOut(source.PublicNetConfig);
        }
        if (source.OnsEnable != null) {
            this.OnsEnable = new String(source.OnsEnable);
        }
        if (source.CfsConfig != null) {
            this.CfsConfig = new CfsConfig(source.CfsConfig);
        }
        if (source.AvailableStatus != null) {
            this.AvailableStatus = new String(source.AvailableStatus);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.InitTimeout != null) {
            this.InitTimeout = new Long(source.InitTimeout);
        }
        if (source.StatusReasons != null) {
            this.StatusReasons = new StatusReason[source.StatusReasons.length];
            for (int i = 0; i < source.StatusReasons.length; i++) {
                this.StatusReasons[i] = new StatusReason(source.StatusReasons[i]);
            }
        }
        if (source.AsyncRunEnable != null) {
            this.AsyncRunEnable = new String(source.AsyncRunEnable);
        }
        if (source.TraceEnable != null) {
            this.TraceEnable = new String(source.TraceEnable);
        }
        if (source.ImageConfig != null) {
            this.ImageConfig = new ImageConfig(source.ImageConfig);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.ProtocolParams != null) {
            this.ProtocolParams = new ProtocolParams(source.ProtocolParams);
        }
        if (source.DnsCache != null) {
            this.DnsCache = new String(source.DnsCache);
        }
        if (source.IntranetConfig != null) {
            this.IntranetConfig = new IntranetConfigOut(source.IntranetConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "CodeInfo", this.CodeInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "CodeSize", this.CodeSize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "UseGpu", this.UseGpu);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamSimple(map, prefix + "CodeResult", this.CodeResult);
        this.setParamSimple(map, prefix + "CodeError", this.CodeError);
        this.setParamSimple(map, prefix + "ErrNo", this.ErrNo);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "EipConfig.", this.EipConfig);
        this.setParamObj(map, prefix + "AccessInfo.", this.AccessInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "L5Enable", this.L5Enable);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamObj(map, prefix + "PublicNetConfig.", this.PublicNetConfig);
        this.setParamSimple(map, prefix + "OnsEnable", this.OnsEnable);
        this.setParamObj(map, prefix + "CfsConfig.", this.CfsConfig);
        this.setParamSimple(map, prefix + "AvailableStatus", this.AvailableStatus);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "InitTimeout", this.InitTimeout);
        this.setParamArrayObj(map, prefix + "StatusReasons.", this.StatusReasons);
        this.setParamSimple(map, prefix + "AsyncRunEnable", this.AsyncRunEnable);
        this.setParamSimple(map, prefix + "TraceEnable", this.TraceEnable);
        this.setParamObj(map, prefix + "ImageConfig.", this.ImageConfig);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamObj(map, prefix + "ProtocolParams.", this.ProtocolParams);
        this.setParamSimple(map, prefix + "DnsCache", this.DnsCache);
        this.setParamObj(map, prefix + "IntranetConfig.", this.IntranetConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

