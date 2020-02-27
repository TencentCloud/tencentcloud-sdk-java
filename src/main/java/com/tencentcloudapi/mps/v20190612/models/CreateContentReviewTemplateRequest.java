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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateContentReviewTemplateRequest extends AbstractModel{

    /**
    * 内容审核模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 内容审核模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 鉴黄控制参数。
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfo PornConfigure;

    /**
    * 鉴恐控制参数。
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfo TerrorismConfigure;

    /**
    * 鉴政控制参数。
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfo PoliticalConfigure;

    /**
    * 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
注意：此参数尚未支持。
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfo ProhibitedConfigure;

    /**
    * 用户自定义内容审核控制参数。
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfo UserDefineConfigure;

    /**
     * Get 内容审核模板名称，长度限制：64 个字符。 
     * @return Name 内容审核模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 内容审核模板名称，长度限制：64 个字符。
     * @param Name 内容审核模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 内容审核模板描述信息，长度限制：256 个字符。 
     * @return Comment 内容审核模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 内容审核模板描述信息，长度限制：256 个字符。
     * @param Comment 内容审核模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 鉴黄控制参数。 
     * @return PornConfigure 鉴黄控制参数。
     */
    public PornConfigureInfo getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set 鉴黄控制参数。
     * @param PornConfigure 鉴黄控制参数。
     */
    public void setPornConfigure(PornConfigureInfo PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get 鉴恐控制参数。 
     * @return TerrorismConfigure 鉴恐控制参数。
     */
    public TerrorismConfigureInfo getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set 鉴恐控制参数。
     * @param TerrorismConfigure 鉴恐控制参数。
     */
    public void setTerrorismConfigure(TerrorismConfigureInfo TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get 鉴政控制参数。 
     * @return PoliticalConfigure 鉴政控制参数。
     */
    public PoliticalConfigureInfo getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set 鉴政控制参数。
     * @param PoliticalConfigure 鉴政控制参数。
     */
    public void setPoliticalConfigure(PoliticalConfigureInfo PoliticalConfigure) {
        this.PoliticalConfigure = PoliticalConfigure;
    }

    /**
     * Get 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
注意：此参数尚未支持。 
     * @return ProhibitedConfigure 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
注意：此参数尚未支持。
     */
    public ProhibitedConfigureInfo getProhibitedConfigure() {
        return this.ProhibitedConfigure;
    }

    /**
     * Set 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
注意：此参数尚未支持。
     * @param ProhibitedConfigure 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
注意：此参数尚未支持。
     */
    public void setProhibitedConfigure(ProhibitedConfigureInfo ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get 用户自定义内容审核控制参数。 
     * @return UserDefineConfigure 用户自定义内容审核控制参数。
     */
    public UserDefineConfigureInfo getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set 用户自定义内容审核控制参数。
     * @param UserDefineConfigure 用户自定义内容审核控制参数。
     */
    public void setUserDefineConfigure(UserDefineConfigureInfo UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "PornConfigure.", this.PornConfigure);
        this.setParamObj(map, prefix + "TerrorismConfigure.", this.TerrorismConfigure);
        this.setParamObj(map, prefix + "PoliticalConfigure.", this.PoliticalConfigure);
        this.setParamObj(map, prefix + "ProhibitedConfigure.", this.ProhibitedConfigure);
        this.setParamObj(map, prefix + "UserDefineConfigure.", this.UserDefineConfigure);

    }
}

