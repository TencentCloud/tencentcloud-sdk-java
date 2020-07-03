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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllStreamPlayInfoListResponse extends AbstractModel{

    /**
    * 查询时间点，回传的输入参数中的查询时间。
    */
    @SerializedName("QueryTime")
    @Expose
    private String QueryTime;

    /**
    * 数据信息列表。
    */
    @SerializedName("DataInfoList")
    @Expose
    private MonitorStreamPlayInfo [] DataInfoList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询时间点，回传的输入参数中的查询时间。 
     * @return QueryTime 查询时间点，回传的输入参数中的查询时间。
     */
    public String getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set 查询时间点，回传的输入参数中的查询时间。
     * @param QueryTime 查询时间点，回传的输入参数中的查询时间。
     */
    public void setQueryTime(String QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get 数据信息列表。 
     * @return DataInfoList 数据信息列表。
     */
    public MonitorStreamPlayInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set 数据信息列表。
     * @param DataInfoList 数据信息列表。
     */
    public void setDataInfoList(MonitorStreamPlayInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
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
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

