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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiKeyToken extends AbstractModel {

    /**
    * API Key 的唯一标识符，由系统基于 UUID 自动生成的 Base64 URL 编码字符串。后续对该 API Key 进行删除、修改名称或精确查询操作时，均需使用该值作为定位参数
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * API Key 的名称，即创建时传入的 KeyName 参数值。对于 publish_key 类型，该值固定为 publish_key
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * API Key 的令牌值（JWT 格式），用于服务端接口调用时的身份认证。出于安全考虑，仅在创建时返回一次完整明文；后续通过列表查询接口获取时，api_key 类型将进行脱敏处理；publish_key 类型始终返回完整明文。请在创建后妥善保存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * API Key 的过期时间，格式遵循 ISO 8601 标准。对于 api_key 类型：若创建时未指定有效期（ExpireIn），则该字段不返回，表示永不过期；若指定了有效期，则返回具体的过期时间。对于 publish_key 类型：始终返回，固定为约 2099 年
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireAt")
    @Expose
    private String ExpireAt;

    /**
    * API Key 的创建时间，格式遵循 ISO 8601 标准。对于 api_key 类型：为该 Key 实际创建时的时间。对于 publish_key 类型：若环境下已存在 publish_key 记录，则返回首次创建的时间而非本次调用时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
     * Get API Key 的唯一标识符，由系统基于 UUID 自动生成的 Base64 URL 编码字符串。后续对该 API Key 进行删除、修改名称或精确查询操作时，均需使用该值作为定位参数 
     * @return KeyId API Key 的唯一标识符，由系统基于 UUID 自动生成的 Base64 URL 编码字符串。后续对该 API Key 进行删除、修改名称或精确查询操作时，均需使用该值作为定位参数
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set API Key 的唯一标识符，由系统基于 UUID 自动生成的 Base64 URL 编码字符串。后续对该 API Key 进行删除、修改名称或精确查询操作时，均需使用该值作为定位参数
     * @param KeyId API Key 的唯一标识符，由系统基于 UUID 自动生成的 Base64 URL 编码字符串。后续对该 API Key 进行删除、修改名称或精确查询操作时，均需使用该值作为定位参数
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get API Key 的名称，即创建时传入的 KeyName 参数值。对于 publish_key 类型，该值固定为 publish_key 
     * @return Name API Key 的名称，即创建时传入的 KeyName 参数值。对于 publish_key 类型，该值固定为 publish_key
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API Key 的名称，即创建时传入的 KeyName 参数值。对于 publish_key 类型，该值固定为 publish_key
     * @param Name API Key 的名称，即创建时传入的 KeyName 参数值。对于 publish_key 类型，该值固定为 publish_key
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get API Key 的令牌值（JWT 格式），用于服务端接口调用时的身份认证。出于安全考虑，仅在创建时返回一次完整明文；后续通过列表查询接口获取时，api_key 类型将进行脱敏处理；publish_key 类型始终返回完整明文。请在创建后妥善保存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiKey API Key 的令牌值（JWT 格式），用于服务端接口调用时的身份认证。出于安全考虑，仅在创建时返回一次完整明文；后续通过列表查询接口获取时，api_key 类型将进行脱敏处理；publish_key 类型始终返回完整明文。请在创建后妥善保存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set API Key 的令牌值（JWT 格式），用于服务端接口调用时的身份认证。出于安全考虑，仅在创建时返回一次完整明文；后续通过列表查询接口获取时，api_key 类型将进行脱敏处理；publish_key 类型始终返回完整明文。请在创建后妥善保存
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiKey API Key 的令牌值（JWT 格式），用于服务端接口调用时的身份认证。出于安全考虑，仅在创建时返回一次完整明文；后续通过列表查询接口获取时，api_key 类型将进行脱敏处理；publish_key 类型始终返回完整明文。请在创建后妥善保存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get API Key 的过期时间，格式遵循 ISO 8601 标准。对于 api_key 类型：若创建时未指定有效期（ExpireIn），则该字段不返回，表示永不过期；若指定了有效期，则返回具体的过期时间。对于 publish_key 类型：始终返回，固定为约 2099 年
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireAt API Key 的过期时间，格式遵循 ISO 8601 标准。对于 api_key 类型：若创建时未指定有效期（ExpireIn），则该字段不返回，表示永不过期；若指定了有效期，则返回具体的过期时间。对于 publish_key 类型：始终返回，固定为约 2099 年
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set API Key 的过期时间，格式遵循 ISO 8601 标准。对于 api_key 类型：若创建时未指定有效期（ExpireIn），则该字段不返回，表示永不过期；若指定了有效期，则返回具体的过期时间。对于 publish_key 类型：始终返回，固定为约 2099 年
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireAt API Key 的过期时间，格式遵循 ISO 8601 标准。对于 api_key 类型：若创建时未指定有效期（ExpireIn），则该字段不返回，表示永不过期；若指定了有效期，则返回具体的过期时间。对于 publish_key 类型：始终返回，固定为约 2099 年
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireAt(String ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get API Key 的创建时间，格式遵循 ISO 8601 标准。对于 api_key 类型：为该 Key 实际创建时的时间。对于 publish_key 类型：若环境下已存在 publish_key 记录，则返回首次创建的时间而非本次调用时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateAt API Key 的创建时间，格式遵循 ISO 8601 标准。对于 api_key 类型：为该 Key 实际创建时的时间。对于 publish_key 类型：若环境下已存在 publish_key 记录，则返回首次创建的时间而非本次调用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set API Key 的创建时间，格式遵循 ISO 8601 标准。对于 api_key 类型：为该 Key 实际创建时的时间。对于 publish_key 类型：若环境下已存在 publish_key 记录，则返回首次创建的时间而非本次调用时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateAt API Key 的创建时间，格式遵循 ISO 8601 标准。对于 api_key 类型：为该 Key 实际创建时的时间。对于 publish_key 类型：若环境下已存在 publish_key 记录，则返回首次创建的时间而非本次调用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    public ApiKeyToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiKeyToken(ApiKeyToken source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new String(source.ExpireAt);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);

    }
}

