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

public class GetChaincodeLogForUserResponse extends AbstractModel{

    /**
    * 返回日志总行数，不会超过入参的RowNum
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 日志列表
    */
    @SerializedName("ChaincodeLogList")
    @Expose
    private LogDetailForUser [] ChaincodeLogList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回日志总行数，不会超过入参的RowNum 
     * @return TotalCount 返回日志总行数，不会超过入参的RowNum
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回日志总行数，不会超过入参的RowNum
     * @param TotalCount 返回日志总行数，不会超过入参的RowNum
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 日志列表 
     * @return ChaincodeLogList 日志列表
     */
    public LogDetailForUser [] getChaincodeLogList() {
        return this.ChaincodeLogList;
    }

    /**
     * Set 日志列表
     * @param ChaincodeLogList 日志列表
     */
    public void setChaincodeLogList(LogDetailForUser [] ChaincodeLogList) {
        this.ChaincodeLogList = ChaincodeLogList;
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

    public GetChaincodeLogForUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetChaincodeLogForUserResponse(GetChaincodeLogForUserResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ChaincodeLogList != null) {
            this.ChaincodeLogList = new LogDetailForUser[source.ChaincodeLogList.length];
            for (int i = 0; i < source.ChaincodeLogList.length; i++) {
                this.ChaincodeLogList[i] = new LogDetailForUser(source.ChaincodeLogList[i]);
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
        this.setParamArrayObj(map, prefix + "ChaincodeLogList.", this.ChaincodeLogList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

