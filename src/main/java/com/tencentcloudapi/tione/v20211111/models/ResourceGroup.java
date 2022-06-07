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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceGroup extends AbstractModel{

    /**
    * 资源组id
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 资源组名称
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 可用节点个数(运行中的节点)
    */
    @SerializedName("FreeInstance")
    @Expose
    private Long FreeInstance;

    /**
    * 总节点个数(所有节点)
    */
    @SerializedName("TotalInstance")
    @Expose
    private Long TotalInstance;

    /**
    * 资资源组已用的资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedResource")
    @Expose
    private GroupResource UsedResource;

    /**
    * 资源组总资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalResource")
    @Expose
    private GroupResource TotalResource;

    /**
    * 节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceSet")
    @Expose
    private Instance [] InstanceSet;

    /**
    * 标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get 资源组id 
     * @return ResourceGroupId 资源组id
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组id
     * @param ResourceGroupId 资源组id
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 资源组名称 
     * @return ResourceGroupName 资源组名称
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 资源组名称
     * @param ResourceGroupName 资源组名称
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 可用节点个数(运行中的节点) 
     * @return FreeInstance 可用节点个数(运行中的节点)
     */
    public Long getFreeInstance() {
        return this.FreeInstance;
    }

    /**
     * Set 可用节点个数(运行中的节点)
     * @param FreeInstance 可用节点个数(运行中的节点)
     */
    public void setFreeInstance(Long FreeInstance) {
        this.FreeInstance = FreeInstance;
    }

    /**
     * Get 总节点个数(所有节点) 
     * @return TotalInstance 总节点个数(所有节点)
     */
    public Long getTotalInstance() {
        return this.TotalInstance;
    }

    /**
     * Set 总节点个数(所有节点)
     * @param TotalInstance 总节点个数(所有节点)
     */
    public void setTotalInstance(Long TotalInstance) {
        this.TotalInstance = TotalInstance;
    }

    /**
     * Get 资资源组已用的资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedResource 资资源组已用的资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupResource getUsedResource() {
        return this.UsedResource;
    }

    /**
     * Set 资资源组已用的资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedResource 资资源组已用的资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedResource(GroupResource UsedResource) {
        this.UsedResource = UsedResource;
    }

    /**
     * Get 资源组总资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalResource 资源组总资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupResource getTotalResource() {
        return this.TotalResource;
    }

    /**
     * Set 资源组总资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalResource 资源组总资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalResource(GroupResource TotalResource) {
        this.TotalResource = TotalResource;
    }

    /**
     * Get 节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceSet 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Instance [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceSet 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceSet(Instance [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get 标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public ResourceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceGroup(ResourceGroup source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.FreeInstance != null) {
            this.FreeInstance = new Long(source.FreeInstance);
        }
        if (source.TotalInstance != null) {
            this.TotalInstance = new Long(source.TotalInstance);
        }
        if (source.UsedResource != null) {
            this.UsedResource = new GroupResource(source.UsedResource);
        }
        if (source.TotalResource != null) {
            this.TotalResource = new GroupResource(source.TotalResource);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new Instance[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new Instance(source.InstanceSet[i]);
            }
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
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "FreeInstance", this.FreeInstance);
        this.setParamSimple(map, prefix + "TotalInstance", this.TotalInstance);
        this.setParamObj(map, prefix + "UsedResource.", this.UsedResource);
        this.setParamObj(map, prefix + "TotalResource.", this.TotalResource);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

