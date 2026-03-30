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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKeySandboxCredentialResponse extends AbstractModel {

    /**
    * 凭证ID
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * 凭证名称
    */
    @SerializedName("CredentialName")
    @Expose
    private String CredentialName;

    /**
    * 凭证类型
枚举值：
access：常规密钥
sts：STS临时密钥
    */
    @SerializedName("CredentialType")
    @Expose
    private String CredentialType;

    /**
    * 生效机器范围
    */
    @SerializedName("CredentialEffectScope")
    @Expose
    private CredentialEffectScope CredentialEffectScope;

    /**
    * 常规密钥凭据数据（打码后），CredentialType为access时返回
补充说明：Key为原文，Value为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Access")
    @Expose
    private AccessCredentialOutput [] Access;

    /**
    * STS凭据数据（打码后），CredentialType为sts时返回
补充说明：System为原文，SecretID和SecretKey为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("STS")
    @Expose
    private STSCredentialOutput STS;

    /**
    * 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 凭证ID 
     * @return CredentialId 凭证ID
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set 凭证ID
     * @param CredentialId 凭证ID
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get 凭证名称 
     * @return CredentialName 凭证名称
     */
    public String getCredentialName() {
        return this.CredentialName;
    }

    /**
     * Set 凭证名称
     * @param CredentialName 凭证名称
     */
    public void setCredentialName(String CredentialName) {
        this.CredentialName = CredentialName;
    }

    /**
     * Get 凭证类型
枚举值：
access：常规密钥
sts：STS临时密钥 
     * @return CredentialType 凭证类型
枚举值：
access：常规密钥
sts：STS临时密钥
     */
    public String getCredentialType() {
        return this.CredentialType;
    }

    /**
     * Set 凭证类型
枚举值：
access：常规密钥
sts：STS临时密钥
     * @param CredentialType 凭证类型
枚举值：
access：常规密钥
sts：STS临时密钥
     */
    public void setCredentialType(String CredentialType) {
        this.CredentialType = CredentialType;
    }

    /**
     * Get 生效机器范围 
     * @return CredentialEffectScope 生效机器范围
     */
    public CredentialEffectScope getCredentialEffectScope() {
        return this.CredentialEffectScope;
    }

    /**
     * Set 生效机器范围
     * @param CredentialEffectScope 生效机器范围
     */
    public void setCredentialEffectScope(CredentialEffectScope CredentialEffectScope) {
        this.CredentialEffectScope = CredentialEffectScope;
    }

    /**
     * Get 常规密钥凭据数据（打码后），CredentialType为access时返回
补充说明：Key为原文，Value为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Access 常规密钥凭据数据（打码后），CredentialType为access时返回
补充说明：Key为原文，Value为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessCredentialOutput [] getAccess() {
        return this.Access;
    }

    /**
     * Set 常规密钥凭据数据（打码后），CredentialType为access时返回
补充说明：Key为原文，Value为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Access 常规密钥凭据数据（打码后），CredentialType为access时返回
补充说明：Key为原文，Value为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccess(AccessCredentialOutput [] Access) {
        this.Access = Access;
    }

    /**
     * Get STS凭据数据（打码后），CredentialType为sts时返回
补充说明：System为原文，SecretID和SecretKey为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return STS STS凭据数据（打码后），CredentialType为sts时返回
补充说明：System为原文，SecretID和SecretKey为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public STSCredentialOutput getSTS() {
        return this.STS;
    }

    /**
     * Set STS凭据数据（打码后），CredentialType为sts时返回
补充说明：System为原文，SecretID和SecretKey为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。
     * @param STS STS凭据数据（打码后），CredentialType为sts时返回
补充说明：System为原文，SecretID和SecretKey为打码后的值（保留前3后4位，中间用***替代）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSTS(STSCredentialOutput STS) {
        this.STS = STS;
    }

    /**
     * Get 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return CreateTime 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param CreateTime 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return UpdateTime 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param UpdateTime 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeKeySandboxCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKeySandboxCredentialResponse(DescribeKeySandboxCredentialResponse source) {
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.CredentialName != null) {
            this.CredentialName = new String(source.CredentialName);
        }
        if (source.CredentialType != null) {
            this.CredentialType = new String(source.CredentialType);
        }
        if (source.CredentialEffectScope != null) {
            this.CredentialEffectScope = new CredentialEffectScope(source.CredentialEffectScope);
        }
        if (source.Access != null) {
            this.Access = new AccessCredentialOutput[source.Access.length];
            for (int i = 0; i < source.Access.length; i++) {
                this.Access[i] = new AccessCredentialOutput(source.Access[i]);
            }
        }
        if (source.STS != null) {
            this.STS = new STSCredentialOutput(source.STS);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "CredentialName", this.CredentialName);
        this.setParamSimple(map, prefix + "CredentialType", this.CredentialType);
        this.setParamObj(map, prefix + "CredentialEffectScope.", this.CredentialEffectScope);
        this.setParamArrayObj(map, prefix + "Access.", this.Access);
        this.setParamObj(map, prefix + "STS.", this.STS);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

