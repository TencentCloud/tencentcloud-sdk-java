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

public class DescribeAssetRiskDetailRequest extends AbstractModel {

    /**
    * 资产唯一标识
    */
    @SerializedName("AssetRIDs")
    @Expose
    private String [] AssetRIDs;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get 资产唯一标识 
     * @return AssetRIDs 资产唯一标识
     */
    public String [] getAssetRIDs() {
        return this.AssetRIDs;
    }

    /**
     * Set 资产唯一标识
     * @param AssetRIDs 资产唯一标识
     */
    public void setAssetRIDs(String [] AssetRIDs) {
        this.AssetRIDs = AssetRIDs;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeAssetRiskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetRiskDetailRequest(DescribeAssetRiskDetailRequest source) {
        if (source.AssetRIDs != null) {
            this.AssetRIDs = new String[source.AssetRIDs.length];
            for (int i = 0; i < source.AssetRIDs.length; i++) {
                this.AssetRIDs[i] = new String(source.AssetRIDs[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetRIDs.", this.AssetRIDs);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

