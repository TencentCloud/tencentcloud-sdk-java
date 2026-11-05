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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserRoleInfo extends AbstractModel {

    /**
    * <p>子账号</p>
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>名称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>角色列表</p>
    */
    @SerializedName("Roles")
    @Expose
    private RoleInfo [] Roles;

    /**
     * Get <p>子账号</p> 
     * @return SubUin <p>子账号</p>
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>子账号</p>
     * @param SubUin <p>子账号</p>
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>名称</p> 
     * @return NickName <p>名称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>名称</p>
     * @param NickName <p>名称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>角色列表</p> 
     * @return Roles <p>角色列表</p>
     */
    public RoleInfo [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>角色列表</p>
     * @param Roles <p>角色列表</p>
     */
    public void setRoles(RoleInfo [] Roles) {
        this.Roles = Roles;
    }

    public UserRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserRoleInfo(UserRoleInfo source) {
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Roles != null) {
            this.Roles = new RoleInfo[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RoleInfo(source.Roles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);

    }
}

