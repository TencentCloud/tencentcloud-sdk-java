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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyContentReviewTemplateRequest extends AbstractModel {

    /**
    * 内容审核模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

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
    * 令人反感的信息的控制参数。
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfoForUpdate PornConfigure;

    /**
    * 令人不安全的信息的控制参数。
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfoForUpdate TerrorismConfigure;

    /**
    * 令人不适宜的控制参数。
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfoForUpdate PoliticalConfigure;

    /**
    * 违禁控制参数。违禁内容包括：
<li>谩骂；</li>
<li>涉毒违法。</li>
注意：此参数尚未支持。
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfoForUpdate ProhibitedConfigure;

    /**
    * 用户自定义内容审核控制参数。
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfoForUpdate UserDefineConfigure;

    /**
     * Get 内容审核模板唯一标识。 
     * @return Definition 内容审核模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 内容审核模板唯一标识。
     * @param Definition 内容审核模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

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
     * Get 令人反感的信息的控制参数。 
     * @return PornConfigure 令人反感的信息的控制参数。
     */
    public PornConfigureInfoForUpdate getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set 令人反感的信息的控制参数。
     * @param PornConfigure 令人反感的信息的控制参数。
     */
    public void setPornConfigure(PornConfigureInfoForUpdate PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get 令人不安全的信息的控制参数。 
     * @return TerrorismConfigure 令人不安全的信息的控制参数。
     */
    public TerrorismConfigureInfoForUpdate getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set 令人不安全的信息的控制参数。
     * @param TerrorismConfigure 令人不安全的信息的控制参数。
     */
    public void setTerrorismConfigure(TerrorismConfigureInfoForUpdate TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get 令人不适宜的控制参数。 
     * @return PoliticalConfigure 令人不适宜的控制参数。
     */
    public PoliticalConfigureInfoForUpdate getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set 令人不适宜的控制参数。
     * @param PoliticalConfigure 令人不适宜的控制参数。
     */
    public void setPoliticalConfigure(PoliticalConfigureInfoForUpdate PoliticalConfigure) {
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
    public ProhibitedConfigureInfoForUpdate getProhibitedConfigure() {
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
    public void setProhibitedConfigure(ProhibitedConfigureInfoForUpdate ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get 用户自定义内容审核控制参数。 
     * @return UserDefineConfigure 用户自定义内容审核控制参数。
     */
    public UserDefineConfigureInfoForUpdate getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set 用户自定义内容审核控制参数。
     * @param UserDefineConfigure 用户自定义内容审核控制参数。
     */
    public void setUserDefineConfigure(UserDefineConfigureInfoForUpdate UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    public ModifyContentReviewTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyContentReviewTemplateRequest(ModifyContentReviewTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PornConfigure != null) {
            this.PornConfigure = new PornConfigureInfoForUpdate(source.PornConfigure);
        }
        if (source.TerrorismConfigure != null) {
            this.TerrorismConfigure = new TerrorismConfigureInfoForUpdate(source.TerrorismConfigure);
        }
        if (source.PoliticalConfigure != null) {
            this.PoliticalConfigure = new PoliticalConfigureInfoForUpdate(source.PoliticalConfigure);
        }
        if (source.ProhibitedConfigure != null) {
            this.ProhibitedConfigure = new ProhibitedConfigureInfoForUpdate(source.ProhibitedConfigure);
        }
        if (source.UserDefineConfigure != null) {
            this.UserDefineConfigure = new UserDefineConfigureInfoForUpdate(source.UserDefineConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "PornConfigure.", this.PornConfigure);
        this.setParamObj(map, prefix + "TerrorismConfigure.", this.TerrorismConfigure);
        this.setParamObj(map, prefix + "PoliticalConfigure.", this.PoliticalConfigure);
        this.setParamObj(map, prefix + "ProhibitedConfigure.", this.ProhibitedConfigure);
        this.setParamObj(map, prefix + "UserDefineConfigure.", this.UserDefineConfigure);

    }
}

