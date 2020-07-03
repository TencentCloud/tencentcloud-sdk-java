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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindUsrInfo extends AbstractModel{

    /**
    * IotVideo平台分配给终端用户的用户id
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 用户角色，owner：主人，guest：访客
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get IotVideo平台分配给终端用户的用户id 
     * @return AccessId IotVideo平台分配给终端用户的用户id
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set IotVideo平台分配给终端用户的用户id
     * @param AccessId IotVideo平台分配给终端用户的用户id
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 用户角色，owner：主人，guest：访客 
     * @return Role 用户角色，owner：主人，guest：访客
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 用户角色，owner：主人，guest：访客
     * @param Role 用户角色，owner：主人，guest：访客
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

