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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVirtualDeviceGroupsReqItem extends AbstractModel {

    /**
    * 设备mid
    */
    @SerializedName("DeviceMid")
    @Expose
    private String DeviceMid;

    /**
    * 操作标识  0:删除设备 1:添加设备
    */
    @SerializedName("Operation")
    @Expose
    private Long Operation;

    /**
     * Get 设备mid 
     * @return DeviceMid 设备mid
     */
    public String getDeviceMid() {
        return this.DeviceMid;
    }

    /**
     * Set 设备mid
     * @param DeviceMid 设备mid
     */
    public void setDeviceMid(String DeviceMid) {
        this.DeviceMid = DeviceMid;
    }

    /**
     * Get 操作标识  0:删除设备 1:添加设备 
     * @return Operation 操作标识  0:删除设备 1:添加设备
     */
    public Long getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作标识  0:删除设备 1:添加设备
     * @param Operation 操作标识  0:删除设备 1:添加设备
     */
    public void setOperation(Long Operation) {
        this.Operation = Operation;
    }

    public ModifyVirtualDeviceGroupsReqItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVirtualDeviceGroupsReqItem(ModifyVirtualDeviceGroupsReqItem source) {
        if (source.DeviceMid != null) {
            this.DeviceMid = new String(source.DeviceMid);
        }
        if (source.Operation != null) {
            this.Operation = new Long(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceMid", this.DeviceMid);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

