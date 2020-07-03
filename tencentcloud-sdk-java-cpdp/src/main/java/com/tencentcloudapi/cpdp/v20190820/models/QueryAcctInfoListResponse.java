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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAcctInfoListResponse extends AbstractModel{

    /**
    * 本次交易返回查询结果记录数
    */
    @SerializedName("ResultCount")
    @Expose
    private Long ResultCount;

    /**
    * 符合业务查询条件的记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 查询结果项 [object,object]
    */
    @SerializedName("QueryAcctItems")
    @Expose
    private QueryAcctItem [] QueryAcctItems;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本次交易返回查询结果记录数 
     * @return ResultCount 本次交易返回查询结果记录数
     */
    public Long getResultCount() {
        return this.ResultCount;
    }

    /**
     * Set 本次交易返回查询结果记录数
     * @param ResultCount 本次交易返回查询结果记录数
     */
    public void setResultCount(Long ResultCount) {
        this.ResultCount = ResultCount;
    }

    /**
     * Get 符合业务查询条件的记录总数 
     * @return TotalCount 符合业务查询条件的记录总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合业务查询条件的记录总数
     * @param TotalCount 符合业务查询条件的记录总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 查询结果项 [object,object] 
     * @return QueryAcctItems 查询结果项 [object,object]
     */
    public QueryAcctItem [] getQueryAcctItems() {
        return this.QueryAcctItems;
    }

    /**
     * Set 查询结果项 [object,object]
     * @param QueryAcctItems 查询结果项 [object,object]
     */
    public void setQueryAcctItems(QueryAcctItem [] QueryAcctItems) {
        this.QueryAcctItems = QueryAcctItems;
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
        this.setParamSimple(map, prefix + "ResultCount", this.ResultCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "QueryAcctItems.", this.QueryAcctItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

