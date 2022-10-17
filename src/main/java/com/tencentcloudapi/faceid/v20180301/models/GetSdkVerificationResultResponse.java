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

public class GetSdkVerificationResultResponse extends AbstractModel{

    /**
    * 整个核验结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 结果描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 计费次数
    */
    @SerializedName("ChargeCount")
    @Expose
    private Long ChargeCount;

    /**
    * 多次证照识别的结果（有序），取最终一次结果为有效结果
    */
    @SerializedName("CardVerifyResults")
    @Expose
    private CardVerifyResult [] CardVerifyResults;

    /**
    * 多次活体认证的结果信息（有序），取最终一次结果为有效结果
    */
    @SerializedName("CompareResults")
    @Expose
    private CompareResult [] CompareResults;

    /**
    * 获取token时传入的
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 整个核验结果 
     * @return Result 整个核验结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 整个核验结果
     * @param Result 整个核验结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 结果描述 
     * @return Description 结果描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 结果描述
     * @param Description 结果描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 计费次数 
     * @return ChargeCount 计费次数
     */
    public Long getChargeCount() {
        return this.ChargeCount;
    }

    /**
     * Set 计费次数
     * @param ChargeCount 计费次数
     */
    public void setChargeCount(Long ChargeCount) {
        this.ChargeCount = ChargeCount;
    }

    /**
     * Get 多次证照识别的结果（有序），取最终一次结果为有效结果 
     * @return CardVerifyResults 多次证照识别的结果（有序），取最终一次结果为有效结果
     */
    public CardVerifyResult [] getCardVerifyResults() {
        return this.CardVerifyResults;
    }

    /**
     * Set 多次证照识别的结果（有序），取最终一次结果为有效结果
     * @param CardVerifyResults 多次证照识别的结果（有序），取最终一次结果为有效结果
     */
    public void setCardVerifyResults(CardVerifyResult [] CardVerifyResults) {
        this.CardVerifyResults = CardVerifyResults;
    }

    /**
     * Get 多次活体认证的结果信息（有序），取最终一次结果为有效结果 
     * @return CompareResults 多次活体认证的结果信息（有序），取最终一次结果为有效结果
     */
    public CompareResult [] getCompareResults() {
        return this.CompareResults;
    }

    /**
     * Set 多次活体认证的结果信息（有序），取最终一次结果为有效结果
     * @param CompareResults 多次活体认证的结果信息（有序），取最终一次结果为有效结果
     */
    public void setCompareResults(CompareResult [] CompareResults) {
        this.CompareResults = CompareResults;
    }

    /**
     * Get 获取token时传入的 
     * @return Extra 获取token时传入的
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 获取token时传入的
     * @param Extra 获取token时传入的
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
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

    public GetSdkVerificationResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSdkVerificationResultResponse(GetSdkVerificationResultResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ChargeCount != null) {
            this.ChargeCount = new Long(source.ChargeCount);
        }
        if (source.CardVerifyResults != null) {
            this.CardVerifyResults = new CardVerifyResult[source.CardVerifyResults.length];
            for (int i = 0; i < source.CardVerifyResults.length; i++) {
                this.CardVerifyResults[i] = new CardVerifyResult(source.CardVerifyResults[i]);
            }
        }
        if (source.CompareResults != null) {
            this.CompareResults = new CompareResult[source.CompareResults.length];
            for (int i = 0; i < source.CompareResults.length; i++) {
                this.CompareResults[i] = new CompareResult(source.CompareResults[i]);
            }
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ChargeCount", this.ChargeCount);
        this.setParamArrayObj(map, prefix + "CardVerifyResults.", this.CardVerifyResults);
        this.setParamArrayObj(map, prefix + "CompareResults.", this.CompareResults);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

