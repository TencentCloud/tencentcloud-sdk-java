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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrNamespaceInfo extends AbstractModel{

    /**
    * 命名空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 访问级别
    */
    @SerializedName("Public")
    @Expose
    private Boolean Public;

    /**
    * 命名空间的Id
    */
    @SerializedName("NamespaceId")
    @Expose
    private Long NamespaceId;

    /**
    * 实例云标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * 命名空间元数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private KeyValueString [] Metadata;

    /**
     * Get 命名空间名称 
     * @return Name 命名空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 命名空间名称
     * @param Name 命名空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 访问级别 
     * @return Public 访问级别
     */
    public Boolean getPublic() {
        return this.Public;
    }

    /**
     * Set 访问级别
     * @param Public 访问级别
     */
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    /**
     * Get 命名空间的Id 
     * @return NamespaceId 命名空间的Id
     */
    public Long getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间的Id
     * @param NamespaceId 命名空间的Id
     */
    public void setNamespaceId(Long NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 实例云标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification 实例云标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 实例云标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification 实例云标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 命名空间元数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata 命名空间元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueString [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 命名空间元数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata 命名空间元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(KeyValueString [] Metadata) {
        this.Metadata = Metadata;
    }

    public TcrNamespaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrNamespaceInfo(TcrNamespaceInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.Public != null) {
            this.Public = new Boolean(source.Public);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new Long(source.NamespaceId);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
        if (source.Metadata != null) {
            this.Metadata = new KeyValueString[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new KeyValueString(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

