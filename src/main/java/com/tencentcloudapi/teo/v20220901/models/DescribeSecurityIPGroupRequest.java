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

public class DescribeSecurityIPGroupRequest extends AbstractModel {

    /**
    * 站点 ID ，用于指定查询的站点范围。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 指定安全 IP 组 ID。 <li>提供该参数时，仅查询指定 ID 的安全 IP 组配置；</li> <li>不传递参数时，返回站点下所有安全 IP 组信息。</li>
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
     * Get 站点 ID ，用于指定查询的站点范围。 
     * @return ZoneId 站点 ID ，用于指定查询的站点范围。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID ，用于指定查询的站点范围。
     * @param ZoneId 站点 ID ，用于指定查询的站点范围。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 指定安全 IP 组 ID。 <li>提供该参数时，仅查询指定 ID 的安全 IP 组配置；</li> <li>不传递参数时，返回站点下所有安全 IP 组信息。</li> 
     * @return GroupIds 指定安全 IP 组 ID。 <li>提供该参数时，仅查询指定 ID 的安全 IP 组配置；</li> <li>不传递参数时，返回站点下所有安全 IP 组信息。</li>
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 指定安全 IP 组 ID。 <li>提供该参数时，仅查询指定 ID 的安全 IP 组配置；</li> <li>不传递参数时，返回站点下所有安全 IP 组信息。</li>
     * @param GroupIds 指定安全 IP 组 ID。 <li>提供该参数时，仅查询指定 ID 的安全 IP 组配置；</li> <li>不传递参数时，返回站点下所有安全 IP 组信息。</li>
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public DescribeSecurityIPGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityIPGroupRequest(DescribeSecurityIPGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);

    }
}

