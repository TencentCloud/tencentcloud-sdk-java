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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceRequest extends AbstractModel{

    /**
    * 资产记录ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 管理端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 资产所属组ID集合
    */
    @SerializedName("GroupIdSet")
    @Expose
    private Long [] GroupIdSet;

    /**
    * 资产所属部门ID
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
     * Get 资产记录ID 
     * @return Id 资产记录ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 资产记录ID
     * @param Id 资产记录ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 管理端口 
     * @return Port 管理端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 管理端口
     * @param Port 管理端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 资产所属组ID集合 
     * @return GroupIdSet 资产所属组ID集合
     */
    public Long [] getGroupIdSet() {
        return this.GroupIdSet;
    }

    /**
     * Set 资产所属组ID集合
     * @param GroupIdSet 资产所属组ID集合
     */
    public void setGroupIdSet(Long [] GroupIdSet) {
        this.GroupIdSet = GroupIdSet;
    }

    /**
     * Get 资产所属部门ID 
     * @return DepartmentId 资产所属部门ID
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 资产所属部门ID
     * @param DepartmentId 资产所属部门ID
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public ModifyDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceRequest(ModifyDeviceRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.GroupIdSet != null) {
            this.GroupIdSet = new Long[source.GroupIdSet.length];
            for (int i = 0; i < source.GroupIdSet.length; i++) {
                this.GroupIdSet[i] = new Long(source.GroupIdSet[i]);
            }
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArraySimple(map, prefix + "GroupIdSet.", this.GroupIdSet);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);

    }
}

