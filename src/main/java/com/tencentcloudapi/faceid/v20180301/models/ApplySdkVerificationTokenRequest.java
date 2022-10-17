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

public class ApplySdkVerificationTokenRequest extends AbstractModel{

    /**
    * 是否需要身份证鉴伪，如果不需要，则仅做证件OCR。当前仅IdCardType为HK支持鉴伪。
    */
    @SerializedName("NeedVerifyIdCard")
    @Expose
    private Boolean NeedVerifyIdCard;

    /**
    * 卡证类型，当前仅支持HK（香港身份证），ML（马来西亚身份证），PhilippinesVoteID（菲律宾选民卡），PhilippinesDrivingLicense（菲律宾驾驶证）。默认为HK。
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 是否允许用户修改ocr结果，默认false，允许。
    */
    @SerializedName("DisableChangeOcrResult")
    @Expose
    private Boolean DisableChangeOcrResult;

    /**
    * 是否关闭OCR告警，默认false，不关闭。如果为false开启OCR告警，我们会根据Ocr的告警信息进行拦截，当NeedVerifyIdCard为true时该字段将为true。
    */
    @SerializedName("DisableCheckOcrWarnings")
    @Expose
    private Boolean DisableCheckOcrWarnings;

    /**
    * 透传字段，在获取验证结果时返回，最长1024位。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get 是否需要身份证鉴伪，如果不需要，则仅做证件OCR。当前仅IdCardType为HK支持鉴伪。 
     * @return NeedVerifyIdCard 是否需要身份证鉴伪，如果不需要，则仅做证件OCR。当前仅IdCardType为HK支持鉴伪。
     */
    public Boolean getNeedVerifyIdCard() {
        return this.NeedVerifyIdCard;
    }

    /**
     * Set 是否需要身份证鉴伪，如果不需要，则仅做证件OCR。当前仅IdCardType为HK支持鉴伪。
     * @param NeedVerifyIdCard 是否需要身份证鉴伪，如果不需要，则仅做证件OCR。当前仅IdCardType为HK支持鉴伪。
     */
    public void setNeedVerifyIdCard(Boolean NeedVerifyIdCard) {
        this.NeedVerifyIdCard = NeedVerifyIdCard;
    }

    /**
     * Get 卡证类型，当前仅支持HK（香港身份证），ML（马来西亚身份证），PhilippinesVoteID（菲律宾选民卡），PhilippinesDrivingLicense（菲律宾驾驶证）。默认为HK。 
     * @return IdCardType 卡证类型，当前仅支持HK（香港身份证），ML（马来西亚身份证），PhilippinesVoteID（菲律宾选民卡），PhilippinesDrivingLicense（菲律宾驾驶证）。默认为HK。
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 卡证类型，当前仅支持HK（香港身份证），ML（马来西亚身份证），PhilippinesVoteID（菲律宾选民卡），PhilippinesDrivingLicense（菲律宾驾驶证）。默认为HK。
     * @param IdCardType 卡证类型，当前仅支持HK（香港身份证），ML（马来西亚身份证），PhilippinesVoteID（菲律宾选民卡），PhilippinesDrivingLicense（菲律宾驾驶证）。默认为HK。
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 是否允许用户修改ocr结果，默认false，允许。 
     * @return DisableChangeOcrResult 是否允许用户修改ocr结果，默认false，允许。
     */
    public Boolean getDisableChangeOcrResult() {
        return this.DisableChangeOcrResult;
    }

    /**
     * Set 是否允许用户修改ocr结果，默认false，允许。
     * @param DisableChangeOcrResult 是否允许用户修改ocr结果，默认false，允许。
     */
    public void setDisableChangeOcrResult(Boolean DisableChangeOcrResult) {
        this.DisableChangeOcrResult = DisableChangeOcrResult;
    }

    /**
     * Get 是否关闭OCR告警，默认false，不关闭。如果为false开启OCR告警，我们会根据Ocr的告警信息进行拦截，当NeedVerifyIdCard为true时该字段将为true。 
     * @return DisableCheckOcrWarnings 是否关闭OCR告警，默认false，不关闭。如果为false开启OCR告警，我们会根据Ocr的告警信息进行拦截，当NeedVerifyIdCard为true时该字段将为true。
     */
    public Boolean getDisableCheckOcrWarnings() {
        return this.DisableCheckOcrWarnings;
    }

    /**
     * Set 是否关闭OCR告警，默认false，不关闭。如果为false开启OCR告警，我们会根据Ocr的告警信息进行拦截，当NeedVerifyIdCard为true时该字段将为true。
     * @param DisableCheckOcrWarnings 是否关闭OCR告警，默认false，不关闭。如果为false开启OCR告警，我们会根据Ocr的告警信息进行拦截，当NeedVerifyIdCard为true时该字段将为true。
     */
    public void setDisableCheckOcrWarnings(Boolean DisableCheckOcrWarnings) {
        this.DisableCheckOcrWarnings = DisableCheckOcrWarnings;
    }

    /**
     * Get 透传字段，在获取验证结果时返回，最长1024位。 
     * @return Extra 透传字段，在获取验证结果时返回，最长1024位。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传字段，在获取验证结果时返回，最长1024位。
     * @param Extra 透传字段，在获取验证结果时返回，最长1024位。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public ApplySdkVerificationTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplySdkVerificationTokenRequest(ApplySdkVerificationTokenRequest source) {
        if (source.NeedVerifyIdCard != null) {
            this.NeedVerifyIdCard = new Boolean(source.NeedVerifyIdCard);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.DisableChangeOcrResult != null) {
            this.DisableChangeOcrResult = new Boolean(source.DisableChangeOcrResult);
        }
        if (source.DisableCheckOcrWarnings != null) {
            this.DisableCheckOcrWarnings = new Boolean(source.DisableCheckOcrWarnings);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NeedVerifyIdCard", this.NeedVerifyIdCard);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "DisableChangeOcrResult", this.DisableChangeOcrResult);
        this.setParamSimple(map, prefix + "DisableCheckOcrWarnings", this.DisableCheckOcrWarnings);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

