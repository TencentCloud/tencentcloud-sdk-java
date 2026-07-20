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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppShareAccessControl extends AbstractModel {

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>APP_SHARE_ACCESS_TYPE_PUBLIC</td><td>1</td><td>公开访问(所有用户都可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_INTERNAL</td><td>2</td><td>内部访问(仅企业用户可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_ACCOUNT_WHITELIST</td><td>3</td><td>账号白名单(指定UIN/手机/邮箱/IP可访问)</td></tr></tbody></table>
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * <p>是否开启访问控制</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 禁用</li></ul>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>白名单信息</p>
    */
    @SerializedName("Whitelist")
    @Expose
    private AppShareWhitelistItem [] Whitelist;

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>APP_SHARE_ACCESS_TYPE_PUBLIC</td><td>1</td><td>公开访问(所有用户都可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_INTERNAL</td><td>2</td><td>内部访问(仅企业用户可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_ACCOUNT_WHITELIST</td><td>3</td><td>账号白名单(指定UIN/手机/邮箱/IP可访问)</td></tr></tbody></table> 
     * @return AccessType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>APP_SHARE_ACCESS_TYPE_PUBLIC</td><td>1</td><td>公开访问(所有用户都可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_INTERNAL</td><td>2</td><td>内部访问(仅企业用户可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_ACCOUNT_WHITELIST</td><td>3</td><td>账号白名单(指定UIN/手机/邮箱/IP可访问)</td></tr></tbody></table>
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>APP_SHARE_ACCESS_TYPE_PUBLIC</td><td>1</td><td>公开访问(所有用户都可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_INTERNAL</td><td>2</td><td>内部访问(仅企业用户可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_ACCOUNT_WHITELIST</td><td>3</td><td>账号白名单(指定UIN/手机/邮箱/IP可访问)</td></tr></tbody></table>
     * @param AccessType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>APP_SHARE_ACCESS_TYPE_PUBLIC</td><td>1</td><td>公开访问(所有用户都可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_INTERNAL</td><td>2</td><td>内部访问(仅企业用户可访问)</td></tr><tr><td>APP_SHARE_ACCESS_TYPE_ACCOUNT_WHITELIST</td><td>3</td><td>账号白名单(指定UIN/手机/邮箱/IP可访问)</td></tr></tbody></table>
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>是否开启访问控制</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 禁用</li></ul> 
     * @return Enabled <p>是否开启访问控制</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 禁用</li></ul>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否开启访问控制</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 禁用</li></ul>
     * @param Enabled <p>是否开启访问控制</p><p>枚举值：</p><ul><li>true： 启用</li><li>false： 禁用</li></ul>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>白名单信息</p> 
     * @return Whitelist <p>白名单信息</p>
     */
    public AppShareWhitelistItem [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set <p>白名单信息</p>
     * @param Whitelist <p>白名单信息</p>
     */
    public void setWhitelist(AppShareWhitelistItem [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    public AppShareAccessControl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppShareAccessControl(AppShareAccessControl source) {
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Whitelist != null) {
            this.Whitelist = new AppShareWhitelistItem[source.Whitelist.length];
            for (int i = 0; i < source.Whitelist.length; i++) {
                this.Whitelist[i] = new AppShareWhitelistItem(source.Whitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "Whitelist.", this.Whitelist);

    }
}

