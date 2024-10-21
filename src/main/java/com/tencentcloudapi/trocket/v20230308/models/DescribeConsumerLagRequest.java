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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerLagRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 消费组名称
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 命名空间，4.x集群必填
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 订阅主题，不为空则查询订阅了该主题的消费组的堆积
    */
    @SerializedName("SubscribeTopic")
    @Expose
    private String SubscribeTopic;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 消费组名称 
     * @return ConsumerGroup 消费组名称
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组名称
     * @param ConsumerGroup 消费组名称
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 命名空间，4.x集群必填 
     * @return Namespace 命名空间，4.x集群必填
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，4.x集群必填
     * @param Namespace 命名空间，4.x集群必填
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 订阅主题，不为空则查询订阅了该主题的消费组的堆积 
     * @return SubscribeTopic 订阅主题，不为空则查询订阅了该主题的消费组的堆积
     */
    public String getSubscribeTopic() {
        return this.SubscribeTopic;
    }

    /**
     * Set 订阅主题，不为空则查询订阅了该主题的消费组的堆积
     * @param SubscribeTopic 订阅主题，不为空则查询订阅了该主题的消费组的堆积
     */
    public void setSubscribeTopic(String SubscribeTopic) {
        this.SubscribeTopic = SubscribeTopic;
    }

    public DescribeConsumerLagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerLagRequest(DescribeConsumerLagRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.SubscribeTopic != null) {
            this.SubscribeTopic = new String(source.SubscribeTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "SubscribeTopic", this.SubscribeTopic);

    }
}

