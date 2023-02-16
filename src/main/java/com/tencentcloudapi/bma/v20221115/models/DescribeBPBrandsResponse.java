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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBPBrandsResponse extends AbstractModel{

    /**
    * 品牌信息
    */
    @SerializedName("Brands")
    @Expose
    private BrandData [] Brands;

    /**
    * 品牌审核通知栏状态：0 不显示 1 显示
    */
    @SerializedName("NoticeStatus")
    @Expose
    private Long NoticeStatus;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 品牌信息 
     * @return Brands 品牌信息
     */
    public BrandData [] getBrands() {
        return this.Brands;
    }

    /**
     * Set 品牌信息
     * @param Brands 品牌信息
     */
    public void setBrands(BrandData [] Brands) {
        this.Brands = Brands;
    }

    /**
     * Get 品牌审核通知栏状态：0 不显示 1 显示 
     * @return NoticeStatus 品牌审核通知栏状态：0 不显示 1 显示
     */
    public Long getNoticeStatus() {
        return this.NoticeStatus;
    }

    /**
     * Set 品牌审核通知栏状态：0 不显示 1 显示
     * @param NoticeStatus 品牌审核通知栏状态：0 不显示 1 显示
     */
    public void setNoticeStatus(Long NoticeStatus) {
        this.NoticeStatus = NoticeStatus;
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

    public DescribeBPBrandsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBPBrandsResponse(DescribeBPBrandsResponse source) {
        if (source.Brands != null) {
            this.Brands = new BrandData[source.Brands.length];
            for (int i = 0; i < source.Brands.length; i++) {
                this.Brands[i] = new BrandData(source.Brands[i]);
            }
        }
        if (source.NoticeStatus != null) {
            this.NoticeStatus = new Long(source.NoticeStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Brands.", this.Brands);
        this.setParamSimple(map, prefix + "NoticeStatus", this.NoticeStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

