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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogPattern extends AbstractModel{

    /**
    * 慢日志模式
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * 最大执行时间
    */
    @SerializedName("MaxTime")
    @Expose
    private Long MaxTime;

    /**
    * 平均执行时间
    */
    @SerializedName("AverageTime")
    @Expose
    private Long AverageTime;

    /**
    * 该模式慢日志条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 慢日志模式 
     * @return Pattern 慢日志模式
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 慢日志模式
     * @param Pattern 慢日志模式
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get 最大执行时间 
     * @return MaxTime 最大执行时间
     */
    public Long getMaxTime() {
        return this.MaxTime;
    }

    /**
     * Set 最大执行时间
     * @param MaxTime 最大执行时间
     */
    public void setMaxTime(Long MaxTime) {
        this.MaxTime = MaxTime;
    }

    /**
     * Get 平均执行时间 
     * @return AverageTime 平均执行时间
     */
    public Long getAverageTime() {
        return this.AverageTime;
    }

    /**
     * Set 平均执行时间
     * @param AverageTime 平均执行时间
     */
    public void setAverageTime(Long AverageTime) {
        this.AverageTime = AverageTime;
    }

    /**
     * Get 该模式慢日志条数 
     * @return Total 该模式慢日志条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 该模式慢日志条数
     * @param Total 该模式慢日志条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "MaxTime", this.MaxTime);
        this.setParamSimple(map, prefix + "AverageTime", this.AverageTime);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

