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

public class AgentRuntimeConfig extends AbstractModel {

    /**
    * 函数代码. 注意：不能同时指定Cos和ZipFile
    */
    @SerializedName("Code")
    @Expose
    private AgentRuntimeCode Code;

    /**
    * 函数运行环境，默认Python2.7
目前支持的运行环境：
- Python2.7
- Python3.6
- Python3.7
- Python3.9
- Python3.10
- Nodejs6.10
- Nodejs8.9
- Nodejs10.15
- Nodejs12.16
- Nodejs14.18
- Nodejs16.13
- Nodejs18.15
- Php5.6
- Php7(7.2版本)
- Php7.4
- Php8.0
- Go1
- Java8
- CustomRuntime
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 函数运行时内存大小，默认为 128M，可选范围 64、128MB-3072MB，并且以 128MB 为阶梯
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * 函数是否自动安装依赖
    */
    @SerializedName("InstallDependency")
    @Expose
    private Boolean InstallDependency;

    /**
    * 函数最长执行时间，单位为秒，可选值范围 1-900 秒，默认为 3 秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 函数的环境变量，满足json格式
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * Agent Session 配置
    */
    @SerializedName("SessionConfig")
    @Expose
    private AgentRuntimeSessionConfig SessionConfig;

    /**
     * Get 函数代码. 注意：不能同时指定Cos和ZipFile 
     * @return Code 函数代码. 注意：不能同时指定Cos和ZipFile
     */
    public AgentRuntimeCode getCode() {
        return this.Code;
    }

    /**
     * Set 函数代码. 注意：不能同时指定Cos和ZipFile
     * @param Code 函数代码. 注意：不能同时指定Cos和ZipFile
     */
    public void setCode(AgentRuntimeCode Code) {
        this.Code = Code;
    }

    /**
     * Get 函数运行环境，默认Python2.7
目前支持的运行环境：
- Python2.7
- Python3.6
- Python3.7
- Python3.9
- Python3.10
- Nodejs6.10
- Nodejs8.9
- Nodejs10.15
- Nodejs12.16
- Nodejs14.18
- Nodejs16.13
- Nodejs18.15
- Php5.6
- Php7(7.2版本)
- Php7.4
- Php8.0
- Go1
- Java8
- CustomRuntime 
     * @return Runtime 函数运行环境，默认Python2.7
目前支持的运行环境：
- Python2.7
- Python3.6
- Python3.7
- Python3.9
- Python3.10
- Nodejs6.10
- Nodejs8.9
- Nodejs10.15
- Nodejs12.16
- Nodejs14.18
- Nodejs16.13
- Nodejs18.15
- Php5.6
- Php7(7.2版本)
- Php7.4
- Php8.0
- Go1
- Java8
- CustomRuntime
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 函数运行环境，默认Python2.7
目前支持的运行环境：
- Python2.7
- Python3.6
- Python3.7
- Python3.9
- Python3.10
- Nodejs6.10
- Nodejs8.9
- Nodejs10.15
- Nodejs12.16
- Nodejs14.18
- Nodejs16.13
- Nodejs18.15
- Php5.6
- Php7(7.2版本)
- Php7.4
- Php8.0
- Go1
- Java8
- CustomRuntime
     * @param Runtime 函数运行环境，默认Python2.7
目前支持的运行环境：
- Python2.7
- Python3.6
- Python3.7
- Python3.9
- Python3.10
- Nodejs6.10
- Nodejs8.9
- Nodejs10.15
- Nodejs12.16
- Nodejs14.18
- Nodejs16.13
- Nodejs18.15
- Php5.6
- Php7(7.2版本)
- Php7.4
- Php8.0
- Go1
- Java8
- CustomRuntime
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
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
     * Get 函数是否自动安装依赖 
     * @return InstallDependency 函数是否自动安装依赖
     */
    public Boolean getInstallDependency() {
        return this.InstallDependency;
    }

    /**
     * Set 函数是否自动安装依赖
     * @param InstallDependency 函数是否自动安装依赖
     */
    public void setInstallDependency(Boolean InstallDependency) {
        this.InstallDependency = InstallDependency;
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
     * Get 函数的环境变量，满足json格式 
     * @return Environment 函数的环境变量，满足json格式
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 函数的环境变量，满足json格式
     * @param Environment 函数的环境变量，满足json格式
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Agent Session 配置 
     * @return SessionConfig Agent Session 配置
     */
    public AgentRuntimeSessionConfig getSessionConfig() {
        return this.SessionConfig;
    }

    /**
     * Set Agent Session 配置
     * @param SessionConfig Agent Session 配置
     */
    public void setSessionConfig(AgentRuntimeSessionConfig SessionConfig) {
        this.SessionConfig = SessionConfig;
    }

    public AgentRuntimeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentRuntimeConfig(AgentRuntimeConfig source) {
        if (source.Code != null) {
            this.Code = new AgentRuntimeCode(source.Code);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.MemorySize != null) {
            this.MemorySize = new Long(source.MemorySize);
        }
        if (source.InstallDependency != null) {
            this.InstallDependency = new Boolean(source.InstallDependency);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.SessionConfig != null) {
            this.SessionConfig = new AgentRuntimeSessionConfig(source.SessionConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Code.", this.Code);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamObj(map, prefix + "SessionConfig.", this.SessionConfig);

    }
}

