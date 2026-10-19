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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChallengeActionParameters extends AbstractModel {

    /**
    * <p>安全执行的具体挑战动作。</p><p>枚举值：</p><ul><li>InterstitialChallenge： 插页式挑战；</li><li>InlineChallenge： 内嵌式挑战（SDK 挑战）；</li><li>ManagedChallenge： 托管挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置；</li><li>JSChallenge： JavaScript 挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置。</li></ul>
    */
    @SerializedName("ChallengeOption")
    @Expose
    private String ChallengeOption;

    /**
    * <p>重复挑战的时间间隔，当 ChallengeOption 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li></p>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。</p>
    */
    @SerializedName("AttesterId")
    @Expose
    private String AttesterId;

    /**
     * Get <p>安全执行的具体挑战动作。</p><p>枚举值：</p><ul><li>InterstitialChallenge： 插页式挑战；</li><li>InlineChallenge： 内嵌式挑战（SDK 挑战）；</li><li>ManagedChallenge： 托管挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置；</li><li>JSChallenge： JavaScript 挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置。</li></ul> 
     * @return ChallengeOption <p>安全执行的具体挑战动作。</p><p>枚举值：</p><ul><li>InterstitialChallenge： 插页式挑战；</li><li>InlineChallenge： 内嵌式挑战（SDK 挑战）；</li><li>ManagedChallenge： 托管挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置；</li><li>JSChallenge： JavaScript 挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置。</li></ul>
     */
    public String getChallengeOption() {
        return this.ChallengeOption;
    }

    /**
     * Set <p>安全执行的具体挑战动作。</p><p>枚举值：</p><ul><li>InterstitialChallenge： 插页式挑战；</li><li>InlineChallenge： 内嵌式挑战（SDK 挑战）；</li><li>ManagedChallenge： 托管挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置；</li><li>JSChallenge： JavaScript 挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置。</li></ul>
     * @param ChallengeOption <p>安全执行的具体挑战动作。</p><p>枚举值：</p><ul><li>InterstitialChallenge： 插页式挑战；</li><li>InlineChallenge： 内嵌式挑战（SDK 挑战）；</li><li>ManagedChallenge： 托管挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置；</li><li>JSChallenge： JavaScript 挑战。仅适用于用户通过浏览器直接访问的 HTML 网页。API 接口、网页内 XHR/AJAX 异步请求、移动 App、命令行工具等场景无法完成验证，请勿配置。</li></ul>
     */
    public void setChallengeOption(String ChallengeOption) {
        this.ChallengeOption = ChallengeOption;
    }

    /**
     * Get <p>重复挑战的时间间隔，当 ChallengeOption 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li></p> 
     * @return Interval <p>重复挑战的时间间隔，当 ChallengeOption 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li></p>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>重复挑战的时间间隔，当 ChallengeOption 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li></p>
     * @param Interval <p>重复挑战的时间间隔，当 ChallengeOption 为 InterstitialChallenge/InlineChallenge 时，该字段必填。默认值为 300s。支持的单位有：<li>s：秒，取值范围1～60；</li><li>m：分，取值范围1～60；</li><li>h：小时，取值范围1～24。</li></p>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。</p> 
     * @return AttesterId <p>客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。</p>
     */
    public String getAttesterId() {
        return this.AttesterId;
    }

    /**
     * Set <p>客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。</p>
     * @param AttesterId <p>客户端认证方式 ID 。当 Name 为 InterstitialChallenge/InlineChallenge 时，该字段必填。</p>
     */
    public void setAttesterId(String AttesterId) {
        this.AttesterId = AttesterId;
    }

    public ChallengeActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChallengeActionParameters(ChallengeActionParameters source) {
        if (source.ChallengeOption != null) {
            this.ChallengeOption = new String(source.ChallengeOption);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.AttesterId != null) {
            this.AttesterId = new String(source.AttesterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChallengeOption", this.ChallengeOption);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "AttesterId", this.AttesterId);

    }
}

