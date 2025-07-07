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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMountPointRequest extends AbstractModel {

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

    public ModifyMountPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMountPointRequest(ModifyMountPointRequest source) {
        if (source.MountPointId != null) {
            this.MountPointId = new String(source.MountPointId);
        }
        if (source.MountPointName != null) {
            this.MountPointName = new String(source.MountPointName);
        }
        if (source.MountPointStatus != null) {
            this.MountPointStatus = new Long(source.MountPointStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPointId", this.MountPointId);
        this.setParamSimple(map, prefix + "MountPointName", this.MountPointName);
        this.setParamSimple(map, prefix + "MountPointStatus", this.MountPointStatus);

    }
}

