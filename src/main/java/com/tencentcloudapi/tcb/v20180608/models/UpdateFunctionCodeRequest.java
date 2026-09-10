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

public class UpdateFunctionCodeRequest extends AbstractModel {

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
    * <p>函数所属命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>在线依赖安装</p>
    */
    @SerializedName("InstallDependency")
    @Expose
    private String InstallDependency;

    /**
    * <p>在更新时是否同步发布新版本，默认为：FALSE，不发布 示例值：FALSE</p>
    */
    @SerializedName("Publish")
    @Expose
    private String Publish;

    /**
    * <p>包含函数代码文件的zip格式文件</p>
    */
    @SerializedName("Code")
    @Expose
    private CodeReq Code;

    /**
    * <p>代码来源方式，支持 ZipFile, Cos, Inline 之一 示例值：Cos</p>
    */
    @SerializedName("CodeSource")
    @Expose
    private String CodeSource;

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
     * Get <p>函数所属命名空间</p> 
     * @return Namespace <p>函数所属命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>函数所属命名空间</p>
     * @param Namespace <p>函数所属命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
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
     * Get <p>在更新时是否同步发布新版本，默认为：FALSE，不发布 示例值：FALSE</p> 
     * @return Publish <p>在更新时是否同步发布新版本，默认为：FALSE，不发布 示例值：FALSE</p>
     */
    public String getPublish() {
        return this.Publish;
    }

    /**
     * Set <p>在更新时是否同步发布新版本，默认为：FALSE，不发布 示例值：FALSE</p>
     * @param Publish <p>在更新时是否同步发布新版本，默认为：FALSE，不发布 示例值：FALSE</p>
     */
    public void setPublish(String Publish) {
        this.Publish = Publish;
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
     * Get <p>代码来源方式，支持 ZipFile, Cos, Inline 之一 示例值：Cos</p> 
     * @return CodeSource <p>代码来源方式，支持 ZipFile, Cos, Inline 之一 示例值：Cos</p>
     */
    public String getCodeSource() {
        return this.CodeSource;
    }

    /**
     * Set <p>代码来源方式，支持 ZipFile, Cos, Inline 之一 示例值：Cos</p>
     * @param CodeSource <p>代码来源方式，支持 ZipFile, Cos, Inline 之一 示例值：Cos</p>
     */
    public void setCodeSource(String CodeSource) {
        this.CodeSource = CodeSource;
    }

    public UpdateFunctionCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFunctionCodeRequest(UpdateFunctionCodeRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Handler != null) {
            this.Handler = new String(source.Handler);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.InstallDependency != null) {
            this.InstallDependency = new String(source.InstallDependency);
        }
        if (source.Publish != null) {
            this.Publish = new String(source.Publish);
        }
        if (source.Code != null) {
            this.Code = new CodeReq(source.Code);
        }
        if (source.CodeSource != null) {
            this.CodeSource = new String(source.CodeSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "Publish", this.Publish);
        this.setParamObj(map, prefix + "Code.", this.Code);
        this.setParamSimple(map, prefix + "CodeSource", this.CodeSource);

    }
}

