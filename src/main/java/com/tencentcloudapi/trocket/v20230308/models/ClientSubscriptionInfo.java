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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientSubscriptionInfo extends AbstractModel {

    /**
    * 客户端ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 客户端地址
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * 订阅主题
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 订阅表达式
    */
    @SerializedName("SubString")
    @Expose
    private String SubString;

    /**
    * 订阅方式
    */
    @SerializedName("ExpressionType")
    @Expose
    private String ExpressionType;

    /**
     * Get 客户端ID 
     * @return ClientId 客户端ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID
     * @param ClientId 客户端ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 客户端地址 
     * @return ClientAddr 客户端地址
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set 客户端地址
     * @param ClientAddr 客户端地址
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get 订阅主题 
     * @return Topic 订阅主题
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 订阅主题
     * @param Topic 订阅主题
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 订阅表达式 
     * @return SubString 订阅表达式
     */
    public String getSubString() {
        return this.SubString;
    }

    /**
     * Set 订阅表达式
     * @param SubString 订阅表达式
     */
    public void setSubString(String SubString) {
        this.SubString = SubString;
    }

    /**
     * Get 订阅方式 
     * @return ExpressionType 订阅方式
     */
    public String getExpressionType() {
        return this.ExpressionType;
    }

    /**
     * Set 订阅方式
     * @param ExpressionType 订阅方式
     */
    public void setExpressionType(String ExpressionType) {
        this.ExpressionType = ExpressionType;
    }

    public ClientSubscriptionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientSubscriptionInfo(ClientSubscriptionInfo source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.SubString != null) {
            this.SubString = new String(source.SubString);
        }
        if (source.ExpressionType != null) {
            this.ExpressionType = new String(source.ExpressionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "SubString", this.SubString);
        this.setParamSimple(map, prefix + "ExpressionType", this.ExpressionType);

    }
}

