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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CollectionEventDTO extends AbstractModel {

    /**
    * 总数据条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalItems")
    @Expose
    private Long TotalItems;

    /**
    * 总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * 当前页数据条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentPageItems")
    @Expose
    private Long CurrentPageItems;

    /**
    * 当前页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentPage")
    @Expose
    private Long CurrentPage;

    /**
    * 分页大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private EventDsDto [] Items;

    /**
     * Get 总数据条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalItems 总数据条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalItems() {
        return this.TotalItems;
    }

    /**
     * Set 总数据条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalItems 总数据条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalItems(Long TotalItems) {
        this.TotalItems = TotalItems;
    }

    /**
     * Get 总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPages 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set 总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPages 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    /**
     * Get 当前页数据条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentPageItems 当前页数据条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentPageItems() {
        return this.CurrentPageItems;
    }

    /**
     * Set 当前页数据条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentPageItems 当前页数据条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentPageItems(Long CurrentPageItems) {
        this.CurrentPageItems = CurrentPageItems;
    }

    /**
     * Get 当前页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentPage 当前页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentPage() {
        return this.CurrentPage;
    }

    /**
     * Set 当前页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentPage 当前页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentPage(Long CurrentPage) {
        this.CurrentPage = CurrentPage;
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
     * Get 数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventDsDto [] getItems() {
        return this.Items;
    }

    /**
     * Set 数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(EventDsDto [] Items) {
        this.Items = Items;
    }

    public CollectionEventDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CollectionEventDTO(CollectionEventDTO source) {
        if (source.TotalItems != null) {
            this.TotalItems = new Long(source.TotalItems);
        }
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
        if (source.CurrentPageItems != null) {
            this.CurrentPageItems = new Long(source.CurrentPageItems);
        }
        if (source.CurrentPage != null) {
            this.CurrentPage = new Long(source.CurrentPage);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Items != null) {
            this.Items = new EventDsDto[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new EventDsDto(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalItems", this.TotalItems);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamSimple(map, prefix + "CurrentPageItems", this.CurrentPageItems);
        this.setParamSimple(map, prefix + "CurrentPage", this.CurrentPage);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

