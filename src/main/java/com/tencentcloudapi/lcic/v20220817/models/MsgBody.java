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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsgBody extends AbstractModel {

    /**
    * TIM 消息对象类型，目前支持的消息对象包括：
TIMTextElem（文本消息）
TIMFaceElem（表情消息）
TIMImageElem（图像消息）
TIMCustomElem（自定义消息）
    */
    @SerializedName("MsgType")
    @Expose
    private String MsgType;

    /**
    * 文本消息，当MsgType 为TIMTextElem（文本消息）必选。
    */
    @SerializedName("TextMsgContent")
    @Expose
    private TextMsgContent TextMsgContent;

    /**
    * 表情消息，当MsgType 为TIMFaceElem（表情消息）必选。
    */
    @SerializedName("FaceMsgContent")
    @Expose
    private FaceMsgContent FaceMsgContent;

    /**
    * 图像消息，当MsgType为TIMImageElem（图像消息）必选。
    */
    @SerializedName("ImageMsgContent")
    @Expose
    private ImageMsgContent ImageMsgContent;

    /**
    * 自定义消息，TIMCustomElem（自定义消息）必选。
    */
    @SerializedName("CustomMsgContent")
    @Expose
    private CustomMsgContent CustomMsgContent;

    /**
     * Get TIM 消息对象类型，目前支持的消息对象包括：
TIMTextElem（文本消息）
TIMFaceElem（表情消息）
TIMImageElem（图像消息）
TIMCustomElem（自定义消息） 
     * @return MsgType TIM 消息对象类型，目前支持的消息对象包括：
TIMTextElem（文本消息）
TIMFaceElem（表情消息）
TIMImageElem（图像消息）
TIMCustomElem（自定义消息）
     */
    public String getMsgType() {
        return this.MsgType;
    }

    /**
     * Set TIM 消息对象类型，目前支持的消息对象包括：
TIMTextElem（文本消息）
TIMFaceElem（表情消息）
TIMImageElem（图像消息）
TIMCustomElem（自定义消息）
     * @param MsgType TIM 消息对象类型，目前支持的消息对象包括：
TIMTextElem（文本消息）
TIMFaceElem（表情消息）
TIMImageElem（图像消息）
TIMCustomElem（自定义消息）
     */
    public void setMsgType(String MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get 文本消息，当MsgType 为TIMTextElem（文本消息）必选。 
     * @return TextMsgContent 文本消息，当MsgType 为TIMTextElem（文本消息）必选。
     */
    public TextMsgContent getTextMsgContent() {
        return this.TextMsgContent;
    }

    /**
     * Set 文本消息，当MsgType 为TIMTextElem（文本消息）必选。
     * @param TextMsgContent 文本消息，当MsgType 为TIMTextElem（文本消息）必选。
     */
    public void setTextMsgContent(TextMsgContent TextMsgContent) {
        this.TextMsgContent = TextMsgContent;
    }

    /**
     * Get 表情消息，当MsgType 为TIMFaceElem（表情消息）必选。 
     * @return FaceMsgContent 表情消息，当MsgType 为TIMFaceElem（表情消息）必选。
     */
    public FaceMsgContent getFaceMsgContent() {
        return this.FaceMsgContent;
    }

    /**
     * Set 表情消息，当MsgType 为TIMFaceElem（表情消息）必选。
     * @param FaceMsgContent 表情消息，当MsgType 为TIMFaceElem（表情消息）必选。
     */
    public void setFaceMsgContent(FaceMsgContent FaceMsgContent) {
        this.FaceMsgContent = FaceMsgContent;
    }

    /**
     * Get 图像消息，当MsgType为TIMImageElem（图像消息）必选。 
     * @return ImageMsgContent 图像消息，当MsgType为TIMImageElem（图像消息）必选。
     */
    public ImageMsgContent getImageMsgContent() {
        return this.ImageMsgContent;
    }

    /**
     * Set 图像消息，当MsgType为TIMImageElem（图像消息）必选。
     * @param ImageMsgContent 图像消息，当MsgType为TIMImageElem（图像消息）必选。
     */
    public void setImageMsgContent(ImageMsgContent ImageMsgContent) {
        this.ImageMsgContent = ImageMsgContent;
    }

    /**
     * Get 自定义消息，TIMCustomElem（自定义消息）必选。 
     * @return CustomMsgContent 自定义消息，TIMCustomElem（自定义消息）必选。
     */
    public CustomMsgContent getCustomMsgContent() {
        return this.CustomMsgContent;
    }

    /**
     * Set 自定义消息，TIMCustomElem（自定义消息）必选。
     * @param CustomMsgContent 自定义消息，TIMCustomElem（自定义消息）必选。
     */
    public void setCustomMsgContent(CustomMsgContent CustomMsgContent) {
        this.CustomMsgContent = CustomMsgContent;
    }

    public MsgBody() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgBody(MsgBody source) {
        if (source.MsgType != null) {
            this.MsgType = new String(source.MsgType);
        }
        if (source.TextMsgContent != null) {
            this.TextMsgContent = new TextMsgContent(source.TextMsgContent);
        }
        if (source.FaceMsgContent != null) {
            this.FaceMsgContent = new FaceMsgContent(source.FaceMsgContent);
        }
        if (source.ImageMsgContent != null) {
            this.ImageMsgContent = new ImageMsgContent(source.ImageMsgContent);
        }
        if (source.CustomMsgContent != null) {
            this.CustomMsgContent = new CustomMsgContent(source.CustomMsgContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamObj(map, prefix + "TextMsgContent.", this.TextMsgContent);
        this.setParamObj(map, prefix + "FaceMsgContent.", this.FaceMsgContent);
        this.setParamObj(map, prefix + "ImageMsgContent.", this.ImageMsgContent);
        this.setParamObj(map, prefix + "CustomMsgContent.", this.CustomMsgContent);

    }
}

