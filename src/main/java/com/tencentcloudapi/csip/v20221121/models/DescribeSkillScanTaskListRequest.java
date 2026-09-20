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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSkillScanTaskListRequest extends AbstractModel {

    /**
    * 偏移量，默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，默认 10，上限 200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 开始时间，筛选上传时间不早于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
使用约束：StartTime 与 EndTime 要么同时传入，要么都不传；都不传时默认查询本月数据
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，筛选上传时间不晚于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
建议与 StartTime 同时传入；未传入时默认使用当前时间作为结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 排序方式
最大长度：128 字符
枚举值：
ASC：升序
DESC：降序（默认）
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段
最大长度：128 字符
枚举值：
InsertTime：上传时间（默认）
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 偏移量，默认 0 
     * @return Offset 偏移量，默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认 0
     * @param Offset 偏移量，默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，默认 10，上限 200 
     * @return Limit 每页数量，默认 10，上限 200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认 10，上限 200
     * @param Limit 每页数量，默认 10，上限 200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 开始时间，筛选上传时间不早于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
使用约束：StartTime 与 EndTime 要么同时传入，要么都不传；都不传时默认查询本月数据 
     * @return StartTime 开始时间，筛选上传时间不早于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
使用约束：StartTime 与 EndTime 要么同时传入，要么都不传；都不传时默认查询本月数据
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，筛选上传时间不早于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
使用约束：StartTime 与 EndTime 要么同时传入，要么都不传；都不传时默认查询本月数据
     * @param StartTime 开始时间，筛选上传时间不早于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
使用约束：StartTime 与 EndTime 要么同时传入，要么都不传；都不传时默认查询本月数据
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，筛选上传时间不晚于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
建议与 StartTime 同时传入；未传入时默认使用当前时间作为结束时间 
     * @return EndTime 结束时间，筛选上传时间不晚于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
建议与 StartTime 同时传入；未传入时默认使用当前时间作为结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，筛选上传时间不晚于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
建议与 StartTime 同时传入；未传入时默认使用当前时间作为结束时间
     * @param EndTime 结束时间，筛选上传时间不晚于该时刻的任务
参数格式：YYYY-MM-DD HH:mm:ss
最大长度：128 字符
建议与 StartTime 同时传入；未传入时默认使用当前时间作为结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序方式
最大长度：128 字符
枚举值：
ASC：升序
DESC：降序（默认） 
     * @return Order 排序方式
最大长度：128 字符
枚举值：
ASC：升序
DESC：降序（默认）
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式
最大长度：128 字符
枚举值：
ASC：升序
DESC：降序（默认）
     * @param Order 排序方式
最大长度：128 字符
枚举值：
ASC：升序
DESC：降序（默认）
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段
最大长度：128 字符
枚举值：
InsertTime：上传时间（默认） 
     * @return By 排序字段
最大长度：128 字符
枚举值：
InsertTime：上传时间（默认）
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
最大长度：128 字符
枚举值：
InsertTime：上传时间（默认）
     * @param By 排序字段
最大长度：128 字符
枚举值：
InsertTime：上传时间（默认）
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeSkillScanTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanTaskListRequest(DescribeSkillScanTaskListRequest source) {
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
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

