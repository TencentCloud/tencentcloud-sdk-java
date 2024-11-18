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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBatchModifyTagsStatusResponse extends AbstractModel {

    /**
    * 失败资源列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedResources")
    @Expose
    private FailedResource [] FailedResources;

    /**
    * 任务状态：
- running 运行中
- failed 失败
- done 成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否同步集群内子资源标签
    */
    @SerializedName("SyncSubresource")
    @Expose
    private Boolean SyncSubresource;

    /**
    * 集群标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 失败资源列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedResources 失败资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FailedResource [] getFailedResources() {
        return this.FailedResources;
    }

    /**
     * Set 失败资源列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedResources 失败资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedResources(FailedResource [] FailedResources) {
        this.FailedResources = FailedResources;
    }

    /**
     * Get 任务状态：
- running 运行中
- failed 失败
- done 成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态：
- running 运行中
- failed 失败
- done 成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态：
- running 运行中
- failed 失败
- done 成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态：
- running 运行中
- failed 失败
- done 成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否同步集群内子资源标签 
     * @return SyncSubresource 是否同步集群内子资源标签
     */
    public Boolean getSyncSubresource() {
        return this.SyncSubresource;
    }

    /**
     * Set 是否同步集群内子资源标签
     * @param SyncSubresource 是否同步集群内子资源标签
     */
    public void setSyncSubresource(Boolean SyncSubresource) {
        this.SyncSubresource = SyncSubresource;
    }

    /**
     * Get 集群标签 
     * @return Tags 集群标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 集群标签
     * @param Tags 集群标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBatchModifyTagsStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchModifyTagsStatusResponse(DescribeBatchModifyTagsStatusResponse source) {
        if (source.FailedResources != null) {
            this.FailedResources = new FailedResource[source.FailedResources.length];
            for (int i = 0; i < source.FailedResources.length; i++) {
                this.FailedResources[i] = new FailedResource(source.FailedResources[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SyncSubresource != null) {
            this.SyncSubresource = new Boolean(source.SyncSubresource);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FailedResources.", this.FailedResources);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SyncSubresource", this.SyncSubresource);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

