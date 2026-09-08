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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceGraphEntityTopicsRelationRequest extends AbstractModel {

    /**
    * <p>资源图谱id</p>
    */
    @SerializedName("ResourceGraphId")
    @Expose
    private String ResourceGraphId;

    /**
    * <p>实体id</p><p>仅支持手动关联tke以下实体：node、pod、deployment、statefulset、daemonset</p>
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * <p>资源图谱实体关联的topic</p>
    */
    @SerializedName("TopicInfos")
    @Expose
    private ResourceGraphEntityRelatedTopic [] TopicInfos;

    /**
     * Get <p>资源图谱id</p> 
     * @return ResourceGraphId <p>资源图谱id</p>
     */
    public String getResourceGraphId() {
        return this.ResourceGraphId;
    }

    /**
     * Set <p>资源图谱id</p>
     * @param ResourceGraphId <p>资源图谱id</p>
     */
    public void setResourceGraphId(String ResourceGraphId) {
        this.ResourceGraphId = ResourceGraphId;
    }

    /**
     * Get <p>实体id</p><p>仅支持手动关联tke以下实体：node、pod、deployment、statefulset、daemonset</p> 
     * @return EntityId <p>实体id</p><p>仅支持手动关联tke以下实体：node、pod、deployment、statefulset、daemonset</p>
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set <p>实体id</p><p>仅支持手动关联tke以下实体：node、pod、deployment、statefulset、daemonset</p>
     * @param EntityId <p>实体id</p><p>仅支持手动关联tke以下实体：node、pod、deployment、statefulset、daemonset</p>
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get <p>资源图谱实体关联的topic</p> 
     * @return TopicInfos <p>资源图谱实体关联的topic</p>
     */
    public ResourceGraphEntityRelatedTopic [] getTopicInfos() {
        return this.TopicInfos;
    }

    /**
     * Set <p>资源图谱实体关联的topic</p>
     * @param TopicInfos <p>资源图谱实体关联的topic</p>
     */
    public void setTopicInfos(ResourceGraphEntityRelatedTopic [] TopicInfos) {
        this.TopicInfos = TopicInfos;
    }

    public ModifyResourceGraphEntityTopicsRelationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceGraphEntityTopicsRelationRequest(ModifyResourceGraphEntityTopicsRelationRequest source) {
        if (source.ResourceGraphId != null) {
            this.ResourceGraphId = new String(source.ResourceGraphId);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.TopicInfos != null) {
            this.TopicInfos = new ResourceGraphEntityRelatedTopic[source.TopicInfos.length];
            for (int i = 0; i < source.TopicInfos.length; i++) {
                this.TopicInfos[i] = new ResourceGraphEntityRelatedTopic(source.TopicInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGraphId", this.ResourceGraphId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamArrayObj(map, prefix + "TopicInfos.", this.TopicInfos);

    }
}

