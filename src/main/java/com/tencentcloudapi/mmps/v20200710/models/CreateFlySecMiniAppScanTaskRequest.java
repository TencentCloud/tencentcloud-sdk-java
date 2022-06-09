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

public class CreateFlySecMiniAppScanTaskRequest extends AbstractModel{

    /**
    * 小程序AppID
    */
    @SerializedName("MiniAppID")
    @Expose
    private String MiniAppID;

    /**
    * 诊断模式 1:基础诊断，2:深度诊断
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 小程序测试账号(自有账号体系需提供,其他情况不需要)
    */
    @SerializedName("MiniAppTestAccount")
    @Expose
    private String MiniAppTestAccount;

    /**
    * 小程序测试密码(自有账号体系需提供,其他情况不需要)
    */
    @SerializedName("MiniAppTestPwd")
    @Expose
    private String MiniAppTestPwd;

    /**
    * 小程序所属行业
    */
    @SerializedName("Industry")
    @Expose
    private String Industry;

    /**
    * 小程序调查问卷json字符串
    */
    @SerializedName("SurveyContent")
    @Expose
    private String SurveyContent;

    /**
    * 手机号码
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 邮箱地址
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 商务合作接口人
    */
    @SerializedName("SalesPerson")
    @Expose
    private String SalesPerson;

    /**
    * 诊断扫描版本 0:正式版 1:体验版
    */
    @SerializedName("ScanVersion")
    @Expose
    private Long ScanVersion;

    /**
     * Get 小程序AppID 
     * @return MiniAppID 小程序AppID
     */
    public String getMiniAppID() {
        return this.MiniAppID;
    }

    /**
     * Set 小程序AppID
     * @param MiniAppID 小程序AppID
     */
    public void setMiniAppID(String MiniAppID) {
        this.MiniAppID = MiniAppID;
    }

    /**
     * Get 诊断模式 1:基础诊断，2:深度诊断 
     * @return Mode 诊断模式 1:基础诊断，2:深度诊断
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 诊断模式 1:基础诊断，2:深度诊断
     * @param Mode 诊断模式 1:基础诊断，2:深度诊断
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 小程序测试账号(自有账号体系需提供,其他情况不需要) 
     * @return MiniAppTestAccount 小程序测试账号(自有账号体系需提供,其他情况不需要)
     */
    public String getMiniAppTestAccount() {
        return this.MiniAppTestAccount;
    }

    /**
     * Set 小程序测试账号(自有账号体系需提供,其他情况不需要)
     * @param MiniAppTestAccount 小程序测试账号(自有账号体系需提供,其他情况不需要)
     */
    public void setMiniAppTestAccount(String MiniAppTestAccount) {
        this.MiniAppTestAccount = MiniAppTestAccount;
    }

    /**
     * Get 小程序测试密码(自有账号体系需提供,其他情况不需要) 
     * @return MiniAppTestPwd 小程序测试密码(自有账号体系需提供,其他情况不需要)
     */
    public String getMiniAppTestPwd() {
        return this.MiniAppTestPwd;
    }

    /**
     * Set 小程序测试密码(自有账号体系需提供,其他情况不需要)
     * @param MiniAppTestPwd 小程序测试密码(自有账号体系需提供,其他情况不需要)
     */
    public void setMiniAppTestPwd(String MiniAppTestPwd) {
        this.MiniAppTestPwd = MiniAppTestPwd;
    }

    /**
     * Get 小程序所属行业 
     * @return Industry 小程序所属行业
     */
    public String getIndustry() {
        return this.Industry;
    }

    /**
     * Set 小程序所属行业
     * @param Industry 小程序所属行业
     */
    public void setIndustry(String Industry) {
        this.Industry = Industry;
    }

    /**
     * Get 小程序调查问卷json字符串 
     * @return SurveyContent 小程序调查问卷json字符串
     */
    public String getSurveyContent() {
        return this.SurveyContent;
    }

    /**
     * Set 小程序调查问卷json字符串
     * @param SurveyContent 小程序调查问卷json字符串
     */
    public void setSurveyContent(String SurveyContent) {
        this.SurveyContent = SurveyContent;
    }

    /**
     * Get 手机号码 
     * @return Mobile 手机号码
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号码
     * @param Mobile 手机号码
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 邮箱地址 
     * @return Email 邮箱地址
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱地址
     * @param Email 邮箱地址
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 商务合作接口人 
     * @return SalesPerson 商务合作接口人
     */
    public String getSalesPerson() {
        return this.SalesPerson;
    }

    /**
     * Set 商务合作接口人
     * @param SalesPerson 商务合作接口人
     */
    public void setSalesPerson(String SalesPerson) {
        this.SalesPerson = SalesPerson;
    }

    /**
     * Get 诊断扫描版本 0:正式版 1:体验版 
     * @return ScanVersion 诊断扫描版本 0:正式版 1:体验版
     */
    public Long getScanVersion() {
        return this.ScanVersion;
    }

    /**
     * Set 诊断扫描版本 0:正式版 1:体验版
     * @param ScanVersion 诊断扫描版本 0:正式版 1:体验版
     */
    public void setScanVersion(Long ScanVersion) {
        this.ScanVersion = ScanVersion;
    }

    public CreateFlySecMiniAppScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlySecMiniAppScanTaskRequest(CreateFlySecMiniAppScanTaskRequest source) {
        if (source.MiniAppID != null) {
            this.MiniAppID = new String(source.MiniAppID);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.MiniAppTestAccount != null) {
            this.MiniAppTestAccount = new String(source.MiniAppTestAccount);
        }
        if (source.MiniAppTestPwd != null) {
            this.MiniAppTestPwd = new String(source.MiniAppTestPwd);
        }
        if (source.Industry != null) {
            this.Industry = new String(source.Industry);
        }
        if (source.SurveyContent != null) {
            this.SurveyContent = new String(source.SurveyContent);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.SalesPerson != null) {
            this.SalesPerson = new String(source.SalesPerson);
        }
        if (source.ScanVersion != null) {
            this.ScanVersion = new Long(source.ScanVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniAppID", this.MiniAppID);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "MiniAppTestAccount", this.MiniAppTestAccount);
        this.setParamSimple(map, prefix + "MiniAppTestPwd", this.MiniAppTestPwd);
        this.setParamSimple(map, prefix + "Industry", this.Industry);
        this.setParamSimple(map, prefix + "SurveyContent", this.SurveyContent);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "SalesPerson", this.SalesPerson);
        this.setParamSimple(map, prefix + "ScanVersion", this.ScanVersion);

    }
}

