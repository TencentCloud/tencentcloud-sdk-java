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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataPointView extends AbstractModel {

    /**
    * 监控数据采集的时间

    */
    @SerializedName("Timestamps")
    @Expose
    private Long [] Timestamps;

    /**
    * 监控指标数据; 如果涉及到多个实例的监控数据的间隙时间，取值会为null

    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
     * Get 监控数据采集的时间
 
     * @return Timestamps 监控数据采集的时间

     */
    public Long [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set 监控数据采集的时间

     * @param Timestamps 监控数据采集的时间

     */
    public void setTimestamps(Long [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get 监控指标数据; 如果涉及到多个实例的监控数据的间隙时间，取值会为null
 
     * @return Values 监控指标数据; 如果涉及到多个实例的监控数据的间隙时间，取值会为null

     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set 监控指标数据; 如果涉及到多个实例的监控数据的间隙时间，取值会为null

     * @param Values 监控指标数据; 如果涉及到多个实例的监控数据的间隙时间，取值会为null

     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    public DataPointView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataPointView(DataPointView source) {
        if (source.Timestamps != null) {
            this.Timestamps = new Long[source.Timestamps.length];
            for (int i = 0; i < source.Timestamps.length; i++) {
                this.Timestamps[i] = new Long(source.Timestamps[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new Float[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Float(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

