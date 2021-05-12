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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRollbackTimeValidityResponse extends AbstractModel{

    /**
    * 存储poolID
    */
    @SerializedName("PoolId")
    @Expose
    private Long PoolId;

    /**
    * 回滚任务ID，后续按该时间点回滚时，需要传入
    */
    @SerializedName("QueryId")
    @Expose
    private Long QueryId;

    /**
    * 时间点是否有效：pass，检测通过；fail，检测失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 建议时间点，在Status为fail时，该值才有效
    */
    @SerializedName("SuggestTime")
    @Expose
    private String SuggestTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 存储poolID 
     * @return PoolId 存储poolID
     */
    public Long getPoolId() {
        return this.PoolId;
    }

    /**
     * Set 存储poolID
     * @param PoolId 存储poolID
     */
    public void setPoolId(Long PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get 回滚任务ID，后续按该时间点回滚时，需要传入 
     * @return QueryId 回滚任务ID，后续按该时间点回滚时，需要传入
     */
    public Long getQueryId() {
        return this.QueryId;
    }

    /**
     * Set 回滚任务ID，后续按该时间点回滚时，需要传入
     * @param QueryId 回滚任务ID，后续按该时间点回滚时，需要传入
     */
    public void setQueryId(Long QueryId) {
        this.QueryId = QueryId;
    }

    /**
     * Get 时间点是否有效：pass，检测通过；fail，检测失败 
     * @return Status 时间点是否有效：pass，检测通过；fail，检测失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 时间点是否有效：pass，检测通过；fail，检测失败
     * @param Status 时间点是否有效：pass，检测通过；fail，检测失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 建议时间点，在Status为fail时，该值才有效 
     * @return SuggestTime 建议时间点，在Status为fail时，该值才有效
     */
    public String getSuggestTime() {
        return this.SuggestTime;
    }

    /**
     * Set 建议时间点，在Status为fail时，该值才有效
     * @param SuggestTime 建议时间点，在Status为fail时，该值才有效
     */
    public void setSuggestTime(String SuggestTime) {
        this.SuggestTime = SuggestTime;
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

    public DescribeRollbackTimeValidityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRollbackTimeValidityResponse(DescribeRollbackTimeValidityResponse source) {
        if (source.PoolId != null) {
            this.PoolId = new Long(source.PoolId);
        }
        if (source.QueryId != null) {
            this.QueryId = new Long(source.QueryId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SuggestTime != null) {
            this.SuggestTime = new String(source.SuggestTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PoolId", this.PoolId);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuggestTime", this.SuggestTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

