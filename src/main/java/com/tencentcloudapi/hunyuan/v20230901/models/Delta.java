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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Delta extends AbstractModel {

    /**
    * 角色名称。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 内容详情。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 模型生成的工具调用，仅 hunyuan-functioncall 模型支持
说明：
对于每一次的输出值应该以Id为标识对Type、Name、Arguments字段进行合并。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolCalls")
    @Expose
    private ToolCall [] ToolCalls;

    /**
     * Get 角色名称。 
     * @return Role 角色名称。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色名称。
     * @param Role 角色名称。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 内容详情。 
     * @return Content 内容详情。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容详情。
     * @param Content 内容详情。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 模型生成的工具调用，仅 hunyuan-functioncall 模型支持
说明：
对于每一次的输出值应该以Id为标识对Type、Name、Arguments字段进行合并。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolCalls 模型生成的工具调用，仅 hunyuan-functioncall 模型支持
说明：
对于每一次的输出值应该以Id为标识对Type、Name、Arguments字段进行合并。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public ToolCall [] getToolCalls() {
        return this.ToolCalls;
    }

    /**
     * Set 模型生成的工具调用，仅 hunyuan-functioncall 模型支持
说明：
对于每一次的输出值应该以Id为标识对Type、Name、Arguments字段进行合并。

注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolCalls 模型生成的工具调用，仅 hunyuan-functioncall 模型支持
说明：
对于每一次的输出值应该以Id为标识对Type、Name、Arguments字段进行合并。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolCalls(ToolCall [] ToolCalls) {
        this.ToolCalls = ToolCalls;
    }

    public Delta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Delta(Delta source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ToolCalls != null) {
            this.ToolCalls = new ToolCall[source.ToolCalls.length];
            for (int i = 0; i < source.ToolCalls.length; i++) {
                this.ToolCalls[i] = new ToolCall(source.ToolCalls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "ToolCalls.", this.ToolCalls);

    }
}

