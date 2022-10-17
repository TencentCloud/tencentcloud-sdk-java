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

public class GetWebVerificationResultRequest extends AbstractModel{

    /**
    * Web核验令牌，由ApplyWebVerificationToken接口生成。
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
     * Get Web核验令牌，由ApplyWebVerificationToken接口生成。 
     * @return BizToken Web核验令牌，由ApplyWebVerificationToken接口生成。
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * Set Web核验令牌，由ApplyWebVerificationToken接口生成。
     * @param BizToken Web核验令牌，由ApplyWebVerificationToken接口生成。
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
    }

    public GetWebVerificationResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWebVerificationResultRequest(GetWebVerificationResultRequest source) {
        if (source.BizToken != null) {
            this.BizToken = new String(source.BizToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);

    }
}

