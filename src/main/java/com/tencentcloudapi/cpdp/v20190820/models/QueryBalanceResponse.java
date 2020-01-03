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

public class QueryBalanceResponse extends AbstractModel{

    /**
    * 本次交易返回查询结果记录数
    */
    @SerializedName("ResultCount")
    @Expose
    private String ResultCount;

    /**
    * 起始记录号
    */
    @SerializedName("StartRecordOffset")
    @Expose
    private String StartRecordOffset;

    /**
    * 结束标志
    */
    @SerializedName("EndFlag")
    @Expose
    private String EndFlag;

    /**
    * 符合业务查询条件的记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * 查询结果项
    */
    @SerializedName("QueryItems")
    @Expose
    private QueryItem [] QueryItems;

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
    public String getResultCount() {
        return this.ResultCount;
    }

    /**
     * Set 本次交易返回查询结果记录数
     * @param ResultCount 本次交易返回查询结果记录数
     */
    public void setResultCount(String ResultCount) {
        this.ResultCount = ResultCount;
    }

    /**
     * Get 起始记录号 
     * @return StartRecordOffset 起始记录号
     */
    public String getStartRecordOffset() {
        return this.StartRecordOffset;
    }

    /**
     * Set 起始记录号
     * @param StartRecordOffset 起始记录号
     */
    public void setStartRecordOffset(String StartRecordOffset) {
        this.StartRecordOffset = StartRecordOffset;
    }

    /**
     * Get 结束标志 
     * @return EndFlag 结束标志
     */
    public String getEndFlag() {
        return this.EndFlag;
    }

    /**
     * Set 结束标志
     * @param EndFlag 结束标志
     */
    public void setEndFlag(String EndFlag) {
        this.EndFlag = EndFlag;
    }

    /**
     * Get 符合业务查询条件的记录总数 
     * @return TotalCount 符合业务查询条件的记录总数
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合业务查询条件的记录总数
     * @param TotalCount 符合业务查询条件的记录总数
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 查询结果项 
     * @return QueryItems 查询结果项
     */
    public QueryItem [] getQueryItems() {
        return this.QueryItems;
    }

    /**
     * Set 查询结果项
     * @param QueryItems 查询结果项
     */
    public void setQueryItems(QueryItem [] QueryItems) {
        this.QueryItems = QueryItems;
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
        this.setParamSimple(map, prefix + "StartRecordOffset", this.StartRecordOffset);
        this.setParamSimple(map, prefix + "EndFlag", this.EndFlag);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "QueryItems.", this.QueryItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

