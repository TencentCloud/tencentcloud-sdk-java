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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDTSInfoResponse  extends AbstractModel{

    /**
    * DTS任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * DTS任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 同步时延，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 断开时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CutDownTime")
    @Expose
    private String CutDownTime;

    /**
    * 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcInfo")
    @Expose
    private DescribeInstanceDTSInstanceInfo SrcInfo;

    /**
    * 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstInfo")
    @Expose
    private DescribeInstanceDTSInstanceInfo DstInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取DTS任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return JobId DTS任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * 设置DTS任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId DTS任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * 获取DTS任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return JobName DTS任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * 设置DTS任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobName DTS任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * 获取状态
注意：此字段可能返回 null，表示取不到有效值。
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @return StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * 设置状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * 获取同步时延，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     * @return Offset 同步时延，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置同步时延，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 同步时延，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取断开时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return CutDownTime 断开时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCutDownTime() {
        return this.CutDownTime;
    }

    /**
     * 设置断开时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CutDownTime 断开时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCutDownTime(String CutDownTime) {
        this.CutDownTime = CutDownTime;
    }

    /**
     * 获取源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return SrcInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInstanceDTSInstanceInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * 设置源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcInfo(DescribeInstanceDTSInstanceInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * 获取目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return DstInfo 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInstanceDTSInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * 设置目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstInfo 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstInfo(DescribeInstanceDTSInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CutDownTime", this.CutDownTime);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

