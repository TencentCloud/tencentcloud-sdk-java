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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Mindmap extends AbstractModel {

    /**
    * 脑图缩略图链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThumbUrl")
    @Expose
    private String ThumbUrl;

    /**
    * 脑图图片链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 脑图缩略图链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThumbUrl 脑图缩略图链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThumbUrl() {
        return this.ThumbUrl;
    }

    /**
     * Set 脑图缩略图链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThumbUrl 脑图缩略图链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThumbUrl(String ThumbUrl) {
        this.ThumbUrl = ThumbUrl;
    }

    /**
     * Get 脑图图片链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 脑图图片链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 脑图图片链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 脑图图片链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Mindmap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Mindmap(Mindmap source) {
        if (source.ThumbUrl != null) {
            this.ThumbUrl = new String(source.ThumbUrl);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThumbUrl", this.ThumbUrl);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

