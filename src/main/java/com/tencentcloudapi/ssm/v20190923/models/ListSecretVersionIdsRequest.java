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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSecretVersionIdsRequest extends AbstractModel {

    /**
    * 凭据名称
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
     * Get 凭据名称 
     * @return SecretName 凭据名称
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 凭据名称
     * @param SecretName 凭据名称
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    public ListSecretVersionIdsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSecretVersionIdsRequest(ListSecretVersionIdsRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);

    }
}

