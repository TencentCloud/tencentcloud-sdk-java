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

public class GetPeerLogForUserResponse extends AbstractModel{

    /**
    * 返回日志总行数，不会超过入参的RowNum
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 日志列表
    */
    @SerializedName("PeerLogList")
    @Expose
    private LogDetailForUser [] PeerLogList;

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
     * @return PeerLogList 日志列表
     */
    public LogDetailForUser [] getPeerLogList() {
        return this.PeerLogList;
    }

    /**
     * Set 日志列表
     * @param PeerLogList 日志列表
     */
    public void setPeerLogList(LogDetailForUser [] PeerLogList) {
        this.PeerLogList = PeerLogList;
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

    public GetPeerLogForUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPeerLogForUserResponse(GetPeerLogForUserResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PeerLogList != null) {
            this.PeerLogList = new LogDetailForUser[source.PeerLogList.length];
            for (int i = 0; i < source.PeerLogList.length; i++) {
                this.PeerLogList[i] = new LogDetailForUser(source.PeerLogList[i]);
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
        this.setParamArrayObj(map, prefix + "PeerLogList.", this.PeerLogList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

