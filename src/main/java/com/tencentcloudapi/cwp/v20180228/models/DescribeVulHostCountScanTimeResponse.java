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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulHostCountScanTimeResponse extends AbstractModel{

    /**
    * 总漏洞数
    */
    @SerializedName("TotalVulCount")
    @Expose
    private Long TotalVulCount;

    /**
    * 漏洞影响主机数
    */
    @SerializedName("VulHostCount")
    @Expose
    private Long VulHostCount;

    /**
    * 扫描时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 是否第一次检测
    */
    @SerializedName("IfFirstScan")
    @Expose
    private Boolean IfFirstScan;

    /**
    * 运行中的任务号, 没有任务则为0
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总漏洞数 
     * @return TotalVulCount 总漏洞数
     */
    public Long getTotalVulCount() {
        return this.TotalVulCount;
    }

    /**
     * Set 总漏洞数
     * @param TotalVulCount 总漏洞数
     */
    public void setTotalVulCount(Long TotalVulCount) {
        this.TotalVulCount = TotalVulCount;
    }

    /**
     * Get 漏洞影响主机数 
     * @return VulHostCount 漏洞影响主机数
     */
    public Long getVulHostCount() {
        return this.VulHostCount;
    }

    /**
     * Set 漏洞影响主机数
     * @param VulHostCount 漏洞影响主机数
     */
    public void setVulHostCount(Long VulHostCount) {
        this.VulHostCount = VulHostCount;
    }

    /**
     * Get 扫描时间 
     * @return ScanTime 扫描时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 扫描时间
     * @param ScanTime 扫描时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 是否第一次检测 
     * @return IfFirstScan 是否第一次检测
     */
    public Boolean getIfFirstScan() {
        return this.IfFirstScan;
    }

    /**
     * Set 是否第一次检测
     * @param IfFirstScan 是否第一次检测
     */
    public void setIfFirstScan(Boolean IfFirstScan) {
        this.IfFirstScan = IfFirstScan;
    }

    /**
     * Get 运行中的任务号, 没有任务则为0 
     * @return TaskId 运行中的任务号, 没有任务则为0
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 运行中的任务号, 没有任务则为0
     * @param TaskId 运行中的任务号, 没有任务则为0
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
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

    public DescribeVulHostCountScanTimeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulHostCountScanTimeResponse(DescribeVulHostCountScanTimeResponse source) {
        if (source.TotalVulCount != null) {
            this.TotalVulCount = new Long(source.TotalVulCount);
        }
        if (source.VulHostCount != null) {
            this.VulHostCount = new Long(source.VulHostCount);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.IfFirstScan != null) {
            this.IfFirstScan = new Boolean(source.IfFirstScan);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalVulCount", this.TotalVulCount);
        this.setParamSimple(map, prefix + "VulHostCount", this.VulHostCount);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "IfFirstScan", this.IfFirstScan);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

