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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceTaskPolicyItemSummaryListResponse extends AbstractModel{

    /**
    * 返回最近一次合规检查任务的ID。这个任务为本次所展示数据的来源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 返回检测项的总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 返回各检测项对应的汇总信息的列表。
    */
    @SerializedName("PolicyItemSummaryList")
    @Expose
    private CompliancePolicyItemSummary [] PolicyItemSummaryList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回最近一次合规检查任务的ID。这个任务为本次所展示数据的来源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 返回最近一次合规检查任务的ID。这个任务为本次所展示数据的来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 返回最近一次合规检查任务的ID。这个任务为本次所展示数据的来源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 返回最近一次合规检查任务的ID。这个任务为本次所展示数据的来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 返回检测项的总数。 
     * @return TotalCount 返回检测项的总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回检测项的总数。
     * @param TotalCount 返回检测项的总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 返回各检测项对应的汇总信息的列表。 
     * @return PolicyItemSummaryList 返回各检测项对应的汇总信息的列表。
     */
    public CompliancePolicyItemSummary [] getPolicyItemSummaryList() {
        return this.PolicyItemSummaryList;
    }

    /**
     * Set 返回各检测项对应的汇总信息的列表。
     * @param PolicyItemSummaryList 返回各检测项对应的汇总信息的列表。
     */
    public void setPolicyItemSummaryList(CompliancePolicyItemSummary [] PolicyItemSummaryList) {
        this.PolicyItemSummaryList = PolicyItemSummaryList;
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

    public DescribeComplianceTaskPolicyItemSummaryListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceTaskPolicyItemSummaryListResponse(DescribeComplianceTaskPolicyItemSummaryListResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PolicyItemSummaryList != null) {
            this.PolicyItemSummaryList = new CompliancePolicyItemSummary[source.PolicyItemSummaryList.length];
            for (int i = 0; i < source.PolicyItemSummaryList.length; i++) {
                this.PolicyItemSummaryList[i] = new CompliancePolicyItemSummary(source.PolicyItemSummaryList[i]);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "PolicyItemSummaryList.", this.PolicyItemSummaryList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

