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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateVLEmbeddingRequest extends AbstractModel {

    /**
    * <p>选择生成向量的模型。取值：</p><ul><li>0：vl-embedding-4b</li><li>1：vl-embedding-8b</li><li>2：vl-embedding-2b</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>内容类型标识。取值：</p><ul><li>1：文本</li><li>2：图像 URL</li><li>3：视频 URL</li><li>4：图文混合</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>文本内容。仅当 Type 为 1 或 4 时必填，单条文本不超过 2000 字符。</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>图像地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 2 或 4 时必填。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>视频地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 3 时必填。</p>
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * <p>检索场景，未传入该参数时将自动匹配。取值：</p><ul><li>0：自动匹配</li><li>1：图搜图（找同款、相似图），仅 Type 为 2 或 4 时可用</li><li>2：图文搜图（图 + 问题），仅 Type 为 4 时可用</li><li>3：文搜图（纯文本搜图），仅 Type 为 1 或 4 时可用</li><li>4：文搜视频（纯文本搜视频），仅 Type 为 1 或 4 时可用</li><li>5：图搜视频、图文搜视频，仅 Type 为 2 或 4 时可用</li></ul>
    */
    @SerializedName("SearchMode")
    @Expose
    private String SearchMode;

    /**
     * Get <p>选择生成向量的模型。取值：</p><ul><li>0：vl-embedding-4b</li><li>1：vl-embedding-8b</li><li>2：vl-embedding-2b</li></ul> 
     * @return Model <p>选择生成向量的模型。取值：</p><ul><li>0：vl-embedding-4b</li><li>1：vl-embedding-8b</li><li>2：vl-embedding-2b</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>选择生成向量的模型。取值：</p><ul><li>0：vl-embedding-4b</li><li>1：vl-embedding-8b</li><li>2：vl-embedding-2b</li></ul>
     * @param Model <p>选择生成向量的模型。取值：</p><ul><li>0：vl-embedding-4b</li><li>1：vl-embedding-8b</li><li>2：vl-embedding-2b</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>内容类型标识。取值：</p><ul><li>1：文本</li><li>2：图像 URL</li><li>3：视频 URL</li><li>4：图文混合</li></ul> 
     * @return Type <p>内容类型标识。取值：</p><ul><li>1：文本</li><li>2：图像 URL</li><li>3：视频 URL</li><li>4：图文混合</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>内容类型标识。取值：</p><ul><li>1：文本</li><li>2：图像 URL</li><li>3：视频 URL</li><li>4：图文混合</li></ul>
     * @param Type <p>内容类型标识。取值：</p><ul><li>1：文本</li><li>2：图像 URL</li><li>3：视频 URL</li><li>4：图文混合</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>文本内容。仅当 Type 为 1 或 4 时必填，单条文本不超过 2000 字符。</p> 
     * @return Text <p>文本内容。仅当 Type 为 1 或 4 时必填，单条文本不超过 2000 字符。</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>文本内容。仅当 Type 为 1 或 4 时必填，单条文本不超过 2000 字符。</p>
     * @param Text <p>文本内容。仅当 Type 为 1 或 4 时必填，单条文本不超过 2000 字符。</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>图像地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 2 或 4 时必填。</p> 
     * @return ImageUrl <p>图像地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 2 或 4 时必填。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图像地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 2 或 4 时必填。</p>
     * @param ImageUrl <p>图像地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 2 或 4 时必填。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>视频地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 3 时必填。</p> 
     * @return VideoUrl <p>视频地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 3 时必填。</p>
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set <p>视频地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 3 时必填。</p>
     * @param VideoUrl <p>视频地址，支持公网 http/https 链接或 base64 内容。仅当 Type 为 3 时必填。</p>
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get <p>检索场景，未传入该参数时将自动匹配。取值：</p><ul><li>0：自动匹配</li><li>1：图搜图（找同款、相似图），仅 Type 为 2 或 4 时可用</li><li>2：图文搜图（图 + 问题），仅 Type 为 4 时可用</li><li>3：文搜图（纯文本搜图），仅 Type 为 1 或 4 时可用</li><li>4：文搜视频（纯文本搜视频），仅 Type 为 1 或 4 时可用</li><li>5：图搜视频、图文搜视频，仅 Type 为 2 或 4 时可用</li></ul> 
     * @return SearchMode <p>检索场景，未传入该参数时将自动匹配。取值：</p><ul><li>0：自动匹配</li><li>1：图搜图（找同款、相似图），仅 Type 为 2 或 4 时可用</li><li>2：图文搜图（图 + 问题），仅 Type 为 4 时可用</li><li>3：文搜图（纯文本搜图），仅 Type 为 1 或 4 时可用</li><li>4：文搜视频（纯文本搜视频），仅 Type 为 1 或 4 时可用</li><li>5：图搜视频、图文搜视频，仅 Type 为 2 或 4 时可用</li></ul>
     */
    public String getSearchMode() {
        return this.SearchMode;
    }

    /**
     * Set <p>检索场景，未传入该参数时将自动匹配。取值：</p><ul><li>0：自动匹配</li><li>1：图搜图（找同款、相似图），仅 Type 为 2 或 4 时可用</li><li>2：图文搜图（图 + 问题），仅 Type 为 4 时可用</li><li>3：文搜图（纯文本搜图），仅 Type 为 1 或 4 时可用</li><li>4：文搜视频（纯文本搜视频），仅 Type 为 1 或 4 时可用</li><li>5：图搜视频、图文搜视频，仅 Type 为 2 或 4 时可用</li></ul>
     * @param SearchMode <p>检索场景，未传入该参数时将自动匹配。取值：</p><ul><li>0：自动匹配</li><li>1：图搜图（找同款、相似图），仅 Type 为 2 或 4 时可用</li><li>2：图文搜图（图 + 问题），仅 Type 为 4 时可用</li><li>3：文搜图（纯文本搜图），仅 Type 为 1 或 4 时可用</li><li>4：文搜视频（纯文本搜视频），仅 Type 为 1 或 4 时可用</li><li>5：图搜视频、图文搜视频，仅 Type 为 2 或 4 时可用</li></ul>
     */
    public void setSearchMode(String SearchMode) {
        this.SearchMode = SearchMode;
    }

    public GenerateVLEmbeddingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateVLEmbeddingRequest(GenerateVLEmbeddingRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.SearchMode != null) {
            this.SearchMode = new String(source.SearchMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "SearchMode", this.SearchMode);

    }
}

