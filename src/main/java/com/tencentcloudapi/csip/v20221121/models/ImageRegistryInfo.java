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

public class ImageRegistryInfo extends AbstractModel {

    /**
    * <p>仓库id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * <p>仓库名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>仓库类型</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>仓库url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>网络连接类型</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>仓库所在地域</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>仓库版本</p>
    */
    @SerializedName("RegistryVersion")
    @Expose
    private String RegistryVersion;

    /**
    * <p>仓库实例id</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>最后同步时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestSyncTime")
    @Expose
    private String LatestSyncTime;

    /**
    * <p>同步失败解决方案</p>
    */
    @SerializedName("SyncSolution")
    @Expose
    private String SyncSolution;

    /**
    * <p>同步方式</p>
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
    * <p>连接探测详情</p>
    */
    @SerializedName("ConnDetectDetail")
    @Expose
    private RegistryConnDetectResult [] ConnDetectDetail;

    /**
    * <p>连接类型</p>
    */
    @SerializedName("ConnDetectType")
    @Expose
    private String ConnDetectType;

    /**
    * <p>仓库所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>仓库所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>仓库所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>同步状态</p><p>枚举值：</p><ul><li>doing： 同步中</li><li>success： 同步成功</li><li>failed： 同步失败</li></ul>
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * <p>同步失败原因</p>
    */
    @SerializedName("SyncFailReason")
    @Expose
    private String SyncFailReason;

    /**
    * <p>地域信息</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>镜像仓库用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get <p>仓库id</p> 
     * @return RegistryId <p>仓库id</p>
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>仓库id</p>
     * @param RegistryId <p>仓库id</p>
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>仓库名</p> 
     * @return Name <p>仓库名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>仓库名</p>
     * @param Name <p>仓库名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>仓库类型</p> 
     * @return RegistryType <p>仓库类型</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>仓库类型</p>
     * @param RegistryType <p>仓库类型</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>仓库url</p> 
     * @return Url <p>仓库url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>仓库url</p>
     * @param Url <p>仓库url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>网络连接类型</p> 
     * @return NetType <p>网络连接类型</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络连接类型</p>
     * @param NetType <p>网络连接类型</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>仓库所在地域</p> 
     * @return RegistryRegion <p>仓库所在地域</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>仓库所在地域</p>
     * @param RegistryRegion <p>仓库所在地域</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>仓库版本</p> 
     * @return RegistryVersion <p>仓库版本</p>
     */
    public String getRegistryVersion() {
        return this.RegistryVersion;
    }

    /**
     * Set <p>仓库版本</p>
     * @param RegistryVersion <p>仓库版本</p>
     */
    public void setRegistryVersion(String RegistryVersion) {
        this.RegistryVersion = RegistryVersion;
    }

    /**
     * Get <p>仓库实例id</p> 
     * @return InstanceID <p>仓库实例id</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>仓库实例id</p>
     * @param InstanceID <p>仓库实例id</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>最后同步时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestSyncTime <p>最后同步时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestSyncTime() {
        return this.LatestSyncTime;
    }

    /**
     * Set <p>最后同步时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param LatestSyncTime <p>最后同步时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestSyncTime(String LatestSyncTime) {
        this.LatestSyncTime = LatestSyncTime;
    }

    /**
     * Get <p>同步失败解决方案</p> 
     * @return SyncSolution <p>同步失败解决方案</p>
     */
    public String getSyncSolution() {
        return this.SyncSolution;
    }

    /**
     * Set <p>同步失败解决方案</p>
     * @param SyncSolution <p>同步失败解决方案</p>
     */
    public void setSyncSolution(String SyncSolution) {
        this.SyncSolution = SyncSolution;
    }

    /**
     * Get <p>同步方式</p> 
     * @return SyncMode <p>同步方式</p>
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set <p>同步方式</p>
     * @param SyncMode <p>同步方式</p>
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get <p>连接探测详情</p> 
     * @return ConnDetectDetail <p>连接探测详情</p>
     */
    public RegistryConnDetectResult [] getConnDetectDetail() {
        return this.ConnDetectDetail;
    }

    /**
     * Set <p>连接探测详情</p>
     * @param ConnDetectDetail <p>连接探测详情</p>
     */
    public void setConnDetectDetail(RegistryConnDetectResult [] ConnDetectDetail) {
        this.ConnDetectDetail = ConnDetectDetail;
    }

    /**
     * Get <p>连接类型</p> 
     * @return ConnDetectType <p>连接类型</p>
     */
    public String getConnDetectType() {
        return this.ConnDetectType;
    }

    /**
     * Set <p>连接类型</p>
     * @param ConnDetectType <p>连接类型</p>
     */
    public void setConnDetectType(String ConnDetectType) {
        this.ConnDetectType = ConnDetectType;
    }

    /**
     * Get <p>仓库所属账号名</p> 
     * @return OwnerAccountName <p>仓库所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>仓库所属账号名</p>
     * @param OwnerAccountName <p>仓库所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>仓库所属账号appid</p> 
     * @return OwnerAppId <p>仓库所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>仓库所属账号appid</p>
     * @param OwnerAppId <p>仓库所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>仓库所属账号uin</p> 
     * @return OwnerUin <p>仓库所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>仓库所属账号uin</p>
     * @param OwnerUin <p>仓库所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>同步状态</p><p>枚举值：</p><ul><li>doing： 同步中</li><li>success： 同步成功</li><li>failed： 同步失败</li></ul> 
     * @return SyncStatus <p>同步状态</p><p>枚举值：</p><ul><li>doing： 同步中</li><li>success： 同步成功</li><li>failed： 同步失败</li></ul>
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>同步状态</p><p>枚举值：</p><ul><li>doing： 同步中</li><li>success： 同步成功</li><li>failed： 同步失败</li></ul>
     * @param SyncStatus <p>同步状态</p><p>枚举值：</p><ul><li>doing： 同步中</li><li>success： 同步成功</li><li>failed： 同步失败</li></ul>
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get <p>同步失败原因</p> 
     * @return SyncFailReason <p>同步失败原因</p>
     */
    public String getSyncFailReason() {
        return this.SyncFailReason;
    }

    /**
     * Set <p>同步失败原因</p>
     * @param SyncFailReason <p>同步失败原因</p>
     */
    public void setSyncFailReason(String SyncFailReason) {
        this.SyncFailReason = SyncFailReason;
    }

    /**
     * Get <p>地域信息</p> 
     * @return RegionInfo <p>地域信息</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>地域信息</p>
     * @param RegionInfo <p>地域信息</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>镜像仓库用户名</p> 
     * @return UserName <p>镜像仓库用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>镜像仓库用户名</p>
     * @param UserName <p>镜像仓库用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public ImageRegistryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryInfo(ImageRegistryInfo source) {
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
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.LatestSyncTime != null) {
            this.LatestSyncTime = new String(source.LatestSyncTime);
        }
        if (source.SyncSolution != null) {
            this.SyncSolution = new String(source.SyncSolution);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new Long(source.SyncMode);
        }
        if (source.ConnDetectDetail != null) {
            this.ConnDetectDetail = new RegistryConnDetectResult[source.ConnDetectDetail.length];
            for (int i = 0; i < source.ConnDetectDetail.length; i++) {
                this.ConnDetectDetail[i] = new RegistryConnDetectResult(source.ConnDetectDetail[i]);
            }
        }
        if (source.ConnDetectType != null) {
            this.ConnDetectType = new String(source.ConnDetectType);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
        if (source.SyncFailReason != null) {
            this.SyncFailReason = new String(source.SyncFailReason);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
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
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "LatestSyncTime", this.LatestSyncTime);
        this.setParamSimple(map, prefix + "SyncSolution", this.SyncSolution);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamArrayObj(map, prefix + "ConnDetectDetail.", this.ConnDetectDetail);
        this.setParamSimple(map, prefix + "ConnDetectType", this.ConnDetectType);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SyncFailReason", this.SyncFailReason);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

