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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSandboxSnapshotRequest extends AbstractModel {

    /**
    * <p>待制作快照的沙箱实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>快照名称</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>制作快照时是否包含内存状态</p>
    */
    @SerializedName("Memory")
    @Expose
    private Boolean Memory;

    /**
    * <p>云资源标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>幂等 token</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get <p>待制作快照的沙箱实例 ID</p> 
     * @return InstanceId <p>待制作快照的沙箱实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>待制作快照的沙箱实例 ID</p>
     * @param InstanceId <p>待制作快照的沙箱实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>快照名称</p> 
     * @return SnapshotName <p>快照名称</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>快照名称</p>
     * @param SnapshotName <p>快照名称</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>制作快照时是否包含内存状态</p> 
     * @return Memory <p>制作快照时是否包含内存状态</p>
     */
    public Boolean getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>制作快照时是否包含内存状态</p>
     * @param Memory <p>制作快照时是否包含内存状态</p>
     */
    public void setMemory(Boolean Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>云资源标签</p> 
     * @return Tags <p>云资源标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>云资源标签</p>
     * @param Tags <p>云资源标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>幂等 token</p> 
     * @return ClientToken <p>幂等 token</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>幂等 token</p>
     * @param ClientToken <p>幂等 token</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateSandboxSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSandboxSnapshotRequest(CreateSandboxSnapshotRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.Memory != null) {
            this.Memory = new Boolean(source.Memory);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

