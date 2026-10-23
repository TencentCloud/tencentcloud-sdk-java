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

public class DeleteUserKeyRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成
    */
    @SerializedName("KeyID")
    @Expose
    private String KeyID;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成 
     * @return KeyID 用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成
     */
    public String getKeyID() {
        return this.KeyID;
    }

    /**
     * Set 用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成
     * @param KeyID 用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成
     */
    public void setKeyID(String KeyID) {
        this.KeyID = KeyID;
    }

    public DeleteUserKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUserKeyRequest(DeleteUserKeyRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.KeyID != null) {
            this.KeyID = new String(source.KeyID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "KeyID", this.KeyID);

    }
}

