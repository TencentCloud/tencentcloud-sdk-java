/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobResultResponse extends AbstractModel {

    /**
    * <p>总记录数.</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>作业 ID。</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>结果状态（对客）：SUCCEEDED（结果集可用，含 0 行——DDL/DML 等无结果集语句亦归入此类，message 说明）/ UNAVAILABLE（终态无结果：statement 已失败或取消）/ ERROR（结果集拉取出错）/ NOT_READY（结果未就绪）/ NOT_SUPPORTED（作业形态不产出结果集）。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>状态描述（SUCCEEDED 0 行时为无结果集说明；ERROR 为错误信息；UNAVAILABLE 为 statement 失败/取消原因）。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>列定义列表（按结果集列顺序；State=SUCCEEDED 才有）。</p>
    */
    @SerializedName("Columns")
    @Expose
    private ResultColumn [] Columns;

    /**
    * <p>结果集全量行数（未按在线展示上限封顶）。Total 为在线可见行数，二者不等说明仅部分行可内联查看，完整结果通过 Download 获取。</p>
    */
    @SerializedName("TotalRows")
    @Expose
    private Long TotalRows;

    /**
    * <p>行数据（State=SUCCEEDED 才有），每行为 {"Values": [单元格值...]} 数组。</p>
    */
    @SerializedName("Rows")
    @Expose
    private ResultRow [] Rows;

    /**
    * <p>本页内容是否因响应大小限制被截断（单元格/行超限，结果集仅 1 行时也可能触发）。行数超过在线展示上限不由本标记表达，以 TotalRows > Total 判断，完整结果通过 Download 获取.</p>
    */
    @SerializedName("Truncated")
    @Expose
    private Boolean Truncated;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总记录数.</p> 
     * @return Total <p>总记录数.</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>总记录数.</p>
     * @param Total <p>总记录数.</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>作业 ID。</p> 
     * @return JobId <p>作业 ID。</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业 ID。</p>
     * @param JobId <p>作业 ID。</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>结果状态（对客）：SUCCEEDED（结果集可用，含 0 行——DDL/DML 等无结果集语句亦归入此类，message 说明）/ UNAVAILABLE（终态无结果：statement 已失败或取消）/ ERROR（结果集拉取出错）/ NOT_READY（结果未就绪）/ NOT_SUPPORTED（作业形态不产出结果集）。</p> 
     * @return State <p>结果状态（对客）：SUCCEEDED（结果集可用，含 0 行——DDL/DML 等无结果集语句亦归入此类，message 说明）/ UNAVAILABLE（终态无结果：statement 已失败或取消）/ ERROR（结果集拉取出错）/ NOT_READY（结果未就绪）/ NOT_SUPPORTED（作业形态不产出结果集）。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>结果状态（对客）：SUCCEEDED（结果集可用，含 0 行——DDL/DML 等无结果集语句亦归入此类，message 说明）/ UNAVAILABLE（终态无结果：statement 已失败或取消）/ ERROR（结果集拉取出错）/ NOT_READY（结果未就绪）/ NOT_SUPPORTED（作业形态不产出结果集）。</p>
     * @param State <p>结果状态（对客）：SUCCEEDED（结果集可用，含 0 行——DDL/DML 等无结果集语句亦归入此类，message 说明）/ UNAVAILABLE（终态无结果：statement 已失败或取消）/ ERROR（结果集拉取出错）/ NOT_READY（结果未就绪）/ NOT_SUPPORTED（作业形态不产出结果集）。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>状态描述（SUCCEEDED 0 行时为无结果集说明；ERROR 为错误信息；UNAVAILABLE 为 statement 失败/取消原因）。</p> 
     * @return Message <p>状态描述（SUCCEEDED 0 行时为无结果集说明；ERROR 为错误信息；UNAVAILABLE 为 statement 失败/取消原因）。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>状态描述（SUCCEEDED 0 行时为无结果集说明；ERROR 为错误信息；UNAVAILABLE 为 statement 失败/取消原因）。</p>
     * @param Message <p>状态描述（SUCCEEDED 0 行时为无结果集说明；ERROR 为错误信息；UNAVAILABLE 为 statement 失败/取消原因）。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>列定义列表（按结果集列顺序；State=SUCCEEDED 才有）。</p> 
     * @return Columns <p>列定义列表（按结果集列顺序；State=SUCCEEDED 才有）。</p>
     */
    public ResultColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set <p>列定义列表（按结果集列顺序；State=SUCCEEDED 才有）。</p>
     * @param Columns <p>列定义列表（按结果集列顺序；State=SUCCEEDED 才有）。</p>
     */
    public void setColumns(ResultColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get <p>结果集全量行数（未按在线展示上限封顶）。Total 为在线可见行数，二者不等说明仅部分行可内联查看，完整结果通过 Download 获取。</p> 
     * @return TotalRows <p>结果集全量行数（未按在线展示上限封顶）。Total 为在线可见行数，二者不等说明仅部分行可内联查看，完整结果通过 Download 获取。</p>
     */
    public Long getTotalRows() {
        return this.TotalRows;
    }

    /**
     * Set <p>结果集全量行数（未按在线展示上限封顶）。Total 为在线可见行数，二者不等说明仅部分行可内联查看，完整结果通过 Download 获取。</p>
     * @param TotalRows <p>结果集全量行数（未按在线展示上限封顶）。Total 为在线可见行数，二者不等说明仅部分行可内联查看，完整结果通过 Download 获取。</p>
     */
    public void setTotalRows(Long TotalRows) {
        this.TotalRows = TotalRows;
    }

    /**
     * Get <p>行数据（State=SUCCEEDED 才有），每行为 {"Values": [单元格值...]} 数组。</p> 
     * @return Rows <p>行数据（State=SUCCEEDED 才有），每行为 {"Values": [单元格值...]} 数组。</p>
     */
    public ResultRow [] getRows() {
        return this.Rows;
    }

    /**
     * Set <p>行数据（State=SUCCEEDED 才有），每行为 {"Values": [单元格值...]} 数组。</p>
     * @param Rows <p>行数据（State=SUCCEEDED 才有），每行为 {"Values": [单元格值...]} 数组。</p>
     */
    public void setRows(ResultRow [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get <p>本页内容是否因响应大小限制被截断（单元格/行超限，结果集仅 1 行时也可能触发）。行数超过在线展示上限不由本标记表达，以 TotalRows > Total 判断，完整结果通过 Download 获取.</p> 
     * @return Truncated <p>本页内容是否因响应大小限制被截断（单元格/行超限，结果集仅 1 行时也可能触发）。行数超过在线展示上限不由本标记表达，以 TotalRows > Total 判断，完整结果通过 Download 获取.</p>
     */
    public Boolean getTruncated() {
        return this.Truncated;
    }

    /**
     * Set <p>本页内容是否因响应大小限制被截断（单元格/行超限，结果集仅 1 行时也可能触发）。行数超过在线展示上限不由本标记表达，以 TotalRows > Total 判断，完整结果通过 Download 获取.</p>
     * @param Truncated <p>本页内容是否因响应大小限制被截断（单元格/行超限，结果集仅 1 行时也可能触发）。行数超过在线展示上限不由本标记表达，以 TotalRows > Total 判断，完整结果通过 Download 获取.</p>
     */
    public void setTruncated(Boolean Truncated) {
        this.Truncated = Truncated;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeJobResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobResultResponse(DescribeJobResultResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Columns != null) {
            this.Columns = new ResultColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new ResultColumn(source.Columns[i]);
            }
        }
        if (source.TotalRows != null) {
            this.TotalRows = new Long(source.TotalRows);
        }
        if (source.Rows != null) {
            this.Rows = new ResultRow[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new ResultRow(source.Rows[i]);
            }
        }
        if (source.Truncated != null) {
            this.Truncated = new Boolean(source.Truncated);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "TotalRows", this.TotalRows);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "Truncated", this.Truncated);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

