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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessConsumersRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost参数
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 队列名
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 搜索关键词
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost参数 
     * @return VirtualHost Vhost参数
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost参数
     * @param VirtualHost Vhost参数
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 队列名 
     * @return QueueName 队列名
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名
     * @param QueueName 队列名
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 搜索关键词 
     * @return SearchWord 搜索关键词
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键词
     * @param SearchWord 搜索关键词
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribeRabbitMQServerlessConsumersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessConsumersRequest(DescribeRabbitMQServerlessConsumersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

