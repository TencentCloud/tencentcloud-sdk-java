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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseSummary extends AbstractModel {

    /**
    * 创建时间 (Unix时间戳,秒级)
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 发布描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 发布ID
    */
    @SerializedName("ReleaseId")
    @Expose
    private String ReleaseId;

    /**
    * 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDescription")
    @Expose
    private String StatusDescription;

    /**
    * 发布渠道ID列表
    */
    @SerializedName("ChannelIdList")
    @Expose
    private String [] ChannelIdList;

    /**
     * Get 创建时间 (Unix时间戳,秒级) 
     * @return CreateTime 创建时间 (Unix时间戳,秒级)
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间 (Unix时间戳,秒级)
     * @param CreateTime 创建时间 (Unix时间戳,秒级)
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 发布描述 
     * @return Description 发布描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 发布描述
     * @param Description 发布描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 发布ID 
     * @return ReleaseId 发布ID
     */
    public String getReleaseId() {
        return this.ReleaseId;
    }

    /**
     * Set 发布ID
     * @param ReleaseId 发布ID
     */
    public void setReleaseId(String ReleaseId) {
        this.ReleaseId = ReleaseId;
    }

    /**
     * Get 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过 
     * @return Status 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过
     * @param Status 发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDescription 状态描述
     */
    public String getStatusDescription() {
        return this.StatusDescription;
    }

    /**
     * Set 状态描述
     * @param StatusDescription 状态描述
     */
    public void setStatusDescription(String StatusDescription) {
        this.StatusDescription = StatusDescription;
    }

    /**
     * Get 发布渠道ID列表 
     * @return ChannelIdList 发布渠道ID列表
     */
    public String [] getChannelIdList() {
        return this.ChannelIdList;
    }

    /**
     * Set 发布渠道ID列表
     * @param ChannelIdList 发布渠道ID列表
     */
    public void setChannelIdList(String [] ChannelIdList) {
        this.ChannelIdList = ChannelIdList;
    }

    public ReleaseSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseSummary(ReleaseSummary source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ReleaseId != null) {
            this.ReleaseId = new String(source.ReleaseId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDescription != null) {
            this.StatusDescription = new String(source.StatusDescription);
        }
        if (source.ChannelIdList != null) {
            this.ChannelIdList = new String[source.ChannelIdList.length];
            for (int i = 0; i < source.ChannelIdList.length; i++) {
                this.ChannelIdList[i] = new String(source.ChannelIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ReleaseId", this.ReleaseId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDescription", this.StatusDescription);
        this.setParamArraySimple(map, prefix + "ChannelIdList.", this.ChannelIdList);

    }
}

