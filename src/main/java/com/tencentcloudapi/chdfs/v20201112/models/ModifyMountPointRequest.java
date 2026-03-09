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
    * <p>挂载点ID</p>
    */
    @SerializedName("MountPointId")
    @Expose
    private String MountPointId;

    /**
    * <p>挂载点名称</p>
    */
    @SerializedName("MountPointName")
    @Expose
    private String MountPointName;

    /**
    * <p>挂载点状态</p><p>枚举值：</p><ul><li>1： 打开</li><li>2： 关闭</li></ul>
    */
    @SerializedName("MountPointStatus")
    @Expose
    private Long MountPointStatus;

    /**
     * Get <p>挂载点ID</p> 
     * @return MountPointId <p>挂载点ID</p>
     */
    public String getMountPointId() {
        return this.MountPointId;
    }

    /**
     * Set <p>挂载点ID</p>
     * @param MountPointId <p>挂载点ID</p>
     */
    public void setMountPointId(String MountPointId) {
        this.MountPointId = MountPointId;
    }

    /**
     * Get <p>挂载点名称</p> 
     * @return MountPointName <p>挂载点名称</p>
     */
    public String getMountPointName() {
        return this.MountPointName;
    }

    /**
     * Set <p>挂载点名称</p>
     * @param MountPointName <p>挂载点名称</p>
     */
    public void setMountPointName(String MountPointName) {
        this.MountPointName = MountPointName;
    }

    /**
     * Get <p>挂载点状态</p><p>枚举值：</p><ul><li>1： 打开</li><li>2： 关闭</li></ul> 
     * @return MountPointStatus <p>挂载点状态</p><p>枚举值：</p><ul><li>1： 打开</li><li>2： 关闭</li></ul>
     */
    public Long getMountPointStatus() {
        return this.MountPointStatus;
    }

    /**
     * Set <p>挂载点状态</p><p>枚举值：</p><ul><li>1： 打开</li><li>2： 关闭</li></ul>
     * @param MountPointStatus <p>挂载点状态</p><p>枚举值：</p><ul><li>1： 打开</li><li>2： 关闭</li></ul>
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

