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

public class CreateIpTableListRequest extends AbstractModel{

    /**
    * 站点Id。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 子域名/应用名。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 基础访问管控Ip规则列表。
    */
    @SerializedName("IpTableRules")
    @Expose
    private IpTableRule [] IpTableRules;

    /**
     * Get 站点Id。 
     * @return ZoneId 站点Id。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点Id。
     * @param ZoneId 站点Id。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 子域名/应用名。 
     * @return Entity 子域名/应用名。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 子域名/应用名。
     * @param Entity 子域名/应用名。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 基础访问管控Ip规则列表。 
     * @return IpTableRules 基础访问管控Ip规则列表。
     */
    public IpTableRule [] getIpTableRules() {
        return this.IpTableRules;
    }

    /**
     * Set 基础访问管控Ip规则列表。
     * @param IpTableRules 基础访问管控Ip规则列表。
     */
    public void setIpTableRules(IpTableRule [] IpTableRules) {
        this.IpTableRules = IpTableRules;
    }

    public CreateIpTableListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIpTableListRequest(CreateIpTableListRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.IpTableRules != null) {
            this.IpTableRules = new IpTableRule[source.IpTableRules.length];
            for (int i = 0; i < source.IpTableRules.length; i++) {
                this.IpTableRules[i] = new IpTableRule(source.IpTableRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamArrayObj(map, prefix + "IpTableRules.", this.IpTableRules);

    }
}

