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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerrorismImgReviewTemplateInfoForUpdate extends AbstractModel{

    /**
    * 画面涉敏任务开关，可选值：
<li>ON：开启画面涉敏任务；</li>
<li>OFF：关闭画面涉敏任务。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 画面涉敏过滤标签，审核结果包含选择的标签则返回结果，如果过滤标签为空，则审核结果全部返回，可选值为：
<li>guns：武器枪支；</li>
<li>crowd：人群聚集；</li>
<li>bloody：血腥画面；</li>
<li>police：警察部队；</li>
<li>banners：涉敏旗帜；</li>
<li>militant：武装分子；</li>
<li>explosion：爆炸火灾；</li>
<li>terrorists：涉敏人物；</li>
<li>scenario：涉敏画面。</li>
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
    * 判定涉嫌违规的分数阈值，当智能审核达到该分数以上，认为涉嫌违规。取值范围：0~100。
    */
    @SerializedName("BlockConfidence")
    @Expose
    private Long BlockConfidence;

    /**
    * 判定需人工复核是否违规的分数阈值，当智能审核达到该分数以上，认为需人工复核。取值范围：0~100。
    */
    @SerializedName("ReviewConfidence")
    @Expose
    private Long ReviewConfidence;

    /**
     * Get 画面涉敏任务开关，可选值：
<li>ON：开启画面涉敏任务；</li>
<li>OFF：关闭画面涉敏任务。</li> 
     * @return Switch 画面涉敏任务开关，可选值：
<li>ON：开启画面涉敏任务；</li>
<li>OFF：关闭画面涉敏任务。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 画面涉敏任务开关，可选值：
<li>ON：开启画面涉敏任务；</li>
<li>OFF：关闭画面涉敏任务。</li>
     * @param Switch 画面涉敏任务开关，可选值：
<li>ON：开启画面涉敏任务；</li>
<li>OFF：关闭画面涉敏任务。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 画面涉敏过滤标签，审核结果包含选择的标签则返回结果，如果过滤标签为空，则审核结果全部返回，可选值为：
<li>guns：武器枪支；</li>
<li>crowd：人群聚集；</li>
<li>bloody：血腥画面；</li>
<li>police：警察部队；</li>
<li>banners：涉敏旗帜；</li>
<li>militant：武装分子；</li>
<li>explosion：爆炸火灾；</li>
<li>terrorists：涉敏人物；</li>
<li>scenario：涉敏画面。</li> 
     * @return LabelSet 画面涉敏过滤标签，审核结果包含选择的标签则返回结果，如果过滤标签为空，则审核结果全部返回，可选值为：
<li>guns：武器枪支；</li>
<li>crowd：人群聚集；</li>
<li>bloody：血腥画面；</li>
<li>police：警察部队；</li>
<li>banners：涉敏旗帜；</li>
<li>militant：武装分子；</li>
<li>explosion：爆炸火灾；</li>
<li>terrorists：涉敏人物；</li>
<li>scenario：涉敏画面。</li>
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set 画面涉敏过滤标签，审核结果包含选择的标签则返回结果，如果过滤标签为空，则审核结果全部返回，可选值为：
<li>guns：武器枪支；</li>
<li>crowd：人群聚集；</li>
<li>bloody：血腥画面；</li>
<li>police：警察部队；</li>
<li>banners：涉敏旗帜；</li>
<li>militant：武装分子；</li>
<li>explosion：爆炸火灾；</li>
<li>terrorists：涉敏人物；</li>
<li>scenario：涉敏画面。</li>
     * @param LabelSet 画面涉敏过滤标签，审核结果包含选择的标签则返回结果，如果过滤标签为空，则审核结果全部返回，可选值为：
<li>guns：武器枪支；</li>
<li>crowd：人群聚集；</li>
<li>bloody：血腥画面；</li>
<li>police：警察部队；</li>
<li>banners：涉敏旗帜；</li>
<li>militant：武装分子；</li>
<li>explosion：爆炸火灾；</li>
<li>terrorists：涉敏人物；</li>
<li>scenario：涉敏画面。</li>
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    /**
     * Get 判定涉嫌违规的分数阈值，当智能审核达到该分数以上，认为涉嫌违规。取值范围：0~100。 
     * @return BlockConfidence 判定涉嫌违规的分数阈值，当智能审核达到该分数以上，认为涉嫌违规。取值范围：0~100。
     */
    public Long getBlockConfidence() {
        return this.BlockConfidence;
    }

    /**
     * Set 判定涉嫌违规的分数阈值，当智能审核达到该分数以上，认为涉嫌违规。取值范围：0~100。
     * @param BlockConfidence 判定涉嫌违规的分数阈值，当智能审核达到该分数以上，认为涉嫌违规。取值范围：0~100。
     */
    public void setBlockConfidence(Long BlockConfidence) {
        this.BlockConfidence = BlockConfidence;
    }

    /**
     * Get 判定需人工复核是否违规的分数阈值，当智能审核达到该分数以上，认为需人工复核。取值范围：0~100。 
     * @return ReviewConfidence 判定需人工复核是否违规的分数阈值，当智能审核达到该分数以上，认为需人工复核。取值范围：0~100。
     */
    public Long getReviewConfidence() {
        return this.ReviewConfidence;
    }

    /**
     * Set 判定需人工复核是否违规的分数阈值，当智能审核达到该分数以上，认为需人工复核。取值范围：0~100。
     * @param ReviewConfidence 判定需人工复核是否违规的分数阈值，当智能审核达到该分数以上，认为需人工复核。取值范围：0~100。
     */
    public void setReviewConfidence(Long ReviewConfidence) {
        this.ReviewConfidence = ReviewConfidence;
    }

    public TerrorismImgReviewTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerrorismImgReviewTemplateInfoForUpdate(TerrorismImgReviewTemplateInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.LabelSet != null) {
            this.LabelSet = new String[source.LabelSet.length];
            for (int i = 0; i < source.LabelSet.length; i++) {
                this.LabelSet[i] = new String(source.LabelSet[i]);
            }
        }
        if (source.BlockConfidence != null) {
            this.BlockConfidence = new Long(source.BlockConfidence);
        }
        if (source.ReviewConfidence != null) {
            this.ReviewConfidence = new Long(source.ReviewConfidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "LabelSet.", this.LabelSet);
        this.setParamSimple(map, prefix + "BlockConfidence", this.BlockConfidence);
        this.setParamSimple(map, prefix + "ReviewConfidence", this.ReviewConfidence);

    }
}

