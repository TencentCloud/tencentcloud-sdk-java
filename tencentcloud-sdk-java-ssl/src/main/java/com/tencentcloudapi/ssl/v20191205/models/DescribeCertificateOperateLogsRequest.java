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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateOperateLogsRequest extends AbstractModel{

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 请求日志数量，默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 开始时间，默认15天前。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，默认现在时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 请求日志数量，默认为20。 
     * @return Limit 请求日志数量，默认为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 请求日志数量，默认为20。
     * @param Limit 请求日志数量，默认为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 开始时间，默认15天前。 
     * @return StartTime 开始时间，默认15天前。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，默认15天前。
     * @param StartTime 开始时间，默认15天前。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，默认现在时间。 
     * @return EndTime 结束时间，默认现在时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，默认现在时间。
     * @param EndTime 结束时间，默认现在时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

