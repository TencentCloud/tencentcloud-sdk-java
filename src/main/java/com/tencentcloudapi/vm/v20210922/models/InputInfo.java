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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputInfo extends AbstractModel {

    /**
    * <p>传入的类型可选：URL，COS</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Url地址</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>桶信息。当输入当时COS时，该字段不为空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketInfo")
    @Expose
    private String BucketInfo;

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
     * Get <p>传入的类型可选：URL，COS</p> 
     * @return Type <p>传入的类型可选：URL，COS</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>传入的类型可选：URL，COS</p>
     * @param Type <p>传入的类型可选：URL，COS</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Url地址</p> 
     * @return Url <p>Url地址</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Url地址</p>
     * @param Url <p>Url地址</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>桶信息。当输入当时COS时，该字段不为空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketInfo <p>桶信息。当输入当时COS时，该字段不为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketInfo() {
        return this.BucketInfo;
    }

    /**
     * Set <p>桶信息。当输入当时COS时，该字段不为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketInfo <p>桶信息。当输入当时COS时，该字段不为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketInfo(String BucketInfo) {
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
            this.BucketInfo = new String(source.BucketInfo);
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
        this.setParamSimple(map, prefix + "BucketInfo", this.BucketInfo);
        this.setParamArraySimple(map, prefix + "ImageUrlList.", this.ImageUrlList);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);

    }
}

