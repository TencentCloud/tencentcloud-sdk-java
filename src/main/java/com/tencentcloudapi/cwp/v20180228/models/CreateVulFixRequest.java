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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulFixRequest extends AbstractModel {

    /**
    * 漏洞对应要修复的主机列表
    */
    @SerializedName("CreateVulFixTaskQuuids")
    @Expose
    private CreateVulFixTaskQuuids [] CreateVulFixTaskQuuids;

    /**
    * 快照保存天数，  0 天表示不创建快照。24小时没有快照的主机必须要创建快照才能修复
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * 快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
     * Get 漏洞对应要修复的主机列表 
     * @return CreateVulFixTaskQuuids 漏洞对应要修复的主机列表
     */
    public CreateVulFixTaskQuuids [] getCreateVulFixTaskQuuids() {
        return this.CreateVulFixTaskQuuids;
    }

    /**
     * Set 漏洞对应要修复的主机列表
     * @param CreateVulFixTaskQuuids 漏洞对应要修复的主机列表
     */
    public void setCreateVulFixTaskQuuids(CreateVulFixTaskQuuids [] CreateVulFixTaskQuuids) {
        this.CreateVulFixTaskQuuids = CreateVulFixTaskQuuids;
    }

    /**
     * Get 快照保存天数，  0 天表示不创建快照。24小时没有快照的主机必须要创建快照才能修复 
     * @return SaveDays 快照保存天数，  0 天表示不创建快照。24小时没有快照的主机必须要创建快照才能修复
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set 快照保存天数，  0 天表示不创建快照。24小时没有快照的主机必须要创建快照才能修复
     * @param SaveDays 快照保存天数，  0 天表示不创建快照。24小时没有快照的主机必须要创建快照才能修复
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get 快照名称 
     * @return SnapshotName 快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称
     * @param SnapshotName 快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    public CreateVulFixRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulFixRequest(CreateVulFixRequest source) {
        if (source.CreateVulFixTaskQuuids != null) {
            this.CreateVulFixTaskQuuids = new CreateVulFixTaskQuuids[source.CreateVulFixTaskQuuids.length];
            for (int i = 0; i < source.CreateVulFixTaskQuuids.length; i++) {
                this.CreateVulFixTaskQuuids[i] = new CreateVulFixTaskQuuids(source.CreateVulFixTaskQuuids[i]);
            }
        }
        if (source.SaveDays != null) {
            this.SaveDays = new Long(source.SaveDays);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CreateVulFixTaskQuuids.", this.CreateVulFixTaskQuuids);
        this.setParamSimple(map, prefix + "SaveDays", this.SaveDays);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);

    }
}

