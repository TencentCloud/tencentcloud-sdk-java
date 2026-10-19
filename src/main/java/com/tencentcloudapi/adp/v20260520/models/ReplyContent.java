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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplyContent extends AbstractModel {

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
    * <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionCardList")
    @Expose
    private String [] OptionCardList;

    /**
    * <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileCollection")
    @Expose
    private ConversationFileCollection FileCollection;

    /**
    * <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Widget")
    @Expose
    private ConversationWidget Widget;

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
     * Get <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionCardList <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOptionCardList() {
        return this.OptionCardList;
    }

    /**
     * Set <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionCardList <p>选项卡信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionCardList(String [] OptionCardList) {
        this.OptionCardList = OptionCardList;
    }

    /**
     * Get <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileCollection <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConversationFileCollection getFileCollection() {
        return this.FileCollection;
    }

    /**
     * Set <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileCollection <p>文件收集信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileCollection(ConversationFileCollection FileCollection) {
        this.FileCollection = FileCollection;
    }

    /**
     * Get <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Widget <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConversationWidget getWidget() {
        return this.Widget;
    }

    /**
     * Set <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Widget <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidget(ConversationWidget Widget) {
        this.Widget = Widget;
    }

    public ReplyContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplyContent(ReplyContent source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.OptionCardList != null) {
            this.OptionCardList = new String[source.OptionCardList.length];
            for (int i = 0; i < source.OptionCardList.length; i++) {
                this.OptionCardList[i] = new String(source.OptionCardList[i]);
            }
        }
        if (source.FileCollection != null) {
            this.FileCollection = new ConversationFileCollection(source.FileCollection);
        }
        if (source.Widget != null) {
            this.Widget = new ConversationWidget(source.Widget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArraySimple(map, prefix + "OptionCardList.", this.OptionCardList);
        this.setParamObj(map, prefix + "FileCollection.", this.FileCollection);
        this.setParamObj(map, prefix + "Widget.", this.Widget);

    }
}

