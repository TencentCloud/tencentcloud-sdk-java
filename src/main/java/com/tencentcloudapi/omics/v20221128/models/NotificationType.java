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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotificationType extends AbstractModel {

    /**
    * 腾讯健康组学平台站点信息。
    */
    @SerializedName("StationMessage")
    @Expose
    private Boolean StationMessage;

    /**
    * 邮箱列表。
    */
    @SerializedName("Email")
    @Expose
    private String [] Email;

    /**
    * 当前用户邮箱。
    */
    @SerializedName("CurrentUserEmail")
    @Expose
    private Boolean CurrentUserEmail;

    /**
     * Get 腾讯健康组学平台站点信息。 
     * @return StationMessage 腾讯健康组学平台站点信息。
     */
    public Boolean getStationMessage() {
        return this.StationMessage;
    }

    /**
     * Set 腾讯健康组学平台站点信息。
     * @param StationMessage 腾讯健康组学平台站点信息。
     */
    public void setStationMessage(Boolean StationMessage) {
        this.StationMessage = StationMessage;
    }

    /**
     * Get 邮箱列表。 
     * @return Email 邮箱列表。
     */
    public String [] getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱列表。
     * @param Email 邮箱列表。
     */
    public void setEmail(String [] Email) {
        this.Email = Email;
    }

    /**
     * Get 当前用户邮箱。 
     * @return CurrentUserEmail 当前用户邮箱。
     */
    public Boolean getCurrentUserEmail() {
        return this.CurrentUserEmail;
    }

    /**
     * Set 当前用户邮箱。
     * @param CurrentUserEmail 当前用户邮箱。
     */
    public void setCurrentUserEmail(Boolean CurrentUserEmail) {
        this.CurrentUserEmail = CurrentUserEmail;
    }

    public NotificationType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotificationType(NotificationType source) {
        if (source.StationMessage != null) {
            this.StationMessage = new Boolean(source.StationMessage);
        }
        if (source.Email != null) {
            this.Email = new String[source.Email.length];
            for (int i = 0; i < source.Email.length; i++) {
                this.Email[i] = new String(source.Email[i]);
            }
        }
        if (source.CurrentUserEmail != null) {
            this.CurrentUserEmail = new Boolean(source.CurrentUserEmail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StationMessage", this.StationMessage);
        this.setParamArraySimple(map, prefix + "Email.", this.Email);
        this.setParamSimple(map, prefix + "CurrentUserEmail", this.CurrentUserEmail);

    }
}

