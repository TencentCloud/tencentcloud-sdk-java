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

public class RouterTencentRocketMQTarget extends AbstractModel {

    /**
    * <p>topic名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>rocketmq实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocket2mq3ka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>消费者并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetProduceConcurrentThreadCount")
    @Expose
    private Long TargetProduceConcurrentThreadCount;

    /**
    * <p>目标region</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * <p>选择TDMQ RocketMQ时，选择一个角色来完成数据同步</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>选择腾讯云版RockeMQ类型后，RoleName对应的AssessKey值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>选择腾讯云版RockeMQ类型后，RoleName对应的SecretKey值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get <p>topic名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic <p>topic名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>topic名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic <p>topic名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>rocketmq实例id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>rocketmq实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>rocketmq实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>rocketmq实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocket2mq3ka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocket2mq3ka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocket2mq3ka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocket2mq3ka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>消费者并发数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetProduceConcurrentThreadCount <p>消费者并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetProduceConcurrentThreadCount() {
        return this.TargetProduceConcurrentThreadCount;
    }

    /**
     * Set <p>消费者并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetProduceConcurrentThreadCount <p>消费者并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetProduceConcurrentThreadCount(Long TargetProduceConcurrentThreadCount) {
        this.TargetProduceConcurrentThreadCount = TargetProduceConcurrentThreadCount;
    }

    /**
     * Get <p>目标region</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetRegion <p>目标region</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set <p>目标region</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetRegion <p>目标region</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get <p>选择TDMQ RocketMQ时，选择一个角色来完成数据同步</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleName <p>选择TDMQ RocketMQ时，选择一个角色来完成数据同步</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>选择TDMQ RocketMQ时，选择一个角色来完成数据同步</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleName <p>选择TDMQ RocketMQ时，选择一个角色来完成数据同步</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>选择腾讯云版RockeMQ类型后，RoleName对应的AssessKey值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessKey <p>选择腾讯云版RockeMQ类型后，RoleName对应的AssessKey值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>选择腾讯云版RockeMQ类型后，RoleName对应的AssessKey值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessKey <p>选择腾讯云版RockeMQ类型后，RoleName对应的AssessKey值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>选择腾讯云版RockeMQ类型后，RoleName对应的SecretKey值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey <p>选择腾讯云版RockeMQ类型后，RoleName对应的SecretKey值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>选择腾讯云版RockeMQ类型后，RoleName对应的SecretKey值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey <p>选择腾讯云版RockeMQ类型后，RoleName对应的SecretKey值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public RouterTencentRocketMQTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouterTencentRocketMQTarget(RouterTencentRocketMQTarget source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.TargetProduceConcurrentThreadCount != null) {
            this.TargetProduceConcurrentThreadCount = new Long(source.TargetProduceConcurrentThreadCount);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TargetProduceConcurrentThreadCount", this.TargetProduceConcurrentThreadCount);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

