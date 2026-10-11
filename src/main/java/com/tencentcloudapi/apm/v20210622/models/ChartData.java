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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChartData extends AbstractModel {

    /**
    * <p>接口参数id列表</p>
    */
    @SerializedName("Series")
    @Expose
    private Series [] Series;

    /**
    * <p>接口参数列表</p>
    */
    @SerializedName("YAxis")
    @Expose
    private YAxis [] YAxis;

    /**
     * Get <p>接口参数id列表</p> 
     * @return Series <p>接口参数id列表</p>
     */
    public Series [] getSeries() {
        return this.Series;
    }

    /**
     * Set <p>接口参数id列表</p>
     * @param Series <p>接口参数id列表</p>
     */
    public void setSeries(Series [] Series) {
        this.Series = Series;
    }

    /**
     * Get <p>接口参数列表</p> 
     * @return YAxis <p>接口参数列表</p>
     */
    public YAxis [] getYAxis() {
        return this.YAxis;
    }

    /**
     * Set <p>接口参数列表</p>
     * @param YAxis <p>接口参数列表</p>
     */
    public void setYAxis(YAxis [] YAxis) {
        this.YAxis = YAxis;
    }

    public ChartData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChartData(ChartData source) {
        if (source.Series != null) {
            this.Series = new Series[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new Series(source.Series[i]);
            }
        }
        if (source.YAxis != null) {
            this.YAxis = new YAxis[source.YAxis.length];
            for (int i = 0; i < source.YAxis.length; i++) {
                this.YAxis[i] = new YAxis(source.YAxis[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Series.", this.Series);
        this.setParamArrayObj(map, prefix + "YAxis.", this.YAxis);

    }
}

