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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySignStatus extends AbstractModel {

    /**
    * 签名Id
    */
    @SerializedName("SignId")
    @Expose
    private Long SignId;

    /**
    * 签名修改申请Id
    */
    @SerializedName("SignApplyId")
    @Expose
    private String SignApplyId;

    /**
     * Get 签名Id 
     * @return SignId 签名Id
     */
    public Long getSignId() {
        return this.SignId;
    }

    /**
     * Set 签名Id
     * @param SignId 签名Id
     */
    public void setSignId(Long SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 签名修改申请Id 
     * @return SignApplyId 签名修改申请Id
     */
    public String getSignApplyId() {
        return this.SignApplyId;
    }

    /**
     * Set 签名修改申请Id
     * @param SignApplyId 签名修改申请Id
     */
    public void setSignApplyId(String SignApplyId) {
        this.SignApplyId = SignApplyId;
    }

    public ModifySignStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySignStatus(ModifySignStatus source) {
        if (source.SignId != null) {
            this.SignId = new Long(source.SignId);
        }
        if (source.SignApplyId != null) {
            this.SignApplyId = new String(source.SignApplyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "SignApplyId", this.SignApplyId);

    }
}

