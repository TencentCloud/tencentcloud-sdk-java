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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidInstanceMCPToken extends AbstractModel {

    /**
    * <p>内部 ID，格式 k_ + 16 位 hex</p>
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>备注名</p>
    */
    @SerializedName("TokenName")
    @Expose
    private String TokenName;

    /**
    * <p>USER 角色可访问的实例白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowedInstanceIds")
    @Expose
    private String [] AllowedInstanceIds;

    /**
    * <p>创建时间</p><p>参数格式：ISO8601 字符串；</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>过期时间</p><p>参数格式：ISO8601 字符串；永不过期时为空串</p>
    */
    @SerializedName("ExpiresTime")
    @Expose
    private String ExpiresTime;

    /**
    * <p>或 EXPIRED；EXPIRED 由 ExpiresTime 推导。已删除的不出现在列表里</p><p>枚举值：</p><ul><li>ACTIVE： 正常可用的</li><li>EXPIRED： 过期的</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>内部 ID，格式 k_ + 16 位 hex</p> 
     * @return TokenId <p>内部 ID，格式 k_ + 16 位 hex</p>
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set <p>内部 ID，格式 k_ + 16 位 hex</p>
     * @param TokenId <p>内部 ID，格式 k_ + 16 位 hex</p>
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p> 
     * @return Role <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p>
     * @param Role <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>备注名</p> 
     * @return TokenName <p>备注名</p>
     */
    public String getTokenName() {
        return this.TokenName;
    }

    /**
     * Set <p>备注名</p>
     * @param TokenName <p>备注名</p>
     */
    public void setTokenName(String TokenName) {
        this.TokenName = TokenName;
    }

    /**
     * Get <p>USER 角色可访问的实例白名单</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowedInstanceIds <p>USER 角色可访问的实例白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllowedInstanceIds() {
        return this.AllowedInstanceIds;
    }

    /**
     * Set <p>USER 角色可访问的实例白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowedInstanceIds <p>USER 角色可访问的实例白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowedInstanceIds(String [] AllowedInstanceIds) {
        this.AllowedInstanceIds = AllowedInstanceIds;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：ISO8601 字符串；</p> 
     * @return CreateTime <p>创建时间</p><p>参数格式：ISO8601 字符串；</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：ISO8601 字符串；</p>
     * @param CreateTime <p>创建时间</p><p>参数格式：ISO8601 字符串；</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>过期时间</p><p>参数格式：ISO8601 字符串；永不过期时为空串</p> 
     * @return ExpiresTime <p>过期时间</p><p>参数格式：ISO8601 字符串；永不过期时为空串</p>
     */
    public String getExpiresTime() {
        return this.ExpiresTime;
    }

    /**
     * Set <p>过期时间</p><p>参数格式：ISO8601 字符串；永不过期时为空串</p>
     * @param ExpiresTime <p>过期时间</p><p>参数格式：ISO8601 字符串；永不过期时为空串</p>
     */
    public void setExpiresTime(String ExpiresTime) {
        this.ExpiresTime = ExpiresTime;
    }

    /**
     * Get <p>或 EXPIRED；EXPIRED 由 ExpiresTime 推导。已删除的不出现在列表里</p><p>枚举值：</p><ul><li>ACTIVE： 正常可用的</li><li>EXPIRED： 过期的</li></ul> 
     * @return Status <p>或 EXPIRED；EXPIRED 由 ExpiresTime 推导。已删除的不出现在列表里</p><p>枚举值：</p><ul><li>ACTIVE： 正常可用的</li><li>EXPIRED： 过期的</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>或 EXPIRED；EXPIRED 由 ExpiresTime 推导。已删除的不出现在列表里</p><p>枚举值：</p><ul><li>ACTIVE： 正常可用的</li><li>EXPIRED： 过期的</li></ul>
     * @param Status <p>或 EXPIRED；EXPIRED 由 ExpiresTime 推导。已删除的不出现在列表里</p><p>枚举值：</p><ul><li>ACTIVE： 正常可用的</li><li>EXPIRED： 过期的</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AndroidInstanceMCPToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidInstanceMCPToken(AndroidInstanceMCPToken source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.TokenName != null) {
            this.TokenName = new String(source.TokenName);
        }
        if (source.AllowedInstanceIds != null) {
            this.AllowedInstanceIds = new String[source.AllowedInstanceIds.length];
            for (int i = 0; i < source.AllowedInstanceIds.length; i++) {
                this.AllowedInstanceIds[i] = new String(source.AllowedInstanceIds[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpiresTime != null) {
            this.ExpiresTime = new String(source.ExpiresTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "TokenName", this.TokenName);
        this.setParamArraySimple(map, prefix + "AllowedInstanceIds.", this.AllowedInstanceIds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpiresTime", this.ExpiresTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

