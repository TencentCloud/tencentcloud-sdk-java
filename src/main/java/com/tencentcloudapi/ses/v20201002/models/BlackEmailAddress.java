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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlackEmailAddress extends AbstractModel {

    /**
    * 邮箱被拉黑时间
    */
    @SerializedName("BounceTime")
    @Expose
    private String BounceTime;

    /**
    * 被拉黑的邮箱地址
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 被拉黑的理由
    */
    @SerializedName("IspDesc")
    @Expose
    private String IspDesc;

    /**
     * Get 邮箱被拉黑时间 
     * @return BounceTime 邮箱被拉黑时间
     */
    public String getBounceTime() {
        return this.BounceTime;
    }

    /**
     * Set 邮箱被拉黑时间
     * @param BounceTime 邮箱被拉黑时间
     */
    public void setBounceTime(String BounceTime) {
        this.BounceTime = BounceTime;
    }

    /**
     * Get 被拉黑的邮箱地址 
     * @return EmailAddress 被拉黑的邮箱地址
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 被拉黑的邮箱地址
     * @param EmailAddress 被拉黑的邮箱地址
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 被拉黑的理由 
     * @return IspDesc 被拉黑的理由
     */
    public String getIspDesc() {
        return this.IspDesc;
    }

    /**
     * Set 被拉黑的理由
     * @param IspDesc 被拉黑的理由
     */
    public void setIspDesc(String IspDesc) {
        this.IspDesc = IspDesc;
    }

    public BlackEmailAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlackEmailAddress(BlackEmailAddress source) {
        if (source.BounceTime != null) {
            this.BounceTime = new String(source.BounceTime);
        }
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
        if (source.IspDesc != null) {
            this.IspDesc = new String(source.IspDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BounceTime", this.BounceTime);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "IspDesc", this.IspDesc);

    }
}

