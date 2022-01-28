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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceDetailItems extends AbstractModel{

    /**
    * 数据详情列表
    */
    @SerializedName("Rows")
    @Expose
    private DataSourceDetail [] Rows;

    /**
    * 数据源列表总个数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 数据详情列表 
     * @return Rows 数据详情列表
     */
    public DataSourceDetail [] getRows() {
        return this.Rows;
    }

    /**
     * Set 数据详情列表
     * @param Rows 数据详情列表
     */
    public void setRows(DataSourceDetail [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get 数据源列表总个数 
     * @return Count 数据源列表总个数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数据源列表总个数
     * @param Count 数据源列表总个数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public DataSourceDetailItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceDetailItems(DataSourceDetailItems source) {
        if (source.Rows != null) {
            this.Rows = new DataSourceDetail[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new DataSourceDetail(source.Rows[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

