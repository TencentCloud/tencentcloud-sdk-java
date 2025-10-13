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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageResource extends AbstractModel {

    /**
    * 实体原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceUniqueId")
    @Expose
    private String ResourceUniqueId;

    /**
    * 业务名称：库名.表名｜指标名称｜模型名称|字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 实体类型
TABLE|METRIC|MODEL|SERVICE|COLUMN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 血缘节点唯一标识符号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LineageNodeId")
    @Expose
    private String LineageNodeId;

    /**
    * 描述：表类型｜指标描述｜模型描述|字段描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 来源：WEDATA|THIRD
默认wedata
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * resource 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceProperties")
    @Expose
    private LineageProperty [] ResourceProperties;

    /**
     * Get 实体原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceUniqueId 实体原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceUniqueId() {
        return this.ResourceUniqueId;
    }

    /**
     * Set 实体原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceUniqueId 实体原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceUniqueId(String ResourceUniqueId) {
        this.ResourceUniqueId = ResourceUniqueId;
    }

    /**
     * Get 业务名称：库名.表名｜指标名称｜模型名称|字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 业务名称：库名.表名｜指标名称｜模型名称|字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 业务名称：库名.表名｜指标名称｜模型名称|字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 业务名称：库名.表名｜指标名称｜模型名称|字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 实体类型
TABLE|METRIC|MODEL|SERVICE|COLUMN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 实体类型
TABLE|METRIC|MODEL|SERVICE|COLUMN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 实体类型
TABLE|METRIC|MODEL|SERVICE|COLUMN
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 实体类型
TABLE|METRIC|MODEL|SERVICE|COLUMN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 血缘节点唯一标识符号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LineageNodeId 血缘节点唯一标识符号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLineageNodeId() {
        return this.LineageNodeId;
    }

    /**
     * Set 血缘节点唯一标识符号
注意：此字段可能返回 null，表示取不到有效值。
     * @param LineageNodeId 血缘节点唯一标识符号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLineageNodeId(String LineageNodeId) {
        this.LineageNodeId = LineageNodeId;
    }

    /**
     * Get 描述：表类型｜指标描述｜模型描述|字段描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述：表类型｜指标描述｜模型描述|字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述：表类型｜指标描述｜模型描述|字段描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述：表类型｜指标描述｜模型描述|字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 来源：WEDATA|THIRD
默认wedata
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Platform 来源：WEDATA|THIRD
默认wedata
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 来源：WEDATA|THIRD
默认wedata
注意：此字段可能返回 null，表示取不到有效值。
     * @param Platform 来源：WEDATA|THIRD
默认wedata
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get resource 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceProperties resource 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageProperty [] getResourceProperties() {
        return this.ResourceProperties;
    }

    /**
     * Set resource 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceProperties resource 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceProperties(LineageProperty [] ResourceProperties) {
        this.ResourceProperties = ResourceProperties;
    }

    public LineageResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageResource(LineageResource source) {
        if (source.ResourceUniqueId != null) {
            this.ResourceUniqueId = new String(source.ResourceUniqueId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.LineageNodeId != null) {
            this.LineageNodeId = new String(source.LineageNodeId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ResourceProperties != null) {
            this.ResourceProperties = new LineageProperty[source.ResourceProperties.length];
            for (int i = 0; i < source.ResourceProperties.length; i++) {
                this.ResourceProperties[i] = new LineageProperty(source.ResourceProperties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceUniqueId", this.ResourceUniqueId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "LineageNodeId", this.LineageNodeId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "ResourceProperties.", this.ResourceProperties);

    }
}

