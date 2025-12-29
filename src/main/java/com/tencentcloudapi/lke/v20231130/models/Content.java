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

public class Content extends AbstractModel {

    /**
    * 消息内容类型
text：文本
image：图片
file：文件
option_cards：选项卡
custom_params：用户自定义业务参数
sandbox：云桌面
custom_variables：自定义输入参数
web_search: 网页搜索内容
file_collection：文件收集信息
widget：widget信息
widget_action：用户端widget动作信息
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 文本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 引用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuoteInfos")
    @Expose
    private QuoteInfo [] QuoteInfos;

    /**
    * 参考文献信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("References")
    @Expose
    private ContentReference [] References;

    /**
    * 图片信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private ImageInfoContent Image;

    /**
    * 文件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("File")
    @Expose
    private FileInfoContent File;

    /**
    * 选项卡信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * 用户自定义业务参数信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomParams")
    @Expose
    private String [] CustomParams;

    /**
    * 自定义变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomVariables")
    @Expose
    private String [] CustomVariables;

    /**
    * 沙盒信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sandbox")
    @Expose
    private SandboxContent Sandbox;

    /**
    * 网页搜索内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSearch")
    @Expose
    private WebSearchContent WebSearch;

    /**
    * 文件收集信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileCollection")
    @Expose
    private FileCollection FileCollection;

    /**
    * Widget信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Widget")
    @Expose
    private Widget Widget;

    /**
    * Widget动作信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WidgetAction")
    @Expose
    private WidgetAction WidgetAction;

    /**
     * Get 消息内容类型
text：文本
image：图片
file：文件
option_cards：选项卡
custom_params：用户自定义业务参数
sandbox：云桌面
custom_variables：自定义输入参数
web_search: 网页搜索内容
file_collection：文件收集信息
widget：widget信息
widget_action：用户端widget动作信息 
     * @return Type 消息内容类型
text：文本
image：图片
file：文件
option_cards：选项卡
custom_params：用户自定义业务参数
sandbox：云桌面
custom_variables：自定义输入参数
web_search: 网页搜索内容
file_collection：文件收集信息
widget：widget信息
widget_action：用户端widget动作信息
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 消息内容类型
text：文本
image：图片
file：文件
option_cards：选项卡
custom_params：用户自定义业务参数
sandbox：云桌面
custom_variables：自定义输入参数
web_search: 网页搜索内容
file_collection：文件收集信息
widget：widget信息
widget_action：用户端widget动作信息
     * @param Type 消息内容类型
text：文本
image：图片
file：文件
option_cards：选项卡
custom_params：用户自定义业务参数
sandbox：云桌面
custom_variables：自定义输入参数
web_search: 网页搜索内容
file_collection：文件收集信息
widget：widget信息
widget_action：用户端widget动作信息
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 文本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 引用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuoteInfos 引用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set 引用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuoteInfos 引用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuoteInfos(QuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get 参考文献信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return References 参考文献信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContentReference [] getReferences() {
        return this.References;
    }

    /**
     * Set 参考文献信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param References 参考文献信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferences(ContentReference [] References) {
        this.References = References;
    }

    /**
     * Get 图片信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 图片信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfoContent getImage() {
        return this.Image;
    }

    /**
     * Set 图片信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 图片信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(ImageInfoContent Image) {
        this.Image = Image;
    }

    /**
     * Get 文件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return File 文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfoContent getFile() {
        return this.File;
    }

    /**
     * Set 文件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param File 文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFile(FileInfoContent File) {
        this.File = File;
    }

    /**
     * Get 选项卡信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionCards 选项卡信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set 选项卡信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionCards 选项卡信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get 用户自定义业务参数信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomParams 用户自定义业务参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomParams() {
        return this.CustomParams;
    }

    /**
     * Set 用户自定义业务参数信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomParams 用户自定义业务参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomParams(String [] CustomParams) {
        this.CustomParams = CustomParams;
    }

    /**
     * Get 自定义变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomVariables 自定义变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set 自定义变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomVariables 自定义变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomVariables(String [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get 沙盒信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sandbox 沙盒信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SandboxContent getSandbox() {
        return this.Sandbox;
    }

    /**
     * Set 沙盒信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sandbox 沙盒信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSandbox(SandboxContent Sandbox) {
        this.Sandbox = Sandbox;
    }

    /**
     * Get 网页搜索内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSearch 网页搜索内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebSearchContent getWebSearch() {
        return this.WebSearch;
    }

    /**
     * Set 网页搜索内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSearch 网页搜索内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSearch(WebSearchContent WebSearch) {
        this.WebSearch = WebSearch;
    }

    /**
     * Get 文件收集信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileCollection 文件收集信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileCollection getFileCollection() {
        return this.FileCollection;
    }

    /**
     * Set 文件收集信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileCollection 文件收集信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileCollection(FileCollection FileCollection) {
        this.FileCollection = FileCollection;
    }

    /**
     * Get Widget信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Widget Widget信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Widget getWidget() {
        return this.Widget;
    }

    /**
     * Set Widget信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Widget Widget信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidget(Widget Widget) {
        this.Widget = Widget;
    }

    /**
     * Get Widget动作信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WidgetAction Widget动作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WidgetAction getWidgetAction() {
        return this.WidgetAction;
    }

    /**
     * Set Widget动作信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WidgetAction Widget动作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidgetAction(WidgetAction WidgetAction) {
        this.WidgetAction = WidgetAction;
    }

    public Content() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Content(Content source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.QuoteInfos != null) {
            this.QuoteInfos = new QuoteInfo[source.QuoteInfos.length];
            for (int i = 0; i < source.QuoteInfos.length; i++) {
                this.QuoteInfos[i] = new QuoteInfo(source.QuoteInfos[i]);
            }
        }
        if (source.References != null) {
            this.References = new ContentReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new ContentReference(source.References[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new ImageInfoContent(source.Image);
        }
        if (source.File != null) {
            this.File = new FileInfoContent(source.File);
        }
        if (source.OptionCards != null) {
            this.OptionCards = new String[source.OptionCards.length];
            for (int i = 0; i < source.OptionCards.length; i++) {
                this.OptionCards[i] = new String(source.OptionCards[i]);
            }
        }
        if (source.CustomParams != null) {
            this.CustomParams = new String[source.CustomParams.length];
            for (int i = 0; i < source.CustomParams.length; i++) {
                this.CustomParams[i] = new String(source.CustomParams[i]);
            }
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new String[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new String(source.CustomVariables[i]);
            }
        }
        if (source.Sandbox != null) {
            this.Sandbox = new SandboxContent(source.Sandbox);
        }
        if (source.WebSearch != null) {
            this.WebSearch = new WebSearchContent(source.WebSearch);
        }
        if (source.FileCollection != null) {
            this.FileCollection = new FileCollection(source.FileCollection);
        }
        if (source.Widget != null) {
            this.Widget = new Widget(source.Widget);
        }
        if (source.WidgetAction != null) {
            this.WidgetAction = new WidgetAction(source.WidgetAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "QuoteInfos.", this.QuoteInfos);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "File.", this.File);
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamArraySimple(map, prefix + "CustomParams.", this.CustomParams);
        this.setParamArraySimple(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamObj(map, prefix + "Sandbox.", this.Sandbox);
        this.setParamObj(map, prefix + "WebSearch.", this.WebSearch);
        this.setParamObj(map, prefix + "FileCollection.", this.FileCollection);
        this.setParamObj(map, prefix + "Widget.", this.Widget);
        this.setParamObj(map, prefix + "WidgetAction.", this.WidgetAction);

    }
}

