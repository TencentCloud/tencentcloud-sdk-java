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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRoleConsoleLoginRequest extends AbstractModel{

    /**
    * 是否可登录，可登录：1，不可登录：0
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * 角色ID，入参 RoleId 与 RoleName 二选一
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * 角色名，入参 RoleId 与 RoleName 二选一
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get 是否可登录，可登录：1，不可登录：0 
     * @return ConsoleLogin 是否可登录，可登录：1，不可登录：0
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set 是否可登录，可登录：1，不可登录：0
     * @param ConsoleLogin 是否可登录，可登录：1，不可登录：0
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get 角色ID，入参 RoleId 与 RoleName 二选一 
     * @return RoleId 角色ID，入参 RoleId 与 RoleName 二选一
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色ID，入参 RoleId 与 RoleName 二选一
     * @param RoleId 角色ID，入参 RoleId 与 RoleName 二选一
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色名，入参 RoleId 与 RoleName 二选一 
     * @return RoleName 角色名，入参 RoleId 与 RoleName 二选一
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名，入参 RoleId 与 RoleName 二选一
     * @param RoleName 角色名，入参 RoleId 与 RoleName 二选一
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public UpdateRoleConsoleLoginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRoleConsoleLoginRequest(UpdateRoleConsoleLoginRequest source) {
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

