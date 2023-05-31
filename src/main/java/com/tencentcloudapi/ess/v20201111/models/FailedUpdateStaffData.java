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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailedUpdateStaffData extends AbstractModel{

    /**
    * 用户传入的名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户传入的手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 用户Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 员工在第三方平台的openId
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * Get 用户传入的名称 
     * @return DisplayName 用户传入的名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 用户传入的名称
     * @param DisplayName 用户传入的名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 用户传入的手机号 
     * @return Mobile 用户传入的手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 用户传入的手机号
     * @param Mobile 用户传入的手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 失败原因 
     * @return Reason 失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因
     * @param Reason 失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 用户Id 
     * @return UserId 用户Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id
     * @param UserId 用户Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 员工在第三方平台的openId 
     * @return OpenId 员工在第三方平台的openId
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 员工在第三方平台的openId
     * @param OpenId 员工在第三方平台的openId
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    public FailedUpdateStaffData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailedUpdateStaffData(FailedUpdateStaffData source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

