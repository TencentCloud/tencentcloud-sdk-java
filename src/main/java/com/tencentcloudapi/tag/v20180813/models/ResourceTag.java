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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceTag extends AbstractModel{

    /**
    * 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 业务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 资源前缀
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
    * 资源唯一标记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 业务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType 业务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 业务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType 业务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 资源前缀
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePrefix 资源前缀
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set 资源前缀
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePrefix 资源前缀
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    /**
     * Get 资源唯一标记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源唯一标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一标记
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源唯一标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ResourceTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceTag(ResourceTag source) {
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
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
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

