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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReportTaskDownloadUrlRequest extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("ReportTaskId")
    @Expose
    private Long ReportTaskId;

    /**
    * dspa实例id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 是否同时下载敏感资产详情报告
    */
    @SerializedName("IsWithSensitiveDetailReport")
    @Expose
    private Boolean IsWithSensitiveDetailReport;

    /**
     * Get 任务id 
     * @return ReportTaskId 任务id
     */
    public Long getReportTaskId() {
        return this.ReportTaskId;
    }

    /**
     * Set 任务id
     * @param ReportTaskId 任务id
     */
    public void setReportTaskId(Long ReportTaskId) {
        this.ReportTaskId = ReportTaskId;
    }

    /**
     * Get dspa实例id 
     * @return DspaId dspa实例id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set dspa实例id
     * @param DspaId dspa实例id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 是否同时下载敏感资产详情报告 
     * @return IsWithSensitiveDetailReport 是否同时下载敏感资产详情报告
     */
    public Boolean getIsWithSensitiveDetailReport() {
        return this.IsWithSensitiveDetailReport;
    }

    /**
     * Set 是否同时下载敏感资产详情报告
     * @param IsWithSensitiveDetailReport 是否同时下载敏感资产详情报告
     */
    public void setIsWithSensitiveDetailReport(Boolean IsWithSensitiveDetailReport) {
        this.IsWithSensitiveDetailReport = IsWithSensitiveDetailReport;
    }

    public DescribeReportTaskDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReportTaskDownloadUrlRequest(DescribeReportTaskDownloadUrlRequest source) {
        if (source.ReportTaskId != null) {
            this.ReportTaskId = new Long(source.ReportTaskId);
        }
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.IsWithSensitiveDetailReport != null) {
            this.IsWithSensitiveDetailReport = new Boolean(source.IsWithSensitiveDetailReport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportTaskId", this.ReportTaskId);
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "IsWithSensitiveDetailReport", this.IsWithSensitiveDetailReport);

    }
}

