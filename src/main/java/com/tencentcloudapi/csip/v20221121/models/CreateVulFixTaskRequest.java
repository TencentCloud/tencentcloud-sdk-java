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

public class CreateVulFixTaskRequest extends AbstractModel {

    /**
    * <p>修复项列表，每项指定一个漏洞/KB补丁及其需要修复的主机<br>入参限制：最多100项，总实例数不超过5000</p>
    */
    @SerializedName("FixItems")
    @Expose
    private VulFixItem [] FixItems;

    /**
    * <p>最大修复时间<br>单位：秒<br>默认值：3600</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>是否在修复前创建磁盘快照<br>默认值：false</p>
    */
    @SerializedName("CreateSnapshot")
    @Expose
    private Boolean CreateSnapshot;

    /**
    * <p>快照名称，CreateSnapshot为true时有效<br>入参限制：最长128个字符</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>快照保存天数，CreateSnapshot为true时有效</p>
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>修复项列表，每项指定一个漏洞/KB补丁及其需要修复的主机<br>入参限制：最多100项，总实例数不超过5000</p> 
     * @return FixItems <p>修复项列表，每项指定一个漏洞/KB补丁及其需要修复的主机<br>入参限制：最多100项，总实例数不超过5000</p>
     */
    public VulFixItem [] getFixItems() {
        return this.FixItems;
    }

    /**
     * Set <p>修复项列表，每项指定一个漏洞/KB补丁及其需要修复的主机<br>入参限制：最多100项，总实例数不超过5000</p>
     * @param FixItems <p>修复项列表，每项指定一个漏洞/KB补丁及其需要修复的主机<br>入参限制：最多100项，总实例数不超过5000</p>
     */
    public void setFixItems(VulFixItem [] FixItems) {
        this.FixItems = FixItems;
    }

    /**
     * Get <p>最大修复时间<br>单位：秒<br>默认值：3600</p> 
     * @return Timeout <p>最大修复时间<br>单位：秒<br>默认值：3600</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>最大修复时间<br>单位：秒<br>默认值：3600</p>
     * @param Timeout <p>最大修复时间<br>单位：秒<br>默认值：3600</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>是否在修复前创建磁盘快照<br>默认值：false</p> 
     * @return CreateSnapshot <p>是否在修复前创建磁盘快照<br>默认值：false</p>
     */
    public Boolean getCreateSnapshot() {
        return this.CreateSnapshot;
    }

    /**
     * Set <p>是否在修复前创建磁盘快照<br>默认值：false</p>
     * @param CreateSnapshot <p>是否在修复前创建磁盘快照<br>默认值：false</p>
     */
    public void setCreateSnapshot(Boolean CreateSnapshot) {
        this.CreateSnapshot = CreateSnapshot;
    }

    /**
     * Get <p>快照名称，CreateSnapshot为true时有效<br>入参限制：最长128个字符</p> 
     * @return SnapshotName <p>快照名称，CreateSnapshot为true时有效<br>入参限制：最长128个字符</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>快照名称，CreateSnapshot为true时有效<br>入参限制：最长128个字符</p>
     * @param SnapshotName <p>快照名称，CreateSnapshot为true时有效<br>入参限制：最长128个字符</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>快照保存天数，CreateSnapshot为true时有效</p> 
     * @return SaveDays <p>快照保存天数，CreateSnapshot为true时有效</p>
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set <p>快照保存天数，CreateSnapshot为true时有效</p>
     * @param SaveDays <p>快照保存天数，CreateSnapshot为true时有效</p>
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public CreateVulFixTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulFixTaskRequest(CreateVulFixTaskRequest source) {
        if (source.FixItems != null) {
            this.FixItems = new VulFixItem[source.FixItems.length];
            for (int i = 0; i < source.FixItems.length; i++) {
                this.FixItems[i] = new VulFixItem(source.FixItems[i]);
            }
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.CreateSnapshot != null) {
            this.CreateSnapshot = new Boolean(source.CreateSnapshot);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.SaveDays != null) {
            this.SaveDays = new Long(source.SaveDays);
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
        this.setParamArrayObj(map, prefix + "FixItems.", this.FixItems);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "CreateSnapshot", this.CreateSnapshot);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SaveDays", this.SaveDays);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

