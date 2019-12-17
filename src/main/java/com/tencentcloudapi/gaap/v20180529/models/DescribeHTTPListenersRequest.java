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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHTTPListenersRequest extends AbstractModel{

    /**
    * 通道ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 过滤条件，按照监听器ID进行精确查询
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 过滤条件，按照监听器名称进行精确查询
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 过滤条件，按照监听器端口进行精确查询
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数量，默认为20个
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
     * Get 通道ID 
     * @return ProxyId 通道ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID
     * @param ProxyId 通道ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 过滤条件，按照监听器ID进行精确查询 
     * @return ListenerId 过滤条件，按照监听器ID进行精确查询
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 过滤条件，按照监听器ID进行精确查询
     * @param ListenerId 过滤条件，按照监听器ID进行精确查询
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 过滤条件，按照监听器名称进行精确查询 
     * @return ListenerName 过滤条件，按照监听器名称进行精确查询
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 过滤条件，按照监听器名称进行精确查询
     * @param ListenerName 过滤条件，按照监听器名称进行精确查询
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 过滤条件，按照监听器端口进行精确查询 
     * @return Port 过滤条件，按照监听器端口进行精确查询
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 过滤条件，按照监听器端口进行精确查询
     * @param Port 过滤条件，按照监听器端口进行精确查询
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数量，默认为20个 
     * @return Limit 限制数量，默认为20个
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数量，默认为20个
     * @param Limit 限制数量，默认为20个
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用 
     * @return SearchValue 过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用
     * @param SearchValue 过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

