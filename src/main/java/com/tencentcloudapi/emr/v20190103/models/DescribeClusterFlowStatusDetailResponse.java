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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterFlowStatusDetailResponse extends AbstractModel {

    /**
    * 任务步骤详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StageDetails")
    @Expose
    private StageInfoDetail [] StageDetails;

    /**
    * 任务参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowDesc")
    @Expose
    private FlowParamsDesc [] FlowDesc;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 总任务流程进度：
例如：0.8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowTotalProgress")
    @Expose
    private Float FlowTotalProgress;

    /**
    * 定义流程总状态：
0:初始化，
1:运行中，
2:完成，
3:完成（存在跳过步骤），
-1:失败，
-3:阻塞，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowTotalStatus")
    @Expose
    private Long FlowTotalStatus;

    /**
    * 流程额外信息
NeedExtraDetail为true时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowExtraDetail")
    @Expose
    private FlowExtraDetail [] FlowExtraDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务步骤详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StageDetails 任务步骤详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StageInfoDetail [] getStageDetails() {
        return this.StageDetails;
    }

    /**
     * Set 任务步骤详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param StageDetails 任务步骤详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStageDetails(StageInfoDetail [] StageDetails) {
        this.StageDetails = StageDetails;
    }

    /**
     * Get 任务参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowDesc 任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlowParamsDesc [] getFlowDesc() {
        return this.FlowDesc;
    }

    /**
     * Set 任务参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowDesc 任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowDesc(FlowParamsDesc [] FlowDesc) {
        this.FlowDesc = FlowDesc;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 总任务流程进度：
例如：0.8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowTotalProgress 总任务流程进度：
例如：0.8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFlowTotalProgress() {
        return this.FlowTotalProgress;
    }

    /**
     * Set 总任务流程进度：
例如：0.8
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowTotalProgress 总任务流程进度：
例如：0.8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowTotalProgress(Float FlowTotalProgress) {
        this.FlowTotalProgress = FlowTotalProgress;
    }

    /**
     * Get 定义流程总状态：
0:初始化，
1:运行中，
2:完成，
3:完成（存在跳过步骤），
-1:失败，
-3:阻塞，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowTotalStatus 定义流程总状态：
0:初始化，
1:运行中，
2:完成，
3:完成（存在跳过步骤），
-1:失败，
-3:阻塞，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowTotalStatus() {
        return this.FlowTotalStatus;
    }

    /**
     * Set 定义流程总状态：
0:初始化，
1:运行中，
2:完成，
3:完成（存在跳过步骤），
-1:失败，
-3:阻塞，
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowTotalStatus 定义流程总状态：
0:初始化，
1:运行中，
2:完成，
3:完成（存在跳过步骤），
-1:失败，
-3:阻塞，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowTotalStatus(Long FlowTotalStatus) {
        this.FlowTotalStatus = FlowTotalStatus;
    }

    /**
     * Get 流程额外信息
NeedExtraDetail为true时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowExtraDetail 流程额外信息
NeedExtraDetail为true时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlowExtraDetail [] getFlowExtraDetail() {
        return this.FlowExtraDetail;
    }

    /**
     * Set 流程额外信息
NeedExtraDetail为true时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowExtraDetail 流程额外信息
NeedExtraDetail为true时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowExtraDetail(FlowExtraDetail [] FlowExtraDetail) {
        this.FlowExtraDetail = FlowExtraDetail;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterFlowStatusDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterFlowStatusDetailResponse(DescribeClusterFlowStatusDetailResponse source) {
        if (source.StageDetails != null) {
            this.StageDetails = new StageInfoDetail[source.StageDetails.length];
            for (int i = 0; i < source.StageDetails.length; i++) {
                this.StageDetails[i] = new StageInfoDetail(source.StageDetails[i]);
            }
        }
        if (source.FlowDesc != null) {
            this.FlowDesc = new FlowParamsDesc[source.FlowDesc.length];
            for (int i = 0; i < source.FlowDesc.length; i++) {
                this.FlowDesc[i] = new FlowParamsDesc(source.FlowDesc[i]);
            }
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowTotalProgress != null) {
            this.FlowTotalProgress = new Float(source.FlowTotalProgress);
        }
        if (source.FlowTotalStatus != null) {
            this.FlowTotalStatus = new Long(source.FlowTotalStatus);
        }
        if (source.FlowExtraDetail != null) {
            this.FlowExtraDetail = new FlowExtraDetail[source.FlowExtraDetail.length];
            for (int i = 0; i < source.FlowExtraDetail.length; i++) {
                this.FlowExtraDetail[i] = new FlowExtraDetail(source.FlowExtraDetail[i]);
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
        this.setParamArrayObj(map, prefix + "StageDetails.", this.StageDetails);
        this.setParamArrayObj(map, prefix + "FlowDesc.", this.FlowDesc);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowTotalProgress", this.FlowTotalProgress);
        this.setParamSimple(map, prefix + "FlowTotalStatus", this.FlowTotalStatus);
        this.setParamArrayObj(map, prefix + "FlowExtraDetail.", this.FlowExtraDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

