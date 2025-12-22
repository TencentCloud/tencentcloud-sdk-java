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

public class OriginGroupReference extends AbstractModel {

    /**
    * 引用服务类型，取值有：
<li>acceleration-domain: 加速域名；</li>
<li>rule-engine: 规则引擎；</li>
<li>load-balancer: 负载均衡；</li>
<li>application-proxy: 四层代理。</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 引用类型的实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 引用类型的实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 引用站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 引用站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 引用站点别名。
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
     * Get 引用服务类型，取值有：
<li>acceleration-domain: 加速域名；</li>
<li>rule-engine: 规则引擎；</li>
<li>load-balancer: 负载均衡；</li>
<li>application-proxy: 四层代理。</li> 
     * @return InstanceType 引用服务类型，取值有：
<li>acceleration-domain: 加速域名；</li>
<li>rule-engine: 规则引擎；</li>
<li>load-balancer: 负载均衡；</li>
<li>application-proxy: 四层代理。</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 引用服务类型，取值有：
<li>acceleration-domain: 加速域名；</li>
<li>rule-engine: 规则引擎；</li>
<li>load-balancer: 负载均衡；</li>
<li>application-proxy: 四层代理。</li>
     * @param InstanceType 引用服务类型，取值有：
<li>acceleration-domain: 加速域名；</li>
<li>rule-engine: 规则引擎；</li>
<li>load-balancer: 负载均衡；</li>
<li>application-proxy: 四层代理。</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 引用类型的实例ID。 
     * @return InstanceId 引用类型的实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 引用类型的实例ID。
     * @param InstanceId 引用类型的实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 引用类型的实例名称。 
     * @return InstanceName 引用类型的实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 引用类型的实例名称。
     * @param InstanceName 引用类型的实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 引用站点ID。 
     * @return ZoneId 引用站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 引用站点ID。
     * @param ZoneId 引用站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 引用站点名称。 
     * @return ZoneName 引用站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 引用站点名称。
     * @param ZoneName 引用站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 引用站点别名。 
     * @return AliasZoneName 引用站点别名。
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set 引用站点别名。
     * @param AliasZoneName 引用站点别名。
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    public OriginGroupReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupReference(OriginGroupReference source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);

    }
}

