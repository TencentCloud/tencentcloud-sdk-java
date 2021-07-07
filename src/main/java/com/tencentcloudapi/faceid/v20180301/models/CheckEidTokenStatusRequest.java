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

public class CheckEidTokenStatusRequest extends AbstractModel{

    /**
    * E证通流程的唯一标识，调用GetEidToken接口时生成。
    */
    @SerializedName("EidToken")
    @Expose
    private String EidToken;

    /**
     * Get E证通流程的唯一标识，调用GetEidToken接口时生成。 
     * @return EidToken E证通流程的唯一标识，调用GetEidToken接口时生成。
     */
    public String getEidToken() {
        return this.EidToken;
    }

    /**
     * Set E证通流程的唯一标识，调用GetEidToken接口时生成。
     * @param EidToken E证通流程的唯一标识，调用GetEidToken接口时生成。
     */
    public void setEidToken(String EidToken) {
        this.EidToken = EidToken;
    }

    public CheckEidTokenStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckEidTokenStatusRequest(CheckEidTokenStatusRequest source) {
        if (source.EidToken != null) {
            this.EidToken = new String(source.EidToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EidToken", this.EidToken);

    }
}

