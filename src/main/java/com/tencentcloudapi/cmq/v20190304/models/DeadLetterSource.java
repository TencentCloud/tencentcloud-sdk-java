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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadLetterSource extends AbstractModel{

    /**
    * QueueId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueId")
    @Expose
    private String QueueId;

    /**
    * QueueName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get QueueId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueId QueueId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueId() {
        return this.QueueId;
    }

    /**
     * Set QueueId
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueId QueueId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get QueueName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueName QueueName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set QueueName
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueName QueueName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);

    }
}

