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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CateInfo extends AbstractModel {

    /**
    * 分类ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * 分类名称

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分类下的Record（如文档、同义词等）数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 是否可新增

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanAdd")
    @Expose
    private Boolean CanAdd;

    /**
    * 是否可编辑

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
    * 是否可删除

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanDelete")
    @Expose
    private Boolean CanDelete;

    /**
    * 子分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private CateInfo [] Children;

    /**
    * 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
     * Get 分类ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CateBizId 分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CateBizId 分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get 分类名称

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 分类名称

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分类名称

注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 分类名称

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分类下的Record（如文档、同义词等）数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 分类下的Record（如文档、同义词等）数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 分类下的Record（如文档、同义词等）数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 分类下的Record（如文档、同义词等）数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 是否可新增

注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanAdd 是否可新增

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanAdd() {
        return this.CanAdd;
    }

    /**
     * Set 是否可新增

注意：此字段可能返回 null，表示取不到有效值。
     * @param CanAdd 是否可新增

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanAdd(Boolean CanAdd) {
        this.CanAdd = CanAdd;
    }

    /**
     * Get 是否可编辑

注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanEdit 是否可编辑

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set 是否可编辑

注意：此字段可能返回 null，表示取不到有效值。
     * @param CanEdit 是否可编辑

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    /**
     * Get 是否可删除

注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanDelete 是否可删除

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set 是否可删除

注意：此字段可能返回 null，表示取不到有效值。
     * @param CanDelete 是否可删除

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanDelete(Boolean CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get 子分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children 子分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CateInfo [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children 子分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(CateInfo [] Children) {
        this.Children = Children;
    }

    /**
     * Get 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLeaf 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLeaf 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    public CateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CateInfo(CateInfo source) {
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CanAdd != null) {
            this.CanAdd = new Boolean(source.CanAdd);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.Children != null) {
            this.Children = new CateInfo[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new CateInfo(source.Children[i]);
            }
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "CanAdd", this.CanAdd);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);

    }
}

