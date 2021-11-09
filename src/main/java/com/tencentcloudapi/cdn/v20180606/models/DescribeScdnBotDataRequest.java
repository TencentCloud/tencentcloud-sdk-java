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

public class DescribeScdnBotDataRequest extends AbstractModel{

    /**
    * 开始时间
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
    * mainland 大陆地区 overseas境外地区
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 取值："2min"或者"hour"，表示查询2分钟或者1小时粒度的数据，如果查询时间范围>1天，则强制返回1小时粒度数据
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 域名数组，多选域名时，使用此参数,不填写表示查询所有域名的数据（AppID维度数据）
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
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

    /**
     * Get mainland 大陆地区 overseas境外地区 
     * @return Area mainland 大陆地区 overseas境外地区
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set mainland 大陆地区 overseas境外地区
     * @param Area mainland 大陆地区 overseas境外地区
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 取值："2min"或者"hour"，表示查询2分钟或者1小时粒度的数据，如果查询时间范围>1天，则强制返回1小时粒度数据 
     * @return Interval 取值："2min"或者"hour"，表示查询2分钟或者1小时粒度的数据，如果查询时间范围>1天，则强制返回1小时粒度数据
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 取值："2min"或者"hour"，表示查询2分钟或者1小时粒度的数据，如果查询时间范围>1天，则强制返回1小时粒度数据
     * @param Interval 取值："2min"或者"hour"，表示查询2分钟或者1小时粒度的数据，如果查询时间范围>1天，则强制返回1小时粒度数据
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 域名数组，多选域名时，使用此参数,不填写表示查询所有域名的数据（AppID维度数据） 
     * @return Domains 域名数组，多选域名时，使用此参数,不填写表示查询所有域名的数据（AppID维度数据）
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名数组，多选域名时，使用此参数,不填写表示查询所有域名的数据（AppID维度数据）
     * @param Domains 域名数组，多选域名时，使用此参数,不填写表示查询所有域名的数据（AppID维度数据）
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public DescribeScdnBotDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScdnBotDataRequest(DescribeScdnBotDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

