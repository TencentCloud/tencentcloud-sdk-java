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
    * 访问控制类型。枚举值: 1:公开访问(所有用户都可访问), 2:内部访问(仅企业用户可访问), 3:账号白名单(指定UIN/手机/邮箱/IP可访问)
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 体验链接开关
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 白名单(仅 access_type=ACCOUNT_WHITELIST 时生效)
    */
    @SerializedName("Whitelist")
    @Expose
    private AppShareWhitelistItem [] Whitelist;

    /**
     * Get 访问控制类型。枚举值: 1:公开访问(所有用户都可访问), 2:内部访问(仅企业用户可访问), 3:账号白名单(指定UIN/手机/邮箱/IP可访问) 
     * @return AccessType 访问控制类型。枚举值: 1:公开访问(所有用户都可访问), 2:内部访问(仅企业用户可访问), 3:账号白名单(指定UIN/手机/邮箱/IP可访问)
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 访问控制类型。枚举值: 1:公开访问(所有用户都可访问), 2:内部访问(仅企业用户可访问), 3:账号白名单(指定UIN/手机/邮箱/IP可访问)
     * @param AccessType 访问控制类型。枚举值: 1:公开访问(所有用户都可访问), 2:内部访问(仅企业用户可访问), 3:账号白名单(指定UIN/手机/邮箱/IP可访问)
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 体验链接开关 
     * @return Enabled 体验链接开关
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 体验链接开关
     * @param Enabled 体验链接开关
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 白名单(仅 access_type=ACCOUNT_WHITELIST 时生效) 
     * @return Whitelist 白名单(仅 access_type=ACCOUNT_WHITELIST 时生效)
     */
    public AppShareWhitelistItem [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set 白名单(仅 access_type=ACCOUNT_WHITELIST 时生效)
     * @param Whitelist 白名单(仅 access_type=ACCOUNT_WHITELIST 时生效)
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

