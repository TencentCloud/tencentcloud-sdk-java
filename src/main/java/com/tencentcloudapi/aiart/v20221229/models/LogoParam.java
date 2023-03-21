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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogoParam extends AbstractModel{

    /**
    * 水印url
    */
    @SerializedName("LogoUrl")
    @Expose
    private String LogoUrl;

    /**
    * 水印base64，url和base64二选一传入
    */
    @SerializedName("LogoImage")
    @Expose
    private String LogoImage;

    /**
    * 水印图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配
    */
    @SerializedName("LogoRect")
    @Expose
    private LogoRect LogoRect;

    /**
     * Get 水印url 
     * @return LogoUrl 水印url
     */
    public String getLogoUrl() {
        return this.LogoUrl;
    }

    /**
     * Set 水印url
     * @param LogoUrl 水印url
     */
    public void setLogoUrl(String LogoUrl) {
        this.LogoUrl = LogoUrl;
    }

    /**
     * Get 水印base64，url和base64二选一传入 
     * @return LogoImage 水印base64，url和base64二选一传入
     */
    public String getLogoImage() {
        return this.LogoImage;
    }

    /**
     * Set 水印base64，url和base64二选一传入
     * @param LogoImage 水印base64，url和base64二选一传入
     */
    public void setLogoImage(String LogoImage) {
        this.LogoImage = LogoImage;
    }

    /**
     * Get 水印图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配 
     * @return LogoRect 水印图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配
     */
    public LogoRect getLogoRect() {
        return this.LogoRect;
    }

    /**
     * Set 水印图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配
     * @param LogoRect 水印图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配
     */
    public void setLogoRect(LogoRect LogoRect) {
        this.LogoRect = LogoRect;
    }

    public LogoParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogoParam(LogoParam source) {
        if (source.LogoUrl != null) {
            this.LogoUrl = new String(source.LogoUrl);
        }
        if (source.LogoImage != null) {
            this.LogoImage = new String(source.LogoImage);
        }
        if (source.LogoRect != null) {
            this.LogoRect = new LogoRect(source.LogoRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogoUrl", this.LogoUrl);
        this.setParamSimple(map, prefix + "LogoImage", this.LogoImage);
        this.setParamObj(map, prefix + "LogoRect.", this.LogoRect);

    }
}

