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

public class InnerWorkflowTaskRun extends AbstractModel {

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
    * 迭代运行列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private InnerWorkflowTaskRunIteration [] Items;

    /**
    * 迭代次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IterationCount")
    @Expose
    private Long IterationCount;

    /**
    * 失败次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureCount")
    @Expose
    private Long FailureCount;

    /**
    * 成功次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 内嵌工作流ID，可通过 ListWorkflows 获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerWorkflowId")
    @Expose
    private String InnerWorkflowId;

    /**
    * 内嵌任务ID，可通过 ListWorkflowTasks 获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerTaskId")
    @Expose
    private String InnerTaskId;

    /**
    * 内嵌任务运行状态数量统计（实例业务枚举键值对列表）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerTaskRunBizEnumInfos")
    @Expose
    private ScheduleBizEnumBrief [] InnerTaskRunBizEnumInfos;

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
     * Get 迭代运行列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 迭代运行列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InnerWorkflowTaskRunIteration [] getItems() {
        return this.Items;
    }

    /**
     * Set 迭代运行列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 迭代运行列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(InnerWorkflowTaskRunIteration [] Items) {
        this.Items = Items;
    }

    /**
     * Get 迭代次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IterationCount 迭代次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIterationCount() {
        return this.IterationCount;
    }

    /**
     * Set 迭代次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IterationCount 迭代次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIterationCount(Long IterationCount) {
        this.IterationCount = IterationCount;
    }

    /**
     * Get 失败次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureCount 失败次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailureCount() {
        return this.FailureCount;
    }

    /**
     * Set 失败次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureCount 失败次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureCount(Long FailureCount) {
        this.FailureCount = FailureCount;
    }

    /**
     * Get 成功次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCount 成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCount 成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 内嵌工作流ID，可通过 ListWorkflows 获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerWorkflowId 内嵌工作流ID，可通过 ListWorkflows 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInnerWorkflowId() {
        return this.InnerWorkflowId;
    }

    /**
     * Set 内嵌工作流ID，可通过 ListWorkflows 获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerWorkflowId 内嵌工作流ID，可通过 ListWorkflows 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerWorkflowId(String InnerWorkflowId) {
        this.InnerWorkflowId = InnerWorkflowId;
    }

    /**
     * Get 内嵌任务ID，可通过 ListWorkflowTasks 获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerTaskId 内嵌任务ID，可通过 ListWorkflowTasks 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInnerTaskId() {
        return this.InnerTaskId;
    }

    /**
     * Set 内嵌任务ID，可通过 ListWorkflowTasks 获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerTaskId 内嵌任务ID，可通过 ListWorkflowTasks 获取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerTaskId(String InnerTaskId) {
        this.InnerTaskId = InnerTaskId;
    }

    /**
     * Get 内嵌任务运行状态数量统计（实例业务枚举键值对列表）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerTaskRunBizEnumInfos 内嵌任务运行状态数量统计（实例业务枚举键值对列表）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleBizEnumBrief [] getInnerTaskRunBizEnumInfos() {
        return this.InnerTaskRunBizEnumInfos;
    }

    /**
     * Set 内嵌任务运行状态数量统计（实例业务枚举键值对列表）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerTaskRunBizEnumInfos 内嵌任务运行状态数量统计（实例业务枚举键值对列表）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerTaskRunBizEnumInfos(ScheduleBizEnumBrief [] InnerTaskRunBizEnumInfos) {
        this.InnerTaskRunBizEnumInfos = InnerTaskRunBizEnumInfos;
    }

    public InnerWorkflowTaskRun() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InnerWorkflowTaskRun(InnerWorkflowTaskRun source) {
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
            this.Items = new InnerWorkflowTaskRunIteration[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new InnerWorkflowTaskRunIteration(source.Items[i]);
            }
        }
        if (source.IterationCount != null) {
            this.IterationCount = new Long(source.IterationCount);
        }
        if (source.FailureCount != null) {
            this.FailureCount = new Long(source.FailureCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.InnerWorkflowId != null) {
            this.InnerWorkflowId = new String(source.InnerWorkflowId);
        }
        if (source.InnerTaskId != null) {
            this.InnerTaskId = new String(source.InnerTaskId);
        }
        if (source.InnerTaskRunBizEnumInfos != null) {
            this.InnerTaskRunBizEnumInfos = new ScheduleBizEnumBrief[source.InnerTaskRunBizEnumInfos.length];
            for (int i = 0; i < source.InnerTaskRunBizEnumInfos.length; i++) {
                this.InnerTaskRunBizEnumInfos[i] = new ScheduleBizEnumBrief(source.InnerTaskRunBizEnumInfos[i]);
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
        this.setParamSimple(map, prefix + "IterationCount", this.IterationCount);
        this.setParamSimple(map, prefix + "FailureCount", this.FailureCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "InnerWorkflowId", this.InnerWorkflowId);
        this.setParamSimple(map, prefix + "InnerTaskId", this.InnerTaskId);
        this.setParamArrayObj(map, prefix + "InnerTaskRunBizEnumInfos.", this.InnerTaskRunBizEnumInfos);

    }
}

