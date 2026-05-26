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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharedSubscriptionGroupWithSubscriptions extends AbstractModel {

    /**
    * <p>共享组名</p>
    */
    @SerializedName("SharedName")
    @Expose
    private String SharedName;

    /**
    * <p>创建时间</p><p>单位：毫秒级时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p><p>单位：毫秒级时间戳</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>订阅表达式</p>
    */
    @SerializedName("TopicFilters")
    @Expose
    private String [] TopicFilters;

    /**
     * Get <p>共享组名</p> 
     * @return SharedName <p>共享组名</p>
     */
    public String getSharedName() {
        return this.SharedName;
    }

    /**
     * Set <p>共享组名</p>
     * @param SharedName <p>共享组名</p>
     */
    public void setSharedName(String SharedName) {
        this.SharedName = SharedName;
    }

    /**
     * Get <p>创建时间</p><p>单位：毫秒级时间戳</p> 
     * @return CreateTime <p>创建时间</p><p>单位：毫秒级时间戳</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>单位：毫秒级时间戳</p>
     * @param CreateTime <p>创建时间</p><p>单位：毫秒级时间戳</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>单位：毫秒级时间戳</p> 
     * @return UpdateTime <p>更新时间</p><p>单位：毫秒级时间戳</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>单位：毫秒级时间戳</p>
     * @param UpdateTime <p>更新时间</p><p>单位：毫秒级时间戳</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>订阅表达式</p> 
     * @return TopicFilters <p>订阅表达式</p>
     */
    public String [] getTopicFilters() {
        return this.TopicFilters;
    }

    /**
     * Set <p>订阅表达式</p>
     * @param TopicFilters <p>订阅表达式</p>
     */
    public void setTopicFilters(String [] TopicFilters) {
        this.TopicFilters = TopicFilters;
    }

    public SharedSubscriptionGroupWithSubscriptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharedSubscriptionGroupWithSubscriptions(SharedSubscriptionGroupWithSubscriptions source) {
        if (source.SharedName != null) {
            this.SharedName = new String(source.SharedName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.TopicFilters != null) {
            this.TopicFilters = new String[source.TopicFilters.length];
            for (int i = 0; i < source.TopicFilters.length; i++) {
                this.TopicFilters[i] = new String(source.TopicFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SharedName", this.SharedName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "TopicFilters.", this.TopicFilters);

    }
}

