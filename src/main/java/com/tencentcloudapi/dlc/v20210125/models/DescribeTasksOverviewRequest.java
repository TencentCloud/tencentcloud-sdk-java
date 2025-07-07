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

public class DescribeTasksOverviewRequest extends AbstractModel {

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 筛选条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 引擎名
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * DataEngine-dm8bjs29
    */
    @SerializedName("HouseIds")
    @Expose
    private String [] HouseIds;

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
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
     * Get 筛选条件 
     * @return Filters 筛选条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件
     * @param Filters 筛选条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 引擎名 
     * @return DataEngineName 引擎名
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 引擎名
     * @param DataEngineName 引擎名
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get DataEngine-dm8bjs29 
     * @return HouseIds DataEngine-dm8bjs29
     */
    public String [] getHouseIds() {
        return this.HouseIds;
    }

    /**
     * Set DataEngine-dm8bjs29
     * @param HouseIds DataEngine-dm8bjs29
     */
    public void setHouseIds(String [] HouseIds) {
        this.HouseIds = HouseIds;
    }

    public DescribeTasksOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksOverviewRequest(DescribeTasksOverviewRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.HouseIds != null) {
            this.HouseIds = new String[source.HouseIds.length];
            for (int i = 0; i < source.HouseIds.length; i++) {
                this.HouseIds[i] = new String(source.HouseIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamArraySimple(map, prefix + "HouseIds.", this.HouseIds);

    }
}

