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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentTool extends AbstractModel {

    /**
    * <p>工具配置字段</p>
    */
    @SerializedName("Config")
    @Expose
    private AgentToolBasicConfig Config;

    /**
    * <p>工具名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>工具状态</p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li><li>3： 已失效</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>调用方式</p><p>枚举值：</p><ul><li>0： 非流式</li><li>1： 流式</li></ul>
    */
    @SerializedName("StreamMode")
    @Expose
    private Long StreamMode;

    /**
    * <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 只读</li><li>2： 写/删除</li></ul>
    */
    @SerializedName("ToolAccessMode")
    @Expose
    private Long ToolAccessMode;

    /**
     * Get <p>工具配置字段</p> 
     * @return Config <p>工具配置字段</p>
     */
    public AgentToolBasicConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>工具配置字段</p>
     * @param Config <p>工具配置字段</p>
     */
    public void setConfig(AgentToolBasicConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>工具名称</p> 
     * @return Name <p>工具名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>工具名称</p>
     * @param Name <p>工具名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>工具状态</p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li><li>3： 已失效</li></ul> 
     * @return Status <p>工具状态</p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li><li>3： 已失效</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>工具状态</p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li><li>3： 已失效</li></ul>
     * @param Status <p>工具状态</p><p>枚举值：</p><ul><li>1： 可用</li><li>2： 不可用</li><li>3： 已失效</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>调用方式</p><p>枚举值：</p><ul><li>0： 非流式</li><li>1： 流式</li></ul> 
     * @return StreamMode <p>调用方式</p><p>枚举值：</p><ul><li>0： 非流式</li><li>1： 流式</li></ul>
     */
    public Long getStreamMode() {
        return this.StreamMode;
    }

    /**
     * Set <p>调用方式</p><p>枚举值：</p><ul><li>0： 非流式</li><li>1： 流式</li></ul>
     * @param StreamMode <p>调用方式</p><p>枚举值：</p><ul><li>0： 非流式</li><li>1： 流式</li></ul>
     */
    public void setStreamMode(Long StreamMode) {
        this.StreamMode = StreamMode;
    }

    /**
     * Get <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 只读</li><li>2： 写/删除</li></ul> 
     * @return ToolAccessMode <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 只读</li><li>2： 写/删除</li></ul>
     */
    public Long getToolAccessMode() {
        return this.ToolAccessMode;
    }

    /**
     * Set <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 只读</li><li>2： 写/删除</li></ul>
     * @param ToolAccessMode <p>工具访问模式</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 只读</li><li>2： 写/删除</li></ul>
     */
    public void setToolAccessMode(Long ToolAccessMode) {
        this.ToolAccessMode = ToolAccessMode;
    }

    public AgentTool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentTool(AgentTool source) {
        if (source.Config != null) {
            this.Config = new AgentToolBasicConfig(source.Config);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StreamMode != null) {
            this.StreamMode = new Long(source.StreamMode);
        }
        if (source.ToolAccessMode != null) {
            this.ToolAccessMode = new Long(source.ToolAccessMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StreamMode", this.StreamMode);
        this.setParamSimple(map, prefix + "ToolAccessMode", this.ToolAccessMode);

    }
}

