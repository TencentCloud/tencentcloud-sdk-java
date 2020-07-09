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

public class Producer extends AbstractModel{

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 连接数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountConnect")
    @Expose
    private Long CountConnect;

    /**
    * 连接集合。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionSets")
    @Expose
    private Connection [] ConnectionSets;

    /**
     * Get 环境（命名空间）名称。 
     * @return EnvironmentId 环境（命名空间）名称。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称。
     * @param EnvironmentId 环境（命名空间）名称。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 主题名称。 
     * @return TopicName 主题名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称。
     * @param TopicName 主题名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 连接数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountConnect 连接数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCountConnect() {
        return this.CountConnect;
    }

    /**
     * Set 连接数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountConnect 连接数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountConnect(Long CountConnect) {
        this.CountConnect = CountConnect;
    }

    /**
     * Get 连接集合。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionSets 连接集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Connection [] getConnectionSets() {
        return this.ConnectionSets;
    }

    /**
     * Set 连接集合。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionSets 连接集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionSets(Connection [] ConnectionSets) {
        this.ConnectionSets = ConnectionSets;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "CountConnect", this.CountConnect);
        this.setParamArrayObj(map, prefix + "ConnectionSets.", this.ConnectionSets);

    }
}

