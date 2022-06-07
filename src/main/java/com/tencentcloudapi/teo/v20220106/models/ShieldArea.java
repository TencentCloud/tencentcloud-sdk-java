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

public class ShieldArea extends AbstractModel{

    /**
    * 一级域名id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 策略id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 防护类型 domain/application
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 四层应用名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntityName")
    @Expose
    private String EntityName;

    /**
    * 7层域名参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Application")
    @Expose
    private DDoSApplication [] Application;

    /**
    * 四层tcp转发规则数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcpNum")
    @Expose
    private Long TcpNum;

    /**
    * 四层udp转发规则数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UdpNum")
    @Expose
    private Long UdpNum;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 是否为共享资源客户，注意共享资源用户不可以切换代理模式，true-是；false-否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Share")
    @Expose
    private Boolean Share;

    /**
     * Get 一级域名id 
     * @return ZoneId 一级域名id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 一级域名id
     * @param ZoneId 一级域名id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 策略id 
     * @return PolicyId 策略id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略id
     * @param PolicyId 策略id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 防护类型 domain/application 
     * @return Type 防护类型 domain/application
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 防护类型 domain/application
     * @param Type 防护类型 domain/application
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 四层应用名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntityName 四层应用名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntityName() {
        return this.EntityName;
    }

    /**
     * Set 四层应用名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntityName 四层应用名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    /**
     * Get 7层域名参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Application 7层域名参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSApplication [] getApplication() {
        return this.Application;
    }

    /**
     * Set 7层域名参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Application 7层域名参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplication(DDoSApplication [] Application) {
        this.Application = Application;
    }

    /**
     * Get 四层tcp转发规则数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcpNum 四层tcp转发规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTcpNum() {
        return this.TcpNum;
    }

    /**
     * Set 四层tcp转发规则数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcpNum 四层tcp转发规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcpNum(Long TcpNum) {
        this.TcpNum = TcpNum;
    }

    /**
     * Get 四层udp转发规则数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UdpNum 四层udp转发规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUdpNum() {
        return this.UdpNum;
    }

    /**
     * Set 四层udp转发规则数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UdpNum 四层udp转发规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUdpNum(Long UdpNum) {
        this.UdpNum = UdpNum;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Entity 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Entity 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 是否为共享资源客户，注意共享资源用户不可以切换代理模式，true-是；false-否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Share 是否为共享资源客户，注意共享资源用户不可以切换代理模式，true-是；false-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShare() {
        return this.Share;
    }

    /**
     * Set 是否为共享资源客户，注意共享资源用户不可以切换代理模式，true-是；false-否
注意：此字段可能返回 null，表示取不到有效值。
     * @param Share 是否为共享资源客户，注意共享资源用户不可以切换代理模式，true-是；false-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShare(Boolean Share) {
        this.Share = Share;
    }

    public ShieldArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShieldArea(ShieldArea source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.EntityName != null) {
            this.EntityName = new String(source.EntityName);
        }
        if (source.Application != null) {
            this.Application = new DDoSApplication[source.Application.length];
            for (int i = 0; i < source.Application.length; i++) {
                this.Application[i] = new DDoSApplication(source.Application[i]);
            }
        }
        if (source.TcpNum != null) {
            this.TcpNum = new Long(source.TcpNum);
        }
        if (source.UdpNum != null) {
            this.UdpNum = new Long(source.UdpNum);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Share != null) {
            this.Share = new Boolean(source.Share);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EntityName", this.EntityName);
        this.setParamArrayObj(map, prefix + "Application.", this.Application);
        this.setParamSimple(map, prefix + "TcpNum", this.TcpNum);
        this.setParamSimple(map, prefix + "UdpNum", this.UdpNum);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Share", this.Share);

    }
}

