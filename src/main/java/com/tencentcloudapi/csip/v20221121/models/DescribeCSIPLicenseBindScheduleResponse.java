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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCSIPLicenseBindScheduleResponse extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>任务状态：INIT-初始化 / RUNNING-进行中 / DONE-已完成 / FAILED-已失败</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>进度百分比 0-100</p>
    */
    @SerializedName("Schedule")
    @Expose
    private Long Schedule;

    /**
    * <p>全部机器数（不受过滤影响）</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>成功数</p>
    */
    @SerializedName("SuccessNum")
    @Expose
    private Long SuccessNum;

    /**
    * <p>失败数</p>
    */
    @SerializedName("FailedNum")
    @Expose
    private Long FailedNum;

    /**
    * <p>失败明细（全量，含机器额外信息）</p>
    */
    @SerializedName("FailedList")
    @Expose
    private LicenseBindFailedItem [] FailedList;

    /**
    * <p>逐机器明细（受 Filters + 分页影响）</p>
    */
    @SerializedName("List")
    @Expose
    private LicenseBindScheduleItem [] List;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态：INIT-初始化 / RUNNING-进行中 / DONE-已完成 / FAILED-已失败</p> 
     * @return Status <p>任务状态：INIT-初始化 / RUNNING-进行中 / DONE-已完成 / FAILED-已失败</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态：INIT-初始化 / RUNNING-进行中 / DONE-已完成 / FAILED-已失败</p>
     * @param Status <p>任务状态：INIT-初始化 / RUNNING-进行中 / DONE-已完成 / FAILED-已失败</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>进度百分比 0-100</p> 
     * @return Schedule <p>进度百分比 0-100</p>
     */
    public Long getSchedule() {
        return this.Schedule;
    }

    /**
     * Set <p>进度百分比 0-100</p>
     * @param Schedule <p>进度百分比 0-100</p>
     */
    public void setSchedule(Long Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get <p>全部机器数（不受过滤影响）</p> 
     * @return Total <p>全部机器数（不受过滤影响）</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>全部机器数（不受过滤影响）</p>
     * @param Total <p>全部机器数（不受过滤影响）</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>成功数</p> 
     * @return SuccessNum <p>成功数</p>
     */
    public Long getSuccessNum() {
        return this.SuccessNum;
    }

    /**
     * Set <p>成功数</p>
     * @param SuccessNum <p>成功数</p>
     */
    public void setSuccessNum(Long SuccessNum) {
        this.SuccessNum = SuccessNum;
    }

    /**
     * Get <p>失败数</p> 
     * @return FailedNum <p>失败数</p>
     */
    public Long getFailedNum() {
        return this.FailedNum;
    }

    /**
     * Set <p>失败数</p>
     * @param FailedNum <p>失败数</p>
     */
    public void setFailedNum(Long FailedNum) {
        this.FailedNum = FailedNum;
    }

    /**
     * Get <p>失败明细（全量，含机器额外信息）</p> 
     * @return FailedList <p>失败明细（全量，含机器额外信息）</p>
     */
    public LicenseBindFailedItem [] getFailedList() {
        return this.FailedList;
    }

    /**
     * Set <p>失败明细（全量，含机器额外信息）</p>
     * @param FailedList <p>失败明细（全量，含机器额外信息）</p>
     */
    public void setFailedList(LicenseBindFailedItem [] FailedList) {
        this.FailedList = FailedList;
    }

    /**
     * Get <p>逐机器明细（受 Filters + 分页影响）</p> 
     * @return List <p>逐机器明细（受 Filters + 分页影响）</p>
     */
    public LicenseBindScheduleItem [] getList() {
        return this.List;
    }

    /**
     * Set <p>逐机器明细（受 Filters + 分页影响）</p>
     * @param List <p>逐机器明细（受 Filters + 分页影响）</p>
     */
    public void setList(LicenseBindScheduleItem [] List) {
        this.List = List;
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

    public DescribeCSIPLicenseBindScheduleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCSIPLicenseBindScheduleResponse(DescribeCSIPLicenseBindScheduleResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Schedule != null) {
            this.Schedule = new Long(source.Schedule);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.SuccessNum != null) {
            this.SuccessNum = new Long(source.SuccessNum);
        }
        if (source.FailedNum != null) {
            this.FailedNum = new Long(source.FailedNum);
        }
        if (source.FailedList != null) {
            this.FailedList = new LicenseBindFailedItem[source.FailedList.length];
            for (int i = 0; i < source.FailedList.length; i++) {
                this.FailedList[i] = new LicenseBindFailedItem(source.FailedList[i]);
            }
        }
        if (source.List != null) {
            this.List = new LicenseBindScheduleItem[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new LicenseBindScheduleItem(source.List[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "SuccessNum", this.SuccessNum);
        this.setParamSimple(map, prefix + "FailedNum", this.FailedNum);
        this.setParamArrayObj(map, prefix + "FailedList.", this.FailedList);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

