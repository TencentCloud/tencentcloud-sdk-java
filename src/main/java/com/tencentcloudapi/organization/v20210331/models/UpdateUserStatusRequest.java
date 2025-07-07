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

public class UpdateUserStatusRequest extends AbstractModel {

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
    * 用户的状态。取值：  Enabled：启用。 Disabled：禁用。
    */
    @SerializedName("NewUserStatus")
    @Expose
    private String NewUserStatus;

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
     * Get 用户的状态。取值：  Enabled：启用。 Disabled：禁用。 
     * @return NewUserStatus 用户的状态。取值：  Enabled：启用。 Disabled：禁用。
     */
    public String getNewUserStatus() {
        return this.NewUserStatus;
    }

    /**
     * Set 用户的状态。取值：  Enabled：启用。 Disabled：禁用。
     * @param NewUserStatus 用户的状态。取值：  Enabled：启用。 Disabled：禁用。
     */
    public void setNewUserStatus(String NewUserStatus) {
        this.NewUserStatus = NewUserStatus;
    }

    public UpdateUserStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserStatusRequest(UpdateUserStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.NewUserStatus != null) {
            this.NewUserStatus = new String(source.NewUserStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "NewUserStatus", this.NewUserStatus);

    }
}

