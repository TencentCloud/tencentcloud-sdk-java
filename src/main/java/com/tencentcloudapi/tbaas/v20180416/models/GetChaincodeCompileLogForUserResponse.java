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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetChaincodeCompileLogForUserResponse extends AbstractModel{

    /**
    * 日志总行数，上限2000条日志
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 日志列表
    */
    @SerializedName("CompileLogList")
    @Expose
    private LogDetailForUser [] CompileLogList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志总行数，上限2000条日志 
     * @return TotalCount 日志总行数，上限2000条日志
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 日志总行数，上限2000条日志
     * @param TotalCount 日志总行数，上限2000条日志
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 日志列表 
     * @return CompileLogList 日志列表
     */
    public LogDetailForUser [] getCompileLogList() {
        return this.CompileLogList;
    }

    /**
     * Set 日志列表
     * @param CompileLogList 日志列表
     */
    public void setCompileLogList(LogDetailForUser [] CompileLogList) {
        this.CompileLogList = CompileLogList;
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

    public GetChaincodeCompileLogForUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetChaincodeCompileLogForUserResponse(GetChaincodeCompileLogForUserResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.CompileLogList != null) {
            this.CompileLogList = new LogDetailForUser[source.CompileLogList.length];
            for (int i = 0; i < source.CompileLogList.length; i++) {
                this.CompileLogList[i] = new LogDetailForUser(source.CompileLogList[i]);
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
        this.setParamArrayObj(map, prefix + "CompileLogList.", this.CompileLogList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

