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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallInNumberMetrics extends AbstractModel{

    /**
    * 线路号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 线路相关指标
    */
    @SerializedName("Metrics")
    @Expose
    private CallInMetrics Metrics;

    /**
    * 所属技能组相关指标
    */
    @SerializedName("SkillGroupMetrics")
    @Expose
    private CallInSkillGroupMetrics [] SkillGroupMetrics;

    /**
     * Get 线路号码 
     * @return Number 线路号码
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 线路号码
     * @param Number 线路号码
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 线路相关指标 
     * @return Metrics 线路相关指标
     */
    public CallInMetrics getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 线路相关指标
     * @param Metrics 线路相关指标
     */
    public void setMetrics(CallInMetrics Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 所属技能组相关指标 
     * @return SkillGroupMetrics 所属技能组相关指标
     */
    public CallInSkillGroupMetrics [] getSkillGroupMetrics() {
        return this.SkillGroupMetrics;
    }

    /**
     * Set 所属技能组相关指标
     * @param SkillGroupMetrics 所属技能组相关指标
     */
    public void setSkillGroupMetrics(CallInSkillGroupMetrics [] SkillGroupMetrics) {
        this.SkillGroupMetrics = SkillGroupMetrics;
    }

    public CallInNumberMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallInNumberMetrics(CallInNumberMetrics source) {
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Metrics != null) {
            this.Metrics = new CallInMetrics(source.Metrics);
        }
        if (source.SkillGroupMetrics != null) {
            this.SkillGroupMetrics = new CallInSkillGroupMetrics[source.SkillGroupMetrics.length];
            for (int i = 0; i < source.SkillGroupMetrics.length; i++) {
                this.SkillGroupMetrics[i] = new CallInSkillGroupMetrics(source.SkillGroupMetrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamArrayObj(map, prefix + "SkillGroupMetrics.", this.SkillGroupMetrics);

    }
}

