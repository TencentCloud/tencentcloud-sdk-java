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

public class DescribePullTransformPushInfoListRequest extends AbstractModel {

    /**
    * utc开始时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * utc结束时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询，时间跨度为一个月。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 拉流转推任务Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get utc开始时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询。 
     * @return StartTime utc开始时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set utc开始时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询。
     * @param StartTime utc开始时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get utc结束时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询，时间跨度为一个月。 
     * @return EndTime utc结束时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询，时间跨度为一个月。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set utc结束时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询，时间跨度为一个月。
     * @param EndTime utc结束时间，格式为：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I，
例如：北京时间2019-01-08 10:00:00，对应utc时间为：2019-01-08T10:00:00+08:00。
支持最近一个月的查询，时间跨度为一个月。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 拉流转推任务Id。 
     * @return TaskId 拉流转推任务Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 拉流转推任务Id。
     * @param TaskId 拉流转推任务Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribePullTransformPushInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePullTransformPushInfoListRequest(DescribePullTransformPushInfoListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

