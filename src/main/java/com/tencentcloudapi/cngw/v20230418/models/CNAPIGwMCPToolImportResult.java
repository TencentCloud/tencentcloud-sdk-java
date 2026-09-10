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

public class CNAPIGwMCPToolImportResult extends AbstractModel {

    /**
    * <p>导入失败的原因信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedMessage")
    @Expose
    private String FailedMessage;

    /**
    * <p>请求方法</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>MCP Tool 名字</p>
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
    * <p>导入结果</p><p>枚举值：</p><ul><li>Waiting： 等待导入</li><li>Success： 导入成功</li><li>Failed： 导入失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>虚拟MCP Server的Tool的完整后端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamUrl")
    @Expose
    private String UpstreamUrl;

    /**
     * Get <p>导入失败的原因信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedMessage <p>导入失败的原因信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedMessage() {
        return this.FailedMessage;
    }

    /**
     * Set <p>导入失败的原因信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedMessage <p>导入失败的原因信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedMessage(String FailedMessage) {
        this.FailedMessage = FailedMessage;
    }

    /**
     * Get <p>请求方法</p> 
     * @return Method <p>请求方法</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>请求方法</p>
     * @param Method <p>请求方法</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>MCP Tool 名字</p> 
     * @return Name <p>MCP Tool 名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>MCP Tool 名字</p>
     * @param Name <p>MCP Tool 名字</p>
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
     * Get <p>导入结果</p><p>枚举值：</p><ul><li>Waiting： 等待导入</li><li>Success： 导入成功</li><li>Failed： 导入失败</li></ul> 
     * @return Status <p>导入结果</p><p>枚举值：</p><ul><li>Waiting： 等待导入</li><li>Success： 导入成功</li><li>Failed： 导入失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>导入结果</p><p>枚举值：</p><ul><li>Waiting： 等待导入</li><li>Success： 导入成功</li><li>Failed： 导入失败</li></ul>
     * @param Status <p>导入结果</p><p>枚举值：</p><ul><li>Waiting： 等待导入</li><li>Success： 导入成功</li><li>Failed： 导入失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>虚拟MCP Server的Tool的完整后端地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamUrl <p>虚拟MCP Server的Tool的完整后端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpstreamUrl() {
        return this.UpstreamUrl;
    }

    /**
     * Set <p>虚拟MCP Server的Tool的完整后端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamUrl <p>虚拟MCP Server的Tool的完整后端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamUrl(String UpstreamUrl) {
        this.UpstreamUrl = UpstreamUrl;
    }

    public CNAPIGwMCPToolImportResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwMCPToolImportResult(CNAPIGwMCPToolImportResult source) {
        if (source.FailedMessage != null) {
            this.FailedMessage = new String(source.FailedMessage);
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
        if (source.UpstreamUrl != null) {
            this.UpstreamUrl = new String(source.UpstreamUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FailedMessage", this.FailedMessage);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpstreamUrl", this.UpstreamUrl);

    }
}

