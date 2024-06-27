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

public class ModifyAutoScaleStrategyRequest extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自动扩缩容规则类型，1表示按负载指标扩缩容，2表示按时间扩缩容。
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * 按负载扩缩容的指标。
    */
    @SerializedName("LoadAutoScaleStrategies")
    @Expose
    private LoadAutoScaleStrategy [] LoadAutoScaleStrategies;

    /**
    * 按时间扩缩容的规则。
    */
    @SerializedName("TimeAutoScaleStrategies")
    @Expose
    private TimeAutoScaleStrategy [] TimeAutoScaleStrategies;

    /**
    * 伸缩组Id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

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
     * Get 自动扩缩容规则类型，1表示按负载指标扩缩容，2表示按时间扩缩容。 
     * @return StrategyType 自动扩缩容规则类型，1表示按负载指标扩缩容，2表示按时间扩缩容。
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 自动扩缩容规则类型，1表示按负载指标扩缩容，2表示按时间扩缩容。
     * @param StrategyType 自动扩缩容规则类型，1表示按负载指标扩缩容，2表示按时间扩缩容。
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 按负载扩缩容的指标。 
     * @return LoadAutoScaleStrategies 按负载扩缩容的指标。
     */
    public LoadAutoScaleStrategy [] getLoadAutoScaleStrategies() {
        return this.LoadAutoScaleStrategies;
    }

    /**
     * Set 按负载扩缩容的指标。
     * @param LoadAutoScaleStrategies 按负载扩缩容的指标。
     */
    public void setLoadAutoScaleStrategies(LoadAutoScaleStrategy [] LoadAutoScaleStrategies) {
        this.LoadAutoScaleStrategies = LoadAutoScaleStrategies;
    }

    /**
     * Get 按时间扩缩容的规则。 
     * @return TimeAutoScaleStrategies 按时间扩缩容的规则。
     */
    public TimeAutoScaleStrategy [] getTimeAutoScaleStrategies() {
        return this.TimeAutoScaleStrategies;
    }

    /**
     * Set 按时间扩缩容的规则。
     * @param TimeAutoScaleStrategies 按时间扩缩容的规则。
     */
    public void setTimeAutoScaleStrategies(TimeAutoScaleStrategy [] TimeAutoScaleStrategies) {
        this.TimeAutoScaleStrategies = TimeAutoScaleStrategies;
    }

    /**
     * Get 伸缩组Id 
     * @return GroupId 伸缩组Id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 伸缩组Id
     * @param GroupId 伸缩组Id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    public ModifyAutoScaleStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoScaleStrategyRequest(ModifyAutoScaleStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.LoadAutoScaleStrategies != null) {
            this.LoadAutoScaleStrategies = new LoadAutoScaleStrategy[source.LoadAutoScaleStrategies.length];
            for (int i = 0; i < source.LoadAutoScaleStrategies.length; i++) {
                this.LoadAutoScaleStrategies[i] = new LoadAutoScaleStrategy(source.LoadAutoScaleStrategies[i]);
            }
        }
        if (source.TimeAutoScaleStrategies != null) {
            this.TimeAutoScaleStrategies = new TimeAutoScaleStrategy[source.TimeAutoScaleStrategies.length];
            for (int i = 0; i < source.TimeAutoScaleStrategies.length; i++) {
                this.TimeAutoScaleStrategies[i] = new TimeAutoScaleStrategy(source.TimeAutoScaleStrategies[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamArrayObj(map, prefix + "LoadAutoScaleStrategies.", this.LoadAutoScaleStrategies);
        this.setParamArrayObj(map, prefix + "TimeAutoScaleStrategies.", this.TimeAutoScaleStrategies);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

