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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifySubOrganizationRequest extends AbstractModel{

    /**
    * 调用方信息，该接口SubOrganizationId必填
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * Get 调用方信息，该接口SubOrganizationId必填 
     * @return Caller 调用方信息，该接口SubOrganizationId必填
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息，该接口SubOrganizationId必填
     * @param Caller 调用方信息，该接口SubOrganizationId必填
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息 
     * @return OpenId 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
     * @param OpenId 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    public VerifySubOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifySubOrganizationRequest(VerifySubOrganizationRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

