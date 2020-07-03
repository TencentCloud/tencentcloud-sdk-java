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

public class DescribeLogDownloadListResponse extends AbstractModel{

    /**
    * 日志信息列表。
    */
    @SerializedName("LogInfoList")
    @Expose
    private LogInfo [] LogInfoList;

    /**
    * 总条数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志信息列表。 
     * @return LogInfoList 日志信息列表。
     */
    public LogInfo [] getLogInfoList() {
        return this.LogInfoList;
    }

    /**
     * Set 日志信息列表。
     * @param LogInfoList 日志信息列表。
     */
    public void setLogInfoList(LogInfo [] LogInfoList) {
        this.LogInfoList = LogInfoList;
    }

    /**
     * Get 总条数。 
     * @return TotalNum 总条数。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 总条数。
     * @param TotalNum 总条数。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
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
        this.setParamArrayObj(map, prefix + "LogInfoList.", this.LogInfoList);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

