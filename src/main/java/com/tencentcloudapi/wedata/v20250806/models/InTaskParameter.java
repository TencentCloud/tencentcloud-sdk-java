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
    * 参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * 参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * 父任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromTaskId")
    @Expose
    private String FromTaskId;

    /**
    * 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromParamKey")
    @Expose
    private String FromParamKey;

    /**
     * Get 参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamKey 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set 参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamKey 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get 参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamDesc 参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set 参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamDesc 参数描述：格式为 项目标识.任务名称.参数名；例：project_wedata_1.sh_250820_104107.pp_out
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get 父任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromTaskId 父任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromTaskId() {
        return this.FromTaskId;
    }

    /**
     * Set 父任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromTaskId 父任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromTaskId(String FromTaskId) {
        this.FromTaskId = FromTaskId;
    }

    /**
     * Get 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromParamKey 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromParamKey() {
        return this.FromParamKey;
    }

    /**
     * Set 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromParamKey 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromParamKey(String FromParamKey) {
        this.FromParamKey = FromParamKey;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamKey", this.ParamKey);
        this.setParamSimple(map, prefix + "ParamDesc", this.ParamDesc);
        this.setParamSimple(map, prefix + "FromTaskId", this.FromTaskId);
        this.setParamSimple(map, prefix + "FromParamKey", this.FromParamKey);

    }
}

