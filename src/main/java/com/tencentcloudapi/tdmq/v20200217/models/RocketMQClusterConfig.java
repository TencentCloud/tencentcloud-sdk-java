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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQClusterConfig extends AbstractModel{

    /**
    * 单命名空间TPS上线
    */
    @SerializedName("MaxTpsPerNamespace")
    @Expose
    private Long MaxTpsPerNamespace;

    /**
    * 最大命名空间数量
    */
    @SerializedName("MaxNamespaceNum")
    @Expose
    private Long MaxNamespaceNum;

    /**
    * 已使用命名空间数量
    */
    @SerializedName("UsedNamespaceNum")
    @Expose
    private Long UsedNamespaceNum;

    /**
    * 最大Topic数量
    */
    @SerializedName("MaxTopicNum")
    @Expose
    private Long MaxTopicNum;

    /**
    * 已使用Topic数量
    */
    @SerializedName("UsedTopicNum")
    @Expose
    private Long UsedTopicNum;

    /**
    * 最大Group数量
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
    * 已使用Group数量
    */
    @SerializedName("UsedGroupNum")
    @Expose
    private Long UsedGroupNum;

    /**
    * 消息最大保留时间，以毫秒为单位
    */
    @SerializedName("MaxRetentionTime")
    @Expose
    private Long MaxRetentionTime;

    /**
    * 消息最长延时，以毫秒为单位
    */
    @SerializedName("MaxLatencyTime")
    @Expose
    private Long MaxLatencyTime;

    /**
     * Get 单命名空间TPS上线 
     * @return MaxTpsPerNamespace 单命名空间TPS上线
     */
    public Long getMaxTpsPerNamespace() {
        return this.MaxTpsPerNamespace;
    }

    /**
     * Set 单命名空间TPS上线
     * @param MaxTpsPerNamespace 单命名空间TPS上线
     */
    public void setMaxTpsPerNamespace(Long MaxTpsPerNamespace) {
        this.MaxTpsPerNamespace = MaxTpsPerNamespace;
    }

    /**
     * Get 最大命名空间数量 
     * @return MaxNamespaceNum 最大命名空间数量
     */
    public Long getMaxNamespaceNum() {
        return this.MaxNamespaceNum;
    }

    /**
     * Set 最大命名空间数量
     * @param MaxNamespaceNum 最大命名空间数量
     */
    public void setMaxNamespaceNum(Long MaxNamespaceNum) {
        this.MaxNamespaceNum = MaxNamespaceNum;
    }

    /**
     * Get 已使用命名空间数量 
     * @return UsedNamespaceNum 已使用命名空间数量
     */
    public Long getUsedNamespaceNum() {
        return this.UsedNamespaceNum;
    }

    /**
     * Set 已使用命名空间数量
     * @param UsedNamespaceNum 已使用命名空间数量
     */
    public void setUsedNamespaceNum(Long UsedNamespaceNum) {
        this.UsedNamespaceNum = UsedNamespaceNum;
    }

    /**
     * Get 最大Topic数量 
     * @return MaxTopicNum 最大Topic数量
     */
    public Long getMaxTopicNum() {
        return this.MaxTopicNum;
    }

    /**
     * Set 最大Topic数量
     * @param MaxTopicNum 最大Topic数量
     */
    public void setMaxTopicNum(Long MaxTopicNum) {
        this.MaxTopicNum = MaxTopicNum;
    }

    /**
     * Get 已使用Topic数量 
     * @return UsedTopicNum 已使用Topic数量
     */
    public Long getUsedTopicNum() {
        return this.UsedTopicNum;
    }

    /**
     * Set 已使用Topic数量
     * @param UsedTopicNum 已使用Topic数量
     */
    public void setUsedTopicNum(Long UsedTopicNum) {
        this.UsedTopicNum = UsedTopicNum;
    }

    /**
     * Get 最大Group数量 
     * @return MaxGroupNum 最大Group数量
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set 最大Group数量
     * @param MaxGroupNum 最大Group数量
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Get 已使用Group数量 
     * @return UsedGroupNum 已使用Group数量
     */
    public Long getUsedGroupNum() {
        return this.UsedGroupNum;
    }

    /**
     * Set 已使用Group数量
     * @param UsedGroupNum 已使用Group数量
     */
    public void setUsedGroupNum(Long UsedGroupNum) {
        this.UsedGroupNum = UsedGroupNum;
    }

    /**
     * Get 消息最大保留时间，以毫秒为单位 
     * @return MaxRetentionTime 消息最大保留时间，以毫秒为单位
     */
    public Long getMaxRetentionTime() {
        return this.MaxRetentionTime;
    }

    /**
     * Set 消息最大保留时间，以毫秒为单位
     * @param MaxRetentionTime 消息最大保留时间，以毫秒为单位
     */
    public void setMaxRetentionTime(Long MaxRetentionTime) {
        this.MaxRetentionTime = MaxRetentionTime;
    }

    /**
     * Get 消息最长延时，以毫秒为单位 
     * @return MaxLatencyTime 消息最长延时，以毫秒为单位
     */
    public Long getMaxLatencyTime() {
        return this.MaxLatencyTime;
    }

    /**
     * Set 消息最长延时，以毫秒为单位
     * @param MaxLatencyTime 消息最长延时，以毫秒为单位
     */
    public void setMaxLatencyTime(Long MaxLatencyTime) {
        this.MaxLatencyTime = MaxLatencyTime;
    }

    public RocketMQClusterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQClusterConfig(RocketMQClusterConfig source) {
        if (source.MaxTpsPerNamespace != null) {
            this.MaxTpsPerNamespace = new Long(source.MaxTpsPerNamespace);
        }
        if (source.MaxNamespaceNum != null) {
            this.MaxNamespaceNum = new Long(source.MaxNamespaceNum);
        }
        if (source.UsedNamespaceNum != null) {
            this.UsedNamespaceNum = new Long(source.UsedNamespaceNum);
        }
        if (source.MaxTopicNum != null) {
            this.MaxTopicNum = new Long(source.MaxTopicNum);
        }
        if (source.UsedTopicNum != null) {
            this.UsedTopicNum = new Long(source.UsedTopicNum);
        }
        if (source.MaxGroupNum != null) {
            this.MaxGroupNum = new Long(source.MaxGroupNum);
        }
        if (source.UsedGroupNum != null) {
            this.UsedGroupNum = new Long(source.UsedGroupNum);
        }
        if (source.MaxRetentionTime != null) {
            this.MaxRetentionTime = new Long(source.MaxRetentionTime);
        }
        if (source.MaxLatencyTime != null) {
            this.MaxLatencyTime = new Long(source.MaxLatencyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxTpsPerNamespace", this.MaxTpsPerNamespace);
        this.setParamSimple(map, prefix + "MaxNamespaceNum", this.MaxNamespaceNum);
        this.setParamSimple(map, prefix + "UsedNamespaceNum", this.UsedNamespaceNum);
        this.setParamSimple(map, prefix + "MaxTopicNum", this.MaxTopicNum);
        this.setParamSimple(map, prefix + "UsedTopicNum", this.UsedTopicNum);
        this.setParamSimple(map, prefix + "MaxGroupNum", this.MaxGroupNum);
        this.setParamSimple(map, prefix + "UsedGroupNum", this.UsedGroupNum);
        this.setParamSimple(map, prefix + "MaxRetentionTime", this.MaxRetentionTime);
        this.setParamSimple(map, prefix + "MaxLatencyTime", this.MaxLatencyTime);

    }
}

