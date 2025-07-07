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

public class PoliticalAsrReviewTemplateInfo extends AbstractModel {

    /**
    * 语音鉴别涉及令人不适宜的信息的任务开关，可选值：
<li>ON：开启语音鉴别涉及令人不适宜的信息的任务；</li>
<li>OFF：关闭语音鉴别的涉及令人不适宜的信息的任务。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 判定需人工复核是否违规的分数阈值，当音视频审核达到该分数以上，认为需人工复核，不填默认为 75 分。取值范围：0~100。
    */
    @SerializedName("ReviewConfidence")
    @Expose
    private Long ReviewConfidence;

    /**
    * 判定涉嫌违规的分数阈值，当音视频审核达到该分数以上，认为涉嫌违规，不填默认为 100 分。取值范围：0~100。
    */
    @SerializedName("BlockConfidence")
    @Expose
    private Long BlockConfidence;

    /**
     * Get 语音鉴别涉及令人不适宜的信息的任务开关，可选值：
<li>ON：开启语音鉴别涉及令人不适宜的信息的任务；</li>
<li>OFF：关闭语音鉴别的涉及令人不适宜的信息的任务。</li> 
     * @return Switch 语音鉴别涉及令人不适宜的信息的任务开关，可选值：
<li>ON：开启语音鉴别涉及令人不适宜的信息的任务；</li>
<li>OFF：关闭语音鉴别的涉及令人不适宜的信息的任务。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 语音鉴别涉及令人不适宜的信息的任务开关，可选值：
<li>ON：开启语音鉴别涉及令人不适宜的信息的任务；</li>
<li>OFF：关闭语音鉴别的涉及令人不适宜的信息的任务。</li>
     * @param Switch 语音鉴别涉及令人不适宜的信息的任务开关，可选值：
<li>ON：开启语音鉴别涉及令人不适宜的信息的任务；</li>
<li>OFF：关闭语音鉴别的涉及令人不适宜的信息的任务。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 判定需人工复核是否违规的分数阈值，当音视频审核达到该分数以上，认为需人工复核，不填默认为 75 分。取值范围：0~100。 
     * @return ReviewConfidence 判定需人工复核是否违规的分数阈值，当音视频审核达到该分数以上，认为需人工复核，不填默认为 75 分。取值范围：0~100。
     */
    public Long getReviewConfidence() {
        return this.ReviewConfidence;
    }

    /**
     * Set 判定需人工复核是否违规的分数阈值，当音视频审核达到该分数以上，认为需人工复核，不填默认为 75 分。取值范围：0~100。
     * @param ReviewConfidence 判定需人工复核是否违规的分数阈值，当音视频审核达到该分数以上，认为需人工复核，不填默认为 75 分。取值范围：0~100。
     */
    public void setReviewConfidence(Long ReviewConfidence) {
        this.ReviewConfidence = ReviewConfidence;
    }

    /**
     * Get 判定涉嫌违规的分数阈值，当音视频审核达到该分数以上，认为涉嫌违规，不填默认为 100 分。取值范围：0~100。 
     * @return BlockConfidence 判定涉嫌违规的分数阈值，当音视频审核达到该分数以上，认为涉嫌违规，不填默认为 100 分。取值范围：0~100。
     */
    public Long getBlockConfidence() {
        return this.BlockConfidence;
    }

    /**
     * Set 判定涉嫌违规的分数阈值，当音视频审核达到该分数以上，认为涉嫌违规，不填默认为 100 分。取值范围：0~100。
     * @param BlockConfidence 判定涉嫌违规的分数阈值，当音视频审核达到该分数以上，认为涉嫌违规，不填默认为 100 分。取值范围：0~100。
     */
    public void setBlockConfidence(Long BlockConfidence) {
        this.BlockConfidence = BlockConfidence;
    }

    public PoliticalAsrReviewTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PoliticalAsrReviewTemplateInfo(PoliticalAsrReviewTemplateInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ReviewConfidence != null) {
            this.ReviewConfidence = new Long(source.ReviewConfidence);
        }
        if (source.BlockConfidence != null) {
            this.BlockConfidence = new Long(source.BlockConfidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ReviewConfidence", this.ReviewConfidence);
        this.setParamSimple(map, prefix + "BlockConfidence", this.BlockConfidence);

    }
}

