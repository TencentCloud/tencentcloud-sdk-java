/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePPTCheckTaskRequest extends AbstractModel{

    /**
    * 客户的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 经过URL编码后的PPT文件地址。URL 编码会将字符转换为可通过因特网传输的格式，例如文档地址为http://example.com/测试.pptx，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pptx。为了提高URL解析的成功率，请对URL进行编码。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 是否对不支持元素开启自动处理的功能。默认不开启。

在开启自动处理的情况下，会自动进行如下处理：
1. 墨迹：移除不支持的墨迹（比如使用WPS画的）
2. 自动翻页：移除PPT上所有的自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用
    */
    @SerializedName("AutoHandleUnsupportedElement")
    @Expose
    private Boolean AutoHandleUnsupportedElement;

    /**
     * Get 客户的SdkAppId 
     * @return SdkAppId 客户的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 客户的SdkAppId
     * @param SdkAppId 客户的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 经过URL编码后的PPT文件地址。URL 编码会将字符转换为可通过因特网传输的格式，例如文档地址为http://example.com/测试.pptx，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pptx。为了提高URL解析的成功率，请对URL进行编码。 
     * @return Url 经过URL编码后的PPT文件地址。URL 编码会将字符转换为可通过因特网传输的格式，例如文档地址为http://example.com/测试.pptx，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pptx。为了提高URL解析的成功率，请对URL进行编码。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 经过URL编码后的PPT文件地址。URL 编码会将字符转换为可通过因特网传输的格式，例如文档地址为http://example.com/测试.pptx，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pptx。为了提高URL解析的成功率，请对URL进行编码。
     * @param Url 经过URL编码后的PPT文件地址。URL 编码会将字符转换为可通过因特网传输的格式，例如文档地址为http://example.com/测试.pptx，经过URL编码之后为http://example.com/%E6%B5%8B%E8%AF%95.pptx。为了提高URL解析的成功率，请对URL进行编码。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 是否对不支持元素开启自动处理的功能。默认不开启。

在开启自动处理的情况下，会自动进行如下处理：
1. 墨迹：移除不支持的墨迹（比如使用WPS画的）
2. 自动翻页：移除PPT上所有的自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用 
     * @return AutoHandleUnsupportedElement 是否对不支持元素开启自动处理的功能。默认不开启。

在开启自动处理的情况下，会自动进行如下处理：
1. 墨迹：移除不支持的墨迹（比如使用WPS画的）
2. 自动翻页：移除PPT上所有的自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用
     */
    public Boolean getAutoHandleUnsupportedElement() {
        return this.AutoHandleUnsupportedElement;
    }

    /**
     * Set 是否对不支持元素开启自动处理的功能。默认不开启。

在开启自动处理的情况下，会自动进行如下处理：
1. 墨迹：移除不支持的墨迹（比如使用WPS画的）
2. 自动翻页：移除PPT上所有的自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用
     * @param AutoHandleUnsupportedElement 是否对不支持元素开启自动处理的功能。默认不开启。

在开启自动处理的情况下，会自动进行如下处理：
1. 墨迹：移除不支持的墨迹（比如使用WPS画的）
2. 自动翻页：移除PPT上所有的自动翻页设置，并设置为单击鼠标翻页
3. 已损坏音视频：移除PPT上对损坏音视频的引用
     */
    public void setAutoHandleUnsupportedElement(Boolean AutoHandleUnsupportedElement) {
        this.AutoHandleUnsupportedElement = AutoHandleUnsupportedElement;
    }

    public CreatePPTCheckTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePPTCheckTaskRequest(CreatePPTCheckTaskRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AutoHandleUnsupportedElement != null) {
            this.AutoHandleUnsupportedElement = new Boolean(source.AutoHandleUnsupportedElement);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "AutoHandleUnsupportedElement", this.AutoHandleUnsupportedElement);

    }
}

