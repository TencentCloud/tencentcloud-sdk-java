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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyInfo extends AbstractModel{

    /**
    * 远端设备ID
    */
    @SerializedName("RemoteDeviceId")
    @Expose
    private String RemoteDeviceId;

    /**
    * 关联的现场设备ID
    */
    @SerializedName("FieldDeviceIds")
    @Expose
    private String [] FieldDeviceIds;

    /**
    * 最近添加时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 远端设备ID 
     * @return RemoteDeviceId 远端设备ID
     */
    public String getRemoteDeviceId() {
        return this.RemoteDeviceId;
    }

    /**
     * Set 远端设备ID
     * @param RemoteDeviceId 远端设备ID
     */
    public void setRemoteDeviceId(String RemoteDeviceId) {
        this.RemoteDeviceId = RemoteDeviceId;
    }

    /**
     * Get 关联的现场设备ID 
     * @return FieldDeviceIds 关联的现场设备ID
     */
    public String [] getFieldDeviceIds() {
        return this.FieldDeviceIds;
    }

    /**
     * Set 关联的现场设备ID
     * @param FieldDeviceIds 关联的现场设备ID
     */
    public void setFieldDeviceIds(String [] FieldDeviceIds) {
        this.FieldDeviceIds = FieldDeviceIds;
    }

    /**
     * Get 最近添加时间 
     * @return ModifyTime 最近添加时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近添加时间
     * @param ModifyTime 最近添加时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public PolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyInfo(PolicyInfo source) {
        if (source.RemoteDeviceId != null) {
            this.RemoteDeviceId = new String(source.RemoteDeviceId);
        }
        if (source.FieldDeviceIds != null) {
            this.FieldDeviceIds = new String[source.FieldDeviceIds.length];
            for (int i = 0; i < source.FieldDeviceIds.length; i++) {
                this.FieldDeviceIds[i] = new String(source.FieldDeviceIds[i]);
            }
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RemoteDeviceId", this.RemoteDeviceId);
        this.setParamArraySimple(map, prefix + "FieldDeviceIds.", this.FieldDeviceIds);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

