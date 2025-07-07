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
package com.tencentcloudapi.ca.v20230228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVerifyReportRequest extends AbstractModel {

    /**
    * 签名id
    */
    @SerializedName("SignatureId")
    @Expose
    private String SignatureId;

    /**
     * Get 签名id 
     * @return SignatureId 签名id
     */
    public String getSignatureId() {
        return this.SignatureId;
    }

    /**
     * Set 签名id
     * @param SignatureId 签名id
     */
    public void setSignatureId(String SignatureId) {
        this.SignatureId = SignatureId;
    }

    public DescribeVerifyReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVerifyReportRequest(DescribeVerifyReportRequest source) {
        if (source.SignatureId != null) {
            this.SignatureId = new String(source.SignatureId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignatureId", this.SignatureId);

    }
}

