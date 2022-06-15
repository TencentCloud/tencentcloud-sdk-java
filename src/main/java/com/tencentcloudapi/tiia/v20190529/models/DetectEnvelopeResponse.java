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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectEnvelopeResponse extends AbstractModel{

    /**
    * 一级标签结果数组。识别是否文件封。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstTags")
    @Expose
    private ImageTag [] FirstTags;

    /**
    * 二级标签结果数组。识别文件封正反面。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondTags")
    @Expose
    private ImageTag [] SecondTags;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 一级标签结果数组。识别是否文件封。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstTags 一级标签结果数组。识别是否文件封。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageTag [] getFirstTags() {
        return this.FirstTags;
    }

    /**
     * Set 一级标签结果数组。识别是否文件封。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstTags 一级标签结果数组。识别是否文件封。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstTags(ImageTag [] FirstTags) {
        this.FirstTags = FirstTags;
    }

    /**
     * Get 二级标签结果数组。识别文件封正反面。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondTags 二级标签结果数组。识别文件封正反面。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageTag [] getSecondTags() {
        return this.SecondTags;
    }

    /**
     * Set 二级标签结果数组。识别文件封正反面。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondTags 二级标签结果数组。识别文件封正反面。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondTags(ImageTag [] SecondTags) {
        this.SecondTags = SecondTags;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DetectEnvelopeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectEnvelopeResponse(DetectEnvelopeResponse source) {
        if (source.FirstTags != null) {
            this.FirstTags = new ImageTag[source.FirstTags.length];
            for (int i = 0; i < source.FirstTags.length; i++) {
                this.FirstTags[i] = new ImageTag(source.FirstTags[i]);
            }
        }
        if (source.SecondTags != null) {
            this.SecondTags = new ImageTag[source.SecondTags.length];
            for (int i = 0; i < source.SecondTags.length; i++) {
                this.SecondTags[i] = new ImageTag(source.SecondTags[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FirstTags.", this.FirstTags);
        this.setParamArrayObj(map, prefix + "SecondTags.", this.SecondTags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

