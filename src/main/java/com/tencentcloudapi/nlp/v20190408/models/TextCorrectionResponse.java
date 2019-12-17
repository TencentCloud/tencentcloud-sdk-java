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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextCorrectionResponse extends AbstractModel{

    /**
    * 纠错详情
    */
    @SerializedName("CCITokens")
    @Expose
    private CCIToken [] CCITokens;

    /**
    * 纠错后的文本
    */
    @SerializedName("ResultText")
    @Expose
    private String ResultText;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 纠错详情 
     * @return CCITokens 纠错详情
     */
    public CCIToken [] getCCITokens() {
        return this.CCITokens;
    }

    /**
     * Set 纠错详情
     * @param CCITokens 纠错详情
     */
    public void setCCITokens(CCIToken [] CCITokens) {
        this.CCITokens = CCITokens;
    }

    /**
     * Get 纠错后的文本 
     * @return ResultText 纠错后的文本
     */
    public String getResultText() {
        return this.ResultText;
    }

    /**
     * Set 纠错后的文本
     * @param ResultText 纠错后的文本
     */
    public void setResultText(String ResultText) {
        this.ResultText = ResultText;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CCITokens.", this.CCITokens);
        this.setParamSimple(map, prefix + "ResultText", this.ResultText);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

