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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSlowLogsResponse  extends AbstractModel{

    /**
    * 慢查询日志数据
    */
    @SerializedName("Data")
    @Expose
    private SlowLogData [] Data;

    /**
    * 所有语句锁时间总和
    */
    @SerializedName("LockTimeSum")
    @Expose
    private Float LockTimeSum;

    /**
    * 所有语句查询总次数
    */
    @SerializedName("QueryCount")
    @Expose
    private Integer QueryCount;

    /**
    * 总记录数
    */
    @SerializedName("Total")
    @Expose
    private Integer Total;

    /**
    * 所有语句查询时间总和
    */
    @SerializedName("QueryTimeSum")
    @Expose
    private Float QueryTimeSum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取慢查询日志数据
     * @return Data 慢查询日志数据
     */
    public SlowLogData [] getData() {
        return this.Data;
    }

    /**
     * 设置慢查询日志数据
     * @param Data 慢查询日志数据
     */
    public void setData(SlowLogData [] Data) {
        this.Data = Data;
    }

    /**
     * 获取所有语句锁时间总和
     * @return LockTimeSum 所有语句锁时间总和
     */
    public Float getLockTimeSum() {
        return this.LockTimeSum;
    }

    /**
     * 设置所有语句锁时间总和
     * @param LockTimeSum 所有语句锁时间总和
     */
    public void setLockTimeSum(Float LockTimeSum) {
        this.LockTimeSum = LockTimeSum;
    }

    /**
     * 获取所有语句查询总次数
     * @return QueryCount 所有语句查询总次数
     */
    public Integer getQueryCount() {
        return this.QueryCount;
    }

    /**
     * 设置所有语句查询总次数
     * @param QueryCount 所有语句查询总次数
     */
    public void setQueryCount(Integer QueryCount) {
        this.QueryCount = QueryCount;
    }

    /**
     * 获取总记录数
     * @return Total 总记录数
     */
    public Integer getTotal() {
        return this.Total;
    }

    /**
     * 设置总记录数
     * @param Total 总记录数
     */
    public void setTotal(Integer Total) {
        this.Total = Total;
    }

    /**
     * 获取所有语句查询时间总和
     * @return QueryTimeSum 所有语句查询时间总和
     */
    public Float getQueryTimeSum() {
        return this.QueryTimeSum;
    }

    /**
     * 设置所有语句查询时间总和
     * @param QueryTimeSum 所有语句查询时间总和
     */
    public void setQueryTimeSum(Float QueryTimeSum) {
        this.QueryTimeSum = QueryTimeSum;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "LockTimeSum", this.LockTimeSum);
        this.setParamSimple(map, prefix + "QueryCount", this.QueryCount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "QueryTimeSum", this.QueryTimeSum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

