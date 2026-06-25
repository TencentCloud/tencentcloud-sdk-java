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

public class ModifyClusterTagsRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群标签:<br>[{&quot;TagKey&quot;:&quot;env&quot;,&quot;TagValue&quot;:&quot;dev&quot;}]}]</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否同步集群内子资源标签</p>
    */
    @SerializedName("SyncSubresource")
    @Expose
    private Boolean SyncSubresource;

    /**
    * <p>是否同步节点池标签</p>
    */
    @SerializedName("SyncNodePoolTags")
    @Expose
    private Boolean SyncNodePoolTags;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群标签:<br>[{&quot;TagKey&quot;:&quot;env&quot;,&quot;TagValue&quot;:&quot;dev&quot;}]}]</p> 
     * @return Tags <p>集群标签:<br>[{&quot;TagKey&quot;:&quot;env&quot;,&quot;TagValue&quot;:&quot;dev&quot;}]}]</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>集群标签:<br>[{&quot;TagKey&quot;:&quot;env&quot;,&quot;TagValue&quot;:&quot;dev&quot;}]}]</p>
     * @param Tags <p>集群标签:<br>[{&quot;TagKey&quot;:&quot;env&quot;,&quot;TagValue&quot;:&quot;dev&quot;}]}]</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否同步集群内子资源标签</p> 
     * @return SyncSubresource <p>是否同步集群内子资源标签</p>
     */
    public Boolean getSyncSubresource() {
        return this.SyncSubresource;
    }

    /**
     * Set <p>是否同步集群内子资源标签</p>
     * @param SyncSubresource <p>是否同步集群内子资源标签</p>
     */
    public void setSyncSubresource(Boolean SyncSubresource) {
        this.SyncSubresource = SyncSubresource;
    }

    /**
     * Get <p>是否同步节点池标签</p> 
     * @return SyncNodePoolTags <p>是否同步节点池标签</p>
     */
    public Boolean getSyncNodePoolTags() {
        return this.SyncNodePoolTags;
    }

    /**
     * Set <p>是否同步节点池标签</p>
     * @param SyncNodePoolTags <p>是否同步节点池标签</p>
     */
    public void setSyncNodePoolTags(Boolean SyncNodePoolTags) {
        this.SyncNodePoolTags = SyncNodePoolTags;
    }

    public ModifyClusterTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterTagsRequest(ModifyClusterTagsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.SyncSubresource != null) {
            this.SyncSubresource = new Boolean(source.SyncSubresource);
        }
        if (source.SyncNodePoolTags != null) {
            this.SyncNodePoolTags = new Boolean(source.SyncNodePoolTags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SyncSubresource", this.SyncSubresource);
        this.setParamSimple(map, prefix + "SyncNodePoolTags", this.SyncNodePoolTags);

    }
}

