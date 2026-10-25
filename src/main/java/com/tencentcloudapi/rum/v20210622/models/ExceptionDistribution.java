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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExceptionDistribution extends AbstractModel {

    /**
    * <p>按 TotalCount 降序、归一化值升序返回的完整维度行，行数不超过Limit；无数据返回空数组。</p>
    */
    @SerializedName("Rows")
    @Expose
    private ExceptionDimensionRow [] Rows;

    /**
     * Get <p>按 TotalCount 降序、归一化值升序返回的完整维度行，行数不超过Limit；无数据返回空数组。</p> 
     * @return Rows <p>按 TotalCount 降序、归一化值升序返回的完整维度行，行数不超过Limit；无数据返回空数组。</p>
     */
    public ExceptionDimensionRow [] getRows() {
        return this.Rows;
    }

    /**
     * Set <p>按 TotalCount 降序、归一化值升序返回的完整维度行，行数不超过Limit；无数据返回空数组。</p>
     * @param Rows <p>按 TotalCount 降序、归一化值升序返回的完整维度行，行数不超过Limit；无数据返回空数组。</p>
     */
    public void setRows(ExceptionDimensionRow [] Rows) {
        this.Rows = Rows;
    }

    public ExceptionDistribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptionDistribution(ExceptionDistribution source) {
        if (source.Rows != null) {
            this.Rows = new ExceptionDimensionRow[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new ExceptionDimensionRow(source.Rows[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);

    }
}

