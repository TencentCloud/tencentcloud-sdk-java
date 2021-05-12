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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMmsInstanceItem extends AbstractModel{

    /**
    * 素材类型：1-文本 2-图片 3-视频 4-音频
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * 素材内容：如果素材是文本类型，直接填写文本内容，否则填写素材文件上传到cos后的url地址
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 素材类型：1-文本 2-图片 3-视频 4-音频 
     * @return ContentType 素材类型：1-文本 2-图片 3-视频 4-音频
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 素材类型：1-文本 2-图片 3-视频 4-音频
     * @param ContentType 素材类型：1-文本 2-图片 3-视频 4-音频
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 素材内容：如果素材是文本类型，直接填写文本内容，否则填写素材文件上传到cos后的url地址 
     * @return Content 素材内容：如果素材是文本类型，直接填写文本内容，否则填写素材文件上传到cos后的url地址
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 素材内容：如果素材是文本类型，直接填写文本内容，否则填写素材文件上传到cos后的url地址
     * @param Content 素材内容：如果素材是文本类型，直接填写文本内容，否则填写素材文件上传到cos后的url地址
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CreateMmsInstanceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMmsInstanceItem(CreateMmsInstanceItem source) {
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

