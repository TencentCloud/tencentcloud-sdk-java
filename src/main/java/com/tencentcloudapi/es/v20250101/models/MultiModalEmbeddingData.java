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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiModalEmbeddingData extends AbstractModel {

    /**
    * 文本特征向量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextEmbeddings")
    @Expose
    private EmbeddingData [] TextEmbeddings;

    /**
    * 图片特征向量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageEmbeddings")
    @Expose
    private EmbeddingData [] ImageEmbeddings;

    /**
     * Get 文本特征向量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextEmbeddings 文本特征向量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmbeddingData [] getTextEmbeddings() {
        return this.TextEmbeddings;
    }

    /**
     * Set 文本特征向量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextEmbeddings 文本特征向量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextEmbeddings(EmbeddingData [] TextEmbeddings) {
        this.TextEmbeddings = TextEmbeddings;
    }

    /**
     * Get 图片特征向量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageEmbeddings 图片特征向量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmbeddingData [] getImageEmbeddings() {
        return this.ImageEmbeddings;
    }

    /**
     * Set 图片特征向量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageEmbeddings 图片特征向量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageEmbeddings(EmbeddingData [] ImageEmbeddings) {
        this.ImageEmbeddings = ImageEmbeddings;
    }

    public MultiModalEmbeddingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiModalEmbeddingData(MultiModalEmbeddingData source) {
        if (source.TextEmbeddings != null) {
            this.TextEmbeddings = new EmbeddingData[source.TextEmbeddings.length];
            for (int i = 0; i < source.TextEmbeddings.length; i++) {
                this.TextEmbeddings[i] = new EmbeddingData(source.TextEmbeddings[i]);
            }
        }
        if (source.ImageEmbeddings != null) {
            this.ImageEmbeddings = new EmbeddingData[source.ImageEmbeddings.length];
            for (int i = 0; i < source.ImageEmbeddings.length; i++) {
                this.ImageEmbeddings[i] = new EmbeddingData(source.ImageEmbeddings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TextEmbeddings.", this.TextEmbeddings);
        this.setParamArrayObj(map, prefix + "ImageEmbeddings.", this.ImageEmbeddings);

    }
}

