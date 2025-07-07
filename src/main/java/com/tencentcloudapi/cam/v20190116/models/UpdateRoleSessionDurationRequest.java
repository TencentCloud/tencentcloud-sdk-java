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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRoleSessionDurationRequest extends AbstractModel {

    /**
    * 时长(秒)
    */
    @SerializedName("SessionDuration")
    @Expose
    private Long SessionDuration;

    /**
    * 角色名(与角色ID必填一个)
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 角色ID(与角色名必填一个)
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
     * Get 时长(秒) 
     * @return SessionDuration 时长(秒)
     */
    public Long getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set 时长(秒)
     * @param SessionDuration 时长(秒)
     */
    public void setSessionDuration(Long SessionDuration) {
        this.SessionDuration = SessionDuration;
    }

    /**
     * Get 角色名(与角色ID必填一个) 
     * @return RoleName 角色名(与角色ID必填一个)
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名(与角色ID必填一个)
     * @param RoleName 角色名(与角色ID必填一个)
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 角色ID(与角色名必填一个) 
     * @return RoleId 角色ID(与角色名必填一个)
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色ID(与角色名必填一个)
     * @param RoleId 角色ID(与角色名必填一个)
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    public UpdateRoleSessionDurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRoleSessionDurationRequest(UpdateRoleSessionDurationRequest source) {
        if (source.SessionDuration != null) {
            this.SessionDuration = new Long(source.SessionDuration);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionDuration", this.SessionDuration);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);

    }
}

