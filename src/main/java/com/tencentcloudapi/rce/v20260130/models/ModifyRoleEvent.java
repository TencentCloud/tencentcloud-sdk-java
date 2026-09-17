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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoleEvent extends AbstractModel {

    /**
    * <p>修改后的角色名，允许空串</p>
    */
    @SerializedName("RoleNameAfter")
    @Expose
    private String RoleNameAfter;

    /**
    * <p>修改后的签名档，允许空串</p>
    */
    @SerializedName("RoleSignatureAfter")
    @Expose
    private String RoleSignatureAfter;

    /**
    * <p>所属服务器ID，允许空串</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>编辑者账号信息</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private User UserInfo;

    /**
    * <p>角色信息</p>
    */
    @SerializedName("RoleInfo")
    @Expose
    private Role RoleInfo;

    /**
     * Get <p>修改后的角色名，允许空串</p> 
     * @return RoleNameAfter <p>修改后的角色名，允许空串</p>
     */
    public String getRoleNameAfter() {
        return this.RoleNameAfter;
    }

    /**
     * Set <p>修改后的角色名，允许空串</p>
     * @param RoleNameAfter <p>修改后的角色名，允许空串</p>
     */
    public void setRoleNameAfter(String RoleNameAfter) {
        this.RoleNameAfter = RoleNameAfter;
    }

    /**
     * Get <p>修改后的签名档，允许空串</p> 
     * @return RoleSignatureAfter <p>修改后的签名档，允许空串</p>
     */
    public String getRoleSignatureAfter() {
        return this.RoleSignatureAfter;
    }

    /**
     * Set <p>修改后的签名档，允许空串</p>
     * @param RoleSignatureAfter <p>修改后的签名档，允许空串</p>
     */
    public void setRoleSignatureAfter(String RoleSignatureAfter) {
        this.RoleSignatureAfter = RoleSignatureAfter;
    }

    /**
     * Get <p>所属服务器ID，允许空串</p> 
     * @return ServerId <p>所属服务器ID，允许空串</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>所属服务器ID，允许空串</p>
     * @param ServerId <p>所属服务器ID，允许空串</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>编辑者账号信息</p> 
     * @return UserInfo <p>编辑者账号信息</p>
     */
    public User getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>编辑者账号信息</p>
     * @param UserInfo <p>编辑者账号信息</p>
     */
    public void setUserInfo(User UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get <p>角色信息</p> 
     * @return RoleInfo <p>角色信息</p>
     */
    public Role getRoleInfo() {
        return this.RoleInfo;
    }

    /**
     * Set <p>角色信息</p>
     * @param RoleInfo <p>角色信息</p>
     */
    public void setRoleInfo(Role RoleInfo) {
        this.RoleInfo = RoleInfo;
    }

    public ModifyRoleEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoleEvent(ModifyRoleEvent source) {
        if (source.RoleNameAfter != null) {
            this.RoleNameAfter = new String(source.RoleNameAfter);
        }
        if (source.RoleSignatureAfter != null) {
            this.RoleSignatureAfter = new String(source.RoleSignatureAfter);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new User(source.UserInfo);
        }
        if (source.RoleInfo != null) {
            this.RoleInfo = new Role(source.RoleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleNameAfter", this.RoleNameAfter);
        this.setParamSimple(map, prefix + "RoleSignatureAfter", this.RoleSignatureAfter);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "RoleInfo.", this.RoleInfo);

    }
}

