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

public class DescribeGroupDomainConfigResponse  extends AbstractModel{

    /**
    * 域名解析就近接入配置列表。
    */
    @SerializedName("AccessRegionList")
    @Expose
    private DomainAccessRegionDict [] AccessRegionList;

    /**
    * 默认访问Ip。
    */
    @SerializedName("DefaultDnsIp")
    @Expose
    private String DefaultDnsIp;

    /**
    * 通道组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 接入地域的配置的总数。
    */
    @SerializedName("AccessRegionCount")
    @Expose
    private Long AccessRegionCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取域名解析就近接入配置列表。
     * @return AccessRegionList 域名解析就近接入配置列表。
     */
    public DomainAccessRegionDict [] getAccessRegionList() {
        return this.AccessRegionList;
    }

    /**
     * 设置域名解析就近接入配置列表。
     * @param AccessRegionList 域名解析就近接入配置列表。
     */
    public void setAccessRegionList(DomainAccessRegionDict [] AccessRegionList) {
        this.AccessRegionList = AccessRegionList;
    }

    /**
     * 获取默认访问Ip。
     * @return DefaultDnsIp 默认访问Ip。
     */
    public String getDefaultDnsIp() {
        return this.DefaultDnsIp;
    }

    /**
     * 设置默认访问Ip。
     * @param DefaultDnsIp 默认访问Ip。
     */
    public void setDefaultDnsIp(String DefaultDnsIp) {
        this.DefaultDnsIp = DefaultDnsIp;
    }

    /**
     * 获取通道组ID。
     * @return GroupId 通道组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置通道组ID。
     * @param GroupId 通道组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取接入地域的配置的总数。
     * @return AccessRegionCount 接入地域的配置的总数。
     */
    public Long getAccessRegionCount() {
        return this.AccessRegionCount;
    }

    /**
     * 设置接入地域的配置的总数。
     * @param AccessRegionCount 接入地域的配置的总数。
     */
    public void setAccessRegionCount(Long AccessRegionCount) {
        this.AccessRegionCount = AccessRegionCount;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccessRegionList.", this.AccessRegionList);
        this.setParamSimple(map, prefix + "DefaultDnsIp", this.DefaultDnsIp);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "AccessRegionCount", this.AccessRegionCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

