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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationAuthorizationOptions extends AbstractModel {

    /**
    * 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
    */
    @SerializedName("UniformSocialCreditCodeSame")
    @Expose
    private Boolean UniformSocialCreditCodeSame;

    /**
    * 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在企业名称不为空时有效
    */
    @SerializedName("OrganizationNameSame")
    @Expose
    private Boolean OrganizationNameSame;

    /**
    * 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在法人姓名不为空时有效
    */
    @SerializedName("LegalNameSame")
    @Expose
    private Boolean LegalNameSame;

    /**
     * Get 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul> 
     * @return UniformSocialCreditCodeSame 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public Boolean getUniformSocialCreditCodeSame() {
        return this.UniformSocialCreditCodeSame;
    }

    /**
     * Set 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     * @param UniformSocialCreditCodeSame 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public void setUniformSocialCreditCodeSame(Boolean UniformSocialCreditCodeSame) {
        this.UniformSocialCreditCodeSame = UniformSocialCreditCodeSame;
    }

    /**
     * Get 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在企业名称不为空时有效 
     * @return OrganizationNameSame 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在企业名称不为空时有效
     */
    public Boolean getOrganizationNameSame() {
        return this.OrganizationNameSame;
    }

    /**
     * Set 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在企业名称不为空时有效
     * @param OrganizationNameSame 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在企业名称不为空时有效
     */
    public void setOrganizationNameSame(Boolean OrganizationNameSame) {
        this.OrganizationNameSame = OrganizationNameSame;
    }

    /**
     * Get 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在法人姓名不为空时有效 
     * @return LegalNameSame 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在法人姓名不为空时有效
     */
    public Boolean getLegalNameSame() {
        return this.LegalNameSame;
    }

    /**
     * Set 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在法人姓名不为空时有效
     * @param LegalNameSame 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>p.s. 仅在法人姓名不为空时有效
     */
    public void setLegalNameSame(Boolean LegalNameSame) {
        this.LegalNameSame = LegalNameSame;
    }

    public OrganizationAuthorizationOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationAuthorizationOptions(OrganizationAuthorizationOptions source) {
        if (source.UniformSocialCreditCodeSame != null) {
            this.UniformSocialCreditCodeSame = new Boolean(source.UniformSocialCreditCodeSame);
        }
        if (source.OrganizationNameSame != null) {
            this.OrganizationNameSame = new Boolean(source.OrganizationNameSame);
        }
        if (source.LegalNameSame != null) {
            this.LegalNameSame = new Boolean(source.LegalNameSame);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniformSocialCreditCodeSame", this.UniformSocialCreditCodeSame);
        this.setParamSimple(map, prefix + "OrganizationNameSame", this.OrganizationNameSame);
        this.setParamSimple(map, prefix + "LegalNameSame", this.LegalNameSame);

    }
}

