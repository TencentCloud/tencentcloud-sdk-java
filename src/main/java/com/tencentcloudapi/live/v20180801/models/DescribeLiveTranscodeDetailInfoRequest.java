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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveTranscodeDetailInfoRequest extends AbstractModel {

    /**
    * <p>推流域名。</p>
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * <p>流名称。</p>
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * <p>查询时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内某天的详细数据，截止到昨天。</p>
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * <p>页数，默认1，<br>不超过100页。</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>每页个数，默认20，<br>范围：[10,1000]。</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>起始天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据。</p>
    */
    @SerializedName("StartDayTime")
    @Expose
    private String StartDayTime;

    /**
    * <p>结束天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据，截止到昨天，注意DayTime 与（StartDayTime，EndDayTime）必须要传一个，如果都传，会以DayTime为准 。</p>
    */
    @SerializedName("EndDayTime")
    @Expose
    private String EndDayTime;

    /**
     * Get <p>推流域名。</p> 
     * @return PushDomain <p>推流域名。</p>
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set <p>推流域名。</p>
     * @param PushDomain <p>推流域名。</p>
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get <p>流名称。</p> 
     * @return StreamName <p>流名称。</p>
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set <p>流名称。</p>
     * @param StreamName <p>流名称。</p>
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get <p>查询时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内某天的详细数据，截止到昨天。</p> 
     * @return DayTime <p>查询时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内某天的详细数据，截止到昨天。</p>
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * Set <p>查询时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内某天的详细数据，截止到昨天。</p>
     * @param DayTime <p>查询时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内某天的详细数据，截止到昨天。</p>
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * Get <p>页数，默认1，<br>不超过100页。</p> 
     * @return PageNum <p>页数，默认1，<br>不超过100页。</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>页数，默认1，<br>不超过100页。</p>
     * @param PageNum <p>页数，默认1，<br>不超过100页。</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>每页个数，默认20，<br>范围：[10,1000]。</p> 
     * @return PageSize <p>每页个数，默认20，<br>范围：[10,1000]。</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页个数，默认20，<br>范围：[10,1000]。</p>
     * @param PageSize <p>每页个数，默认20，<br>范围：[10,1000]。</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>起始天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据。</p> 
     * @return StartDayTime <p>起始天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据。</p>
     */
    public String getStartDayTime() {
        return this.StartDayTime;
    }

    /**
     * Set <p>起始天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据。</p>
     * @param StartDayTime <p>起始天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据。</p>
     */
    public void setStartDayTime(String StartDayTime) {
        this.StartDayTime = StartDayTime;
    }

    /**
     * Get <p>结束天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据，截止到昨天，注意DayTime 与（StartDayTime，EndDayTime）必须要传一个，如果都传，会以DayTime为准 。</p> 
     * @return EndDayTime <p>结束天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据，截止到昨天，注意DayTime 与（StartDayTime，EndDayTime）必须要传一个，如果都传，会以DayTime为准 。</p>
     */
    public String getEndDayTime() {
        return this.EndDayTime;
    }

    /**
     * Set <p>结束天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据，截止到昨天，注意DayTime 与（StartDayTime，EndDayTime）必须要传一个，如果都传，会以DayTime为准 。</p>
     * @param EndDayTime <p>结束天时间，北京时间，<br>格式：yyyymmdd。<br>注意：支持查询近1个月内的详细数据，截止到昨天，注意DayTime 与（StartDayTime，EndDayTime）必须要传一个，如果都传，会以DayTime为准 。</p>
     */
    public void setEndDayTime(String EndDayTime) {
        this.EndDayTime = EndDayTime;
    }

    public DescribeLiveTranscodeDetailInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTranscodeDetailInfoRequest(DescribeLiveTranscodeDetailInfoRequest source) {
        if (source.PushDomain != null) {
            this.PushDomain = new String(source.PushDomain);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.DayTime != null) {
            this.DayTime = new String(source.DayTime);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StartDayTime != null) {
            this.StartDayTime = new String(source.StartDayTime);
        }
        if (source.EndDayTime != null) {
            this.EndDayTime = new String(source.EndDayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StartDayTime", this.StartDayTime);
        this.setParamSimple(map, prefix + "EndDayTime", this.EndDayTime);

    }
}

