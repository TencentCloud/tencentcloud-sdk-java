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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSearchCondition extends AbstractModel{

    /**
    * 任务调度周期类型
    */
    @SerializedName("CycleList")
    @Expose
    private String [] CycleList;

    /**
    * 起始时间
    */
    @SerializedName("DateFrom")
    @Expose
    private String DateFrom;

    /**
    * 截止时间
    */
    @SerializedName("DateTo")
    @Expose
    private String DateTo;

    /**
    * 实例过滤条件
    */
    @SerializedName("Instance")
    @Expose
    private InstanceCondition Instance;

    /**
    * 模糊查询关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 排序方式
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 排序字段
    */
    @SerializedName("SortCol")
    @Expose
    private String SortCol;

    /**
    * 实例状态类型
    */
    @SerializedName("StateList")
    @Expose
    private String [] StateList;

    /**
     * Get 任务调度周期类型 
     * @return CycleList 任务调度周期类型
     */
    public String [] getCycleList() {
        return this.CycleList;
    }

    /**
     * Set 任务调度周期类型
     * @param CycleList 任务调度周期类型
     */
    public void setCycleList(String [] CycleList) {
        this.CycleList = CycleList;
    }

    /**
     * Get 起始时间 
     * @return DateFrom 起始时间
     */
    public String getDateFrom() {
        return this.DateFrom;
    }

    /**
     * Set 起始时间
     * @param DateFrom 起始时间
     */
    public void setDateFrom(String DateFrom) {
        this.DateFrom = DateFrom;
    }

    /**
     * Get 截止时间 
     * @return DateTo 截止时间
     */
    public String getDateTo() {
        return this.DateTo;
    }

    /**
     * Set 截止时间
     * @param DateTo 截止时间
     */
    public void setDateTo(String DateTo) {
        this.DateTo = DateTo;
    }

    /**
     * Get 实例过滤条件 
     * @return Instance 实例过滤条件
     */
    public InstanceCondition getInstance() {
        return this.Instance;
    }

    /**
     * Set 实例过滤条件
     * @param Instance 实例过滤条件
     */
    public void setInstance(InstanceCondition Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 模糊查询关键字 
     * @return Keyword 模糊查询关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 模糊查询关键字
     * @param Keyword 模糊查询关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 排序方式 
     * @return Sort 排序方式
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式
     * @param Sort 排序方式
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 排序字段 
     * @return SortCol 排序字段
     */
    public String getSortCol() {
        return this.SortCol;
    }

    /**
     * Set 排序字段
     * @param SortCol 排序字段
     */
    public void setSortCol(String SortCol) {
        this.SortCol = SortCol;
    }

    /**
     * Get 实例状态类型 
     * @return StateList 实例状态类型
     */
    public String [] getStateList() {
        return this.StateList;
    }

    /**
     * Set 实例状态类型
     * @param StateList 实例状态类型
     */
    public void setStateList(String [] StateList) {
        this.StateList = StateList;
    }

    public InstanceSearchCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSearchCondition(InstanceSearchCondition source) {
        if (source.CycleList != null) {
            this.CycleList = new String[source.CycleList.length];
            for (int i = 0; i < source.CycleList.length; i++) {
                this.CycleList[i] = new String(source.CycleList[i]);
            }
        }
        if (source.DateFrom != null) {
            this.DateFrom = new String(source.DateFrom);
        }
        if (source.DateTo != null) {
            this.DateTo = new String(source.DateTo);
        }
        if (source.Instance != null) {
            this.Instance = new InstanceCondition(source.Instance);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.SortCol != null) {
            this.SortCol = new String(source.SortCol);
        }
        if (source.StateList != null) {
            this.StateList = new String[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new String(source.StateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CycleList.", this.CycleList);
        this.setParamSimple(map, prefix + "DateFrom", this.DateFrom);
        this.setParamSimple(map, prefix + "DateTo", this.DateTo);
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortCol", this.SortCol);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);

    }
}

