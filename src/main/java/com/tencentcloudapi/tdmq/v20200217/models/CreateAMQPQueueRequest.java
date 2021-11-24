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

public class CreateAMQPQueueRequest extends AbstractModel{

    /**
    * 队列名称，3-64个字符，只能包含字母、数字、“-”及“_”
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * 队列所在的vhost名称
    */
    @SerializedName("VHostId")
    @Expose
    private String VHostId;

    /**
    * 是否自动清除
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 队列说明，最大128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 死信exchange
    */
    @SerializedName("DeadLetterExchange")
    @Expose
    private String DeadLetterExchange;

    /**
    * 路由键
    */
    @SerializedName("DeadLetterRoutingKey")
    @Expose
    private String DeadLetterRoutingKey;

    /**
     * Get 队列名称，3-64个字符，只能包含字母、数字、“-”及“_” 
     * @return Queue 队列名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set 队列名称，3-64个字符，只能包含字母、数字、“-”及“_”
     * @param Queue 队列名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get 队列所在的vhost名称 
     * @return VHostId 队列所在的vhost名称
     */
    public String getVHostId() {
        return this.VHostId;
    }

    /**
     * Set 队列所在的vhost名称
     * @param VHostId 队列所在的vhost名称
     */
    public void setVHostId(String VHostId) {
        this.VHostId = VHostId;
    }

    /**
     * Get 是否自动清除 
     * @return AutoDelete 是否自动清除
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 是否自动清除
     * @param AutoDelete 是否自动清除
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

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
     * Get 队列说明，最大128个字符 
     * @return Remark 队列说明，最大128个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 队列说明，最大128个字符
     * @param Remark 队列说明，最大128个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 死信exchange 
     * @return DeadLetterExchange 死信exchange
     */
    public String getDeadLetterExchange() {
        return this.DeadLetterExchange;
    }

    /**
     * Set 死信exchange
     * @param DeadLetterExchange 死信exchange
     */
    public void setDeadLetterExchange(String DeadLetterExchange) {
        this.DeadLetterExchange = DeadLetterExchange;
    }

    /**
     * Get 路由键 
     * @return DeadLetterRoutingKey 路由键
     */
    public String getDeadLetterRoutingKey() {
        return this.DeadLetterRoutingKey;
    }

    /**
     * Set 路由键
     * @param DeadLetterRoutingKey 路由键
     */
    public void setDeadLetterRoutingKey(String DeadLetterRoutingKey) {
        this.DeadLetterRoutingKey = DeadLetterRoutingKey;
    }

    public CreateAMQPQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAMQPQueueRequest(CreateAMQPQueueRequest source) {
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.VHostId != null) {
            this.VHostId = new String(source.VHostId);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Boolean(source.AutoDelete);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DeadLetterExchange != null) {
            this.DeadLetterExchange = new String(source.DeadLetterExchange);
        }
        if (source.DeadLetterRoutingKey != null) {
            this.DeadLetterRoutingKey = new String(source.DeadLetterRoutingKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "VHostId", this.VHostId);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DeadLetterExchange", this.DeadLetterExchange);
        this.setParamSimple(map, prefix + "DeadLetterRoutingKey", this.DeadLetterRoutingKey);

    }
}

