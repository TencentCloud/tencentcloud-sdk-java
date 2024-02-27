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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddMetricScaleStrategyRequest extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 1表示按负载规则扩容，2表示按时间规则扩容。
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * 按时间扩缩容的规则。
    */
    @SerializedName("TimeAutoScaleStrategy")
    @Expose
    private TimeAutoScaleStrategy TimeAutoScaleStrategy;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 1表示按负载规则扩容，2表示按时间规则扩容。 
     * @return StrategyType 1表示按负载规则扩容，2表示按时间规则扩容。
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 1表示按负载规则扩容，2表示按时间规则扩容。
     * @param StrategyType 1表示按负载规则扩容，2表示按时间规则扩容。
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 按时间扩缩容的规则。 
     * @return TimeAutoScaleStrategy 按时间扩缩容的规则。
     */
    public TimeAutoScaleStrategy getTimeAutoScaleStrategy() {
        return this.TimeAutoScaleStrategy;
    }

    /**
     * Set 按时间扩缩容的规则。
     * @param TimeAutoScaleStrategy 按时间扩缩容的规则。
     */
    public void setTimeAutoScaleStrategy(TimeAutoScaleStrategy TimeAutoScaleStrategy) {
        this.TimeAutoScaleStrategy = TimeAutoScaleStrategy;
    }

    public AddMetricScaleStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddMetricScaleStrategyRequest(AddMetricScaleStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.TimeAutoScaleStrategy != null) {
            this.TimeAutoScaleStrategy = new TimeAutoScaleStrategy(source.TimeAutoScaleStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamObj(map, prefix + "TimeAutoScaleStrategy.", this.TimeAutoScaleStrategy);

    }
}

