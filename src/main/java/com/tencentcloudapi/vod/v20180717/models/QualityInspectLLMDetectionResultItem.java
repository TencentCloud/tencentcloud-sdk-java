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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityInspectLLMDetectionResultItem extends AbstractModel {

    /**
    * <p>检测分类。</p><p>枚举值：</p><ul><li>AIGCQualityCharacteristics： AIGC 质量特征。</li></ul>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>检测分组。</p><p>枚举值：</p><ul><li>AIGCAuthenticity： AIGC 真实性，包括人体合理性、物理合理性、跨帧一致性等。</li><li>AIGCTechQuality： AIGC 技术质量，包括画幅、黑边、强行竖屏等。</li></ul>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>检测类型名称。</p><p>枚举值：</p><ul><li>BodyPoseCheck： 人体姿态合理性，属于 AIGCAuthenticity。</li><li>BodyDetailCheck： 人体细节合理性，包括手指数、五官对称等，属于 AIGCAuthenticity。</li><li>PhysicRulesCheck： 物理规律合理性，包括透视、光影、重力等，属于 AIGCAuthenticity。</li><li>ObjectConsistencyCheck： 跨帧物体一致性，属于 AIGCAuthenticity。</li><li>FormatCheck： 画幅、黑边、强行竖屏等格式问题，属于 AIGCTechQuality。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>整体质量得分，范围 [0, 100]，越高表示越好。</p>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>判断置信度，范围 [0, 100]，越高表示越确定。</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>检测发现的问题列表，无问题时为空。</p>
    */
    @SerializedName("IssueSet")
    @Expose
    private QualityInspectLLMDetectionIssue [] IssueSet;

    /**
     * Get <p>检测分类。</p><p>枚举值：</p><ul><li>AIGCQualityCharacteristics： AIGC 质量特征。</li></ul> 
     * @return Category <p>检测分类。</p><p>枚举值：</p><ul><li>AIGCQualityCharacteristics： AIGC 质量特征。</li></ul>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>检测分类。</p><p>枚举值：</p><ul><li>AIGCQualityCharacteristics： AIGC 质量特征。</li></ul>
     * @param Category <p>检测分类。</p><p>枚举值：</p><ul><li>AIGCQualityCharacteristics： AIGC 质量特征。</li></ul>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>检测分组。</p><p>枚举值：</p><ul><li>AIGCAuthenticity： AIGC 真实性，包括人体合理性、物理合理性、跨帧一致性等。</li><li>AIGCTechQuality： AIGC 技术质量，包括画幅、黑边、强行竖屏等。</li></ul> 
     * @return Group <p>检测分组。</p><p>枚举值：</p><ul><li>AIGCAuthenticity： AIGC 真实性，包括人体合理性、物理合理性、跨帧一致性等。</li><li>AIGCTechQuality： AIGC 技术质量，包括画幅、黑边、强行竖屏等。</li></ul>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>检测分组。</p><p>枚举值：</p><ul><li>AIGCAuthenticity： AIGC 真实性，包括人体合理性、物理合理性、跨帧一致性等。</li><li>AIGCTechQuality： AIGC 技术质量，包括画幅、黑边、强行竖屏等。</li></ul>
     * @param Group <p>检测分组。</p><p>枚举值：</p><ul><li>AIGCAuthenticity： AIGC 真实性，包括人体合理性、物理合理性、跨帧一致性等。</li><li>AIGCTechQuality： AIGC 技术质量，包括画幅、黑边、强行竖屏等。</li></ul>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>检测类型名称。</p><p>枚举值：</p><ul><li>BodyPoseCheck： 人体姿态合理性，属于 AIGCAuthenticity。</li><li>BodyDetailCheck： 人体细节合理性，包括手指数、五官对称等，属于 AIGCAuthenticity。</li><li>PhysicRulesCheck： 物理规律合理性，包括透视、光影、重力等，属于 AIGCAuthenticity。</li><li>ObjectConsistencyCheck： 跨帧物体一致性，属于 AIGCAuthenticity。</li><li>FormatCheck： 画幅、黑边、强行竖屏等格式问题，属于 AIGCTechQuality。</li></ul> 
     * @return Type <p>检测类型名称。</p><p>枚举值：</p><ul><li>BodyPoseCheck： 人体姿态合理性，属于 AIGCAuthenticity。</li><li>BodyDetailCheck： 人体细节合理性，包括手指数、五官对称等，属于 AIGCAuthenticity。</li><li>PhysicRulesCheck： 物理规律合理性，包括透视、光影、重力等，属于 AIGCAuthenticity。</li><li>ObjectConsistencyCheck： 跨帧物体一致性，属于 AIGCAuthenticity。</li><li>FormatCheck： 画幅、黑边、强行竖屏等格式问题，属于 AIGCTechQuality。</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>检测类型名称。</p><p>枚举值：</p><ul><li>BodyPoseCheck： 人体姿态合理性，属于 AIGCAuthenticity。</li><li>BodyDetailCheck： 人体细节合理性，包括手指数、五官对称等，属于 AIGCAuthenticity。</li><li>PhysicRulesCheck： 物理规律合理性，包括透视、光影、重力等，属于 AIGCAuthenticity。</li><li>ObjectConsistencyCheck： 跨帧物体一致性，属于 AIGCAuthenticity。</li><li>FormatCheck： 画幅、黑边、强行竖屏等格式问题，属于 AIGCTechQuality。</li></ul>
     * @param Type <p>检测类型名称。</p><p>枚举值：</p><ul><li>BodyPoseCheck： 人体姿态合理性，属于 AIGCAuthenticity。</li><li>BodyDetailCheck： 人体细节合理性，包括手指数、五官对称等，属于 AIGCAuthenticity。</li><li>PhysicRulesCheck： 物理规律合理性，包括透视、光影、重力等，属于 AIGCAuthenticity。</li><li>ObjectConsistencyCheck： 跨帧物体一致性，属于 AIGCAuthenticity。</li><li>FormatCheck： 画幅、黑边、强行竖屏等格式问题，属于 AIGCTechQuality。</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>整体质量得分，范围 [0, 100]，越高表示越好。</p> 
     * @return Score <p>整体质量得分，范围 [0, 100]，越高表示越好。</p>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>整体质量得分，范围 [0, 100]，越高表示越好。</p>
     * @param Score <p>整体质量得分，范围 [0, 100]，越高表示越好。</p>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>判断置信度，范围 [0, 100]，越高表示越确定。</p> 
     * @return Confidence <p>判断置信度，范围 [0, 100]，越高表示越确定。</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>判断置信度，范围 [0, 100]，越高表示越确定。</p>
     * @param Confidence <p>判断置信度，范围 [0, 100]，越高表示越确定。</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>检测发现的问题列表，无问题时为空。</p> 
     * @return IssueSet <p>检测发现的问题列表，无问题时为空。</p>
     */
    public QualityInspectLLMDetectionIssue [] getIssueSet() {
        return this.IssueSet;
    }

    /**
     * Set <p>检测发现的问题列表，无问题时为空。</p>
     * @param IssueSet <p>检测发现的问题列表，无问题时为空。</p>
     */
    public void setIssueSet(QualityInspectLLMDetectionIssue [] IssueSet) {
        this.IssueSet = IssueSet;
    }

    public QualityInspectLLMDetectionResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectLLMDetectionResultItem(QualityInspectLLMDetectionResultItem source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.IssueSet != null) {
            this.IssueSet = new QualityInspectLLMDetectionIssue[source.IssueSet.length];
            for (int i = 0; i < source.IssueSet.length; i++) {
                this.IssueSet[i] = new QualityInspectLLMDetectionIssue(source.IssueSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "IssueSet.", this.IssueSet);

    }
}

