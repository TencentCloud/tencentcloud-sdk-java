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

public class DescribePlatformCreditsUsageRequest extends AbstractModel {

    /**
    * <p>开始日期</p><p>参数格式：2025-09-22</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>结束日期</p><p>参数格式：2025-09-22</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>平台版套餐id</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get <p>开始日期</p><p>参数格式：2025-09-22</p> 
     * @return StartDate <p>开始日期</p><p>参数格式：2025-09-22</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>开始日期</p><p>参数格式：2025-09-22</p>
     * @param StartDate <p>开始日期</p><p>参数格式：2025-09-22</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>结束日期</p><p>参数格式：2025-09-22</p> 
     * @return EndDate <p>结束日期</p><p>参数格式：2025-09-22</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>结束日期</p><p>参数格式：2025-09-22</p>
     * @param EndDate <p>结束日期</p><p>参数格式：2025-09-22</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>平台版套餐id</p> 
     * @return PlatformId <p>平台版套餐id</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>平台版套餐id</p>
     * @param PlatformId <p>平台版套餐id</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public DescribePlatformCreditsUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlatformCreditsUsageRequest(DescribePlatformCreditsUsageRequest source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}

