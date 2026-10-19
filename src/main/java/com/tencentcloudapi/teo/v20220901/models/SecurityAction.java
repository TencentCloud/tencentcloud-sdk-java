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

public class SecurityAction extends AbstractModel {

    /**
    * <p>安全执行的具体动作。取值有：</p><ul><li>Deny：拦截，阻止请求访问站点资源；</li><li>Monitor：观察，仅记录日志；</li><li>Redirect：重定向至 URL；</li><li>Disabled：未启用，不启用指定规则；</li><li>Allow：放行， 跳过当前安全模块剩余规则。当配置 AllowActionParameters 参数时延迟响应；</li><li>Challenge：挑战，响应挑战内容；</li><li>BlockIP：待废弃，IP 封禁；</li><li>ReturnCustomPage：待废弃，使用指定页面拦截；</li><li>JSChallenge：待废弃，JavaScript 挑战；</li><li>ManagedChallenge：待废弃，托管挑战。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>当 Name 为 Deny 时的附加参数。</p>
    */
    @SerializedName("DenyActionParameters")
    @Expose
    private DenyActionParameters DenyActionParameters;

    /**
    * <p>当 Name 为 Redirect 时的附加参数。</p>
    */
    @SerializedName("RedirectActionParameters")
    @Expose
    private RedirectActionParameters RedirectActionParameters;

    /**
    * <p>当 Name 为 Allow 时的附加参数。</p>
    */
    @SerializedName("AllowActionParameters")
    @Expose
    private AllowActionParameters AllowActionParameters;

    /**
    * <p>当 Name 为 Challenge 时的附加参数。</p>
    */
    @SerializedName("ChallengeActionParameters")
    @Expose
    private ChallengeActionParameters ChallengeActionParameters;

    /**
    * <p>待废弃，当 Name 为 BlockIP 时的附加参数。</p>
    */
    @SerializedName("BlockIPActionParameters")
    @Expose
    private BlockIPActionParameters BlockIPActionParameters;

    /**
    * <p>待废弃，当 Name 为 ReturnCustomPage 时的附加参数。</p>
    */
    @SerializedName("ReturnCustomPageActionParameters")
    @Expose
    private ReturnCustomPageActionParameters ReturnCustomPageActionParameters;

    /**
     * Get <p>安全执行的具体动作。取值有：</p><ul><li>Deny：拦截，阻止请求访问站点资源；</li><li>Monitor：观察，仅记录日志；</li><li>Redirect：重定向至 URL；</li><li>Disabled：未启用，不启用指定规则；</li><li>Allow：放行， 跳过当前安全模块剩余规则。当配置 AllowActionParameters 参数时延迟响应；</li><li>Challenge：挑战，响应挑战内容；</li><li>BlockIP：待废弃，IP 封禁；</li><li>ReturnCustomPage：待废弃，使用指定页面拦截；</li><li>JSChallenge：待废弃，JavaScript 挑战；</li><li>ManagedChallenge：待废弃，托管挑战。</li></ul> 
     * @return Name <p>安全执行的具体动作。取值有：</p><ul><li>Deny：拦截，阻止请求访问站点资源；</li><li>Monitor：观察，仅记录日志；</li><li>Redirect：重定向至 URL；</li><li>Disabled：未启用，不启用指定规则；</li><li>Allow：放行， 跳过当前安全模块剩余规则。当配置 AllowActionParameters 参数时延迟响应；</li><li>Challenge：挑战，响应挑战内容；</li><li>BlockIP：待废弃，IP 封禁；</li><li>ReturnCustomPage：待废弃，使用指定页面拦截；</li><li>JSChallenge：待废弃，JavaScript 挑战；</li><li>ManagedChallenge：待废弃，托管挑战。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>安全执行的具体动作。取值有：</p><ul><li>Deny：拦截，阻止请求访问站点资源；</li><li>Monitor：观察，仅记录日志；</li><li>Redirect：重定向至 URL；</li><li>Disabled：未启用，不启用指定规则；</li><li>Allow：放行， 跳过当前安全模块剩余规则。当配置 AllowActionParameters 参数时延迟响应；</li><li>Challenge：挑战，响应挑战内容；</li><li>BlockIP：待废弃，IP 封禁；</li><li>ReturnCustomPage：待废弃，使用指定页面拦截；</li><li>JSChallenge：待废弃，JavaScript 挑战；</li><li>ManagedChallenge：待废弃，托管挑战。</li></ul>
     * @param Name <p>安全执行的具体动作。取值有：</p><ul><li>Deny：拦截，阻止请求访问站点资源；</li><li>Monitor：观察，仅记录日志；</li><li>Redirect：重定向至 URL；</li><li>Disabled：未启用，不启用指定规则；</li><li>Allow：放行， 跳过当前安全模块剩余规则。当配置 AllowActionParameters 参数时延迟响应；</li><li>Challenge：挑战，响应挑战内容；</li><li>BlockIP：待废弃，IP 封禁；</li><li>ReturnCustomPage：待废弃，使用指定页面拦截；</li><li>JSChallenge：待废弃，JavaScript 挑战；</li><li>ManagedChallenge：待废弃，托管挑战。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>当 Name 为 Deny 时的附加参数。</p> 
     * @return DenyActionParameters <p>当 Name 为 Deny 时的附加参数。</p>
     */
    public DenyActionParameters getDenyActionParameters() {
        return this.DenyActionParameters;
    }

    /**
     * Set <p>当 Name 为 Deny 时的附加参数。</p>
     * @param DenyActionParameters <p>当 Name 为 Deny 时的附加参数。</p>
     */
    public void setDenyActionParameters(DenyActionParameters DenyActionParameters) {
        this.DenyActionParameters = DenyActionParameters;
    }

    /**
     * Get <p>当 Name 为 Redirect 时的附加参数。</p> 
     * @return RedirectActionParameters <p>当 Name 为 Redirect 时的附加参数。</p>
     */
    public RedirectActionParameters getRedirectActionParameters() {
        return this.RedirectActionParameters;
    }

    /**
     * Set <p>当 Name 为 Redirect 时的附加参数。</p>
     * @param RedirectActionParameters <p>当 Name 为 Redirect 时的附加参数。</p>
     */
    public void setRedirectActionParameters(RedirectActionParameters RedirectActionParameters) {
        this.RedirectActionParameters = RedirectActionParameters;
    }

    /**
     * Get <p>当 Name 为 Allow 时的附加参数。</p> 
     * @return AllowActionParameters <p>当 Name 为 Allow 时的附加参数。</p>
     */
    public AllowActionParameters getAllowActionParameters() {
        return this.AllowActionParameters;
    }

    /**
     * Set <p>当 Name 为 Allow 时的附加参数。</p>
     * @param AllowActionParameters <p>当 Name 为 Allow 时的附加参数。</p>
     */
    public void setAllowActionParameters(AllowActionParameters AllowActionParameters) {
        this.AllowActionParameters = AllowActionParameters;
    }

    /**
     * Get <p>当 Name 为 Challenge 时的附加参数。</p> 
     * @return ChallengeActionParameters <p>当 Name 为 Challenge 时的附加参数。</p>
     */
    public ChallengeActionParameters getChallengeActionParameters() {
        return this.ChallengeActionParameters;
    }

    /**
     * Set <p>当 Name 为 Challenge 时的附加参数。</p>
     * @param ChallengeActionParameters <p>当 Name 为 Challenge 时的附加参数。</p>
     */
    public void setChallengeActionParameters(ChallengeActionParameters ChallengeActionParameters) {
        this.ChallengeActionParameters = ChallengeActionParameters;
    }

    /**
     * Get <p>待废弃，当 Name 为 BlockIP 时的附加参数。</p> 
     * @return BlockIPActionParameters <p>待废弃，当 Name 为 BlockIP 时的附加参数。</p>
     */
    public BlockIPActionParameters getBlockIPActionParameters() {
        return this.BlockIPActionParameters;
    }

    /**
     * Set <p>待废弃，当 Name 为 BlockIP 时的附加参数。</p>
     * @param BlockIPActionParameters <p>待废弃，当 Name 为 BlockIP 时的附加参数。</p>
     */
    public void setBlockIPActionParameters(BlockIPActionParameters BlockIPActionParameters) {
        this.BlockIPActionParameters = BlockIPActionParameters;
    }

    /**
     * Get <p>待废弃，当 Name 为 ReturnCustomPage 时的附加参数。</p> 
     * @return ReturnCustomPageActionParameters <p>待废弃，当 Name 为 ReturnCustomPage 时的附加参数。</p>
     */
    public ReturnCustomPageActionParameters getReturnCustomPageActionParameters() {
        return this.ReturnCustomPageActionParameters;
    }

    /**
     * Set <p>待废弃，当 Name 为 ReturnCustomPage 时的附加参数。</p>
     * @param ReturnCustomPageActionParameters <p>待废弃，当 Name 为 ReturnCustomPage 时的附加参数。</p>
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
        if (source.AllowActionParameters != null) {
            this.AllowActionParameters = new AllowActionParameters(source.AllowActionParameters);
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
        this.setParamObj(map, prefix + "AllowActionParameters.", this.AllowActionParameters);
        this.setParamObj(map, prefix + "ChallengeActionParameters.", this.ChallengeActionParameters);
        this.setParamObj(map, prefix + "BlockIPActionParameters.", this.BlockIPActionParameters);
        this.setParamObj(map, prefix + "ReturnCustomPageActionParameters.", this.ReturnCustomPageActionParameters);

    }
}

