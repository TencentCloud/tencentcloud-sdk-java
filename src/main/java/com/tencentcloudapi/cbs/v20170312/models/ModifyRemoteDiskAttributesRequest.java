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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRemoteDiskAttributesRequest extends AbstractModel {

    /**
    * <p>一个或多个待操作的单副本SSD硬盘ID。如果传入多个单副本SSD硬盘ID，只支持所有硬盘修改为同一属性。</p>
    */
    @SerializedName("RemoteDiskIds")
    @Expose
    private String [] RemoteDiskIds;

    /**
    * <p>新的单副本SSD硬盘名称</p>
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * <p>新的单副本SSD硬盘项目ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get <p>一个或多个待操作的单副本SSD硬盘ID。如果传入多个单副本SSD硬盘ID，只支持所有硬盘修改为同一属性。</p> 
     * @return RemoteDiskIds <p>一个或多个待操作的单副本SSD硬盘ID。如果传入多个单副本SSD硬盘ID，只支持所有硬盘修改为同一属性。</p>
     */
    public String [] getRemoteDiskIds() {
        return this.RemoteDiskIds;
    }

    /**
     * Set <p>一个或多个待操作的单副本SSD硬盘ID。如果传入多个单副本SSD硬盘ID，只支持所有硬盘修改为同一属性。</p>
     * @param RemoteDiskIds <p>一个或多个待操作的单副本SSD硬盘ID。如果传入多个单副本SSD硬盘ID，只支持所有硬盘修改为同一属性。</p>
     */
    public void setRemoteDiskIds(String [] RemoteDiskIds) {
        this.RemoteDiskIds = RemoteDiskIds;
    }

    /**
     * Get <p>新的单副本SSD硬盘名称</p> 
     * @return DiskName <p>新的单副本SSD硬盘名称</p>
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set <p>新的单副本SSD硬盘名称</p>
     * @param DiskName <p>新的单副本SSD硬盘名称</p>
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get <p>新的单副本SSD硬盘项目ID。</p> 
     * @return ProjectId <p>新的单副本SSD硬盘项目ID。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>新的单副本SSD硬盘项目ID。</p>
     * @param ProjectId <p>新的单副本SSD硬盘项目ID。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public ModifyRemoteDiskAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRemoteDiskAttributesRequest(ModifyRemoteDiskAttributesRequest source) {
        if (source.RemoteDiskIds != null) {
            this.RemoteDiskIds = new String[source.RemoteDiskIds.length];
            for (int i = 0; i < source.RemoteDiskIds.length; i++) {
                this.RemoteDiskIds[i] = new String(source.RemoteDiskIds[i]);
            }
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RemoteDiskIds.", this.RemoteDiskIds);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

