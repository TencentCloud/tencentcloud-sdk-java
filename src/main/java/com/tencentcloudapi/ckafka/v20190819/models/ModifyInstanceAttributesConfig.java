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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAttributesConfig extends AbstractModel {

    /**
    * 自动创建 true 表示开启，false 表示不开启
    */
    @SerializedName("AutoCreateTopicEnable")
    @Expose
    private Boolean AutoCreateTopicEnable;

    /**
    * 可选，如果auto.create.topic.enable设置为true没有设置该值时，默认设置为3
    */
    @SerializedName("DefaultNumPartitions")
    @Expose
    private Long DefaultNumPartitions;

    /**
    * 如果auto.create.topic.enable设置为true没有指定该值时默认设置为2
    */
    @SerializedName("DefaultReplicationFactor")
    @Expose
    private Long DefaultReplicationFactor;

    /**
     * Get 自动创建 true 表示开启，false 表示不开启 
     * @return AutoCreateTopicEnable 自动创建 true 表示开启，false 表示不开启
     */
    public Boolean getAutoCreateTopicEnable() {
        return this.AutoCreateTopicEnable;
    }

    /**
     * Set 自动创建 true 表示开启，false 表示不开启
     * @param AutoCreateTopicEnable 自动创建 true 表示开启，false 表示不开启
     */
    public void setAutoCreateTopicEnable(Boolean AutoCreateTopicEnable) {
        this.AutoCreateTopicEnable = AutoCreateTopicEnable;
    }

    /**
     * Get 可选，如果auto.create.topic.enable设置为true没有设置该值时，默认设置为3 
     * @return DefaultNumPartitions 可选，如果auto.create.topic.enable设置为true没有设置该值时，默认设置为3
     */
    public Long getDefaultNumPartitions() {
        return this.DefaultNumPartitions;
    }

    /**
     * Set 可选，如果auto.create.topic.enable设置为true没有设置该值时，默认设置为3
     * @param DefaultNumPartitions 可选，如果auto.create.topic.enable设置为true没有设置该值时，默认设置为3
     */
    public void setDefaultNumPartitions(Long DefaultNumPartitions) {
        this.DefaultNumPartitions = DefaultNumPartitions;
    }

    /**
     * Get 如果auto.create.topic.enable设置为true没有指定该值时默认设置为2 
     * @return DefaultReplicationFactor 如果auto.create.topic.enable设置为true没有指定该值时默认设置为2
     */
    public Long getDefaultReplicationFactor() {
        return this.DefaultReplicationFactor;
    }

    /**
     * Set 如果auto.create.topic.enable设置为true没有指定该值时默认设置为2
     * @param DefaultReplicationFactor 如果auto.create.topic.enable设置为true没有指定该值时默认设置为2
     */
    public void setDefaultReplicationFactor(Long DefaultReplicationFactor) {
        this.DefaultReplicationFactor = DefaultReplicationFactor;
    }

    public ModifyInstanceAttributesConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAttributesConfig(ModifyInstanceAttributesConfig source) {
        if (source.AutoCreateTopicEnable != null) {
            this.AutoCreateTopicEnable = new Boolean(source.AutoCreateTopicEnable);
        }
        if (source.DefaultNumPartitions != null) {
            this.DefaultNumPartitions = new Long(source.DefaultNumPartitions);
        }
        if (source.DefaultReplicationFactor != null) {
            this.DefaultReplicationFactor = new Long(source.DefaultReplicationFactor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoCreateTopicEnable", this.AutoCreateTopicEnable);
        this.setParamSimple(map, prefix + "DefaultNumPartitions", this.DefaultNumPartitions);
        this.setParamSimple(map, prefix + "DefaultReplicationFactor", this.DefaultReplicationFactor);

    }
}

