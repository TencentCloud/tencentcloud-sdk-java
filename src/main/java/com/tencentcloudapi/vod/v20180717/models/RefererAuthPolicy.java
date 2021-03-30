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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefererAuthPolicy extends AbstractModel{

    /**
    * [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Referer 校验类型，可选值：
<li>Black: 黑名单方式校验；</li>
<li>White:白名单方式校验。</li>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 用于校验的 Referer 名单。
    */
    @SerializedName("Referers")
    @Expose
    private String [] Referers;

    /**
    * 是否允许空 Referer 访问本域名，可选值：
<li>Yes: 是；</li>
<li>No: 否。</li>
    */
    @SerializedName("BlankRefererAllowed")
    @Expose
    private String BlankRefererAllowed;

    /**
     * Get [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li> 
     * @return Status [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li>
     * @param Status [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Referer 校验类型，可选值：
<li>Black: 黑名单方式校验；</li>
<li>White:白名单方式校验。</li> 
     * @return AuthType Referer 校验类型，可选值：
<li>Black: 黑名单方式校验；</li>
<li>White:白名单方式校验。</li>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Referer 校验类型，可选值：
<li>Black: 黑名单方式校验；</li>
<li>White:白名单方式校验。</li>
     * @param AuthType Referer 校验类型，可选值：
<li>Black: 黑名单方式校验；</li>
<li>White:白名单方式校验。</li>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 用于校验的 Referer 名单。 
     * @return Referers 用于校验的 Referer 名单。
     */
    public String [] getReferers() {
        return this.Referers;
    }

    /**
     * Set 用于校验的 Referer 名单。
     * @param Referers 用于校验的 Referer 名单。
     */
    public void setReferers(String [] Referers) {
        this.Referers = Referers;
    }

    /**
     * Get 是否允许空 Referer 访问本域名，可选值：
<li>Yes: 是；</li>
<li>No: 否。</li> 
     * @return BlankRefererAllowed 是否允许空 Referer 访问本域名，可选值：
<li>Yes: 是；</li>
<li>No: 否。</li>
     */
    public String getBlankRefererAllowed() {
        return this.BlankRefererAllowed;
    }

    /**
     * Set 是否允许空 Referer 访问本域名，可选值：
<li>Yes: 是；</li>
<li>No: 否。</li>
     * @param BlankRefererAllowed 是否允许空 Referer 访问本域名，可选值：
<li>Yes: 是；</li>
<li>No: 否。</li>
     */
    public void setBlankRefererAllowed(String BlankRefererAllowed) {
        this.BlankRefererAllowed = BlankRefererAllowed;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamArraySimple(map, prefix + "Referers.", this.Referers);
        this.setParamSimple(map, prefix + "BlankRefererAllowed", this.BlankRefererAllowed);

    }
}

