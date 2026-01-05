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

public class TriggerDependencyConfigPage extends AbstractModel {

    /**
    * 满足查询条件的数据总条数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 满足查询条件的数据总页数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * 当前请求的数据页数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 当前请求的数据页条数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private TriggerTaskDependDto [] Items;

    /**
     * Get 满足查询条件的数据总条数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 满足查询条件的数据总条数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 满足查询条件的数据总条数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 满足查询条件的数据总条数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 满足查询条件的数据总页数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPageNumber 满足查询条件的数据总页数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set 满足查询条件的数据总页数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPageNumber 满足查询条件的数据总页数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get 当前请求的数据页数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber 当前请求的数据页数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前请求的数据页数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber 当前请求的数据页数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 当前请求的数据页条数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 当前请求的数据页条数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 当前请求的数据页条数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 当前请求的数据页条数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 分页数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerTaskDependDto [] getItems() {
        return this.Items;
    }

    /**
     * Set 分页数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 分页数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(TriggerTaskDependDto [] Items) {
        this.Items = Items;
    }

    public TriggerDependencyConfigPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerDependencyConfigPage(TriggerDependencyConfigPage source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Items != null) {
            this.Items = new TriggerTaskDependDto[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TriggerTaskDependDto(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

