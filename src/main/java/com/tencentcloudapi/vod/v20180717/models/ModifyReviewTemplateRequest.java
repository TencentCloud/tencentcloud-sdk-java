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

public class ModifyReviewTemplateRequest extends AbstractModel{

    /**
    * 审核模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 审核模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 审核模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 需要返回的违规标签列表，可选值为：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Ad：广告；</li>
<li>Moan：娇喘。</li>

注意：不填表示不更新。
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
     * Get 审核模板唯一标识。 
     * @return Definition 审核模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 审核模板唯一标识。
     * @param Definition 审核模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b> 
     * @return SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     * @param SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 审核模板名称，长度限制：64 个字符。 
     * @return Name 审核模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 审核模板名称，长度限制：64 个字符。
     * @param Name 审核模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 审核模板描述信息，长度限制：256 个字符。 
     * @return Comment 审核模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 审核模板描述信息，长度限制：256 个字符。
     * @param Comment 审核模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 需要返回的违规标签列表，可选值为：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Ad：广告；</li>
<li>Moan：娇喘。</li>

注意：不填表示不更新。 
     * @return Labels 需要返回的违规标签列表，可选值为：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Ad：广告；</li>
<li>Moan：娇喘。</li>

注意：不填表示不更新。
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 需要返回的违规标签列表，可选值为：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Ad：广告；</li>
<li>Moan：娇喘。</li>

注意：不填表示不更新。
     * @param Labels 需要返回的违规标签列表，可选值为：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Ad：广告；</li>
<li>Moan：娇喘。</li>

注意：不填表示不更新。
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    public ModifyReviewTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReviewTemplateRequest(ModifyReviewTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);

    }
}

