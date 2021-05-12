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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagRetentionExecutionResponse extends AbstractModel{

    /**
    * 版本保留执行记录列表
    */
    @SerializedName("RetentionExecutionList")
    @Expose
    private RetentionExecution [] RetentionExecutionList;

    /**
    * 版本保留执行记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 版本保留执行记录列表 
     * @return RetentionExecutionList 版本保留执行记录列表
     */
    public RetentionExecution [] getRetentionExecutionList() {
        return this.RetentionExecutionList;
    }

    /**
     * Set 版本保留执行记录列表
     * @param RetentionExecutionList 版本保留执行记录列表
     */
    public void setRetentionExecutionList(RetentionExecution [] RetentionExecutionList) {
        this.RetentionExecutionList = RetentionExecutionList;
    }

    /**
     * Get 版本保留执行记录总数 
     * @return TotalCount 版本保留执行记录总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 版本保留执行记录总数
     * @param TotalCount 版本保留执行记录总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeTagRetentionExecutionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagRetentionExecutionResponse(DescribeTagRetentionExecutionResponse source) {
        if (source.RetentionExecutionList != null) {
            this.RetentionExecutionList = new RetentionExecution[source.RetentionExecutionList.length];
            for (int i = 0; i < source.RetentionExecutionList.length; i++) {
                this.RetentionExecutionList[i] = new RetentionExecution(source.RetentionExecutionList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RetentionExecutionList.", this.RetentionExecutionList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

