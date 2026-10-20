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

public class ModifyDeliveryStrategyRequest extends AbstractModel {

    /**
    * <p>策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p>
    */
    @SerializedName("LogTypes")
    @Expose
    private String [] LogTypes;

    /**
    * <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>转发服务器id(只支持32位)</p>
    */
    @SerializedName("ConfigId")
    @Expose
    private Long ConfigId;

    /**
    * <p>转发策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>是否开启</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>转发策略id 创建时传递 编辑时候无需传递(只支持32位)</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get <p>策略名称</p> 
     * @return Name <p>策略名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称</p>
     * @param Name <p>策略名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p> 
     * @return LogTypes <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p>
     */
    public String [] getLogTypes() {
        return this.LogTypes;
    }

    /**
     * Set <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p>
     * @param LogTypes <p>转发日志类型列表 身份安全:&quot;040201000000&quot;,资源访问日志:&quot;040203000000&quot;,客户端操作日志:&quot;040202000000&quot;,终端安全日志:&quot;040205000000&quot;,终端管控日志:&quot;040206000000&quot;,终端合规日志:&quot;040207000000&quot;,license授权日志:&quot;040212000000&quot;</p>
     */
    public void setLogTypes(String [] LogTypes) {
        this.LogTypes = LogTypes;
    }

    /**
     * Get <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p> 
     * @return Type <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p>
     * @param Type <p>转发方式 0:syslog, 2:kafka, 3:http(只支持32位)</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>转发服务器id(只支持32位)</p> 
     * @return ConfigId <p>转发服务器id(只支持32位)</p>
     */
    public Long getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>转发服务器id(只支持32位)</p>
     * @param ConfigId <p>转发服务器id(只支持32位)</p>
     */
    public void setConfigId(Long ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get <p>转发策略描述</p> 
     * @return Description <p>转发策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>转发策略描述</p>
     * @param Description <p>转发策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>是否开启</p> 
     * @return Enabled <p>是否开启</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否开启</p>
     * @param Enabled <p>是否开启</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>转发策略id 创建时传递 编辑时候无需传递(只支持32位)</p> 
     * @return ID <p>转发策略id 创建时传递 编辑时候无需传递(只支持32位)</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>转发策略id 创建时传递 编辑时候无需传递(只支持32位)</p>
     * @param ID <p>转发策略id 创建时传递 编辑时候无需传递(只支持32位)</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public ModifyDeliveryStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeliveryStrategyRequest(ModifyDeliveryStrategyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LogTypes != null) {
            this.LogTypes = new String[source.LogTypes.length];
            for (int i = 0; i < source.LogTypes.length; i++) {
                this.LogTypes[i] = new String(source.LogTypes[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new Long(source.ConfigId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "LogTypes.", this.LogTypes);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

