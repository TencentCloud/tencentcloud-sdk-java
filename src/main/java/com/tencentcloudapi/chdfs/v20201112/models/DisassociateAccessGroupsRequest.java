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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateAccessGroupsRequest extends AbstractModel{

    /**
    * 挂载点ID
    */
    @SerializedName("MountPointId")
    @Expose
    private String MountPointId;

    /**
    * 权限组ID列表
    */
    @SerializedName("AccessGroupIds")
    @Expose
    private String [] AccessGroupIds;

    /**
     * Get 挂载点ID 
     * @return MountPointId 挂载点ID
     */
    public String getMountPointId() {
        return this.MountPointId;
    }

    /**
     * Set 挂载点ID
     * @param MountPointId 挂载点ID
     */
    public void setMountPointId(String MountPointId) {
        this.MountPointId = MountPointId;
    }

    /**
     * Get 权限组ID列表 
     * @return AccessGroupIds 权限组ID列表
     */
    public String [] getAccessGroupIds() {
        return this.AccessGroupIds;
    }

    /**
     * Set 权限组ID列表
     * @param AccessGroupIds 权限组ID列表
     */
    public void setAccessGroupIds(String [] AccessGroupIds) {
        this.AccessGroupIds = AccessGroupIds;
    }

    public DisassociateAccessGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateAccessGroupsRequest(DisassociateAccessGroupsRequest source) {
        if (source.MountPointId != null) {
            this.MountPointId = new String(source.MountPointId);
        }
        if (source.AccessGroupIds != null) {
            this.AccessGroupIds = new String[source.AccessGroupIds.length];
            for (int i = 0; i < source.AccessGroupIds.length; i++) {
                this.AccessGroupIds[i] = new String(source.AccessGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPointId", this.MountPointId);
        this.setParamArraySimple(map, prefix + "AccessGroupIds.", this.AccessGroupIds);

    }
}

