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
    * <p>创建时间 (Unix时间戳,秒级)</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>发布描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>发布ID</p>
    */
    @SerializedName("ReleaseId")
    @Expose
    private String ReleaseId;

    /**
    * <p>发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>状态描述</p>
    */
    @SerializedName("StatusDescription")
    @Expose
    private String StatusDescription;

    /**
    * <p>应用分享访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppShareAccessControl")
    @Expose
    private AppShareAccessControl AppShareAccessControl;

    /**
    * <p>发布渠道ID列表</p>
    */
    @SerializedName("ChannelIdList")
    @Expose
    private String [] ChannelIdList;

    /**
    * <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpShareConfig")
    @Expose
    private CorpShareConfig CorpShareConfig;

    /**
     * Get <p>创建时间 (Unix时间戳,秒级)</p> 
     * @return CreateTime <p>创建时间 (Unix时间戳,秒级)</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间 (Unix时间戳,秒级)</p>
     * @param CreateTime <p>创建时间 (Unix时间戳,秒级)</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>发布描述</p> 
     * @return Description <p>发布描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>发布描述</p>
     * @param Description <p>发布描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>发布ID</p> 
     * @return ReleaseId <p>发布ID</p>
     */
    public String getReleaseId() {
        return this.ReleaseId;
    }

    /**
     * Set <p>发布ID</p>
     * @param ReleaseId <p>发布ID</p>
     */
    public void setReleaseId(String ReleaseId) {
        this.ReleaseId = ReleaseId;
    }

    /**
     * Get <p>发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过</p> 
     * @return Status <p>发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过</p>
     * @param Status <p>发布状态。枚举值: 1:待发布, 2:发布中, 3:发布成功, 4:发布失败, 5:审核中, 6:审核成功, 7:审核失败, 8:发布成功回调处理中, 9:发布暂停, 10:申诉审核中, 11:申诉审核通过, 12:申诉审核不通过</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态描述</p> 
     * @return StatusDescription <p>状态描述</p>
     */
    public String getStatusDescription() {
        return this.StatusDescription;
    }

    /**
     * Set <p>状态描述</p>
     * @param StatusDescription <p>状态描述</p>
     */
    public void setStatusDescription(String StatusDescription) {
        this.StatusDescription = StatusDescription;
    }

    /**
     * Get <p>应用分享访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppShareAccessControl <p>应用分享访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppShareAccessControl getAppShareAccessControl() {
        return this.AppShareAccessControl;
    }

    /**
     * Set <p>应用分享访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppShareAccessControl <p>应用分享访问控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppShareAccessControl(AppShareAccessControl AppShareAccessControl) {
        this.AppShareAccessControl = AppShareAccessControl;
    }

    /**
     * Get <p>发布渠道ID列表</p> 
     * @return ChannelIdList <p>发布渠道ID列表</p>
     */
    public String [] getChannelIdList() {
        return this.ChannelIdList;
    }

    /**
     * Set <p>发布渠道ID列表</p>
     * @param ChannelIdList <p>发布渠道ID列表</p>
     */
    public void setChannelIdList(String [] ChannelIdList) {
        this.ChannelIdList = ChannelIdList;
    }

    /**
     * Get <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpShareConfig <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CorpShareConfig getCorpShareConfig() {
        return this.CorpShareConfig;
    }

    /**
     * Set <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpShareConfig <p>企业共享配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpShareConfig(CorpShareConfig CorpShareConfig) {
        this.CorpShareConfig = CorpShareConfig;
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
        if (source.AppShareAccessControl != null) {
            this.AppShareAccessControl = new AppShareAccessControl(source.AppShareAccessControl);
        }
        if (source.ChannelIdList != null) {
            this.ChannelIdList = new String[source.ChannelIdList.length];
            for (int i = 0; i < source.ChannelIdList.length; i++) {
                this.ChannelIdList[i] = new String(source.ChannelIdList[i]);
            }
        }
        if (source.CorpShareConfig != null) {
            this.CorpShareConfig = new CorpShareConfig(source.CorpShareConfig);
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
        this.setParamObj(map, prefix + "AppShareAccessControl.", this.AppShareAccessControl);
        this.setParamArraySimple(map, prefix + "ChannelIdList.", this.ChannelIdList);
        this.setParamObj(map, prefix + "CorpShareConfig.", this.CorpShareConfig);

    }
}

