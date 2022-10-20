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

public class DescribeVulScanInfoResponse extends AbstractModel{

    /**
    * 本次扫描的本地镜像总数
    */
    @SerializedName("LocalImageScanCount")
    @Expose
    private Long LocalImageScanCount;

    /**
    * 忽略的漏洞数量
    */
    @SerializedName("IgnoreVulCount")
    @Expose
    private Long IgnoreVulCount;

    /**
    * 漏洞扫描的开始时间
    */
    @SerializedName("ScanStartTime")
    @Expose
    private String ScanStartTime;

    /**
    * 漏洞扫描的结束时间
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * 发现风险镜像数量
    */
    @SerializedName("FoundRiskImageCount")
    @Expose
    private Long FoundRiskImageCount;

    /**
    * 本地发现漏洞数量
    */
    @SerializedName("FoundVulCount")
    @Expose
    private Long FoundVulCount;

    /**
    * 扫描进度
    */
    @SerializedName("ScanProgress")
    @Expose
    private Float ScanProgress;

    /**
    * 本次扫描的仓库镜像总数
    */
    @SerializedName("RegistryImageScanCount")
    @Expose
    private Long RegistryImageScanCount;

    /**
    * 本地镜像最近一次的漏洞任务扫描ID
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * 扫描状态:NOT_SCAN:未扫描，SCANNING:扫描中,SCANNED:完成，CANCELED：扫描停止
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 剩余时间，秒
    */
    @SerializedName("RemainingTime")
    @Expose
    private Float RemainingTime;

    /**
    * 仓库镜像最近一次的漏洞任务扫描ID
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
    * 仓库发现漏洞数量
    */
    @SerializedName("RegistryFoundVulCount")
    @Expose
    private Long RegistryFoundVulCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本次扫描的本地镜像总数 
     * @return LocalImageScanCount 本次扫描的本地镜像总数
     */
    public Long getLocalImageScanCount() {
        return this.LocalImageScanCount;
    }

    /**
     * Set 本次扫描的本地镜像总数
     * @param LocalImageScanCount 本次扫描的本地镜像总数
     */
    public void setLocalImageScanCount(Long LocalImageScanCount) {
        this.LocalImageScanCount = LocalImageScanCount;
    }

    /**
     * Get 忽略的漏洞数量 
     * @return IgnoreVulCount 忽略的漏洞数量
     */
    public Long getIgnoreVulCount() {
        return this.IgnoreVulCount;
    }

    /**
     * Set 忽略的漏洞数量
     * @param IgnoreVulCount 忽略的漏洞数量
     */
    public void setIgnoreVulCount(Long IgnoreVulCount) {
        this.IgnoreVulCount = IgnoreVulCount;
    }

    /**
     * Get 漏洞扫描的开始时间 
     * @return ScanStartTime 漏洞扫描的开始时间
     */
    public String getScanStartTime() {
        return this.ScanStartTime;
    }

    /**
     * Set 漏洞扫描的开始时间
     * @param ScanStartTime 漏洞扫描的开始时间
     */
    public void setScanStartTime(String ScanStartTime) {
        this.ScanStartTime = ScanStartTime;
    }

    /**
     * Get 漏洞扫描的结束时间 
     * @return ScanEndTime 漏洞扫描的结束时间
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set 漏洞扫描的结束时间
     * @param ScanEndTime 漏洞扫描的结束时间
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get 发现风险镜像数量 
     * @return FoundRiskImageCount 发现风险镜像数量
     */
    public Long getFoundRiskImageCount() {
        return this.FoundRiskImageCount;
    }

    /**
     * Set 发现风险镜像数量
     * @param FoundRiskImageCount 发现风险镜像数量
     */
    public void setFoundRiskImageCount(Long FoundRiskImageCount) {
        this.FoundRiskImageCount = FoundRiskImageCount;
    }

    /**
     * Get 本地发现漏洞数量 
     * @return FoundVulCount 本地发现漏洞数量
     */
    public Long getFoundVulCount() {
        return this.FoundVulCount;
    }

    /**
     * Set 本地发现漏洞数量
     * @param FoundVulCount 本地发现漏洞数量
     */
    public void setFoundVulCount(Long FoundVulCount) {
        this.FoundVulCount = FoundVulCount;
    }

    /**
     * Get 扫描进度 
     * @return ScanProgress 扫描进度
     */
    public Float getScanProgress() {
        return this.ScanProgress;
    }

    /**
     * Set 扫描进度
     * @param ScanProgress 扫描进度
     */
    public void setScanProgress(Float ScanProgress) {
        this.ScanProgress = ScanProgress;
    }

    /**
     * Get 本次扫描的仓库镜像总数 
     * @return RegistryImageScanCount 本次扫描的仓库镜像总数
     */
    public Long getRegistryImageScanCount() {
        return this.RegistryImageScanCount;
    }

    /**
     * Set 本次扫描的仓库镜像总数
     * @param RegistryImageScanCount 本次扫描的仓库镜像总数
     */
    public void setRegistryImageScanCount(Long RegistryImageScanCount) {
        this.RegistryImageScanCount = RegistryImageScanCount;
    }

    /**
     * Get 本地镜像最近一次的漏洞任务扫描ID 
     * @return LocalTaskID 本地镜像最近一次的漏洞任务扫描ID
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set 本地镜像最近一次的漏洞任务扫描ID
     * @param LocalTaskID 本地镜像最近一次的漏洞任务扫描ID
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get 扫描状态:NOT_SCAN:未扫描，SCANNING:扫描中,SCANNED:完成，CANCELED：扫描停止 
     * @return Status 扫描状态:NOT_SCAN:未扫描，SCANNING:扫描中,SCANNED:完成，CANCELED：扫描停止
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 扫描状态:NOT_SCAN:未扫描，SCANNING:扫描中,SCANNED:完成，CANCELED：扫描停止
     * @param Status 扫描状态:NOT_SCAN:未扫描，SCANNING:扫描中,SCANNED:完成，CANCELED：扫描停止
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 剩余时间，秒 
     * @return RemainingTime 剩余时间，秒
     */
    public Float getRemainingTime() {
        return this.RemainingTime;
    }

    /**
     * Set 剩余时间，秒
     * @param RemainingTime 剩余时间，秒
     */
    public void setRemainingTime(Float RemainingTime) {
        this.RemainingTime = RemainingTime;
    }

    /**
     * Get 仓库镜像最近一次的漏洞任务扫描ID 
     * @return RegistryTaskID 仓库镜像最近一次的漏洞任务扫描ID
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set 仓库镜像最近一次的漏洞任务扫描ID
     * @param RegistryTaskID 仓库镜像最近一次的漏洞任务扫描ID
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
    }

    /**
     * Get 仓库发现漏洞数量 
     * @return RegistryFoundVulCount 仓库发现漏洞数量
     */
    public Long getRegistryFoundVulCount() {
        return this.RegistryFoundVulCount;
    }

    /**
     * Set 仓库发现漏洞数量
     * @param RegistryFoundVulCount 仓库发现漏洞数量
     */
    public void setRegistryFoundVulCount(Long RegistryFoundVulCount) {
        this.RegistryFoundVulCount = RegistryFoundVulCount;
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

    public DescribeVulScanInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulScanInfoResponse(DescribeVulScanInfoResponse source) {
        if (source.LocalImageScanCount != null) {
            this.LocalImageScanCount = new Long(source.LocalImageScanCount);
        }
        if (source.IgnoreVulCount != null) {
            this.IgnoreVulCount = new Long(source.IgnoreVulCount);
        }
        if (source.ScanStartTime != null) {
            this.ScanStartTime = new String(source.ScanStartTime);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.FoundRiskImageCount != null) {
            this.FoundRiskImageCount = new Long(source.FoundRiskImageCount);
        }
        if (source.FoundVulCount != null) {
            this.FoundVulCount = new Long(source.FoundVulCount);
        }
        if (source.ScanProgress != null) {
            this.ScanProgress = new Float(source.ScanProgress);
        }
        if (source.RegistryImageScanCount != null) {
            this.RegistryImageScanCount = new Long(source.RegistryImageScanCount);
        }
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RemainingTime != null) {
            this.RemainingTime = new Float(source.RemainingTime);
        }
        if (source.RegistryTaskID != null) {
            this.RegistryTaskID = new Long(source.RegistryTaskID);
        }
        if (source.RegistryFoundVulCount != null) {
            this.RegistryFoundVulCount = new Long(source.RegistryFoundVulCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalImageScanCount", this.LocalImageScanCount);
        this.setParamSimple(map, prefix + "IgnoreVulCount", this.IgnoreVulCount);
        this.setParamSimple(map, prefix + "ScanStartTime", this.ScanStartTime);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "FoundRiskImageCount", this.FoundRiskImageCount);
        this.setParamSimple(map, prefix + "FoundVulCount", this.FoundVulCount);
        this.setParamSimple(map, prefix + "ScanProgress", this.ScanProgress);
        this.setParamSimple(map, prefix + "RegistryImageScanCount", this.RegistryImageScanCount);
        this.setParamSimple(map, prefix + "LocalTaskID", this.LocalTaskID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RemainingTime", this.RemainingTime);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);
        this.setParamSimple(map, prefix + "RegistryFoundVulCount", this.RegistryFoundVulCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

