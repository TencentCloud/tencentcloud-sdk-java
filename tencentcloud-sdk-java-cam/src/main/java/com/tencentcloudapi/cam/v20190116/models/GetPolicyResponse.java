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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPolicyResponse extends AbstractModel{

    /**
    * 策略名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 1 表示自定义策略，2 表示预设策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 策略文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetAlias")
    @Expose
    private String PresetAlias;

    /**
    * 是否服务相关策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsServiceLinkedRolePolicy")
    @Expose
    private Long IsServiceLinkedRolePolicy;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyName 策略名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyName 策略名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 1 表示自定义策略，2 表示预设策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 1 表示自定义策略，2 表示预设策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1 表示自定义策略，2 表示预设策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 1 表示自定义策略，2 表示预设策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 策略文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyDocument 策略文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set 策略文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyDocument 策略文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetAlias 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPresetAlias() {
        return this.PresetAlias;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetAlias 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetAlias(String PresetAlias) {
        this.PresetAlias = PresetAlias;
    }

    /**
     * Get 是否服务相关策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsServiceLinkedRolePolicy 是否服务相关策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsServiceLinkedRolePolicy() {
        return this.IsServiceLinkedRolePolicy;
    }

    /**
     * Set 是否服务相关策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsServiceLinkedRolePolicy 是否服务相关策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsServiceLinkedRolePolicy(Long IsServiceLinkedRolePolicy) {
        this.IsServiceLinkedRolePolicy = IsServiceLinkedRolePolicy;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "PresetAlias", this.PresetAlias);
        this.setParamSimple(map, prefix + "IsServiceLinkedRolePolicy", this.IsServiceLinkedRolePolicy);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

