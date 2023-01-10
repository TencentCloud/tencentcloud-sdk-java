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

public class AppInfoItem extends AbstractModel{

    /**
    * 小程序apiiid
    */
    @SerializedName("AppPackage")
    @Expose
    private String AppPackage;

    /**
    * 小程序应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 小程序应用版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 应用平台, 0:android, 1:ios, 2:小程序
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 小程序隐私诊断报告下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportUrl")
    @Expose
    private String ReportUrl;

    /**
    * 小程序隐私诊断报告名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportTitle")
    @Expose
    private String ReportTitle;

    /**
    * 小程序隐私诊断堆栈报告下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BehaviorUrl")
    @Expose
    private String BehaviorUrl;

    /**
    * 小程序隐私诊断堆栈报告名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BehaviorTitle")
    @Expose
    private String BehaviorTitle;

    /**
    * 诊断风险项数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * 隐私申明文件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivacyTextName")
    @Expose
    private String PrivacyTextName;

    /**
    * 软件MD5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftwareMD5")
    @Expose
    private String SoftwareMD5;

    /**
    * 隐私文本MD5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivacyTextMD5")
    @Expose
    private String PrivacyTextMD5;

    /**
     * Get 小程序apiiid 
     * @return AppPackage 小程序apiiid
     */
    public String getAppPackage() {
        return this.AppPackage;
    }

    /**
     * Set 小程序apiiid
     * @param AppPackage 小程序apiiid
     */
    public void setAppPackage(String AppPackage) {
        this.AppPackage = AppPackage;
    }

    /**
     * Get 小程序应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName 小程序应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 小程序应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName 小程序应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 小程序应用版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppVersion 小程序应用版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 小程序应用版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppVersion 小程序应用版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
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
     * Get 小程序隐私诊断报告下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportUrl 小程序隐私诊断报告下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportUrl() {
        return this.ReportUrl;
    }

    /**
     * Set 小程序隐私诊断报告下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportUrl 小程序隐私诊断报告下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportUrl(String ReportUrl) {
        this.ReportUrl = ReportUrl;
    }

    /**
     * Get 小程序隐私诊断报告名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportTitle 小程序隐私诊断报告名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportTitle() {
        return this.ReportTitle;
    }

    /**
     * Set 小程序隐私诊断报告名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportTitle 小程序隐私诊断报告名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportTitle(String ReportTitle) {
        this.ReportTitle = ReportTitle;
    }

    /**
     * Get 小程序隐私诊断堆栈报告下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BehaviorUrl 小程序隐私诊断堆栈报告下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBehaviorUrl() {
        return this.BehaviorUrl;
    }

    /**
     * Set 小程序隐私诊断堆栈报告下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param BehaviorUrl 小程序隐私诊断堆栈报告下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBehaviorUrl(String BehaviorUrl) {
        this.BehaviorUrl = BehaviorUrl;
    }

    /**
     * Get 小程序隐私诊断堆栈报告名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BehaviorTitle 小程序隐私诊断堆栈报告名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBehaviorTitle() {
        return this.BehaviorTitle;
    }

    /**
     * Set 小程序隐私诊断堆栈报告名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BehaviorTitle 小程序隐私诊断堆栈报告名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBehaviorTitle(String BehaviorTitle) {
        this.BehaviorTitle = BehaviorTitle;
    }

    /**
     * Get 诊断风险项数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighRiskCount 诊断风险项数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set 诊断风险项数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighRiskCount 诊断风险项数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get 隐私申明文件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivacyTextName 隐私申明文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivacyTextName() {
        return this.PrivacyTextName;
    }

    /**
     * Set 隐私申明文件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivacyTextName 隐私申明文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivacyTextName(String PrivacyTextName) {
        this.PrivacyTextName = PrivacyTextName;
    }

    /**
     * Get 软件MD5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoftwareMD5 软件MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSoftwareMD5() {
        return this.SoftwareMD5;
    }

    /**
     * Set 软件MD5
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftwareMD5 软件MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftwareMD5(String SoftwareMD5) {
        this.SoftwareMD5 = SoftwareMD5;
    }

    /**
     * Get 隐私文本MD5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivacyTextMD5 隐私文本MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivacyTextMD5() {
        return this.PrivacyTextMD5;
    }

    /**
     * Set 隐私文本MD5
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivacyTextMD5 隐私文本MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivacyTextMD5(String PrivacyTextMD5) {
        this.PrivacyTextMD5 = PrivacyTextMD5;
    }

    public AppInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppInfoItem(AppInfoItem source) {
        if (source.AppPackage != null) {
            this.AppPackage = new String(source.AppPackage);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.ReportUrl != null) {
            this.ReportUrl = new String(source.ReportUrl);
        }
        if (source.ReportTitle != null) {
            this.ReportTitle = new String(source.ReportTitle);
        }
        if (source.BehaviorUrl != null) {
            this.BehaviorUrl = new String(source.BehaviorUrl);
        }
        if (source.BehaviorTitle != null) {
            this.BehaviorTitle = new String(source.BehaviorTitle);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.PrivacyTextName != null) {
            this.PrivacyTextName = new String(source.PrivacyTextName);
        }
        if (source.SoftwareMD5 != null) {
            this.SoftwareMD5 = new String(source.SoftwareMD5);
        }
        if (source.PrivacyTextMD5 != null) {
            this.PrivacyTextMD5 = new String(source.PrivacyTextMD5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppPackage", this.AppPackage);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ReportUrl", this.ReportUrl);
        this.setParamSimple(map, prefix + "ReportTitle", this.ReportTitle);
        this.setParamSimple(map, prefix + "BehaviorUrl", this.BehaviorUrl);
        this.setParamSimple(map, prefix + "BehaviorTitle", this.BehaviorTitle);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "PrivacyTextName", this.PrivacyTextName);
        this.setParamSimple(map, prefix + "SoftwareMD5", this.SoftwareMD5);
        this.setParamSimple(map, prefix + "PrivacyTextMD5", this.PrivacyTextMD5);

    }
}

