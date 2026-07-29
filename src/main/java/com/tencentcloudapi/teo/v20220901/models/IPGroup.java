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
    * <p>IP 组 Id，创建时填 0 即可。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>IP 组名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>IP 组内容，仅支持 IP 及 IP 网段。</p>
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
    * <p>IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。</p>
    */
    @SerializedName("IPTotalCount")
    @Expose
    private Long IPTotalCount;

    /**
    * <p>IP 定时过期信息。<br>作为入参，用于为指定的 IP 地址或网段配置定时过期时间。<br>作为出参，包含以下两类信息：</p><li>当前未到期的定时过期信息：尚未触发的过期配置。</li><li>一周内已到期的定时过期信息：已触发的过期配置。</li>
    */
    @SerializedName("IPExpireInfo")
    @Expose
    private IPExpireInfo [] IPExpireInfo;

    /**
    * <p>IP 组被引用的数量。</p>
    */
    @SerializedName("RefCount")
    @Expose
    private Long RefCount;

    /**
     * Get <p>IP 组 Id，创建时填 0 即可。</p> 
     * @return GroupId <p>IP 组 Id，创建时填 0 即可。</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>IP 组 Id，创建时填 0 即可。</p>
     * @param GroupId <p>IP 组 Id，创建时填 0 即可。</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>IP 组名称。</p> 
     * @return Name <p>IP 组名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>IP 组名称。</p>
     * @param Name <p>IP 组名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>IP 组内容，仅支持 IP 及 IP 网段。</p> 
     * @return Content <p>IP 组内容，仅支持 IP 及 IP 网段。</p>
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set <p>IP 组内容，仅支持 IP 及 IP 网段。</p>
     * @param Content <p>IP 组内容，仅支持 IP 及 IP 网段。</p>
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    /**
     * Get <p>IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。</p> 
     * @return IPTotalCount <p>IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。</p>
     */
    public Long getIPTotalCount() {
        return this.IPTotalCount;
    }

    /**
     * Set <p>IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。</p>
     * @param IPTotalCount <p>IP 组中正在生效的 IP 或网段个数。作为出参时有效，作为入参时无需填写该字段。</p>
     */
    public void setIPTotalCount(Long IPTotalCount) {
        this.IPTotalCount = IPTotalCount;
    }

    /**
     * Get <p>IP 定时过期信息。<br>作为入参，用于为指定的 IP 地址或网段配置定时过期时间。<br>作为出参，包含以下两类信息：</p><li>当前未到期的定时过期信息：尚未触发的过期配置。</li><li>一周内已到期的定时过期信息：已触发的过期配置。</li> 
     * @return IPExpireInfo <p>IP 定时过期信息。<br>作为入参，用于为指定的 IP 地址或网段配置定时过期时间。<br>作为出参，包含以下两类信息：</p><li>当前未到期的定时过期信息：尚未触发的过期配置。</li><li>一周内已到期的定时过期信息：已触发的过期配置。</li>
     */
    public IPExpireInfo [] getIPExpireInfo() {
        return this.IPExpireInfo;
    }

    /**
     * Set <p>IP 定时过期信息。<br>作为入参，用于为指定的 IP 地址或网段配置定时过期时间。<br>作为出参，包含以下两类信息：</p><li>当前未到期的定时过期信息：尚未触发的过期配置。</li><li>一周内已到期的定时过期信息：已触发的过期配置。</li>
     * @param IPExpireInfo <p>IP 定时过期信息。<br>作为入参，用于为指定的 IP 地址或网段配置定时过期时间。<br>作为出参，包含以下两类信息：</p><li>当前未到期的定时过期信息：尚未触发的过期配置。</li><li>一周内已到期的定时过期信息：已触发的过期配置。</li>
     */
    public void setIPExpireInfo(IPExpireInfo [] IPExpireInfo) {
        this.IPExpireInfo = IPExpireInfo;
    }

    /**
     * Get <p>IP 组被引用的数量。</p> 
     * @return RefCount <p>IP 组被引用的数量。</p>
     */
    public Long getRefCount() {
        return this.RefCount;
    }

    /**
     * Set <p>IP 组被引用的数量。</p>
     * @param RefCount <p>IP 组被引用的数量。</p>
     */
    public void setRefCount(Long RefCount) {
        this.RefCount = RefCount;
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
        if (source.RefCount != null) {
            this.RefCount = new Long(source.RefCount);
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
        this.setParamSimple(map, prefix + "RefCount", this.RefCount);

    }
}

