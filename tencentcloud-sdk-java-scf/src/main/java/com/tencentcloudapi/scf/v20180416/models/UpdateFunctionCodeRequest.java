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

public class UpdateFunctionCodeRequest extends AbstractModel{

    /**
    * 函数处理方法名称。名称格式支持“文件名称.函数名称”形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求 2-60 个字符
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * 要修改的函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 对象存储桶名称
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 对象存储对象路径
    */
    @SerializedName("CosObjectName")
    @Expose
    private String CosObjectName;

    /**
    * 包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M
    */
    @SerializedName("ZipFile")
    @Expose
    private String ZipFile;

    /**
    * 函数所属命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 对象存储的地域，注：北京分为ap-beijing和ap-beijing-1
    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * 函数所属环境
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 在更新时是否同步发布新版本，默认为：FALSE，不发布
    */
    @SerializedName("Publish")
    @Expose
    private String Publish;

    /**
    * 函数代码
    */
    @SerializedName("Code")
    @Expose
    private Code Code;

    /**
    * 代码来源方式，支持以下'ZipFile', 'Cos', 'Inline', 'TempCos', 'Git' 之一，使用Git来源必须指定此字段
    */
    @SerializedName("CodeSource")
    @Expose
    private String CodeSource;

    /**
     * Get 函数处理方法名称。名称格式支持“文件名称.函数名称”形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求 2-60 个字符 
     * @return Handler 函数处理方法名称。名称格式支持“文件名称.函数名称”形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求 2-60 个字符
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set 函数处理方法名称。名称格式支持“文件名称.函数名称”形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求 2-60 个字符
     * @param Handler 函数处理方法名称。名称格式支持“文件名称.函数名称”形式（java 名称格式 包名.类名::方法名），文件名称和函数名称之间以"."隔开，文件名称和函数名称要求以字母开始和结尾，中间允许插入字母、数字、下划线和连接符，文件名称和函数名字的长度要求 2-60 个字符
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

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
     * Get 对象存储桶名称 
     * @return CosBucketName 对象存储桶名称
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set 对象存储桶名称
     * @param CosBucketName 对象存储桶名称
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 对象存储对象路径 
     * @return CosObjectName 对象存储对象路径
     */
    public String getCosObjectName() {
        return this.CosObjectName;
    }

    /**
     * Set 对象存储对象路径
     * @param CosObjectName 对象存储对象路径
     */
    public void setCosObjectName(String CosObjectName) {
        this.CosObjectName = CosObjectName;
    }

    /**
     * Get 包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M 
     * @return ZipFile 包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M
     */
    public String getZipFile() {
        return this.ZipFile;
    }

    /**
     * Set 包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M
     * @param ZipFile 包含函数代码文件及其依赖项的 zip 格式文件，使用该接口时要求将 zip 文件的内容转成 base64 编码，最大支持20M
     */
    public void setZipFile(String ZipFile) {
        this.ZipFile = ZipFile;
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
     * Get 对象存储的地域，注：北京分为ap-beijing和ap-beijing-1 
     * @return CosBucketRegion 对象存储的地域，注：北京分为ap-beijing和ap-beijing-1
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set 对象存储的地域，注：北京分为ap-beijing和ap-beijing-1
     * @param CosBucketRegion 对象存储的地域，注：北京分为ap-beijing和ap-beijing-1
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get 函数所属环境 
     * @return EnvId 函数所属环境
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 函数所属环境
     * @param EnvId 函数所属环境
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 在更新时是否同步发布新版本，默认为：FALSE，不发布 
     * @return Publish 在更新时是否同步发布新版本，默认为：FALSE，不发布
     */
    public String getPublish() {
        return this.Publish;
    }

    /**
     * Set 在更新时是否同步发布新版本，默认为：FALSE，不发布
     * @param Publish 在更新时是否同步发布新版本，默认为：FALSE，不发布
     */
    public void setPublish(String Publish) {
        this.Publish = Publish;
    }

    /**
     * Get 函数代码 
     * @return Code 函数代码
     */
    public Code getCode() {
        return this.Code;
    }

    /**
     * Set 函数代码
     * @param Code 函数代码
     */
    public void setCode(Code Code) {
        this.Code = Code;
    }

    /**
     * Get 代码来源方式，支持以下'ZipFile', 'Cos', 'Inline', 'TempCos', 'Git' 之一，使用Git来源必须指定此字段 
     * @return CodeSource 代码来源方式，支持以下'ZipFile', 'Cos', 'Inline', 'TempCos', 'Git' 之一，使用Git来源必须指定此字段
     */
    public String getCodeSource() {
        return this.CodeSource;
    }

    /**
     * Set 代码来源方式，支持以下'ZipFile', 'Cos', 'Inline', 'TempCos', 'Git' 之一，使用Git来源必须指定此字段
     * @param CodeSource 代码来源方式，支持以下'ZipFile', 'Cos', 'Inline', 'TempCos', 'Git' 之一，使用Git来源必须指定此字段
     */
    public void setCodeSource(String CodeSource) {
        this.CodeSource = CodeSource;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosObjectName", this.CosObjectName);
        this.setParamSimple(map, prefix + "ZipFile", this.ZipFile);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Publish", this.Publish);
        this.setParamObj(map, prefix + "Code.", this.Code);
        this.setParamSimple(map, prefix + "CodeSource", this.CodeSource);

    }
}

