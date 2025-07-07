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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteImportedKeyMaterialRequest extends AbstractModel {

    /**
    * 指定需要删除密钥材料的EXTERNAL CMK。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
     * Get 指定需要删除密钥材料的EXTERNAL CMK。 
     * @return KeyId 指定需要删除密钥材料的EXTERNAL CMK。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 指定需要删除密钥材料的EXTERNAL CMK。
     * @param KeyId 指定需要删除密钥材料的EXTERNAL CMK。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    public DeleteImportedKeyMaterialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteImportedKeyMaterialRequest(DeleteImportedKeyMaterialRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

