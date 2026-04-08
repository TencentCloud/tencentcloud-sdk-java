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
    * <p>消息内容类型<br>text：文本<br>image：图片<br>file：文件<br>option_cards：选项卡<br>custom_params：用户自定义业务参数<br>sandbox：云桌面<br>custom_variables：自定义输入参数<br>web_search: 网页搜索内容<br>file_collection：文件收集信息<br>widget：widget信息<br>widget_action：用户端widget动作信息</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>引用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuoteInfos")
    @Expose
    private QuoteInfo [] QuoteInfos;

    /**
    * <p>参考文献信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("References")
    @Expose
    private ContentReference [] References;

    /**
    * <p>图片信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private ImageInfoContent Image;

    /**
    * <p>文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("File")
    @Expose
    private FileInfoContent File;

    /**
    * <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * <p>用户自定义业务参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomParams")
    @Expose
    private String [] CustomParams;

    /**
    * <p>自定义变量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomVariables")
    @Expose
    private String [] CustomVariables;

    /**
    * <p>沙盒信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sandbox")
    @Expose
    private SandboxContent Sandbox;

    /**
    * <p>网页搜索内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSearch")
    @Expose
    private WebSearchContent WebSearch;

    /**
    * <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileCollection")
    @Expose
    private FileCollection FileCollection;

    /**
    * <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Widget")
    @Expose
    private Widget Widget;

    /**
    * <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WidgetAction")
    @Expose
    private WidgetAction WidgetAction;

    /**
    * <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private AgentTask [] Tasks;

    /**
    * <p>问卷信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Questionnaire")
    @Expose
    private Questionnaire Questionnaire;

    /**
    * <p>选项卡模式</p>
    */
    @SerializedName("OptionMode")
    @Expose
    private Long OptionMode;

    /**
     * Get <p>消息内容类型<br>text：文本<br>image：图片<br>file：文件<br>option_cards：选项卡<br>custom_params：用户自定义业务参数<br>sandbox：云桌面<br>custom_variables：自定义输入参数<br>web_search: 网页搜索内容<br>file_collection：文件收集信息<br>widget：widget信息<br>widget_action：用户端widget动作信息</p> 
     * @return Type <p>消息内容类型<br>text：文本<br>image：图片<br>file：文件<br>option_cards：选项卡<br>custom_params：用户自定义业务参数<br>sandbox：云桌面<br>custom_variables：自定义输入参数<br>web_search: 网页搜索内容<br>file_collection：文件收集信息<br>widget：widget信息<br>widget_action：用户端widget动作信息</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>消息内容类型<br>text：文本<br>image：图片<br>file：文件<br>option_cards：选项卡<br>custom_params：用户自定义业务参数<br>sandbox：云桌面<br>custom_variables：自定义输入参数<br>web_search: 网页搜索内容<br>file_collection：文件收集信息<br>widget：widget信息<br>widget_action：用户端widget动作信息</p>
     * @param Type <p>消息内容类型<br>text：文本<br>image：图片<br>file：文件<br>option_cards：选项卡<br>custom_params：用户自定义业务参数<br>sandbox：云桌面<br>custom_variables：自定义输入参数<br>web_search: 网页搜索内容<br>file_collection：文件收集信息<br>widget：widget信息<br>widget_action：用户端widget动作信息</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text <p>文本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>引用信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuoteInfos <p>引用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set <p>引用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuoteInfos <p>引用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuoteInfos(QuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get <p>参考文献信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return References <p>参考文献信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContentReference [] getReferences() {
        return this.References;
    }

    /**
     * Set <p>参考文献信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param References <p>参考文献信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferences(ContentReference [] References) {
        this.References = References;
    }

    /**
     * Get <p>图片信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image <p>图片信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfoContent getImage() {
        return this.Image;
    }

    /**
     * Set <p>图片信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image <p>图片信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(ImageInfoContent Image) {
        this.Image = Image;
    }

    /**
     * Get <p>文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return File <p>文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfoContent getFile() {
        return this.File;
    }

    /**
     * Set <p>文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param File <p>文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFile(FileInfoContent File) {
        this.File = File;
    }

    /**
     * Get <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionCards <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionCards <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get <p>用户自定义业务参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomParams <p>用户自定义业务参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomParams() {
        return this.CustomParams;
    }

    /**
     * Set <p>用户自定义业务参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomParams <p>用户自定义业务参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomParams(String [] CustomParams) {
        this.CustomParams = CustomParams;
    }

    /**
     * Get <p>自定义变量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomVariables <p>自定义变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set <p>自定义变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomVariables <p>自定义变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomVariables(String [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get <p>沙盒信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sandbox <p>沙盒信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SandboxContent getSandbox() {
        return this.Sandbox;
    }

    /**
     * Set <p>沙盒信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sandbox <p>沙盒信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSandbox(SandboxContent Sandbox) {
        this.Sandbox = Sandbox;
    }

    /**
     * Get <p>网页搜索内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSearch <p>网页搜索内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebSearchContent getWebSearch() {
        return this.WebSearch;
    }

    /**
     * Set <p>网页搜索内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSearch <p>网页搜索内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSearch(WebSearchContent WebSearch) {
        this.WebSearch = WebSearch;
    }

    /**
     * Get <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileCollection <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileCollection getFileCollection() {
        return this.FileCollection;
    }

    /**
     * Set <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileCollection <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileCollection(FileCollection FileCollection) {
        this.FileCollection = FileCollection;
    }

    /**
     * Get <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Widget <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Widget getWidget() {
        return this.Widget;
    }

    /**
     * Set <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Widget <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidget(Widget Widget) {
        this.Widget = Widget;
    }

    /**
     * Get <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WidgetAction <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WidgetAction getWidgetAction() {
        return this.WidgetAction;
    }

    /**
     * Set <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WidgetAction <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidgetAction(WidgetAction WidgetAction) {
        this.WidgetAction = WidgetAction;
    }

    /**
     * Get <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks <p>任务列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(AgentTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>问卷信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Questionnaire <p>问卷信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Questionnaire getQuestionnaire() {
        return this.Questionnaire;
    }

    /**
     * Set <p>问卷信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Questionnaire <p>问卷信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestionnaire(Questionnaire Questionnaire) {
        this.Questionnaire = Questionnaire;
    }

    /**
     * Get <p>选项卡模式</p> 
     * @return OptionMode <p>选项卡模式</p>
     */
    public Long getOptionMode() {
        return this.OptionMode;
    }

    /**
     * Set <p>选项卡模式</p>
     * @param OptionMode <p>选项卡模式</p>
     */
    public void setOptionMode(Long OptionMode) {
        this.OptionMode = OptionMode;
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
        if (source.Tasks != null) {
            this.Tasks = new AgentTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new AgentTask(source.Tasks[i]);
            }
        }
        if (source.Questionnaire != null) {
            this.Questionnaire = new Questionnaire(source.Questionnaire);
        }
        if (source.OptionMode != null) {
            this.OptionMode = new Long(source.OptionMode);
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
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamObj(map, prefix + "Questionnaire.", this.Questionnaire);
        this.setParamSimple(map, prefix + "OptionMode", this.OptionMode);

    }
}

