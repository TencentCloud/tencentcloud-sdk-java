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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAndroidInstanceMCPTokenRequest extends AbstractModel {

    /**
    * <p>内部 ID，格式 k_ + 16 位 hex</p>
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
     * Get <p>内部 ID，格式 k_ + 16 位 hex</p> 
     * @return TokenId <p>内部 ID，格式 k_ + 16 位 hex</p>
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set <p>内部 ID，格式 k_ + 16 位 hex</p>
     * @param TokenId <p>内部 ID，格式 k_ + 16 位 hex</p>
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    public DeleteAndroidInstanceMCPTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAndroidInstanceMCPTokenRequest(DeleteAndroidInstanceMCPTokenRequest source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);

    }
}

