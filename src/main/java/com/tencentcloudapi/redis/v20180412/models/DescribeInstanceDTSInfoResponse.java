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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDTSInfoResponse extends AbstractModel {

    /**
    * DTS任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * DTS任务名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 同步时延，单位：字节
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 断开时间
    */
    @SerializedName("CutDownTime")
    @Expose
    private String CutDownTime;

    /**
    * 源实例信息
    */
    @SerializedName("SrcInfo")
    @Expose
    private DescribeInstanceDTSInstanceInfo SrcInfo;

    /**
    * 目标实例信息
    */
    @SerializedName("DstInfo")
    @Expose
    private DescribeInstanceDTSInstanceInfo DstInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DTS任务ID 
     * @return JobId DTS任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set DTS任务ID
     * @param JobId DTS任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get DTS任务名称 
     * @return JobName DTS任务名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set DTS任务名称
     * @param JobName DTS任务名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing） 
     * @return Status 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
     * @param Status 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 同步时延，单位：字节 
     * @return Offset 同步时延，单位：字节
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 同步时延，单位：字节
     * @param Offset 同步时延，单位：字节
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 断开时间 
     * @return CutDownTime 断开时间
     */
    public String getCutDownTime() {
        return this.CutDownTime;
    }

    /**
     * Set 断开时间
     * @param CutDownTime 断开时间
     */
    public void setCutDownTime(String CutDownTime) {
        this.CutDownTime = CutDownTime;
    }

    /**
     * Get 源实例信息 
     * @return SrcInfo 源实例信息
     */
    public DescribeInstanceDTSInstanceInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源实例信息
     * @param SrcInfo 源实例信息
     */
    public void setSrcInfo(DescribeInstanceDTSInstanceInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 目标实例信息 
     * @return DstInfo 目标实例信息
     */
    public DescribeInstanceDTSInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 目标实例信息
     * @param DstInfo 目标实例信息
     */
    public void setDstInfo(DescribeInstanceDTSInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
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

    public DescribeInstanceDTSInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceDTSInfoResponse(DescribeInstanceDTSInfoResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CutDownTime != null) {
            this.CutDownTime = new String(source.CutDownTime);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new DescribeInstanceDTSInstanceInfo(source.SrcInfo);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new DescribeInstanceDTSInstanceInfo(source.DstInfo);
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

