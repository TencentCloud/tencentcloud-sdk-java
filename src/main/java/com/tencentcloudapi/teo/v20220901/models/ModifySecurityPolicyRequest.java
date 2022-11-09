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

public class ModifySecurityPolicyRequest extends AbstractModel{

    /**
    * 站点Id。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 安全配置。
    */
    @SerializedName("SecurityConfig")
    @Expose
    private SecurityConfig SecurityConfig;

    /**
    * 子域名/应用名。当使用Entity时可不填写TemplateId，否则必须填写TemplateId。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 模板策略id。当使用模板Id时可不填Entity，否则必须填写Entity。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

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
     * Get 安全配置。 
     * @return SecurityConfig 安全配置。
     */
    public SecurityConfig getSecurityConfig() {
        return this.SecurityConfig;
    }

    /**
     * Set 安全配置。
     * @param SecurityConfig 安全配置。
     */
    public void setSecurityConfig(SecurityConfig SecurityConfig) {
        this.SecurityConfig = SecurityConfig;
    }

    /**
     * Get 子域名/应用名。当使用Entity时可不填写TemplateId，否则必须填写TemplateId。 
     * @return Entity 子域名/应用名。当使用Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 子域名/应用名。当使用Entity时可不填写TemplateId，否则必须填写TemplateId。
     * @param Entity 子域名/应用名。当使用Entity时可不填写TemplateId，否则必须填写TemplateId。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 模板策略id。当使用模板Id时可不填Entity，否则必须填写Entity。 
     * @return TemplateId 模板策略id。当使用模板Id时可不填Entity，否则必须填写Entity。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板策略id。当使用模板Id时可不填Entity，否则必须填写Entity。
     * @param TemplateId 模板策略id。当使用模板Id时可不填Entity，否则必须填写Entity。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public ModifySecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityPolicyRequest(ModifySecurityPolicyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SecurityConfig != null) {
            this.SecurityConfig = new SecurityConfig(source.SecurityConfig);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "SecurityConfig.", this.SecurityConfig);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

