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

public class GetRolePermissionBoundaryResponse extends AbstractModel{

    /**
    * 策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略语法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * 策略类型：1.自定义策略，2.预设策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * 创建方式：1.按产品功能或项目权限创建，2.按策略语法创建，3.按策略生成器创建，4.按标签授权创建，5.按权限边界规则创建
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

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
     * Get 策略语法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyDocument 策略语法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set 策略语法
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyDocument 策略语法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get 策略类型：1.自定义策略，2.预设策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyType 策略类型：1.自定义策略，2.预设策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型：1.自定义策略，2.预设策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyType 策略类型：1.自定义策略，2.预设策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 创建方式：1.按产品功能或项目权限创建，2.按策略语法创建，3.按策略生成器创建，4.按标签授权创建，5.按权限边界规则创建
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateMode 创建方式：1.按产品功能或项目权限创建，2.按策略语法创建，3.按策略生成器创建，4.按标签授权创建，5.按权限边界规则创建
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set 创建方式：1.按产品功能或项目权限创建，2.按策略语法创建，3.按策略生成器创建，4.按标签授权创建，5.按权限边界规则创建
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateMode 创建方式：1.按产品功能或项目权限创建，2.按策略语法创建，3.按策略生成器创建，4.按标签授权创建，5.按权限边界规则创建
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
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

    public GetRolePermissionBoundaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRolePermissionBoundaryResponse(GetRolePermissionBoundaryResponse source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyDocument != null) {
            this.PolicyDocument = new String(source.PolicyDocument);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.CreateMode != null) {
            this.CreateMode = new Long(source.CreateMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

