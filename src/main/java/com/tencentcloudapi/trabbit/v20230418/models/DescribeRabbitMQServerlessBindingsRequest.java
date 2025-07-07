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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessBindingsRequest extends AbstractModel {

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
    * 分页offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键词，根据源exchange名称/目标资源名称/绑定key进行模糊搜索
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 根据源Exchange精准搜索过滤
    */
    @SerializedName("SourceExchange")
    @Expose
    private String SourceExchange;

    /**
    * 根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置
    */
    @SerializedName("DestinationExchange")
    @Expose
    private String DestinationExchange;

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
     * Get 分页offset 
     * @return Offset 分页offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页offset
     * @param Offset 分页offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页limit 
     * @return Limit 分页limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页limit
     * @param Limit 分页limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键词，根据源exchange名称/目标资源名称/绑定key进行模糊搜索 
     * @return SearchWord 搜索关键词，根据源exchange名称/目标资源名称/绑定key进行模糊搜索
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键词，根据源exchange名称/目标资源名称/绑定key进行模糊搜索
     * @param SearchWord 搜索关键词，根据源exchange名称/目标资源名称/绑定key进行模糊搜索
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 根据源Exchange精准搜索过滤 
     * @return SourceExchange 根据源Exchange精准搜索过滤
     */
    public String getSourceExchange() {
        return this.SourceExchange;
    }

    /**
     * Set 根据源Exchange精准搜索过滤
     * @param SourceExchange 根据源Exchange精准搜索过滤
     */
    public void setSourceExchange(String SourceExchange) {
        this.SourceExchange = SourceExchange;
    }

    /**
     * Get 根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置 
     * @return QueueName 根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置
     * @param QueueName 根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置 
     * @return DestinationExchange 根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置
     */
    public String getDestinationExchange() {
        return this.DestinationExchange;
    }

    /**
     * Set 根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置
     * @param DestinationExchange 根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置
     */
    public void setDestinationExchange(String DestinationExchange) {
        this.DestinationExchange = DestinationExchange;
    }

    public DescribeRabbitMQServerlessBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessBindingsRequest(DescribeRabbitMQServerlessBindingsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.SourceExchange != null) {
            this.SourceExchange = new String(source.SourceExchange);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.DestinationExchange != null) {
            this.DestinationExchange = new String(source.DestinationExchange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "SourceExchange", this.SourceExchange);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "DestinationExchange", this.DestinationExchange);

    }
}

