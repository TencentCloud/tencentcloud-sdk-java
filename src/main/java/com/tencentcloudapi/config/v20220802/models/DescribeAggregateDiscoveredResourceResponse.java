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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAggregateDiscoveredResourceResponse extends AbstractModel {

    /**
    * 资源Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资源可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceZone")
    @Expose
    private String ResourceZone;

    /**
    * 资源配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Configuration")
    @Expose
    private String Configuration;

    /**
    * 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceCreateTime")
    @Expose
    private String ResourceCreateTime;

    /**
    * 资源标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 资源更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资源Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 资源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 资源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRegion 资源地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRegion 资源地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资源可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceZone 资源可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceZone() {
        return this.ResourceZone;
    }

    /**
     * Set 资源可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceZone 资源可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceZone(String ResourceZone) {
        this.ResourceZone = ResourceZone;
    }

    /**
     * Get 资源配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Configuration 资源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfiguration() {
        return this.Configuration;
    }

    /**
     * Set 资源配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Configuration 资源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfiguration(String Configuration) {
        this.Configuration = Configuration;
    }

    /**
     * Get 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceCreateTime 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceCreateTime() {
        return this.ResourceCreateTime;
    }

    /**
     * Set 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceCreateTime 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceCreateTime(String ResourceCreateTime) {
        this.ResourceCreateTime = ResourceCreateTime;
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

    /**
     * Get 资源更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 资源更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 资源更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 资源更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    public DescribeAggregateDiscoveredResourceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAggregateDiscoveredResourceResponse(DescribeAggregateDiscoveredResourceResponse source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceZone != null) {
            this.ResourceZone = new String(source.ResourceZone);
        }
        if (source.Configuration != null) {
            this.Configuration = new String(source.Configuration);
        }
        if (source.ResourceCreateTime != null) {
            this.ResourceCreateTime = new String(source.ResourceCreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceZone", this.ResourceZone);
        this.setParamSimple(map, prefix + "Configuration", this.Configuration);
        this.setParamSimple(map, prefix + "ResourceCreateTime", this.ResourceCreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

