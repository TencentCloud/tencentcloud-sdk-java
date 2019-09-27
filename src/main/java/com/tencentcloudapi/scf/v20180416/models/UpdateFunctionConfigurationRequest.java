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

public class UpdateFunctionConfigurationRequest  extends AbstractModel{

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
    * 函数运行时内存大小，默认为 128 M，可选范 128 M-1536 M
    */
    @SerializedName("MemorySize")
    @Expose
    private Integer MemorySize;

    /**
    * 函数最长执行时间，单位为秒，可选值范 1-300 秒，默认为 3 秒
    */
    @SerializedName("Timeout")
    @Expose
    private Integer Timeout;

    /**
    * 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，PHP5， PHP7，Golang1 和 Java8
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
    * 在更新时是否同步发布新版本，默认为：FALSE，不发布
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
     * 获取要修改的函数名称
     * @return FunctionName 要修改的函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置要修改的函数名称
     * @param FunctionName 要修改的函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文
     * @return Description 函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文
     * @param Description 函数描述。最大支持 1000 个英文字母、数字、空格、逗号和英文句号，支持中文
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取函数运行时内存大小，默认为 128 M，可选范 128 M-1536 M
     * @return MemorySize 函数运行时内存大小，默认为 128 M，可选范 128 M-1536 M
     */
    public Integer getMemorySize() {
        return this.MemorySize;
    }

    /**
     * 设置函数运行时内存大小，默认为 128 M，可选范 128 M-1536 M
     * @param MemorySize 函数运行时内存大小，默认为 128 M，可选范 128 M-1536 M
     */
    public void setMemorySize(Integer MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * 获取函数最长执行时间，单位为秒，可选值范 1-300 秒，默认为 3 秒
     * @return Timeout 函数最长执行时间，单位为秒，可选值范 1-300 秒，默认为 3 秒
     */
    public Integer getTimeout() {
        return this.Timeout;
    }

    /**
     * 设置函数最长执行时间，单位为秒，可选值范 1-300 秒，默认为 3 秒
     * @param Timeout 函数最长执行时间，单位为秒，可选值范 1-300 秒，默认为 3 秒
     */
    public void setTimeout(Integer Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * 获取函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，PHP5， PHP7，Golang1 和 Java8
     * @return Runtime 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，PHP5， PHP7，Golang1 和 Java8
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * 设置函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，PHP5， PHP7，Golang1 和 Java8
     * @param Runtime 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10，PHP5， PHP7，Golang1 和 Java8
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * 获取函数的环境变量
     * @return Environment 函数的环境变量
     */
    public Environment getEnvironment() {
        return this.Environment;
    }

    /**
     * 设置函数的环境变量
     * @param Environment 函数的环境变量
     */
    public void setEnvironment(Environment Environment) {
        this.Environment = Environment;
    }

    /**
     * 获取函数所属命名空间
     * @return Namespace 函数所属命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置函数所属命名空间
     * @param Namespace 函数所属命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 获取函数的私有网络配置
     * @return VpcConfig 函数的私有网络配置
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * 设置函数的私有网络配置
     * @param VpcConfig 函数的私有网络配置
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * 获取函数绑定的角色
     * @return Role 函数绑定的角色
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * 设置函数绑定的角色
     * @param Role 函数绑定的角色
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * 获取日志投递到的cls日志集ID
     * @return ClsLogsetId 日志投递到的cls日志集ID
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * 设置日志投递到的cls日志集ID
     * @param ClsLogsetId 日志投递到的cls日志集ID
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * 获取日志投递到的cls Topic ID
     * @return ClsTopicId 日志投递到的cls Topic ID
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * 设置日志投递到的cls Topic ID
     * @param ClsTopicId 日志投递到的cls Topic ID
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * 获取在更新时是否同步发布新版本，默认为：FALSE，不发布
     * @return Publish 在更新时是否同步发布新版本，默认为：FALSE，不发布
     */
    public String getPublish() {
        return this.Publish;
    }

    /**
     * 设置在更新时是否同步发布新版本，默认为：FALSE，不发布
     * @param Publish 在更新时是否同步发布新版本，默认为：FALSE，不发布
     */
    public void setPublish(String Publish) {
        this.Publish = Publish;
    }

    /**
     * 获取是否开启L5访问能力，TRUE 为开启，FALSE为关闭
     * @return L5Enable 是否开启L5访问能力，TRUE 为开启，FALSE为关闭
     */
    public String getL5Enable() {
        return this.L5Enable;
    }

    /**
     * 设置是否开启L5访问能力，TRUE 为开启，FALSE为关闭
     * @param L5Enable 是否开启L5访问能力，TRUE 为开启，FALSE为关闭
     */
    public void setL5Enable(String L5Enable) {
        this.L5Enable = L5Enable;
    }

    /**
     * 内部实现，用户禁止调用
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
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "Publish", this.Publish);
        this.setParamSimple(map, prefix + "L5Enable", this.L5Enable);

    }
}

