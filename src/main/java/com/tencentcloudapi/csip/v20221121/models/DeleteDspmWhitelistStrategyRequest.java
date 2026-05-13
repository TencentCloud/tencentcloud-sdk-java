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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDspmWhitelistStrategyRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 白名单id
    */
    @SerializedName("WhitelistStrategyId")
    @Expose
    private String [] WhitelistStrategyId;

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 白名单id 
     * @return WhitelistStrategyId 白名单id
     */
    public String [] getWhitelistStrategyId() {
        return this.WhitelistStrategyId;
    }

    /**
     * Set 白名单id
     * @param WhitelistStrategyId 白名单id
     */
    public void setWhitelistStrategyId(String [] WhitelistStrategyId) {
        this.WhitelistStrategyId = WhitelistStrategyId;
    }

    public DeleteDspmWhitelistStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDspmWhitelistStrategyRequest(DeleteDspmWhitelistStrategyRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.WhitelistStrategyId != null) {
            this.WhitelistStrategyId = new String[source.WhitelistStrategyId.length];
            for (int i = 0; i < source.WhitelistStrategyId.length; i++) {
                this.WhitelistStrategyId[i] = new String(source.WhitelistStrategyId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "WhitelistStrategyId.", this.WhitelistStrategyId);

    }
}

