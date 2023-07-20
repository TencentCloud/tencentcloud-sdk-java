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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkFlowExecuteDtoByPage extends AbstractModel{

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * data
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private WorkFlowExecuteDto [] Items;

    /**
    * 分页大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get data
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items data
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkFlowExecuteDto [] getItems() {
        return this.Items;
    }

    /**
     * Set data
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items data
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(WorkFlowExecuteDto [] Items) {
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

    public WorkFlowExecuteDtoByPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkFlowExecuteDtoByPage(WorkFlowExecuteDtoByPage source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new WorkFlowExecuteDto[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkFlowExecuteDto(source.Items[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

