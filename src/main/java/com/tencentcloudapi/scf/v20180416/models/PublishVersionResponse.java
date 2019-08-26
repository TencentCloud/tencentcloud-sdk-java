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

public class PublishVersionResponse  extends AbstractModel{

    /**
    * 函数的版本
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * 代码大小
    */
    @SerializedName("CodeSize")
    @Expose
    private Integer CodeSize;

    /**
    * 最大可用内存
    */
    @SerializedName("MemorySize")
    @Expose
    private Integer MemorySize;

    /**
    * 函数的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 函数的入口
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * 函数的超时时间
    */
    @SerializedName("Timeout")
    @Expose
    private Integer Timeout;

    /**
    * 函数的运行环境
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 函数的命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取函数的版本
     * @return FunctionVersion 函数的版本
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * 设置函数的版本
     * @param FunctionVersion 函数的版本
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * 获取代码大小
     * @return CodeSize 代码大小
     */
    public Integer getCodeSize() {
        return this.CodeSize;
    }

    /**
     * 设置代码大小
     * @param CodeSize 代码大小
     */
    public void setCodeSize(Integer CodeSize) {
        this.CodeSize = CodeSize;
    }

    /**
     * 获取最大可用内存
     * @return MemorySize 最大可用内存
     */
    public Integer getMemorySize() {
        return this.MemorySize;
    }

    /**
     * 设置最大可用内存
     * @param MemorySize 最大可用内存
     */
    public void setMemorySize(Integer MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * 获取函数的描述
     * @return Description 函数的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置函数的描述
     * @param Description 函数的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取函数的入口
     * @return Handler 函数的入口
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * 设置函数的入口
     * @param Handler 函数的入口
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * 获取函数的超时时间
     * @return Timeout 函数的超时时间
     */
    public Integer getTimeout() {
        return this.Timeout;
    }

    /**
     * 设置函数的超时时间
     * @param Timeout 函数的超时时间
     */
    public void setTimeout(Integer Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * 获取函数的运行环境
     * @return Runtime 函数的运行环境
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * 设置函数的运行环境
     * @param Runtime 函数的运行环境
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * 获取函数的命名空间
     * @return Namespace 函数的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置函数的命名空间
     * @param Namespace 函数的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "CodeSize", this.CodeSize);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

