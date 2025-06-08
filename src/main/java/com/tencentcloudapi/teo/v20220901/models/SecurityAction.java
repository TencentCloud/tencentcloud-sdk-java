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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityAction extends AbstractModel {

    /**
    * 安全执行的具体动作。取值有：
<li>Deny：拦截，阻止请求访问站点资源；</li>
<li>Monitor：观察，仅记录日志；</li>
<li>Redirect：重定向至 URL；</li>
<li>Disabled：未启用，不启用指定规则；</li>
<li>Allow：允许访问，但延迟处理请求；</li>
<li>Challenge：挑战，响应挑战内容；</li>
<li>BlockIP：待废弃，IP 封禁；</li>
<li>ReturnCustomPage：待废弃，使用指定页面拦截；</li>
<li>JSChallenge：待废弃，JavaScript 挑战；</li>
<li>ManagedChallenge：待废弃，托管挑战。</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 当 Name 为 Deny 时的附加参数。
    */
    @SerializedName("DenyActionParameters")
    @Expose
    private DenyActionParameters DenyActionParameters;

    /**
    * 当 Name 为 Redirect 时的附加参数。
    */
    @SerializedName("RedirectActionParameters")
    @Expose
    private RedirectActionParameters RedirectActionParameters;

    /**
    * 当 Name 为 Challenge 时的附加参数。
    */
    @SerializedName("ChallengeActionParameters")
    @Expose
    private ChallengeActionParameters ChallengeActionParameters;

    /**
    * 待废弃，当 Name 为 BlockIP 时的附加参数。
    */
    @SerializedName("BlockIPActionParameters")
    @Expose
    private BlockIPActionParameters BlockIPActionParameters;

    /**
    * 待废弃，当 Name 为 ReturnCustomPage 时的附加参数。
    */
    @SerializedName("ReturnCustomPageActionParameters")
    @Expose
    private ReturnCustomPageActionParameters ReturnCustomPageActionParameters;

    /**
     * Get 安全执行的具体动作。取值有：
<li>Deny：拦截，阻止请求访问站点资源；</li>
<li>Monitor：观察，仅记录日志；</li>
<li>Redirect：重定向至 URL；</li>
<li>Disabled：未启用，不启用指定规则；</li>
<li>Allow：允许访问，但延迟处理请求；</li>
<li>Challenge：挑战，响应挑战内容；</li>
<li>BlockIP：待废弃，IP 封禁；</li>
<li>ReturnCustomPage：待废弃，使用指定页面拦截；</li>
<li>JSChallenge：待废弃，JavaScript 挑战；</li>
<li>ManagedChallenge：待废弃，托管挑战。</li> 
     * @return Name 安全执行的具体动作。取值有：
<li>Deny：拦截，阻止请求访问站点资源；</li>
<li>Monitor：观察，仅记录日志；</li>
<li>Redirect：重定向至 URL；</li>
<li>Disabled：未启用，不启用指定规则；</li>
<li>Allow：允许访问，但延迟处理请求；</li>
<li>Challenge：挑战，响应挑战内容；</li>
<li>BlockIP：待废弃，IP 封禁；</li>
<li>ReturnCustomPage：待废弃，使用指定页面拦截；</li>
<li>JSChallenge：待废弃，JavaScript 挑战；</li>
<li>ManagedChallenge：待废弃，托管挑战。</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 安全执行的具体动作。取值有：
<li>Deny：拦截，阻止请求访问站点资源；</li>
<li>Monitor：观察，仅记录日志；</li>
<li>Redirect：重定向至 URL；</li>
<li>Disabled：未启用，不启用指定规则；</li>
<li>Allow：允许访问，但延迟处理请求；</li>
<li>Challenge：挑战，响应挑战内容；</li>
<li>BlockIP：待废弃，IP 封禁；</li>
<li>ReturnCustomPage：待废弃，使用指定页面拦截；</li>
<li>JSChallenge：待废弃，JavaScript 挑战；</li>
<li>ManagedChallenge：待废弃，托管挑战。</li>
     * @param Name 安全执行的具体动作。取值有：
<li>Deny：拦截，阻止请求访问站点资源；</li>
<li>Monitor：观察，仅记录日志；</li>
<li>Redirect：重定向至 URL；</li>
<li>Disabled：未启用，不启用指定规则；</li>
<li>Allow：允许访问，但延迟处理请求；</li>
<li>Challenge：挑战，响应挑战内容；</li>
<li>BlockIP：待废弃，IP 封禁；</li>
<li>ReturnCustomPage：待废弃，使用指定页面拦截；</li>
<li>JSChallenge：待废弃，JavaScript 挑战；</li>
<li>ManagedChallenge：待废弃，托管挑战。</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 当 Name 为 Deny 时的附加参数。 
     * @return DenyActionParameters 当 Name 为 Deny 时的附加参数。
     */
    public DenyActionParameters getDenyActionParameters() {
        return this.DenyActionParameters;
    }

    /**
     * Set 当 Name 为 Deny 时的附加参数。
     * @param DenyActionParameters 当 Name 为 Deny 时的附加参数。
     */
    public void setDenyActionParameters(DenyActionParameters DenyActionParameters) {
        this.DenyActionParameters = DenyActionParameters;
    }

    /**
     * Get 当 Name 为 Redirect 时的附加参数。 
     * @return RedirectActionParameters 当 Name 为 Redirect 时的附加参数。
     */
    public RedirectActionParameters getRedirectActionParameters() {
        return this.RedirectActionParameters;
    }

    /**
     * Set 当 Name 为 Redirect 时的附加参数。
     * @param RedirectActionParameters 当 Name 为 Redirect 时的附加参数。
     */
    public void setRedirectActionParameters(RedirectActionParameters RedirectActionParameters) {
        this.RedirectActionParameters = RedirectActionParameters;
    }

    /**
     * Get 当 Name 为 Challenge 时的附加参数。 
     * @return ChallengeActionParameters 当 Name 为 Challenge 时的附加参数。
     */
    public ChallengeActionParameters getChallengeActionParameters() {
        return this.ChallengeActionParameters;
    }

    /**
     * Set 当 Name 为 Challenge 时的附加参数。
     * @param ChallengeActionParameters 当 Name 为 Challenge 时的附加参数。
     */
    public void setChallengeActionParameters(ChallengeActionParameters ChallengeActionParameters) {
        this.ChallengeActionParameters = ChallengeActionParameters;
    }

    /**
     * Get 待废弃，当 Name 为 BlockIP 时的附加参数。 
     * @return BlockIPActionParameters 待废弃，当 Name 为 BlockIP 时的附加参数。
     */
    public BlockIPActionParameters getBlockIPActionParameters() {
        return this.BlockIPActionParameters;
    }

    /**
     * Set 待废弃，当 Name 为 BlockIP 时的附加参数。
     * @param BlockIPActionParameters 待废弃，当 Name 为 BlockIP 时的附加参数。
     */
    public void setBlockIPActionParameters(BlockIPActionParameters BlockIPActionParameters) {
        this.BlockIPActionParameters = BlockIPActionParameters;
    }

    /**
     * Get 待废弃，当 Name 为 ReturnCustomPage 时的附加参数。 
     * @return ReturnCustomPageActionParameters 待废弃，当 Name 为 ReturnCustomPage 时的附加参数。
     */
    public ReturnCustomPageActionParameters getReturnCustomPageActionParameters() {
        return this.ReturnCustomPageActionParameters;
    }

    /**
     * Set 待废弃，当 Name 为 ReturnCustomPage 时的附加参数。
     * @param ReturnCustomPageActionParameters 待废弃，当 Name 为 ReturnCustomPage 时的附加参数。
     */
    public void setReturnCustomPageActionParameters(ReturnCustomPageActionParameters ReturnCustomPageActionParameters) {
        this.ReturnCustomPageActionParameters = ReturnCustomPageActionParameters;
    }

    public SecurityAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityAction(SecurityAction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DenyActionParameters != null) {
            this.DenyActionParameters = new DenyActionParameters(source.DenyActionParameters);
        }
        if (source.RedirectActionParameters != null) {
            this.RedirectActionParameters = new RedirectActionParameters(source.RedirectActionParameters);
        }
        if (source.ChallengeActionParameters != null) {
            this.ChallengeActionParameters = new ChallengeActionParameters(source.ChallengeActionParameters);
        }
        if (source.BlockIPActionParameters != null) {
            this.BlockIPActionParameters = new BlockIPActionParameters(source.BlockIPActionParameters);
        }
        if (source.ReturnCustomPageActionParameters != null) {
            this.ReturnCustomPageActionParameters = new ReturnCustomPageActionParameters(source.ReturnCustomPageActionParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "DenyActionParameters.", this.DenyActionParameters);
        this.setParamObj(map, prefix + "RedirectActionParameters.", this.RedirectActionParameters);
        this.setParamObj(map, prefix + "ChallengeActionParameters.", this.ChallengeActionParameters);
        this.setParamObj(map, prefix + "BlockIPActionParameters.", this.BlockIPActionParameters);
        this.setParamObj(map, prefix + "ReturnCustomPageActionParameters.", this.ReturnCustomPageActionParameters);

    }
}

