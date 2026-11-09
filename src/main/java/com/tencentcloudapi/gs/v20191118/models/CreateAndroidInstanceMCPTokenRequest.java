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

public class CreateAndroidInstanceMCPTokenRequest extends AbstractModel {

    /**
    * <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p><p>枚举值：</p><ul><li>ROOT： 可访问该 AppId 下全部实例</li><li>USER： 可访问本角色实例白名单内的实例</li></ul><p>默认值：USER</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>有效期（秒）；0 或不传表示永不过期（负值等同不过期）</p>
    */
    @SerializedName("ExpireSeconds")
    @Expose
    private Long ExpireSeconds;

    /**
    * <p>备注名</p>
    */
    @SerializedName("TokenName")
    @Expose
    private String TokenName;

    /**
    * <p>USER 角色可访问的实例白名单</p>
    */
    @SerializedName("AllowedInstanceIds")
    @Expose
    private String [] AllowedInstanceIds;

    /**
     * Get <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p><p>枚举值：</p><ul><li>ROOT： 可访问该 AppId 下全部实例</li><li>USER： 可访问本角色实例白名单内的实例</li></ul><p>默认值：USER</p> 
     * @return Role <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p><p>枚举值：</p><ul><li>ROOT： 可访问该 AppId 下全部实例</li><li>USER： 可访问本角色实例白名单内的实例</li></ul><p>默认值：USER</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p><p>枚举值：</p><ul><li>ROOT： 可访问该 AppId 下全部实例</li><li>USER： 可访问本角色实例白名单内的实例</li></ul><p>默认值：USER</p>
     * @param Role <p>ROOT / USER（大小写敏感），默认 USER。ROOT 可访问该 AppId 下全部实例</p><p>枚举值：</p><ul><li>ROOT： 可访问该 AppId 下全部实例</li><li>USER： 可访问本角色实例白名单内的实例</li></ul><p>默认值：USER</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>有效期（秒）；0 或不传表示永不过期（负值等同不过期）</p> 
     * @return ExpireSeconds <p>有效期（秒）；0 或不传表示永不过期（负值等同不过期）</p>
     */
    public Long getExpireSeconds() {
        return this.ExpireSeconds;
    }

    /**
     * Set <p>有效期（秒）；0 或不传表示永不过期（负值等同不过期）</p>
     * @param ExpireSeconds <p>有效期（秒）；0 或不传表示永不过期（负值等同不过期）</p>
     */
    public void setExpireSeconds(Long ExpireSeconds) {
        this.ExpireSeconds = ExpireSeconds;
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
     * @return AllowedInstanceIds <p>USER 角色可访问的实例白名单</p>
     */
    public String [] getAllowedInstanceIds() {
        return this.AllowedInstanceIds;
    }

    /**
     * Set <p>USER 角色可访问的实例白名单</p>
     * @param AllowedInstanceIds <p>USER 角色可访问的实例白名单</p>
     */
    public void setAllowedInstanceIds(String [] AllowedInstanceIds) {
        this.AllowedInstanceIds = AllowedInstanceIds;
    }

    public CreateAndroidInstanceMCPTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidInstanceMCPTokenRequest(CreateAndroidInstanceMCPTokenRequest source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.ExpireSeconds != null) {
            this.ExpireSeconds = new Long(source.ExpireSeconds);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "ExpireSeconds", this.ExpireSeconds);
        this.setParamSimple(map, prefix + "TokenName", this.TokenName);
        this.setParamArraySimple(map, prefix + "AllowedInstanceIds.", this.AllowedInstanceIds);

    }
}

