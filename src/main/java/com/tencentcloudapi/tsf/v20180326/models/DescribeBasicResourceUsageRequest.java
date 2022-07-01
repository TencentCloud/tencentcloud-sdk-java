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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBasicResourceUsageRequest extends AbstractModel{

    /**
    * 是否无视权限查询全租户的，默认 true。注：无论 true 还是 false，PackageSpaceUsed 和 ConsulInstanceCount  都是全租户的
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
     * Get 是否无视权限查询全租户的，默认 true。注：无论 true 还是 false，PackageSpaceUsed 和 ConsulInstanceCount  都是全租户的 
     * @return All 是否无视权限查询全租户的，默认 true。注：无论 true 还是 false，PackageSpaceUsed 和 ConsulInstanceCount  都是全租户的
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否无视权限查询全租户的，默认 true。注：无论 true 还是 false，PackageSpaceUsed 和 ConsulInstanceCount  都是全租户的
     * @param All 是否无视权限查询全租户的，默认 true。注：无论 true 还是 false，PackageSpaceUsed 和 ConsulInstanceCount  都是全租户的
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    public DescribeBasicResourceUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBasicResourceUsageRequest(DescribeBasicResourceUsageRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);

    }
}

