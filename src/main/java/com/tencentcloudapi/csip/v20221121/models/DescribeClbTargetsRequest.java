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

public class DescribeClbTargetsRequest extends AbstractModel {

    /**
    * <p>资产ID</p>
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

    /**
    * <p>目标类型</p><p>枚举值：</p><ul><li>listener： 监听器</li><li>rule： 七层规则</li></ul>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>资产ID</p> 
     * @return AssetID <p>资产ID</p>
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set <p>资产ID</p>
     * @param AssetID <p>资产ID</p>
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
    }

    /**
     * Get <p>目标类型</p><p>枚举值：</p><ul><li>listener： 监听器</li><li>rule： 七层规则</li></ul> 
     * @return TargetType <p>目标类型</p><p>枚举值：</p><ul><li>listener： 监听器</li><li>rule： 七层规则</li></ul>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>目标类型</p><p>枚举值：</p><ul><li>listener： 监听器</li><li>rule： 七层规则</li></ul>
     * @param TargetType <p>目标类型</p><p>枚举值：</p><ul><li>listener： 监听器</li><li>rule： 七层规则</li></ul>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
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

    public DescribeClbTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClbTargetsRequest(DescribeClbTargetsRequest source) {
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
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
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

