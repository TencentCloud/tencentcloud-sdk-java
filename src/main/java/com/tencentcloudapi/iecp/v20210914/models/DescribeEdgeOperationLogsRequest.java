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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeOperationLogsRequest extends AbstractModel{

    /**
    * 开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 翻页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段
    */
    @SerializedName("Sort")
    @Expose
    private FieldSort [] Sort;

    /**
    * 模块
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 过滤条件
    */
    @SerializedName("Condition")
    @Expose
    private OperationLogsCondition Condition;

    /**
     * Get 开始时间 
     * @return BeginTime 开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
     * @param BeginTime 开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
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
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 翻页大小 
     * @return Limit 翻页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页大小
     * @param Limit 翻页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段 
     * @return Sort 排序字段
     */
    public FieldSort [] getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段
     * @param Sort 排序字段
     */
    public void setSort(FieldSort [] Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 模块 
     * @return Module 模块
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块
     * @param Module 模块
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 过滤条件 
     * @return Condition 过滤条件
     */
    public OperationLogsCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set 过滤条件
     * @param Condition 过滤条件
     */
    public void setCondition(OperationLogsCondition Condition) {
        this.Condition = Condition;
    }

    public DescribeEdgeOperationLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeOperationLogsRequest(DescribeEdgeOperationLogsRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Sort != null) {
            this.Sort = new FieldSort[source.Sort.length];
            for (int i = 0; i < source.Sort.length; i++) {
                this.Sort[i] = new FieldSort(source.Sort[i]);
            }
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Condition != null) {
            this.Condition = new OperationLogsCondition(source.Condition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamObj(map, prefix + "Condition.", this.Condition);

    }
}

