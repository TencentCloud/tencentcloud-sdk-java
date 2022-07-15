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
    * 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
    */
    @SerializedName("IntentionVerifyText")
    @Expose
    private String IntentionVerifyText;

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
     * Get 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。 
     * @return IntentionVerifyText 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
     */
    public String getIntentionVerifyText() {
        return this.IntentionVerifyText;
    }

    /**
     * Set 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
     * @param IntentionVerifyText 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
     */
    public void setIntentionVerifyText(String IntentionVerifyText) {
        this.IntentionVerifyText = IntentionVerifyText;
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
        if (source.IntentionVerifyText != null) {
            this.IntentionVerifyText = new String(source.IntentionVerifyText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "UseIntentionVerify", this.UseIntentionVerify);
        this.setParamSimple(map, prefix + "IntentionVerifyText", this.IntentionVerifyText);

    }
}

