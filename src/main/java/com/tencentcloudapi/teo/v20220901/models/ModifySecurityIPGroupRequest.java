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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityIPGroupRequest extends AbstractModel {

    /**
    * 站点 Id。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * IP 组配置。
    */
    @SerializedName("IPGroup")
    @Expose
    private IPGroup IPGroup;

    /**
    * 操作类型，取值有：<li> append: 向 IPGroup 中添加新的 IP 地址或设置定时过期时间；</li><li>  remove: 从 IPGroup 中删除指定的 IP 地址或其定时过期时间；</li><li>  update: 完全替换 IPGroup 中 Content 或 ExpireInfo 的内容，并且可以修改 IPGroup 的名称。</li>    使用 append 操作时注意：   <li> 为 IP 或网段添加定时过期时间时，必须晚于当前时间。如果该 IP 或网段在组中不存在，必须同时在 Content 参数中添加该 IP 或网段。若该 IP 或网段已存在过期时间，则新时间将覆盖原有时间。</li>  使用 remove 操作时注意： <li> 删除 IP 或网段时，相关的未过期的定时过期时间也会被删除；</li> <li> 删除定时过期时间时，仅能删除当前未过期的时间。</li>  使用 update 操作时注意： <li> 替换 Content 内容时，不在 Content 中的 IP 或网段的未过期时间会被删除；</li> <li> 替换 IPExpireInfo 内容时，IPExpireInfo 中的 IP 或网段必须在 Content 中或在 IP 组中存在。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get 站点 Id。 
     * @return ZoneId 站点 Id。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 Id。
     * @param ZoneId 站点 Id。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get IP 组配置。 
     * @return IPGroup IP 组配置。
     */
    public IPGroup getIPGroup() {
        return this.IPGroup;
    }

    /**
     * Set IP 组配置。
     * @param IPGroup IP 组配置。
     */
    public void setIPGroup(IPGroup IPGroup) {
        this.IPGroup = IPGroup;
    }

    /**
     * Get 操作类型，取值有：<li> append: 向 IPGroup 中添加新的 IP 地址或设置定时过期时间；</li><li>  remove: 从 IPGroup 中删除指定的 IP 地址或其定时过期时间；</li><li>  update: 完全替换 IPGroup 中 Content 或 ExpireInfo 的内容，并且可以修改 IPGroup 的名称。</li>    使用 append 操作时注意：   <li> 为 IP 或网段添加定时过期时间时，必须晚于当前时间。如果该 IP 或网段在组中不存在，必须同时在 Content 参数中添加该 IP 或网段。若该 IP 或网段已存在过期时间，则新时间将覆盖原有时间。</li>  使用 remove 操作时注意： <li> 删除 IP 或网段时，相关的未过期的定时过期时间也会被删除；</li> <li> 删除定时过期时间时，仅能删除当前未过期的时间。</li>  使用 update 操作时注意： <li> 替换 Content 内容时，不在 Content 中的 IP 或网段的未过期时间会被删除；</li> <li> 替换 IPExpireInfo 内容时，IPExpireInfo 中的 IP 或网段必须在 Content 中或在 IP 组中存在。</li> 
     * @return Mode 操作类型，取值有：<li> append: 向 IPGroup 中添加新的 IP 地址或设置定时过期时间；</li><li>  remove: 从 IPGroup 中删除指定的 IP 地址或其定时过期时间；</li><li>  update: 完全替换 IPGroup 中 Content 或 ExpireInfo 的内容，并且可以修改 IPGroup 的名称。</li>    使用 append 操作时注意：   <li> 为 IP 或网段添加定时过期时间时，必须晚于当前时间。如果该 IP 或网段在组中不存在，必须同时在 Content 参数中添加该 IP 或网段。若该 IP 或网段已存在过期时间，则新时间将覆盖原有时间。</li>  使用 remove 操作时注意： <li> 删除 IP 或网段时，相关的未过期的定时过期时间也会被删除；</li> <li> 删除定时过期时间时，仅能删除当前未过期的时间。</li>  使用 update 操作时注意： <li> 替换 Content 内容时，不在 Content 中的 IP 或网段的未过期时间会被删除；</li> <li> 替换 IPExpireInfo 内容时，IPExpireInfo 中的 IP 或网段必须在 Content 中或在 IP 组中存在。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 操作类型，取值有：<li> append: 向 IPGroup 中添加新的 IP 地址或设置定时过期时间；</li><li>  remove: 从 IPGroup 中删除指定的 IP 地址或其定时过期时间；</li><li>  update: 完全替换 IPGroup 中 Content 或 ExpireInfo 的内容，并且可以修改 IPGroup 的名称。</li>    使用 append 操作时注意：   <li> 为 IP 或网段添加定时过期时间时，必须晚于当前时间。如果该 IP 或网段在组中不存在，必须同时在 Content 参数中添加该 IP 或网段。若该 IP 或网段已存在过期时间，则新时间将覆盖原有时间。</li>  使用 remove 操作时注意： <li> 删除 IP 或网段时，相关的未过期的定时过期时间也会被删除；</li> <li> 删除定时过期时间时，仅能删除当前未过期的时间。</li>  使用 update 操作时注意： <li> 替换 Content 内容时，不在 Content 中的 IP 或网段的未过期时间会被删除；</li> <li> 替换 IPExpireInfo 内容时，IPExpireInfo 中的 IP 或网段必须在 Content 中或在 IP 组中存在。</li>
     * @param Mode 操作类型，取值有：<li> append: 向 IPGroup 中添加新的 IP 地址或设置定时过期时间；</li><li>  remove: 从 IPGroup 中删除指定的 IP 地址或其定时过期时间；</li><li>  update: 完全替换 IPGroup 中 Content 或 ExpireInfo 的内容，并且可以修改 IPGroup 的名称。</li>    使用 append 操作时注意：   <li> 为 IP 或网段添加定时过期时间时，必须晚于当前时间。如果该 IP 或网段在组中不存在，必须同时在 Content 参数中添加该 IP 或网段。若该 IP 或网段已存在过期时间，则新时间将覆盖原有时间。</li>  使用 remove 操作时注意： <li> 删除 IP 或网段时，相关的未过期的定时过期时间也会被删除；</li> <li> 删除定时过期时间时，仅能删除当前未过期的时间。</li>  使用 update 操作时注意： <li> 替换 Content 内容时，不在 Content 中的 IP 或网段的未过期时间会被删除；</li> <li> 替换 IPExpireInfo 内容时，IPExpireInfo 中的 IP 或网段必须在 Content 中或在 IP 组中存在。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public ModifySecurityIPGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityIPGroupRequest(ModifySecurityIPGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IPGroup != null) {
            this.IPGroup = new IPGroup(source.IPGroup);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "IPGroup.", this.IPGroup);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

