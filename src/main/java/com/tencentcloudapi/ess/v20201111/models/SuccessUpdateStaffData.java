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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuccessUpdateStaffData extends AbstractModel {

    /**
    * 传入的用户名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 传入的手机号，没有打码
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * H5端员工实名链接
只有入参 InvitationNotifyType = H5的时候才会进行返回。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 传入的用户名称 
     * @return DisplayName 传入的用户名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 传入的用户名称
     * @param DisplayName 传入的用户名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 传入的手机号，没有打码 
     * @return Mobile 传入的手机号，没有打码
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 传入的手机号，没有打码
     * @param Mobile 传入的手机号，没有打码
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。 
     * @return UserId 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。
     * @param UserId 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get H5端员工实名链接
只有入参 InvitationNotifyType = H5的时候才会进行返回。 
     * @return Url H5端员工实名链接
只有入参 InvitationNotifyType = H5的时候才会进行返回。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set H5端员工实名链接
只有入参 InvitationNotifyType = H5的时候才会进行返回。
     * @param Url H5端员工实名链接
只有入参 InvitationNotifyType = H5的时候才会进行返回。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public SuccessUpdateStaffData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuccessUpdateStaffData(SuccessUpdateStaffData source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

