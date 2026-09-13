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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListWorkflowRunsRsp extends AbstractModel {

    /**
    * 当前页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总记录数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * 工作流运行列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private WorkflowRun [] Items;

    /**
    * 工作流运行状态数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizStateEnumInfos")
    @Expose
    private ScheduleBizEnumBrief [] BizStateEnumInfos;

    /**
    * 工作流运行错误码数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizErrorCodeEnumInfos")
    @Expose
    private ScheduleBizEnumBrief [] BizErrorCodeEnumInfos;

    /**
     * Get 当前页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber 当前页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber 当前页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 每页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 每页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPageNumber 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set 总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPageNumber 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get 工作流运行列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 工作流运行列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowRun [] getItems() {
        return this.Items;
    }

    /**
     * Set 工作流运行列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 工作流运行列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(WorkflowRun [] Items) {
        this.Items = Items;
    }

    /**
     * Get 工作流运行状态数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizStateEnumInfos 工作流运行状态数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleBizEnumBrief [] getBizStateEnumInfos() {
        return this.BizStateEnumInfos;
    }

    /**
     * Set 工作流运行状态数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizStateEnumInfos 工作流运行状态数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizStateEnumInfos(ScheduleBizEnumBrief [] BizStateEnumInfos) {
        this.BizStateEnumInfos = BizStateEnumInfos;
    }

    /**
     * Get 工作流运行错误码数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizErrorCodeEnumInfos 工作流运行错误码数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleBizEnumBrief [] getBizErrorCodeEnumInfos() {
        return this.BizErrorCodeEnumInfos;
    }

    /**
     * Set 工作流运行错误码数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizErrorCodeEnumInfos 工作流运行错误码数量统计。
统计口径为当前筛选条件下的全量数据，不受 PageNumber / PageSize 影响
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizErrorCodeEnumInfos(ScheduleBizEnumBrief [] BizErrorCodeEnumInfos) {
        this.BizErrorCodeEnumInfos = BizErrorCodeEnumInfos;
    }

    public ListWorkflowRunsRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowRunsRsp(ListWorkflowRunsRsp source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.Items != null) {
            this.Items = new WorkflowRun[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkflowRun(source.Items[i]);
            }
        }
        if (source.BizStateEnumInfos != null) {
            this.BizStateEnumInfos = new ScheduleBizEnumBrief[source.BizStateEnumInfos.length];
            for (int i = 0; i < source.BizStateEnumInfos.length; i++) {
                this.BizStateEnumInfos[i] = new ScheduleBizEnumBrief(source.BizStateEnumInfos[i]);
            }
        }
        if (source.BizErrorCodeEnumInfos != null) {
            this.BizErrorCodeEnumInfos = new ScheduleBizEnumBrief[source.BizErrorCodeEnumInfos.length];
            for (int i = 0; i < source.BizErrorCodeEnumInfos.length; i++) {
                this.BizErrorCodeEnumInfos[i] = new ScheduleBizEnumBrief(source.BizErrorCodeEnumInfos[i]);
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
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "BizStateEnumInfos.", this.BizStateEnumInfos);
        this.setParamArrayObj(map, prefix + "BizErrorCodeEnumInfos.", this.BizErrorCodeEnumInfos);

    }
}

