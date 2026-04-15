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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel {

    /**
    * 图片URL
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 首帧：first_frame
尾帧：end_frame
其他：空

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 图片URL 
     * @return ImageUrl 图片URL
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片URL
     * @param ImageUrl 图片URL
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 首帧：first_frame
尾帧：end_frame
其他：空
 
     * @return Type 首帧：first_frame
尾帧：end_frame
其他：空

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 首帧：first_frame
尾帧：end_frame
其他：空

     * @param Type 首帧：first_frame
尾帧：end_frame
其他：空

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

