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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogAgg extends AbstractModel {

    /**
    * 命令模版。
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * 命令详情。
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 执行次数。
    */
    @SerializedName("ExecTimes")
    @Expose
    private Long ExecTimes;

    /**
    * 总耗时。
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * 平均执行时间。
    */
    @SerializedName("QueryTimeAvg")
    @Expose
    private Float QueryTimeAvg;

    /**
    * 最大执行时间。
    */
    @SerializedName("QueryTimeMax")
    @Expose
    private Float QueryTimeMax;

    /**
    * 最小执行时间。
    */
    @SerializedName("QueryTimeMin")
    @Expose
    private Float QueryTimeMin;

    /**
    * 总耗时占比
    */
    @SerializedName("QueryTimeRatio")
    @Expose
    private Float QueryTimeRatio;

    /**
     * Get 命令模版。 
     * @return Cmd 命令模版。
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 命令模版。
     * @param Cmd 命令模版。
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get 命令详情。 
     * @return Detail 命令详情。
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 命令详情。
     * @param Detail 命令详情。
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 执行次数。 
     * @return ExecTimes 执行次数。
     */
    public Long getExecTimes() {
        return this.ExecTimes;
    }

    /**
     * Set 执行次数。
     * @param ExecTimes 执行次数。
     */
    public void setExecTimes(Long ExecTimes) {
        this.ExecTimes = ExecTimes;
    }

    /**
     * Get 总耗时。 
     * @return QueryTime 总耗时。
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set 总耗时。
     * @param QueryTime 总耗时。
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get 平均执行时间。 
     * @return QueryTimeAvg 平均执行时间。
     */
    public Float getQueryTimeAvg() {
        return this.QueryTimeAvg;
    }

    /**
     * Set 平均执行时间。
     * @param QueryTimeAvg 平均执行时间。
     */
    public void setQueryTimeAvg(Float QueryTimeAvg) {
        this.QueryTimeAvg = QueryTimeAvg;
    }

    /**
     * Get 最大执行时间。 
     * @return QueryTimeMax 最大执行时间。
     */
    public Float getQueryTimeMax() {
        return this.QueryTimeMax;
    }

    /**
     * Set 最大执行时间。
     * @param QueryTimeMax 最大执行时间。
     */
    public void setQueryTimeMax(Float QueryTimeMax) {
        this.QueryTimeMax = QueryTimeMax;
    }

    /**
     * Get 最小执行时间。 
     * @return QueryTimeMin 最小执行时间。
     */
    public Float getQueryTimeMin() {
        return this.QueryTimeMin;
    }

    /**
     * Set 最小执行时间。
     * @param QueryTimeMin 最小执行时间。
     */
    public void setQueryTimeMin(Float QueryTimeMin) {
        this.QueryTimeMin = QueryTimeMin;
    }

    /**
     * Get 总耗时占比 
     * @return QueryTimeRatio 总耗时占比
     */
    public Float getQueryTimeRatio() {
        return this.QueryTimeRatio;
    }

    /**
     * Set 总耗时占比
     * @param QueryTimeRatio 总耗时占比
     */
    public void setQueryTimeRatio(Float QueryTimeRatio) {
        this.QueryTimeRatio = QueryTimeRatio;
    }

    public SlowLogAgg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogAgg(SlowLogAgg source) {
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.ExecTimes != null) {
            this.ExecTimes = new Long(source.ExecTimes);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Float(source.QueryTime);
        }
        if (source.QueryTimeAvg != null) {
            this.QueryTimeAvg = new Float(source.QueryTimeAvg);
        }
        if (source.QueryTimeMax != null) {
            this.QueryTimeMax = new Float(source.QueryTimeMax);
        }
        if (source.QueryTimeMin != null) {
            this.QueryTimeMin = new Float(source.QueryTimeMin);
        }
        if (source.QueryTimeRatio != null) {
            this.QueryTimeRatio = new Float(source.QueryTimeRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "ExecTimes", this.ExecTimes);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "QueryTimeAvg", this.QueryTimeAvg);
        this.setParamSimple(map, prefix + "QueryTimeMax", this.QueryTimeMax);
        this.setParamSimple(map, prefix + "QueryTimeMin", this.QueryTimeMin);
        this.setParamSimple(map, prefix + "QueryTimeRatio", this.QueryTimeRatio);

    }
}

