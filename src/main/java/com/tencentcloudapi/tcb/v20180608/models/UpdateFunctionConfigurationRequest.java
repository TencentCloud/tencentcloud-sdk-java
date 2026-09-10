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

public class UpdateFunctionConfigurationRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>要修改的函数名称</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>函数运行时内存大小，默认为 128 M，可选范围64M、128 M-3072 M，以 128MB 为阶梯。</p>
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * <p>函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>函数的环境变量</p>
    */
    @SerializedName("Environment")
    @Expose
    private FunctionEnvironment Environment;

    /**
    * <p>函数的私有网络配置</p>
    */
    @SerializedName("VpcConfig")
    @Expose
    private FunctionVpcConfig VpcConfig;

    /**
    * <p>公网访问配置</p>
    */
    @SerializedName("PublicNetConfig")
    @Expose
    private FunctionPublicNetConfig PublicNetConfig;

    /**
    * <p>函数运行环境，创建时指定，目前不支持修改。</p>
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * <p>函数绑定的角色</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>在线依赖安装，TRUE 表示安装，仅支持 Node.js 函数。 </p><p>默认值：FALSE</p>
    */
    @SerializedName("InstallDependency")
    @Expose
    private String InstallDependency;

    /**
    * <p>日志投递到的cls日志集ID</p>
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * <p>日志投递到的cls Topic ID</p>
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * <p>在更新时是否同步发布新版本</p><p>默认值：FALSE</p>
    */
    @SerializedName("Publish")
    @Expose
    private String Publish;

    /**
    * <p>是否开启L5访问能力，TRUE 为开启，FALSE为关闭</p>
    */
    @SerializedName("L5Enable")
    @Expose
    private String L5Enable;

    /**
    * <p>函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。</p>
    */
    @SerializedName("Layers")
    @Expose
    private FunctionLayer [] Layers;

    /**
    * <p>函数初始化执行超时时间</p>
    */
    @SerializedName("InitTimeout")
    @Expose
    private Long InitTimeout;

    /**
    * <p>是否开启Dns缓存能力。只支持EVENT函数。</p><p>默认值：FALSE</p>
    */
    @SerializedName("DnsCache")
    @Expose
    private String DnsCache;

    /**
    * <p>忽略系统日志上报</p>
    */
    @SerializedName("IgnoreSysLog")
    @Expose
    private String IgnoreSysLog;

    /**
    * <p>固定IP配置</p>
    */
    @SerializedName("EipConfig")
    @Expose
    private FunctionEipConfigFixed [] EipConfig;

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
     * Get <p>要修改的函数名称</p> 
     * @return FunctionName <p>要修改的函数名称</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>要修改的函数名称</p>
     * @param FunctionName <p>要修改的函数名称</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文</p> 
     * @return Description <p>函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文</p>
     * @param Description <p>函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>函数运行时内存大小，默认为 128 M，可选范围64M、128 M-3072 M，以 128MB 为阶梯。</p> 
     * @return MemorySize <p>函数运行时内存大小，默认为 128 M，可选范围64M、128 M-3072 M，以 128MB 为阶梯。</p>
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set <p>函数运行时内存大小，默认为 128 M，可选范围64M、128 M-3072 M，以 128MB 为阶梯。</p>
     * @param MemorySize <p>函数运行时内存大小，默认为 128 M，可选范围64M、128 M-3072 M，以 128MB 为阶梯。</p>
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get <p>函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒</p> 
     * @return Timeout <p>函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒</p>
     * @param Timeout <p>函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>函数的环境变量</p> 
     * @return Environment <p>函数的环境变量</p>
     */
    public FunctionEnvironment getEnvironment() {
        return this.Environment;
    }

    /**
     * Set <p>函数的环境变量</p>
     * @param Environment <p>函数的环境变量</p>
     */
    public void setEnvironment(FunctionEnvironment Environment) {
        this.Environment = Environment;
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
     * Get <p>函数运行环境，创建时指定，目前不支持修改。</p> 
     * @return Runtime <p>函数运行环境，创建时指定，目前不支持修改。</p>
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set <p>函数运行环境，创建时指定，目前不支持修改。</p>
     * @param Runtime <p>函数运行环境，创建时指定，目前不支持修改。</p>
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
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
     * Get <p>在线依赖安装，TRUE 表示安装，仅支持 Node.js 函数。 </p><p>默认值：FALSE</p> 
     * @return InstallDependency <p>在线依赖安装，TRUE 表示安装，仅支持 Node.js 函数。 </p><p>默认值：FALSE</p>
     */
    public String getInstallDependency() {
        return this.InstallDependency;
    }

    /**
     * Set <p>在线依赖安装，TRUE 表示安装，仅支持 Node.js 函数。 </p><p>默认值：FALSE</p>
     * @param InstallDependency <p>在线依赖安装，TRUE 表示安装，仅支持 Node.js 函数。 </p><p>默认值：FALSE</p>
     */
    public void setInstallDependency(String InstallDependency) {
        this.InstallDependency = InstallDependency;
    }

    /**
     * Get <p>日志投递到的cls日志集ID</p> 
     * @return ClsTopicId <p>日志投递到的cls日志集ID</p>
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set <p>日志投递到的cls日志集ID</p>
     * @param ClsTopicId <p>日志投递到的cls日志集ID</p>
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get <p>日志投递到的cls Topic ID</p> 
     * @return ClsLogsetId <p>日志投递到的cls Topic ID</p>
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set <p>日志投递到的cls Topic ID</p>
     * @param ClsLogsetId <p>日志投递到的cls Topic ID</p>
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get <p>在更新时是否同步发布新版本</p><p>默认值：FALSE</p> 
     * @return Publish <p>在更新时是否同步发布新版本</p><p>默认值：FALSE</p>
     */
    public String getPublish() {
        return this.Publish;
    }

    /**
     * Set <p>在更新时是否同步发布新版本</p><p>默认值：FALSE</p>
     * @param Publish <p>在更新时是否同步发布新版本</p><p>默认值：FALSE</p>
     */
    public void setPublish(String Publish) {
        this.Publish = Publish;
    }

    /**
     * Get <p>是否开启L5访问能力，TRUE 为开启，FALSE为关闭</p> 
     * @return L5Enable <p>是否开启L5访问能力，TRUE 为开启，FALSE为关闭</p>
     */
    public String getL5Enable() {
        return this.L5Enable;
    }

    /**
     * Set <p>是否开启L5访问能力，TRUE 为开启，FALSE为关闭</p>
     * @param L5Enable <p>是否开启L5访问能力，TRUE 为开启，FALSE为关闭</p>
     */
    public void setL5Enable(String L5Enable) {
        this.L5Enable = L5Enable;
    }

    /**
     * Get <p>函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。</p> 
     * @return Layers <p>函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。</p>
     */
    public FunctionLayer [] getLayers() {
        return this.Layers;
    }

    /**
     * Set <p>函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。</p>
     * @param Layers <p>函数要关联的层版本列表，层的版本会按照在列表中顺序依次覆盖。</p>
     */
    public void setLayers(FunctionLayer [] Layers) {
        this.Layers = Layers;
    }

    /**
     * Get <p>函数初始化执行超时时间</p> 
     * @return InitTimeout <p>函数初始化执行超时时间</p>
     */
    public Long getInitTimeout() {
        return this.InitTimeout;
    }

    /**
     * Set <p>函数初始化执行超时时间</p>
     * @param InitTimeout <p>函数初始化执行超时时间</p>
     */
    public void setInitTimeout(Long InitTimeout) {
        this.InitTimeout = InitTimeout;
    }

    /**
     * Get <p>是否开启Dns缓存能力。只支持EVENT函数。</p><p>默认值：FALSE</p> 
     * @return DnsCache <p>是否开启Dns缓存能力。只支持EVENT函数。</p><p>默认值：FALSE</p>
     */
    public String getDnsCache() {
        return this.DnsCache;
    }

    /**
     * Set <p>是否开启Dns缓存能力。只支持EVENT函数。</p><p>默认值：FALSE</p>
     * @param DnsCache <p>是否开启Dns缓存能力。只支持EVENT函数。</p><p>默认值：FALSE</p>
     */
    public void setDnsCache(String DnsCache) {
        this.DnsCache = DnsCache;
    }

    /**
     * Get <p>忽略系统日志上报</p> 
     * @return IgnoreSysLog <p>忽略系统日志上报</p>
     */
    public String getIgnoreSysLog() {
        return this.IgnoreSysLog;
    }

    /**
     * Set <p>忽略系统日志上报</p>
     * @param IgnoreSysLog <p>忽略系统日志上报</p>
     */
    public void setIgnoreSysLog(String IgnoreSysLog) {
        this.IgnoreSysLog = IgnoreSysLog;
    }

    /**
     * Get <p>固定IP配置</p> 
     * @return EipConfig <p>固定IP配置</p>
     */
    public FunctionEipConfigFixed [] getEipConfig() {
        return this.EipConfig;
    }

    /**
     * Set <p>固定IP配置</p>
     * @param EipConfig <p>固定IP配置</p>
     */
    public void setEipConfig(FunctionEipConfigFixed [] EipConfig) {
        this.EipConfig = EipConfig;
    }

    public UpdateFunctionConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFunctionConfigurationRequest(UpdateFunctionConfigurationRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
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
        if (source.Environment != null) {
            this.Environment = new FunctionEnvironment(source.Environment);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new FunctionVpcConfig(source.VpcConfig);
        }
        if (source.PublicNetConfig != null) {
            this.PublicNetConfig = new FunctionPublicNetConfig(source.PublicNetConfig);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.InstallDependency != null) {
            this.InstallDependency = new String(source.InstallDependency);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.Publish != null) {
            this.Publish = new String(source.Publish);
        }
        if (source.L5Enable != null) {
            this.L5Enable = new String(source.L5Enable);
        }
        if (source.Layers != null) {
            this.Layers = new FunctionLayer[source.Layers.length];
            for (int i = 0; i < source.Layers.length; i++) {
                this.Layers[i] = new FunctionLayer(source.Layers[i]);
            }
        }
        if (source.InitTimeout != null) {
            this.InitTimeout = new Long(source.InitTimeout);
        }
        if (source.DnsCache != null) {
            this.DnsCache = new String(source.DnsCache);
        }
        if (source.IgnoreSysLog != null) {
            this.IgnoreSysLog = new String(source.IgnoreSysLog);
        }
        if (source.EipConfig != null) {
            this.EipConfig = new FunctionEipConfigFixed[source.EipConfig.length];
            for (int i = 0; i < source.EipConfig.length; i++) {
                this.EipConfig[i] = new FunctionEipConfigFixed(source.EipConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamObj(map, prefix + "PublicNetConfig.", this.PublicNetConfig);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "Publish", this.Publish);
        this.setParamSimple(map, prefix + "L5Enable", this.L5Enable);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamSimple(map, prefix + "InitTimeout", this.InitTimeout);
        this.setParamSimple(map, prefix + "DnsCache", this.DnsCache);
        this.setParamSimple(map, prefix + "IgnoreSysLog", this.IgnoreSysLog);
        this.setParamArrayObj(map, prefix + "EipConfig.", this.EipConfig);

    }
}

