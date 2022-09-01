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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleCommand extends AbstractModel{

    /**
    * 远程命令ID。若选择执行命令，则此项必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 自定义参数。字段类型为 json encoded string。如：{"varA": "222"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
     * Get 远程命令ID。若选择执行命令，则此项必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommandId 远程命令ID。若选择执行命令，则此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 远程命令ID。若选择执行命令，则此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommandId 远程命令ID。若选择执行命令，则此项必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 自定义参数。字段类型为 json encoded string。如：{"varA": "222"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Parameters 自定义参数。字段类型为 json encoded string。如：{"varA": "222"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 自定义参数。字段类型为 json encoded string。如：{"varA": "222"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Parameters 自定义参数。字段类型为 json encoded string。如：{"varA": "222"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    public LifecycleCommand() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleCommand(LifecycleCommand source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);

    }
}

