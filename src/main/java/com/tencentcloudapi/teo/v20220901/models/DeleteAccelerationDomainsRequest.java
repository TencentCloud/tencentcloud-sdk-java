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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccelerationDomainsRequest extends AbstractModel{

    /**
    * 加速域名所属站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 需要删除的加速域名ID列表。
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
    * 是否强制删除。当域名存在关联资源（如马甲域名、流量调度功能）时，是否强制删除该域名，取值有：
<li> true：删除该域名及所有关联资源；</li>
<li> false：当该加速域名存在关联资源时，不允许删除。</li>不填写，默认值为：false。
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get 加速域名所属站点ID。 
     * @return ZoneId 加速域名所属站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 加速域名所属站点ID。
     * @param ZoneId 加速域名所属站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 需要删除的加速域名ID列表。 
     * @return DomainNames 需要删除的加速域名ID列表。
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 需要删除的加速域名ID列表。
     * @param DomainNames 需要删除的加速域名ID列表。
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get 是否强制删除。当域名存在关联资源（如马甲域名、流量调度功能）时，是否强制删除该域名，取值有：
<li> true：删除该域名及所有关联资源；</li>
<li> false：当该加速域名存在关联资源时，不允许删除。</li>不填写，默认值为：false。 
     * @return Force 是否强制删除。当域名存在关联资源（如马甲域名、流量调度功能）时，是否强制删除该域名，取值有：
<li> true：删除该域名及所有关联资源；</li>
<li> false：当该加速域名存在关联资源时，不允许删除。</li>不填写，默认值为：false。
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 是否强制删除。当域名存在关联资源（如马甲域名、流量调度功能）时，是否强制删除该域名，取值有：
<li> true：删除该域名及所有关联资源；</li>
<li> false：当该加速域名存在关联资源时，不允许删除。</li>不填写，默认值为：false。
     * @param Force 是否强制删除。当域名存在关联资源（如马甲域名、流量调度功能）时，是否强制删除该域名，取值有：
<li> true：删除该域名及所有关联资源；</li>
<li> false：当该加速域名存在关联资源时，不允许删除。</li>不填写，默认值为：false。
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public DeleteAccelerationDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccelerationDomainsRequest(DeleteAccelerationDomainsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

