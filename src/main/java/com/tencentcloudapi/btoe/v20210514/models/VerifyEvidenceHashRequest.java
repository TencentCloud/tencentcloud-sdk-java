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
package com.tencentcloudapi.btoe.v20210514.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyEvidenceHashRequest extends AbstractModel{

    /**
    * 存证内容hash，hash类型即为用户在存证时所用或所选的hash类型
    */
    @SerializedName("EvidenceHash")
    @Expose
    private String EvidenceHash;

    /**
     * Get 存证内容hash，hash类型即为用户在存证时所用或所选的hash类型 
     * @return EvidenceHash 存证内容hash，hash类型即为用户在存证时所用或所选的hash类型
     */
    public String getEvidenceHash() {
        return this.EvidenceHash;
    }

    /**
     * Set 存证内容hash，hash类型即为用户在存证时所用或所选的hash类型
     * @param EvidenceHash 存证内容hash，hash类型即为用户在存证时所用或所选的hash类型
     */
    public void setEvidenceHash(String EvidenceHash) {
        this.EvidenceHash = EvidenceHash;
    }

    public VerifyEvidenceHashRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyEvidenceHashRequest(VerifyEvidenceHashRequest source) {
        if (source.EvidenceHash != null) {
            this.EvidenceHash = new String(source.EvidenceHash);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvidenceHash", this.EvidenceHash);

    }
}

