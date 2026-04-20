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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccessPolicyRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>路由ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * <p>公网IP白名单配置</p><p>不传默认删除全部配置</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private IpWhitelistDTO [] IpWhitelist;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>路由ID</p> 
     * @return RouteId <p>路由ID</p>
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>路由ID</p>
     * @param RouteId <p>路由ID</p>
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>公网IP白名单配置</p><p>不传默认删除全部配置</p> 
     * @return IpWhitelist <p>公网IP白名单配置</p><p>不传默认删除全部配置</p>
     */
    public IpWhitelistDTO [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>公网IP白名单配置</p><p>不传默认删除全部配置</p>
     * @param IpWhitelist <p>公网IP白名单配置</p><p>不传默认删除全部配置</p>
     */
    public void setIpWhitelist(IpWhitelistDTO [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    public ModifyAccessPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccessPolicyRequest(ModifyAccessPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new IpWhitelistDTO[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new IpWhitelistDTO(source.IpWhitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamArrayObj(map, prefix + "IpWhitelist.", this.IpWhitelist);

    }
}

