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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMountPointRequest extends AbstractModel{

    /**
    * 挂载点ID
    */
    @SerializedName("MountPointId")
    @Expose
    private String MountPointId;

    /**
    * 挂载点名称
    */
    @SerializedName("MountPointName")
    @Expose
    private String MountPointName;

    /**
    * 挂载点状态
    */
    @SerializedName("MountPointStatus")
    @Expose
    private Long MountPointStatus;

    /**
    * 权限组ID
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

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
     * Get 挂载点名称 
     * @return MountPointName 挂载点名称
     */
    public String getMountPointName() {
        return this.MountPointName;
    }

    /**
     * Set 挂载点名称
     * @param MountPointName 挂载点名称
     */
    public void setMountPointName(String MountPointName) {
        this.MountPointName = MountPointName;
    }

    /**
     * Get 挂载点状态 
     * @return MountPointStatus 挂载点状态
     */
    public Long getMountPointStatus() {
        return this.MountPointStatus;
    }

    /**
     * Set 挂载点状态
     * @param MountPointStatus 挂载点状态
     */
    public void setMountPointStatus(Long MountPointStatus) {
        this.MountPointStatus = MountPointStatus;
    }

    /**
     * Get 权限组ID 
     * @return AccessGroupId 权限组ID
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * Set 权限组ID
     * @param AccessGroupId 权限组ID
     */
    public void setAccessGroupId(String AccessGroupId) {
        this.AccessGroupId = AccessGroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPointId", this.MountPointId);
        this.setParamSimple(map, prefix + "MountPointName", this.MountPointName);
        this.setParamSimple(map, prefix + "MountPointStatus", this.MountPointStatus);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);

    }
}

