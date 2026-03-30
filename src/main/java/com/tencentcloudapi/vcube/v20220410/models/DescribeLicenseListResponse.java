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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseListResponse extends AbstractModel {

    /**
    * 临期license数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 正式license总览统计数据
    */
    @SerializedName("Overview")
    @Expose
    private Overview Overview;

    /**
    * 临期license列表
    */
    @SerializedName("LicenseList")
    @Expose
    private OverviewLicense [] LicenseList;

    /**
    * 测试license总览统计数据
    */
    @SerializedName("TrialOverview")
    @Expose
    private Overview TrialOverview;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 临期license数量 
     * @return Count 临期license数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 临期license数量
     * @param Count 临期license数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 正式license总览统计数据 
     * @return Overview 正式license总览统计数据
     */
    public Overview getOverview() {
        return this.Overview;
    }

    /**
     * Set 正式license总览统计数据
     * @param Overview 正式license总览统计数据
     */
    public void setOverview(Overview Overview) {
        this.Overview = Overview;
    }

    /**
     * Get 临期license列表 
     * @return LicenseList 临期license列表
     */
    public OverviewLicense [] getLicenseList() {
        return this.LicenseList;
    }

    /**
     * Set 临期license列表
     * @param LicenseList 临期license列表
     */
    public void setLicenseList(OverviewLicense [] LicenseList) {
        this.LicenseList = LicenseList;
    }

    /**
     * Get 测试license总览统计数据 
     * @return TrialOverview 测试license总览统计数据
     */
    public Overview getTrialOverview() {
        return this.TrialOverview;
    }

    /**
     * Set 测试license总览统计数据
     * @param TrialOverview 测试license总览统计数据
     */
    public void setTrialOverview(Overview TrialOverview) {
        this.TrialOverview = TrialOverview;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLicenseListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseListResponse(DescribeLicenseListResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Overview != null) {
            this.Overview = new Overview(source.Overview);
        }
        if (source.LicenseList != null) {
            this.LicenseList = new OverviewLicense[source.LicenseList.length];
            for (int i = 0; i < source.LicenseList.length; i++) {
                this.LicenseList[i] = new OverviewLicense(source.LicenseList[i]);
            }
        }
        if (source.TrialOverview != null) {
            this.TrialOverview = new Overview(source.TrialOverview);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "Overview.", this.Overview);
        this.setParamArrayObj(map, prefix + "LicenseList.", this.LicenseList);
        this.setParamObj(map, prefix + "TrialOverview.", this.TrialOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

