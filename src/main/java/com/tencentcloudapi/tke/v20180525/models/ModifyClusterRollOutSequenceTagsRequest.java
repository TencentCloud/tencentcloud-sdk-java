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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterRollOutSequenceTagsRequest extends AbstractModel {

    /**
    * 集群ID，可以从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 集群发布序列标签（为空时表示移除集群标签）。支持以下集群标签：
- 标签键："Env"，支持的标签值：["Test","Pre-Production","Production"]
- 标签键："Protection-Level"，支持的标签值：["Low","Medium","High"]
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 集群ID，可以从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。 
     * @return ClusterID 集群ID，可以从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID，可以从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。
     * @param ClusterID 集群ID，可以从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 集群发布序列标签（为空时表示移除集群标签）。支持以下集群标签：
- 标签键："Env"，支持的标签值：["Test","Pre-Production","Production"]
- 标签键："Protection-Level"，支持的标签值：["Low","Medium","High"] 
     * @return Tags 集群发布序列标签（为空时表示移除集群标签）。支持以下集群标签：
- 标签键："Env"，支持的标签值：["Test","Pre-Production","Production"]
- 标签键："Protection-Level"，支持的标签值：["Low","Medium","High"]
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 集群发布序列标签（为空时表示移除集群标签）。支持以下集群标签：
- 标签键："Env"，支持的标签值：["Test","Pre-Production","Production"]
- 标签键："Protection-Level"，支持的标签值：["Low","Medium","High"]
     * @param Tags 集群发布序列标签（为空时表示移除集群标签）。支持以下集群标签：
- 标签键："Env"，支持的标签值：["Test","Pre-Production","Production"]
- 标签键："Protection-Level"，支持的标签值：["Low","Medium","High"]
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ModifyClusterRollOutSequenceTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterRollOutSequenceTagsRequest(ModifyClusterRollOutSequenceTagsRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

