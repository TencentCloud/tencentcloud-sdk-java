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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectBodyJointsResponse extends AbstractModel{

    /**
    * 图中检测出的人体框和人体关键点， 包含14个人体关键点的坐标，建议根据人体框置信度筛选出合格的人体；
    */
    @SerializedName("BodyJointsResults")
    @Expose
    private BodyJointsResult [] BodyJointsResults;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 图中检测出的人体框和人体关键点， 包含14个人体关键点的坐标，建议根据人体框置信度筛选出合格的人体； 
     * @return BodyJointsResults 图中检测出的人体框和人体关键点， 包含14个人体关键点的坐标，建议根据人体框置信度筛选出合格的人体；
     */
    public BodyJointsResult [] getBodyJointsResults() {
        return this.BodyJointsResults;
    }

    /**
     * Set 图中检测出的人体框和人体关键点， 包含14个人体关键点的坐标，建议根据人体框置信度筛选出合格的人体；
     * @param BodyJointsResults 图中检测出的人体框和人体关键点， 包含14个人体关键点的坐标，建议根据人体框置信度筛选出合格的人体；
     */
    public void setBodyJointsResults(BodyJointsResult [] BodyJointsResults) {
        this.BodyJointsResults = BodyJointsResults;
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

    public DetectBodyJointsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectBodyJointsResponse(DetectBodyJointsResponse source) {
        if (source.BodyJointsResults != null) {
            this.BodyJointsResults = new BodyJointsResult[source.BodyJointsResults.length];
            for (int i = 0; i < source.BodyJointsResults.length; i++) {
                this.BodyJointsResults[i] = new BodyJointsResult(source.BodyJointsResults[i]);
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
        this.setParamArrayObj(map, prefix + "BodyJointsResults.", this.BodyJointsResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

