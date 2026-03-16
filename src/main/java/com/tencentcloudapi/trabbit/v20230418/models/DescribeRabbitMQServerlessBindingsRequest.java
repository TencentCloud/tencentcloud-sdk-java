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
    * <p>实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Vhost参数</p>
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * <p>分页offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页limit</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>搜索关键词，根据源exchange名称/目标资源名称进行模糊搜索</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>根据源Exchange精准搜索过滤</p>
    */
    @SerializedName("SourceExchange")
    @Expose
    private String SourceExchange;

    /**
    * <p>根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置</p>
    */
    @SerializedName("DestinationExchange")
    @Expose
    private String DestinationExchange;

    /**
     * Get <p>实例Id</p> 
     * @return InstanceId <p>实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例Id</p>
     * @param InstanceId <p>实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Vhost参数</p> 
     * @return VirtualHost <p>Vhost参数</p>
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set <p>Vhost参数</p>
     * @param VirtualHost <p>Vhost参数</p>
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get <p>分页offset</p> 
     * @return Offset <p>分页offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页offset</p>
     * @param Offset <p>分页offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页limit</p> 
     * @return Limit <p>分页limit</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页limit</p>
     * @param Limit <p>分页limit</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>搜索关键词，根据源exchange名称/目标资源名称进行模糊搜索</p> 
     * @return SearchWord <p>搜索关键词，根据源exchange名称/目标资源名称进行模糊搜索</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>搜索关键词，根据源exchange名称/目标资源名称进行模糊搜索</p>
     * @param SearchWord <p>搜索关键词，根据源exchange名称/目标资源名称进行模糊搜索</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>根据源Exchange精准搜索过滤</p> 
     * @return SourceExchange <p>根据源Exchange精准搜索过滤</p>
     */
    public String getSourceExchange() {
        return this.SourceExchange;
    }

    /**
     * Set <p>根据源Exchange精准搜索过滤</p>
     * @param SourceExchange <p>根据源Exchange精准搜索过滤</p>
     */
    public void setSourceExchange(String SourceExchange) {
        this.SourceExchange = SourceExchange;
    }

    /**
     * Get <p>根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置</p> 
     * @return QueueName <p>根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置</p>
     * @param QueueName <p>根据目标QueueName精准搜索过滤，和DestinationExchange过滤不可同时设置</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置</p> 
     * @return DestinationExchange <p>根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置</p>
     */
    public String getDestinationExchange() {
        return this.DestinationExchange;
    }

    /**
     * Set <p>根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置</p>
     * @param DestinationExchange <p>根据目标Exchange精准搜索过滤，和QueueName过滤不可同时设置</p>
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

