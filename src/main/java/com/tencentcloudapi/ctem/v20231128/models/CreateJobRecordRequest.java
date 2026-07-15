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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateJobRecordRequest extends AbstractModel {

    /**
    * <p>企业ID</p>
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * <p>任务类型：即时任务</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p>
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * <p>qps设置</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>是否包含完整扫描</p>
    */
    @SerializedName("IsIncludeFullScan")
    @Expose
    private Boolean IsIncludeFullScan;

    /**
    * <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p><p>默认值：100</p>
    */
    @SerializedName("PortScanQps")
    @Expose
    private Long PortScanQps;

    /**
    * <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p><p>默认值：1</p>
    */
    @SerializedName("SingleIPTaskLimit")
    @Expose
    private Long SingleIPTaskLimit;

    /**
    * <p>任一速率超过保守值时必须为 true，否则参数错误</p>
    */
    @SerializedName("HighRiskAck")
    @Expose
    private Boolean HighRiskAck;

    /**
    * <p>知情同意勾选清单，用于审计回放</p>
    */
    @SerializedName("ScanRateAckChecklist")
    @Expose
    private String [] ScanRateAckChecklist;

    /**
    * <p>扫描优先级配置</p>
    */
    @SerializedName("ScanPriority")
    @Expose
    private ScanPriorityReq ScanPriority;

    /**
     * Get <p>企业ID</p> 
     * @return CustomerId <p>企业ID</p>
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set <p>企业ID</p>
     * @param CustomerId <p>企业ID</p>
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get <p>任务类型：即时任务</p> 
     * @return TaskType <p>任务类型：即时任务</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型：即时任务</p>
     * @param TaskType <p>任务类型：即时任务</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p> 
     * @return ScanType <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p>
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p>
     * @param ScanType <p>资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息</p>
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>qps设置</p> 
     * @return Qps <p>qps设置</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>qps设置</p>
     * @param Qps <p>qps设置</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>是否包含完整扫描</p> 
     * @return IsIncludeFullScan <p>是否包含完整扫描</p>
     */
    public Boolean getIsIncludeFullScan() {
        return this.IsIncludeFullScan;
    }

    /**
     * Set <p>是否包含完整扫描</p>
     * @param IsIncludeFullScan <p>是否包含完整扫描</p>
     */
    public void setIsIncludeFullScan(Boolean IsIncludeFullScan) {
        this.IsIncludeFullScan = IsIncludeFullScan;
    }

    /**
     * Get <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p><p>默认值：100</p> 
     * @return PortScanQps <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p><p>默认值：100</p>
     */
    public Long getPortScanQps() {
        return this.PortScanQps;
    }

    /**
     * Set <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p><p>默认值：100</p>
     * @param PortScanQps <p>端口扫描 QPS，默认 100，下限 10，保守值 200，上限 5000</p><p>默认值：100</p>
     */
    public void setPortScanQps(Long PortScanQps) {
        this.PortScanQps = PortScanQps;
    }

    /**
     * Get <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p><p>默认值：1</p> 
     * @return SingleIPTaskLimit <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p><p>默认值：1</p>
     */
    public Long getSingleIPTaskLimit() {
        return this.SingleIPTaskLimit;
    }

    /**
     * Set <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p><p>默认值：1</p>
     * @param SingleIPTaskLimit <p>单 IP 任务并发数，默认 1，下限 1，保守值 3，上限 10</p><p>默认值：1</p>
     */
    public void setSingleIPTaskLimit(Long SingleIPTaskLimit) {
        this.SingleIPTaskLimit = SingleIPTaskLimit;
    }

    /**
     * Get <p>任一速率超过保守值时必须为 true，否则参数错误</p> 
     * @return HighRiskAck <p>任一速率超过保守值时必须为 true，否则参数错误</p>
     */
    public Boolean getHighRiskAck() {
        return this.HighRiskAck;
    }

    /**
     * Set <p>任一速率超过保守值时必须为 true，否则参数错误</p>
     * @param HighRiskAck <p>任一速率超过保守值时必须为 true，否则参数错误</p>
     */
    public void setHighRiskAck(Boolean HighRiskAck) {
        this.HighRiskAck = HighRiskAck;
    }

    /**
     * Get <p>知情同意勾选清单，用于审计回放</p> 
     * @return ScanRateAckChecklist <p>知情同意勾选清单，用于审计回放</p>
     */
    public String [] getScanRateAckChecklist() {
        return this.ScanRateAckChecklist;
    }

    /**
     * Set <p>知情同意勾选清单，用于审计回放</p>
     * @param ScanRateAckChecklist <p>知情同意勾选清单，用于审计回放</p>
     */
    public void setScanRateAckChecklist(String [] ScanRateAckChecklist) {
        this.ScanRateAckChecklist = ScanRateAckChecklist;
    }

    /**
     * Get <p>扫描优先级配置</p> 
     * @return ScanPriority <p>扫描优先级配置</p>
     */
    public ScanPriorityReq getScanPriority() {
        return this.ScanPriority;
    }

    /**
     * Set <p>扫描优先级配置</p>
     * @param ScanPriority <p>扫描优先级配置</p>
     */
    public void setScanPriority(ScanPriorityReq ScanPriority) {
        this.ScanPriority = ScanPriority;
    }

    public CreateJobRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJobRecordRequest(CreateJobRecordRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.IsIncludeFullScan != null) {
            this.IsIncludeFullScan = new Boolean(source.IsIncludeFullScan);
        }
        if (source.PortScanQps != null) {
            this.PortScanQps = new Long(source.PortScanQps);
        }
        if (source.SingleIPTaskLimit != null) {
            this.SingleIPTaskLimit = new Long(source.SingleIPTaskLimit);
        }
        if (source.HighRiskAck != null) {
            this.HighRiskAck = new Boolean(source.HighRiskAck);
        }
        if (source.ScanRateAckChecklist != null) {
            this.ScanRateAckChecklist = new String[source.ScanRateAckChecklist.length];
            for (int i = 0; i < source.ScanRateAckChecklist.length; i++) {
                this.ScanRateAckChecklist[i] = new String(source.ScanRateAckChecklist[i]);
            }
        }
        if (source.ScanPriority != null) {
            this.ScanPriority = new ScanPriorityReq(source.ScanPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "IsIncludeFullScan", this.IsIncludeFullScan);
        this.setParamSimple(map, prefix + "PortScanQps", this.PortScanQps);
        this.setParamSimple(map, prefix + "SingleIPTaskLimit", this.SingleIPTaskLimit);
        this.setParamSimple(map, prefix + "HighRiskAck", this.HighRiskAck);
        this.setParamArraySimple(map, prefix + "ScanRateAckChecklist.", this.ScanRateAckChecklist);
        this.setParamObj(map, prefix + "ScanPriority.", this.ScanPriority);

    }
}

