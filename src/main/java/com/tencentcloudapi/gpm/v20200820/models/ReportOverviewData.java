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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportOverviewData extends AbstractModel{

    /**
    * 总次数
    */
    @SerializedName("TotalTimes")
    @Expose
    private String TotalTimes;

    /**
    * 成功率
    */
    @SerializedName("SuccessPercent")
    @Expose
    private Float SuccessPercent;

    /**
    * 超时率
    */
    @SerializedName("TimeoutPercent")
    @Expose
    private Float TimeoutPercent;

    /**
    * 失败率
    */
    @SerializedName("FailPercent")
    @Expose
    private Float FailPercent;

    /**
    * 平均匹配时间
    */
    @SerializedName("AverageSec")
    @Expose
    private Float AverageSec;

    /**
     * Get 总次数 
     * @return TotalTimes 总次数
     */
    public String getTotalTimes() {
        return this.TotalTimes;
    }

    /**
     * Set 总次数
     * @param TotalTimes 总次数
     */
    public void setTotalTimes(String TotalTimes) {
        this.TotalTimes = TotalTimes;
    }

    /**
     * Get 成功率 
     * @return SuccessPercent 成功率
     */
    public Float getSuccessPercent() {
        return this.SuccessPercent;
    }

    /**
     * Set 成功率
     * @param SuccessPercent 成功率
     */
    public void setSuccessPercent(Float SuccessPercent) {
        this.SuccessPercent = SuccessPercent;
    }

    /**
     * Get 超时率 
     * @return TimeoutPercent 超时率
     */
    public Float getTimeoutPercent() {
        return this.TimeoutPercent;
    }

    /**
     * Set 超时率
     * @param TimeoutPercent 超时率
     */
    public void setTimeoutPercent(Float TimeoutPercent) {
        this.TimeoutPercent = TimeoutPercent;
    }

    /**
     * Get 失败率 
     * @return FailPercent 失败率
     */
    public Float getFailPercent() {
        return this.FailPercent;
    }

    /**
     * Set 失败率
     * @param FailPercent 失败率
     */
    public void setFailPercent(Float FailPercent) {
        this.FailPercent = FailPercent;
    }

    /**
     * Get 平均匹配时间 
     * @return AverageSec 平均匹配时间
     */
    public Float getAverageSec() {
        return this.AverageSec;
    }

    /**
     * Set 平均匹配时间
     * @param AverageSec 平均匹配时间
     */
    public void setAverageSec(Float AverageSec) {
        this.AverageSec = AverageSec;
    }

    public ReportOverviewData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportOverviewData(ReportOverviewData source) {
        if (source.TotalTimes != null) {
            this.TotalTimes = new String(source.TotalTimes);
        }
        if (source.SuccessPercent != null) {
            this.SuccessPercent = new Float(source.SuccessPercent);
        }
        if (source.TimeoutPercent != null) {
            this.TimeoutPercent = new Float(source.TimeoutPercent);
        }
        if (source.FailPercent != null) {
            this.FailPercent = new Float(source.FailPercent);
        }
        if (source.AverageSec != null) {
            this.AverageSec = new Float(source.AverageSec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTimes", this.TotalTimes);
        this.setParamSimple(map, prefix + "SuccessPercent", this.SuccessPercent);
        this.setParamSimple(map, prefix + "TimeoutPercent", this.TimeoutPercent);
        this.setParamSimple(map, prefix + "FailPercent", this.FailPercent);
        this.setParamSimple(map, prefix + "AverageSec", this.AverageSec);

    }
}

