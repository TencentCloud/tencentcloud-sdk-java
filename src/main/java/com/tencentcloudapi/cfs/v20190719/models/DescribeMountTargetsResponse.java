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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMountTargetsResponse extends AbstractModel{

    /**
    * 挂载点详情
    */
    @SerializedName("MountTargets")
    @Expose
    private MountInfo [] MountTargets;

    /**
    * 挂载点数量
    */
    @SerializedName("NumberOfMountTargets")
    @Expose
    private Long NumberOfMountTargets;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 挂载点详情 
     * @return MountTargets 挂载点详情
     */
    public MountInfo [] getMountTargets() {
        return this.MountTargets;
    }

    /**
     * Set 挂载点详情
     * @param MountTargets 挂载点详情
     */
    public void setMountTargets(MountInfo [] MountTargets) {
        this.MountTargets = MountTargets;
    }

    /**
     * Get 挂载点数量 
     * @return NumberOfMountTargets 挂载点数量
     */
    public Long getNumberOfMountTargets() {
        return this.NumberOfMountTargets;
    }

    /**
     * Set 挂载点数量
     * @param NumberOfMountTargets 挂载点数量
     */
    public void setNumberOfMountTargets(Long NumberOfMountTargets) {
        this.NumberOfMountTargets = NumberOfMountTargets;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MountTargets.", this.MountTargets);
        this.setParamSimple(map, prefix + "NumberOfMountTargets", this.NumberOfMountTargets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

