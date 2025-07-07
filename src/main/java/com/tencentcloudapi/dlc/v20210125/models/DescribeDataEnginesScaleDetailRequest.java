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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataEnginesScaleDetailRequest extends AbstractModel {

    /**
    * 引擎名称列表
    */
    @SerializedName("DataEngineNames")
    @Expose
    private String [] DataEngineNames;

    /**
    * 开始时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 引擎名称列表 
     * @return DataEngineNames 引擎名称列表
     */
    public String [] getDataEngineNames() {
        return this.DataEngineNames;
    }

    /**
     * Set 引擎名称列表
     * @param DataEngineNames 引擎名称列表
     */
    public void setDataEngineNames(String [] DataEngineNames) {
        this.DataEngineNames = DataEngineNames;
    }

    /**
     * Get 开始时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录 
     * @return StartTime 开始时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录
     * @param StartTime 开始时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录 
     * @return EndTime 结束时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录
     * @param EndTime 结束时间，时间格式：yyyy-MM-dd HH:mm:ss，最长查询一个月内的记录
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeDataEnginesScaleDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataEnginesScaleDetailRequest(DescribeDataEnginesScaleDetailRequest source) {
        if (source.DataEngineNames != null) {
            this.DataEngineNames = new String[source.DataEngineNames.length];
            for (int i = 0; i < source.DataEngineNames.length; i++) {
                this.DataEngineNames[i] = new String(source.DataEngineNames[i]);
            }
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
        this.setParamArraySimple(map, prefix + "DataEngineNames.", this.DataEngineNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

