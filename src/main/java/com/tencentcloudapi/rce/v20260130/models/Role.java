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

public class Role extends AbstractModel {

    /**
    * <p>角色ID</p>
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * <p>角色名称</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>个性签名</p>
    */
    @SerializedName("RoleSignature")
    @Expose
    private String RoleSignature;

    /**
    * <p>角色等级</p>
    */
    @SerializedName("RoleLevel")
    @Expose
    private String RoleLevel;

    /**
    * <p>角色总战力</p>
    */
    @SerializedName("RoleCe")
    @Expose
    private Float RoleCe;

    /**
    * <p>角色创建时间</p>
    */
    @SerializedName("RoleCreateTime")
    @Expose
    private String RoleCreateTime;

    /**
     * Get <p>角色ID</p> 
     * @return RoleId <p>角色ID</p>
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set <p>角色ID</p>
     * @param RoleId <p>角色ID</p>
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get <p>角色名称</p> 
     * @return RoleName <p>角色名称</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>角色名称</p>
     * @param RoleName <p>角色名称</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>个性签名</p> 
     * @return RoleSignature <p>个性签名</p>
     */
    public String getRoleSignature() {
        return this.RoleSignature;
    }

    /**
     * Set <p>个性签名</p>
     * @param RoleSignature <p>个性签名</p>
     */
    public void setRoleSignature(String RoleSignature) {
        this.RoleSignature = RoleSignature;
    }

    /**
     * Get <p>角色等级</p> 
     * @return RoleLevel <p>角色等级</p>
     */
    public String getRoleLevel() {
        return this.RoleLevel;
    }

    /**
     * Set <p>角色等级</p>
     * @param RoleLevel <p>角色等级</p>
     */
    public void setRoleLevel(String RoleLevel) {
        this.RoleLevel = RoleLevel;
    }

    /**
     * Get <p>角色总战力</p> 
     * @return RoleCe <p>角色总战力</p>
     */
    public Float getRoleCe() {
        return this.RoleCe;
    }

    /**
     * Set <p>角色总战力</p>
     * @param RoleCe <p>角色总战力</p>
     */
    public void setRoleCe(Float RoleCe) {
        this.RoleCe = RoleCe;
    }

    /**
     * Get <p>角色创建时间</p> 
     * @return RoleCreateTime <p>角色创建时间</p>
     */
    public String getRoleCreateTime() {
        return this.RoleCreateTime;
    }

    /**
     * Set <p>角色创建时间</p>
     * @param RoleCreateTime <p>角色创建时间</p>
     */
    public void setRoleCreateTime(String RoleCreateTime) {
        this.RoleCreateTime = RoleCreateTime;
    }

    public Role() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Role(Role source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleSignature != null) {
            this.RoleSignature = new String(source.RoleSignature);
        }
        if (source.RoleLevel != null) {
            this.RoleLevel = new String(source.RoleLevel);
        }
        if (source.RoleCe != null) {
            this.RoleCe = new Float(source.RoleCe);
        }
        if (source.RoleCreateTime != null) {
            this.RoleCreateTime = new String(source.RoleCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleSignature", this.RoleSignature);
        this.setParamSimple(map, prefix + "RoleLevel", this.RoleLevel);
        this.setParamSimple(map, prefix + "RoleCe", this.RoleCe);
        this.setParamSimple(map, prefix + "RoleCreateTime", this.RoleCreateTime);

    }
}

