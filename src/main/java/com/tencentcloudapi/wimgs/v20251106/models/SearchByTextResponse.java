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
package com.tencentcloudapi.wimgs.v20251106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchByTextResponse extends AbstractModel {

    /**
    * <p>原始查询词</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>搜索结果图片列表，格式为json字符串。</p><ul><li>thumbnailUrl：缩略图地址。</li><li>thumbnailWidth：缩略图宽度。</li><li>thumbnailHeight：缩略图高度。</li><li>origPicUrl：原图地址。</li><li>origPicWidth：原图宽度。</li><li>origPicHeight：原图高度。</li><li>siteUrl：站点地址，原图来源网页URL。</li><li>siteName：站点名称。</li><li>title：标题，原图标题或原图来源网页标题。</li><li>date：内容发布时间。</li></ul>
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>原始查询词</p> 
     * @return Query <p>原始查询词</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>原始查询词</p>
     * @param Query <p>原始查询词</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>搜索结果图片列表，格式为json字符串。</p><ul><li>thumbnailUrl：缩略图地址。</li><li>thumbnailWidth：缩略图宽度。</li><li>thumbnailHeight：缩略图高度。</li><li>origPicUrl：原图地址。</li><li>origPicWidth：原图宽度。</li><li>origPicHeight：原图高度。</li><li>siteUrl：站点地址，原图来源网页URL。</li><li>siteName：站点名称。</li><li>title：标题，原图标题或原图来源网页标题。</li><li>date：内容发布时间。</li></ul> 
     * @return Images <p>搜索结果图片列表，格式为json字符串。</p><ul><li>thumbnailUrl：缩略图地址。</li><li>thumbnailWidth：缩略图宽度。</li><li>thumbnailHeight：缩略图高度。</li><li>origPicUrl：原图地址。</li><li>origPicWidth：原图宽度。</li><li>origPicHeight：原图高度。</li><li>siteUrl：站点地址，原图来源网页URL。</li><li>siteName：站点名称。</li><li>title：标题，原图标题或原图来源网页标题。</li><li>date：内容发布时间。</li></ul>
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>搜索结果图片列表，格式为json字符串。</p><ul><li>thumbnailUrl：缩略图地址。</li><li>thumbnailWidth：缩略图宽度。</li><li>thumbnailHeight：缩略图高度。</li><li>origPicUrl：原图地址。</li><li>origPicWidth：原图宽度。</li><li>origPicHeight：原图高度。</li><li>siteUrl：站点地址，原图来源网页URL。</li><li>siteName：站点名称。</li><li>title：标题，原图标题或原图来源网页标题。</li><li>date：内容发布时间。</li></ul>
     * @param Images <p>搜索结果图片列表，格式为json字符串。</p><ul><li>thumbnailUrl：缩略图地址。</li><li>thumbnailWidth：缩略图宽度。</li><li>thumbnailHeight：缩略图高度。</li><li>origPicUrl：原图地址。</li><li>origPicWidth：原图宽度。</li><li>origPicHeight：原图高度。</li><li>siteUrl：站点地址，原图来源网页URL。</li><li>siteName：站点名称。</li><li>title：标题，原图标题或原图来源网页标题。</li><li>date：内容发布时间。</li></ul>
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SearchByTextResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchByTextResponse(SearchByTextResponse source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

