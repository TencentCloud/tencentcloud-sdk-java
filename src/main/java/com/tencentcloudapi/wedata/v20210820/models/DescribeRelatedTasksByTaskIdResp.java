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

public class DescribeRelatedTasksByTaskIdResp extends AbstractModel {

    /**
    * 页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 单页大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 任务直接关联的上下游任务列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedTaskList")
    @Expose
    private RelatedTask [] RelatedTaskList;

    /**
     * Get 页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber 页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber 页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 单页大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 单页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 单页大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 单页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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

    /**
     * Get 任务直接关联的上下游任务列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedTaskList 任务直接关联的上下游任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RelatedTask [] getRelatedTaskList() {
        return this.RelatedTaskList;
    }

    /**
     * Set 任务直接关联的上下游任务列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedTaskList 任务直接关联的上下游任务列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedTaskList(RelatedTask [] RelatedTaskList) {
        this.RelatedTaskList = RelatedTaskList;
    }

    public DescribeRelatedTasksByTaskIdResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelatedTasksByTaskIdResp(DescribeRelatedTasksByTaskIdResp source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RelatedTaskList != null) {
            this.RelatedTaskList = new RelatedTask[source.RelatedTaskList.length];
            for (int i = 0; i < source.RelatedTaskList.length; i++) {
                this.RelatedTaskList[i] = new RelatedTask(source.RelatedTaskList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RelatedTaskList.", this.RelatedTaskList);

    }
}

