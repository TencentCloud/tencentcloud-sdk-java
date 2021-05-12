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

public class DescribeDataRequest extends AbstractModel{

    /**
    * 起始时间，单位：秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 截止时间，单位：秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 时间粒度，1表示1天；2表示1小时；3表示1分钟；4表示10分钟；5表示30分钟
    */
    @SerializedName("TimeType")
    @Expose
    private Long TimeType;

    /**
    * 匹配code
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
     * Get 起始时间，单位：秒 
     * @return StartTime 起始时间，单位：秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，单位：秒
     * @param StartTime 起始时间，单位：秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 截止时间，单位：秒 
     * @return EndTime 截止时间，单位：秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止时间，单位：秒
     * @param EndTime 截止时间，单位：秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 时间粒度，1表示1天；2表示1小时；3表示1分钟；4表示10分钟；5表示30分钟 
     * @return TimeType 时间粒度，1表示1天；2表示1小时；3表示1分钟；4表示10分钟；5表示30分钟
     */
    public Long getTimeType() {
        return this.TimeType;
    }

    /**
     * Set 时间粒度，1表示1天；2表示1小时；3表示1分钟；4表示10分钟；5表示30分钟
     * @param TimeType 时间粒度，1表示1天；2表示1小时；3表示1分钟；4表示10分钟；5表示30分钟
     */
    public void setTimeType(Long TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get 匹配code 
     * @return MatchCode 匹配code
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set 匹配code
     * @param MatchCode 匹配code
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    public DescribeDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataRequest(DescribeDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TimeType != null) {
            this.TimeType = new Long(source.TimeType);
        }
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);

    }
}

