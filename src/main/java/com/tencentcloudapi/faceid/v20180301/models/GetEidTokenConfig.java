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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEidTokenConfig extends AbstractModel{

    /**
    * 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 是否使用意愿核身，默认不使用。注意：如开启使用，则计费标签按【意愿核身】计费标签计价；如不开启，则计费标签按【E证通】计费标签计价，价格详见：[价格说明](https://cloud.tencent.com/document/product/1007/56804)。
    */
    @SerializedName("UseIntentionVerify")
    @Expose
    private Boolean UseIntentionVerify;

    /**
    * 意愿核身模式。枚举值：1( 朗读模式)，2（问答模式） 。默认值1
    */
    @SerializedName("IntentionMode")
    @Expose
    private String IntentionMode;

    /**
    * 意愿核身朗读模式使用的文案，若未使用意愿核身朗读功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
    */
    @SerializedName("IntentionVerifyText")
    @Expose
    private String IntentionVerifyText;

    /**
    * 意愿核身问答模式的配置列表。当前仅支持一个问答。
    */
    @SerializedName("IntentionQuestions")
    @Expose
    private IntentionQuestion [] IntentionQuestions;

    /**
    * 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认不开启。
    */
    @SerializedName("IntentionRecognition")
    @Expose
    private Boolean IntentionRecognition;

    /**
     * Get 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名 
     * @return InputType 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名
     * @param InputType 姓名身份证输入方式。
1：传身份证正反面OCR   
2：传身份证正面OCR  
3：用户手动输入  
4：客户后台传入  
默认1
注：使用OCR时仅支持用户修改结果中的姓名
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 是否使用意愿核身，默认不使用。注意：如开启使用，则计费标签按【意愿核身】计费标签计价；如不开启，则计费标签按【E证通】计费标签计价，价格详见：[价格说明](https://cloud.tencent.com/document/product/1007/56804)。 
     * @return UseIntentionVerify 是否使用意愿核身，默认不使用。注意：如开启使用，则计费标签按【意愿核身】计费标签计价；如不开启，则计费标签按【E证通】计费标签计价，价格详见：[价格说明](https://cloud.tencent.com/document/product/1007/56804)。
     */
    public Boolean getUseIntentionVerify() {
        return this.UseIntentionVerify;
    }

    /**
     * Set 是否使用意愿核身，默认不使用。注意：如开启使用，则计费标签按【意愿核身】计费标签计价；如不开启，则计费标签按【E证通】计费标签计价，价格详见：[价格说明](https://cloud.tencent.com/document/product/1007/56804)。
     * @param UseIntentionVerify 是否使用意愿核身，默认不使用。注意：如开启使用，则计费标签按【意愿核身】计费标签计价；如不开启，则计费标签按【E证通】计费标签计价，价格详见：[价格说明](https://cloud.tencent.com/document/product/1007/56804)。
     */
    public void setUseIntentionVerify(Boolean UseIntentionVerify) {
        this.UseIntentionVerify = UseIntentionVerify;
    }

    /**
     * Get 意愿核身模式。枚举值：1( 朗读模式)，2（问答模式） 。默认值1 
     * @return IntentionMode 意愿核身模式。枚举值：1( 朗读模式)，2（问答模式） 。默认值1
     */
    public String getIntentionMode() {
        return this.IntentionMode;
    }

    /**
     * Set 意愿核身模式。枚举值：1( 朗读模式)，2（问答模式） 。默认值1
     * @param IntentionMode 意愿核身模式。枚举值：1( 朗读模式)，2（问答模式） 。默认值1
     */
    public void setIntentionMode(String IntentionMode) {
        this.IntentionMode = IntentionMode;
    }

    /**
     * Get 意愿核身朗读模式使用的文案，若未使用意愿核身朗读功能，该字段无需传入。默认为空，最长可接受120的字符串长度。 
     * @return IntentionVerifyText 意愿核身朗读模式使用的文案，若未使用意愿核身朗读功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
     */
    public String getIntentionVerifyText() {
        return this.IntentionVerifyText;
    }

    /**
     * Set 意愿核身朗读模式使用的文案，若未使用意愿核身朗读功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
     * @param IntentionVerifyText 意愿核身朗读模式使用的文案，若未使用意愿核身朗读功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
     */
    public void setIntentionVerifyText(String IntentionVerifyText) {
        this.IntentionVerifyText = IntentionVerifyText;
    }

    /**
     * Get 意愿核身问答模式的配置列表。当前仅支持一个问答。 
     * @return IntentionQuestions 意愿核身问答模式的配置列表。当前仅支持一个问答。
     */
    public IntentionQuestion [] getIntentionQuestions() {
        return this.IntentionQuestions;
    }

    /**
     * Set 意愿核身问答模式的配置列表。当前仅支持一个问答。
     * @param IntentionQuestions 意愿核身问答模式的配置列表。当前仅支持一个问答。
     */
    public void setIntentionQuestions(IntentionQuestion [] IntentionQuestions) {
        this.IntentionQuestions = IntentionQuestions;
    }

    /**
     * Get 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认不开启。 
     * @return IntentionRecognition 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认不开启。
     */
    public Boolean getIntentionRecognition() {
        return this.IntentionRecognition;
    }

    /**
     * Set 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认不开启。
     * @param IntentionRecognition 意愿核身过程中识别用户的回答意图，开启后除了IntentionQuestions的Answers列表中的标准回答会通过，近似意图的回答也会通过，默认不开启。
     */
    public void setIntentionRecognition(Boolean IntentionRecognition) {
        this.IntentionRecognition = IntentionRecognition;
    }

    public GetEidTokenConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEidTokenConfig(GetEidTokenConfig source) {
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.UseIntentionVerify != null) {
            this.UseIntentionVerify = new Boolean(source.UseIntentionVerify);
        }
        if (source.IntentionMode != null) {
            this.IntentionMode = new String(source.IntentionMode);
        }
        if (source.IntentionVerifyText != null) {
            this.IntentionVerifyText = new String(source.IntentionVerifyText);
        }
        if (source.IntentionQuestions != null) {
            this.IntentionQuestions = new IntentionQuestion[source.IntentionQuestions.length];
            for (int i = 0; i < source.IntentionQuestions.length; i++) {
                this.IntentionQuestions[i] = new IntentionQuestion(source.IntentionQuestions[i]);
            }
        }
        if (source.IntentionRecognition != null) {
            this.IntentionRecognition = new Boolean(source.IntentionRecognition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "UseIntentionVerify", this.UseIntentionVerify);
        this.setParamSimple(map, prefix + "IntentionMode", this.IntentionMode);
        this.setParamSimple(map, prefix + "IntentionVerifyText", this.IntentionVerifyText);
        this.setParamArrayObj(map, prefix + "IntentionQuestions.", this.IntentionQuestions);
        this.setParamSimple(map, prefix + "IntentionRecognition", this.IntentionRecognition);

    }
}

