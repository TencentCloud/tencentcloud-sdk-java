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

public class AccessSourceSetting extends AbstractModel {

    /**
    * <p>来源类型</p><p>枚举值：</p><ul><li>PUBLIC： 公网请求</li><li>VPC： VPC 请求</li><li>WOA： 办公网请求</li></ul>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>来源请求状态</p><p>枚举值：</p><ul><li>OPEN： 放通</li><li>CLOSE： 拦截</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>是否开启 WOA 鉴权</p><p>枚举值：</p><ul><li>FORCE_AUTH： 强制鉴权</li><li>NO_AUTH： 不鉴权</li></ul><p>默认值：NO_AUTH</p><p>仅 SourceType = WOA 且 Action= OPEN 时生效</p>
    */
    @SerializedName("WOAAuth")
    @Expose
    private String WOAAuth;

    /**
    * <p>WOA 鉴权需要的 Token</p><p>仅 Source Type=WOA 且 WOAAuth = FORCE_AUTH 时必填</p>
    */
    @SerializedName("AuthToken")
    @Expose
    private String AuthToken;

    /**
    * <p>VPC 白名单信息</p><p>仅 SourceType = VPC 时有效; 不传表示不修改</p>
    */
    @SerializedName("VPCWhiteList")
    @Expose
    private VPCWhiteListConfig VPCWhiteList;

    /**
     * Get <p>来源类型</p><p>枚举值：</p><ul><li>PUBLIC： 公网请求</li><li>VPC： VPC 请求</li><li>WOA： 办公网请求</li></ul> 
     * @return SourceType <p>来源类型</p><p>枚举值：</p><ul><li>PUBLIC： 公网请求</li><li>VPC： VPC 请求</li><li>WOA： 办公网请求</li></ul>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>来源类型</p><p>枚举值：</p><ul><li>PUBLIC： 公网请求</li><li>VPC： VPC 请求</li><li>WOA： 办公网请求</li></ul>
     * @param SourceType <p>来源类型</p><p>枚举值：</p><ul><li>PUBLIC： 公网请求</li><li>VPC： VPC 请求</li><li>WOA： 办公网请求</li></ul>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>来源请求状态</p><p>枚举值：</p><ul><li>OPEN： 放通</li><li>CLOSE： 拦截</li></ul> 
     * @return Action <p>来源请求状态</p><p>枚举值：</p><ul><li>OPEN： 放通</li><li>CLOSE： 拦截</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>来源请求状态</p><p>枚举值：</p><ul><li>OPEN： 放通</li><li>CLOSE： 拦截</li></ul>
     * @param Action <p>来源请求状态</p><p>枚举值：</p><ul><li>OPEN： 放通</li><li>CLOSE： 拦截</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>是否开启 WOA 鉴权</p><p>枚举值：</p><ul><li>FORCE_AUTH： 强制鉴权</li><li>NO_AUTH： 不鉴权</li></ul><p>默认值：NO_AUTH</p><p>仅 SourceType = WOA 且 Action= OPEN 时生效</p> 
     * @return WOAAuth <p>是否开启 WOA 鉴权</p><p>枚举值：</p><ul><li>FORCE_AUTH： 强制鉴权</li><li>NO_AUTH： 不鉴权</li></ul><p>默认值：NO_AUTH</p><p>仅 SourceType = WOA 且 Action= OPEN 时生效</p>
     */
    public String getWOAAuth() {
        return this.WOAAuth;
    }

    /**
     * Set <p>是否开启 WOA 鉴权</p><p>枚举值：</p><ul><li>FORCE_AUTH： 强制鉴权</li><li>NO_AUTH： 不鉴权</li></ul><p>默认值：NO_AUTH</p><p>仅 SourceType = WOA 且 Action= OPEN 时生效</p>
     * @param WOAAuth <p>是否开启 WOA 鉴权</p><p>枚举值：</p><ul><li>FORCE_AUTH： 强制鉴权</li><li>NO_AUTH： 不鉴权</li></ul><p>默认值：NO_AUTH</p><p>仅 SourceType = WOA 且 Action= OPEN 时生效</p>
     */
    public void setWOAAuth(String WOAAuth) {
        this.WOAAuth = WOAAuth;
    }

    /**
     * Get <p>WOA 鉴权需要的 Token</p><p>仅 Source Type=WOA 且 WOAAuth = FORCE_AUTH 时必填</p> 
     * @return AuthToken <p>WOA 鉴权需要的 Token</p><p>仅 Source Type=WOA 且 WOAAuth = FORCE_AUTH 时必填</p>
     */
    public String getAuthToken() {
        return this.AuthToken;
    }

    /**
     * Set <p>WOA 鉴权需要的 Token</p><p>仅 Source Type=WOA 且 WOAAuth = FORCE_AUTH 时必填</p>
     * @param AuthToken <p>WOA 鉴权需要的 Token</p><p>仅 Source Type=WOA 且 WOAAuth = FORCE_AUTH 时必填</p>
     */
    public void setAuthToken(String AuthToken) {
        this.AuthToken = AuthToken;
    }

    /**
     * Get <p>VPC 白名单信息</p><p>仅 SourceType = VPC 时有效; 不传表示不修改</p> 
     * @return VPCWhiteList <p>VPC 白名单信息</p><p>仅 SourceType = VPC 时有效; 不传表示不修改</p>
     */
    public VPCWhiteListConfig getVPCWhiteList() {
        return this.VPCWhiteList;
    }

    /**
     * Set <p>VPC 白名单信息</p><p>仅 SourceType = VPC 时有效; 不传表示不修改</p>
     * @param VPCWhiteList <p>VPC 白名单信息</p><p>仅 SourceType = VPC 时有效; 不传表示不修改</p>
     */
    public void setVPCWhiteList(VPCWhiteListConfig VPCWhiteList) {
        this.VPCWhiteList = VPCWhiteList;
    }

    public AccessSourceSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessSourceSetting(AccessSourceSetting source) {
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.WOAAuth != null) {
            this.WOAAuth = new String(source.WOAAuth);
        }
        if (source.AuthToken != null) {
            this.AuthToken = new String(source.AuthToken);
        }
        if (source.VPCWhiteList != null) {
            this.VPCWhiteList = new VPCWhiteListConfig(source.VPCWhiteList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "WOAAuth", this.WOAAuth);
        this.setParamSimple(map, prefix + "AuthToken", this.AuthToken);
        this.setParamObj(map, prefix + "VPCWhiteList.", this.VPCWhiteList);

    }
}

