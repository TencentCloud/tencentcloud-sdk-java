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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAggrSoftCategorySoftListData extends AbstractModel {

    /**
    * 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Page")
    @Expose
    private Paging Page;

    /**
    * 总数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 行数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AggrSoftCategorySoftList")
    @Expose
    private AggrCategorySoftDetailRow [] AggrSoftCategorySoftList;

    /**
     * Get 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Page 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Paging getPage() {
        return this.Page;
    }

    /**
     * Set 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Page 分页公共对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPage(Paging Page) {
        this.Page = Page;
    }

    /**
     * Get 总数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 行数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AggrSoftCategorySoftList 行数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AggrCategorySoftDetailRow [] getAggrSoftCategorySoftList() {
        return this.AggrSoftCategorySoftList;
    }

    /**
     * Set 行数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param AggrSoftCategorySoftList 行数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAggrSoftCategorySoftList(AggrCategorySoftDetailRow [] AggrSoftCategorySoftList) {
        this.AggrSoftCategorySoftList = AggrSoftCategorySoftList;
    }

    public DescribeAggrSoftCategorySoftListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAggrSoftCategorySoftListData(DescribeAggrSoftCategorySoftListData source) {
        if (source.Page != null) {
            this.Page = new Paging(source.Page);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AggrSoftCategorySoftList != null) {
            this.AggrSoftCategorySoftList = new AggrCategorySoftDetailRow[source.AggrSoftCategorySoftList.length];
            for (int i = 0; i < source.AggrSoftCategorySoftList.length; i++) {
                this.AggrSoftCategorySoftList[i] = new AggrCategorySoftDetailRow(source.AggrSoftCategorySoftList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Page.", this.Page);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "AggrSoftCategorySoftList.", this.AggrSoftCategorySoftList);

    }
}

