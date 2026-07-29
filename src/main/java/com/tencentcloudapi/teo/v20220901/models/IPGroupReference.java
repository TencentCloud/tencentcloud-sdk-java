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

public class IPGroupReference extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>实体类型。</p><p>枚举值：</p><ul><li>WebSec.ZonePolicy： 站点级防护策略</li><li>WebSec.HostPolicy： 域名级防护策略</li><li>WebSec.Template： 策略模板</li><li>DDoS.L4Proxy： 四层代理 DDoS 防护</li><li>DDoS.L3Transit： 三层代播 DDoS 防护</li></ul>
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：站点 ID；</li><li>WebSec.HostPolicy：域名；</li><li>WebSec.Template：模板 ID；</li><li>DDoS.L4Proxy：实例 ID；</li><li>DDoS.L3Transit：实例 ID。</li></ul>
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：空；</li><li>WebSec.HostPolicy：空；</li><li>WebSec.Template：模板名称；</li><li>DDoS.L4Proxy：空；</li><li>DDoS.L3Transit：空。</li></ul>
    */
    @SerializedName("EntityName")
    @Expose
    private String EntityName;

    /**
    * <p>子实体类型。</p><p>枚举值：</p><ul><li>WebSec.ExceptionRule： 防护例外规则</li><li>WebSec.BasicAccessRule： 基础访问管控</li><li>WebSec.PreciseMatchRule： 精确匹配规则</li><li>WebSec.RateLimitRule： 精准速率限制</li><li>WebSec.BotCustomRule： 高级 Bot 管理 - 自定义规则</li><li>DDoS.L4Proxy.IpAccessControl： 四层代理 DDoS 防护 - IP 黑白名单</li><li>DDoS.L3Transit.IpAccessControl： 三层代播 DDoS 防护 - IP 黑白名单</li></ul>
    */
    @SerializedName("SubEntityType")
    @Expose
    private String SubEntityType;

    /**
    * <p>子实体标识，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则 ID；</li><li>WebSec.BasicAccessRule：规则 ID；</li><li>WebSec.PreciseMatchRule：规则 ID；</li><li>WebSec.RateLimitRule：规则 ID；</li><li>WebSec.BotCustomRule：规则 ID；</li><li>DDoS.L4Proxy.IpAccessControl：空；</li><li>DDoS.L3Transit.IpAccessControl：空。</li></ul><p>EntityType 与 SubEntityType 为对应关系，不同的 EntityType 支持不同的 SubEntityType。<br>WebSec.ZonePolicy，WebSec.HostPolicy 和 WebSec.Template 支持如下 SubEntityType：</p><ul><li>WebSec.ExceptionRule；</li><li>WebSec.BasicAccessRule；</li><li>WebSec.PreciseMatchRule；</li><li>WebSec.RateLimitRule；</li><li>WebSec.BotCustomRule。</li></ul>DDoS.L4Proxy 支持如下 SubEntityType：<ul><li>DDoS.L4Proxy.IpAccessControl；</li></ul>DDoS.L3Transit 支持如下 SubEntityType：<ul><li>DDoS.L3Transit.IpAccessControl。</li></ul>
    */
    @SerializedName("SubEntityId")
    @Expose
    private String SubEntityId;

    /**
    * <p>子实体名称，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则名称；</li><li>WebSec.BasicAccessRule：规则名称；</li><li>WebSec.PreciseMatchRule：规则名称；</li><li>WebSec.RateLimitRule：规则名称；</li><li>WebSec.BotCustomRule：规则名称；</li><li>DDoS.L4Proxy.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单；</li><li>DDoS.L3Transit.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单。</li></ul>
    */
    @SerializedName("SubEntityName")
    @Expose
    private String SubEntityName;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>实体类型。</p><p>枚举值：</p><ul><li>WebSec.ZonePolicy： 站点级防护策略</li><li>WebSec.HostPolicy： 域名级防护策略</li><li>WebSec.Template： 策略模板</li><li>DDoS.L4Proxy： 四层代理 DDoS 防护</li><li>DDoS.L3Transit： 三层代播 DDoS 防护</li></ul> 
     * @return EntityType <p>实体类型。</p><p>枚举值：</p><ul><li>WebSec.ZonePolicy： 站点级防护策略</li><li>WebSec.HostPolicy： 域名级防护策略</li><li>WebSec.Template： 策略模板</li><li>DDoS.L4Proxy： 四层代理 DDoS 防护</li><li>DDoS.L3Transit： 三层代播 DDoS 防护</li></ul>
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set <p>实体类型。</p><p>枚举值：</p><ul><li>WebSec.ZonePolicy： 站点级防护策略</li><li>WebSec.HostPolicy： 域名级防护策略</li><li>WebSec.Template： 策略模板</li><li>DDoS.L4Proxy： 四层代理 DDoS 防护</li><li>DDoS.L3Transit： 三层代播 DDoS 防护</li></ul>
     * @param EntityType <p>实体类型。</p><p>枚举值：</p><ul><li>WebSec.ZonePolicy： 站点级防护策略</li><li>WebSec.HostPolicy： 域名级防护策略</li><li>WebSec.Template： 策略模板</li><li>DDoS.L4Proxy： 四层代理 DDoS 防护</li><li>DDoS.L3Transit： 三层代播 DDoS 防护</li></ul>
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：站点 ID；</li><li>WebSec.HostPolicy：域名；</li><li>WebSec.Template：模板 ID；</li><li>DDoS.L4Proxy：实例 ID；</li><li>DDoS.L3Transit：实例 ID。</li></ul> 
     * @return EntityId <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：站点 ID；</li><li>WebSec.HostPolicy：域名；</li><li>WebSec.Template：模板 ID；</li><li>DDoS.L4Proxy：实例 ID；</li><li>DDoS.L3Transit：实例 ID。</li></ul>
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：站点 ID；</li><li>WebSec.HostPolicy：域名；</li><li>WebSec.Template：模板 ID；</li><li>DDoS.L4Proxy：实例 ID；</li><li>DDoS.L3Transit：实例 ID。</li></ul>
     * @param EntityId <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：站点 ID；</li><li>WebSec.HostPolicy：域名；</li><li>WebSec.Template：模板 ID；</li><li>DDoS.L4Proxy：实例 ID；</li><li>DDoS.L3Transit：实例 ID。</li></ul>
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：空；</li><li>WebSec.HostPolicy：空；</li><li>WebSec.Template：模板名称；</li><li>DDoS.L4Proxy：空；</li><li>DDoS.L3Transit：空。</li></ul> 
     * @return EntityName <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：空；</li><li>WebSec.HostPolicy：空；</li><li>WebSec.Template：模板名称；</li><li>DDoS.L4Proxy：空；</li><li>DDoS.L3Transit：空。</li></ul>
     */
    public String getEntityName() {
        return this.EntityName;
    }

    /**
     * Set <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：空；</li><li>WebSec.HostPolicy：空；</li><li>WebSec.Template：模板名称；</li><li>DDoS.L4Proxy：空；</li><li>DDoS.L3Transit：空。</li></ul>
     * @param EntityName <p>实体标识，根据 EntityType 不同代表不同的含义：</p><ul><li>WebSec.ZonePolicy：空；</li><li>WebSec.HostPolicy：空；</li><li>WebSec.Template：模板名称；</li><li>DDoS.L4Proxy：空；</li><li>DDoS.L3Transit：空。</li></ul>
     */
    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    /**
     * Get <p>子实体类型。</p><p>枚举值：</p><ul><li>WebSec.ExceptionRule： 防护例外规则</li><li>WebSec.BasicAccessRule： 基础访问管控</li><li>WebSec.PreciseMatchRule： 精确匹配规则</li><li>WebSec.RateLimitRule： 精准速率限制</li><li>WebSec.BotCustomRule： 高级 Bot 管理 - 自定义规则</li><li>DDoS.L4Proxy.IpAccessControl： 四层代理 DDoS 防护 - IP 黑白名单</li><li>DDoS.L3Transit.IpAccessControl： 三层代播 DDoS 防护 - IP 黑白名单</li></ul> 
     * @return SubEntityType <p>子实体类型。</p><p>枚举值：</p><ul><li>WebSec.ExceptionRule： 防护例外规则</li><li>WebSec.BasicAccessRule： 基础访问管控</li><li>WebSec.PreciseMatchRule： 精确匹配规则</li><li>WebSec.RateLimitRule： 精准速率限制</li><li>WebSec.BotCustomRule： 高级 Bot 管理 - 自定义规则</li><li>DDoS.L4Proxy.IpAccessControl： 四层代理 DDoS 防护 - IP 黑白名单</li><li>DDoS.L3Transit.IpAccessControl： 三层代播 DDoS 防护 - IP 黑白名单</li></ul>
     */
    public String getSubEntityType() {
        return this.SubEntityType;
    }

    /**
     * Set <p>子实体类型。</p><p>枚举值：</p><ul><li>WebSec.ExceptionRule： 防护例外规则</li><li>WebSec.BasicAccessRule： 基础访问管控</li><li>WebSec.PreciseMatchRule： 精确匹配规则</li><li>WebSec.RateLimitRule： 精准速率限制</li><li>WebSec.BotCustomRule： 高级 Bot 管理 - 自定义规则</li><li>DDoS.L4Proxy.IpAccessControl： 四层代理 DDoS 防护 - IP 黑白名单</li><li>DDoS.L3Transit.IpAccessControl： 三层代播 DDoS 防护 - IP 黑白名单</li></ul>
     * @param SubEntityType <p>子实体类型。</p><p>枚举值：</p><ul><li>WebSec.ExceptionRule： 防护例外规则</li><li>WebSec.BasicAccessRule： 基础访问管控</li><li>WebSec.PreciseMatchRule： 精确匹配规则</li><li>WebSec.RateLimitRule： 精准速率限制</li><li>WebSec.BotCustomRule： 高级 Bot 管理 - 自定义规则</li><li>DDoS.L4Proxy.IpAccessControl： 四层代理 DDoS 防护 - IP 黑白名单</li><li>DDoS.L3Transit.IpAccessControl： 三层代播 DDoS 防护 - IP 黑白名单</li></ul>
     */
    public void setSubEntityType(String SubEntityType) {
        this.SubEntityType = SubEntityType;
    }

    /**
     * Get <p>子实体标识，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则 ID；</li><li>WebSec.BasicAccessRule：规则 ID；</li><li>WebSec.PreciseMatchRule：规则 ID；</li><li>WebSec.RateLimitRule：规则 ID；</li><li>WebSec.BotCustomRule：规则 ID；</li><li>DDoS.L4Proxy.IpAccessControl：空；</li><li>DDoS.L3Transit.IpAccessControl：空。</li></ul><p>EntityType 与 SubEntityType 为对应关系，不同的 EntityType 支持不同的 SubEntityType。<br>WebSec.ZonePolicy，WebSec.HostPolicy 和 WebSec.Template 支持如下 SubEntityType：</p><ul><li>WebSec.ExceptionRule；</li><li>WebSec.BasicAccessRule；</li><li>WebSec.PreciseMatchRule；</li><li>WebSec.RateLimitRule；</li><li>WebSec.BotCustomRule。</li></ul>DDoS.L4Proxy 支持如下 SubEntityType：<ul><li>DDoS.L4Proxy.IpAccessControl；</li></ul>DDoS.L3Transit 支持如下 SubEntityType：<ul><li>DDoS.L3Transit.IpAccessControl。</li></ul> 
     * @return SubEntityId <p>子实体标识，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则 ID；</li><li>WebSec.BasicAccessRule：规则 ID；</li><li>WebSec.PreciseMatchRule：规则 ID；</li><li>WebSec.RateLimitRule：规则 ID；</li><li>WebSec.BotCustomRule：规则 ID；</li><li>DDoS.L4Proxy.IpAccessControl：空；</li><li>DDoS.L3Transit.IpAccessControl：空。</li></ul><p>EntityType 与 SubEntityType 为对应关系，不同的 EntityType 支持不同的 SubEntityType。<br>WebSec.ZonePolicy，WebSec.HostPolicy 和 WebSec.Template 支持如下 SubEntityType：</p><ul><li>WebSec.ExceptionRule；</li><li>WebSec.BasicAccessRule；</li><li>WebSec.PreciseMatchRule；</li><li>WebSec.RateLimitRule；</li><li>WebSec.BotCustomRule。</li></ul>DDoS.L4Proxy 支持如下 SubEntityType：<ul><li>DDoS.L4Proxy.IpAccessControl；</li></ul>DDoS.L3Transit 支持如下 SubEntityType：<ul><li>DDoS.L3Transit.IpAccessControl。</li></ul>
     */
    public String getSubEntityId() {
        return this.SubEntityId;
    }

    /**
     * Set <p>子实体标识，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则 ID；</li><li>WebSec.BasicAccessRule：规则 ID；</li><li>WebSec.PreciseMatchRule：规则 ID；</li><li>WebSec.RateLimitRule：规则 ID；</li><li>WebSec.BotCustomRule：规则 ID；</li><li>DDoS.L4Proxy.IpAccessControl：空；</li><li>DDoS.L3Transit.IpAccessControl：空。</li></ul><p>EntityType 与 SubEntityType 为对应关系，不同的 EntityType 支持不同的 SubEntityType。<br>WebSec.ZonePolicy，WebSec.HostPolicy 和 WebSec.Template 支持如下 SubEntityType：</p><ul><li>WebSec.ExceptionRule；</li><li>WebSec.BasicAccessRule；</li><li>WebSec.PreciseMatchRule；</li><li>WebSec.RateLimitRule；</li><li>WebSec.BotCustomRule。</li></ul>DDoS.L4Proxy 支持如下 SubEntityType：<ul><li>DDoS.L4Proxy.IpAccessControl；</li></ul>DDoS.L3Transit 支持如下 SubEntityType：<ul><li>DDoS.L3Transit.IpAccessControl。</li></ul>
     * @param SubEntityId <p>子实体标识，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则 ID；</li><li>WebSec.BasicAccessRule：规则 ID；</li><li>WebSec.PreciseMatchRule：规则 ID；</li><li>WebSec.RateLimitRule：规则 ID；</li><li>WebSec.BotCustomRule：规则 ID；</li><li>DDoS.L4Proxy.IpAccessControl：空；</li><li>DDoS.L3Transit.IpAccessControl：空。</li></ul><p>EntityType 与 SubEntityType 为对应关系，不同的 EntityType 支持不同的 SubEntityType。<br>WebSec.ZonePolicy，WebSec.HostPolicy 和 WebSec.Template 支持如下 SubEntityType：</p><ul><li>WebSec.ExceptionRule；</li><li>WebSec.BasicAccessRule；</li><li>WebSec.PreciseMatchRule；</li><li>WebSec.RateLimitRule；</li><li>WebSec.BotCustomRule。</li></ul>DDoS.L4Proxy 支持如下 SubEntityType：<ul><li>DDoS.L4Proxy.IpAccessControl；</li></ul>DDoS.L3Transit 支持如下 SubEntityType：<ul><li>DDoS.L3Transit.IpAccessControl。</li></ul>
     */
    public void setSubEntityId(String SubEntityId) {
        this.SubEntityId = SubEntityId;
    }

    /**
     * Get <p>子实体名称，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则名称；</li><li>WebSec.BasicAccessRule：规则名称；</li><li>WebSec.PreciseMatchRule：规则名称；</li><li>WebSec.RateLimitRule：规则名称；</li><li>WebSec.BotCustomRule：规则名称；</li><li>DDoS.L4Proxy.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单；</li><li>DDoS.L3Transit.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单。</li></ul> 
     * @return SubEntityName <p>子实体名称，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则名称；</li><li>WebSec.BasicAccessRule：规则名称；</li><li>WebSec.PreciseMatchRule：规则名称；</li><li>WebSec.RateLimitRule：规则名称；</li><li>WebSec.BotCustomRule：规则名称；</li><li>DDoS.L4Proxy.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单；</li><li>DDoS.L3Transit.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单。</li></ul>
     */
    public String getSubEntityName() {
        return this.SubEntityName;
    }

    /**
     * Set <p>子实体名称，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则名称；</li><li>WebSec.BasicAccessRule：规则名称；</li><li>WebSec.PreciseMatchRule：规则名称；</li><li>WebSec.RateLimitRule：规则名称；</li><li>WebSec.BotCustomRule：规则名称；</li><li>DDoS.L4Proxy.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单；</li><li>DDoS.L3Transit.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单。</li></ul>
     * @param SubEntityName <p>子实体名称，根据 SubEntityType 不同代表不同的含义：</p><ul><li>WebSec.ExceptionRule：规则名称；</li><li>WebSec.BasicAccessRule：规则名称；</li><li>WebSec.PreciseMatchRule：规则名称；</li><li>WebSec.RateLimitRule：规则名称；</li><li>WebSec.BotCustomRule：规则名称；</li><li>DDoS.L4Proxy.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单；</li><li>DDoS.L3Transit.IpAccessControl：规则名称，block 表示黑名单，allow 表示白名单。</li></ul>
     */
    public void setSubEntityName(String SubEntityName) {
        this.SubEntityName = SubEntityName;
    }

    public IPGroupReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPGroupReference(IPGroupReference source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.EntityName != null) {
            this.EntityName = new String(source.EntityName);
        }
        if (source.SubEntityType != null) {
            this.SubEntityType = new String(source.SubEntityType);
        }
        if (source.SubEntityId != null) {
            this.SubEntityId = new String(source.SubEntityId);
        }
        if (source.SubEntityName != null) {
            this.SubEntityName = new String(source.SubEntityName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "EntityName", this.EntityName);
        this.setParamSimple(map, prefix + "SubEntityType", this.SubEntityType);
        this.setParamSimple(map, prefix + "SubEntityId", this.SubEntityId);
        this.setParamSimple(map, prefix + "SubEntityName", this.SubEntityName);

    }
}

