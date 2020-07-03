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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachUserPolicyRequest extends AbstractModel{

    /**
    * 策略 id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 子账号 uin
    */
    @SerializedName("DetachUin")
    @Expose
    private Long DetachUin;

    /**
     * Get 策略 id 
     * @return PolicyId 策略 id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略 id
     * @param PolicyId 策略 id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 子账号 uin 
     * @return DetachUin 子账号 uin
     */
    public Long getDetachUin() {
        return this.DetachUin;
    }

    /**
     * Set 子账号 uin
     * @param DetachUin 子账号 uin
     */
    public void setDetachUin(Long DetachUin) {
        this.DetachUin = DetachUin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "DetachUin", this.DetachUin);

    }
}

