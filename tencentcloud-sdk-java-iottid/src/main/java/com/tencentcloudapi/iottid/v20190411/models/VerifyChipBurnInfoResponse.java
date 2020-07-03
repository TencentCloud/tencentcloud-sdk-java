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
package com.tencentcloudapi.iottid.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyChipBurnInfoResponse extends AbstractModel{

    /**
    * 验证结果
    */
    @SerializedName("Pass")
    @Expose
    private Boolean Pass;

    /**
    * 已验证次数
    */
    @SerializedName("VerifiedTimes")
    @Expose
    private Long VerifiedTimes;

    /**
    * 剩余验证次数
    */
    @SerializedName("LeftTimes")
    @Expose
    private Long LeftTimes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 验证结果 
     * @return Pass 验证结果
     */
    public Boolean getPass() {
        return this.Pass;
    }

    /**
     * Set 验证结果
     * @param Pass 验证结果
     */
    public void setPass(Boolean Pass) {
        this.Pass = Pass;
    }

    /**
     * Get 已验证次数 
     * @return VerifiedTimes 已验证次数
     */
    public Long getVerifiedTimes() {
        return this.VerifiedTimes;
    }

    /**
     * Set 已验证次数
     * @param VerifiedTimes 已验证次数
     */
    public void setVerifiedTimes(Long VerifiedTimes) {
        this.VerifiedTimes = VerifiedTimes;
    }

    /**
     * Get 剩余验证次数 
     * @return LeftTimes 剩余验证次数
     */
    public Long getLeftTimes() {
        return this.LeftTimes;
    }

    /**
     * Set 剩余验证次数
     * @param LeftTimes 剩余验证次数
     */
    public void setLeftTimes(Long LeftTimes) {
        this.LeftTimes = LeftTimes;
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
        this.setParamSimple(map, prefix + "Pass", this.Pass);
        this.setParamSimple(map, prefix + "VerifiedTimes", this.VerifiedTimes);
        this.setParamSimple(map, prefix + "LeftTimes", this.LeftTimes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

