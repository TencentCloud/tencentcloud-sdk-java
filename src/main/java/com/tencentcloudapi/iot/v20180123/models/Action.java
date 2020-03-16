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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Action extends AbstractModel{

    /**
    * 转发至topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private TopicAction Topic;

    /**
    * 转发至第三发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private ServiceAction Service;

    /**
    * 转发至第三发Ckafka
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ckafka")
    @Expose
    private CkafkaAction Ckafka;

    /**
     * Get 转发至topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic 转发至topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopicAction getTopic() {
        return this.Topic;
    }

    /**
     * Set 转发至topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic 转发至topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(TopicAction Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 转发至第三发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service 转发至第三发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceAction getService() {
        return this.Service;
    }

    /**
     * Set 转发至第三发
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service 转发至第三发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(ServiceAction Service) {
        this.Service = Service;
    }

    /**
     * Get 转发至第三发Ckafka
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ckafka 转发至第三发Ckafka
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CkafkaAction getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set 转发至第三发Ckafka
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ckafka 转发至第三发Ckafka
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCkafka(CkafkaAction Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Topic.", this.Topic);
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);

    }
}

