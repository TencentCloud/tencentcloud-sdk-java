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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiModalContent extends AbstractModel {

    /**
    * 对话类型，text表示文本对话内容，image_url表示图片对话内容
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 文本对话内容，当Type为text时需要填写该值
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 图片对话内容，当Type为image_url时需要填写该值
    */
    @SerializedName("ImageUrl")
    @Expose
    private ImageUrl ImageUrl;

    /**
     * Get 对话类型，text表示文本对话内容，image_url表示图片对话内容 
     * @return Type 对话类型，text表示文本对话内容，image_url表示图片对话内容
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 对话类型，text表示文本对话内容，image_url表示图片对话内容
     * @param Type 对话类型，text表示文本对话内容，image_url表示图片对话内容
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 文本对话内容，当Type为text时需要填写该值 
     * @return Text 文本对话内容，当Type为text时需要填写该值
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文本对话内容，当Type为text时需要填写该值
     * @param Text 文本对话内容，当Type为text时需要填写该值
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 图片对话内容，当Type为image_url时需要填写该值 
     * @return ImageUrl 图片对话内容，当Type为image_url时需要填写该值
     */
    public ImageUrl getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片对话内容，当Type为image_url时需要填写该值
     * @param ImageUrl 图片对话内容，当Type为image_url时需要填写该值
     */
    public void setImageUrl(ImageUrl ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public MultiModalContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiModalContent(MultiModalContent source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new ImageUrl(source.ImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "ImageUrl.", this.ImageUrl);

    }
}

