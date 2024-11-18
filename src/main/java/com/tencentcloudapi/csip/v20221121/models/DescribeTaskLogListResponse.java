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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskLogListResponse extends AbstractModel {

    /**
    * 总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 报告列表
    */
    @SerializedName("Data")
    @Expose
    private TaskLogInfo [] Data;

    /**
    * 待查看数量
    */
    @SerializedName("NotViewNumber")
    @Expose
    private Long NotViewNumber;

    /**
    * 报告模板数
    */
    @SerializedName("ReportTemplateNumber")
    @Expose
    private Long ReportTemplateNumber;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数 
     * @return TotalCount 总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数
     * @param TotalCount 总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 报告列表 
     * @return Data 报告列表
     */
    public TaskLogInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 报告列表
     * @param Data 报告列表
     */
    public void setData(TaskLogInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 待查看数量 
     * @return NotViewNumber 待查看数量
     */
    public Long getNotViewNumber() {
        return this.NotViewNumber;
    }

    /**
     * Set 待查看数量
     * @param NotViewNumber 待查看数量
     */
    public void setNotViewNumber(Long NotViewNumber) {
        this.NotViewNumber = NotViewNumber;
    }

    /**
     * Get 报告模板数 
     * @return ReportTemplateNumber 报告模板数
     */
    public Long getReportTemplateNumber() {
        return this.ReportTemplateNumber;
    }

    /**
     * Set 报告模板数
     * @param ReportTemplateNumber 报告模板数
     */
    public void setReportTemplateNumber(Long ReportTemplateNumber) {
        this.ReportTemplateNumber = ReportTemplateNumber;
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

    public DescribeTaskLogListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskLogListResponse(DescribeTaskLogListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new TaskLogInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TaskLogInfo(source.Data[i]);
            }
        }
        if (source.NotViewNumber != null) {
            this.NotViewNumber = new Long(source.NotViewNumber);
        }
        if (source.ReportTemplateNumber != null) {
            this.ReportTemplateNumber = new Long(source.ReportTemplateNumber);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "NotViewNumber", this.NotViewNumber);
        this.setParamSimple(map, prefix + "ReportTemplateNumber", this.ReportTemplateNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

