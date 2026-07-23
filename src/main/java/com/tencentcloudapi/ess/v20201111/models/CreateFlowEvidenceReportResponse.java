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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowEvidenceReportResponse extends AbstractModel {

    /**
    * <p>出证报告 ID，可用于<a href="https://qian.tencent.com/developers/companyApis/certificate/DescribeFlowEvidenceReport" target="_blank">获取出证报告任务执行结果</a>查询出证任务结果和出证PDF的下载URL</p>
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * <p>出证任务执行的状态, 状态含义如下：</p><ul><li>**EvidenceStatusExecuting**：  出证任务在执行中</li><li>**EvidenceStatusSuccess**：  出证任务执行成功</li><li>**EvidenceStatusFailed** ： 出证任务执行失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>此字段已经废除,不再使用.<br>出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取</p>
    */
    @SerializedName("ReportUrl")
    @Expose
    private String ReportUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>出证报告 ID，可用于<a href="https://qian.tencent.com/developers/companyApis/certificate/DescribeFlowEvidenceReport" target="_blank">获取出证报告任务执行结果</a>查询出证任务结果和出证PDF的下载URL</p> 
     * @return ReportId <p>出证报告 ID，可用于<a href="https://qian.tencent.com/developers/companyApis/certificate/DescribeFlowEvidenceReport" target="_blank">获取出证报告任务执行结果</a>查询出证任务结果和出证PDF的下载URL</p>
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set <p>出证报告 ID，可用于<a href="https://qian.tencent.com/developers/companyApis/certificate/DescribeFlowEvidenceReport" target="_blank">获取出证报告任务执行结果</a>查询出证任务结果和出证PDF的下载URL</p>
     * @param ReportId <p>出证报告 ID，可用于<a href="https://qian.tencent.com/developers/companyApis/certificate/DescribeFlowEvidenceReport" target="_blank">获取出证报告任务执行结果</a>查询出证任务结果和出证PDF的下载URL</p>
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get <p>出证任务执行的状态, 状态含义如下：</p><ul><li>**EvidenceStatusExecuting**：  出证任务在执行中</li><li>**EvidenceStatusSuccess**：  出证任务执行成功</li><li>**EvidenceStatusFailed** ： 出证任务执行失败</li></ul> 
     * @return Status <p>出证任务执行的状态, 状态含义如下：</p><ul><li>**EvidenceStatusExecuting**：  出证任务在执行中</li><li>**EvidenceStatusSuccess**：  出证任务执行成功</li><li>**EvidenceStatusFailed** ： 出证任务执行失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>出证任务执行的状态, 状态含义如下：</p><ul><li>**EvidenceStatusExecuting**：  出证任务在执行中</li><li>**EvidenceStatusSuccess**：  出证任务执行成功</li><li>**EvidenceStatusFailed** ： 出证任务执行失败</li></ul>
     * @param Status <p>出证任务执行的状态, 状态含义如下：</p><ul><li>**EvidenceStatusExecuting**：  出证任务在执行中</li><li>**EvidenceStatusSuccess**：  出证任务执行成功</li><li>**EvidenceStatusFailed** ： 出证任务执行失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>此字段已经废除,不再使用.<br>出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取</p> 
     * @return ReportUrl <p>此字段已经废除,不再使用.<br>出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取</p>
     * @deprecated
     */
    @Deprecated
    public String getReportUrl() {
        return this.ReportUrl;
    }

    /**
     * Set <p>此字段已经废除,不再使用.<br>出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取</p>
     * @param ReportUrl <p>此字段已经废除,不再使用.<br>出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取</p>
     * @deprecated
     */
    @Deprecated
    public void setReportUrl(String ReportUrl) {
        this.ReportUrl = ReportUrl;
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

    public CreateFlowEvidenceReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowEvidenceReportResponse(CreateFlowEvidenceReportResponse source) {
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ReportUrl != null) {
            this.ReportUrl = new String(source.ReportUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ReportUrl", this.ReportUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

