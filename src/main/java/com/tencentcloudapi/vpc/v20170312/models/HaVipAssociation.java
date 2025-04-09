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

public class HaVipAssociation extends AbstractModel {

    /**
    * HaVip绑定的子机或网卡唯一ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * HaVip实例唯一ID。
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * HaVip绑定的类型。取值:CVM, ENI。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get HaVip绑定的子机或网卡唯一ID。 
     * @return InstanceId HaVip绑定的子机或网卡唯一ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set HaVip绑定的子机或网卡唯一ID。
     * @param InstanceId HaVip绑定的子机或网卡唯一ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get HaVip实例唯一ID。 
     * @return HaVipId HaVip实例唯一ID。
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set HaVip实例唯一ID。
     * @param HaVipId HaVip实例唯一ID。
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get HaVip绑定的类型。取值:CVM, ENI。 
     * @return InstanceType HaVip绑定的类型。取值:CVM, ENI。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set HaVip绑定的类型。取值:CVM, ENI。
     * @param InstanceType HaVip绑定的类型。取值:CVM, ENI。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public HaVipAssociation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HaVipAssociation(HaVipAssociation source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.HaVipId != null) {
            this.HaVipId = new String(source.HaVipId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "HaVipId", this.HaVipId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

