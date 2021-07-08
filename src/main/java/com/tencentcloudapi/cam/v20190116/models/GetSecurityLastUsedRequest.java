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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSecurityLastUsedRequest extends AbstractModel{

    /**
    * 查询密钥ID列表
    */
    @SerializedName("SecretIdList")
    @Expose
    private String [] SecretIdList;

    /**
     * Get 查询密钥ID列表 
     * @return SecretIdList 查询密钥ID列表
     */
    public String [] getSecretIdList() {
        return this.SecretIdList;
    }

    /**
     * Set 查询密钥ID列表
     * @param SecretIdList 查询密钥ID列表
     */
    public void setSecretIdList(String [] SecretIdList) {
        this.SecretIdList = SecretIdList;
    }

    public GetSecurityLastUsedRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSecurityLastUsedRequest(GetSecurityLastUsedRequest source) {
        if (source.SecretIdList != null) {
            this.SecretIdList = new String[source.SecretIdList.length];
            for (int i = 0; i < source.SecretIdList.length; i++) {
                this.SecretIdList[i] = new String(source.SecretIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecretIdList.", this.SecretIdList);

    }
}

