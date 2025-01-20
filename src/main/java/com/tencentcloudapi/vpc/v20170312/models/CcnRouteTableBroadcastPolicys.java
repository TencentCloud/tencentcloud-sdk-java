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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnRouteTableBroadcastPolicys extends AbstractModel {

    /**
    * 策略列表
    */
    @SerializedName("Policys")
    @Expose
    private CcnRouteTableBroadcastPolicy [] Policys;

    /**
    * 版本号
    */
    @SerializedName("PolicyVersion")
    @Expose
    private Long PolicyVersion;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 策略列表 
     * @return Policys 策略列表
     */
    public CcnRouteTableBroadcastPolicy [] getPolicys() {
        return this.Policys;
    }

    /**
     * Set 策略列表
     * @param Policys 策略列表
     */
    public void setPolicys(CcnRouteTableBroadcastPolicy [] Policys) {
        this.Policys = Policys;
    }

    /**
     * Get 版本号 
     * @return PolicyVersion 版本号
     */
    public Long getPolicyVersion() {
        return this.PolicyVersion;
    }

    /**
     * Set 版本号
     * @param PolicyVersion 版本号
     */
    public void setPolicyVersion(Long PolicyVersion) {
        this.PolicyVersion = PolicyVersion;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public CcnRouteTableBroadcastPolicys() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRouteTableBroadcastPolicys(CcnRouteTableBroadcastPolicys source) {
        if (source.Policys != null) {
            this.Policys = new CcnRouteTableBroadcastPolicy[source.Policys.length];
            for (int i = 0; i < source.Policys.length; i++) {
                this.Policys[i] = new CcnRouteTableBroadcastPolicy(source.Policys[i]);
            }
        }
        if (source.PolicyVersion != null) {
            this.PolicyVersion = new Long(source.PolicyVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Policys.", this.Policys);
        this.setParamSimple(map, prefix + "PolicyVersion", this.PolicyVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

