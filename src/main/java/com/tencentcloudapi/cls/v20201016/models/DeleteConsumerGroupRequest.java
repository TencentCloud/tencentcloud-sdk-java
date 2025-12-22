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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteConsumerGroupRequest extends AbstractModel {

    /**
    * 需要删除的消费者组标识
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 日志集id
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
     * Get 需要删除的消费者组标识 
     * @return ConsumerGroup 需要删除的消费者组标识
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 需要删除的消费者组标识
     * @param ConsumerGroup 需要删除的消费者组标识
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 日志集id 
     * @return LogsetId 日志集id
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集id
     * @param LogsetId 日志集id
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    public DeleteConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteConsumerGroupRequest(DeleteConsumerGroupRequest source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);

    }
}

