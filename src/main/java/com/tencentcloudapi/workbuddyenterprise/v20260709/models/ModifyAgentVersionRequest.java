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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentVersionRequest extends AbstractModel {

    /**
    * Agent 业务 ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 版本 ID（仅 default 或 test 版本可原地更新，prod 拒绝）
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Manifest v2.0 原文（可选；Manifest / Model / Description / SandboxTemplateId / ConnectorSet 五个可选字段至少提供一个）
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * 模型标识（可选）
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 版本变更说明（可选）
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 沙箱模板 ID。可选，patch 语义：null 不修改；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。
    */
    @SerializedName("SandboxTemplateId")
    @Expose
    private String SandboxTemplateId;

    /**
    * 该版本最终绑定的连接器集合（全量覆盖语义）：缺省 = 本次不改动连接器绑定；空数组 = 解绑全部连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目，manifest 中不在本集合内的连接器条目会被移除（解绑在服务端闭环，无需调用方改写 Manifest）
    */
    @SerializedName("ConnectorSet")
    @Expose
    private ConnectorRefInput [] ConnectorSet;

    /**
     * Get Agent 业务 ID 
     * @return AgentId Agent 业务 ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent 业务 ID
     * @param AgentId Agent 业务 ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 版本 ID（仅 default 或 test 版本可原地更新，prod 拒绝） 
     * @return VersionId 版本 ID（仅 default 或 test 版本可原地更新，prod 拒绝）
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本 ID（仅 default 或 test 版本可原地更新，prod 拒绝）
     * @param VersionId 版本 ID（仅 default 或 test 版本可原地更新，prod 拒绝）
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Manifest v2.0 原文（可选；Manifest / Model / Description / SandboxTemplateId / ConnectorSet 五个可选字段至少提供一个） 
     * @return Manifest Manifest v2.0 原文（可选；Manifest / Model / Description / SandboxTemplateId / ConnectorSet 五个可选字段至少提供一个）
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set Manifest v2.0 原文（可选；Manifest / Model / Description / SandboxTemplateId / ConnectorSet 五个可选字段至少提供一个）
     * @param Manifest Manifest v2.0 原文（可选；Manifest / Model / Description / SandboxTemplateId / ConnectorSet 五个可选字段至少提供一个）
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get 模型标识（可选） 
     * @return Model 模型标识（可选）
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型标识（可选）
     * @param Model 模型标识（可选）
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 版本变更说明（可选） 
     * @return Description 版本变更说明（可选）
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本变更说明（可选）
     * @param Description 版本变更说明（可选）
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 沙箱模板 ID。可选，patch 语义：null 不修改；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。 
     * @return SandboxTemplateId 沙箱模板 ID。可选，patch 语义：null 不修改；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。
     */
    public String getSandboxTemplateId() {
        return this.SandboxTemplateId;
    }

    /**
     * Set 沙箱模板 ID。可选，patch 语义：null 不修改；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。
     * @param SandboxTemplateId 沙箱模板 ID。可选，patch 语义：null 不修改；空串解绑（恢复系统默认模板）；非空时模板须属于当前企业且可用（未删除、状态正常）。
     */
    public void setSandboxTemplateId(String SandboxTemplateId) {
        this.SandboxTemplateId = SandboxTemplateId;
    }

    /**
     * Get 该版本最终绑定的连接器集合（全量覆盖语义）：缺省 = 本次不改动连接器绑定；空数组 = 解绑全部连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目，manifest 中不在本集合内的连接器条目会被移除（解绑在服务端闭环，无需调用方改写 Manifest） 
     * @return ConnectorSet 该版本最终绑定的连接器集合（全量覆盖语义）：缺省 = 本次不改动连接器绑定；空数组 = 解绑全部连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目，manifest 中不在本集合内的连接器条目会被移除（解绑在服务端闭环，无需调用方改写 Manifest）
     */
    public ConnectorRefInput [] getConnectorSet() {
        return this.ConnectorSet;
    }

    /**
     * Set 该版本最终绑定的连接器集合（全量覆盖语义）：缺省 = 本次不改动连接器绑定；空数组 = 解绑全部连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目，manifest 中不在本集合内的连接器条目会被移除（解绑在服务端闭环，无需调用方改写 Manifest）
     * @param ConnectorSet 该版本最终绑定的连接器集合（全量覆盖语义）：缺省 = 本次不改动连接器绑定；空数组 = 解绑全部连接器；非空 = 物化为 manifest v2 mcp_servers 网关条目，manifest 中不在本集合内的连接器条目会被移除（解绑在服务端闭环，无需调用方改写 Manifest）
     */
    public void setConnectorSet(ConnectorRefInput [] ConnectorSet) {
        this.ConnectorSet = ConnectorSet;
    }

    public ModifyAgentVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentVersionRequest(ModifyAgentVersionRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SandboxTemplateId != null) {
            this.SandboxTemplateId = new String(source.SandboxTemplateId);
        }
        if (source.ConnectorSet != null) {
            this.ConnectorSet = new ConnectorRefInput[source.ConnectorSet.length];
            for (int i = 0; i < source.ConnectorSet.length; i++) {
                this.ConnectorSet[i] = new ConnectorRefInput(source.ConnectorSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SandboxTemplateId", this.SandboxTemplateId);
        this.setParamArrayObj(map, prefix + "ConnectorSet.", this.ConnectorSet);

    }
}

