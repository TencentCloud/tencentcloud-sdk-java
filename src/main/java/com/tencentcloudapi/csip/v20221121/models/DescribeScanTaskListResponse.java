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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanTaskListResponse extends AbstractModel {

    /**
    * 总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 任务日志列表
    */
    @SerializedName("Data")
    @Expose
    private ScanTaskInfoList [] Data;

    /**
    * 主账户ID列表
    */
    @SerializedName("UINList")
    @Expose
    private String [] UINList;

    /**
    * 体检模式过滤列表
    */
    @SerializedName("TaskModeList")
    @Expose
    private FilterDataObject [] TaskModeList;

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
     * Get 任务日志列表 
     * @return Data 任务日志列表
     */
    public ScanTaskInfoList [] getData() {
        return this.Data;
    }

    /**
     * Set 任务日志列表
     * @param Data 任务日志列表
     */
    public void setData(ScanTaskInfoList [] Data) {
        this.Data = Data;
    }

    /**
     * Get 主账户ID列表 
     * @return UINList 主账户ID列表
     */
    public String [] getUINList() {
        return this.UINList;
    }

    /**
     * Set 主账户ID列表
     * @param UINList 主账户ID列表
     */
    public void setUINList(String [] UINList) {
        this.UINList = UINList;
    }

    /**
     * Get 体检模式过滤列表 
     * @return TaskModeList 体检模式过滤列表
     */
    public FilterDataObject [] getTaskModeList() {
        return this.TaskModeList;
    }

    /**
     * Set 体检模式过滤列表
     * @param TaskModeList 体检模式过滤列表
     */
    public void setTaskModeList(FilterDataObject [] TaskModeList) {
        this.TaskModeList = TaskModeList;
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

    public DescribeScanTaskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanTaskListResponse(DescribeScanTaskListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new ScanTaskInfoList[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ScanTaskInfoList(source.Data[i]);
            }
        }
        if (source.UINList != null) {
            this.UINList = new String[source.UINList.length];
            for (int i = 0; i < source.UINList.length; i++) {
                this.UINList[i] = new String(source.UINList[i]);
            }
        }
        if (source.TaskModeList != null) {
            this.TaskModeList = new FilterDataObject[source.TaskModeList.length];
            for (int i = 0; i < source.TaskModeList.length; i++) {
                this.TaskModeList[i] = new FilterDataObject(source.TaskModeList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "UINList.", this.UINList);
        this.setParamArrayObj(map, prefix + "TaskModeList.", this.TaskModeList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

