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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHTTPSListenersRequest extends AbstractModel {

    /**
    * 通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 过滤条件，根据监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 过滤条件，根据监听器名称进行精确查询。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 过滤条件，根据监听器端口进行精确查询。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 偏移量， 默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数量，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，支持按照端口或监听器名称进行模糊查询
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。
该功能的启停无法在监听器创建完毕后再修改。
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get 通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。 
     * @return ProxyId 通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
     * @param ProxyId 通道ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。 
     * @return GroupId 通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
     * @param GroupId 通道组ID。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 过滤条件，根据监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。 
     * @return ListenerId 过滤条件，根据监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 过滤条件，根据监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
     * @param ListenerId 过滤条件，根据监听器ID进行精确查询。ListenerId、ProxyId、GroupId须至少填写一个，且ProxyId与GroupId至多只能填写其中一个。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 过滤条件，根据监听器名称进行精确查询。 
     * @return ListenerName 过滤条件，根据监听器名称进行精确查询。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 过滤条件，根据监听器名称进行精确查询。
     * @param ListenerName 过滤条件，根据监听器名称进行精确查询。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 过滤条件，根据监听器端口进行精确查询。 
     * @return Port 过滤条件，根据监听器端口进行精确查询。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 过滤条件，根据监听器端口进行精确查询。
     * @param Port 过滤条件，根据监听器端口进行精确查询。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 偏移量， 默认为0 
     * @return Offset 偏移量， 默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量， 默认为0
     * @param Offset 偏移量， 默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数量，默认为20 
     * @return Limit 限制数量，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数量，默认为20
     * @param Limit 限制数量，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，支持按照端口或监听器名称进行模糊查询 
     * @return SearchValue 过滤条件，支持按照端口或监听器名称进行模糊查询
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 过滤条件，支持按照端口或监听器名称进行模糊查询
     * @param SearchValue 过滤条件，支持按照端口或监听器名称进行模糊查询
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。
该功能的启停无法在监听器创建完毕后再修改。 
     * @return Http3Supported 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。
该功能的启停无法在监听器创建完毕后再修改。
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。
该功能的启停无法在监听器创建完毕后再修改。
     * @param Http3Supported 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果支持了Http3的功能，那么该监听器会占用对应的UDP接入端口，不可再创建相同端口的UDP监听器。
该功能的启停无法在监听器创建完毕后再修改。
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public DescribeHTTPSListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHTTPSListenersRequest(DescribeHTTPSListenersRequest source) {
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
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
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
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

