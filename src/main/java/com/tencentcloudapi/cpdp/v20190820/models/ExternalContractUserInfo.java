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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalContractUserInfo extends AbstractModel{

    /**
    * 第三方用户类型，例如:  WX_OPENID, WX_SUB_OPENID,WX_PAYER_OPENID
    */
    @SerializedName("ExternalUserType")
    @Expose
    private String ExternalUserType;

    /**
    * 第三方用户ID
    */
    @SerializedName("ExternalUserId")
    @Expose
    private String ExternalUserId;

    /**
     * Get 第三方用户类型，例如:  WX_OPENID, WX_SUB_OPENID,WX_PAYER_OPENID 
     * @return ExternalUserType 第三方用户类型，例如:  WX_OPENID, WX_SUB_OPENID,WX_PAYER_OPENID
     */
    public String getExternalUserType() {
        return this.ExternalUserType;
    }

    /**
     * Set 第三方用户类型，例如:  WX_OPENID, WX_SUB_OPENID,WX_PAYER_OPENID
     * @param ExternalUserType 第三方用户类型，例如:  WX_OPENID, WX_SUB_OPENID,WX_PAYER_OPENID
     */
    public void setExternalUserType(String ExternalUserType) {
        this.ExternalUserType = ExternalUserType;
    }

    /**
     * Get 第三方用户ID 
     * @return ExternalUserId 第三方用户ID
     */
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    /**
     * Set 第三方用户ID
     * @param ExternalUserId 第三方用户ID
     */
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    public ExternalContractUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalContractUserInfo(ExternalContractUserInfo source) {
        if (source.ExternalUserType != null) {
            this.ExternalUserType = new String(source.ExternalUserType);
        }
        if (source.ExternalUserId != null) {
            this.ExternalUserId = new String(source.ExternalUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalUserType", this.ExternalUserType);
        this.setParamSimple(map, prefix + "ExternalUserId", this.ExternalUserId);

    }
}

