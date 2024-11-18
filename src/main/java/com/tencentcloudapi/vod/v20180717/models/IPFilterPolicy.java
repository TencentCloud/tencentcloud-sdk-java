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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPFilterPolicy extends AbstractModel {

    /**
    * IP 访问限制状态，可选值：
<li>Enabled：启用；</li>
<li>Disabled：禁用。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * IP 访问限制类型：  <li>Black：黑名单方式校验。只有来自 IPList 列表中的 IP 请求会被拦截。</li>
<li>White：白名单方式校验。只有来自 IPList 列表中的 IP 请求会被放行。</li>当 Status 取值为 Enabled 时，FilterType  必须赋值。
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP 列表，支持 X.X.X.X 格式 IPV4 地址，或 X:X:X:X:X:X:X:X 格式 IPV6 地址，或网段格式 /N（IPV4:1≤N≤32；IPV6:1≤N≤128）；最多可填充 200 个 IP 或网段。当 Status 取值为 Enabled 时，IPList 必须赋值。
    */
    @SerializedName("IPList")
    @Expose
    private String [] IPList;

    /**
     * Get IP 访问限制状态，可选值：
<li>Enabled：启用；</li>
<li>Disabled：禁用。</li> 
     * @return Status IP 访问限制状态，可选值：
<li>Enabled：启用；</li>
<li>Disabled：禁用。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set IP 访问限制状态，可选值：
<li>Enabled：启用；</li>
<li>Disabled：禁用。</li>
     * @param Status IP 访问限制状态，可选值：
<li>Enabled：启用；</li>
<li>Disabled：禁用。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get IP 访问限制类型：  <li>Black：黑名单方式校验。只有来自 IPList 列表中的 IP 请求会被拦截。</li>
<li>White：白名单方式校验。只有来自 IPList 列表中的 IP 请求会被放行。</li>当 Status 取值为 Enabled 时，FilterType  必须赋值。 
     * @return FilterType IP 访问限制类型：  <li>Black：黑名单方式校验。只有来自 IPList 列表中的 IP 请求会被拦截。</li>
<li>White：白名单方式校验。只有来自 IPList 列表中的 IP 请求会被放行。</li>当 Status 取值为 Enabled 时，FilterType  必须赋值。
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP 访问限制类型：  <li>Black：黑名单方式校验。只有来自 IPList 列表中的 IP 请求会被拦截。</li>
<li>White：白名单方式校验。只有来自 IPList 列表中的 IP 请求会被放行。</li>当 Status 取值为 Enabled 时，FilterType  必须赋值。
     * @param FilterType IP 访问限制类型：  <li>Black：黑名单方式校验。只有来自 IPList 列表中的 IP 请求会被拦截。</li>
<li>White：白名单方式校验。只有来自 IPList 列表中的 IP 请求会被放行。</li>当 Status 取值为 Enabled 时，FilterType  必须赋值。
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP 列表，支持 X.X.X.X 格式 IPV4 地址，或 X:X:X:X:X:X:X:X 格式 IPV6 地址，或网段格式 /N（IPV4:1≤N≤32；IPV6:1≤N≤128）；最多可填充 200 个 IP 或网段。当 Status 取值为 Enabled 时，IPList 必须赋值。 
     * @return IPList IP 列表，支持 X.X.X.X 格式 IPV4 地址，或 X:X:X:X:X:X:X:X 格式 IPV6 地址，或网段格式 /N（IPV4:1≤N≤32；IPV6:1≤N≤128）；最多可填充 200 个 IP 或网段。当 Status 取值为 Enabled 时，IPList 必须赋值。
     */
    public String [] getIPList() {
        return this.IPList;
    }

    /**
     * Set IP 列表，支持 X.X.X.X 格式 IPV4 地址，或 X:X:X:X:X:X:X:X 格式 IPV6 地址，或网段格式 /N（IPV4:1≤N≤32；IPV6:1≤N≤128）；最多可填充 200 个 IP 或网段。当 Status 取值为 Enabled 时，IPList 必须赋值。
     * @param IPList IP 列表，支持 X.X.X.X 格式 IPV4 地址，或 X:X:X:X:X:X:X:X 格式 IPV6 地址，或网段格式 /N（IPV4:1≤N≤32；IPV6:1≤N≤128）；最多可填充 200 个 IP 或网段。当 Status 取值为 Enabled 时，IPList 必须赋值。
     */
    public void setIPList(String [] IPList) {
        this.IPList = IPList;
    }

    public IPFilterPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPFilterPolicy(IPFilterPolicy source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.IPList != null) {
            this.IPList = new String[source.IPList.length];
            for (int i = 0; i < source.IPList.length; i++) {
                this.IPList[i] = new String(source.IPList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "IPList.", this.IPList);

    }
}

