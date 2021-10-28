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

public class ModifyRocketMQNamespaceRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间名称，3-64个字符，只能包含字母、数字、“-”及“_”
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 未消费消息的保留时间，以毫秒为单位，60秒-15天
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
    * 消息持久化后保留的时间，以毫秒为单位
    */
    @SerializedName("RetentionTime")
    @Expose
    private Long RetentionTime;

    /**
    * 说明，最大128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间名称，3-64个字符，只能包含字母、数字、“-”及“_” 
     * @return NamespaceId 命名空间名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间名称，3-64个字符，只能包含字母、数字、“-”及“_”
     * @param NamespaceId 命名空间名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 未消费消息的保留时间，以毫秒为单位，60秒-15天 
     * @return Ttl 未消费消息的保留时间，以毫秒为单位，60秒-15天
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set 未消费消息的保留时间，以毫秒为单位，60秒-15天
     * @param Ttl 未消费消息的保留时间，以毫秒为单位，60秒-15天
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get 消息持久化后保留的时间，以毫秒为单位 
     * @return RetentionTime 消息持久化后保留的时间，以毫秒为单位
     */
    public Long getRetentionTime() {
        return this.RetentionTime;
    }

    /**
     * Set 消息持久化后保留的时间，以毫秒为单位
     * @param RetentionTime 消息持久化后保留的时间，以毫秒为单位
     */
    public void setRetentionTime(Long RetentionTime) {
        this.RetentionTime = RetentionTime;
    }

    /**
     * Get 说明，最大128个字符 
     * @return Remark 说明，最大128个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明，最大128个字符
     * @param Remark 说明，最大128个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyRocketMQNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQNamespaceRequest(ModifyRocketMQNamespaceRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
        if (source.RetentionTime != null) {
            this.RetentionTime = new Long(source.RetentionTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
        this.setParamSimple(map, prefix + "RetentionTime", this.RetentionTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

