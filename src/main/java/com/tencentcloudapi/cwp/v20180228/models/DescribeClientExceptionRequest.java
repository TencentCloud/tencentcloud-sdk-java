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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClientExceptionRequest extends AbstractModel{

    /**
    * 客户端异常类型 1:客户端离线，2:客户端卸载
    */
    @SerializedName("ExceptionType")
    @Expose
    private Long ExceptionType;

    /**
    * 分页的偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页单页限制数目，不为0，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 起始时间 `2006-01-02 15:04:05` 格式
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间 `2006-01-02 15:04:05` 格式
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 客户端异常类型 1:客户端离线，2:客户端卸载 
     * @return ExceptionType 客户端异常类型 1:客户端离线，2:客户端卸载
     */
    public Long getExceptionType() {
        return this.ExceptionType;
    }

    /**
     * Set 客户端异常类型 1:客户端离线，2:客户端卸载
     * @param ExceptionType 客户端异常类型 1:客户端离线，2:客户端卸载
     */
    public void setExceptionType(Long ExceptionType) {
        this.ExceptionType = ExceptionType;
    }

    /**
     * Get 分页的偏移量 
     * @return Offset 分页的偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量
     * @param Offset 分页的偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页单页限制数目，不为0，最大值100 
     * @return Limit 分页单页限制数目，不为0，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页单页限制数目，不为0，最大值100
     * @param Limit 分页单页限制数目，不为0，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 起始时间 `2006-01-02 15:04:05` 格式 
     * @return StartTime 起始时间 `2006-01-02 15:04:05` 格式
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间 `2006-01-02 15:04:05` 格式
     * @param StartTime 起始时间 `2006-01-02 15:04:05` 格式
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 `2006-01-02 15:04:05` 格式 
     * @return EndTime 结束时间 `2006-01-02 15:04:05` 格式
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间 `2006-01-02 15:04:05` 格式
     * @param EndTime 结束时间 `2006-01-02 15:04:05` 格式
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeClientExceptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClientExceptionRequest(DescribeClientExceptionRequest source) {
        if (source.ExceptionType != null) {
            this.ExceptionType = new Long(source.ExceptionType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "ExceptionType", this.ExceptionType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

