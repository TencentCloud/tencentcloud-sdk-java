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

public class DescribeVirusScanTaskStatusResponse extends AbstractModel{

    /**
    * 查杀容器个数
    */
    @SerializedName("ContainerTotal")
    @Expose
    private Long ContainerTotal;

    /**
    * 风险容器个数
    */
    @SerializedName("RiskContainerCnt")
    @Expose
    private Long RiskContainerCnt;

    /**
    * 扫描状态 任务状态:
SCAN_NONE:无， 
SCAN_SCANNING:正在扫描中，
SCAN_FINISH：扫描完成， 
SCAN_TIMEOUT：扫描超时
SCAN_CANCELING: 取消中
SCAN_CANCELED:已取消
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 扫描进度 I
    */
    @SerializedName("Schedule")
    @Expose
    private Long Schedule;

    /**
    * 已经扫描了的容器个数
    */
    @SerializedName("ContainerScanCnt")
    @Expose
    private Long ContainerScanCnt;

    /**
    * 风险个数
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * 剩余扫描时间
    */
    @SerializedName("LeftSeconds")
    @Expose
    private Long LeftSeconds;

    /**
    * 扫描开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 扫描结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 扫描类型，"CYCLE"：周期扫描， "MANUAL"：手动扫描
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查杀容器个数 
     * @return ContainerTotal 查杀容器个数
     */
    public Long getContainerTotal() {
        return this.ContainerTotal;
    }

    /**
     * Set 查杀容器个数
     * @param ContainerTotal 查杀容器个数
     */
    public void setContainerTotal(Long ContainerTotal) {
        this.ContainerTotal = ContainerTotal;
    }

    /**
     * Get 风险容器个数 
     * @return RiskContainerCnt 风险容器个数
     */
    public Long getRiskContainerCnt() {
        return this.RiskContainerCnt;
    }

    /**
     * Set 风险容器个数
     * @param RiskContainerCnt 风险容器个数
     */
    public void setRiskContainerCnt(Long RiskContainerCnt) {
        this.RiskContainerCnt = RiskContainerCnt;
    }

    /**
     * Get 扫描状态 任务状态:
SCAN_NONE:无， 
SCAN_SCANNING:正在扫描中，
SCAN_FINISH：扫描完成， 
SCAN_TIMEOUT：扫描超时
SCAN_CANCELING: 取消中
SCAN_CANCELED:已取消 
     * @return Status 扫描状态 任务状态:
SCAN_NONE:无， 
SCAN_SCANNING:正在扫描中，
SCAN_FINISH：扫描完成， 
SCAN_TIMEOUT：扫描超时
SCAN_CANCELING: 取消中
SCAN_CANCELED:已取消
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 扫描状态 任务状态:
SCAN_NONE:无， 
SCAN_SCANNING:正在扫描中，
SCAN_FINISH：扫描完成， 
SCAN_TIMEOUT：扫描超时
SCAN_CANCELING: 取消中
SCAN_CANCELED:已取消
     * @param Status 扫描状态 任务状态:
SCAN_NONE:无， 
SCAN_SCANNING:正在扫描中，
SCAN_FINISH：扫描完成， 
SCAN_TIMEOUT：扫描超时
SCAN_CANCELING: 取消中
SCAN_CANCELED:已取消
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 扫描进度 I 
     * @return Schedule 扫描进度 I
     */
    public Long getSchedule() {
        return this.Schedule;
    }

    /**
     * Set 扫描进度 I
     * @param Schedule 扫描进度 I
     */
    public void setSchedule(Long Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get 已经扫描了的容器个数 
     * @return ContainerScanCnt 已经扫描了的容器个数
     */
    public Long getContainerScanCnt() {
        return this.ContainerScanCnt;
    }

    /**
     * Set 已经扫描了的容器个数
     * @param ContainerScanCnt 已经扫描了的容器个数
     */
    public void setContainerScanCnt(Long ContainerScanCnt) {
        this.ContainerScanCnt = ContainerScanCnt;
    }

    /**
     * Get 风险个数 
     * @return RiskCnt 风险个数
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set 风险个数
     * @param RiskCnt 风险个数
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get 剩余扫描时间 
     * @return LeftSeconds 剩余扫描时间
     */
    public Long getLeftSeconds() {
        return this.LeftSeconds;
    }

    /**
     * Set 剩余扫描时间
     * @param LeftSeconds 剩余扫描时间
     */
    public void setLeftSeconds(Long LeftSeconds) {
        this.LeftSeconds = LeftSeconds;
    }

    /**
     * Get 扫描开始时间 
     * @return StartTime 扫描开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 扫描开始时间
     * @param StartTime 扫描开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 扫描结束时间 
     * @return EndTime 扫描结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 扫描结束时间
     * @param EndTime 扫描结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 扫描类型，"CYCLE"：周期扫描， "MANUAL"：手动扫描 
     * @return ScanType 扫描类型，"CYCLE"：周期扫描， "MANUAL"：手动扫描
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set 扫描类型，"CYCLE"：周期扫描， "MANUAL"：手动扫描
     * @param ScanType 扫描类型，"CYCLE"：周期扫描， "MANUAL"：手动扫描
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
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

    public DescribeVirusScanTaskStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusScanTaskStatusResponse(DescribeVirusScanTaskStatusResponse source) {
        if (source.ContainerTotal != null) {
            this.ContainerTotal = new Long(source.ContainerTotal);
        }
        if (source.RiskContainerCnt != null) {
            this.RiskContainerCnt = new Long(source.RiskContainerCnt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Schedule != null) {
            this.Schedule = new Long(source.Schedule);
        }
        if (source.ContainerScanCnt != null) {
            this.ContainerScanCnt = new Long(source.ContainerScanCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.LeftSeconds != null) {
            this.LeftSeconds = new Long(source.LeftSeconds);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerTotal", this.ContainerTotal);
        this.setParamSimple(map, prefix + "RiskContainerCnt", this.RiskContainerCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "ContainerScanCnt", this.ContainerScanCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "LeftSeconds", this.LeftSeconds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

