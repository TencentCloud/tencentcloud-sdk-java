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

public class DeleteAMQPQueueRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Vhost名称
    */
    @SerializedName("VHostId")
    @Expose
    private String VHostId;

    /**
    * 队列名称
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

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
     * Get Vhost名称 
     * @return VHostId Vhost名称
     */
    public String getVHostId() {
        return this.VHostId;
    }

    /**
     * Set Vhost名称
     * @param VHostId Vhost名称
     */
    public void setVHostId(String VHostId) {
        this.VHostId = VHostId;
    }

    /**
     * Get 队列名称 
     * @return Queue 队列名称
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set 队列名称
     * @param Queue 队列名称
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    public DeleteAMQPQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAMQPQueueRequest(DeleteAMQPQueueRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VHostId != null) {
            this.VHostId = new String(source.VHostId);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VHostId", this.VHostId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);

    }
}

