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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoScalingGroupLastActivitiesResponse extends AbstractModel {

    /**
    * 符合条件的伸缩活动信息集合。说明：伸缩组伸缩活动不存在的则不返回，如传50个伸缩组ID，返回45条数据，说明其中有5个伸缩组伸缩活动不存在。
    */
    @SerializedName("ActivitySet")
    @Expose
    private Activity [] ActivitySet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的伸缩活动信息集合。说明：伸缩组伸缩活动不存在的则不返回，如传50个伸缩组ID，返回45条数据，说明其中有5个伸缩组伸缩活动不存在。 
     * @return ActivitySet 符合条件的伸缩活动信息集合。说明：伸缩组伸缩活动不存在的则不返回，如传50个伸缩组ID，返回45条数据，说明其中有5个伸缩组伸缩活动不存在。
     */
    public Activity [] getActivitySet() {
        return this.ActivitySet;
    }

    /**
     * Set 符合条件的伸缩活动信息集合。说明：伸缩组伸缩活动不存在的则不返回，如传50个伸缩组ID，返回45条数据，说明其中有5个伸缩组伸缩活动不存在。
     * @param ActivitySet 符合条件的伸缩活动信息集合。说明：伸缩组伸缩活动不存在的则不返回，如传50个伸缩组ID，返回45条数据，说明其中有5个伸缩组伸缩活动不存在。
     */
    public void setActivitySet(Activity [] ActivitySet) {
        this.ActivitySet = ActivitySet;
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

    public DescribeAutoScalingGroupLastActivitiesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScalingGroupLastActivitiesResponse(DescribeAutoScalingGroupLastActivitiesResponse source) {
        if (source.ActivitySet != null) {
            this.ActivitySet = new Activity[source.ActivitySet.length];
            for (int i = 0; i < source.ActivitySet.length; i++) {
                this.ActivitySet[i] = new Activity(source.ActivitySet[i]);
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
        this.setParamArrayObj(map, prefix + "ActivitySet.", this.ActivitySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

