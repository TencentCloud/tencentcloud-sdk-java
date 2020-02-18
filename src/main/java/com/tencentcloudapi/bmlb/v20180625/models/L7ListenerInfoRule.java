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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7ListenerInfoRule extends AbstractModel{

    /**
    * 转发域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发域名实例ID。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间戳。
    */
    @SerializedName("AddTimestamp")
    @Expose
    private String AddTimestamp;

    /**
    * 该转发域名下面的转发路径列表。
    */
    @SerializedName("LocationSet")
    @Expose
    private L7ListenerInfoLocation [] LocationSet;

    /**
     * Get 转发域名。 
     * @return Domain 转发域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发域名。
     * @param Domain 转发域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发域名实例ID。 
     * @return DomainId 转发域名实例ID。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 转发域名实例ID。
     * @param DomainId 转发域名实例ID。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。 
     * @return Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     * @param Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间戳。 
     * @return AddTimestamp 创建时间戳。
     */
    public String getAddTimestamp() {
        return this.AddTimestamp;
    }

    /**
     * Set 创建时间戳。
     * @param AddTimestamp 创建时间戳。
     */
    public void setAddTimestamp(String AddTimestamp) {
        this.AddTimestamp = AddTimestamp;
    }

    /**
     * Get 该转发域名下面的转发路径列表。 
     * @return LocationSet 该转发域名下面的转发路径列表。
     */
    public L7ListenerInfoLocation [] getLocationSet() {
        return this.LocationSet;
    }

    /**
     * Set 该转发域名下面的转发路径列表。
     * @param LocationSet 该转发域名下面的转发路径列表。
     */
    public void setLocationSet(L7ListenerInfoLocation [] LocationSet) {
        this.LocationSet = LocationSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTimestamp", this.AddTimestamp);
        this.setParamArrayObj(map, prefix + "LocationSet.", this.LocationSet);

    }
}

