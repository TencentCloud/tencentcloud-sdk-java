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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRepoRegistryInfo extends AbstractModel {

    /**
    * 仓库id
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * 仓库名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 仓库类型，列表：harbor、tcr
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 仓库url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 网络类型，列表：public
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 区域，列表：default
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * 仓库版本
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * 仓库连接错误信息，待废弃，请使用ConnDetectException
    */
    @SerializedName("ConnectMsg")
    @Expose
    private String ConnectMsg;

    /**
    * 联通性检测方式
    */
    @SerializedName("ConnDetectType")
    @Expose
    private String ConnDetectType;

    /**
    * 联通性检测主机数
    */
    @SerializedName("ConnDetectHostCount")
    @Expose
    private Long ConnDetectHostCount;

    /**
    * 联通性检测详情
    */
    @SerializedName("ConnDetectDetail")
    @Expose
    private RegistryConnDetectResult [] ConnDetectDetail;

    /**
    * tcr情况下的instance_id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 最近同步成功时间
    */
    @SerializedName("LatestSyncTime")
    @Expose
    private String LatestSyncTime;

    /**
    * 同步状态
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * 同步失败原因
    */
    @SerializedName("SyncFailReason")
    @Expose
    private String SyncFailReason;

    /**
    * 同步失败解决方案
    */
    @SerializedName("SyncSolution")
    @Expose
    private String SyncSolution;

    /**
    * 同步失败信息
    */
    @SerializedName("SyncMessage")
    @Expose
    private String SyncMessage;

    /**
    * 同步方式，0全量同步，1增量同步	
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
     * Get 仓库id 
     * @return RegistryId 仓库id
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 仓库id
     * @param RegistryId 仓库id
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 仓库名 
     * @return Name 仓库名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 仓库名
     * @param Name 仓库名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 仓库类型，列表：harbor、tcr 
     * @return RegistryType 仓库类型，列表：harbor、tcr
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 仓库类型，列表：harbor、tcr
     * @param RegistryType 仓库类型，列表：harbor、tcr
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 仓库url 
     * @return Url 仓库url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 仓库url
     * @param Url 仓库url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 网络类型，列表：public 
     * @return NetType 网络类型，列表：public
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型，列表：public
     * @param NetType 网络类型，列表：public
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 区域，列表：default 
     * @return RegistryRegion 区域，列表：default
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set 区域，列表：default
     * @param RegistryRegion 区域，列表：default
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get 仓库版本 
     * @return RegistryVersion 仓库版本
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set 仓库版本
     * @param RegistryVersion 仓库版本
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get 仓库连接错误信息，待废弃，请使用ConnDetectException 
     * @return ConnectMsg 仓库连接错误信息，待废弃，请使用ConnDetectException
     */
    public String getConnectMsg() {
        return this.ConnectMsg;
    }

    /**
     * Set 仓库连接错误信息，待废弃，请使用ConnDetectException
     * @param ConnectMsg 仓库连接错误信息，待废弃，请使用ConnDetectException
     */
    public void setConnectMsg(String ConnectMsg) {
        this.ConnectMsg = ConnectMsg;
    }

    /**
     * Get 联通性检测方式 
     * @return ConnDetectType 联通性检测方式
     */
    public String getConnDetectType() {
        return this.ConnDetectType;
    }

    /**
     * Set 联通性检测方式
     * @param ConnDetectType 联通性检测方式
     */
    public void setConnDetectType(String ConnDetectType) {
        this.ConnDetectType = ConnDetectType;
    }

    /**
     * Get 联通性检测主机数 
     * @return ConnDetectHostCount 联通性检测主机数
     */
    public Long getConnDetectHostCount() {
        return this.ConnDetectHostCount;
    }

    /**
     * Set 联通性检测主机数
     * @param ConnDetectHostCount 联通性检测主机数
     */
    public void setConnDetectHostCount(Long ConnDetectHostCount) {
        this.ConnDetectHostCount = ConnDetectHostCount;
    }

    /**
     * Get 联通性检测详情 
     * @return ConnDetectDetail 联通性检测详情
     */
    public RegistryConnDetectResult [] getConnDetectDetail() {
        return this.ConnDetectDetail;
    }

    /**
     * Set 联通性检测详情
     * @param ConnDetectDetail 联通性检测详情
     */
    public void setConnDetectDetail(RegistryConnDetectResult [] ConnDetectDetail) {
        this.ConnDetectDetail = ConnDetectDetail;
    }

    /**
     * Get tcr情况下的instance_id 
     * @return InstanceID tcr情况下的instance_id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set tcr情况下的instance_id
     * @param InstanceID tcr情况下的instance_id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 最近同步成功时间 
     * @return LatestSyncTime 最近同步成功时间
     */
    public String getLatestSyncTime() {
        return this.LatestSyncTime;
    }

    /**
     * Set 最近同步成功时间
     * @param LatestSyncTime 最近同步成功时间
     */
    public void setLatestSyncTime(String LatestSyncTime) {
        this.LatestSyncTime = LatestSyncTime;
    }

    /**
     * Get 同步状态 
     * @return SyncStatus 同步状态
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set 同步状态
     * @param SyncStatus 同步状态
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get 同步失败原因 
     * @return SyncFailReason 同步失败原因
     */
    public String getSyncFailReason() {
        return this.SyncFailReason;
    }

    /**
     * Set 同步失败原因
     * @param SyncFailReason 同步失败原因
     */
    public void setSyncFailReason(String SyncFailReason) {
        this.SyncFailReason = SyncFailReason;
    }

    /**
     * Get 同步失败解决方案 
     * @return SyncSolution 同步失败解决方案
     */
    public String getSyncSolution() {
        return this.SyncSolution;
    }

    /**
     * Set 同步失败解决方案
     * @param SyncSolution 同步失败解决方案
     */
    public void setSyncSolution(String SyncSolution) {
        this.SyncSolution = SyncSolution;
    }

    /**
     * Get 同步失败信息 
     * @return SyncMessage 同步失败信息
     */
    public String getSyncMessage() {
        return this.SyncMessage;
    }

    /**
     * Set 同步失败信息
     * @param SyncMessage 同步失败信息
     */
    public void setSyncMessage(String SyncMessage) {
        this.SyncMessage = SyncMessage;
    }

    /**
     * Get 同步方式，0全量同步，1增量同步	 
     * @return SyncMode 同步方式，0全量同步，1增量同步	
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set 同步方式，0全量同步，1增量同步	
     * @param SyncMode 同步方式，0全量同步，1增量同步	
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    public ImageRepoRegistryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRepoRegistryInfo(ImageRepoRegistryInfo source) {
        if (source.RegistryId != null) {
            this.RegistryId = new Long(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.RegistryVersion != null) {
            this.RegistryVersion = new String(source.RegistryVersion);
        }
        if (source.ConnectMsg != null) {
            this.ConnectMsg = new String(source.ConnectMsg);
        }
        if (source.ConnDetectType != null) {
            this.ConnDetectType = new String(source.ConnDetectType);
        }
        if (source.ConnDetectHostCount != null) {
            this.ConnDetectHostCount = new Long(source.ConnDetectHostCount);
        }
        if (source.ConnDetectDetail != null) {
            this.ConnDetectDetail = new RegistryConnDetectResult[source.ConnDetectDetail.length];
            for (int i = 0; i < source.ConnDetectDetail.length; i++) {
                this.ConnDetectDetail[i] = new RegistryConnDetectResult(source.ConnDetectDetail[i]);
            }
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.LatestSyncTime != null) {
            this.LatestSyncTime = new String(source.LatestSyncTime);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
        if (source.SyncFailReason != null) {
            this.SyncFailReason = new String(source.SyncFailReason);
        }
        if (source.SyncSolution != null) {
            this.SyncSolution = new String(source.SyncSolution);
        }
        if (source.SyncMessage != null) {
            this.SyncMessage = new String(source.SyncMessage);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new Long(source.SyncMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryVersion", this.RegistryVersion);
        this.setParamSimple(map, prefix + "ConnectMsg", this.ConnectMsg);
        this.setParamSimple(map, prefix + "ConnDetectType", this.ConnDetectType);
        this.setParamSimple(map, prefix + "ConnDetectHostCount", this.ConnDetectHostCount);
        this.setParamArrayObj(map, prefix + "ConnDetectDetail.", this.ConnDetectDetail);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "LatestSyncTime", this.LatestSyncTime);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncFailReason", this.SyncFailReason);
        this.setParamSimple(map, prefix + "SyncSolution", this.SyncSolution);
        this.setParamSimple(map, prefix + "SyncMessage", this.SyncMessage);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);

    }
}

