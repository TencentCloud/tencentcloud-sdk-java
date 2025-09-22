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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmServiceMetricResponse extends AbstractModel {

    /**
    * 应用指标列表
    */
    @SerializedName("ServiceMetricList")
    @Expose
    private ApmServiceMetric [] ServiceMetricList;

    /**
    * 符合筛选条件的应用数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 警示异常应用数
    */
    @SerializedName("WarningErrorCount")
    @Expose
    private Long WarningErrorCount;

    /**
    * 应用总数
    */
    @SerializedName("ApplicationCount")
    @Expose
    private Long ApplicationCount;

    /**
    * 页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 异常应用数
    */
    @SerializedName("ErrorCount")
    @Expose
    private Long ErrorCount;

    /**
    * 警示应用数
    */
    @SerializedName("WarningCount")
    @Expose
    private Long WarningCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用指标列表 
     * @return ServiceMetricList 应用指标列表
     */
    public ApmServiceMetric [] getServiceMetricList() {
        return this.ServiceMetricList;
    }

    /**
     * Set 应用指标列表
     * @param ServiceMetricList 应用指标列表
     */
    public void setServiceMetricList(ApmServiceMetric [] ServiceMetricList) {
        this.ServiceMetricList = ServiceMetricList;
    }

    /**
     * Get 符合筛选条件的应用数 
     * @return TotalCount 符合筛选条件的应用数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合筛选条件的应用数
     * @param TotalCount 符合筛选条件的应用数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 警示异常应用数 
     * @return WarningErrorCount 警示异常应用数
     */
    public Long getWarningErrorCount() {
        return this.WarningErrorCount;
    }

    /**
     * Set 警示异常应用数
     * @param WarningErrorCount 警示异常应用数
     */
    public void setWarningErrorCount(Long WarningErrorCount) {
        this.WarningErrorCount = WarningErrorCount;
    }

    /**
     * Get 应用总数 
     * @return ApplicationCount 应用总数
     */
    public Long getApplicationCount() {
        return this.ApplicationCount;
    }

    /**
     * Set 应用总数
     * @param ApplicationCount 应用总数
     */
    public void setApplicationCount(Long ApplicationCount) {
        this.ApplicationCount = ApplicationCount;
    }

    /**
     * Get 页码 
     * @return Page 页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码
     * @param Page 页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 页大小 
     * @return PageSize 页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
     * @param PageSize 页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 异常应用数 
     * @return ErrorCount 异常应用数
     */
    public Long getErrorCount() {
        return this.ErrorCount;
    }

    /**
     * Set 异常应用数
     * @param ErrorCount 异常应用数
     */
    public void setErrorCount(Long ErrorCount) {
        this.ErrorCount = ErrorCount;
    }

    /**
     * Get 警示应用数 
     * @return WarningCount 警示应用数
     */
    public Long getWarningCount() {
        return this.WarningCount;
    }

    /**
     * Set 警示应用数
     * @param WarningCount 警示应用数
     */
    public void setWarningCount(Long WarningCount) {
        this.WarningCount = WarningCount;
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

    public DescribeApmServiceMetricResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmServiceMetricResponse(DescribeApmServiceMetricResponse source) {
        if (source.ServiceMetricList != null) {
            this.ServiceMetricList = new ApmServiceMetric[source.ServiceMetricList.length];
            for (int i = 0; i < source.ServiceMetricList.length; i++) {
                this.ServiceMetricList[i] = new ApmServiceMetric(source.ServiceMetricList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.WarningErrorCount != null) {
            this.WarningErrorCount = new Long(source.WarningErrorCount);
        }
        if (source.ApplicationCount != null) {
            this.ApplicationCount = new Long(source.ApplicationCount);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ErrorCount != null) {
            this.ErrorCount = new Long(source.ErrorCount);
        }
        if (source.WarningCount != null) {
            this.WarningCount = new Long(source.WarningCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ServiceMetricList.", this.ServiceMetricList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "WarningErrorCount", this.WarningErrorCount);
        this.setParamSimple(map, prefix + "ApplicationCount", this.ApplicationCount);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ErrorCount", this.ErrorCount);
        this.setParamSimple(map, prefix + "WarningCount", this.WarningCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

