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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHTTPListenersRequest extends AbstractModel {

    /**
    * <p>通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * <p>通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>过滤条件，按照监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>过滤条件，按照监听器名称进行精确查询</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>过滤条件，按照监听器端口进行精确查询</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限制数量，默认为20个</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用</p>
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
     * Get <p>通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p> 
     * @return ProxyId <p>通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set <p>通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
     * @param ProxyId <p>通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get <p>通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p> 
     * @return GroupId <p>通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
     * @param GroupId <p>通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>过滤条件，按照监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p> 
     * @return ListenerId <p>过滤条件，按照监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>过滤条件，按照监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
     * @param ListenerId <p>过滤条件，按照监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>过滤条件，按照监听器名称进行精确查询</p> 
     * @return ListenerName <p>过滤条件，按照监听器名称进行精确查询</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>过滤条件，按照监听器名称进行精确查询</p>
     * @param ListenerName <p>过滤条件，按照监听器名称进行精确查询</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>过滤条件，按照监听器端口进行精确查询</p> 
     * @return Port <p>过滤条件，按照监听器端口进行精确查询</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>过滤条件，按照监听器端口进行精确查询</p>
     * @param Port <p>过滤条件，按照监听器端口进行精确查询</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>偏移量，默认为0</p> 
     * @return Offset <p>偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0</p>
     * @param Offset <p>偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>限制数量，默认为20个</p> 
     * @return Limit <p>限制数量，默认为20个</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数量，默认为20个</p>
     * @param Limit <p>限制数量，默认为20个</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用</p> 
     * @return SearchValue <p>过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用</p>
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set <p>过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用</p>
     * @param SearchValue <p>过滤条件，支持按照端口或监听器名称进行模糊查询，该参数不能与ListenerName和Port同时使用</p>
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    public DescribeHTTPListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHTTPListenersRequest(DescribeHTTPListenersRequest source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

