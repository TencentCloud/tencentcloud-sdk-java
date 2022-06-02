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

public class OriginGroup extends AbstractModel{

    /**
    * 源站组ID
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * 源站组名称
    */
    @SerializedName("OriginName")
    @Expose
    private String OriginName;

    /**
    * 配置类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 记录
    */
    @SerializedName("Record")
    @Expose
    private OriginRecord [] Record;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 站点ID
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
    * 源站类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 是否为四层代理使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationProxyUsed")
    @Expose
    private Boolean ApplicationProxyUsed;

    /**
    * 是否为负载均衡使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancingUsed")
    @Expose
    private Boolean LoadBalancingUsed;

    /**
     * Get 源站组ID 
     * @return OriginId 源站组ID
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 源站组ID
     * @param OriginId 源站组ID
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get 源站组名称 
     * @return OriginName 源站组名称
     */
    public String getOriginName() {
        return this.OriginName;
    }

    /**
     * Set 源站组名称
     * @param OriginName 源站组名称
     */
    public void setOriginName(String OriginName) {
        this.OriginName = OriginName;
    }

    /**
     * Get 配置类型 
     * @return Type 配置类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 配置类型
     * @param Type 配置类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 记录 
     * @return Record 记录
     */
    public OriginRecord [] getRecord() {
        return this.Record;
    }

    /**
     * Set 记录
     * @param Record 记录
     */
    public void setRecord(OriginRecord [] Record) {
        this.Record = Record;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
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
     * Get 源站类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginType 源站类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginType 源站类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 是否为四层代理使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationProxyUsed 是否为四层代理使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getApplicationProxyUsed() {
        return this.ApplicationProxyUsed;
    }

    /**
     * Set 是否为四层代理使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationProxyUsed 是否为四层代理使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationProxyUsed(Boolean ApplicationProxyUsed) {
        this.ApplicationProxyUsed = ApplicationProxyUsed;
    }

    /**
     * Get 是否为负载均衡使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancingUsed 是否为负载均衡使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLoadBalancingUsed() {
        return this.LoadBalancingUsed;
    }

    /**
     * Set 是否为负载均衡使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancingUsed 是否为负载均衡使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancingUsed(Boolean LoadBalancingUsed) {
        this.LoadBalancingUsed = LoadBalancingUsed;
    }

    public OriginGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroup(OriginGroup source) {
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.OriginName != null) {
            this.OriginName = new String(source.OriginName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Record != null) {
            this.Record = new OriginRecord[source.Record.length];
            for (int i = 0; i < source.Record.length; i++) {
                this.Record[i] = new OriginRecord(source.Record[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.ApplicationProxyUsed != null) {
            this.ApplicationProxyUsed = new Boolean(source.ApplicationProxyUsed);
        }
        if (source.LoadBalancingUsed != null) {
            this.LoadBalancingUsed = new Boolean(source.LoadBalancingUsed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "OriginName", this.OriginName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Record.", this.Record);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "ApplicationProxyUsed", this.ApplicationProxyUsed);
        this.setParamSimple(map, prefix + "LoadBalancingUsed", this.LoadBalancingUsed);

    }
}

