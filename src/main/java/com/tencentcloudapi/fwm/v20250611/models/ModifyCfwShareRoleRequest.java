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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCfwShareRoleRequest extends AbstractModel {

    /**
    * 云防火墙共享角色，取值：sharer（共享者）、user（使用者）、none（无共享角色）。共享者→使用者禁止直接变更，需先设为 none
    */
    @SerializedName("CfwShareRole")
    @Expose
    private String CfwShareRole;

    /**
    * 使用者Id
    */
    @SerializedName("UserMemberId")
    @Expose
    private String UserMemberId;

    /**
    * 共享者账号ID，CfwShareRole 为 user 时必填
    */
    @SerializedName("SharerMemberId")
    @Expose
    private String SharerMemberId;

    /**
     * Get 云防火墙共享角色，取值：sharer（共享者）、user（使用者）、none（无共享角色）。共享者→使用者禁止直接变更，需先设为 none 
     * @return CfwShareRole 云防火墙共享角色，取值：sharer（共享者）、user（使用者）、none（无共享角色）。共享者→使用者禁止直接变更，需先设为 none
     */
    public String getCfwShareRole() {
        return this.CfwShareRole;
    }

    /**
     * Set 云防火墙共享角色，取值：sharer（共享者）、user（使用者）、none（无共享角色）。共享者→使用者禁止直接变更，需先设为 none
     * @param CfwShareRole 云防火墙共享角色，取值：sharer（共享者）、user（使用者）、none（无共享角色）。共享者→使用者禁止直接变更，需先设为 none
     */
    public void setCfwShareRole(String CfwShareRole) {
        this.CfwShareRole = CfwShareRole;
    }

    /**
     * Get 使用者Id 
     * @return UserMemberId 使用者Id
     */
    public String getUserMemberId() {
        return this.UserMemberId;
    }

    /**
     * Set 使用者Id
     * @param UserMemberId 使用者Id
     */
    public void setUserMemberId(String UserMemberId) {
        this.UserMemberId = UserMemberId;
    }

    /**
     * Get 共享者账号ID，CfwShareRole 为 user 时必填 
     * @return SharerMemberId 共享者账号ID，CfwShareRole 为 user 时必填
     */
    public String getSharerMemberId() {
        return this.SharerMemberId;
    }

    /**
     * Set 共享者账号ID，CfwShareRole 为 user 时必填
     * @param SharerMemberId 共享者账号ID，CfwShareRole 为 user 时必填
     */
    public void setSharerMemberId(String SharerMemberId) {
        this.SharerMemberId = SharerMemberId;
    }

    public ModifyCfwShareRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCfwShareRoleRequest(ModifyCfwShareRoleRequest source) {
        if (source.CfwShareRole != null) {
            this.CfwShareRole = new String(source.CfwShareRole);
        }
        if (source.UserMemberId != null) {
            this.UserMemberId = new String(source.UserMemberId);
        }
        if (source.SharerMemberId != null) {
            this.SharerMemberId = new String(source.SharerMemberId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CfwShareRole", this.CfwShareRole);
        this.setParamSimple(map, prefix + "UserMemberId", this.UserMemberId);
        this.setParamSimple(map, prefix + "SharerMemberId", this.SharerMemberId);

    }
}

