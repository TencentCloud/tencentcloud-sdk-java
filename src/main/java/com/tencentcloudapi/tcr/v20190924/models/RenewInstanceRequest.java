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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstanceRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 预付费自动续费标识和购买时长,0：手动续费，1：自动续费，2：不续费并且不通知;单位为月
    */
    @SerializedName("RegistryChargePrepaid")
    @Expose
    private RegistryChargePrepaid RegistryChargePrepaid;

    /**
    * 0 续费， 1按量转包年包月
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 预付费自动续费标识和购买时长,0：手动续费，1：自动续费，2：不续费并且不通知;单位为月 
     * @return RegistryChargePrepaid 预付费自动续费标识和购买时长,0：手动续费，1：自动续费，2：不续费并且不通知;单位为月
     */
    public RegistryChargePrepaid getRegistryChargePrepaid() {
        return this.RegistryChargePrepaid;
    }

    /**
     * Set 预付费自动续费标识和购买时长,0：手动续费，1：自动续费，2：不续费并且不通知;单位为月
     * @param RegistryChargePrepaid 预付费自动续费标识和购买时长,0：手动续费，1：自动续费，2：不续费并且不通知;单位为月
     */
    public void setRegistryChargePrepaid(RegistryChargePrepaid RegistryChargePrepaid) {
        this.RegistryChargePrepaid = RegistryChargePrepaid;
    }

    /**
     * Get 0 续费， 1按量转包年包月 
     * @return Flag 0 续费， 1按量转包年包月
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 0 续费， 1按量转包年包月
     * @param Flag 0 续费， 1按量转包年包月
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    public RenewInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstanceRequest(RenewInstanceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegistryChargePrepaid != null) {
            this.RegistryChargePrepaid = new RegistryChargePrepaid(source.RegistryChargePrepaid);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamObj(map, prefix + "RegistryChargePrepaid.", this.RegistryChargePrepaid);
        this.setParamSimple(map, prefix + "Flag", this.Flag);

    }
}

