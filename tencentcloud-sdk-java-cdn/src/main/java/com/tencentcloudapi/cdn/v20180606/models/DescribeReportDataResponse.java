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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReportDataResponse extends AbstractModel{

    /**
    * 域名维度数据详情
    */
    @SerializedName("DomainReport")
    @Expose
    private ReportData [] DomainReport;

    /**
    * 项目维度数据详情
    */
    @SerializedName("ProjectReport")
    @Expose
    private ReportData [] ProjectReport;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 域名维度数据详情 
     * @return DomainReport 域名维度数据详情
     */
    public ReportData [] getDomainReport() {
        return this.DomainReport;
    }

    /**
     * Set 域名维度数据详情
     * @param DomainReport 域名维度数据详情
     */
    public void setDomainReport(ReportData [] DomainReport) {
        this.DomainReport = DomainReport;
    }

    /**
     * Get 项目维度数据详情 
     * @return ProjectReport 项目维度数据详情
     */
    public ReportData [] getProjectReport() {
        return this.ProjectReport;
    }

    /**
     * Set 项目维度数据详情
     * @param ProjectReport 项目维度数据详情
     */
    public void setProjectReport(ReportData [] ProjectReport) {
        this.ProjectReport = ProjectReport;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DomainReport.", this.DomainReport);
        this.setParamArrayObj(map, prefix + "ProjectReport.", this.ProjectReport);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

