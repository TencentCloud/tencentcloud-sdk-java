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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EcdnData extends AbstractModel{

    /**
    * 查询指定的指标名称：Bandwidth，Flux，Request，Delay，状态码，LogBandwidth，LogFlux，LogRequest
    */
    @SerializedName("Metrics")
    @Expose
    private String [] Metrics;

    /**
    * 明细数据组合
    */
    @SerializedName("DetailData")
    @Expose
    private TimestampData [] DetailData;

    /**
     * Get 查询指定的指标名称：Bandwidth，Flux，Request，Delay，状态码，LogBandwidth，LogFlux，LogRequest 
     * @return Metrics 查询指定的指标名称：Bandwidth，Flux，Request，Delay，状态码，LogBandwidth，LogFlux，LogRequest
     */
    public String [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 查询指定的指标名称：Bandwidth，Flux，Request，Delay，状态码，LogBandwidth，LogFlux，LogRequest
     * @param Metrics 查询指定的指标名称：Bandwidth，Flux，Request，Delay，状态码，LogBandwidth，LogFlux，LogRequest
     */
    public void setMetrics(String [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 明细数据组合 
     * @return DetailData 明细数据组合
     */
    public TimestampData [] getDetailData() {
        return this.DetailData;
    }

    /**
     * Set 明细数据组合
     * @param DetailData 明细数据组合
     */
    public void setDetailData(TimestampData [] DetailData) {
        this.DetailData = DetailData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Metrics.", this.Metrics);
        this.setParamArrayObj(map, prefix + "DetailData.", this.DetailData);

    }
}

