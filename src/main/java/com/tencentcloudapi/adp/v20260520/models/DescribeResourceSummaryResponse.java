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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceSummaryResponse extends AbstractModel {

    /**
    * <p>计费套餐包用量信息</p>
    */
    @SerializedName("ResourcePackage")
    @Expose
    private ResourcePackageInfo ResourcePackage;

    /**
    * <p>计费增值包用量信息</p>
    */
    @SerializedName("AddOnPackage")
    @Expose
    private AddOnPackageInfo AddOnPackage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>计费套餐包用量信息</p> 
     * @return ResourcePackage <p>计费套餐包用量信息</p>
     */
    public ResourcePackageInfo getResourcePackage() {
        return this.ResourcePackage;
    }

    /**
     * Set <p>计费套餐包用量信息</p>
     * @param ResourcePackage <p>计费套餐包用量信息</p>
     */
    public void setResourcePackage(ResourcePackageInfo ResourcePackage) {
        this.ResourcePackage = ResourcePackage;
    }

    /**
     * Get <p>计费增值包用量信息</p> 
     * @return AddOnPackage <p>计费增值包用量信息</p>
     */
    public AddOnPackageInfo getAddOnPackage() {
        return this.AddOnPackage;
    }

    /**
     * Set <p>计费增值包用量信息</p>
     * @param AddOnPackage <p>计费增值包用量信息</p>
     */
    public void setAddOnPackage(AddOnPackageInfo AddOnPackage) {
        this.AddOnPackage = AddOnPackage;
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

    public DescribeResourceSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceSummaryResponse(DescribeResourceSummaryResponse source) {
        if (source.ResourcePackage != null) {
            this.ResourcePackage = new ResourcePackageInfo(source.ResourcePackage);
        }
        if (source.AddOnPackage != null) {
            this.AddOnPackage = new AddOnPackageInfo(source.AddOnPackage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ResourcePackage.", this.ResourcePackage);
        this.setParamObj(map, prefix + "AddOnPackage.", this.AddOnPackage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

