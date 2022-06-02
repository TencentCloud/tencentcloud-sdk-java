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

public class DnsRecord extends AbstractModel{

    /**
    * 记录 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 记录类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 主机记录
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 记录值
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 代理模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * TTL 值
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
    * 优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 修改时间
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * 域名锁
    */
    @SerializedName("Locked")
    @Expose
    private Boolean Locked;

    /**
    * 站点 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 解析状态
active: 生效
pending: 不生效
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 域名是否开启了lb，四层，安全
- lb 负载均衡
- security 安全
- l4 四层
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainStatus")
    @Expose
    private String [] DomainStatus;

    /**
     * Get 记录 ID 
     * @return Id 记录 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 记录 ID
     * @param Id 记录 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 记录类型 
     * @return Type 记录类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 记录类型
     * @param Type 记录类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 主机记录 
     * @return Name 主机记录
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 主机记录
     * @param Name 主机记录
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 记录值 
     * @return Content 记录值
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 记录值
     * @param Content 记录值
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 代理模式 
     * @return Mode 代理模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 代理模式
     * @param Mode 代理模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get TTL 值 
     * @return Ttl TTL 值
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set TTL 值
     * @param Ttl TTL 值
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get 优先级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 创建时间 
     * @return CreatedOn 创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
     * @param CreatedOn 创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 修改时间 
     * @return ModifiedOn 修改时间
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 修改时间
     * @param ModifiedOn 修改时间
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 域名锁 
     * @return Locked 域名锁
     */
    public Boolean getLocked() {
        return this.Locked;
    }

    /**
     * Set 域名锁
     * @param Locked 域名锁
     */
    public void setLocked(Boolean Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 站点 ID 
     * @return ZoneId 站点 ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID
     * @param ZoneId 站点 ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称 
     * @return ZoneName 站点名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称
     * @param ZoneName 站点名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 解析状态
active: 生效
pending: 不生效 
     * @return Status 解析状态
active: 生效
pending: 不生效
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 解析状态
active: 生效
pending: 不生效
     * @param Status 解析状态
active: 生效
pending: 不生效
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cname CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cname CNAME 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 域名是否开启了lb，四层，安全
- lb 负载均衡
- security 安全
- l4 四层
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainStatus 域名是否开启了lb，四层，安全
- lb 负载均衡
- security 安全
- l4 四层
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set 域名是否开启了lb，四层，安全
- lb 负载均衡
- security 安全
- l4 四层
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainStatus 域名是否开启了lb，四层，安全
- lb 负载均衡
- security 安全
- l4 四层
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainStatus(String [] DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    public DnsRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnsRecord(DnsRecord source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.Locked != null) {
            this.Locked = new Boolean(source.Locked);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new String[source.DomainStatus.length];
            for (int i = 0; i < source.DomainStatus.length; i++) {
                this.DomainStatus[i] = new String(source.DomainStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamArraySimple(map, prefix + "DomainStatus.", this.DomainStatus);

    }
}

