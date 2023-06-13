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

public class RabbitMQVirtualHostStatistics extends AbstractModel{

    /**
    * 当前vhost的queue数量
    */
    @SerializedName("CurrentQueues")
    @Expose
    private Long CurrentQueues;

    /**
    * 当前vhost的exchange数量
    */
    @SerializedName("CurrentExchanges")
    @Expose
    private Long CurrentExchanges;

    /**
    * 当前vhost的连接数量
    */
    @SerializedName("CurrentConnections")
    @Expose
    private Long CurrentConnections;

    /**
    * 当前vhost的channel数量
    */
    @SerializedName("CurrentChannels")
    @Expose
    private Long CurrentChannels;

    /**
    * 当前vhost的用户数量
    */
    @SerializedName("CurrentUsers")
    @Expose
    private Long CurrentUsers;

    /**
     * Get 当前vhost的queue数量 
     * @return CurrentQueues 当前vhost的queue数量
     */
    public Long getCurrentQueues() {
        return this.CurrentQueues;
    }

    /**
     * Set 当前vhost的queue数量
     * @param CurrentQueues 当前vhost的queue数量
     */
    public void setCurrentQueues(Long CurrentQueues) {
        this.CurrentQueues = CurrentQueues;
    }

    /**
     * Get 当前vhost的exchange数量 
     * @return CurrentExchanges 当前vhost的exchange数量
     */
    public Long getCurrentExchanges() {
        return this.CurrentExchanges;
    }

    /**
     * Set 当前vhost的exchange数量
     * @param CurrentExchanges 当前vhost的exchange数量
     */
    public void setCurrentExchanges(Long CurrentExchanges) {
        this.CurrentExchanges = CurrentExchanges;
    }

    /**
     * Get 当前vhost的连接数量 
     * @return CurrentConnections 当前vhost的连接数量
     */
    public Long getCurrentConnections() {
        return this.CurrentConnections;
    }

    /**
     * Set 当前vhost的连接数量
     * @param CurrentConnections 当前vhost的连接数量
     */
    public void setCurrentConnections(Long CurrentConnections) {
        this.CurrentConnections = CurrentConnections;
    }

    /**
     * Get 当前vhost的channel数量 
     * @return CurrentChannels 当前vhost的channel数量
     */
    public Long getCurrentChannels() {
        return this.CurrentChannels;
    }

    /**
     * Set 当前vhost的channel数量
     * @param CurrentChannels 当前vhost的channel数量
     */
    public void setCurrentChannels(Long CurrentChannels) {
        this.CurrentChannels = CurrentChannels;
    }

    /**
     * Get 当前vhost的用户数量 
     * @return CurrentUsers 当前vhost的用户数量
     */
    public Long getCurrentUsers() {
        return this.CurrentUsers;
    }

    /**
     * Set 当前vhost的用户数量
     * @param CurrentUsers 当前vhost的用户数量
     */
    public void setCurrentUsers(Long CurrentUsers) {
        this.CurrentUsers = CurrentUsers;
    }

    public RabbitMQVirtualHostStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQVirtualHostStatistics(RabbitMQVirtualHostStatistics source) {
        if (source.CurrentQueues != null) {
            this.CurrentQueues = new Long(source.CurrentQueues);
        }
        if (source.CurrentExchanges != null) {
            this.CurrentExchanges = new Long(source.CurrentExchanges);
        }
        if (source.CurrentConnections != null) {
            this.CurrentConnections = new Long(source.CurrentConnections);
        }
        if (source.CurrentChannels != null) {
            this.CurrentChannels = new Long(source.CurrentChannels);
        }
        if (source.CurrentUsers != null) {
            this.CurrentUsers = new Long(source.CurrentUsers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentQueues", this.CurrentQueues);
        this.setParamSimple(map, prefix + "CurrentExchanges", this.CurrentExchanges);
        this.setParamSimple(map, prefix + "CurrentConnections", this.CurrentConnections);
        this.setParamSimple(map, prefix + "CurrentChannels", this.CurrentChannels);
        this.setParamSimple(map, prefix + "CurrentUsers", this.CurrentUsers);

    }
}

