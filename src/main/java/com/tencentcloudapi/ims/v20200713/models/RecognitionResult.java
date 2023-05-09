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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognitionResult extends AbstractModel{

    /**
    * 当前可能的取值：Scene（图片场景模型）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Label对应模型下的识别标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private RecognitionTag [] Tags;

    /**
     * Get 当前可能的取值：Scene（图片场景模型）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 当前可能的取值：Scene（图片场景模型）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 当前可能的取值：Scene（图片场景模型）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 当前可能的取值：Scene（图片场景模型）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Label对应模型下的识别标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags Label对应模型下的识别标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecognitionTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Label对应模型下的识别标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags Label对应模型下的识别标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(RecognitionTag [] Tags) {
        this.Tags = Tags;
    }

    public RecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognitionResult(RecognitionResult source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Tags != null) {
            this.Tags = new RecognitionTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RecognitionTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

