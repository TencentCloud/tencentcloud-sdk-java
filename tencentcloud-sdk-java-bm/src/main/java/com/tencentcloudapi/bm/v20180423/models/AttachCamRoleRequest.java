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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachCamRoleRequest extends AbstractModel{

    /**
    * 服务器ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 角色名称。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get 服务器ID 
     * @return InstanceId 服务器ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 服务器ID
     * @param InstanceId 服务器ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 角色名称。 
     * @return RoleName 角色名称。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称。
     * @param RoleName 角色名称。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

