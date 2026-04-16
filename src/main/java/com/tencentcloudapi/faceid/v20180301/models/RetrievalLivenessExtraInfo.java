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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetrievalLivenessExtraInfo extends AbstractModel {

    /**
    * <p>命中的模板类型，其中Common-公共库；Auto-自动聚类库；Owner-自建模板库</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HitGroup")
    @Expose
    private String HitGroup;

    /**
    * <p>请求图像与命中攻击模板的相似度，相似度取值范围[0,2]，取值越小表示命中攻击模板的概率越高。默认阈值为0.6，当SimilarityScore≥0.6时判断为正常，SimilarityScore&lt;0.6是判断为攻击。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimilarityScore")
    @Expose
    private Float SimilarityScore;

    /**
    * <p>命中的模板id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HitTemplate")
    @Expose
    private String HitTemplate;

    /**
     * Get <p>命中的模板类型，其中Common-公共库；Auto-自动聚类库；Owner-自建模板库</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HitGroup <p>命中的模板类型，其中Common-公共库；Auto-自动聚类库；Owner-自建模板库</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHitGroup() {
        return this.HitGroup;
    }

    /**
     * Set <p>命中的模板类型，其中Common-公共库；Auto-自动聚类库；Owner-自建模板库</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HitGroup <p>命中的模板类型，其中Common-公共库；Auto-自动聚类库；Owner-自建模板库</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHitGroup(String HitGroup) {
        this.HitGroup = HitGroup;
    }

    /**
     * Get <p>请求图像与命中攻击模板的相似度，相似度取值范围[0,2]，取值越小表示命中攻击模板的概率越高。默认阈值为0.6，当SimilarityScore≥0.6时判断为正常，SimilarityScore&lt;0.6是判断为攻击。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SimilarityScore <p>请求图像与命中攻击模板的相似度，相似度取值范围[0,2]，取值越小表示命中攻击模板的概率越高。默认阈值为0.6，当SimilarityScore≥0.6时判断为正常，SimilarityScore&lt;0.6是判断为攻击。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSimilarityScore() {
        return this.SimilarityScore;
    }

    /**
     * Set <p>请求图像与命中攻击模板的相似度，相似度取值范围[0,2]，取值越小表示命中攻击模板的概率越高。默认阈值为0.6，当SimilarityScore≥0.6时判断为正常，SimilarityScore&lt;0.6是判断为攻击。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SimilarityScore <p>请求图像与命中攻击模板的相似度，相似度取值范围[0,2]，取值越小表示命中攻击模板的概率越高。默认阈值为0.6，当SimilarityScore≥0.6时判断为正常，SimilarityScore&lt;0.6是判断为攻击。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimilarityScore(Float SimilarityScore) {
        this.SimilarityScore = SimilarityScore;
    }

    /**
     * Get <p>命中的模板id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HitTemplate <p>命中的模板id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHitTemplate() {
        return this.HitTemplate;
    }

    /**
     * Set <p>命中的模板id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HitTemplate <p>命中的模板id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHitTemplate(String HitTemplate) {
        this.HitTemplate = HitTemplate;
    }

    public RetrievalLivenessExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetrievalLivenessExtraInfo(RetrievalLivenessExtraInfo source) {
        if (source.HitGroup != null) {
            this.HitGroup = new String(source.HitGroup);
        }
        if (source.SimilarityScore != null) {
            this.SimilarityScore = new Float(source.SimilarityScore);
        }
        if (source.HitTemplate != null) {
            this.HitTemplate = new String(source.HitTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitGroup", this.HitGroup);
        this.setParamSimple(map, prefix + "SimilarityScore", this.SimilarityScore);
        this.setParamSimple(map, prefix + "HitTemplate", this.HitTemplate);

    }
}

