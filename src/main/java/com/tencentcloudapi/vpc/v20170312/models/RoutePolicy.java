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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoutePolicy extends AbstractModel {

    /**
    * 路由策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutePolicyId")
    @Expose
    private String RoutePolicyId;

    /**
    * 路由策略名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutePolicyName")
    @Expose
    private String RoutePolicyName;

    /**
    * 路由策略描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutePolicyDescription")
    @Expose
    private String RoutePolicyDescription;

    /**
    * 路由策略规则列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutePolicyEntrySet")
    @Expose
    private RoutePolicyEntry [] RoutePolicyEntrySet;

    /**
    * 路由策略绑定。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutePolicyAssociationSet")
    @Expose
    private RoutePolicyAssociation [] RoutePolicyAssociationSet;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 标签键值对。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get 路由策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutePolicyId 路由策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoutePolicyId() {
        return this.RoutePolicyId;
    }

    /**
     * Set 路由策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutePolicyId 路由策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutePolicyId(String RoutePolicyId) {
        this.RoutePolicyId = RoutePolicyId;
    }

    /**
     * Get 路由策略名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutePolicyName 路由策略名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoutePolicyName() {
        return this.RoutePolicyName;
    }

    /**
     * Set 路由策略名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutePolicyName 路由策略名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutePolicyName(String RoutePolicyName) {
        this.RoutePolicyName = RoutePolicyName;
    }

    /**
     * Get 路由策略描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutePolicyDescription 路由策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoutePolicyDescription() {
        return this.RoutePolicyDescription;
    }

    /**
     * Set 路由策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutePolicyDescription 路由策略描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutePolicyDescription(String RoutePolicyDescription) {
        this.RoutePolicyDescription = RoutePolicyDescription;
    }

    /**
     * Get 路由策略规则列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutePolicyEntrySet 路由策略规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoutePolicyEntry [] getRoutePolicyEntrySet() {
        return this.RoutePolicyEntrySet;
    }

    /**
     * Set 路由策略规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutePolicyEntrySet 路由策略规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutePolicyEntrySet(RoutePolicyEntry [] RoutePolicyEntrySet) {
        this.RoutePolicyEntrySet = RoutePolicyEntrySet;
    }

    /**
     * Get 路由策略绑定。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutePolicyAssociationSet 路由策略绑定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoutePolicyAssociation [] getRoutePolicyAssociationSet() {
        return this.RoutePolicyAssociationSet;
    }

    /**
     * Set 路由策略绑定。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutePolicyAssociationSet 路由策略绑定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutePolicyAssociationSet(RoutePolicyAssociation [] RoutePolicyAssociationSet) {
        this.RoutePolicyAssociationSet = RoutePolicyAssociationSet;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 标签键值对。 
     * @return TagSet 标签键值对。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。
     * @param TagSet 标签键值对。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public RoutePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoutePolicy(RoutePolicy source) {
        if (source.RoutePolicyId != null) {
            this.RoutePolicyId = new String(source.RoutePolicyId);
        }
        if (source.RoutePolicyName != null) {
            this.RoutePolicyName = new String(source.RoutePolicyName);
        }
        if (source.RoutePolicyDescription != null) {
            this.RoutePolicyDescription = new String(source.RoutePolicyDescription);
        }
        if (source.RoutePolicyEntrySet != null) {
            this.RoutePolicyEntrySet = new RoutePolicyEntry[source.RoutePolicyEntrySet.length];
            for (int i = 0; i < source.RoutePolicyEntrySet.length; i++) {
                this.RoutePolicyEntrySet[i] = new RoutePolicyEntry(source.RoutePolicyEntrySet[i]);
            }
        }
        if (source.RoutePolicyAssociationSet != null) {
            this.RoutePolicyAssociationSet = new RoutePolicyAssociation[source.RoutePolicyAssociationSet.length];
            for (int i = 0; i < source.RoutePolicyAssociationSet.length; i++) {
                this.RoutePolicyAssociationSet[i] = new RoutePolicyAssociation(source.RoutePolicyAssociationSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutePolicyId", this.RoutePolicyId);
        this.setParamSimple(map, prefix + "RoutePolicyName", this.RoutePolicyName);
        this.setParamSimple(map, prefix + "RoutePolicyDescription", this.RoutePolicyDescription);
        this.setParamArrayObj(map, prefix + "RoutePolicyEntrySet.", this.RoutePolicyEntrySet);
        this.setParamArrayObj(map, prefix + "RoutePolicyAssociationSet.", this.RoutePolicyAssociationSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

