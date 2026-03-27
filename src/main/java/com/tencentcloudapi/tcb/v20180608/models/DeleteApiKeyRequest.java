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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteApiKeyRequest extends AbstractModel {

    /**
    * 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 密钥的唯一标识符，用于精确定位指定的 API 密钥。可通过查询密钥列表接口获取
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
     * Get 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离 
     * @return EnvId 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
     * @param EnvId 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 密钥的唯一标识符，用于精确定位指定的 API 密钥。可通过查询密钥列表接口获取 
     * @return KeyId 密钥的唯一标识符，用于精确定位指定的 API 密钥。可通过查询密钥列表接口获取
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥的唯一标识符，用于精确定位指定的 API 密钥。可通过查询密钥列表接口获取
     * @param KeyId 密钥的唯一标识符，用于精确定位指定的 API 密钥。可通过查询密钥列表接口获取
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    public DeleteApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteApiKeyRequest(DeleteApiKeyRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

