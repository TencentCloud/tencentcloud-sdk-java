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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsSign extends AbstractModel{

    /**
    * 短信签名ID
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 短信签名名称
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
     * Get 短信签名ID 
     * @return SignId 短信签名ID
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 短信签名ID
     * @param SignId 短信签名ID
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 短信签名名称 
     * @return SignName 短信签名名称
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set 短信签名名称
     * @param SignName 短信签名名称
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    public SmsSign() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsSign(SmsSign source) {
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "SignName", this.SignName);

    }
}

