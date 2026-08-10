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

public class DescribeVulScanTaskDetailResponse extends AbstractModel {

    /**
    * <p>任务详情列表</p>
    */
    @SerializedName("List")
    @Expose
    private VulScanTaskDetail [] List;

    /**
    * <p>总数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>漏洞数量</p>
    */
    @SerializedName("Vuls")
    @Expose
    private Long Vuls;

    /**
    * <p>扫描数量</p>
    */
    @SerializedName("Scanned")
    @Expose
    private Long Scanned;

    /**
    * <p>风险数量</p>
    */
    @SerializedName("Risk")
    @Expose
    private Long Risk;

    /**
    * <p>失败数量</p>
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * <p>扫描进度（0-100）</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>任务pdf报告地址</p>
    */
    @SerializedName("TaskPdf")
    @Expose
    private String TaskPdf;

    /**
    * <p>任务excel报告地址</p>
    */
    @SerializedName("TaskExcel")
    @Expose
    private String TaskExcel;

    /**
    * <p>任务开始时间，格式：2006-01-02T15:04:05+08:00</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>任务结束时间，格式：2006-01-02T15:04:05+08:00</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>漏洞ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long [] VulId;

    /**
    * <p>KB编号</p>
    */
    @SerializedName("KbNo")
    @Expose
    private String [] KbNo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务详情列表</p> 
     * @return List <p>任务详情列表</p>
     */
    public VulScanTaskDetail [] getList() {
        return this.List;
    }

    /**
     * Set <p>任务详情列表</p>
     * @param List <p>任务详情列表</p>
     */
    public void setList(VulScanTaskDetail [] List) {
        this.List = List;
    }

    /**
     * Get <p>总数</p> 
     * @return Total <p>总数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>总数</p>
     * @param Total <p>总数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>漏洞数量</p> 
     * @return Vuls <p>漏洞数量</p>
     */
    public Long getVuls() {
        return this.Vuls;
    }

    /**
     * Set <p>漏洞数量</p>
     * @param Vuls <p>漏洞数量</p>
     */
    public void setVuls(Long Vuls) {
        this.Vuls = Vuls;
    }

    /**
     * Get <p>扫描数量</p> 
     * @return Scanned <p>扫描数量</p>
     */
    public Long getScanned() {
        return this.Scanned;
    }

    /**
     * Set <p>扫描数量</p>
     * @param Scanned <p>扫描数量</p>
     */
    public void setScanned(Long Scanned) {
        this.Scanned = Scanned;
    }

    /**
     * Get <p>风险数量</p> 
     * @return Risk <p>风险数量</p>
     */
    public Long getRisk() {
        return this.Risk;
    }

    /**
     * Set <p>风险数量</p>
     * @param Risk <p>风险数量</p>
     */
    public void setRisk(Long Risk) {
        this.Risk = Risk;
    }

    /**
     * Get <p>失败数量</p> 
     * @return Failed <p>失败数量</p>
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set <p>失败数量</p>
     * @param Failed <p>失败数量</p>
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get <p>扫描进度（0-100）</p> 
     * @return Progress <p>扫描进度（0-100）</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>扫描进度（0-100）</p>
     * @param Progress <p>扫描进度（0-100）</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>任务pdf报告地址</p> 
     * @return TaskPdf <p>任务pdf报告地址</p>
     */
    public String getTaskPdf() {
        return this.TaskPdf;
    }

    /**
     * Set <p>任务pdf报告地址</p>
     * @param TaskPdf <p>任务pdf报告地址</p>
     */
    public void setTaskPdf(String TaskPdf) {
        this.TaskPdf = TaskPdf;
    }

    /**
     * Get <p>任务excel报告地址</p> 
     * @return TaskExcel <p>任务excel报告地址</p>
     */
    public String getTaskExcel() {
        return this.TaskExcel;
    }

    /**
     * Set <p>任务excel报告地址</p>
     * @param TaskExcel <p>任务excel报告地址</p>
     */
    public void setTaskExcel(String TaskExcel) {
        this.TaskExcel = TaskExcel;
    }

    /**
     * Get <p>任务开始时间，格式：2006-01-02T15:04:05+08:00</p> 
     * @return StartTime <p>任务开始时间，格式：2006-01-02T15:04:05+08:00</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始时间，格式：2006-01-02T15:04:05+08:00</p>
     * @param StartTime <p>任务开始时间，格式：2006-01-02T15:04:05+08:00</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务结束时间，格式：2006-01-02T15:04:05+08:00</p> 
     * @return EndTime <p>任务结束时间，格式：2006-01-02T15:04:05+08:00</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务结束时间，格式：2006-01-02T15:04:05+08:00</p>
     * @param EndTime <p>任务结束时间，格式：2006-01-02T15:04:05+08:00</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>漏洞ID</p> 
     * @return VulId <p>漏洞ID</p>
     */
    public Long [] getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>漏洞ID</p>
     * @param VulId <p>漏洞ID</p>
     */
    public void setVulId(Long [] VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>KB编号</p> 
     * @return KbNo <p>KB编号</p>
     */
    public String [] getKbNo() {
        return this.KbNo;
    }

    /**
     * Set <p>KB编号</p>
     * @param KbNo <p>KB编号</p>
     */
    public void setKbNo(String [] KbNo) {
        this.KbNo = KbNo;
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

    public DescribeVulScanTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulScanTaskDetailResponse(DescribeVulScanTaskDetailResponse source) {
        if (source.List != null) {
            this.List = new VulScanTaskDetail[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new VulScanTaskDetail(source.List[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Vuls != null) {
            this.Vuls = new Long(source.Vuls);
        }
        if (source.Scanned != null) {
            this.Scanned = new Long(source.Scanned);
        }
        if (source.Risk != null) {
            this.Risk = new Long(source.Risk);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.TaskPdf != null) {
            this.TaskPdf = new String(source.TaskPdf);
        }
        if (source.TaskExcel != null) {
            this.TaskExcel = new String(source.TaskExcel);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.VulId != null) {
            this.VulId = new Long[source.VulId.length];
            for (int i = 0; i < source.VulId.length; i++) {
                this.VulId[i] = new Long(source.VulId[i]);
            }
        }
        if (source.KbNo != null) {
            this.KbNo = new String[source.KbNo.length];
            for (int i = 0; i < source.KbNo.length; i++) {
                this.KbNo[i] = new String(source.KbNo[i]);
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
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Vuls", this.Vuls);
        this.setParamSimple(map, prefix + "Scanned", this.Scanned);
        this.setParamSimple(map, prefix + "Risk", this.Risk);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TaskPdf", this.TaskPdf);
        this.setParamSimple(map, prefix + "TaskExcel", this.TaskExcel);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "VulId.", this.VulId);
        this.setParamArraySimple(map, prefix + "KbNo.", this.KbNo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

