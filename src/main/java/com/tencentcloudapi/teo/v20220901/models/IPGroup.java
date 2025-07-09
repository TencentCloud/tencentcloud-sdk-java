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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPGroup extends AbstractModel {

    /**
    * 组 Id，创建时填 0 即可。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 组名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * IP 组内容，仅支持 IP 及 IP 网段。
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
    * IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。
    */
    @SerializedName("IPTotalCount")
    @Expose
    private Long IPTotalCount;

    /**
    * IP 定时过期信息。
作为入参，用于为指定的 IP 地址或网段配置定时过期时间。
作为出参，包含以下两类信息：
<li>当前未到期的定时过期信息：尚未触发的过期配置。</li>
<li>一周内已到期的定时过期信息：已触发的过期配置。</li>
    */
    @SerializedName("IPExpireInfo")
    @Expose
    private IPExpireInfo [] IPExpireInfo;

    /**
     * Get 组 Id，创建时填 0 即可。 
     * @return GroupId 组 Id，创建时填 0 即可。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 组 Id，创建时填 0 即可。
     * @param GroupId 组 Id，创建时填 0 即可。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 组名称。 
     * @return Name 组名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组名称。
     * @param Name 组名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get IP 组内容，仅支持 IP 及 IP 网段。 
     * @return Content IP 组内容，仅支持 IP 及 IP 网段。
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set IP 组内容，仅支持 IP 及 IP 网段。
     * @param Content IP 组内容，仅支持 IP 及 IP 网段。
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    /**
     * Get IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。 
     * @return IPTotalCount IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。
     */
    public Long getIPTotalCount() {
        return this.IPTotalCount;
    }

    /**
     * Set IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。
     * @param IPTotalCount IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。
     */
    public void setIPTotalCount(Long IPTotalCount) {
        this.IPTotalCount = IPTotalCount;
    }

    /**
     * Get IP 定时过期信息。
作为入参，用于为指定的 IP 地址或网段配置定时过期时间。
作为出参，包含以下两类信息：
<li>当前未到期的定时过期信息：尚未触发的过期配置。</li>
<li>一周内已到期的定时过期信息：已触发的过期配置。</li> 
     * @return IPExpireInfo IP 定时过期信息。
作为入参，用于为指定的 IP 地址或网段配置定时过期时间。
作为出参，包含以下两类信息：
<li>当前未到期的定时过期信息：尚未触发的过期配置。</li>
<li>一周内已到期的定时过期信息：已触发的过期配置。</li>
     */
    public IPExpireInfo [] getIPExpireInfo() {
        return this.IPExpireInfo;
    }

    /**
     * Set IP 定时过期信息。
作为入参，用于为指定的 IP 地址或网段配置定时过期时间。
作为出参，包含以下两类信息：
<li>当前未到期的定时过期信息：尚未触发的过期配置。</li>
<li>一周内已到期的定时过期信息：已触发的过期配置。</li>
     * @param IPExpireInfo IP 定时过期信息。
作为入参，用于为指定的 IP 地址或网段配置定时过期时间。
作为出参，包含以下两类信息：
<li>当前未到期的定时过期信息：尚未触发的过期配置。</li>
<li>一周内已到期的定时过期信息：已触发的过期配置。</li>
     */
    public void setIPExpireInfo(IPExpireInfo [] IPExpireInfo) {
        this.IPExpireInfo = IPExpireInfo;
    }

    public IPGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPGroup(IPGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
        if (source.IPTotalCount != null) {
            this.IPTotalCount = new Long(source.IPTotalCount);
        }
        if (source.IPExpireInfo != null) {
            this.IPExpireInfo = new IPExpireInfo[source.IPExpireInfo.length];
            for (int i = 0; i < source.IPExpireInfo.length; i++) {
                this.IPExpireInfo[i] = new IPExpireInfo(source.IPExpireInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "IPTotalCount", this.IPTotalCount);
        this.setParamArrayObj(map, prefix + "IPExpireInfo.", this.IPExpireInfo);

    }
}

