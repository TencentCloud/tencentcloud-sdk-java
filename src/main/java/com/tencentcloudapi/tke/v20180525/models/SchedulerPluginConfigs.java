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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchedulerPluginConfigs extends AbstractModel {

    /**
    * 配置的插件的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 初始化时传递给插件的参数，对{"apiVersion":"kubescheduler.config.k8s.io/v1beta3","kind":"NodeResourcesFitArgs","scoringStrategy":{"type":"LeastAllocated"}}base64后的结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Args")
    @Expose
    private String Args;

    /**
     * Get 配置的插件的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 配置的插件的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置的插件的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 配置的插件的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 初始化时传递给插件的参数，对{"apiVersion":"kubescheduler.config.k8s.io/v1beta3","kind":"NodeResourcesFitArgs","scoringStrategy":{"type":"LeastAllocated"}}base64后的结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Args 初始化时传递给插件的参数，对{"apiVersion":"kubescheduler.config.k8s.io/v1beta3","kind":"NodeResourcesFitArgs","scoringStrategy":{"type":"LeastAllocated"}}base64后的结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArgs() {
        return this.Args;
    }

    /**
     * Set 初始化时传递给插件的参数，对{"apiVersion":"kubescheduler.config.k8s.io/v1beta3","kind":"NodeResourcesFitArgs","scoringStrategy":{"type":"LeastAllocated"}}base64后的结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Args 初始化时传递给插件的参数，对{"apiVersion":"kubescheduler.config.k8s.io/v1beta3","kind":"NodeResourcesFitArgs","scoringStrategy":{"type":"LeastAllocated"}}base64后的结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArgs(String Args) {
        this.Args = Args;
    }

    public SchedulerPluginConfigs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulerPluginConfigs(SchedulerPluginConfigs source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Args != null) {
            this.Args = new String(source.Args);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Args", this.Args);

    }
}

