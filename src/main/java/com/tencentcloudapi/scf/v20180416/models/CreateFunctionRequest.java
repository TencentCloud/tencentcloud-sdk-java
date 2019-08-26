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

public class CreateFunctionRequest  extends AbstractModel{

    /**
    * 创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数的代码. 注意：不能同时指定Cos与ZipFile
    */
    @SerializedName("Code")
    @Expose
    private Code Code;

    /**
    * 函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式，文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符
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
    * 函数运行时内存大小，默认为 128M，可选范围 128MB-1536MB，并且以 128MB 为阶梯
    */
    @SerializedName("MemorySize")
    @Expose
    private Integer MemorySize;

    /**
    * 函数最长执行时间，单位为秒，可选值范围 1-300 秒，默认为 3 秒
    */
    @SerializedName("Timeout")
    @Expose
    private Integer Timeout;

    /**
    * 函数的环境变量
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10， PHP5， PHP7，Golang1 和 Java8，默认Python2.7
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
    * CodeSource 代码来源，支持以下'ZipFile', 'Cos', 'Demo', 'TempCos', 'Git'之一，使用Git来源必须指定此字段
    */
    @SerializedName("CodeSource")
    @Expose
    private String CodeSource;

    /**
     * 获取创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60
     * @return FunctionName 创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60
     * @param FunctionName 创建的函数名称，函数名称支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度2-60
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取函数的代码. 注意：不能同时指定Cos与ZipFile
     * @return Code 函数的代码. 注意：不能同时指定Cos与ZipFile
     */
    public Code getCode() {
        return this.Code;
    }

    /**
     * 设置函数的代码. 注意：不能同时指定Cos与ZipFile
     * @param Code 函数的代码. 注意：不能同时指定Cos与ZipFile
     */
    public void setCode(Code Code) {
        this.Code = Code;
    }

    /**
     * 获取函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式，文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符
     * @return Handler 函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式，文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * 设置函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式，文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符
     * @param Handler 函数处理方法名称，名称格式支持 "文件名称.方法名称" 形式，文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求是 2-60 个字符
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * 获取函数描述,最大支持 1000 个英文字母、数字、空格、逗号、换行符和英文句号，支持中文
     * @return Description 函数描述,最大支持 1000 个英文字母、数字、空格、逗号、换行符和英文句号，支持中文
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置函数描述,最大支持 1000 个英文字母、数字、空格、逗号、换行符和英文句号，支持中文
     * @param Description 函数描述,最大支持 1000 个英文字母、数字、空格、逗号、换行符和英文句号，支持中文
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取函数运行时内存大小，默认为 128M，可选范围 128MB-1536MB，并且以 128MB 为阶梯
     * @return MemorySize 函数运行时内存大小，默认为 128M，可选范围 128MB-1536MB，并且以 128MB 为阶梯
     */
    public Integer getMemorySize() {
        return this.MemorySize;
    }

    /**
     * 设置函数运行时内存大小，默认为 128M，可选范围 128MB-1536MB，并且以 128MB 为阶梯
     * @param MemorySize 函数运行时内存大小，默认为 128M，可选范围 128MB-1536MB，并且以 128MB 为阶梯
     */
    public void setMemorySize(Integer MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * 获取函数最长执行时间，单位为秒，可选值范围 1-300 秒，默认为 3 秒
     * @return Timeout 函数最长执行时间，单位为秒，可选值范围 1-300 秒，默认为 3 秒
     */
    public Integer getTimeout() {
        return this.Timeout;
    }

    /**
     * 设置函数最长执行时间，单位为秒，可选值范围 1-300 秒，默认为 3 秒
     * @param Timeout 函数最长执行时间，单位为秒，可选值范围 1-300 秒，默认为 3 秒
     */
    public void setTimeout(Integer Timeout) {
        this.Timeout = Timeout;
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
     * 获取函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10， PHP5， PHP7，Golang1 和 Java8，默认Python2.7
     * @return Runtime 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10， PHP5， PHP7，Golang1 和 Java8，默认Python2.7
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * 设置函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10， PHP5， PHP7，Golang1 和 Java8，默认Python2.7
     * @param Runtime 函数运行环境，目前仅支持 Python2.7，Python3.6，Nodejs6.10， PHP5， PHP7，Golang1 和 Java8，默认Python2.7
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
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
     * 获取函数日志投递到的CLS LogsetID
     * @return ClsLogsetId 函数日志投递到的CLS LogsetID
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * 设置函数日志投递到的CLS LogsetID
     * @param ClsLogsetId 函数日志投递到的CLS LogsetID
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * 获取函数日志投递到的CLS TopicID
     * @return ClsTopicId 函数日志投递到的CLS TopicID
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * 设置函数日志投递到的CLS TopicID
     * @param ClsTopicId 函数日志投递到的CLS TopicID
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * 获取函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP
     * @return Type 函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP
     * @param Type 函数类型，默认值为Event，创建触发器函数请填写Event，创建HTTP函数级服务请填写HTTP
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取CodeSource 代码来源，支持以下'ZipFile', 'Cos', 'Demo', 'TempCos', 'Git'之一，使用Git来源必须指定此字段
     * @return CodeSource CodeSource 代码来源，支持以下'ZipFile', 'Cos', 'Demo', 'TempCos', 'Git'之一，使用Git来源必须指定此字段
     */
    public String getCodeSource() {
        return this.CodeSource;
    }

    /**
     * 设置CodeSource 代码来源，支持以下'ZipFile', 'Cos', 'Demo', 'TempCos', 'Git'之一，使用Git来源必须指定此字段
     * @param CodeSource CodeSource 代码来源，支持以下'ZipFile', 'Cos', 'Demo', 'TempCos', 'Git'之一，使用Git来源必须指定此字段
     */
    public void setCodeSource(String CodeSource) {
        this.CodeSource = CodeSource;
    }

    /**
     * 内部实现，用户禁止调用
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
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CodeSource", this.CodeSource);

    }
}

