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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListBatchDetailResponse extends AbstractModel {

    /**
    * 批量操作ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 运行类型：
ASYNC-异步
SYNC-同步
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunType")
    @Expose
    private String RunType;

    /**
    * 成功列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessResource")
    @Expose
    private AsyncResourceVO [] SuccessResource;

    /**
    * 失败列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailResource")
    @Expose
    private AsyncResourceVO [] FailResource;

    /**
    * job类型
BATCH_DELETE --批量删除：1、任务名称：ResourceName
BATCH_CREATE_VERSION --批量提交：1、任务名称：ResourceId 2、资源组：GroupId
BATCH_MODIFY_DATASOURCE --批量修改数据源：1、任务名称：ResourceName
BATCH_MODIFY_INCHARGE --批量修改责任人：1、任务名称：ResourceName
BATCH_MODIFY_PARAMETER --批量修改参数：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE --批量修改调度计划：1、任务名称：ResourceName
BATCH_MODIFY_GROUPID --批量修改资源组：1、任务名称：ResourceName
BATCH_MODIFY_CONFIG --批量修改高级配置：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE_PARAMETER --批量修改调度参数：1、任务名称：ResourceName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * job状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * 资源总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalResource")
    @Expose
    private Long TotalResource;

    /**
    * 批量提交是是否需要审批，其他的批量操作默认为null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedApprove")
    @Expose
    private Boolean NeedApprove;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批量操作ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 批量操作ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 批量操作ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 批量操作ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 运行类型：
ASYNC-异步
SYNC-同步
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunType 运行类型：
ASYNC-异步
SYNC-同步
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunType() {
        return this.RunType;
    }

    /**
     * Set 运行类型：
ASYNC-异步
SYNC-同步
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunType 运行类型：
ASYNC-异步
SYNC-同步
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunType(String RunType) {
        this.RunType = RunType;
    }

    /**
     * Get 成功列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessResource 成功列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsyncResourceVO [] getSuccessResource() {
        return this.SuccessResource;
    }

    /**
     * Set 成功列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessResource 成功列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessResource(AsyncResourceVO [] SuccessResource) {
        this.SuccessResource = SuccessResource;
    }

    /**
     * Get 失败列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailResource 失败列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsyncResourceVO [] getFailResource() {
        return this.FailResource;
    }

    /**
     * Set 失败列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailResource 失败列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailResource(AsyncResourceVO [] FailResource) {
        this.FailResource = FailResource;
    }

    /**
     * Get job类型
BATCH_DELETE --批量删除：1、任务名称：ResourceName
BATCH_CREATE_VERSION --批量提交：1、任务名称：ResourceId 2、资源组：GroupId
BATCH_MODIFY_DATASOURCE --批量修改数据源：1、任务名称：ResourceName
BATCH_MODIFY_INCHARGE --批量修改责任人：1、任务名称：ResourceName
BATCH_MODIFY_PARAMETER --批量修改参数：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE --批量修改调度计划：1、任务名称：ResourceName
BATCH_MODIFY_GROUPID --批量修改资源组：1、任务名称：ResourceName
BATCH_MODIFY_CONFIG --批量修改高级配置：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE_PARAMETER --批量修改调度参数：1、任务名称：ResourceName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobType job类型
BATCH_DELETE --批量删除：1、任务名称：ResourceName
BATCH_CREATE_VERSION --批量提交：1、任务名称：ResourceId 2、资源组：GroupId
BATCH_MODIFY_DATASOURCE --批量修改数据源：1、任务名称：ResourceName
BATCH_MODIFY_INCHARGE --批量修改责任人：1、任务名称：ResourceName
BATCH_MODIFY_PARAMETER --批量修改参数：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE --批量修改调度计划：1、任务名称：ResourceName
BATCH_MODIFY_GROUPID --批量修改资源组：1、任务名称：ResourceName
BATCH_MODIFY_CONFIG --批量修改高级配置：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE_PARAMETER --批量修改调度参数：1、任务名称：ResourceName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set job类型
BATCH_DELETE --批量删除：1、任务名称：ResourceName
BATCH_CREATE_VERSION --批量提交：1、任务名称：ResourceId 2、资源组：GroupId
BATCH_MODIFY_DATASOURCE --批量修改数据源：1、任务名称：ResourceName
BATCH_MODIFY_INCHARGE --批量修改责任人：1、任务名称：ResourceName
BATCH_MODIFY_PARAMETER --批量修改参数：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE --批量修改调度计划：1、任务名称：ResourceName
BATCH_MODIFY_GROUPID --批量修改资源组：1、任务名称：ResourceName
BATCH_MODIFY_CONFIG --批量修改高级配置：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE_PARAMETER --批量修改调度参数：1、任务名称：ResourceName
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobType job类型
BATCH_DELETE --批量删除：1、任务名称：ResourceName
BATCH_CREATE_VERSION --批量提交：1、任务名称：ResourceId 2、资源组：GroupId
BATCH_MODIFY_DATASOURCE --批量修改数据源：1、任务名称：ResourceName
BATCH_MODIFY_INCHARGE --批量修改责任人：1、任务名称：ResourceName
BATCH_MODIFY_PARAMETER --批量修改参数：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE --批量修改调度计划：1、任务名称：ResourceName
BATCH_MODIFY_GROUPID --批量修改资源组：1、任务名称：ResourceName
BATCH_MODIFY_CONFIG --批量修改高级配置：1、任务名称：ResourceName
BATCH_MODIFY_SCHEDULE_PARAMETER --批量修改调度参数：1、任务名称：ResourceName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get job状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobStatus job状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set job状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobStatus job状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get 资源总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalResource 资源总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalResource() {
        return this.TotalResource;
    }

    /**
     * Set 资源总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalResource 资源总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalResource(Long TotalResource) {
        this.TotalResource = TotalResource;
    }

    /**
     * Get 批量提交是是否需要审批，其他的批量操作默认为null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedApprove 批量提交是是否需要审批，其他的批量操作默认为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNeedApprove() {
        return this.NeedApprove;
    }

    /**
     * Set 批量提交是是否需要审批，其他的批量操作默认为null
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedApprove 批量提交是是否需要审批，其他的批量操作默认为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeedApprove(Boolean NeedApprove) {
        this.NeedApprove = NeedApprove;
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

    public ListBatchDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListBatchDetailResponse(ListBatchDetailResponse source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.RunType != null) {
            this.RunType = new String(source.RunType);
        }
        if (source.SuccessResource != null) {
            this.SuccessResource = new AsyncResourceVO[source.SuccessResource.length];
            for (int i = 0; i < source.SuccessResource.length; i++) {
                this.SuccessResource[i] = new AsyncResourceVO(source.SuccessResource[i]);
            }
        }
        if (source.FailResource != null) {
            this.FailResource = new AsyncResourceVO[source.FailResource.length];
            for (int i = 0; i < source.FailResource.length; i++) {
                this.FailResource[i] = new AsyncResourceVO(source.FailResource[i]);
            }
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.TotalResource != null) {
            this.TotalResource = new Long(source.TotalResource);
        }
        if (source.NeedApprove != null) {
            this.NeedApprove = new Boolean(source.NeedApprove);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamArrayObj(map, prefix + "SuccessResource.", this.SuccessResource);
        this.setParamArrayObj(map, prefix + "FailResource.", this.FailResource);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamSimple(map, prefix + "TotalResource", this.TotalResource);
        this.setParamSimple(map, prefix + "NeedApprove", this.NeedApprove);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

