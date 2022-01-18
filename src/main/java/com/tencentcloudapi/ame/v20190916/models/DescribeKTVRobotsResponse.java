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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVRobotsResponse extends AbstractModel{

    /**
    * 机器人总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 机器人信息集合。
    */
    @SerializedName("KTVRobotInfoSet")
    @Expose
    private KTVRobotInfo [] KTVRobotInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 机器人总数。 
     * @return TotalCount 机器人总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 机器人总数。
     * @param TotalCount 机器人总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 机器人信息集合。 
     * @return KTVRobotInfoSet 机器人信息集合。
     */
    public KTVRobotInfo [] getKTVRobotInfoSet() {
        return this.KTVRobotInfoSet;
    }

    /**
     * Set 机器人信息集合。
     * @param KTVRobotInfoSet 机器人信息集合。
     */
    public void setKTVRobotInfoSet(KTVRobotInfo [] KTVRobotInfoSet) {
        this.KTVRobotInfoSet = KTVRobotInfoSet;
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

    public DescribeKTVRobotsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVRobotsResponse(DescribeKTVRobotsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.KTVRobotInfoSet != null) {
            this.KTVRobotInfoSet = new KTVRobotInfo[source.KTVRobotInfoSet.length];
            for (int i = 0; i < source.KTVRobotInfoSet.length; i++) {
                this.KTVRobotInfoSet[i] = new KTVRobotInfo(source.KTVRobotInfoSet[i]);
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
        this.setParamArrayObj(map, prefix + "KTVRobotInfoSet.", this.KTVRobotInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

