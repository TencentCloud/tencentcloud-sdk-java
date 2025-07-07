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

public class DescribeAndroidInstanceLabelsResponse extends AbstractModel {

    /**
    * 安卓实例标签总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 安卓实例标签列表
    */
    @SerializedName("Labels")
    @Expose
    private AndroidInstanceLabel [] Labels;

    /**
    * 安卓实例标签详情列表
    */
    @SerializedName("AndroidInstanceLabels")
    @Expose
    private AndroidInstanceLabelDetail [] AndroidInstanceLabels;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 安卓实例标签总数 
     * @return Total 安卓实例标签总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 安卓实例标签总数
     * @param Total 安卓实例标签总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 安卓实例标签列表 
     * @return Labels 安卓实例标签列表
     * @deprecated
     */
    @Deprecated
    public AndroidInstanceLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 安卓实例标签列表
     * @param Labels 安卓实例标签列表
     * @deprecated
     */
    @Deprecated
    public void setLabels(AndroidInstanceLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 安卓实例标签详情列表 
     * @return AndroidInstanceLabels 安卓实例标签详情列表
     */
    public AndroidInstanceLabelDetail [] getAndroidInstanceLabels() {
        return this.AndroidInstanceLabels;
    }

    /**
     * Set 安卓实例标签详情列表
     * @param AndroidInstanceLabels 安卓实例标签详情列表
     */
    public void setAndroidInstanceLabels(AndroidInstanceLabelDetail [] AndroidInstanceLabels) {
        this.AndroidInstanceLabels = AndroidInstanceLabels;
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

    public DescribeAndroidInstanceLabelsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAndroidInstanceLabelsResponse(DescribeAndroidInstanceLabelsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Labels != null) {
            this.Labels = new AndroidInstanceLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AndroidInstanceLabel(source.Labels[i]);
            }
        }
        if (source.AndroidInstanceLabels != null) {
            this.AndroidInstanceLabels = new AndroidInstanceLabelDetail[source.AndroidInstanceLabels.length];
            for (int i = 0; i < source.AndroidInstanceLabels.length; i++) {
                this.AndroidInstanceLabels[i] = new AndroidInstanceLabelDetail(source.AndroidInstanceLabels[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "AndroidInstanceLabels.", this.AndroidInstanceLabels);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

