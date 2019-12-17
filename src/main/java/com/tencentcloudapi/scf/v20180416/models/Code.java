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

public class Code extends AbstractModel{

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
    * 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。
    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * 如果是通过Demo创建的话，需要传入DemoId
    */
    @SerializedName("DemoId")
    @Expose
    private String DemoId;

    /**
    * 如果是从TempCos创建的话，需要传入TempCosObjectName
    */
    @SerializedName("TempCosObjectName")
    @Expose
    private String TempCosObjectName;

    /**
    * Git地址
    */
    @SerializedName("GitUrl")
    @Expose
    private String GitUrl;

    /**
    * Git用户名
    */
    @SerializedName("GitUserName")
    @Expose
    private String GitUserName;

    /**
    * Git密码
    */
    @SerializedName("GitPassword")
    @Expose
    private String GitPassword;

    /**
    * 加密后的Git密码，一般无需指定
    */
    @SerializedName("GitPasswordSecret")
    @Expose
    private String GitPasswordSecret;

    /**
    * Git分支
    */
    @SerializedName("GitBranch")
    @Expose
    private String GitBranch;

    /**
    * 代码在Git仓库中的路径
    */
    @SerializedName("GitDirectory")
    @Expose
    private String GitDirectory;

    /**
    * 指定要拉取的版本
    */
    @SerializedName("GitCommitId")
    @Expose
    private String GitCommitId;

    /**
    * 加密后的Git用户名，一般无需指定
    */
    @SerializedName("GitUserNameSecret")
    @Expose
    private String GitUserNameSecret;

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
     * Get 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。 
     * @return CosBucketRegion 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。
     * @param CosBucketRegion 对象存储的地域，地域为北京时需要传入ap-beijing,北京一区时需要传递ap-beijing-1，其他的地域不需要传递。
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get 如果是通过Demo创建的话，需要传入DemoId 
     * @return DemoId 如果是通过Demo创建的话，需要传入DemoId
     */
    public String getDemoId() {
        return this.DemoId;
    }

    /**
     * Set 如果是通过Demo创建的话，需要传入DemoId
     * @param DemoId 如果是通过Demo创建的话，需要传入DemoId
     */
    public void setDemoId(String DemoId) {
        this.DemoId = DemoId;
    }

    /**
     * Get 如果是从TempCos创建的话，需要传入TempCosObjectName 
     * @return TempCosObjectName 如果是从TempCos创建的话，需要传入TempCosObjectName
     */
    public String getTempCosObjectName() {
        return this.TempCosObjectName;
    }

    /**
     * Set 如果是从TempCos创建的话，需要传入TempCosObjectName
     * @param TempCosObjectName 如果是从TempCos创建的话，需要传入TempCosObjectName
     */
    public void setTempCosObjectName(String TempCosObjectName) {
        this.TempCosObjectName = TempCosObjectName;
    }

    /**
     * Get Git地址 
     * @return GitUrl Git地址
     */
    public String getGitUrl() {
        return this.GitUrl;
    }

    /**
     * Set Git地址
     * @param GitUrl Git地址
     */
    public void setGitUrl(String GitUrl) {
        this.GitUrl = GitUrl;
    }

    /**
     * Get Git用户名 
     * @return GitUserName Git用户名
     */
    public String getGitUserName() {
        return this.GitUserName;
    }

    /**
     * Set Git用户名
     * @param GitUserName Git用户名
     */
    public void setGitUserName(String GitUserName) {
        this.GitUserName = GitUserName;
    }

    /**
     * Get Git密码 
     * @return GitPassword Git密码
     */
    public String getGitPassword() {
        return this.GitPassword;
    }

    /**
     * Set Git密码
     * @param GitPassword Git密码
     */
    public void setGitPassword(String GitPassword) {
        this.GitPassword = GitPassword;
    }

    /**
     * Get 加密后的Git密码，一般无需指定 
     * @return GitPasswordSecret 加密后的Git密码，一般无需指定
     */
    public String getGitPasswordSecret() {
        return this.GitPasswordSecret;
    }

    /**
     * Set 加密后的Git密码，一般无需指定
     * @param GitPasswordSecret 加密后的Git密码，一般无需指定
     */
    public void setGitPasswordSecret(String GitPasswordSecret) {
        this.GitPasswordSecret = GitPasswordSecret;
    }

    /**
     * Get Git分支 
     * @return GitBranch Git分支
     */
    public String getGitBranch() {
        return this.GitBranch;
    }

    /**
     * Set Git分支
     * @param GitBranch Git分支
     */
    public void setGitBranch(String GitBranch) {
        this.GitBranch = GitBranch;
    }

    /**
     * Get 代码在Git仓库中的路径 
     * @return GitDirectory 代码在Git仓库中的路径
     */
    public String getGitDirectory() {
        return this.GitDirectory;
    }

    /**
     * Set 代码在Git仓库中的路径
     * @param GitDirectory 代码在Git仓库中的路径
     */
    public void setGitDirectory(String GitDirectory) {
        this.GitDirectory = GitDirectory;
    }

    /**
     * Get 指定要拉取的版本 
     * @return GitCommitId 指定要拉取的版本
     */
    public String getGitCommitId() {
        return this.GitCommitId;
    }

    /**
     * Set 指定要拉取的版本
     * @param GitCommitId 指定要拉取的版本
     */
    public void setGitCommitId(String GitCommitId) {
        this.GitCommitId = GitCommitId;
    }

    /**
     * Get 加密后的Git用户名，一般无需指定 
     * @return GitUserNameSecret 加密后的Git用户名，一般无需指定
     */
    public String getGitUserNameSecret() {
        return this.GitUserNameSecret;
    }

    /**
     * Set 加密后的Git用户名，一般无需指定
     * @param GitUserNameSecret 加密后的Git用户名，一般无需指定
     */
    public void setGitUserNameSecret(String GitUserNameSecret) {
        this.GitUserNameSecret = GitUserNameSecret;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosObjectName", this.CosObjectName);
        this.setParamSimple(map, prefix + "ZipFile", this.ZipFile);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "DemoId", this.DemoId);
        this.setParamSimple(map, prefix + "TempCosObjectName", this.TempCosObjectName);
        this.setParamSimple(map, prefix + "GitUrl", this.GitUrl);
        this.setParamSimple(map, prefix + "GitUserName", this.GitUserName);
        this.setParamSimple(map, prefix + "GitPassword", this.GitPassword);
        this.setParamSimple(map, prefix + "GitPasswordSecret", this.GitPasswordSecret);
        this.setParamSimple(map, prefix + "GitBranch", this.GitBranch);
        this.setParamSimple(map, prefix + "GitDirectory", this.GitDirectory);
        this.setParamSimple(map, prefix + "GitCommitId", this.GitCommitId);
        this.setParamSimple(map, prefix + "GitUserNameSecret", this.GitUserNameSecret);

    }
}

