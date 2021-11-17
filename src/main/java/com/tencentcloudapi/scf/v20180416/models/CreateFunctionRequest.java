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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFunctionRequest extends AbstractModel{

    /**
    * 创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数代码. 注意：不能同时指定Cos、ZipFile或 DemoId。
    */
    @SerializedName("Code")
    @Expose
    private Code Code;

    /**
    * 函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * 函数描述,最大支持 1000 个英文字母、数字、空格、逗号、换行符和英文句号，支持中文
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 函数运行时内存大小，默认为 128M，可选范围 64、128MB-3072MB，并且以 128MB 为阶梯
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * 函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 函数的环境变量
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，Nodejs8.9，Nodejs10.15，Nodejs12.16， Php5， Php7，Go1，Java8 和 CustomRuntime，默认Python2.7
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 函数的私有网络配置
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * 函数所属命名空间
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
    * [在线依赖安装](https://cloud.tencent.com/document/product/583/37920)，TRUE 表示安装，默认值为 FALSE。仅支持 Node.js 函数。
    */
    @SerializedName("InstallDependency")
    @Expose
    private String InstallDependency;

    /**
    * 函数日志投递到的CLS LogsetID
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * 函数日志投递到的CLS TopicID
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * 函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * CodeSource 代码来源，支持ZipFile, Cos, Demo 其中之一
    */
    @SerializedName("CodeSource")
    @Expose
    private String CodeSource;

    /**
    * 函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。
    */
    @SerializedName("Layers")
    @Expose
    private LayerVersionSimple [] Layers;

    /**
    * 死信队列参数
    */
    @SerializedName("DeadLetterConfig")
    @Expose
    private DeadLetterConfig DeadLetterConfig;

    /**
    * 公网访问配置
    */
    @SerializedName("PublicNetConfig")
    @Expose
    private PublicNetConfigIn PublicNetConfig;

    /**
    * 文件系统配置参数，用于云函数挂载文件系统
    */
    @SerializedName("CfsConfig")
    @Expose
    private CfsConfig CfsConfig;

    /**
    * 函数初始化超时时间，默认 65s，镜像部署函数默认 90s。
    */
    @SerializedName("InitTimeout")
    @Expose
    private Long InitTimeout;

    /**
    * 函数 Tag 参数，以键值对数组形式传入
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否开启异步属性，TRUE 为开启，FALSE为关闭
    */
    @SerializedName("AsyncRunEnable")
    @Expose
    private String AsyncRunEnable;

    /**
    * 是否开启事件追踪，TRUE 为开启，FALSE为关闭
    */
    @SerializedName("TraceEnable")
    @Expose
    private String TraceEnable;

    /**
    * HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * HTTP函数配置ProtocolType访问协议，当前协议可配置的参数
    */
    @SerializedName("ProtocolParams")
    @Expose
    private ProtocolParams ProtocolParams;

    /**
     * Get 创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60 
     * @return FunctionName 创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60
     * @param FunctionName 创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数代码. 注意：不能同时指定Cos、ZipFile或 DemoId。 
     * @return Code 函数代码. 注意：不能同时指定Cos、ZipFile或 DemoId。
     */
    public Code getCode() {
        return this.Code;
    }

    /**
     * Set 函数代码. 注意：不能同时指定Cos、ZipFile或 DemoId。
     * @param Code 函数代码. 注意：不能同时指定Cos、ZipFile或 DemoId。
     */
    public void setCode(Code Code) {
        this.Code = Code;
    }

    /**
     * Get 函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符 
     * @return Handler 函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set 函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符
     * @param Handler 函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * Get 函数描述,最大支持 1000 个英文字母、数字、空格、逗号、换行符和英文句号，支持中文 
     * @return Description 函数描述,最大支持 1000 个英文字母、数字、空格、逗号、换行符和英文句号，支持中文
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 函数描述,最大支持 1000 个英文字母、数字、空格、逗号、换行符和英文句号，支持中文
     * @param Description 函数描述,最大支持 1000 个英文字母、数字、空格、逗号、换行符和英文句号，支持中文
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 函数运行时内存大小，默认为 128M，可选范围 64、128MB-3072MB，并且以 128MB 为阶梯 
     * @return MemorySize 函数运行时内存大小，默认为 128M，可选范围 64、128MB-3072MB，并且以 128MB 为阶梯
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set 函数运行时内存大小，默认为 128M，可选范围 64、128MB-3072MB，并且以 128MB 为阶梯
     * @param MemorySize 函数运行时内存大小，默认为 128M，可选范围 64、128MB-3072MB，并且以 128MB 为阶梯
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get 函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒 
     * @return Timeout 函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒
     * @param Timeout 函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
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
     * Get 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，Nodejs8.9，Nodejs10.15，Nodejs12.16， Php5， Php7，Go1，Java8 和 CustomRuntime，默认Python2.7 
     * @return Runtime 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，Nodejs8.9，Nodejs10.15，Nodejs12.16， Php5， Php7，Go1，Java8 和 CustomRuntime，默认Python2.7
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，Nodejs8.9，Nodejs10.15，Nodejs12.16， Php5， Php7，Go1，Java8 和 CustomRuntime，默认Python2.7
     * @param Runtime 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，Nodejs8.9，Nodejs10.15，Nodejs12.16， Php5， Php7，Go1，Java8 和 CustomRuntime，默认Python2.7
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 函数的私有网络配置 
     * @return VpcConfig 函数的私有网络配置
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set 函数的私有网络配置
     * @param VpcConfig 函数的私有网络配置
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get 函数所属命名空间 
     * @return Namespace 函数所属命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所属命名空间
     * @param Namespace 函数所属命名空间
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
     * Get [在线依赖安装](https://cloud.tencent.com/document/product/583/37920)，TRUE 表示安装，默认值为 FALSE。仅支持 Node.js 函数。 
     * @return InstallDependency [在线依赖安装](https://cloud.tencent.com/document/product/583/37920)，TRUE 表示安装，默认值为 FALSE。仅支持 Node.js 函数。
     */
    public String getInstallDependency() {
        return this.InstallDependency;
    }

    /**
     * Set [在线依赖安装](https://cloud.tencent.com/document/product/583/37920)，TRUE 表示安装，默认值为 FALSE。仅支持 Node.js 函数。
     * @param InstallDependency [在线依赖安装](https://cloud.tencent.com/document/product/583/37920)，TRUE 表示安装，默认值为 FALSE。仅支持 Node.js 函数。
     */
    public void setInstallDependency(String InstallDependency) {
        this.InstallDependency = InstallDependency;
    }

    /**
     * Get 函数日志投递到的CLS LogsetID 
     * @return ClsLogsetId 函数日志投递到的CLS LogsetID
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set 函数日志投递到的CLS LogsetID
     * @param ClsLogsetId 函数日志投递到的CLS LogsetID
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get 函数日志投递到的CLS TopicID 
     * @return ClsTopicId 函数日志投递到的CLS TopicID
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set 函数日志投递到的CLS TopicID
     * @param ClsTopicId 函数日志投递到的CLS TopicID
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get 函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP 
     * @return Type 函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP
     * @param Type 函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get CodeSource 代码来源，支持ZipFile, Cos, Demo 其中之一 
     * @return CodeSource CodeSource 代码来源，支持ZipFile, Cos, Demo 其中之一
     */
    public String getCodeSource() {
        return this.CodeSource;
    }

    /**
     * Set CodeSource 代码来源，支持ZipFile, Cos, Demo 其中之一
     * @param CodeSource CodeSource 代码来源，支持ZipFile, Cos, Demo 其中之一
     */
    public void setCodeSource(String CodeSource) {
        this.CodeSource = CodeSource;
    }

    /**
     * Get 函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。 
     * @return Layers 函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。
     */
    public LayerVersionSimple [] getLayers() {
        return this.Layers;
    }

    /**
     * Set 函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。
     * @param Layers 函数要关联的Layer版本列表，Layer会按照在列表中顺序依次覆盖。
     */
    public void setLayers(LayerVersionSimple [] Layers) {
        this.Layers = Layers;
    }

    /**
     * Get 死信队列参数 
     * @return DeadLetterConfig 死信队列参数
     */
    public DeadLetterConfig getDeadLetterConfig() {
        return this.DeadLetterConfig;
    }

    /**
     * Set 死信队列参数
     * @param DeadLetterConfig 死信队列参数
     */
    public void setDeadLetterConfig(DeadLetterConfig DeadLetterConfig) {
        this.DeadLetterConfig = DeadLetterConfig;
    }

    /**
     * Get 公网访问配置 
     * @return PublicNetConfig 公网访问配置
     */
    public PublicNetConfigIn getPublicNetConfig() {
        return this.PublicNetConfig;
    }

    /**
     * Set 公网访问配置
     * @param PublicNetConfig 公网访问配置
     */
    public void setPublicNetConfig(PublicNetConfigIn PublicNetConfig) {
        this.PublicNetConfig = PublicNetConfig;
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
     * Get 函数初始化超时时间，默认 65s，镜像部署函数默认 90s。 
     * @return InitTimeout 函数初始化超时时间，默认 65s，镜像部署函数默认 90s。
     */
    public Long getInitTimeout() {
        return this.InitTimeout;
    }

    /**
     * Set 函数初始化超时时间，默认 65s，镜像部署函数默认 90s。
     * @param InitTimeout 函数初始化超时时间，默认 65s，镜像部署函数默认 90s。
     */
    public void setInitTimeout(Long InitTimeout) {
        this.InitTimeout = InitTimeout;
    }

    /**
     * Get 函数 Tag 参数，以键值对数组形式传入 
     * @return Tags 函数 Tag 参数，以键值对数组形式传入
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 函数 Tag 参数，以键值对数组形式传入
     * @param Tags 函数 Tag 参数，以键值对数组形式传入
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启异步属性，TRUE 为开启，FALSE为关闭 
     * @return AsyncRunEnable 是否开启异步属性，TRUE 为开启，FALSE为关闭
     */
    public String getAsyncRunEnable() {
        return this.AsyncRunEnable;
    }

    /**
     * Set 是否开启异步属性，TRUE 为开启，FALSE为关闭
     * @param AsyncRunEnable 是否开启异步属性，TRUE 为开启，FALSE为关闭
     */
    public void setAsyncRunEnable(String AsyncRunEnable) {
        this.AsyncRunEnable = AsyncRunEnable;
    }

    /**
     * Get 是否开启事件追踪，TRUE 为开启，FALSE为关闭 
     * @return TraceEnable 是否开启事件追踪，TRUE 为开启，FALSE为关闭
     */
    public String getTraceEnable() {
        return this.TraceEnable;
    }

    /**
     * Set 是否开启事件追踪，TRUE 为开启，FALSE为关闭
     * @param TraceEnable 是否开启事件追踪，TRUE 为开启，FALSE为关闭
     */
    public void setTraceEnable(String TraceEnable) {
        this.TraceEnable = TraceEnable;
    }

    /**
     * Get HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS 
     * @return ProtocolType HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS
     * @param ProtocolType HTTP函数支持的访问协议。当前支持WebSockets协议，值为WS
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get HTTP函数配置ProtocolType访问协议，当前协议可配置的参数 
     * @return ProtocolParams HTTP函数配置ProtocolType访问协议，当前协议可配置的参数
     */
    public ProtocolParams getProtocolParams() {
        return this.ProtocolParams;
    }

    /**
     * Set HTTP函数配置ProtocolType访问协议，当前协议可配置的参数
     * @param ProtocolParams HTTP函数配置ProtocolType访问协议，当前协议可配置的参数
     */
    public void setProtocolParams(ProtocolParams ProtocolParams) {
        this.ProtocolParams = ProtocolParams;
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
        if (source.Code != null) {
            this.Code = new Code(source.Code);
        }
        if (source.Handler != null) {
            this.Handler = new String(source.Handler);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MemorySize != null) {
            this.MemorySize = new Long(source.MemorySize);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Environment != null) {
            this.Environment = new Environment(source.Environment);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new VpcConfig(source.VpcConfig);
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
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CodeSource != null) {
            this.CodeSource = new String(source.CodeSource);
        }
        if (source.Layers != null) {
            this.Layers = new LayerVersionSimple[source.Layers.length];
            for (int i = 0; i < source.Layers.length; i++) {
                this.Layers[i] = new LayerVersionSimple(source.Layers[i]);
            }
        }
        if (source.DeadLetterConfig != null) {
            this.DeadLetterConfig = new DeadLetterConfig(source.DeadLetterConfig);
        }
        if (source.PublicNetConfig != null) {
            this.PublicNetConfig = new PublicNetConfigIn(source.PublicNetConfig);
        }
        if (source.CfsConfig != null) {
            this.CfsConfig = new CfsConfig(source.CfsConfig);
        }
        if (source.InitTimeout != null) {
            this.InitTimeout = new Long(source.InitTimeout);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AsyncRunEnable != null) {
            this.AsyncRunEnable = new String(source.AsyncRunEnable);
        }
        if (source.TraceEnable != null) {
            this.TraceEnable = new String(source.TraceEnable);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.ProtocolParams != null) {
            this.ProtocolParams = new ProtocolParams(source.ProtocolParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamObj(map, prefix + "Code.", this.Code);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CodeSource", this.CodeSource);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);
        this.setParamObj(map, prefix + "PublicNetConfig.", this.PublicNetConfig);
        this.setParamObj(map, prefix + "CfsConfig.", this.CfsConfig);
        this.setParamSimple(map, prefix + "InitTimeout", this.InitTimeout);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AsyncRunEnable", this.AsyncRunEnable);
        this.setParamSimple(map, prefix + "TraceEnable", this.TraceEnable);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamObj(map, prefix + "ProtocolParams.", this.ProtocolParams);

    }
}

