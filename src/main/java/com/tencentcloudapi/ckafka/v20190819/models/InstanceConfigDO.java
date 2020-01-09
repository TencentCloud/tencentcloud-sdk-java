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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfigDO extends AbstractModel{

    /**
    * 是否自动创建主题
    */
    @SerializedName("AutoCreateTopicsEnable")
    @Expose
    private Boolean AutoCreateTopicsEnable;

    /**
    * 分区数
    */
    @SerializedName("DefaultNumPartitions")
    @Expose
    private Long DefaultNumPartitions;

    /**
    * 默认的复制Factor
    */
    @SerializedName("DefaultReplicationFactor")
    @Expose
    private Long DefaultReplicationFactor;

    /**
     * Get 是否自动创建主题 
     * @return AutoCreateTopicsEnable 是否自动创建主题
     */
    public Boolean getAutoCreateTopicsEnable() {
        return this.AutoCreateTopicsEnable;
    }

    /**
     * Set 是否自动创建主题
     * @param AutoCreateTopicsEnable 是否自动创建主题
     */
    public void setAutoCreateTopicsEnable(Boolean AutoCreateTopicsEnable) {
        this.AutoCreateTopicsEnable = AutoCreateTopicsEnable;
    }

    /**
     * Get 分区数 
     * @return DefaultNumPartitions 分区数
     */
    public Long getDefaultNumPartitions() {
        return this.DefaultNumPartitions;
    }

    /**
     * Set 分区数
     * @param DefaultNumPartitions 分区数
     */
    public void setDefaultNumPartitions(Long DefaultNumPartitions) {
        this.DefaultNumPartitions = DefaultNumPartitions;
    }

    /**
     * Get 默认的复制Factor 
     * @return DefaultReplicationFactor 默认的复制Factor
     */
    public Long getDefaultReplicationFactor() {
        return this.DefaultReplicationFactor;
    }

    /**
     * Set 默认的复制Factor
     * @param DefaultReplicationFactor 默认的复制Factor
     */
    public void setDefaultReplicationFactor(Long DefaultReplicationFactor) {
        this.DefaultReplicationFactor = DefaultReplicationFactor;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoCreateTopicsEnable", this.AutoCreateTopicsEnable);
        this.setParamSimple(map, prefix + "DefaultNumPartitions", this.DefaultNumPartitions);
        this.setParamSimple(map, prefix + "DefaultReplicationFactor", this.DefaultReplicationFactor);

    }
}

