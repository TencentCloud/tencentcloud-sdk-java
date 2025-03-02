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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HasAuthUser extends AbstractModel {

    /**
    * 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。


    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * Get 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。

 
     * @return OpenId 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。


     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。


     * @param OpenId 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。


     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    public HasAuthUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HasAuthUser(HasAuthUser source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

