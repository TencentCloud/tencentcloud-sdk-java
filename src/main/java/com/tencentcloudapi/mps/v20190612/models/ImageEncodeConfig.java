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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageEncodeConfig extends AbstractModel {

    /**
    * 图片格式，取值范围：JPEG、PNG、BMP、WebP，缺省为原图格式。不支持动画。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 图片的相对质量，取值范围：1 - 100，数值以原图质量为标准，缺省为原图质量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quality")
    @Expose
    private Long Quality;

    /**
     * Get 图片格式，取值范围：JPEG、PNG、BMP、WebP，缺省为原图格式。不支持动画。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Format 图片格式，取值范围：JPEG、PNG、BMP、WebP，缺省为原图格式。不支持动画。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 图片格式，取值范围：JPEG、PNG、BMP、WebP，缺省为原图格式。不支持动画。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Format 图片格式，取值范围：JPEG、PNG、BMP、WebP，缺省为原图格式。不支持动画。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 图片的相对质量，取值范围：1 - 100，数值以原图质量为标准，缺省为原图质量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quality 图片的相对质量，取值范围：1 - 100，数值以原图质量为标准，缺省为原图质量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQuality() {
        return this.Quality;
    }

    /**
     * Set 图片的相对质量，取值范围：1 - 100，数值以原图质量为标准，缺省为原图质量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quality 图片的相对质量，取值范围：1 - 100，数值以原图质量为标准，缺省为原图质量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuality(Long Quality) {
        this.Quality = Quality;
    }

    public ImageEncodeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageEncodeConfig(ImageEncodeConfig source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Quality != null) {
            this.Quality = new Long(source.Quality);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Quality", this.Quality);

    }
}

