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

public class SandboxSnapshot extends AbstractModel {

    /**
    * <p>沙箱快照 ID</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>沙箱快照名称</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>源沙箱实例 ID，沙箱快照由其派生</p>
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
    * <p>制作快照时是否包含内存状态</p>
    */
    @SerializedName("MemoryIncluded")
    @Expose
    private Boolean MemoryIncluded;

    /**
    * <p>沙箱快照状态</p><p>枚举值：</p><ul><li>ACTIVE： 可用</li><li>DELETING： 删除中</li><li>DELETED： 已删除</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>用于说明沙箱快照处于该状态的原因</p>
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * <p>云资源标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>创建时间</p><p>参数格式：ISO8601</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p><p>参数格式：ISO8601</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>沙箱快照 ID</p> 
     * @return SnapshotId <p>沙箱快照 ID</p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>沙箱快照 ID</p>
     * @param SnapshotId <p>沙箱快照 ID</p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>沙箱快照名称</p> 
     * @return SnapshotName <p>沙箱快照名称</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>沙箱快照名称</p>
     * @param SnapshotName <p>沙箱快照名称</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>源沙箱实例 ID，沙箱快照由其派生</p> 
     * @return SourceInstanceId <p>源沙箱实例 ID，沙箱快照由其派生</p>
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set <p>源沙箱实例 ID，沙箱快照由其派生</p>
     * @param SourceInstanceId <p>源沙箱实例 ID，沙箱快照由其派生</p>
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    /**
     * Get <p>制作快照时是否包含内存状态</p> 
     * @return MemoryIncluded <p>制作快照时是否包含内存状态</p>
     */
    public Boolean getMemoryIncluded() {
        return this.MemoryIncluded;
    }

    /**
     * Set <p>制作快照时是否包含内存状态</p>
     * @param MemoryIncluded <p>制作快照时是否包含内存状态</p>
     */
    public void setMemoryIncluded(Boolean MemoryIncluded) {
        this.MemoryIncluded = MemoryIncluded;
    }

    /**
     * Get <p>沙箱快照状态</p><p>枚举值：</p><ul><li>ACTIVE： 可用</li><li>DELETING： 删除中</li><li>DELETED： 已删除</li></ul> 
     * @return Status <p>沙箱快照状态</p><p>枚举值：</p><ul><li>ACTIVE： 可用</li><li>DELETING： 删除中</li><li>DELETED： 已删除</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>沙箱快照状态</p><p>枚举值：</p><ul><li>ACTIVE： 可用</li><li>DELETING： 删除中</li><li>DELETED： 已删除</li></ul>
     * @param Status <p>沙箱快照状态</p><p>枚举值：</p><ul><li>ACTIVE： 可用</li><li>DELETING： 删除中</li><li>DELETED： 已删除</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>用于说明沙箱快照处于该状态的原因</p> 
     * @return StatusReason <p>用于说明沙箱快照处于该状态的原因</p>
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set <p>用于说明沙箱快照处于该状态的原因</p>
     * @param StatusReason <p>用于说明沙箱快照处于该状态的原因</p>
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
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
     * Get <p>创建时间</p><p>参数格式：ISO8601</p> 
     * @return CreateTime <p>创建时间</p><p>参数格式：ISO8601</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：ISO8601</p>
     * @param CreateTime <p>创建时间</p><p>参数格式：ISO8601</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：ISO8601</p> 
     * @return UpdateTime <p>更新时间</p><p>参数格式：ISO8601</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：ISO8601</p>
     * @param UpdateTime <p>更新时间</p><p>参数格式：ISO8601</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SandboxSnapshot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SandboxSnapshot(SandboxSnapshot source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
        if (source.MemoryIncluded != null) {
            this.MemoryIncluded = new Boolean(source.MemoryIncluded);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusReason != null) {
            this.StatusReason = new String(source.StatusReason);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);
        this.setParamSimple(map, prefix + "MemoryIncluded", this.MemoryIncluded);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

