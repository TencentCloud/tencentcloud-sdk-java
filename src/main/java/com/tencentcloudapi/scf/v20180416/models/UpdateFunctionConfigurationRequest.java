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

public class UpdateFunctionConfigurationRequest extends AbstractModel {

    /**
    * 要修改的函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 函数运行时内存大小，默认为 128 M，可选范64M、128 M-3072 M，以 128MB 为阶梯。
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * 函数最长执行时间，单位为秒，可选值范 1-900 秒，默认为 3 秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 函数运行环境，创建时指定，目前不支持修改。
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 函数的环境变量
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * 函数所属命名空间
默认值: default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数的私有网络配置
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

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
    * 日志投递到的cls日志集ID
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * 日志投递到的cls Topic ID
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * 在更新时是否同步发布新版本，默认为：FALSE，不发布新版本
    */
    @SerializedName("Publish")
    @Expose
    private String Publish;

    /**
    * 是否开启L5访问能力，TRUE 为开启，FALSE为关闭
    */
    @SerializedName("L5Enable")
    @Expose
    private String L5Enable;

    /**
    * 函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。
    */
    @SerializedName("Layers")
    @Expose
    private LayerVersionSimple [] Layers;

    /**
    * 函数关联的死信队列信息
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
    * 文件系统配置入参，用于云函数绑定CFS文件系统
    */
    @SerializedName("CfsConfig")
    @Expose
    private CfsConfig CfsConfig;

    /**
    * 函数初始化执行超时时间
    */
    @SerializedName("InitTimeout")
    @Expose
    private Long InitTimeout;

    /**
    * HTTP函数配置ProtocolType访问协议，当前协议可配置的参数
    */
    @SerializedName("ProtocolParams")
    @Expose
    private ProtocolParams ProtocolParams;

    /**
    * 单实例多并发配置。只支持Web函数。
    */
    @SerializedName("InstanceConcurrencyConfig")
    @Expose
    private InstanceConcurrencyConfig InstanceConcurrencyConfig;

    /**
    * 是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭
    */
    @SerializedName("DnsCache")
    @Expose
    private String DnsCache;

    /**
    * 内网访问配置
    */
    @SerializedName("IntranetConfig")
    @Expose
    private IntranetConfigIn IntranetConfig;

    /**
    * 忽略系统日志上报
    */
    @SerializedName("IgnoreSysLog")
    @Expose
    private Boolean IgnoreSysLog;

    /**
     * Get 要修改的函数名称 
     * @return FunctionName 要修改的函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 要修改的函数名称
     * @param FunctionName 要修改的函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文 
     * @return Description 函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文
     * @param Description 函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 函数运行时内存大小，默认为 128 M，可选范64M、128 M-3072 M，以 128MB 为阶梯。 
     * @return MemorySize 函数运行时内存大小，默认为 128 M，可选范64M、128 M-3072 M，以 128MB 为阶梯。
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set 函数运行时内存大小，默认为 128 M，可选范64M、128 M-3072 M，以 128MB 为阶梯。
     * @param MemorySize 函数运行时内存大小，默认为 128 M，可选范64M、128 M-3072 M，以 128MB 为阶梯。
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get 函数最长执行时间，单位为秒，可选值范 1-900 秒，默认为 3 秒 
     * @return Timeout 函数最长执行时间，单位为秒，可选值范 1-900 秒，默认为 3 秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 函数最长执行时间，单位为秒，可选值范 1-900 秒，默认为 3 秒
     * @param Timeout 函数最长执行时间，单位为秒，可选值范 1-900 秒，默认为 3 秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 函数运行环境，创建时指定，目前不支持修改。 
     * @return Runtime 函数运行环境，创建时指定，目前不支持修改。
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 函数运行环境，创建时指定，目前不支持修改。
     * @param Runtime 函数运行环境，创建时指定，目前不支持修改。
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
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
     * Get 函数所属命名空间
默认值: default 
     * @return Namespace 函数所属命名空间
默认值: default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所属命名空间
默认值: default
     * @param Namespace 函数所属命名空间
默认值: default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
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
     * Get 日志投递到的cls日志集ID 
     * @return ClsLogsetId 日志投递到的cls日志集ID
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set 日志投递到的cls日志集ID
     * @param ClsLogsetId 日志投递到的cls日志集ID
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get 日志投递到的cls Topic ID 
     * @return ClsTopicId 日志投递到的cls Topic ID
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set 日志投递到的cls Topic ID
     * @param ClsTopicId 日志投递到的cls Topic ID
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get 在更新时是否同步发布新版本，默认为：FALSE，不发布新版本 
     * @return Publish 在更新时是否同步发布新版本，默认为：FALSE，不发布新版本
     */
    public String getPublish() {
        return this.Publish;
    }

    /**
     * Set 在更新时是否同步发布新版本，默认为：FALSE，不发布新版本
     * @param Publish 在更新时是否同步发布新版本，默认为：FALSE，不发布新版本
     */
    public void setPublish(String Publish) {
        this.Publish = Publish;
    }

    /**
     * Get 是否开启L5访问能力，TRUE 为开启，FALSE为关闭 
     * @return L5Enable 是否开启L5访问能力，TRUE 为开启，FALSE为关闭
     */
    public String getL5Enable() {
        return this.L5Enable;
    }

    /**
     * Set 是否开启L5访问能力，TRUE 为开启，FALSE为关闭
     * @param L5Enable 是否开启L5访问能力，TRUE 为开启，FALSE为关闭
     */
    public void setL5Enable(String L5Enable) {
        this.L5Enable = L5Enable;
    }

    /**
     * Get 函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。 
     * @return Layers 函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。
     */
    public LayerVersionSimple [] getLayers() {
        return this.Layers;
    }

    /**
     * Set 函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。
     * @param Layers 函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。
     */
    public void setLayers(LayerVersionSimple [] Layers) {
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
     * Get 文件系统配置入参，用于云函数绑定CFS文件系统 
     * @return CfsConfig 文件系统配置入参，用于云函数绑定CFS文件系统
     */
    public CfsConfig getCfsConfig() {
        return this.CfsConfig;
    }

    /**
     * Set 文件系统配置入参，用于云函数绑定CFS文件系统
     * @param CfsConfig 文件系统配置入参，用于云函数绑定CFS文件系统
     */
    public void setCfsConfig(CfsConfig CfsConfig) {
        this.CfsConfig = CfsConfig;
    }

    /**
     * Get 函数初始化执行超时时间 
     * @return InitTimeout 函数初始化执行超时时间
     */
    public Long getInitTimeout() {
        return this.InitTimeout;
    }

    /**
     * Set 函数初始化执行超时时间
     * @param InitTimeout 函数初始化执行超时时间
     */
    public void setInitTimeout(Long InitTimeout) {
        this.InitTimeout = InitTimeout;
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

    /**
     * Get 单实例多并发配置。只支持Web函数。 
     * @return InstanceConcurrencyConfig 单实例多并发配置。只支持Web函数。
     */
    public InstanceConcurrencyConfig getInstanceConcurrencyConfig() {
        return this.InstanceConcurrencyConfig;
    }

    /**
     * Set 单实例多并发配置。只支持Web函数。
     * @param InstanceConcurrencyConfig 单实例多并发配置。只支持Web函数。
     */
    public void setInstanceConcurrencyConfig(InstanceConcurrencyConfig InstanceConcurrencyConfig) {
        this.InstanceConcurrencyConfig = InstanceConcurrencyConfig;
    }

    /**
     * Get 是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭 
     * @return DnsCache 是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭
     */
    public String getDnsCache() {
        return this.DnsCache;
    }

    /**
     * Set 是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭
     * @param DnsCache 是否开启Dns缓存能力。只支持EVENT函数。默认为FALSE，TRUE 为开启，FALSE为关闭
     */
    public void setDnsCache(String DnsCache) {
        this.DnsCache = DnsCache;
    }

    /**
     * Get 内网访问配置 
     * @return IntranetConfig 内网访问配置
     */
    public IntranetConfigIn getIntranetConfig() {
        return this.IntranetConfig;
    }

    /**
     * Set 内网访问配置
     * @param IntranetConfig 内网访问配置
     */
    public void setIntranetConfig(IntranetConfigIn IntranetConfig) {
        this.IntranetConfig = IntranetConfig;
    }

    /**
     * Get 忽略系统日志上报 
     * @return IgnoreSysLog 忽略系统日志上报
     */
    public Boolean getIgnoreSysLog() {
        return this.IgnoreSysLog;
    }

    /**
     * Set 忽略系统日志上报
     * @param IgnoreSysLog 忽略系统日志上报
     */
    public void setIgnoreSysLog(Boolean IgnoreSysLog) {
        this.IgnoreSysLog = IgnoreSysLog;
    }

    public UpdateFunctionConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFunctionConfigurationRequest(UpdateFunctionConfigurationRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
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
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.Environment != null) {
            this.Environment = new Environment(source.Environment);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new VpcConfig(source.VpcConfig);
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
        if (source.Publish != null) {
            this.Publish = new String(source.Publish);
        }
        if (source.L5Enable != null) {
            this.L5Enable = new String(source.L5Enable);
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
        if (source.ProtocolParams != null) {
            this.ProtocolParams = new ProtocolParams(source.ProtocolParams);
        }
        if (source.InstanceConcurrencyConfig != null) {
            this.InstanceConcurrencyConfig = new InstanceConcurrencyConfig(source.InstanceConcurrencyConfig);
        }
        if (source.DnsCache != null) {
            this.DnsCache = new String(source.DnsCache);
        }
        if (source.IntranetConfig != null) {
            this.IntranetConfig = new IntranetConfigIn(source.IntranetConfig);
        }
        if (source.IgnoreSysLog != null) {
            this.IgnoreSysLog = new Boolean(source.IgnoreSysLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "Publish", this.Publish);
        this.setParamSimple(map, prefix + "L5Enable", this.L5Enable);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);
        this.setParamObj(map, prefix + "PublicNetConfig.", this.PublicNetConfig);
        this.setParamObj(map, prefix + "CfsConfig.", this.CfsConfig);
        this.setParamSimple(map, prefix + "InitTimeout", this.InitTimeout);
        this.setParamObj(map, prefix + "ProtocolParams.", this.ProtocolParams);
        this.setParamObj(map, prefix + "InstanceConcurrencyConfig.", this.InstanceConcurrencyConfig);
        this.setParamSimple(map, prefix + "DnsCache", this.DnsCache);
        this.setParamObj(map, prefix + "IntranetConfig.", this.IntranetConfig);
        this.setParamSimple(map, prefix + "IgnoreSysLog", this.IgnoreSysLog);

    }
}

