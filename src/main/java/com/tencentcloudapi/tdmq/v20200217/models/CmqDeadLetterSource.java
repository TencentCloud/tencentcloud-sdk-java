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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CmqDeadLetterSource extends AbstractModel {

    /**
    * 消息队列ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueId")
    @Expose
    private String QueueId;

    /**
    * 消息队列名字。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get 消息队列ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueId 消息队列ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueId() {
        return this.QueueId;
    }

    /**
     * Set 消息队列ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueId 消息队列ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get 消息队列名字。 
     * @return QueueName 消息队列名字。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 消息队列名字。
     * @param QueueName 消息队列名字。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public CmqDeadLetterSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqDeadLetterSource(CmqDeadLetterSource source) {
        if (source.QueueId != null) {
            this.QueueId = new String(source.QueueId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);

    }
}

