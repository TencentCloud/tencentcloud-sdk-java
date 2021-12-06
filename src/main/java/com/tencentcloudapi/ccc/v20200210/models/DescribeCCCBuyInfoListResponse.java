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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCCBuyInfoListResponse extends AbstractModel{

    /**
    * 应用总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 应用购买信息列表
    */
    @SerializedName("SdkAppIdBuyList")
    @Expose
    private SdkAppIdBuyInfo [] SdkAppIdBuyList;

    /**
    * 套餐包购买信息列表
    */
    @SerializedName("PackageBuyList")
    @Expose
    private PackageBuyInfo [] PackageBuyList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用总数 
     * @return TotalCount 应用总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 应用总数
     * @param TotalCount 应用总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 应用购买信息列表 
     * @return SdkAppIdBuyList 应用购买信息列表
     */
    public SdkAppIdBuyInfo [] getSdkAppIdBuyList() {
        return this.SdkAppIdBuyList;
    }

    /**
     * Set 应用购买信息列表
     * @param SdkAppIdBuyList 应用购买信息列表
     */
    public void setSdkAppIdBuyList(SdkAppIdBuyInfo [] SdkAppIdBuyList) {
        this.SdkAppIdBuyList = SdkAppIdBuyList;
    }

    /**
     * Get 套餐包购买信息列表 
     * @return PackageBuyList 套餐包购买信息列表
     */
    public PackageBuyInfo [] getPackageBuyList() {
        return this.PackageBuyList;
    }

    /**
     * Set 套餐包购买信息列表
     * @param PackageBuyList 套餐包购买信息列表
     */
    public void setPackageBuyList(PackageBuyInfo [] PackageBuyList) {
        this.PackageBuyList = PackageBuyList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCCCBuyInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCCBuyInfoListResponse(DescribeCCCBuyInfoListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SdkAppIdBuyList != null) {
            this.SdkAppIdBuyList = new SdkAppIdBuyInfo[source.SdkAppIdBuyList.length];
            for (int i = 0; i < source.SdkAppIdBuyList.length; i++) {
                this.SdkAppIdBuyList[i] = new SdkAppIdBuyInfo(source.SdkAppIdBuyList[i]);
            }
        }
        if (source.PackageBuyList != null) {
            this.PackageBuyList = new PackageBuyInfo[source.PackageBuyList.length];
            for (int i = 0; i < source.PackageBuyList.length; i++) {
                this.PackageBuyList[i] = new PackageBuyInfo(source.PackageBuyList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SdkAppIdBuyList.", this.SdkAppIdBuyList);
        this.setParamArrayObj(map, prefix + "PackageBuyList.", this.PackageBuyList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

