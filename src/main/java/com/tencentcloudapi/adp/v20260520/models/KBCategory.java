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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBCategory extends AbstractModel {

    /**
    * <p>是否可新增</p>
    */
    @SerializedName("CanAdd")
    @Expose
    private Boolean CanAdd;

    /**
    * <p>是否可删除</p>
    */
    @SerializedName("CanDelete")
    @Expose
    private Boolean CanDelete;

    /**
    * <p>是否可编辑</p>
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
    * <p>分类 ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>子分类列表</p>
    */
    @SerializedName("ChildList")
    @Expose
    private KBCategory [] ChildList;

    /**
    * <p>是否为叶子节点（无子分类）</p>
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * <p>分类对象的数量</p>
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * <p>元数据配置（该分类被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaValue")
    @Expose
    private MetaValue MetaValue;

    /**
    * <p>分类名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>是否可新增</p> 
     * @return CanAdd <p>是否可新增</p>
     */
    public Boolean getCanAdd() {
        return this.CanAdd;
    }

    /**
     * Set <p>是否可新增</p>
     * @param CanAdd <p>是否可新增</p>
     */
    public void setCanAdd(Boolean CanAdd) {
        this.CanAdd = CanAdd;
    }

    /**
     * Get <p>是否可删除</p> 
     * @return CanDelete <p>是否可删除</p>
     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set <p>是否可删除</p>
     * @param CanDelete <p>是否可删除</p>
     */
    public void setCanDelete(Boolean CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get <p>是否可编辑</p> 
     * @return CanEdit <p>是否可编辑</p>
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set <p>是否可编辑</p>
     * @param CanEdit <p>是否可编辑</p>
     */
    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    /**
     * Get <p>分类 ID</p> 
     * @return CategoryId <p>分类 ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>分类 ID</p>
     * @param CategoryId <p>分类 ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>子分类列表</p> 
     * @return ChildList <p>子分类列表</p>
     */
    public KBCategory [] getChildList() {
        return this.ChildList;
    }

    /**
     * Set <p>子分类列表</p>
     * @param ChildList <p>子分类列表</p>
     */
    public void setChildList(KBCategory [] ChildList) {
        this.ChildList = ChildList;
    }

    /**
     * Get <p>是否为叶子节点（无子分类）</p> 
     * @return IsLeaf <p>是否为叶子节点（无子分类）</p>
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set <p>是否为叶子节点（无子分类）</p>
     * @param IsLeaf <p>是否为叶子节点（无子分类）</p>
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get <p>分类对象的数量</p> 
     * @return ItemCount <p>分类对象的数量</p>
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set <p>分类对象的数量</p>
     * @param ItemCount <p>分类对象的数量</p>
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get <p>元数据配置（该分类被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaValue <p>元数据配置（该分类被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetaValue getMetaValue() {
        return this.MetaValue;
    }

    /**
     * Set <p>元数据配置（该分类被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaValue <p>元数据配置（该分类被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaValue(MetaValue MetaValue) {
        this.MetaValue = MetaValue;
    }

    /**
     * Get <p>分类名称</p> 
     * @return Name <p>分类名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分类名称</p>
     * @param Name <p>分类名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public KBCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBCategory(KBCategory source) {
        if (source.CanAdd != null) {
            this.CanAdd = new Boolean(source.CanAdd);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.ChildList != null) {
            this.ChildList = new KBCategory[source.ChildList.length];
            for (int i = 0; i < source.ChildList.length; i++) {
                this.ChildList[i] = new KBCategory(source.ChildList[i]);
            }
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.MetaValue != null) {
            this.MetaValue = new MetaValue(source.MetaValue);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanAdd", this.CanAdd);
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamArrayObj(map, prefix + "ChildList.", this.ChildList);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamObj(map, prefix + "MetaValue.", this.MetaValue);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

