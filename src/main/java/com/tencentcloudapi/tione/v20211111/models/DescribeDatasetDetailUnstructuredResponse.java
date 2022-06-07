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

public class DescribeDatasetDetailUnstructuredResponse extends AbstractModel{

    /**
    * 已标注数据量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnnotatedTotalCount")
    @Expose
    private Long AnnotatedTotalCount;

    /**
    * 没有标注数据量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonAnnotatedTotalCount")
    @Expose
    private Long NonAnnotatedTotalCount;

    /**
    * 过滤数据总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterTotalCount")
    @Expose
    private Long FilterTotalCount;

    /**
    * 过滤数据详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterLabelList")
    @Expose
    private FilterLabelInfo [] FilterLabelList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 已标注数据量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnnotatedTotalCount 已标注数据量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAnnotatedTotalCount() {
        return this.AnnotatedTotalCount;
    }

    /**
     * Set 已标注数据量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnnotatedTotalCount 已标注数据量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotatedTotalCount(Long AnnotatedTotalCount) {
        this.AnnotatedTotalCount = AnnotatedTotalCount;
    }

    /**
     * Get 没有标注数据量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonAnnotatedTotalCount 没有标注数据量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNonAnnotatedTotalCount() {
        return this.NonAnnotatedTotalCount;
    }

    /**
     * Set 没有标注数据量
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonAnnotatedTotalCount 没有标注数据量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonAnnotatedTotalCount(Long NonAnnotatedTotalCount) {
        this.NonAnnotatedTotalCount = NonAnnotatedTotalCount;
    }

    /**
     * Get 过滤数据总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterTotalCount 过滤数据总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFilterTotalCount() {
        return this.FilterTotalCount;
    }

    /**
     * Set 过滤数据总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterTotalCount 过滤数据总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterTotalCount(Long FilterTotalCount) {
        this.FilterTotalCount = FilterTotalCount;
    }

    /**
     * Get 过滤数据详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterLabelList 过滤数据详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterLabelInfo [] getFilterLabelList() {
        return this.FilterLabelList;
    }

    /**
     * Set 过滤数据详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterLabelList 过滤数据详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterLabelList(FilterLabelInfo [] FilterLabelList) {
        this.FilterLabelList = FilterLabelList;
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

    public DescribeDatasetDetailUnstructuredResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasetDetailUnstructuredResponse(DescribeDatasetDetailUnstructuredResponse source) {
        if (source.AnnotatedTotalCount != null) {
            this.AnnotatedTotalCount = new Long(source.AnnotatedTotalCount);
        }
        if (source.NonAnnotatedTotalCount != null) {
            this.NonAnnotatedTotalCount = new Long(source.NonAnnotatedTotalCount);
        }
        if (source.FilterTotalCount != null) {
            this.FilterTotalCount = new Long(source.FilterTotalCount);
        }
        if (source.FilterLabelList != null) {
            this.FilterLabelList = new FilterLabelInfo[source.FilterLabelList.length];
            for (int i = 0; i < source.FilterLabelList.length; i++) {
                this.FilterLabelList[i] = new FilterLabelInfo(source.FilterLabelList[i]);
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
        this.setParamSimple(map, prefix + "AnnotatedTotalCount", this.AnnotatedTotalCount);
        this.setParamSimple(map, prefix + "NonAnnotatedTotalCount", this.NonAnnotatedTotalCount);
        this.setParamSimple(map, prefix + "FilterTotalCount", this.FilterTotalCount);
        this.setParamArrayObj(map, prefix + "FilterLabelList.", this.FilterLabelList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

