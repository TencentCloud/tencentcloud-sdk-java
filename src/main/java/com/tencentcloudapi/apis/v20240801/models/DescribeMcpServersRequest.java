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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMcpServersRequest extends AbstractModel {

    /**
    * 分页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 状态数组：normal正常状态，disabled下线状态
    */
    @SerializedName("Statuses")
    @Expose
    private String [] Statuses;

    /**
    * 关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 服务ID数组
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
    * 模式：proxy代理模式； wrap封装模式；
    */
    @SerializedName("Modes")
    @Expose
    private String [] Modes;

    /**
    * 绑定的安全规则ID
    */
    @SerializedName("McpSecurityRuleID")
    @Expose
    private String McpSecurityRuleID;

    /**
    * 绑定安全规则的处置动作（填写时McpSecurityRuleID得必填）
    */
    @SerializedName("McpSecurityRuleAct")
    @Expose
    private String McpSecurityRuleAct;

    /**
    * 已绑定插件id
    */
    @SerializedName("PluginID")
    @Expose
    private String PluginID;

    /**
     * Get 分页大小 
     * @return Limit 分页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小
     * @param Limit 分页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 状态数组：normal正常状态，disabled下线状态 
     * @return Statuses 状态数组：normal正常状态，disabled下线状态
     */
    public String [] getStatuses() {
        return this.Statuses;
    }

    /**
     * Set 状态数组：normal正常状态，disabled下线状态
     * @param Statuses 状态数组：normal正常状态，disabled下线状态
     */
    public void setStatuses(String [] Statuses) {
        this.Statuses = Statuses;
    }

    /**
     * Get 关键词 
     * @return Keyword 关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词
     * @param Keyword 关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 服务ID数组 
     * @return IDs 服务ID数组
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set 服务ID数组
     * @param IDs 服务ID数组
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    /**
     * Get 模式：proxy代理模式； wrap封装模式； 
     * @return Modes 模式：proxy代理模式； wrap封装模式；
     */
    public String [] getModes() {
        return this.Modes;
    }

    /**
     * Set 模式：proxy代理模式； wrap封装模式；
     * @param Modes 模式：proxy代理模式； wrap封装模式；
     */
    public void setModes(String [] Modes) {
        this.Modes = Modes;
    }

    /**
     * Get 绑定的安全规则ID 
     * @return McpSecurityRuleID 绑定的安全规则ID
     */
    public String getMcpSecurityRuleID() {
        return this.McpSecurityRuleID;
    }

    /**
     * Set 绑定的安全规则ID
     * @param McpSecurityRuleID 绑定的安全规则ID
     */
    public void setMcpSecurityRuleID(String McpSecurityRuleID) {
        this.McpSecurityRuleID = McpSecurityRuleID;
    }

    /**
     * Get 绑定安全规则的处置动作（填写时McpSecurityRuleID得必填） 
     * @return McpSecurityRuleAct 绑定安全规则的处置动作（填写时McpSecurityRuleID得必填）
     */
    public String getMcpSecurityRuleAct() {
        return this.McpSecurityRuleAct;
    }

    /**
     * Set 绑定安全规则的处置动作（填写时McpSecurityRuleID得必填）
     * @param McpSecurityRuleAct 绑定安全规则的处置动作（填写时McpSecurityRuleID得必填）
     */
    public void setMcpSecurityRuleAct(String McpSecurityRuleAct) {
        this.McpSecurityRuleAct = McpSecurityRuleAct;
    }

    /**
     * Get 已绑定插件id 
     * @return PluginID 已绑定插件id
     */
    public String getPluginID() {
        return this.PluginID;
    }

    /**
     * Set 已绑定插件id
     * @param PluginID 已绑定插件id
     */
    public void setPluginID(String PluginID) {
        this.PluginID = PluginID;
    }

    public DescribeMcpServersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMcpServersRequest(DescribeMcpServersRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Statuses != null) {
            this.Statuses = new String[source.Statuses.length];
            for (int i = 0; i < source.Statuses.length; i++) {
                this.Statuses[i] = new String(source.Statuses[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.IDs != null) {
            this.IDs = new String[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new String(source.IDs[i]);
            }
        }
        if (source.Modes != null) {
            this.Modes = new String[source.Modes.length];
            for (int i = 0; i < source.Modes.length; i++) {
                this.Modes[i] = new String(source.Modes[i]);
            }
        }
        if (source.McpSecurityRuleID != null) {
            this.McpSecurityRuleID = new String(source.McpSecurityRuleID);
        }
        if (source.McpSecurityRuleAct != null) {
            this.McpSecurityRuleAct = new String(source.McpSecurityRuleAct);
        }
        if (source.PluginID != null) {
            this.PluginID = new String(source.PluginID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamArraySimple(map, prefix + "Statuses.", this.Statuses);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);
        this.setParamArraySimple(map, prefix + "Modes.", this.Modes);
        this.setParamSimple(map, prefix + "McpSecurityRuleID", this.McpSecurityRuleID);
        this.setParamSimple(map, prefix + "McpSecurityRuleAct", this.McpSecurityRuleAct);
        this.setParamSimple(map, prefix + "PluginID", this.PluginID);

    }
}

