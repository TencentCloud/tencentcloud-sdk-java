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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmCkafkaRouteListRequest extends AbstractModel {

    /**
    * Ckafka接入类型
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * Ckafka实例的地域
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Ckafka实例的id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Ckafka实例的名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get Ckafka接入类型 
     * @return VipType Ckafka接入类型
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set Ckafka接入类型
     * @param VipType Ckafka接入类型
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get Ckafka实例的地域 
     * @return RegionId Ckafka实例的地域
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Ckafka实例的地域
     * @param RegionId Ckafka实例的地域
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Ckafka实例的id 
     * @return InstanceId Ckafka实例的id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Ckafka实例的id
     * @param InstanceId Ckafka实例的id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Ckafka实例的名称 
     * @return InstanceName Ckafka实例的名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Ckafka实例的名称
     * @param InstanceName Ckafka实例的名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public DescribeDspmCkafkaRouteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmCkafkaRouteListRequest(DescribeDspmCkafkaRouteListRequest source) {
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

