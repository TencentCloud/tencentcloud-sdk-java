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

public class DescribeDspmCkafkaTopicListRequest extends AbstractModel {

    /**
    * ckafka的实例接入类型
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * ckafka的实例地域
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * ckafka的实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ckafka的实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get ckafka的实例接入类型 
     * @return VipType ckafka的实例接入类型
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set ckafka的实例接入类型
     * @param VipType ckafka的实例接入类型
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get ckafka的实例地域 
     * @return RegionId ckafka的实例地域
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set ckafka的实例地域
     * @param RegionId ckafka的实例地域
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get ckafka的实例id 
     * @return InstanceId ckafka的实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka的实例id
     * @param InstanceId ckafka的实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ckafka的实例名称 
     * @return InstanceName ckafka的实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set ckafka的实例名称
     * @param InstanceName ckafka的实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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

    public DescribeDspmCkafkaTopicListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmCkafkaTopicListRequest(DescribeDspmCkafkaTopicListRequest source) {
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

