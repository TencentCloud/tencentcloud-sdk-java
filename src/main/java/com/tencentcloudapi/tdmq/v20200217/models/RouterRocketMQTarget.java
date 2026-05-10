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

public class RouterRocketMQTarget extends AbstractModel {

    /**
    * <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>namesrv地址列表，也可以是云厂商提供的接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameServerAddressList")
    @Expose
    private String NameServerAddressList;

    /**
    * <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>topic名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmqka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>生产者并发数，可以不用填，可以在规则创建后修改</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetProduceConcurrentThreadCount")
    @Expose
    private Long TargetProduceConcurrentThreadCount;

    /**
     * Get <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessKey <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessKey <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>namesrv地址列表，也可以是云厂商提供的接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameServerAddressList <p>namesrv地址列表，也可以是云厂商提供的接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameServerAddressList() {
        return this.NameServerAddressList;
    }

    /**
     * Set <p>namesrv地址列表，也可以是云厂商提供的接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameServerAddressList <p>namesrv地址列表，也可以是云厂商提供的接入点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameServerAddressList(String NameServerAddressList) {
        this.NameServerAddressList = NameServerAddressList;
    }

    /**
     * Get <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey <p>secret key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

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
     * Get <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmqka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmqka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmqka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace <p>4.X的命名空间，没有使用则留空，5.X也留空。 naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmqka57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>生产者并发数，可以不用填，可以在规则创建后修改</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetProduceConcurrentThreadCount <p>生产者并发数，可以不用填，可以在规则创建后修改</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetProduceConcurrentThreadCount() {
        return this.TargetProduceConcurrentThreadCount;
    }

    /**
     * Set <p>生产者并发数，可以不用填，可以在规则创建后修改</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetProduceConcurrentThreadCount <p>生产者并发数，可以不用填，可以在规则创建后修改</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetProduceConcurrentThreadCount(Long TargetProduceConcurrentThreadCount) {
        this.TargetProduceConcurrentThreadCount = TargetProduceConcurrentThreadCount;
    }

    public RouterRocketMQTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouterRocketMQTarget(RouterRocketMQTarget source) {
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.NameServerAddressList != null) {
            this.NameServerAddressList = new String(source.NameServerAddressList);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.TargetProduceConcurrentThreadCount != null) {
            this.TargetProduceConcurrentThreadCount = new Long(source.TargetProduceConcurrentThreadCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "NameServerAddressList", this.NameServerAddressList);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TargetProduceConcurrentThreadCount", this.TargetProduceConcurrentThreadCount);

    }
}

