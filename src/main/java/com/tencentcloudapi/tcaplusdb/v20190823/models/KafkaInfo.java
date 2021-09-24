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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaInfo extends AbstractModel{

    /**
    * kafaka address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * kafaka topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * kafka username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * kafka password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * ckafka实例
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 是否走VPC
    */
    @SerializedName("IsVpc")
    @Expose
    private Long IsVpc;

    /**
     * Get kafaka address 
     * @return Address kafaka address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set kafaka address
     * @param Address kafaka address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get kafaka topic 
     * @return Topic kafaka topic
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set kafaka topic
     * @param Topic kafaka topic
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get kafka username 
     * @return User kafka username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set kafka username
     * @param User kafka username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get kafka password 
     * @return Password kafka password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set kafka password
     * @param Password kafka password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get ckafka实例 
     * @return Instance ckafka实例
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set ckafka实例
     * @param Instance ckafka实例
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 是否走VPC 
     * @return IsVpc 是否走VPC
     */
    public Long getIsVpc() {
        return this.IsVpc;
    }

    /**
     * Set 是否走VPC
     * @param IsVpc 是否走VPC
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

