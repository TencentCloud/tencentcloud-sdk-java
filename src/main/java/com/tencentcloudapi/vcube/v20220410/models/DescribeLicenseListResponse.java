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
    * <p>临期license数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>正式license总览统计数据</p>
    */
    @SerializedName("Overview")
    @Expose
    private Overview Overview;

    /**
    * <p>临期license列表</p>
    */
    @SerializedName("LicenseList")
    @Expose
    private OverviewLicense [] LicenseList;

    /**
    * <p>测试license总览统计数据</p>
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
     * Get <p>临期license数量</p> 
     * @return Count <p>临期license数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>临期license数量</p>
     * @param Count <p>临期license数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>正式license总览统计数据</p> 
     * @return Overview <p>正式license总览统计数据</p>
     */
    public Overview getOverview() {
        return this.Overview;
    }

    /**
     * Set <p>正式license总览统计数据</p>
     * @param Overview <p>正式license总览统计数据</p>
     */
    public void setOverview(Overview Overview) {
        this.Overview = Overview;
    }

    /**
     * Get <p>临期license列表</p> 
     * @return LicenseList <p>临期license列表</p>
     */
    public OverviewLicense [] getLicenseList() {
        return this.LicenseList;
    }

    /**
     * Set <p>临期license列表</p>
     * @param LicenseList <p>临期license列表</p>
     */
    public void setLicenseList(OverviewLicense [] LicenseList) {
        this.LicenseList = LicenseList;
    }

    /**
     * Get <p>测试license总览统计数据</p> 
     * @return TrialOverview <p>测试license总览统计数据</p>
     */
    public Overview getTrialOverview() {
        return this.TrialOverview;
    }

    /**
     * Set <p>测试license总览统计数据</p>
     * @param TrialOverview <p>测试license总览统计数据</p>
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

