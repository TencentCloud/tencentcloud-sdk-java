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

public class DescribeInstanceDTSInfoResponse extends AbstractModel{

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
    * 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    private Long Offset;

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
     * Get DTS任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId DTS任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set DTS任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId DTS任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get DTS任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobName DTS任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set DTS任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobName DTS任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 同步时延，单位：字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 同步时延，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 同步时延，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 同步时延，单位：字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 断开时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CutDownTime 断开时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCutDownTime() {
        return this.CutDownTime;
    }

    /**
     * Set 断开时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CutDownTime 断开时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCutDownTime(String CutDownTime) {
        this.CutDownTime = CutDownTime;
    }

    /**
     * Get 源实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInstanceDTSInstanceInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcInfo(DescribeInstanceDTSInstanceInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstInfo 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeInstanceDTSInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstInfo 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstInfo(DescribeInstanceDTSInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
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

    /**
     * Internal implementation, normal users should not use it.
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

