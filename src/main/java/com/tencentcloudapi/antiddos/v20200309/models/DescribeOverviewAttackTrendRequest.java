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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOverviewAttackTrendRequest extends AbstractModel{

    /**
    * 攻击类型，取值ddos， cc
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 纬度，当前仅支持attackcount
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 周期，当前仅支持86400
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 攻击类型，取值ddos， cc 
     * @return Type 攻击类型，取值ddos， cc
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 攻击类型，取值ddos， cc
     * @param Type 攻击类型，取值ddos， cc
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 纬度，当前仅支持attackcount 
     * @return Dimension 纬度，当前仅支持attackcount
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 纬度，当前仅支持attackcount
     * @param Dimension 纬度，当前仅支持attackcount
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 周期，当前仅支持86400 
     * @return Period 周期，当前仅支持86400
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 周期，当前仅支持86400
     * @param Period 周期，当前仅支持86400
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeOverviewAttackTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOverviewAttackTrendRequest(DescribeOverviewAttackTrendRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

