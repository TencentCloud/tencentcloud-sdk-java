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

public class RouterRocketMQSource extends AbstractModel {

    /**
    * <p>access key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>过滤表达式, 参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterExpression")
    @Expose
    private String FilterExpression;

    /**
    * <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterFromTimestampMs")
    @Expose
    private Long FilterFromTimestampMs;

    /**
    * <p>过滤类型，参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * <p>消费者组名。会使用该消费者来消费消息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Group")
    @Expose
    private String Group;

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
    * <p>4.X的命名空间，没有使用则留空，5.X也留空。<br> naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmxxx57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceConsumeConcurrentThreadCount")
    @Expose
    private Long SourceConsumeConcurrentThreadCount;

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
     * Get <p>过滤表达式, 参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterExpression <p>过滤表达式, 参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilterExpression() {
        return this.FilterExpression;
    }

    /**
     * Set <p>过滤表达式, 参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterExpression <p>过滤表达式, 参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterExpression(String FilterExpression) {
        this.FilterExpression = FilterExpression;
    }

    /**
     * Get <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterFromTimestampMs <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFilterFromTimestampMs() {
        return this.FilterFromTimestampMs;
    }

    /**
     * Set <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterFromTimestampMs <p>过滤时间，毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterFromTimestampMs(Long FilterFromTimestampMs) {
        this.FilterFromTimestampMs = FilterFromTimestampMs;
    }

    /**
     * Get <p>过滤类型，参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterType <p>过滤类型，参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set <p>过滤类型，参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterType <p>过滤类型，参考：https://github.com/apache/rocketmq/blob/develop/common/src/main/java/org/apache/rocketmq/common/filter/ExpressionType.java</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get <p>消费者组名。会使用该消费者来消费消息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Group <p>消费者组名。会使用该消费者来消费消息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>消费者组名。会使用该消费者来消费消息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Group <p>消费者组名。会使用该消费者来消费消息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroup(String Group) {
        this.Group = Group;
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
     * Get <p>4.X的命名空间，没有使用则留空，5.X也留空。<br> naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmxxx57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace <p>4.X的命名空间，没有使用则留空，5.X也留空。<br> naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmxxx57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>4.X的命名空间，没有使用则留空，5.X也留空。<br> naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmxxx57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace <p>4.X的命名空间，没有使用则留空，5.X也留空。<br> naemspace 需要包含MQ_INST那部分. 比如：MQ_INST_rocketmxxx57d53rnn5_tiger_namespace</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceConsumeConcurrentThreadCount <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceConsumeConcurrentThreadCount() {
        return this.SourceConsumeConcurrentThreadCount;
    }

    /**
     * Set <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceConsumeConcurrentThreadCount <p>消费者并发数，0 ～ 100</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceConsumeConcurrentThreadCount(Long SourceConsumeConcurrentThreadCount) {
        this.SourceConsumeConcurrentThreadCount = SourceConsumeConcurrentThreadCount;
    }

    public RouterRocketMQSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouterRocketMQSource(RouterRocketMQSource source) {
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.FilterExpression != null) {
            this.FilterExpression = new String(source.FilterExpression);
        }
        if (source.FilterFromTimestampMs != null) {
            this.FilterFromTimestampMs = new Long(source.FilterFromTimestampMs);
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
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
        if (source.SourceConsumeConcurrentThreadCount != null) {
            this.SourceConsumeConcurrentThreadCount = new Long(source.SourceConsumeConcurrentThreadCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "FilterExpression", this.FilterExpression);
        this.setParamSimple(map, prefix + "FilterFromTimestampMs", this.FilterFromTimestampMs);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "NameServerAddressList", this.NameServerAddressList);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "SourceConsumeConcurrentThreadCount", this.SourceConsumeConcurrentThreadCount);

    }
}

