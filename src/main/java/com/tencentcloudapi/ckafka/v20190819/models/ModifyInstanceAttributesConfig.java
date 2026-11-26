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
    * <p>自动创建 true 表示开启，false 表示不开启</p>
    */
    @SerializedName("AutoCreateTopicEnable")
    @Expose
    private Boolean AutoCreateTopicEnable;

    /**
    * <p>新创建主题的默认分区数,如果AutoCreateTopicEnable设置为true没有设置该值时，默认设置为3</p>
    */
    @SerializedName("DefaultNumPartitions")
    @Expose
    private Long DefaultNumPartitions;

    /**
    * <p>新创建主题的默认副本数</p><p>如果AutoCreateTopicEnable设置为true时，该值必须大于0</p>
    */
    @SerializedName("DefaultReplicationFactor")
    @Expose
    private Long DefaultReplicationFactor;

    /**
     * Get <p>自动创建 true 表示开启，false 表示不开启</p> 
     * @return AutoCreateTopicEnable <p>自动创建 true 表示开启，false 表示不开启</p>
     */
    public Boolean getAutoCreateTopicEnable() {
        return this.AutoCreateTopicEnable;
    }

    /**
     * Set <p>自动创建 true 表示开启，false 表示不开启</p>
     * @param AutoCreateTopicEnable <p>自动创建 true 表示开启，false 表示不开启</p>
     */
    public void setAutoCreateTopicEnable(Boolean AutoCreateTopicEnable) {
        this.AutoCreateTopicEnable = AutoCreateTopicEnable;
    }

    /**
     * Get <p>新创建主题的默认分区数,如果AutoCreateTopicEnable设置为true没有设置该值时，默认设置为3</p> 
     * @return DefaultNumPartitions <p>新创建主题的默认分区数,如果AutoCreateTopicEnable设置为true没有设置该值时，默认设置为3</p>
     */
    public Long getDefaultNumPartitions() {
        return this.DefaultNumPartitions;
    }

    /**
     * Set <p>新创建主题的默认分区数,如果AutoCreateTopicEnable设置为true没有设置该值时，默认设置为3</p>
     * @param DefaultNumPartitions <p>新创建主题的默认分区数,如果AutoCreateTopicEnable设置为true没有设置该值时，默认设置为3</p>
     */
    public void setDefaultNumPartitions(Long DefaultNumPartitions) {
        this.DefaultNumPartitions = DefaultNumPartitions;
    }

    /**
     * Get <p>新创建主题的默认副本数</p><p>如果AutoCreateTopicEnable设置为true时，该值必须大于0</p> 
     * @return DefaultReplicationFactor <p>新创建主题的默认副本数</p><p>如果AutoCreateTopicEnable设置为true时，该值必须大于0</p>
     */
    public Long getDefaultReplicationFactor() {
        return this.DefaultReplicationFactor;
    }

    /**
     * Set <p>新创建主题的默认副本数</p><p>如果AutoCreateTopicEnable设置为true时，该值必须大于0</p>
     * @param DefaultReplicationFactor <p>新创建主题的默认副本数</p><p>如果AutoCreateTopicEnable设置为true时，该值必须大于0</p>
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

