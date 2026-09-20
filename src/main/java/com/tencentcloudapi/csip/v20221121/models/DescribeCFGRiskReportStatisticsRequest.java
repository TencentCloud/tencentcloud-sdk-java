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

public class DescribeCFGRiskReportStatisticsRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>规范ID</p>
    */
    @SerializedName("StandardIDs")
    @Expose
    private Long [] StandardIDs;

    /**
    * <p>资产标签ID</p>
    */
    @SerializedName("AssetTagIDs")
    @Expose
    private Long [] AssetTagIDs;

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

    /**
     * Get <p>规范ID</p> 
     * @return StandardIDs <p>规范ID</p>
     */
    public Long [] getStandardIDs() {
        return this.StandardIDs;
    }

    /**
     * Set <p>规范ID</p>
     * @param StandardIDs <p>规范ID</p>
     */
    public void setStandardIDs(Long [] StandardIDs) {
        this.StandardIDs = StandardIDs;
    }

    /**
     * Get <p>资产标签ID</p> 
     * @return AssetTagIDs <p>资产标签ID</p>
     */
    public Long [] getAssetTagIDs() {
        return this.AssetTagIDs;
    }

    /**
     * Set <p>资产标签ID</p>
     * @param AssetTagIDs <p>资产标签ID</p>
     */
    public void setAssetTagIDs(Long [] AssetTagIDs) {
        this.AssetTagIDs = AssetTagIDs;
    }

    public DescribeCFGRiskReportStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCFGRiskReportStatisticsRequest(DescribeCFGRiskReportStatisticsRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.StandardIDs != null) {
            this.StandardIDs = new Long[source.StandardIDs.length];
            for (int i = 0; i < source.StandardIDs.length; i++) {
                this.StandardIDs[i] = new Long(source.StandardIDs[i]);
            }
        }
        if (source.AssetTagIDs != null) {
            this.AssetTagIDs = new Long[source.AssetTagIDs.length];
            for (int i = 0; i < source.AssetTagIDs.length; i++) {
                this.AssetTagIDs[i] = new Long(source.AssetTagIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "StandardIDs.", this.StandardIDs);
        this.setParamArraySimple(map, prefix + "AssetTagIDs.", this.AssetTagIDs);

    }
}

