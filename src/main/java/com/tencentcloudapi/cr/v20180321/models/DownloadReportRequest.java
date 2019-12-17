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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadReportRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：Report
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：DownloadReport
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 报告日期，格式为YYYY-MM-DD
    */
    @SerializedName("ReportDate")
    @Expose
    private String ReportDate;

    /**
    * 实例ID，不传默认为系统分配的初始实例。
    */
    @SerializedName("InstId")
    @Expose
    private String InstId;

    /**
     * Get 模块名，本接口取值：Report 
     * @return Module 模块名，本接口取值：Report
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：Report
     * @param Module 模块名，本接口取值：Report
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：DownloadReport 
     * @return Operation 操作名，本接口取值：DownloadReport
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：DownloadReport
     * @param Operation 操作名，本接口取值：DownloadReport
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 报告日期，格式为YYYY-MM-DD 
     * @return ReportDate 报告日期，格式为YYYY-MM-DD
     */
    public String getReportDate() {
        return this.ReportDate;
    }

    /**
     * Set 报告日期，格式为YYYY-MM-DD
     * @param ReportDate 报告日期，格式为YYYY-MM-DD
     */
    public void setReportDate(String ReportDate) {
        this.ReportDate = ReportDate;
    }

    /**
     * Get 实例ID，不传默认为系统分配的初始实例。 
     * @return InstId 实例ID，不传默认为系统分配的初始实例。
     */
    public String getInstId() {
        return this.InstId;
    }

    /**
     * Set 实例ID，不传默认为系统分配的初始实例。
     * @param InstId 实例ID，不传默认为系统分配的初始实例。
     */
    public void setInstId(String InstId) {
        this.InstId = InstId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ReportDate", this.ReportDate);
        this.setParamSimple(map, prefix + "InstId", this.InstId);

    }
}

