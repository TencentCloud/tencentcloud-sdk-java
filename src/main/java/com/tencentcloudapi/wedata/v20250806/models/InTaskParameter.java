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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InTaskParameter extends AbstractModel {

    /**
    * <p>参数名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * <p>参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * <p>父任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromTaskId")
    @Expose
    private String FromTaskId;

    /**
    * <p>父任务参数key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromParamKey")
    @Expose
    private String FromParamKey;

    /**
    * <p>任务输入类型，默认使用TASK</p><p>枚举值：</p><ul><li>TASK： 来源为父任务</li><li>CONSTANT： 常量值，目前仅for-each节点支持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>参数名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamKey <p>参数名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set <p>参数名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamKey <p>参数名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get <p>参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamDesc <p>参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set <p>参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamDesc <p>参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get <p>父任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromTaskId <p>父任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromTaskId() {
        return this.FromTaskId;
    }

    /**
     * Set <p>父任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromTaskId <p>父任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromTaskId(String FromTaskId) {
        this.FromTaskId = FromTaskId;
    }

    /**
     * Get <p>父任务参数key</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromParamKey <p>父任务参数key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromParamKey() {
        return this.FromParamKey;
    }

    /**
     * Set <p>父任务参数key</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromParamKey <p>父任务参数key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromParamKey(String FromParamKey) {
        this.FromParamKey = FromParamKey;
    }

    /**
     * Get <p>任务输入类型，默认使用TASK</p><p>枚举值：</p><ul><li>TASK： 来源为父任务</li><li>CONSTANT： 常量值，目前仅for-each节点支持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>任务输入类型，默认使用TASK</p><p>枚举值：</p><ul><li>TASK： 来源为父任务</li><li>CONSTANT： 常量值，目前仅for-each节点支持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>任务输入类型，默认使用TASK</p><p>枚举值：</p><ul><li>TASK： 来源为父任务</li><li>CONSTANT： 常量值，目前仅for-each节点支持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>任务输入类型，默认使用TASK</p><p>枚举值：</p><ul><li>TASK： 来源为父任务</li><li>CONSTANT： 常量值，目前仅for-each节点支持</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public InTaskParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InTaskParameter(InTaskParameter source) {
        if (source.ParamKey != null) {
            this.ParamKey = new String(source.ParamKey);
        }
        if (source.ParamDesc != null) {
            this.ParamDesc = new String(source.ParamDesc);
        }
        if (source.FromTaskId != null) {
            this.FromTaskId = new String(source.FromTaskId);
        }
        if (source.FromParamKey != null) {
            this.FromParamKey = new String(source.FromParamKey);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamKey", this.ParamKey);
        this.setParamSimple(map, prefix + "ParamDesc", this.ParamDesc);
        this.setParamSimple(map, prefix + "FromTaskId", this.FromTaskId);
        this.setParamSimple(map, prefix + "FromParamKey", this.FromParamKey);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

