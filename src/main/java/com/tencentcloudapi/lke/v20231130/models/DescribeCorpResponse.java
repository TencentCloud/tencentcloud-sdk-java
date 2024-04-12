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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCorpResponse extends AbstractModel {

    /**
    * 企业ID

    */
    @SerializedName("CorpBizId")
    @Expose
    private String CorpBizId;

    /**
    * 机器人配额

    */
    @SerializedName("RobotQuota")
    @Expose
    private Long RobotQuota;

    /**
    * 企业全称

    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 企业ID
 
     * @return CorpBizId 企业ID

     */
    public String getCorpBizId() {
        return this.CorpBizId;
    }

    /**
     * Set 企业ID

     * @param CorpBizId 企业ID

     */
    public void setCorpBizId(String CorpBizId) {
        this.CorpBizId = CorpBizId;
    }

    /**
     * Get 机器人配额
 
     * @return RobotQuota 机器人配额

     */
    public Long getRobotQuota() {
        return this.RobotQuota;
    }

    /**
     * Set 机器人配额

     * @param RobotQuota 机器人配额

     */
    public void setRobotQuota(Long RobotQuota) {
        this.RobotQuota = RobotQuota;
    }

    /**
     * Get 企业全称
 
     * @return FullName 企业全称

     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set 企业全称

     * @param FullName 企业全称

     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
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

    public DescribeCorpResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCorpResponse(DescribeCorpResponse source) {
        if (source.CorpBizId != null) {
            this.CorpBizId = new String(source.CorpBizId);
        }
        if (source.RobotQuota != null) {
            this.RobotQuota = new Long(source.RobotQuota);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpBizId", this.CorpBizId);
        this.setParamSimple(map, prefix + "RobotQuota", this.RobotQuota);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

