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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaInfo extends AbstractModel {

    /**
    * Kafka address
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Kafka topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * kafka username
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * kafka password
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * ckafka实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 是否走VPC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVpc")
    @Expose
    private Long IsVpc;

    /**
     * Get Kafka address
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address Kafka address
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Kafka address
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address Kafka address
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Kafka topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic Kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic Kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get kafka username
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User kafka username
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set kafka username
注意：此字段可能返回 null，表示取不到有效值。
     * @param User kafka username
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get kafka password
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password kafka password
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set kafka password
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password kafka password
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get ckafka实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instance ckafka实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set ckafka实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instance ckafka实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 是否走VPC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVpc 是否走VPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsVpc() {
        return this.IsVpc;
    }

    /**
     * Set 是否走VPC
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVpc 是否走VPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVpc(Long IsVpc) {
        this.IsVpc = IsVpc;
    }

    public KafkaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaInfo(KafkaInfo source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.IsVpc != null) {
            this.IsVpc = new Long(source.IsVpc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "IsVpc", this.IsVpc);

    }
}

