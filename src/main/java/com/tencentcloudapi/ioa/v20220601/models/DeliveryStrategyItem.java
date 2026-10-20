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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliveryStrategyItem extends AbstractModel {

    /**
    * <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTypes")
    @Expose
    private String [] LogTypes;

    /**
    * <p>转发配置服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>转发策略id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>转发服务器id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigId")
    @Expose
    private Long ConfigId;

    /**
     * Get <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>策略名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTypes <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLogTypes() {
        return this.LogTypes;
    }

    /**
     * Set <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTypes <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTypes(String [] LogTypes) {
        this.LogTypes = LogTypes;
    }

    /**
     * Get <p>转发配置服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigName <p>转发配置服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set <p>转发配置服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigName <p>转发配置服务器名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>策略描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>转发策略id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID <p>转发策略id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>转发策略id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID <p>转发策略id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>转发服务器id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigId <p>转发服务器id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>转发服务器id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigId <p>转发服务器id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigId(Long ConfigId) {
        this.ConfigId = ConfigId;
    }

    public DeliveryStrategyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliveryStrategyItem(DeliveryStrategyItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.LogTypes != null) {
            this.LogTypes = new String[source.LogTypes.length];
            for (int i = 0; i < source.LogTypes.length; i++) {
                this.LogTypes[i] = new String(source.LogTypes[i]);
            }
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new Long(source.ConfigId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "LogTypes.", this.LogTypes);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);

    }
}

