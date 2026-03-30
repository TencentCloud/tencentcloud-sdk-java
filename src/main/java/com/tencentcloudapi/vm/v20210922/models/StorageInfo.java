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

public class StorageInfo extends AbstractModel {

    /**
    * <p>类型 可选：<br>URL 资源链接类型<br>COS 腾讯云对象存储类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>资源链接</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>腾讯云存储桶信息</p>
    */
    @SerializedName("BucketInfo")
    @Expose
    private BucketInfo BucketInfo;

    /**
    * <p>大模型审核场景下，送审的图片列表</p>
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
     * Get <p>类型 可选：<br>URL 资源链接类型<br>COS 腾讯云对象存储类型</p> 
     * @return Type <p>类型 可选：<br>URL 资源链接类型<br>COS 腾讯云对象存储类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型 可选：<br>URL 资源链接类型<br>COS 腾讯云对象存储类型</p>
     * @param Type <p>类型 可选：<br>URL 资源链接类型<br>COS 腾讯云对象存储类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>资源链接</p> 
     * @return Url <p>资源链接</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>资源链接</p>
     * @param Url <p>资源链接</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>腾讯云存储桶信息</p> 
     * @return BucketInfo <p>腾讯云存储桶信息</p>
     */
    public BucketInfo getBucketInfo() {
        return this.BucketInfo;
    }

    /**
     * Set <p>腾讯云存储桶信息</p>
     * @param BucketInfo <p>腾讯云存储桶信息</p>
     */
    public void setBucketInfo(BucketInfo BucketInfo) {
        this.BucketInfo = BucketInfo;
    }

    /**
     * Get <p>大模型审核场景下，送审的图片列表</p> 
     * @return ImageUrlList <p>大模型审核场景下，送审的图片列表</p>
     */
    public String [] getImageUrlList() {
        return this.ImageUrlList;
    }

    /**
     * Set <p>大模型审核场景下，送审的图片列表</p>
     * @param ImageUrlList <p>大模型审核场景下，送审的图片列表</p>
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

    public StorageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageInfo(StorageInfo source) {
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

