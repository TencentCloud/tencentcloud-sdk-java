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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwMCPToolPreview extends AbstractModel {

    /**
    * <p>MCP Tool入参的ContentType</p><p>枚举值：</p><ul><li>application/json： json格式</li><li>application/x-www-form-urlencoded： 表单格式</li></ul>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>MCP Tool的描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>MCP Tool的参数</p>
    */
    @SerializedName("InputParams")
    @Expose
    private CNAPIGwMCPToolParam [] InputParams;

    /**
    * <p>MCP Tool的请求方法</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>MCP Tool名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>MCP Tool的请求路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>MCP Tool的状态</p><p>枚举值：</p><ul><li>Valid： 可导入</li><li>Invalid： 不可导入</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>不可导入的原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * <p>虚拟MCP Server的tools的完整url路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamUrl")
    @Expose
    private String UpstreamUrl;

    /**
     * Get <p>MCP Tool入参的ContentType</p><p>枚举值：</p><ul><li>application/json： json格式</li><li>application/x-www-form-urlencoded： 表单格式</li></ul> 
     * @return ContentType <p>MCP Tool入参的ContentType</p><p>枚举值：</p><ul><li>application/json： json格式</li><li>application/x-www-form-urlencoded： 表单格式</li></ul>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>MCP Tool入参的ContentType</p><p>枚举值：</p><ul><li>application/json： json格式</li><li>application/x-www-form-urlencoded： 表单格式</li></ul>
     * @param ContentType <p>MCP Tool入参的ContentType</p><p>枚举值：</p><ul><li>application/json： json格式</li><li>application/x-www-form-urlencoded： 表单格式</li></ul>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>MCP Tool的描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>MCP Tool的描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>MCP Tool的描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>MCP Tool的描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>MCP Tool的参数</p> 
     * @return InputParams <p>MCP Tool的参数</p>
     */
    public CNAPIGwMCPToolParam [] getInputParams() {
        return this.InputParams;
    }

    /**
     * Set <p>MCP Tool的参数</p>
     * @param InputParams <p>MCP Tool的参数</p>
     */
    public void setInputParams(CNAPIGwMCPToolParam [] InputParams) {
        this.InputParams = InputParams;
    }

    /**
     * Get <p>MCP Tool的请求方法</p> 
     * @return Method <p>MCP Tool的请求方法</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>MCP Tool的请求方法</p>
     * @param Method <p>MCP Tool的请求方法</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>MCP Tool名字</p> 
     * @return Name <p>MCP Tool名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>MCP Tool名字</p>
     * @param Name <p>MCP Tool名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>MCP Tool的请求路径</p> 
     * @return Path <p>MCP Tool的请求路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>MCP Tool的请求路径</p>
     * @param Path <p>MCP Tool的请求路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>MCP Tool的状态</p><p>枚举值：</p><ul><li>Valid： 可导入</li><li>Invalid： 不可导入</li></ul> 
     * @return Status <p>MCP Tool的状态</p><p>枚举值：</p><ul><li>Valid： 可导入</li><li>Invalid： 不可导入</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>MCP Tool的状态</p><p>枚举值：</p><ul><li>Valid： 可导入</li><li>Invalid： 不可导入</li></ul>
     * @param Status <p>MCP Tool的状态</p><p>枚举值：</p><ul><li>Valid： 可导入</li><li>Invalid： 不可导入</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>不可导入的原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusMessage <p>不可导入的原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set <p>不可导入的原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusMessage <p>不可导入的原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get <p>虚拟MCP Server的tools的完整url路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamUrl <p>虚拟MCP Server的tools的完整url路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpstreamUrl() {
        return this.UpstreamUrl;
    }

    /**
     * Set <p>虚拟MCP Server的tools的完整url路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamUrl <p>虚拟MCP Server的tools的完整url路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamUrl(String UpstreamUrl) {
        this.UpstreamUrl = UpstreamUrl;
    }

    public CNAPIGwMCPToolPreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwMCPToolPreview(CNAPIGwMCPToolPreview source) {
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InputParams != null) {
            this.InputParams = new CNAPIGwMCPToolParam[source.InputParams.length];
            for (int i = 0; i < source.InputParams.length; i++) {
                this.InputParams[i] = new CNAPIGwMCPToolParam(source.InputParams[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
        if (source.UpstreamUrl != null) {
            this.UpstreamUrl = new String(source.UpstreamUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "InputParams.", this.InputParams);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "UpstreamUrl", this.UpstreamUrl);

    }
}

