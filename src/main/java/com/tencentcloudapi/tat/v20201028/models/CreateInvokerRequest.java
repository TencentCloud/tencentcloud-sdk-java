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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInvokerRequest extends AbstractModel {

    /**
    * 执行器名称。长度不超过 120 字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 执行器类型。

可选取值（当前仅支持一种）：

- `SCHEDULE`：周期类型执行器。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 远程命令ID。

可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 触发器关联的实例ID。列表上限 100。

可通过对应云产品的查询实例接口获取实例 ID。目前支持实例类型：CVM、Lighthouse、TAT 托管实例。

实例需要安装 TAT 客户端, 且客户端为 Online 状态。可通过 [DescribeAutomationAgentStatus(查询客户端状态)](https://cloud.tencent.com/document/api/1340/52682) 接口查询客户端状态。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 命令执行用户。长度不超过 256 字符。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 命令自定义参数。字段类型为 JSON encode string。

仅在 CommandId 所指命令的 EnableParameter 为 true 时，才允许设置此参数。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取命令的 EnableParameter 设置。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 周期执行器设置。

当执行器类型为 `SCHEDULE` 时，必须指定此参数。
    */
    @SerializedName("ScheduleSettings")
    @Expose
    private ScheduleSettings ScheduleSettings;

    /**
    * 为命令关联的标签，列表长度不超过10
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 执行器名称。长度不超过 120 字符。 
     * @return Name 执行器名称。长度不超过 120 字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 执行器名称。长度不超过 120 字符。
     * @param Name 执行器名称。长度不超过 120 字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 执行器类型。

可选取值（当前仅支持一种）：

- `SCHEDULE`：周期类型执行器。 
     * @return Type 执行器类型。

可选取值（当前仅支持一种）：

- `SCHEDULE`：周期类型执行器。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 执行器类型。

可选取值（当前仅支持一种）：

- `SCHEDULE`：周期类型执行器。
     * @param Type 执行器类型。

可选取值（当前仅支持一种）：

- `SCHEDULE`：周期类型执行器。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 远程命令ID。

可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。 
     * @return CommandId 远程命令ID。

可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 远程命令ID。

可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。
     * @param CommandId 远程命令ID。

可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 触发器关联的实例ID。列表上限 100。

可通过对应云产品的查询实例接口获取实例 ID。目前支持实例类型：CVM、Lighthouse、TAT 托管实例。

实例需要安装 TAT 客户端, 且客户端为 Online 状态。可通过 [DescribeAutomationAgentStatus(查询客户端状态)](https://cloud.tencent.com/document/api/1340/52682) 接口查询客户端状态。 
     * @return InstanceIds 触发器关联的实例ID。列表上限 100。

可通过对应云产品的查询实例接口获取实例 ID。目前支持实例类型：CVM、Lighthouse、TAT 托管实例。

实例需要安装 TAT 客户端, 且客户端为 Online 状态。可通过 [DescribeAutomationAgentStatus(查询客户端状态)](https://cloud.tencent.com/document/api/1340/52682) 接口查询客户端状态。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 触发器关联的实例ID。列表上限 100。

可通过对应云产品的查询实例接口获取实例 ID。目前支持实例类型：CVM、Lighthouse、TAT 托管实例。

实例需要安装 TAT 客户端, 且客户端为 Online 状态。可通过 [DescribeAutomationAgentStatus(查询客户端状态)](https://cloud.tencent.com/document/api/1340/52682) 接口查询客户端状态。
     * @param InstanceIds 触发器关联的实例ID。列表上限 100。

可通过对应云产品的查询实例接口获取实例 ID。目前支持实例类型：CVM、Lighthouse、TAT 托管实例。

实例需要安装 TAT 客户端, 且客户端为 Online 状态。可通过 [DescribeAutomationAgentStatus(查询客户端状态)](https://cloud.tencent.com/document/api/1340/52682) 接口查询客户端状态。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 命令执行用户。长度不超过 256 字符。 
     * @return Username 命令执行用户。长度不超过 256 字符。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 命令执行用户。长度不超过 256 字符。
     * @param Username 命令执行用户。长度不超过 256 字符。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 命令自定义参数。字段类型为 JSON encode string。

仅在 CommandId 所指命令的 EnableParameter 为 true 时，才允许设置此参数。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取命令的 EnableParameter 设置。 
     * @return Parameters 命令自定义参数。字段类型为 JSON encode string。

仅在 CommandId 所指命令的 EnableParameter 为 true 时，才允许设置此参数。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取命令的 EnableParameter 设置。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 命令自定义参数。字段类型为 JSON encode string。

仅在 CommandId 所指命令的 EnableParameter 为 true 时，才允许设置此参数。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取命令的 EnableParameter 设置。
     * @param Parameters 命令自定义参数。字段类型为 JSON encode string。

仅在 CommandId 所指命令的 EnableParameter 为 true 时，才允许设置此参数。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取命令的 EnableParameter 设置。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 周期执行器设置。

当执行器类型为 `SCHEDULE` 时，必须指定此参数。 
     * @return ScheduleSettings 周期执行器设置。

当执行器类型为 `SCHEDULE` 时，必须指定此参数。
     */
    public ScheduleSettings getScheduleSettings() {
        return this.ScheduleSettings;
    }

    /**
     * Set 周期执行器设置。

当执行器类型为 `SCHEDULE` 时，必须指定此参数。
     * @param ScheduleSettings 周期执行器设置。

当执行器类型为 `SCHEDULE` 时，必须指定此参数。
     */
    public void setScheduleSettings(ScheduleSettings ScheduleSettings) {
        this.ScheduleSettings = ScheduleSettings;
    }

    /**
     * Get 为命令关联的标签，列表长度不超过10 
     * @return Tags 为命令关联的标签，列表长度不超过10
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 为命令关联的标签，列表长度不超过10
     * @param Tags 为命令关联的标签，列表长度不超过10
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateInvokerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInvokerRequest(CreateInvokerRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.ScheduleSettings != null) {
            this.ScheduleSettings = new ScheduleSettings(source.ScheduleSettings);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamObj(map, prefix + "ScheduleSettings.", this.ScheduleSettings);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

