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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTransformationRequest extends AbstractModel{

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 转换器id
    */
    @SerializedName("TransformationId")
    @Expose
    private String TransformationId;

    /**
    * 一个转换规则列表，当前仅限定一个
    */
    @SerializedName("Transformations")
    @Expose
    private Transformation [] Transformations;

    /**
     * Get 事件集ID 
     * @return EventBusId 事件集ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID
     * @param EventBusId 事件集ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 转换器id 
     * @return TransformationId 转换器id
     */
    public String getTransformationId() {
        return this.TransformationId;
    }

    /**
     * Set 转换器id
     * @param TransformationId 转换器id
     */
    public void setTransformationId(String TransformationId) {
        this.TransformationId = TransformationId;
    }

    /**
     * Get 一个转换规则列表，当前仅限定一个 
     * @return Transformations 一个转换规则列表，当前仅限定一个
     */
    public Transformation [] getTransformations() {
        return this.Transformations;
    }

    /**
     * Set 一个转换规则列表，当前仅限定一个
     * @param Transformations 一个转换规则列表，当前仅限定一个
     */
    public void setTransformations(Transformation [] Transformations) {
        this.Transformations = Transformations;
    }

    public UpdateTransformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTransformationRequest(UpdateTransformationRequest source) {
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.TransformationId != null) {
            this.TransformationId = new String(source.TransformationId);
        }
        if (source.Transformations != null) {
            this.Transformations = new Transformation[source.Transformations.length];
            for (int i = 0; i < source.Transformations.length; i++) {
                this.Transformations[i] = new Transformation(source.Transformations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "TransformationId", this.TransformationId);
        this.setParamArrayObj(map, prefix + "Transformations.", this.Transformations);

    }
}

