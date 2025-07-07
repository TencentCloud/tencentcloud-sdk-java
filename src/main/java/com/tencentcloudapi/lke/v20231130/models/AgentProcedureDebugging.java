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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentProcedureDebugging extends AbstractModel {

    /**
    * 模型思考内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 展示的具体文本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayContent")
    @Expose
    private String DisplayContent;

    /**
    * 展示类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayType")
    @Expose
    private Long DisplayType;

    /**
    * 搜索引擎展示的索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuoteInfos")
    @Expose
    private QuoteInfo [] QuoteInfos;

    /**
    * 具体的参考来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("References")
    @Expose
    private AgentReference [] References;

    /**
    * 展示正在执行的状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayStatus")
    @Expose
    private String DisplayStatus;

    /**
    * 云桌面的URL地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SandboxUrl")
    @Expose
    private String SandboxUrl;

    /**
    * 云桌面里面通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayUrl")
    @Expose
    private String DisplayUrl;

    /**
     * Get 模型思考内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 模型思考内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 模型思考内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 模型思考内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 展示的具体文本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayContent 展示的具体文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayContent() {
        return this.DisplayContent;
    }

    /**
     * Set 展示的具体文本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayContent 展示的具体文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayContent(String DisplayContent) {
        this.DisplayContent = DisplayContent;
    }

    /**
     * Get 展示类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayType 展示类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDisplayType() {
        return this.DisplayType;
    }

    /**
     * Set 展示类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayType 展示类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayType(Long DisplayType) {
        this.DisplayType = DisplayType;
    }

    /**
     * Get 搜索引擎展示的索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuoteInfos 搜索引擎展示的索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set 搜索引擎展示的索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuoteInfos 搜索引擎展示的索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuoteInfos(QuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get 具体的参考来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return References 具体的参考来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentReference [] getReferences() {
        return this.References;
    }

    /**
     * Set 具体的参考来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param References 具体的参考来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferences(AgentReference [] References) {
        this.References = References;
    }

    /**
     * Get 展示正在执行的状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayStatus 展示正在执行的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayStatus() {
        return this.DisplayStatus;
    }

    /**
     * Set 展示正在执行的状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayStatus 展示正在执行的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayStatus(String DisplayStatus) {
        this.DisplayStatus = DisplayStatus;
    }

    /**
     * Get 云桌面的URL地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SandboxUrl 云桌面的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSandboxUrl() {
        return this.SandboxUrl;
    }

    /**
     * Set 云桌面的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param SandboxUrl 云桌面的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSandboxUrl(String SandboxUrl) {
        this.SandboxUrl = SandboxUrl;
    }

    /**
     * Get 云桌面里面通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayUrl 云桌面里面通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayUrl() {
        return this.DisplayUrl;
    }

    /**
     * Set 云桌面里面通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayUrl 云桌面里面通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayUrl(String DisplayUrl) {
        this.DisplayUrl = DisplayUrl;
    }

    public AgentProcedureDebugging() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentProcedureDebugging(AgentProcedureDebugging source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.DisplayContent != null) {
            this.DisplayContent = new String(source.DisplayContent);
        }
        if (source.DisplayType != null) {
            this.DisplayType = new Long(source.DisplayType);
        }
        if (source.QuoteInfos != null) {
            this.QuoteInfos = new QuoteInfo[source.QuoteInfos.length];
            for (int i = 0; i < source.QuoteInfos.length; i++) {
                this.QuoteInfos[i] = new QuoteInfo(source.QuoteInfos[i]);
            }
        }
        if (source.References != null) {
            this.References = new AgentReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new AgentReference(source.References[i]);
            }
        }
        if (source.DisplayStatus != null) {
            this.DisplayStatus = new String(source.DisplayStatus);
        }
        if (source.SandboxUrl != null) {
            this.SandboxUrl = new String(source.SandboxUrl);
        }
        if (source.DisplayUrl != null) {
            this.DisplayUrl = new String(source.DisplayUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "DisplayContent", this.DisplayContent);
        this.setParamSimple(map, prefix + "DisplayType", this.DisplayType);
        this.setParamArrayObj(map, prefix + "QuoteInfos.", this.QuoteInfos);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "DisplayStatus", this.DisplayStatus);
        this.setParamSimple(map, prefix + "SandboxUrl", this.SandboxUrl);
        this.setParamSimple(map, prefix + "DisplayUrl", this.DisplayUrl);

    }
}

