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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLaunchTemplateVersionsResponse extends AbstractModel{

    /**
    * 实例启动模板总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 实例启动模板版本集合。
    */
    @SerializedName("LaunchTemplateVersionSet")
    @Expose
    private LaunchTemplateVersionInfo [] LaunchTemplateVersionSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例启动模板总数。 
     * @return TotalCount 实例启动模板总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 实例启动模板总数。
     * @param TotalCount 实例启动模板总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 实例启动模板版本集合。 
     * @return LaunchTemplateVersionSet 实例启动模板版本集合。
     */
    public LaunchTemplateVersionInfo [] getLaunchTemplateVersionSet() {
        return this.LaunchTemplateVersionSet;
    }

    /**
     * Set 实例启动模板版本集合。
     * @param LaunchTemplateVersionSet 实例启动模板版本集合。
     */
    public void setLaunchTemplateVersionSet(LaunchTemplateVersionInfo [] LaunchTemplateVersionSet) {
        this.LaunchTemplateVersionSet = LaunchTemplateVersionSet;
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

    public DescribeLaunchTemplateVersionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLaunchTemplateVersionsResponse(DescribeLaunchTemplateVersionsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.LaunchTemplateVersionSet != null) {
            this.LaunchTemplateVersionSet = new LaunchTemplateVersionInfo[source.LaunchTemplateVersionSet.length];
            for (int i = 0; i < source.LaunchTemplateVersionSet.length; i++) {
                this.LaunchTemplateVersionSet[i] = new LaunchTemplateVersionInfo(source.LaunchTemplateVersionSet[i]);
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
        this.setParamArrayObj(map, prefix + "LaunchTemplateVersionSet.", this.LaunchTemplateVersionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

