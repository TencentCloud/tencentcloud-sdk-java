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

public class CreateFunctionRequest extends AbstractModel {

    /**
    * <p>创建的函数名称</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>函数处理方法名称</p>
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * <p>函数运行时内存大小</p>
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * <p>函数最长执行时间</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>此参数公司内部展示。是否使用GPU进行计算</p>
    */
    @SerializedName("UseGpu")
    @Expose
    private String UseGpu;

    /**
    * <p>在线依赖安装</p>
    */
    @SerializedName("InstallDependency")
    @Expose
    private String InstallDependency;

    /**
    * <p>此参数公司内部展示。用于小程序，GPU集群，不对外</p>
    */
    @SerializedName("Stamp")
    @Expose
    private String Stamp;

    /**
    * <p>函数绑定的角色</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>函数描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>函数运行环境</p>
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * <p>函数日志投递到的CLS TopicID</p>
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * <p>函数日志投递到的CLS LogsetID</p>
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * <p>包含函数代码文件的zip格式文件</p>
    */
    @SerializedName("Code")
    @Expose
    private CodeReq Code;

    /**
    * <p>云函数配置项</p>
    */
    @SerializedName("PrivateConfig")
    @Expose
    private PrivateConfig PrivateConfig;

    /**
    * <p>函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS</p>
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("Environment")
    @Expose
    private FunctionEnvironment Environment;

    /**
    * <p>函数初始化超时时间，默认 65s，镜像部署函数默认 90s。</p>
    */
    @SerializedName("InitTimeout")
    @Expose
    private Long InitTimeout;

    /**
    * <p>代码来源，支持ZipFile, Cos, Demo 其中之一</p>
    */
    @SerializedName("CodeSource")
    @Expose
    private String CodeSource;

    /**
    * <p>函数的私有网络配置</p>
    */
    @SerializedName("VpcConfig")
    @Expose
    private FunctionVpcConfig VpcConfig;

    /**
    * <p>函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。</p>
    */
    @SerializedName("Layers")
    @Expose
    private FunctionLayer [] Layers;

    /**
    * <p>公网访问配置</p>
    */
    @SerializedName("PublicNetConfig")
    @Expose
    private FunctionPublicNetConfig PublicNetConfig;

    /**
    * <p>是否开启异步属性，TRUE 为开启，FALSE为关闭</p>
    */
    @SerializedName("AsyncRunEnable")
    @Expose
    private String AsyncRunEnable;

    /**
    * <p>是否开启事件追踪，TRUE 为开启，FALSE为关闭</p>
    */
    @SerializedName("TraceEnable")
    @Expose
    private String TraceEnable;

    /**
    * <p>是否自动创建cls主题，TRUE 为开启，FALSE为关闭</p>
    */
    @SerializedName("AutoCreateClsTopic")
    @Expose
    private String AutoCreateClsTopic;

    /**
    * <p>是否自动创建cls索引，TRUE 为开启，FALSE为关闭</p>
    */
    @SerializedName("AutoDeployClsTopicIndex")
    @Expose
    private String AutoDeployClsTopicIndex;

    /**
    * <p>是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭</p>
    */
    @SerializedName("DnsCache")
    @Expose
    private String DnsCache;

    /**
    * <p>EipConfig固定ip配置</p>
    */
    @SerializedName("EipConfig")
    @Expose
    private FunctionEipConfigFixed EipConfig;

    /**
     * Get <p>创建的函数名称</p> 
     * @return FunctionName <p>创建的函数名称</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>创建的函数名称</p>
     * @param FunctionName <p>创建的函数名称</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>函数处理方法名称</p> 
     * @return Handler <p>函数处理方法名称</p>
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set <p>函数处理方法名称</p>
     * @param Handler <p>函数处理方法名称</p>
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * Get <p>函数运行时内存大小</p> 
     * @return MemorySize <p>函数运行时内存大小</p>
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set <p>函数运行时内存大小</p>
     * @param MemorySize <p>函数运行时内存大小</p>
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get <p>函数最长执行时间</p> 
     * @return Timeout <p>函数最长执行时间</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>函数最长执行时间</p>
     * @param Timeout <p>函数最长执行时间</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>此参数公司内部展示。是否使用GPU进行计算</p> 
     * @return UseGpu <p>此参数公司内部展示。是否使用GPU进行计算</p>
     */
    public String getUseGpu() {
        return this.UseGpu;
    }

    /**
     * Set <p>此参数公司内部展示。是否使用GPU进行计算</p>
     * @param UseGpu <p>此参数公司内部展示。是否使用GPU进行计算</p>
     */
    public void setUseGpu(String UseGpu) {
        this.UseGpu = UseGpu;
    }

    /**
     * Get <p>在线依赖安装</p> 
     * @return InstallDependency <p>在线依赖安装</p>
     */
    public String getInstallDependency() {
        return this.InstallDependency;
    }

    /**
     * Set <p>在线依赖安装</p>
     * @param InstallDependency <p>在线依赖安装</p>
     */
    public void setInstallDependency(String InstallDependency) {
        this.InstallDependency = InstallDependency;
    }

    /**
     * Get <p>此参数公司内部展示。用于小程序，GPU集群，不对外</p> 
     * @return Stamp <p>此参数公司内部展示。用于小程序，GPU集群，不对外</p>
     */
    public String getStamp() {
        return this.Stamp;
    }

    /**
     * Set <p>此参数公司内部展示。用于小程序，GPU集群，不对外</p>
     * @param Stamp <p>此参数公司内部展示。用于小程序，GPU集群，不对外</p>
     */
    public void setStamp(String Stamp) {
        this.Stamp = Stamp;
    }

    /**
     * Get <p>函数绑定的角色</p> 
     * @return Role <p>函数绑定的角色</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>函数绑定的角色</p>
     * @param Role <p>函数绑定的角色</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>函数描述</p> 
     * @return Description <p>函数描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>函数描述</p>
     * @param Description <p>函数描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>函数运行环境</p> 
     * @return Runtime <p>函数运行环境</p>
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set <p>函数运行环境</p>
     * @param Runtime <p>函数运行环境</p>
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get <p>函数日志投递到的CLS TopicID</p> 
     * @return ClsTopicId <p>函数日志投递到的CLS TopicID</p>
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set <p>函数日志投递到的CLS TopicID</p>
     * @param ClsTopicId <p>函数日志投递到的CLS TopicID</p>
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get <p>函数日志投递到的CLS LogsetID</p> 
     * @return ClsLogsetId <p>函数日志投递到的CLS LogsetID</p>
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set <p>函数日志投递到的CLS LogsetID</p>
     * @param ClsLogsetId <p>函数日志投递到的CLS LogsetID</p>
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get <p>包含函数代码文件的zip格式文件</p> 
     * @return Code <p>包含函数代码文件的zip格式文件</p>
     */
    public CodeReq getCode() {
        return this.Code;
    }

    /**
     * Set <p>包含函数代码文件的zip格式文件</p>
     * @param Code <p>包含函数代码文件的zip格式文件</p>
     */
    public void setCode(CodeReq Code) {
        this.Code = Code;
    }

    /**
     * Get <p>云函数配置项</p> 
     * @return PrivateConfig <p>云函数配置项</p>
     */
    public PrivateConfig getPrivateConfig() {
        return this.PrivateConfig;
    }

    /**
     * Set <p>云函数配置项</p>
     * @param PrivateConfig <p>云函数配置项</p>
     */
    public void setPrivateConfig(PrivateConfig PrivateConfig) {
        this.PrivateConfig = PrivateConfig;
    }

    /**
     * Get <p>函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP</p> 
     * @return Type <p>函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP</p>
     * @param Type <p>函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS</p> 
     * @return ProtocolType <p>HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS</p>
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set <p>HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS</p>
     * @param ProtocolType <p>HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS</p>
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get <p>环境变量</p> 
     * @return Environment <p>环境变量</p>
     */
    public FunctionEnvironment getEnvironment() {
        return this.Environment;
    }

    /**
     * Set <p>环境变量</p>
     * @param Environment <p>环境变量</p>
     */
    public void setEnvironment(FunctionEnvironment Environment) {
        this.Environment = Environment;
    }

    /**
     * Get <p>函数初始化超时时间，默认 65s，镜像部署函数默认 90s。</p> 
     * @return InitTimeout <p>函数初始化超时时间，默认 65s，镜像部署函数默认 90s。</p>
     */
    public Long getInitTimeout() {
        return this.InitTimeout;
    }

    /**
     * Set <p>函数初始化超时时间，默认 65s，镜像部署函数默认 90s。</p>
     * @param InitTimeout <p>函数初始化超时时间，默认 65s，镜像部署函数默认 90s。</p>
     */
    public void setInitTimeout(Long InitTimeout) {
        this.InitTimeout = InitTimeout;
    }

    /**
     * Get <p>代码来源，支持ZipFile, Cos, Demo 其中之一</p> 
     * @return CodeSource <p>代码来源，支持ZipFile, Cos, Demo 其中之一</p>
     */
    public String getCodeSource() {
        return this.CodeSource;
    }

    /**
     * Set <p>代码来源，支持ZipFile, Cos, Demo 其中之一</p>
     * @param CodeSource <p>代码来源，支持ZipFile, Cos, Demo 其中之一</p>
     */
    public void setCodeSource(String CodeSource) {
        this.CodeSource = CodeSource;
    }

    /**
     * Get <p>函数的私有网络配置</p> 
     * @return VpcConfig <p>函数的私有网络配置</p>
     */
    public FunctionVpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set <p>函数的私有网络配置</p>
     * @param VpcConfig <p>函数的私有网络配置</p>
     */
    public void setVpcConfig(FunctionVpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get <p>函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。</p> 
     * @return Layers <p>函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。</p>
     */
    public FunctionLayer [] getLayers() {
        return this.Layers;
    }

    /**
     * Set <p>函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。</p>
     * @param Layers <p>函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。</p>
     */
    public void setLayers(FunctionLayer [] Layers) {
        this.Layers = Layers;
    }

    /**
     * Get <p>公网访问配置</p> 
     * @return PublicNetConfig <p>公网访问配置</p>
     */
    public FunctionPublicNetConfig getPublicNetConfig() {
        return this.PublicNetConfig;
    }

    /**
     * Set <p>公网访问配置</p>
     * @param PublicNetConfig <p>公网访问配置</p>
     */
    public void setPublicNetConfig(FunctionPublicNetConfig PublicNetConfig) {
        this.PublicNetConfig = PublicNetConfig;
    }

    /**
     * Get <p>是否开启异步属性，TRUE 为开启，FALSE为关闭</p> 
     * @return AsyncRunEnable <p>是否开启异步属性，TRUE 为开启，FALSE为关闭</p>
     */
    public String getAsyncRunEnable() {
        return this.AsyncRunEnable;
    }

    /**
     * Set <p>是否开启异步属性，TRUE 为开启，FALSE为关闭</p>
     * @param AsyncRunEnable <p>是否开启异步属性，TRUE 为开启，FALSE为关闭</p>
     */
    public void setAsyncRunEnable(String AsyncRunEnable) {
        this.AsyncRunEnable = AsyncRunEnable;
    }

    /**
     * Get <p>是否开启事件追踪，TRUE 为开启，FALSE为关闭</p> 
     * @return TraceEnable <p>是否开启事件追踪，TRUE 为开启，FALSE为关闭</p>
     */
    public String getTraceEnable() {
        return this.TraceEnable;
    }

    /**
     * Set <p>是否开启事件追踪，TRUE 为开启，FALSE为关闭</p>
     * @param TraceEnable <p>是否开启事件追踪，TRUE 为开启，FALSE为关闭</p>
     */
    public void setTraceEnable(String TraceEnable) {
        this.TraceEnable = TraceEnable;
    }

    /**
     * Get <p>是否自动创建cls主题，TRUE 为开启，FALSE为关闭</p> 
     * @return AutoCreateClsTopic <p>是否自动创建cls主题，TRUE 为开启，FALSE为关闭</p>
     */
    public String getAutoCreateClsTopic() {
        return this.AutoCreateClsTopic;
    }

    /**
     * Set <p>是否自动创建cls主题，TRUE 为开启，FALSE为关闭</p>
     * @param AutoCreateClsTopic <p>是否自动创建cls主题，TRUE 为开启，FALSE为关闭</p>
     */
    public void setAutoCreateClsTopic(String AutoCreateClsTopic) {
        this.AutoCreateClsTopic = AutoCreateClsTopic;
    }

    /**
     * Get <p>是否自动创建cls索引，TRUE 为开启，FALSE为关闭</p> 
     * @return AutoDeployClsTopicIndex <p>是否自动创建cls索引，TRUE 为开启，FALSE为关闭</p>
     */
    public String getAutoDeployClsTopicIndex() {
        return this.AutoDeployClsTopicIndex;
    }

    /**
     * Set <p>是否自动创建cls索引，TRUE 为开启，FALSE为关闭</p>
     * @param AutoDeployClsTopicIndex <p>是否自动创建cls索引，TRUE 为开启，FALSE为关闭</p>
     */
    public void setAutoDeployClsTopicIndex(String AutoDeployClsTopicIndex) {
        this.AutoDeployClsTopicIndex = AutoDeployClsTopicIndex;
    }

    /**
     * Get <p>是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭</p> 
     * @return DnsCache <p>是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭</p>
     */
    public String getDnsCache() {
        return this.DnsCache;
    }

    /**
     * Set <p>是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭</p>
     * @param DnsCache <p>是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭</p>
     */
    public void setDnsCache(String DnsCache) {
        this.DnsCache = DnsCache;
    }

    /**
     * Get <p>EipConfig固定ip配置</p> 
     * @return EipConfig <p>EipConfig固定ip配置</p>
     */
    public FunctionEipConfigFixed getEipConfig() {
        return this.EipConfig;
    }

    /**
     * Set <p>EipConfig固定ip配置</p>
     * @param EipConfig <p>EipConfig固定ip配置</p>
     */
    public void setEipConfig(FunctionEipConfigFixed EipConfig) {
        this.EipConfig = EipConfig;
    }

    public CreateFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFunctionRequest(CreateFunctionRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Handler != null) {
            this.Handler = new String(source.Handler);
        }
        if (source.MemorySize != null) {
            this.MemorySize = new Long(source.MemorySize);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.UseGpu != null) {
            this.UseGpu = new String(source.UseGpu);
        }
        if (source.InstallDependency != null) {
            this.InstallDependency = new String(source.InstallDependency);
        }
        if (source.Stamp != null) {
            this.Stamp = new String(source.Stamp);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.Code != null) {
            this.Code = new CodeReq(source.Code);
        }
        if (source.PrivateConfig != null) {
            this.PrivateConfig = new PrivateConfig(source.PrivateConfig);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.Environment != null) {
            this.Environment = new FunctionEnvironment(source.Environment);
        }
        if (source.InitTimeout != null) {
            this.InitTimeout = new Long(source.InitTimeout);
        }
        if (source.CodeSource != null) {
            this.CodeSource = new String(source.CodeSource);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new FunctionVpcConfig(source.VpcConfig);
        }
        if (source.Layers != null) {
            this.Layers = new FunctionLayer[source.Layers.length];
            for (int i = 0; i < source.Layers.length; i++) {
                this.Layers[i] = new FunctionLayer(source.Layers[i]);
            }
        }
        if (source.PublicNetConfig != null) {
            this.PublicNetConfig = new FunctionPublicNetConfig(source.PublicNetConfig);
        }
        if (source.AsyncRunEnable != null) {
            this.AsyncRunEnable = new String(source.AsyncRunEnable);
        }
        if (source.TraceEnable != null) {
            this.TraceEnable = new String(source.TraceEnable);
        }
        if (source.AutoCreateClsTopic != null) {
            this.AutoCreateClsTopic = new String(source.AutoCreateClsTopic);
        }
        if (source.AutoDeployClsTopicIndex != null) {
            this.AutoDeployClsTopicIndex = new String(source.AutoDeployClsTopicIndex);
        }
        if (source.DnsCache != null) {
            this.DnsCache = new String(source.DnsCache);
        }
        if (source.EipConfig != null) {
            this.EipConfig = new FunctionEipConfigFixed(source.EipConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "UseGpu", this.UseGpu);
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "Stamp", this.Stamp);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamObj(map, prefix + "Code.", this.Code);
        this.setParamObj(map, prefix + "PrivateConfig.", this.PrivateConfig);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamSimple(map, prefix + "InitTimeout", this.InitTimeout);
        this.setParamSimple(map, prefix + "CodeSource", this.CodeSource);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamObj(map, prefix + "PublicNetConfig.", this.PublicNetConfig);
        this.setParamSimple(map, prefix + "AsyncRunEnable", this.AsyncRunEnable);
        this.setParamSimple(map, prefix + "TraceEnable", this.TraceEnable);
        this.setParamSimple(map, prefix + "AutoCreateClsTopic", this.AutoCreateClsTopic);
        this.setParamSimple(map, prefix + "AutoDeployClsTopicIndex", this.AutoDeployClsTopicIndex);
        this.setParamSimple(map, prefix + "DnsCache", this.DnsCache);
        this.setParamObj(map, prefix + "EipConfig.", this.EipConfig);

    }
}

