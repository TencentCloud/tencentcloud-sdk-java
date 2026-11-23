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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MCPTokenInfo extends AbstractModel {

    /**
    * <p>TokenId</p><p>用于管理 Token 数据，可用来延长对应 Token 有效时间</p>
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * <p>Token 名称（注释）</p>
    */
    @SerializedName("TokenName")
    @Expose
    private String TokenName;

    /**
    * <p>用户 Id</p><p>固定使用这个 UserId  来操作云渲染并发资源（为空不限制）</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>权限范围</p><p>默认值：[&quot;*&quot;]</p><p>用于指定操作权限，默认拥有全部权限</p>
    */
    @SerializedName("Scopes")
    @Expose
    private String [] Scopes;

    /**
    * <p>Token 状态</p><p>枚举值：</p><ul><li>ACTIVE： 正常状态，未被吊销。不代表还在有效期内</li><li>REVOKED： 已被吊销，永久失效</li></ul><p>默认值：ACTIVE</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Token 创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>Token 过期时间</p>
    */
    @SerializedName("ExpiresTime")
    @Expose
    private String ExpiresTime;

    /**
     * Get <p>TokenId</p><p>用于管理 Token 数据，可用来延长对应 Token 有效时间</p> 
     * @return TokenId <p>TokenId</p><p>用于管理 Token 数据，可用来延长对应 Token 有效时间</p>
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set <p>TokenId</p><p>用于管理 Token 数据，可用来延长对应 Token 有效时间</p>
     * @param TokenId <p>TokenId</p><p>用于管理 Token 数据，可用来延长对应 Token 有效时间</p>
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get <p>Token 名称（注释）</p> 
     * @return TokenName <p>Token 名称（注释）</p>
     */
    public String getTokenName() {
        return this.TokenName;
    }

    /**
     * Set <p>Token 名称（注释）</p>
     * @param TokenName <p>Token 名称（注释）</p>
     */
    public void setTokenName(String TokenName) {
        this.TokenName = TokenName;
    }

    /**
     * Get <p>用户 Id</p><p>固定使用这个 UserId  来操作云渲染并发资源（为空不限制）</p> 
     * @return UserId <p>用户 Id</p><p>固定使用这个 UserId  来操作云渲染并发资源（为空不限制）</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户 Id</p><p>固定使用这个 UserId  来操作云渲染并发资源（为空不限制）</p>
     * @param UserId <p>用户 Id</p><p>固定使用这个 UserId  来操作云渲染并发资源（为空不限制）</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>权限范围</p><p>默认值：[&quot;*&quot;]</p><p>用于指定操作权限，默认拥有全部权限</p> 
     * @return Scopes <p>权限范围</p><p>默认值：[&quot;*&quot;]</p><p>用于指定操作权限，默认拥有全部权限</p>
     */
    public String [] getScopes() {
        return this.Scopes;
    }

    /**
     * Set <p>权限范围</p><p>默认值：[&quot;*&quot;]</p><p>用于指定操作权限，默认拥有全部权限</p>
     * @param Scopes <p>权限范围</p><p>默认值：[&quot;*&quot;]</p><p>用于指定操作权限，默认拥有全部权限</p>
     */
    public void setScopes(String [] Scopes) {
        this.Scopes = Scopes;
    }

    /**
     * Get <p>Token 状态</p><p>枚举值：</p><ul><li>ACTIVE： 正常状态，未被吊销。不代表还在有效期内</li><li>REVOKED： 已被吊销，永久失效</li></ul><p>默认值：ACTIVE</p> 
     * @return Status <p>Token 状态</p><p>枚举值：</p><ul><li>ACTIVE： 正常状态，未被吊销。不代表还在有效期内</li><li>REVOKED： 已被吊销，永久失效</li></ul><p>默认值：ACTIVE</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Token 状态</p><p>枚举值：</p><ul><li>ACTIVE： 正常状态，未被吊销。不代表还在有效期内</li><li>REVOKED： 已被吊销，永久失效</li></ul><p>默认值：ACTIVE</p>
     * @param Status <p>Token 状态</p><p>枚举值：</p><ul><li>ACTIVE： 正常状态，未被吊销。不代表还在有效期内</li><li>REVOKED： 已被吊销，永久失效</li></ul><p>默认值：ACTIVE</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Token 创建时间</p> 
     * @return CreatedTime <p>Token 创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>Token 创建时间</p>
     * @param CreatedTime <p>Token 创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>Token 过期时间</p> 
     * @return ExpiresTime <p>Token 过期时间</p>
     */
    public String getExpiresTime() {
        return this.ExpiresTime;
    }

    /**
     * Set <p>Token 过期时间</p>
     * @param ExpiresTime <p>Token 过期时间</p>
     */
    public void setExpiresTime(String ExpiresTime) {
        this.ExpiresTime = ExpiresTime;
    }

    public MCPTokenInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPTokenInfo(MCPTokenInfo source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.TokenName != null) {
            this.TokenName = new String(source.TokenName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Scopes != null) {
            this.Scopes = new String[source.Scopes.length];
            for (int i = 0; i < source.Scopes.length; i++) {
                this.Scopes[i] = new String(source.Scopes[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiresTime != null) {
            this.ExpiresTime = new String(source.ExpiresTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "TokenName", this.TokenName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "Scopes.", this.Scopes);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiresTime", this.ExpiresTime);

    }
}

