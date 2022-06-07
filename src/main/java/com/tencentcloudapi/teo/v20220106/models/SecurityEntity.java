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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityEntity extends AbstractModel{

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 一级域名
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 二级域名
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 类型 domain/application
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 一级域名 
     * @return ZoneId 一级域名
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 一级域名
     * @param ZoneId 一级域名
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 二级域名 
     * @return Entity 二级域名
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 二级域名
     * @param Entity 二级域名
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 类型 domain/application 
     * @return EntityType 类型 domain/application
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set 类型 domain/application
     * @param EntityType 类型 domain/application
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    public SecurityEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityEntity(SecurityEntity source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);

    }
}

