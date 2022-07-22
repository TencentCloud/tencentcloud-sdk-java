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

public class CreateFlySecMiniAppProfessionalScanTaskRequest extends AbstractModel{

    /**
    * 小程序AppID
    */
    @SerializedName("MiniAppID")
    @Expose
    private String MiniAppID;

    /**
    * 小程序名称
    */
    @SerializedName("MiniAppName")
    @Expose
    private String MiniAppName;

    /**
    * 诊断模式 2:深度诊断
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 公司名称
    */
    @SerializedName("CorpName")
    @Expose
    private String CorpName;

    /**
    * 手机号码
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 电子邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get 小程序名称 
     * @return MiniAppName 小程序名称
     */
    public String getMiniAppName() {
        return this.MiniAppName;
    }

    /**
     * Set 小程序名称
     * @param MiniAppName 小程序名称
     */
    public void setMiniAppName(String MiniAppName) {
        this.MiniAppName = MiniAppName;
    }

    /**
     * Get 诊断模式 2:深度诊断 
     * @return Mode 诊断模式 2:深度诊断
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 诊断模式 2:深度诊断
     * @param Mode 诊断模式 2:深度诊断
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
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
     * Get 电子邮箱 
     * @return Email 电子邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 电子邮箱
     * @param Email 电子邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
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

    public CreateFlySecMiniAppProfessionalScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlySecMiniAppProfessionalScanTaskRequest(CreateFlySecMiniAppProfessionalScanTaskRequest source) {
        if (source.MiniAppID != null) {
            this.MiniAppID = new String(source.MiniAppID);
        }
        if (source.MiniAppName != null) {
            this.MiniAppName = new String(source.MiniAppName);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.CorpName != null) {
            this.CorpName = new String(source.CorpName);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniAppID", this.MiniAppID);
        this.setParamSimple(map, prefix + "MiniAppName", this.MiniAppName);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "CorpName", this.CorpName);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

