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
<li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Disabled：未启用；</li><li>Allow：放行。</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 当 Name 为 BlockIP 时的附加参数。
    */
    @SerializedName("BlockIPActionParameters")
    @Expose
    private BlockIPActionParameters BlockIPActionParameters;

    /**
    * 当 Name 为 ReturnCustomPage 时的附加参数。
    */
    @SerializedName("ReturnCustomPageActionParameters")
    @Expose
    private ReturnCustomPageActionParameters ReturnCustomPageActionParameters;

    /**
    * 当 Name 为 Redirect 时的附加参数。
    */
    @SerializedName("RedirectActionParameters")
    @Expose
    private RedirectActionParameters RedirectActionParameters;

    /**
     * Get 安全执行的具体动作。取值有：
<li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Disabled：未启用；</li><li>Allow：放行。</li> 
     * @return Name 安全执行的具体动作。取值有：
<li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Disabled：未启用；</li><li>Allow：放行。</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 安全执行的具体动作。取值有：
<li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Disabled：未启用；</li><li>Allow：放行。</li>
     * @param Name 安全执行的具体动作。取值有：
<li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Disabled：未启用；</li><li>Allow：放行。</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 当 Name 为 BlockIP 时的附加参数。 
     * @return BlockIPActionParameters 当 Name 为 BlockIP 时的附加参数。
     */
    public BlockIPActionParameters getBlockIPActionParameters() {
        return this.BlockIPActionParameters;
    }

    /**
     * Set 当 Name 为 BlockIP 时的附加参数。
     * @param BlockIPActionParameters 当 Name 为 BlockIP 时的附加参数。
     */
    public void setBlockIPActionParameters(BlockIPActionParameters BlockIPActionParameters) {
        this.BlockIPActionParameters = BlockIPActionParameters;
    }

    /**
     * Get 当 Name 为 ReturnCustomPage 时的附加参数。 
     * @return ReturnCustomPageActionParameters 当 Name 为 ReturnCustomPage 时的附加参数。
     */
    public ReturnCustomPageActionParameters getReturnCustomPageActionParameters() {
        return this.ReturnCustomPageActionParameters;
    }

    /**
     * Set 当 Name 为 ReturnCustomPage 时的附加参数。
     * @param ReturnCustomPageActionParameters 当 Name 为 ReturnCustomPage 时的附加参数。
     */
    public void setReturnCustomPageActionParameters(ReturnCustomPageActionParameters ReturnCustomPageActionParameters) {
        this.ReturnCustomPageActionParameters = ReturnCustomPageActionParameters;
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
        if (source.BlockIPActionParameters != null) {
            this.BlockIPActionParameters = new BlockIPActionParameters(source.BlockIPActionParameters);
        }
        if (source.ReturnCustomPageActionParameters != null) {
            this.ReturnCustomPageActionParameters = new ReturnCustomPageActionParameters(source.ReturnCustomPageActionParameters);
        }
        if (source.RedirectActionParameters != null) {
            this.RedirectActionParameters = new RedirectActionParameters(source.RedirectActionParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "BlockIPActionParameters.", this.BlockIPActionParameters);
        this.setParamObj(map, prefix + "ReturnCustomPageActionParameters.", this.ReturnCustomPageActionParameters);
        this.setParamObj(map, prefix + "RedirectActionParameters.", this.RedirectActionParameters);

    }
}

