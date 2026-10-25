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

public class TDEMSSETrendSeries extends AbstractModel {

    /**
    * <p>维度取值。空值保留为空字符串。</p>
    */
    @SerializedName("DimensionValue")
    @Expose
    private String DimensionValue;

    /**
    * <p>该取值在各个时间桶上的点。</p>
    */
    @SerializedName("Points")
    @Expose
    private TDEMSSETrendPoint [] Points;

    /**
     * Get <p>维度取值。空值保留为空字符串。</p> 
     * @return DimensionValue <p>维度取值。空值保留为空字符串。</p>
     */
    public String getDimensionValue() {
        return this.DimensionValue;
    }

    /**
     * Set <p>维度取值。空值保留为空字符串。</p>
     * @param DimensionValue <p>维度取值。空值保留为空字符串。</p>
     */
    public void setDimensionValue(String DimensionValue) {
        this.DimensionValue = DimensionValue;
    }

    /**
     * Get <p>该取值在各个时间桶上的点。</p> 
     * @return Points <p>该取值在各个时间桶上的点。</p>
     */
    public TDEMSSETrendPoint [] getPoints() {
        return this.Points;
    }

    /**
     * Set <p>该取值在各个时间桶上的点。</p>
     * @param Points <p>该取值在各个时间桶上的点。</p>
     */
    public void setPoints(TDEMSSETrendPoint [] Points) {
        this.Points = Points;
    }

    public TDEMSSETrendSeries() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TDEMSSETrendSeries(TDEMSSETrendSeries source) {
        if (source.DimensionValue != null) {
            this.DimensionValue = new String(source.DimensionValue);
        }
        if (source.Points != null) {
            this.Points = new TDEMSSETrendPoint[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new TDEMSSETrendPoint(source.Points[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DimensionValue", this.DimensionValue);
        this.setParamArrayObj(map, prefix + "Points.", this.Points);

    }
}

