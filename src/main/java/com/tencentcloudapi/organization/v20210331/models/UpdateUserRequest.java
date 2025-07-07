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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserRequest extends AbstractModel {

    /**
    * 空间 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 用户 ID。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户的名。
    */
    @SerializedName("NewFirstName")
    @Expose
    private String NewFirstName;

    /**
    * 用户的姓。
    */
    @SerializedName("NewLastName")
    @Expose
    private String NewLastName;

    /**
    * 用户的显示名称。
    */
    @SerializedName("NewDisplayName")
    @Expose
    private String NewDisplayName;

    /**
    * 用户的描述。
    */
    @SerializedName("NewDescription")
    @Expose
    private String NewDescription;

    /**
    * 用户的电子邮箱。
    */
    @SerializedName("NewEmail")
    @Expose
    private String NewEmail;

    /**
     * Get 空间 ID。 
     * @return ZoneId 空间 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间 ID。
     * @param ZoneId 空间 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 用户 ID。 
     * @return UserId 用户 ID。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 ID。
     * @param UserId 用户 ID。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户的名。 
     * @return NewFirstName 用户的名。
     */
    public String getNewFirstName() {
        return this.NewFirstName;
    }

    /**
     * Set 用户的名。
     * @param NewFirstName 用户的名。
     */
    public void setNewFirstName(String NewFirstName) {
        this.NewFirstName = NewFirstName;
    }

    /**
     * Get 用户的姓。 
     * @return NewLastName 用户的姓。
     */
    public String getNewLastName() {
        return this.NewLastName;
    }

    /**
     * Set 用户的姓。
     * @param NewLastName 用户的姓。
     */
    public void setNewLastName(String NewLastName) {
        this.NewLastName = NewLastName;
    }

    /**
     * Get 用户的显示名称。 
     * @return NewDisplayName 用户的显示名称。
     */
    public String getNewDisplayName() {
        return this.NewDisplayName;
    }

    /**
     * Set 用户的显示名称。
     * @param NewDisplayName 用户的显示名称。
     */
    public void setNewDisplayName(String NewDisplayName) {
        this.NewDisplayName = NewDisplayName;
    }

    /**
     * Get 用户的描述。 
     * @return NewDescription 用户的描述。
     */
    public String getNewDescription() {
        return this.NewDescription;
    }

    /**
     * Set 用户的描述。
     * @param NewDescription 用户的描述。
     */
    public void setNewDescription(String NewDescription) {
        this.NewDescription = NewDescription;
    }

    /**
     * Get 用户的电子邮箱。 
     * @return NewEmail 用户的电子邮箱。
     */
    public String getNewEmail() {
        return this.NewEmail;
    }

    /**
     * Set 用户的电子邮箱。
     * @param NewEmail 用户的电子邮箱。
     */
    public void setNewEmail(String NewEmail) {
        this.NewEmail = NewEmail;
    }

    public UpdateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserRequest(UpdateUserRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.NewFirstName != null) {
            this.NewFirstName = new String(source.NewFirstName);
        }
        if (source.NewLastName != null) {
            this.NewLastName = new String(source.NewLastName);
        }
        if (source.NewDisplayName != null) {
            this.NewDisplayName = new String(source.NewDisplayName);
        }
        if (source.NewDescription != null) {
            this.NewDescription = new String(source.NewDescription);
        }
        if (source.NewEmail != null) {
            this.NewEmail = new String(source.NewEmail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "NewFirstName", this.NewFirstName);
        this.setParamSimple(map, prefix + "NewLastName", this.NewLastName);
        this.setParamSimple(map, prefix + "NewDisplayName", this.NewDisplayName);
        this.setParamSimple(map, prefix + "NewDescription", this.NewDescription);
        this.setParamSimple(map, prefix + "NewEmail", this.NewEmail);

    }
}

