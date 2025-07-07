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
    * 企业ID
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 任务类型：即时任务
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * qps设置
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 是否包含完整扫描
    */
    @SerializedName("IsIncludeFullScan")
    @Expose
    private Boolean IsIncludeFullScan;

    /**
     * Get 企业ID 
     * @return CustomerId 企业ID
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID
     * @param CustomerId 企业ID
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 任务类型：即时任务 
     * @return TaskType 任务类型：即时任务
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型：即时任务
     * @param TaskType 任务类型：即时任务
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息 
     * @return ScanType 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息
     * @param ScanType 资产收集、漏洞信息、弱口令、目录爆破、暗网泄露、Github泄露、文库网盘泄露、敏感信息泄露，其中资产收集必包含，多个用英文逗号隔离，例如：资产收集,漏洞信息
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get qps设置 
     * @return Qps qps设置
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set qps设置
     * @param Qps qps设置
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 是否包含完整扫描 
     * @return IsIncludeFullScan 是否包含完整扫描
     */
    public Boolean getIsIncludeFullScan() {
        return this.IsIncludeFullScan;
    }

    /**
     * Set 是否包含完整扫描
     * @param IsIncludeFullScan 是否包含完整扫描
     */
    public void setIsIncludeFullScan(Boolean IsIncludeFullScan) {
        this.IsIncludeFullScan = IsIncludeFullScan;
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

    }
}

