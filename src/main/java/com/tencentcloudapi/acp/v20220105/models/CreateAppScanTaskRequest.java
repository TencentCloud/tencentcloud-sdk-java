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
package com.tencentcloudapi.acp.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppScanTaskRequest extends AbstractModel{

    /**
    * 任务类型, 0:基础版, 1:专家版, 2:本地化
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲;
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
    * App包名
    */
    @SerializedName("AppPackage")
    @Expose
    private String AppPackage;

    /**
    * App名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * App版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 上传的软件文件ID(灵犀诊断必填)
    */
    @SerializedName("FileID")
    @Expose
    private String FileID;

    /**
    * 软件下载链接地址(灵鲲诊断必填)
    */
    @SerializedName("AppDownloadUrl")
    @Expose
    private String AppDownloadUrl;

    /**
    * 隐私文本下载地址(灵鲲诊断必填)
    */
    @SerializedName("PrivacyTextUrl")
    @Expose
    private String PrivacyTextUrl;

    /**
    * 联系人信息
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
    * 联系电话
    */
    @SerializedName("TelNumber")
    @Expose
    private String TelNumber;

    /**
    * 公司邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 公司名称
    */
    @SerializedName("CorpName")
    @Expose
    private String CorpName;

    /**
    * 商务对接人员
    */
    @SerializedName("SalesPerson")
    @Expose
    private String SalesPerson;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否同意隐私条款，0:不同意(默认), 1:同意
    */
    @SerializedName("IsAgreePrivacy")
    @Expose
    private Long IsAgreePrivacy;

    /**
    * 隐私申明文件名称
    */
    @SerializedName("PrivacyTextName")
    @Expose
    private String PrivacyTextName;

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
     * Get 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲; 
     * @return Source 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲;
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲;
     * @param Source 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲;
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
     * Get App名称 
     * @return AppName App名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set App名称
     * @param AppName App名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get App版本 
     * @return AppVersion App版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set App版本
     * @param AppVersion App版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 上传的软件文件ID(灵犀诊断必填) 
     * @return FileID 上传的软件文件ID(灵犀诊断必填)
     */
    public String getFileID() {
        return this.FileID;
    }

    /**
     * Set 上传的软件文件ID(灵犀诊断必填)
     * @param FileID 上传的软件文件ID(灵犀诊断必填)
     */
    public void setFileID(String FileID) {
        this.FileID = FileID;
    }

    /**
     * Get 软件下载链接地址(灵鲲诊断必填) 
     * @return AppDownloadUrl 软件下载链接地址(灵鲲诊断必填)
     */
    public String getAppDownloadUrl() {
        return this.AppDownloadUrl;
    }

    /**
     * Set 软件下载链接地址(灵鲲诊断必填)
     * @param AppDownloadUrl 软件下载链接地址(灵鲲诊断必填)
     */
    public void setAppDownloadUrl(String AppDownloadUrl) {
        this.AppDownloadUrl = AppDownloadUrl;
    }

    /**
     * Get 隐私文本下载地址(灵鲲诊断必填) 
     * @return PrivacyTextUrl 隐私文本下载地址(灵鲲诊断必填)
     */
    public String getPrivacyTextUrl() {
        return this.PrivacyTextUrl;
    }

    /**
     * Set 隐私文本下载地址(灵鲲诊断必填)
     * @param PrivacyTextUrl 隐私文本下载地址(灵鲲诊断必填)
     */
    public void setPrivacyTextUrl(String PrivacyTextUrl) {
        this.PrivacyTextUrl = PrivacyTextUrl;
    }

    /**
     * Get 联系人信息 
     * @return ContactName 联系人信息
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set 联系人信息
     * @param ContactName 联系人信息
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * Get 联系电话 
     * @return TelNumber 联系电话
     */
    public String getTelNumber() {
        return this.TelNumber;
    }

    /**
     * Set 联系电话
     * @param TelNumber 联系电话
     */
    public void setTelNumber(String TelNumber) {
        this.TelNumber = TelNumber;
    }

    /**
     * Get 公司邮箱 
     * @return Email 公司邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 公司邮箱
     * @param Email 公司邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 公司名称 
     * @return CorpName 公司名称
     */
    public String getCorpName() {
        return this.CorpName;
    }

    /**
     * Set 公司名称
     * @param CorpName 公司名称
     */
    public void setCorpName(String CorpName) {
        this.CorpName = CorpName;
    }

    /**
     * Get 商务对接人员 
     * @return SalesPerson 商务对接人员
     */
    public String getSalesPerson() {
        return this.SalesPerson;
    }

    /**
     * Set 商务对接人员
     * @param SalesPerson 商务对接人员
     */
    public void setSalesPerson(String SalesPerson) {
        this.SalesPerson = SalesPerson;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否同意隐私条款，0:不同意(默认), 1:同意 
     * @return IsAgreePrivacy 是否同意隐私条款，0:不同意(默认), 1:同意
     */
    public Long getIsAgreePrivacy() {
        return this.IsAgreePrivacy;
    }

    /**
     * Set 是否同意隐私条款，0:不同意(默认), 1:同意
     * @param IsAgreePrivacy 是否同意隐私条款，0:不同意(默认), 1:同意
     */
    public void setIsAgreePrivacy(Long IsAgreePrivacy) {
        this.IsAgreePrivacy = IsAgreePrivacy;
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

    public CreateAppScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppScanTaskRequest(CreateAppScanTaskRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.AppPackage != null) {
            this.AppPackage = new String(source.AppPackage);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
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
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
        if (source.TelNumber != null) {
            this.TelNumber = new String(source.TelNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CorpName != null) {
            this.CorpName = new String(source.CorpName);
        }
        if (source.SalesPerson != null) {
            this.SalesPerson = new String(source.SalesPerson);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsAgreePrivacy != null) {
            this.IsAgreePrivacy = new Long(source.IsAgreePrivacy);
        }
        if (source.PrivacyTextName != null) {
            this.PrivacyTextName = new String(source.PrivacyTextName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AppPackage", this.AppPackage);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "FileID", this.FileID);
        this.setParamSimple(map, prefix + "AppDownloadUrl", this.AppDownloadUrl);
        this.setParamSimple(map, prefix + "PrivacyTextUrl", this.PrivacyTextUrl);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "TelNumber", this.TelNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CorpName", this.CorpName);
        this.setParamSimple(map, prefix + "SalesPerson", this.SalesPerson);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsAgreePrivacy", this.IsAgreePrivacy);
        this.setParamSimple(map, prefix + "PrivacyTextName", this.PrivacyTextName);

    }
}

