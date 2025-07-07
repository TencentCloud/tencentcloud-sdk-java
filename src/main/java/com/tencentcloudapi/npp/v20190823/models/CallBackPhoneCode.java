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
package com.tencentcloudapi.npp.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallBackPhoneCode extends AbstractModel {

    /**
    * 国家码，统一以 00 开头
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 号码（固话区号前加 0，如075586013388）
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
     * Get 国家码，统一以 00 开头 
     * @return Nation 国家码，统一以 00 开头
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set 国家码，统一以 00 开头
     * @param Nation 国家码，统一以 00 开头
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 号码（固话区号前加 0，如075586013388） 
     * @return Phone 号码（固话区号前加 0，如075586013388）
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 号码（固话区号前加 0，如075586013388）
     * @param Phone 号码（固话区号前加 0，如075586013388）
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public CallBackPhoneCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallBackPhoneCode(CallBackPhoneCode source) {
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Phone", this.Phone);

    }
}

