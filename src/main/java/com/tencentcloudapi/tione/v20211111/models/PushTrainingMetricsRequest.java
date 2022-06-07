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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushTrainingMetricsRequest extends AbstractModel{

    /**
    * 指标数据
    */
    @SerializedName("Data")
    @Expose
    private MetricData [] Data;

    /**
     * Get 指标数据 
     * @return Data 指标数据
     */
    public MetricData [] getData() {
        return this.Data;
    }

    /**
     * Set 指标数据
     * @param Data 指标数据
     */
    public void setData(MetricData [] Data) {
        this.Data = Data;
    }

    public PushTrainingMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PushTrainingMetricsRequest(PushTrainingMetricsRequest source) {
        if (source.Data != null) {
            this.Data = new MetricData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new MetricData(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

