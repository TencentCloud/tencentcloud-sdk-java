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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteQueueRequest extends AbstractModel {

    /**
    * 集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 队列名称。<br><li>最多支持32个字符。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get 集群ID。 
     * @return ClusterId 集群ID。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID。
     * @param ClusterId 集群ID。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 队列名称。<br><li>最多支持32个字符。 
     * @return QueueName 队列名称。<br><li>最多支持32个字符。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称。<br><li>最多支持32个字符。
     * @param QueueName 队列名称。<br><li>最多支持32个字符。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public DeleteQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteQueueRequest(DeleteQueueRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);

    }
}

