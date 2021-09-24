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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyMachineInfo extends AbstractModel{

    /**
    * 唯一id
    */
    @SerializedName("ProxyUid")
    @Expose
    private String ProxyUid;

    /**
    * 机器类型
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 可分配proxy资源数
    */
    @SerializedName("AvailableCount")
    @Expose
    private Long AvailableCount;

    /**
     * Get 唯一id 
     * @return ProxyUid 唯一id
     */
    public String getProxyUid() {
        return this.ProxyUid;
    }

    /**
     * Set 唯一id
     * @param ProxyUid 唯一id
     */
    public void setProxyUid(String ProxyUid) {
        this.ProxyUid = ProxyUid;
    }

    /**
     * Get 机器类型 
     * @return MachineType 机器类型
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机器类型
     * @param MachineType 机器类型
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 可分配proxy资源数 
     * @return AvailableCount 可分配proxy资源数
     */
    public Long getAvailableCount() {
        return this.AvailableCount;
    }

    /**
     * Set 可分配proxy资源数
     * @param AvailableCount 可分配proxy资源数
     */
    public void setAvailableCount(Long AvailableCount) {
        this.AvailableCount = AvailableCount;
    }

    public ProxyMachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyMachineInfo(ProxyMachineInfo source) {
        if (source.ProxyUid != null) {
            this.ProxyUid = new String(source.ProxyUid);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.AvailableCount != null) {
            this.AvailableCount = new Long(source.AvailableCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyUid", this.ProxyUid);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "AvailableCount", this.AvailableCount);

    }
}

