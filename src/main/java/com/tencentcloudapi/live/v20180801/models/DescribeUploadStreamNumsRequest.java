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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUploadStreamNumsRequest extends AbstractModel{

    /**
    * 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过31天。支持最近31天的数据查询
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 直播域名，若不填，表示总体数据。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get 起始时间点，格式为yyyy-mm-dd HH:MM:SS。 
     * @return StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     * @param StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过31天。支持最近31天的数据查询 
     * @return EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过31天。支持最近31天的数据查询
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过31天。支持最近31天的数据查询
     * @param EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过31天。支持最近31天的数据查询
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 直播域名，若不填，表示总体数据。 
     * @return Domains 直播域名，若不填，表示总体数据。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 直播域名，若不填，表示总体数据。
     * @param Domains 直播域名，若不填，表示总体数据。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。 
     * @return Granularity 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。
     * @param Granularity 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    public DescribeUploadStreamNumsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUploadStreamNumsRequest(DescribeUploadStreamNumsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

