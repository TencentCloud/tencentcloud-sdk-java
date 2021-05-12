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
package com.tencentcloudapi.ft.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceMorphOutput extends AbstractModel{

    /**
    * 人像渐变输出的url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MorphUrl")
    @Expose
    private String MorphUrl;

    /**
    * 人像渐变输出的结果MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MorphMd5")
    @Expose
    private String MorphMd5;

    /**
    * 人像渐变输出的结果封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverImage")
    @Expose
    private String CoverImage;

    /**
     * Get 人像渐变输出的url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MorphUrl 人像渐变输出的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMorphUrl() {
        return this.MorphUrl;
    }

    /**
     * Set 人像渐变输出的url
注意：此字段可能返回 null，表示取不到有效值。
     * @param MorphUrl 人像渐变输出的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMorphUrl(String MorphUrl) {
        this.MorphUrl = MorphUrl;
    }

    /**
     * Get 人像渐变输出的结果MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MorphMd5 人像渐变输出的结果MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMorphMd5() {
        return this.MorphMd5;
    }

    /**
     * Set 人像渐变输出的结果MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
     * @param MorphMd5 人像渐变输出的结果MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMorphMd5(String MorphMd5) {
        this.MorphMd5 = MorphMd5;
    }

    /**
     * Get 人像渐变输出的结果封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverImage 人像渐变输出的结果封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoverImage() {
        return this.CoverImage;
    }

    /**
     * Set 人像渐变输出的结果封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverImage 人像渐变输出的结果封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverImage(String CoverImage) {
        this.CoverImage = CoverImage;
    }

    public FaceMorphOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceMorphOutput(FaceMorphOutput source) {
        if (source.MorphUrl != null) {
            this.MorphUrl = new String(source.MorphUrl);
        }
        if (source.MorphMd5 != null) {
            this.MorphMd5 = new String(source.MorphMd5);
        }
        if (source.CoverImage != null) {
            this.CoverImage = new String(source.CoverImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MorphUrl", this.MorphUrl);
        this.setParamSimple(map, prefix + "MorphMd5", this.MorphMd5);
        this.setParamSimple(map, prefix + "CoverImage", this.CoverImage);

    }
}

