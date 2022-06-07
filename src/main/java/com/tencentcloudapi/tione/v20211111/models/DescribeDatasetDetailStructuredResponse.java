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

public class DescribeDatasetDetailStructuredResponse extends AbstractModel{

    /**
    * 数据总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 表格头信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnNames")
    @Expose
    private String [] ColumnNames;

    /**
    * 表格内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowItems")
    @Expose
    private RowItem [] RowItems;

    /**
    * 文本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowTexts")
    @Expose
    private String [] RowTexts;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 数据总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数据总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 数据总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 表格头信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnNames 表格头信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColumnNames() {
        return this.ColumnNames;
    }

    /**
     * Set 表格头信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnNames 表格头信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnNames(String [] ColumnNames) {
        this.ColumnNames = ColumnNames;
    }

    /**
     * Get 表格内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowItems 表格内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RowItem [] getRowItems() {
        return this.RowItems;
    }

    /**
     * Set 表格内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowItems 表格内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowItems(RowItem [] RowItems) {
        this.RowItems = RowItems;
    }

    /**
     * Get 文本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowTexts 文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRowTexts() {
        return this.RowTexts;
    }

    /**
     * Set 文本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowTexts 文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowTexts(String [] RowTexts) {
        this.RowTexts = RowTexts;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDatasetDetailStructuredResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasetDetailStructuredResponse(DescribeDatasetDetailStructuredResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ColumnNames != null) {
            this.ColumnNames = new String[source.ColumnNames.length];
            for (int i = 0; i < source.ColumnNames.length; i++) {
                this.ColumnNames[i] = new String(source.ColumnNames[i]);
            }
        }
        if (source.RowItems != null) {
            this.RowItems = new RowItem[source.RowItems.length];
            for (int i = 0; i < source.RowItems.length; i++) {
                this.RowItems[i] = new RowItem(source.RowItems[i]);
            }
        }
        if (source.RowTexts != null) {
            this.RowTexts = new String[source.RowTexts.length];
            for (int i = 0; i < source.RowTexts.length; i++) {
                this.RowTexts[i] = new String(source.RowTexts[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "ColumnNames.", this.ColumnNames);
        this.setParamArrayObj(map, prefix + "RowItems.", this.RowItems);
        this.setParamArraySimple(map, prefix + "RowTexts.", this.RowTexts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

