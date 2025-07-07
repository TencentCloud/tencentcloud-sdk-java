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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAutoScaleStrategyRequest extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自动扩缩容规则类型，1表示按照负载指标扩缩容，2表示按照时间规则扩缩容。
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * 规则ID。
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

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
     * Get 自动扩缩容规则类型，1表示按照负载指标扩缩容，2表示按照时间规则扩缩容。 
     * @return StrategyType 自动扩缩容规则类型，1表示按照负载指标扩缩容，2表示按照时间规则扩缩容。
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 自动扩缩容规则类型，1表示按照负载指标扩缩容，2表示按照时间规则扩缩容。
     * @param StrategyType 自动扩缩容规则类型，1表示按照负载指标扩缩容，2表示按照时间规则扩缩容。
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 规则ID。 
     * @return StrategyId 规则ID。
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 规则ID。
     * @param StrategyId 规则ID。
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
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

    public DeleteAutoScaleStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAutoScaleStrategyRequest(DeleteAutoScaleStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
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
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

