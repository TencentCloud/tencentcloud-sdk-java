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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManualTriggerRecordOpsDtoPage extends AbstractModel {

    /**
    * 页号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 手动工作流触发运行记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private ManualTriggerRecordOpsDto [] Items;

    /**
    * 总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * 总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 页号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber 页号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber 页号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 手动工作流触发运行记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 手动工作流触发运行记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ManualTriggerRecordOpsDto [] getItems() {
        return this.Items;
    }

    /**
     * Set 手动工作流触发运行记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 手动工作流触发运行记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(ManualTriggerRecordOpsDto [] Items) {
        this.Items = Items;
    }

    /**
     * Get 总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPage 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPage 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageCount 页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set 页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageCount 页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get 总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public ManualTriggerRecordOpsDtoPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManualTriggerRecordOpsDtoPage(ManualTriggerRecordOpsDtoPage source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Items != null) {
            this.Items = new ManualTriggerRecordOpsDto[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ManualTriggerRecordOpsDto(source.Items[i]);
            }
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

