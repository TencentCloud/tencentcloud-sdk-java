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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricConfig extends AbstractModel {

    /**
    * <p>允许使用的运算符</p>
    */
    @SerializedName("Operator")
    @Expose
    private String [] Operator;

    /**
    * <p>允许配置的数据周期，以秒为单位</p>
    */
    @SerializedName("Period")
    @Expose
    private Long [] Period;

    /**
    * <p>允许配置的持续周期个数</p>
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Long [] ContinuePeriod;

    /**
     * Get <p>允许使用的运算符</p> 
     * @return Operator <p>允许使用的运算符</p>
     */
    public String [] getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>允许使用的运算符</p>
     * @param Operator <p>允许使用的运算符</p>
     */
    public void setOperator(String [] Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>允许配置的数据周期，以秒为单位</p> 
     * @return Period <p>允许配置的数据周期，以秒为单位</p>
     */
    public Long [] getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>允许配置的数据周期，以秒为单位</p>
     * @param Period <p>允许配置的数据周期，以秒为单位</p>
     */
    public void setPeriod(Long [] Period) {
        this.Period = Period;
    }

    /**
     * Get <p>允许配置的持续周期个数</p> 
     * @return ContinuePeriod <p>允许配置的持续周期个数</p>
     */
    public Long [] getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set <p>允许配置的持续周期个数</p>
     * @param ContinuePeriod <p>允许配置的持续周期个数</p>
     */
    public void setContinuePeriod(Long [] ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    public MetricConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricConfig(MetricConfig source) {
        if (source.Operator != null) {
            this.Operator = new String[source.Operator.length];
            for (int i = 0; i < source.Operator.length; i++) {
                this.Operator[i] = new String(source.Operator[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long[source.Period.length];
            for (int i = 0; i < source.Period.length; i++) {
                this.Period[i] = new Long(source.Period[i]);
            }
        }
        if (source.ContinuePeriod != null) {
            this.ContinuePeriod = new Long[source.ContinuePeriod.length];
            for (int i = 0; i < source.ContinuePeriod.length; i++) {
                this.ContinuePeriod[i] = new Long(source.ContinuePeriod[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "Period.", this.Period);
        this.setParamArraySimple(map, prefix + "ContinuePeriod.", this.ContinuePeriod);

    }
}

