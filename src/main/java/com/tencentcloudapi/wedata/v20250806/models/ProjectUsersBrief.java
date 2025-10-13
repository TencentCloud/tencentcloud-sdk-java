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

public class ProjectUsersBrief extends AbstractModel {

    /**
    * 用户集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private ProjectUserRole [] Items;

    /**
    * 分页大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
     * Get 用户集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 用户集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProjectUserRole [] getItems() {
        return this.Items;
    }

    /**
     * Set 用户集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 用户集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(ProjectUserRole [] Items) {
        this.Items = Items;
    }

    /**
     * Get 分页大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 分页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 分页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber 分页页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber 分页页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPageNumber 总页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set 总页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPageNumber 总页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    public ProjectUsersBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectUsersBrief(ProjectUsersBrief source) {
        if (source.Items != null) {
            this.Items = new ProjectUserRole[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ProjectUserRole(source.Items[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);

    }
}

