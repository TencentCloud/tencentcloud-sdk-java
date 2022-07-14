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
package com.tencentcloudapi.mmps.v20200710.models;

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
    * 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 小程序AppID
    */
    @SerializedName("AppPackage")
    @Expose
    private String AppPackage;

    /**
    * 应用平台, 0:android, 1:ios, 2:小程序
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 小程序名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 小程序版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

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
    * 公司邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

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
     * Get 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android); 
     * @return Source 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
     * @param Source 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 小程序AppID 
     * @return AppPackage 小程序AppID
     */
    public String getAppPackage() {
        return this.AppPackage;
    }

    /**
     * Set 小程序AppID
     * @param AppPackage 小程序AppID
     */
    public void setAppPackage(String AppPackage) {
        this.AppPackage = AppPackage;
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
     * Get 小程序名称 
     * @return AppName 小程序名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 小程序名称
     * @param AppName 小程序名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 小程序版本 
     * @return AppVersion 小程序版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 小程序版本
     * @param AppVersion 小程序版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
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
        if (source.AppPackage != null) {
            this.AppPackage = new String(source.AppPackage);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
        if (source.TelNumber != null) {
            this.TelNumber = new String(source.TelNumber);
        }
        if (source.CorpName != null) {
            this.CorpName = new String(source.CorpName);
        }
        if (source.SalesPerson != null) {
            this.SalesPerson = new String(source.SalesPerson);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "AppPackage", this.AppPackage);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "TelNumber", this.TelNumber);
        this.setParamSimple(map, prefix + "CorpName", this.CorpName);
        this.setParamSimple(map, prefix + "SalesPerson", this.SalesPerson);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

