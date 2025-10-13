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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListProcessLineageRequest extends AbstractModel {

    /**
    * 任务唯一ID
    */
    @SerializedName("ProcessId")
    @Expose
    private String ProcessId;

    /**
    * 任务类型    //调度任务     SCHEDULE_TASK,     //集成任务     INTEGRATION_TASK,     //第三方上报     THIRD_REPORT,     //数据建模     TABLE_MODEL,     //模型创建指标     MODEL_METRIC,     //原子指标创建衍生指标     METRIC_METRIC,     //数据服务     DATA_SERVICE
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 来源：WEDATA|THIRD 默认WEDATA
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
     * Get 任务唯一ID 
     * @return ProcessId 任务唯一ID
     */
    public String getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 任务唯一ID
     * @param ProcessId 任务唯一ID
     */
    public void setProcessId(String ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get 任务类型    //调度任务     SCHEDULE_TASK,     //集成任务     INTEGRATION_TASK,     //第三方上报     THIRD_REPORT,     //数据建模     TABLE_MODEL,     //模型创建指标     MODEL_METRIC,     //原子指标创建衍生指标     METRIC_METRIC,     //数据服务     DATA_SERVICE 
     * @return ProcessType 任务类型    //调度任务     SCHEDULE_TASK,     //集成任务     INTEGRATION_TASK,     //第三方上报     THIRD_REPORT,     //数据建模     TABLE_MODEL,     //模型创建指标     MODEL_METRIC,     //原子指标创建衍生指标     METRIC_METRIC,     //数据服务     DATA_SERVICE
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 任务类型    //调度任务     SCHEDULE_TASK,     //集成任务     INTEGRATION_TASK,     //第三方上报     THIRD_REPORT,     //数据建模     TABLE_MODEL,     //模型创建指标     MODEL_METRIC,     //原子指标创建衍生指标     METRIC_METRIC,     //数据服务     DATA_SERVICE
     * @param ProcessType 任务类型    //调度任务     SCHEDULE_TASK,     //集成任务     INTEGRATION_TASK,     //第三方上报     THIRD_REPORT,     //数据建模     TABLE_MODEL,     //模型创建指标     MODEL_METRIC,     //原子指标创建衍生指标     METRIC_METRIC,     //数据服务     DATA_SERVICE
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 来源：WEDATA|THIRD 默认WEDATA 
     * @return Platform 来源：WEDATA|THIRD 默认WEDATA
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 来源：WEDATA|THIRD 默认WEDATA
     * @param Platform 来源：WEDATA|THIRD 默认WEDATA
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    public ListProcessLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListProcessLineageRequest(ListProcessLineageRequest source) {
        if (source.ProcessId != null) {
            this.ProcessId = new String(source.ProcessId);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

