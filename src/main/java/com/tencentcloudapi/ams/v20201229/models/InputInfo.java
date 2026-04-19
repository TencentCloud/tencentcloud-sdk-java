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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputInfo extends AbstractModel {

    /**
    * <p>该字段表示文件访问类型，取值为<strong>URL</strong>（资源链接）和<strong>COS</strong> (腾讯云对象存储)。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>该字段表示文件访问的链接地址，格式为标准URL格式。<br> 备注：当Type为URL时此字段不为空。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>该字段表示文件访问的腾讯云存储桶信息。<br> 备注：当Type为COS时此字段不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketInfo")
    @Expose
    private BucketInfo BucketInfo;

    /**
    * <p>大模型审核可选输入图片列表</p>
    */
    @SerializedName("ImageUrlList")
    @Expose
    private String [] ImageUrlList;

    /**
    * <p>大模型审核场景下，base64编码的审核要求内容</p>
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
     * Get <p>该字段表示文件访问类型，取值为<strong>URL</strong>（资源链接）和<strong>COS</strong> (腾讯云对象存储)。</p> 
     * @return Type <p>该字段表示文件访问类型，取值为<strong>URL</strong>（资源链接）和<strong>COS</strong> (腾讯云对象存储)。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>该字段表示文件访问类型，取值为<strong>URL</strong>（资源链接）和<strong>COS</strong> (腾讯云对象存储)。</p>
     * @param Type <p>该字段表示文件访问类型，取值为<strong>URL</strong>（资源链接）和<strong>COS</strong> (腾讯云对象存储)。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>该字段表示文件访问的链接地址，格式为标准URL格式。<br> 备注：当Type为URL时此字段不为空。</p> 
     * @return Url <p>该字段表示文件访问的链接地址，格式为标准URL格式。<br> 备注：当Type为URL时此字段不为空。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>该字段表示文件访问的链接地址，格式为标准URL格式。<br> 备注：当Type为URL时此字段不为空。</p>
     * @param Url <p>该字段表示文件访问的链接地址，格式为标准URL格式。<br> 备注：当Type为URL时此字段不为空。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>该字段表示文件访问的腾讯云存储桶信息。<br> 备注：当Type为COS时此字段不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketInfo <p>该字段表示文件访问的腾讯云存储桶信息。<br> 备注：当Type为COS时此字段不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BucketInfo getBucketInfo() {
        return this.BucketInfo;
    }

    /**
     * Set <p>该字段表示文件访问的腾讯云存储桶信息。<br> 备注：当Type为COS时此字段不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketInfo <p>该字段表示文件访问的腾讯云存储桶信息。<br> 备注：当Type为COS时此字段不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketInfo(BucketInfo BucketInfo) {
        this.BucketInfo = BucketInfo;
    }

    /**
     * Get <p>大模型审核可选输入图片列表</p> 
     * @return ImageUrlList <p>大模型审核可选输入图片列表</p>
     */
    public String [] getImageUrlList() {
        return this.ImageUrlList;
    }

    /**
     * Set <p>大模型审核可选输入图片列表</p>
     * @param ImageUrlList <p>大模型审核可选输入图片列表</p>
     */
    public void setImageUrlList(String [] ImageUrlList) {
        this.ImageUrlList = ImageUrlList;
    }

    /**
     * Get <p>大模型审核场景下，base64编码的审核要求内容</p> 
     * @return TextContent <p>大模型审核场景下，base64编码的审核要求内容</p>
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set <p>大模型审核场景下，base64编码的审核要求内容</p>
     * @param TextContent <p>大模型审核场景下，base64编码的审核要求内容</p>
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    public InputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputInfo(InputInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.BucketInfo != null) {
            this.BucketInfo = new BucketInfo(source.BucketInfo);
        }
        if (source.ImageUrlList != null) {
            this.ImageUrlList = new String[source.ImageUrlList.length];
            for (int i = 0; i < source.ImageUrlList.length; i++) {
                this.ImageUrlList[i] = new String(source.ImageUrlList[i]);
            }
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "BucketInfo.", this.BucketInfo);
        this.setParamArraySimple(map, prefix + "ImageUrlList.", this.ImageUrlList);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);

    }
}

