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

public class RuleIdConfig extends AbstractModel {

    /**
    * 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认开启。
    */
    @SerializedName("IntentionRecognition")
    @Expose
    private Boolean IntentionRecognition;

    /**
    * 意愿核身类型，默认为0：
0：问答模式，DetectAuth接口需要传入IntentionQuestions字段；
1：点头模式，DetectAuth接口需要传入IntentionActions字段；
    */
    @SerializedName("IntentionType")
    @Expose
    private Long IntentionType;

    /**
    * 用户语音回答过程中是否开启张嘴识别检测，默认不开启，仅在意愿核身问答模式中使用。
    */
    @SerializedName("MouthOpenRecognition")
    @Expose
    private Boolean MouthOpenRecognition;

    /**
    * 意愿核身语音播报速度，配置后问答模式和点头模式的语音播报环节都会生效，默认值为0：
0：智能语速（根据播报文案的长度自动调整语音播报速度）
1：固定1倍速
2：固定1.2倍速
3：固定1.5倍速
    */
    @SerializedName("Speed")
    @Expose
    private Long Speed;

    /**
     * Get 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认开启。 
     * @return IntentionRecognition 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认开启。
     */
    public Boolean getIntentionRecognition() {
        return this.IntentionRecognition;
    }

    /**
     * Set 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认开启。
     * @param IntentionRecognition 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认开启。
     */
    public void setIntentionRecognition(Boolean IntentionRecognition) {
        this.IntentionRecognition = IntentionRecognition;
    }

    /**
     * Get 意愿核身类型，默认为0：
0：问答模式，DetectAuth接口需要传入IntentionQuestions字段；
1：点头模式，DetectAuth接口需要传入IntentionActions字段； 
     * @return IntentionType 意愿核身类型，默认为0：
0：问答模式，DetectAuth接口需要传入IntentionQuestions字段；
1：点头模式，DetectAuth接口需要传入IntentionActions字段；
     */
    public Long getIntentionType() {
        return this.IntentionType;
    }

    /**
     * Set 意愿核身类型，默认为0：
0：问答模式，DetectAuth接口需要传入IntentionQuestions字段；
1：点头模式，DetectAuth接口需要传入IntentionActions字段；
     * @param IntentionType 意愿核身类型，默认为0：
0：问答模式，DetectAuth接口需要传入IntentionQuestions字段；
1：点头模式，DetectAuth接口需要传入IntentionActions字段；
     */
    public void setIntentionType(Long IntentionType) {
        this.IntentionType = IntentionType;
    }

    /**
     * Get 用户语音回答过程中是否开启张嘴识别检测，默认不开启，仅在意愿核身问答模式中使用。 
     * @return MouthOpenRecognition 用户语音回答过程中是否开启张嘴识别检测，默认不开启，仅在意愿核身问答模式中使用。
     */
    public Boolean getMouthOpenRecognition() {
        return this.MouthOpenRecognition;
    }

    /**
     * Set 用户语音回答过程中是否开启张嘴识别检测，默认不开启，仅在意愿核身问答模式中使用。
     * @param MouthOpenRecognition 用户语音回答过程中是否开启张嘴识别检测，默认不开启，仅在意愿核身问答模式中使用。
     */
    public void setMouthOpenRecognition(Boolean MouthOpenRecognition) {
        this.MouthOpenRecognition = MouthOpenRecognition;
    }

    /**
     * Get 意愿核身语音播报速度，配置后问答模式和点头模式的语音播报环节都会生效，默认值为0：
0：智能语速（根据播报文案的长度自动调整语音播报速度）
1：固定1倍速
2：固定1.2倍速
3：固定1.5倍速 
     * @return Speed 意愿核身语音播报速度，配置后问答模式和点头模式的语音播报环节都会生效，默认值为0：
0：智能语速（根据播报文案的长度自动调整语音播报速度）
1：固定1倍速
2：固定1.2倍速
3：固定1.5倍速
     */
    public Long getSpeed() {
        return this.Speed;
    }

    /**
     * Set 意愿核身语音播报速度，配置后问答模式和点头模式的语音播报环节都会生效，默认值为0：
0：智能语速（根据播报文案的长度自动调整语音播报速度）
1：固定1倍速
2：固定1.2倍速
3：固定1.5倍速
     * @param Speed 意愿核身语音播报速度，配置后问答模式和点头模式的语音播报环节都会生效，默认值为0：
0：智能语速（根据播报文案的长度自动调整语音播报速度）
1：固定1倍速
2：固定1.2倍速
3：固定1.5倍速
     */
    public void setSpeed(Long Speed) {
        this.Speed = Speed;
    }

    public RuleIdConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleIdConfig(RuleIdConfig source) {
        if (source.IntentionRecognition != null) {
            this.IntentionRecognition = new Boolean(source.IntentionRecognition);
        }
        if (source.IntentionType != null) {
            this.IntentionType = new Long(source.IntentionType);
        }
        if (source.MouthOpenRecognition != null) {
            this.MouthOpenRecognition = new Boolean(source.MouthOpenRecognition);
        }
        if (source.Speed != null) {
            this.Speed = new Long(source.Speed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntentionRecognition", this.IntentionRecognition);
        this.setParamSimple(map, prefix + "IntentionType", this.IntentionType);
        this.setParamSimple(map, prefix + "MouthOpenRecognition", this.MouthOpenRecognition);
        this.setParamSimple(map, prefix + "Speed", this.Speed);

    }
}

