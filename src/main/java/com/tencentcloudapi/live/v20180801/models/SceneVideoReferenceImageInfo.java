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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneVideoReferenceImageInfo extends AbstractModel {

    /**
    * <p>输入的参考图Url，需外网可访问。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>针对该参考图的Prompt描述，仅部分模型是支持。</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>参考类型。</p>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
     * Get <p>输入的参考图Url，需外网可访问。</p> 
     * @return ImageUrl <p>输入的参考图Url，需外网可访问。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>输入的参考图Url，需外网可访问。</p>
     * @param ImageUrl <p>输入的参考图Url，需外网可访问。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>针对该参考图的Prompt描述，仅部分模型是支持。</p> 
     * @return Text <p>针对该参考图的Prompt描述，仅部分模型是支持。</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>针对该参考图的Prompt描述，仅部分模型是支持。</p>
     * @param Text <p>针对该参考图的Prompt描述，仅部分模型是支持。</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>参考类型。</p> 
     * @return ReferenceType <p>参考类型。</p>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>参考类型。</p>
     * @param ReferenceType <p>参考类型。</p>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    public SceneVideoReferenceImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneVideoReferenceImageInfo(SceneVideoReferenceImageInfo source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);

    }
}

