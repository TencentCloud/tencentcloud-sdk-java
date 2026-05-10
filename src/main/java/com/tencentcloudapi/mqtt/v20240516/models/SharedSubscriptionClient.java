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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharedSubscriptionClient extends AbstractModel {

    /**
    * 客户端ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 共享订阅组名
    */
    @SerializedName("SharedName")
    @Expose
    private String SharedName;

    /**
    * 共享组下的订阅表达式列表
    */
    @SerializedName("TopicFilter")
    @Expose
    private String TopicFilter;

    /**
    * 在线状态
    */
    @SerializedName("Online")
    @Expose
    private Boolean Online;

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
     * Get 共享订阅组名 
     * @return SharedName 共享订阅组名
     */
    public String getSharedName() {
        return this.SharedName;
    }

    /**
     * Set 共享订阅组名
     * @param SharedName 共享订阅组名
     */
    public void setSharedName(String SharedName) {
        this.SharedName = SharedName;
    }

    /**
     * Get 共享组下的订阅表达式列表 
     * @return TopicFilter 共享组下的订阅表达式列表
     */
    public String getTopicFilter() {
        return this.TopicFilter;
    }

    /**
     * Set 共享组下的订阅表达式列表
     * @param TopicFilter 共享组下的订阅表达式列表
     */
    public void setTopicFilter(String TopicFilter) {
        this.TopicFilter = TopicFilter;
    }

    /**
     * Get 在线状态 
     * @return Online 在线状态
     */
    public Boolean getOnline() {
        return this.Online;
    }

    /**
     * Set 在线状态
     * @param Online 在线状态
     */
    public void setOnline(Boolean Online) {
        this.Online = Online;
    }

    public SharedSubscriptionClient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharedSubscriptionClient(SharedSubscriptionClient source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.SharedName != null) {
            this.SharedName = new String(source.SharedName);
        }
        if (source.TopicFilter != null) {
            this.TopicFilter = new String(source.TopicFilter);
        }
        if (source.Online != null) {
            this.Online = new Boolean(source.Online);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "SharedName", this.SharedName);
        this.setParamSimple(map, prefix + "TopicFilter", this.TopicFilter);
        this.setParamSimple(map, prefix + "Online", this.Online);

    }
}

