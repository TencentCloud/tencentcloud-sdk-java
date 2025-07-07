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
package com.tencentcloudapi.acp.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppScanTaskRepeatRequest extends AbstractModel {

    /**
    * 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android), 3:app漏洞扫描;
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 应用平台, 0:android, 1:ios, 2:小程序
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 任务类型, 0:基础版, 1:专家版, 2:本地化
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 原诊断任务ID
    */
    @SerializedName("OrgTaskID")
    @Expose
    private String OrgTaskID;

    /**
    * App包名
    */
    @SerializedName("AppPackage")
    @Expose
    private String AppPackage;

    /**
    * 上传的文件ID(任务来源为1时必填)
    */
    @SerializedName("FileID")
    @Expose
    private String FileID;

    /**
    * 软件下载链接地址(任务来源为2时必填)
    */
    @SerializedName("AppDownloadUrl")
    @Expose
    private String AppDownloadUrl;

    /**
    * 隐私文本下载地址(任务来源为2时必填)
    */
    @SerializedName("PrivacyTextUrl")
    @Expose
    private String PrivacyTextUrl;

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 隐私申明文件名称
    */
    @SerializedName("PrivacyTextName")
    @Expose
    private String PrivacyTextName;

    /**
    * 软件Sha1值(PrivacyTextMD5不为空时必填)
    */
    @SerializedName("AppSha1")
    @Expose
    private String AppSha1;

    /**
    * 隐私申明文本md5(AppSha1不为空时必填)
    */
    @SerializedName("PrivacyTextMD5")
    @Expose
    private String PrivacyTextMD5;

    /**
     * Get 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android), 3:app漏洞扫描; 
     * @return Source 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android), 3:app漏洞扫描;
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android), 3:app漏洞扫描;
     * @param Source 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android), 3:app漏洞扫描;
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 应用平台, 0:android, 1:ios, 2:小程序 
     * @return Platform 应用平台, 0:android, 1:ios, 2:小程序
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 应用平台, 0:android, 1:ios, 2:小程序
     * @param Platform 应用平台, 0:android, 1:ios, 2:小程序
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 任务类型, 0:基础版, 1:专家版, 2:本地化 
     * @return TaskType 任务类型, 0:基础版, 1:专家版, 2:本地化
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型, 0:基础版, 1:专家版, 2:本地化
     * @param TaskType 任务类型, 0:基础版, 1:专家版, 2:本地化
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 原诊断任务ID 
     * @return OrgTaskID 原诊断任务ID
     */
    public String getOrgTaskID() {
        return this.OrgTaskID;
    }

    /**
     * Set 原诊断任务ID
     * @param OrgTaskID 原诊断任务ID
     */
    public void setOrgTaskID(String OrgTaskID) {
        this.OrgTaskID = OrgTaskID;
    }

    /**
     * Get App包名 
     * @return AppPackage App包名
     */
    public String getAppPackage() {
        return this.AppPackage;
    }

    /**
     * Set App包名
     * @param AppPackage App包名
     */
    public void setAppPackage(String AppPackage) {
        this.AppPackage = AppPackage;
    }

    /**
     * Get 上传的文件ID(任务来源为1时必填) 
     * @return FileID 上传的文件ID(任务来源为1时必填)
     */
    public String getFileID() {
        return this.FileID;
    }

    /**
     * Set 上传的文件ID(任务来源为1时必填)
     * @param FileID 上传的文件ID(任务来源为1时必填)
     */
    public void setFileID(String FileID) {
        this.FileID = FileID;
    }

    /**
     * Get 软件下载链接地址(任务来源为2时必填) 
     * @return AppDownloadUrl 软件下载链接地址(任务来源为2时必填)
     */
    public String getAppDownloadUrl() {
        return this.AppDownloadUrl;
    }

    /**
     * Set 软件下载链接地址(任务来源为2时必填)
     * @param AppDownloadUrl 软件下载链接地址(任务来源为2时必填)
     */
    public void setAppDownloadUrl(String AppDownloadUrl) {
        this.AppDownloadUrl = AppDownloadUrl;
    }

    /**
     * Get 隐私文本下载地址(任务来源为2时必填) 
     * @return PrivacyTextUrl 隐私文本下载地址(任务来源为2时必填)
     */
    public String getPrivacyTextUrl() {
        return this.PrivacyTextUrl;
    }

    /**
     * Set 隐私文本下载地址(任务来源为2时必填)
     * @param PrivacyTextUrl 隐私文本下载地址(任务来源为2时必填)
     */
    public void setPrivacyTextUrl(String PrivacyTextUrl) {
        this.PrivacyTextUrl = PrivacyTextUrl;
    }

    /**
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 隐私申明文件名称 
     * @return PrivacyTextName 隐私申明文件名称
     */
    public String getPrivacyTextName() {
        return this.PrivacyTextName;
    }

    /**
     * Set 隐私申明文件名称
     * @param PrivacyTextName 隐私申明文件名称
     */
    public void setPrivacyTextName(String PrivacyTextName) {
        this.PrivacyTextName = PrivacyTextName;
    }

    /**
     * Get 软件Sha1值(PrivacyTextMD5不为空时必填) 
     * @return AppSha1 软件Sha1值(PrivacyTextMD5不为空时必填)
     */
    public String getAppSha1() {
        return this.AppSha1;
    }

    /**
     * Set 软件Sha1值(PrivacyTextMD5不为空时必填)
     * @param AppSha1 软件Sha1值(PrivacyTextMD5不为空时必填)
     */
    public void setAppSha1(String AppSha1) {
        this.AppSha1 = AppSha1;
    }

    /**
     * Get 隐私申明文本md5(AppSha1不为空时必填) 
     * @return PrivacyTextMD5 隐私申明文本md5(AppSha1不为空时必填)
     */
    public String getPrivacyTextMD5() {
        return this.PrivacyTextMD5;
    }

    /**
     * Set 隐私申明文本md5(AppSha1不为空时必填)
     * @param PrivacyTextMD5 隐私申明文本md5(AppSha1不为空时必填)
     */
    public void setPrivacyTextMD5(String PrivacyTextMD5) {
        this.PrivacyTextMD5 = PrivacyTextMD5;
    }

    public CreateAppScanTaskRepeatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppScanTaskRepeatRequest(CreateAppScanTaskRepeatRequest source) {
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.OrgTaskID != null) {
            this.OrgTaskID = new String(source.OrgTaskID);
        }
        if (source.AppPackage != null) {
            this.AppPackage = new String(source.AppPackage);
        }
        if (source.FileID != null) {
            this.FileID = new String(source.FileID);
        }
        if (source.AppDownloadUrl != null) {
            this.AppDownloadUrl = new String(source.AppDownloadUrl);
        }
        if (source.PrivacyTextUrl != null) {
            this.PrivacyTextUrl = new String(source.PrivacyTextUrl);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.PrivacyTextName != null) {
            this.PrivacyTextName = new String(source.PrivacyTextName);
        }
        if (source.AppSha1 != null) {
            this.AppSha1 = new String(source.AppSha1);
        }
        if (source.PrivacyTextMD5 != null) {
            this.PrivacyTextMD5 = new String(source.PrivacyTextMD5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "OrgTaskID", this.OrgTaskID);
        this.setParamSimple(map, prefix + "AppPackage", this.AppPackage);
        this.setParamSimple(map, prefix + "FileID", this.FileID);
        this.setParamSimple(map, prefix + "AppDownloadUrl", this.AppDownloadUrl);
        this.setParamSimple(map, prefix + "PrivacyTextUrl", this.PrivacyTextUrl);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PrivacyTextName", this.PrivacyTextName);
        this.setParamSimple(map, prefix + "AppSha1", this.AppSha1);
        this.setParamSimple(map, prefix + "PrivacyTextMD5", this.PrivacyTextMD5);

    }
}

