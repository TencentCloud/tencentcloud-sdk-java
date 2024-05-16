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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableSchemaItem extends AbstractModel {

    /**
    * 列标识
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否可按该列排序
    */
    @SerializedName("Sortable")
    @Expose
    private Boolean Sortable;

    /**
    * 是否可筛选
    */
    @SerializedName("WithFilter")
    @Expose
    private Boolean WithFilter;

    /**
    * 筛选的候选集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Candidates")
    @Expose
    private String [] Candidates;

    /**
    * 是否可点击
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Clickable")
    @Expose
    private Boolean Clickable;

    /**
    * 展示的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get 列标识 
     * @return Name 列标识
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 列标识
     * @param Name 列标识
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否可按该列排序 
     * @return Sortable 是否可按该列排序
     */
    public Boolean getSortable() {
        return this.Sortable;
    }

    /**
     * Set 是否可按该列排序
     * @param Sortable 是否可按该列排序
     */
    public void setSortable(Boolean Sortable) {
        this.Sortable = Sortable;
    }

    /**
     * Get 是否可筛选 
     * @return WithFilter 是否可筛选
     */
    public Boolean getWithFilter() {
        return this.WithFilter;
    }

    /**
     * Set 是否可筛选
     * @param WithFilter 是否可筛选
     */
    public void setWithFilter(Boolean WithFilter) {
        this.WithFilter = WithFilter;
    }

    /**
     * Get 筛选的候选集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Candidates 筛选的候选集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set 筛选的候选集
注意：此字段可能返回 null，表示取不到有效值。
     * @param Candidates 筛选的候选集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCandidates(String [] Candidates) {
        this.Candidates = Candidates;
    }

    /**
     * Get 是否可点击
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Clickable 是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getClickable() {
        return this.Clickable;
    }

    /**
     * Set 是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     * @param Clickable 是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClickable(Boolean Clickable) {
        this.Clickable = Clickable;
    }

    /**
     * Get 展示的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 展示的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 展示的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 展示的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public TableSchemaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableSchemaItem(TableSchemaItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sortable != null) {
            this.Sortable = new Boolean(source.Sortable);
        }
        if (source.WithFilter != null) {
            this.WithFilter = new Boolean(source.WithFilter);
        }
        if (source.Candidates != null) {
            this.Candidates = new String[source.Candidates.length];
            for (int i = 0; i < source.Candidates.length; i++) {
                this.Candidates[i] = new String(source.Candidates[i]);
            }
        }
        if (source.Clickable != null) {
            this.Clickable = new Boolean(source.Clickable);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sortable", this.Sortable);
        this.setParamSimple(map, prefix + "WithFilter", this.WithFilter);
        this.setParamArraySimple(map, prefix + "Candidates.", this.Candidates);
        this.setParamSimple(map, prefix + "Clickable", this.Clickable);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

