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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwSecretKeyList extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 密钥列表
    */
    @SerializedName("SecretKeys")
    @Expose
    private CNAPIGwSecretKey [] SecretKeys;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 密钥列表 
     * @return SecretKeys 密钥列表
     */
    public CNAPIGwSecretKey [] getSecretKeys() {
        return this.SecretKeys;
    }

    /**
     * Set 密钥列表
     * @param SecretKeys 密钥列表
     */
    public void setSecretKeys(CNAPIGwSecretKey [] SecretKeys) {
        this.SecretKeys = SecretKeys;
    }

    public CNAPIGwSecretKeyList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwSecretKeyList(CNAPIGwSecretKeyList source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SecretKeys != null) {
            this.SecretKeys = new CNAPIGwSecretKey[source.SecretKeys.length];
            for (int i = 0; i < source.SecretKeys.length; i++) {
                this.SecretKeys[i] = new CNAPIGwSecretKey(source.SecretKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SecretKeys.", this.SecretKeys);

    }
}

