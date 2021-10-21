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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTopDDoSDataRequest extends AbstractModel{

    /**
    * 查询Top数据的开始时间，格式为：2020-01-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，时间跨度要小于等于7天
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询Top的数量，不填默认值为10
    */
    @SerializedName("TopCount")
    @Expose
    private Long TopCount;

    /**
    * AttackIP表示查询攻击ip的top排行，AttackType表示攻击类型的top排行，为空默认为AttackType
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
     * Get 查询Top数据的开始时间，格式为：2020-01-01 00:00:00 
     * @return StartTime 查询Top数据的开始时间，格式为：2020-01-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询Top数据的开始时间，格式为：2020-01-01 00:00:00
     * @param StartTime 查询Top数据的开始时间，格式为：2020-01-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，时间跨度要小于等于7天 
     * @return EndTime 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，时间跨度要小于等于7天
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，时间跨度要小于等于7天
     * @param EndTime 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，时间跨度要小于等于7天
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询Top的数量，不填默认值为10 
     * @return TopCount 查询Top的数量，不填默认值为10
     */
    public Long getTopCount() {
        return this.TopCount;
    }

    /**
     * Set 查询Top的数量，不填默认值为10
     * @param TopCount 查询Top的数量，不填默认值为10
     */
    public void setTopCount(Long TopCount) {
        this.TopCount = TopCount;
    }

    /**
     * Get AttackIP表示查询攻击ip的top排行，AttackType表示攻击类型的top排行，为空默认为AttackType 
     * @return Metric AttackIP表示查询攻击ip的top排行，AttackType表示攻击类型的top排行，为空默认为AttackType
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set AttackIP表示查询攻击ip的top排行，AttackType表示攻击类型的top排行，为空默认为AttackType
     * @param Metric AttackIP表示查询攻击ip的top排行，AttackType表示攻击类型的top排行，为空默认为AttackType
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    public ListTopDDoSDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTopDDoSDataRequest(ListTopDDoSDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TopCount != null) {
            this.TopCount = new Long(source.TopCount);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TopCount", this.TopCount);
        this.setParamSimple(map, prefix + "Metric", this.Metric);

    }
}

