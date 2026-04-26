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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceStatusResponse extends AbstractModel {

    /**
    * <p>KMS服务是否开通， true 表示已开通</p>
    */
    @SerializedName("ServiceEnabled")
    @Expose
    private Boolean ServiceEnabled;

    /**
    * <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放</p>
    */
    @SerializedName("InvalidType")
    @Expose
    private Long InvalidType;

    /**
    * <p>0-普通版，1-旗舰版</p>
    */
    @SerializedName("UserLevel")
    @Expose
    private Long UserLevel;

    /**
    * <p>旗舰版到期时间（Epoch Unix Timestamp）。</p>
    */
    @SerializedName("ProExpireTime")
    @Expose
    private Long ProExpireTime;

    /**
    * <p>旗舰版是否自动续费：0-不自动续费，1-自动续费</p>
    */
    @SerializedName("ProRenewFlag")
    @Expose
    private Long ProRenewFlag;

    /**
    * <p>旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空</p>
    */
    @SerializedName("ProResourceId")
    @Expose
    private String ProResourceId;

    /**
    * <p>是否开通 KMS 托管版</p>
    */
    @SerializedName("ExclusiveVSMEnabled")
    @Expose
    private Boolean ExclusiveVSMEnabled;

    /**
    * <p>是否开通 KMS 独享版</p>
    */
    @SerializedName("ExclusiveHSMEnabled")
    @Expose
    private Boolean ExclusiveHSMEnabled;

    /**
    * <p>KMS 订阅信息。</p>
    */
    @SerializedName("SubscriptionInfo")
    @Expose
    private String SubscriptionInfo;

    /**
    * <p>返回KMS用户密钥使用数量</p>
    */
    @SerializedName("CmkUserCount")
    @Expose
    private Long CmkUserCount;

    /**
    * <p>返回KMS用户密钥规格数量</p>
    */
    @SerializedName("CmkLimit")
    @Expose
    private Long CmkLimit;

    /**
    * <p>返回独享集群组</p>
    */
    @SerializedName("ExclusiveHSMList")
    @Expose
    private ExclusiveHSM [] ExclusiveHSMList;

    /**
    * <p>是否支持数据密钥托管。1:支持，0:不支持。</p>
    */
    @SerializedName("IsAllowedDataKeyHosted")
    @Expose
    private Boolean IsAllowedDataKeyHosted;

    /**
    * <p>IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度</p>
    */
    @SerializedName("DataKeyLimit")
    @Expose
    private Long DataKeyLimit;

    /**
    * <p>IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。</p>
    */
    @SerializedName("FreeDataKeyLimit")
    @Expose
    private Long FreeDataKeyLimit;

    /**
    * <p>IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。</p>
    */
    @SerializedName("DataKeyUsedCount")
    @Expose
    private Long DataKeyUsedCount;

    /**
    * <p>同步任务的目标地域信息</p>
    */
    @SerializedName("SyncTaskList")
    @Expose
    private DestinationSyncConfig [] SyncTaskList;

    /**
    * <p>是否支持同步任务。true:支持，false:不支持。</p>
    */
    @SerializedName("IsAllowedSync")
    @Expose
    private Boolean IsAllowedSync;

    /**
    * <p>地域下的QPS</p>
    */
    @SerializedName("QpsLimit")
    @Expose
    private Long QpsLimit;

    /**
    * <p>总的QPS值</p>
    */
    @SerializedName("QpsTotalLimit")
    @Expose
    private Long QpsTotalLimit;

    /**
    * <p>地域下的QPS</p>
    */
    @SerializedName("RegionsQps")
    @Expose
    private RegionQps [] RegionsQps;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>KMS服务是否开通， true 表示已开通</p> 
     * @return ServiceEnabled <p>KMS服务是否开通， true 表示已开通</p>
     */
    public Boolean getServiceEnabled() {
        return this.ServiceEnabled;
    }

    /**
     * Set <p>KMS服务是否开通， true 表示已开通</p>
     * @param ServiceEnabled <p>KMS服务是否开通， true 表示已开通</p>
     */
    public void setServiceEnabled(Boolean ServiceEnabled) {
        this.ServiceEnabled = ServiceEnabled;
    }

    /**
     * Get <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放</p> 
     * @return InvalidType <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放</p>
     */
    public Long getInvalidType() {
        return this.InvalidType;
    }

    /**
     * Set <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放</p>
     * @param InvalidType <p>服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放</p>
     */
    public void setInvalidType(Long InvalidType) {
        this.InvalidType = InvalidType;
    }

    /**
     * Get <p>0-普通版，1-旗舰版</p> 
     * @return UserLevel <p>0-普通版，1-旗舰版</p>
     */
    public Long getUserLevel() {
        return this.UserLevel;
    }

    /**
     * Set <p>0-普通版，1-旗舰版</p>
     * @param UserLevel <p>0-普通版，1-旗舰版</p>
     */
    public void setUserLevel(Long UserLevel) {
        this.UserLevel = UserLevel;
    }

    /**
     * Get <p>旗舰版到期时间（Epoch Unix Timestamp）。</p> 
     * @return ProExpireTime <p>旗舰版到期时间（Epoch Unix Timestamp）。</p>
     */
    public Long getProExpireTime() {
        return this.ProExpireTime;
    }

    /**
     * Set <p>旗舰版到期时间（Epoch Unix Timestamp）。</p>
     * @param ProExpireTime <p>旗舰版到期时间（Epoch Unix Timestamp）。</p>
     */
    public void setProExpireTime(Long ProExpireTime) {
        this.ProExpireTime = ProExpireTime;
    }

    /**
     * Get <p>旗舰版是否自动续费：0-不自动续费，1-自动续费</p> 
     * @return ProRenewFlag <p>旗舰版是否自动续费：0-不自动续费，1-自动续费</p>
     */
    public Long getProRenewFlag() {
        return this.ProRenewFlag;
    }

    /**
     * Set <p>旗舰版是否自动续费：0-不自动续费，1-自动续费</p>
     * @param ProRenewFlag <p>旗舰版是否自动续费：0-不自动续费，1-自动续费</p>
     */
    public void setProRenewFlag(Long ProRenewFlag) {
        this.ProRenewFlag = ProRenewFlag;
    }

    /**
     * Get <p>旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空</p> 
     * @return ProResourceId <p>旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空</p>
     */
    public String getProResourceId() {
        return this.ProResourceId;
    }

    /**
     * Set <p>旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空</p>
     * @param ProResourceId <p>旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空</p>
     */
    public void setProResourceId(String ProResourceId) {
        this.ProResourceId = ProResourceId;
    }

    /**
     * Get <p>是否开通 KMS 托管版</p> 
     * @return ExclusiveVSMEnabled <p>是否开通 KMS 托管版</p>
     */
    public Boolean getExclusiveVSMEnabled() {
        return this.ExclusiveVSMEnabled;
    }

    /**
     * Set <p>是否开通 KMS 托管版</p>
     * @param ExclusiveVSMEnabled <p>是否开通 KMS 托管版</p>
     */
    public void setExclusiveVSMEnabled(Boolean ExclusiveVSMEnabled) {
        this.ExclusiveVSMEnabled = ExclusiveVSMEnabled;
    }

    /**
     * Get <p>是否开通 KMS 独享版</p> 
     * @return ExclusiveHSMEnabled <p>是否开通 KMS 独享版</p>
     */
    public Boolean getExclusiveHSMEnabled() {
        return this.ExclusiveHSMEnabled;
    }

    /**
     * Set <p>是否开通 KMS 独享版</p>
     * @param ExclusiveHSMEnabled <p>是否开通 KMS 独享版</p>
     */
    public void setExclusiveHSMEnabled(Boolean ExclusiveHSMEnabled) {
        this.ExclusiveHSMEnabled = ExclusiveHSMEnabled;
    }

    /**
     * Get <p>KMS 订阅信息。</p> 
     * @return SubscriptionInfo <p>KMS 订阅信息。</p>
     */
    public String getSubscriptionInfo() {
        return this.SubscriptionInfo;
    }

    /**
     * Set <p>KMS 订阅信息。</p>
     * @param SubscriptionInfo <p>KMS 订阅信息。</p>
     */
    public void setSubscriptionInfo(String SubscriptionInfo) {
        this.SubscriptionInfo = SubscriptionInfo;
    }

    /**
     * Get <p>返回KMS用户密钥使用数量</p> 
     * @return CmkUserCount <p>返回KMS用户密钥使用数量</p>
     */
    public Long getCmkUserCount() {
        return this.CmkUserCount;
    }

    /**
     * Set <p>返回KMS用户密钥使用数量</p>
     * @param CmkUserCount <p>返回KMS用户密钥使用数量</p>
     */
    public void setCmkUserCount(Long CmkUserCount) {
        this.CmkUserCount = CmkUserCount;
    }

    /**
     * Get <p>返回KMS用户密钥规格数量</p> 
     * @return CmkLimit <p>返回KMS用户密钥规格数量</p>
     */
    public Long getCmkLimit() {
        return this.CmkLimit;
    }

    /**
     * Set <p>返回KMS用户密钥规格数量</p>
     * @param CmkLimit <p>返回KMS用户密钥规格数量</p>
     */
    public void setCmkLimit(Long CmkLimit) {
        this.CmkLimit = CmkLimit;
    }

    /**
     * Get <p>返回独享集群组</p> 
     * @return ExclusiveHSMList <p>返回独享集群组</p>
     */
    public ExclusiveHSM [] getExclusiveHSMList() {
        return this.ExclusiveHSMList;
    }

    /**
     * Set <p>返回独享集群组</p>
     * @param ExclusiveHSMList <p>返回独享集群组</p>
     */
    public void setExclusiveHSMList(ExclusiveHSM [] ExclusiveHSMList) {
        this.ExclusiveHSMList = ExclusiveHSMList;
    }

    /**
     * Get <p>是否支持数据密钥托管。1:支持，0:不支持。</p> 
     * @return IsAllowedDataKeyHosted <p>是否支持数据密钥托管。1:支持，0:不支持。</p>
     */
    public Boolean getIsAllowedDataKeyHosted() {
        return this.IsAllowedDataKeyHosted;
    }

    /**
     * Set <p>是否支持数据密钥托管。1:支持，0:不支持。</p>
     * @param IsAllowedDataKeyHosted <p>是否支持数据密钥托管。1:支持，0:不支持。</p>
     */
    public void setIsAllowedDataKeyHosted(Boolean IsAllowedDataKeyHosted) {
        this.IsAllowedDataKeyHosted = IsAllowedDataKeyHosted;
    }

    /**
     * Get <p>IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度</p> 
     * @return DataKeyLimit <p>IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度</p>
     */
    public Long getDataKeyLimit() {
        return this.DataKeyLimit;
    }

    /**
     * Set <p>IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度</p>
     * @param DataKeyLimit <p>IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度</p>
     */
    public void setDataKeyLimit(Long DataKeyLimit) {
        this.DataKeyLimit = DataKeyLimit;
    }

    /**
     * Get <p>IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。</p> 
     * @return FreeDataKeyLimit <p>IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。</p>
     */
    public Long getFreeDataKeyLimit() {
        return this.FreeDataKeyLimit;
    }

    /**
     * Set <p>IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。</p>
     * @param FreeDataKeyLimit <p>IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。</p>
     */
    public void setFreeDataKeyLimit(Long FreeDataKeyLimit) {
        this.FreeDataKeyLimit = FreeDataKeyLimit;
    }

    /**
     * Get <p>IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。</p> 
     * @return DataKeyUsedCount <p>IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。</p>
     */
    public Long getDataKeyUsedCount() {
        return this.DataKeyUsedCount;
    }

    /**
     * Set <p>IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。</p>
     * @param DataKeyUsedCount <p>IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。</p>
     */
    public void setDataKeyUsedCount(Long DataKeyUsedCount) {
        this.DataKeyUsedCount = DataKeyUsedCount;
    }

    /**
     * Get <p>同步任务的目标地域信息</p> 
     * @return SyncTaskList <p>同步任务的目标地域信息</p>
     */
    public DestinationSyncConfig [] getSyncTaskList() {
        return this.SyncTaskList;
    }

    /**
     * Set <p>同步任务的目标地域信息</p>
     * @param SyncTaskList <p>同步任务的目标地域信息</p>
     */
    public void setSyncTaskList(DestinationSyncConfig [] SyncTaskList) {
        this.SyncTaskList = SyncTaskList;
    }

    /**
     * Get <p>是否支持同步任务。true:支持，false:不支持。</p> 
     * @return IsAllowedSync <p>是否支持同步任务。true:支持，false:不支持。</p>
     */
    public Boolean getIsAllowedSync() {
        return this.IsAllowedSync;
    }

    /**
     * Set <p>是否支持同步任务。true:支持，false:不支持。</p>
     * @param IsAllowedSync <p>是否支持同步任务。true:支持，false:不支持。</p>
     */
    public void setIsAllowedSync(Boolean IsAllowedSync) {
        this.IsAllowedSync = IsAllowedSync;
    }

    /**
     * Get <p>地域下的QPS</p> 
     * @return QpsLimit <p>地域下的QPS</p>
     */
    public Long getQpsLimit() {
        return this.QpsLimit;
    }

    /**
     * Set <p>地域下的QPS</p>
     * @param QpsLimit <p>地域下的QPS</p>
     */
    public void setQpsLimit(Long QpsLimit) {
        this.QpsLimit = QpsLimit;
    }

    /**
     * Get <p>总的QPS值</p> 
     * @return QpsTotalLimit <p>总的QPS值</p>
     */
    public Long getQpsTotalLimit() {
        return this.QpsTotalLimit;
    }

    /**
     * Set <p>总的QPS值</p>
     * @param QpsTotalLimit <p>总的QPS值</p>
     */
    public void setQpsTotalLimit(Long QpsTotalLimit) {
        this.QpsTotalLimit = QpsTotalLimit;
    }

    /**
     * Get <p>地域下的QPS</p> 
     * @return RegionsQps <p>地域下的QPS</p>
     */
    public RegionQps [] getRegionsQps() {
        return this.RegionsQps;
    }

    /**
     * Set <p>地域下的QPS</p>
     * @param RegionsQps <p>地域下的QPS</p>
     */
    public void setRegionsQps(RegionQps [] RegionsQps) {
        this.RegionsQps = RegionsQps;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetServiceStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetServiceStatusResponse(GetServiceStatusResponse source) {
        if (source.ServiceEnabled != null) {
            this.ServiceEnabled = new Boolean(source.ServiceEnabled);
        }
        if (source.InvalidType != null) {
            this.InvalidType = new Long(source.InvalidType);
        }
        if (source.UserLevel != null) {
            this.UserLevel = new Long(source.UserLevel);
        }
        if (source.ProExpireTime != null) {
            this.ProExpireTime = new Long(source.ProExpireTime);
        }
        if (source.ProRenewFlag != null) {
            this.ProRenewFlag = new Long(source.ProRenewFlag);
        }
        if (source.ProResourceId != null) {
            this.ProResourceId = new String(source.ProResourceId);
        }
        if (source.ExclusiveVSMEnabled != null) {
            this.ExclusiveVSMEnabled = new Boolean(source.ExclusiveVSMEnabled);
        }
        if (source.ExclusiveHSMEnabled != null) {
            this.ExclusiveHSMEnabled = new Boolean(source.ExclusiveHSMEnabled);
        }
        if (source.SubscriptionInfo != null) {
            this.SubscriptionInfo = new String(source.SubscriptionInfo);
        }
        if (source.CmkUserCount != null) {
            this.CmkUserCount = new Long(source.CmkUserCount);
        }
        if (source.CmkLimit != null) {
            this.CmkLimit = new Long(source.CmkLimit);
        }
        if (source.ExclusiveHSMList != null) {
            this.ExclusiveHSMList = new ExclusiveHSM[source.ExclusiveHSMList.length];
            for (int i = 0; i < source.ExclusiveHSMList.length; i++) {
                this.ExclusiveHSMList[i] = new ExclusiveHSM(source.ExclusiveHSMList[i]);
            }
        }
        if (source.IsAllowedDataKeyHosted != null) {
            this.IsAllowedDataKeyHosted = new Boolean(source.IsAllowedDataKeyHosted);
        }
        if (source.DataKeyLimit != null) {
            this.DataKeyLimit = new Long(source.DataKeyLimit);
        }
        if (source.FreeDataKeyLimit != null) {
            this.FreeDataKeyLimit = new Long(source.FreeDataKeyLimit);
        }
        if (source.DataKeyUsedCount != null) {
            this.DataKeyUsedCount = new Long(source.DataKeyUsedCount);
        }
        if (source.SyncTaskList != null) {
            this.SyncTaskList = new DestinationSyncConfig[source.SyncTaskList.length];
            for (int i = 0; i < source.SyncTaskList.length; i++) {
                this.SyncTaskList[i] = new DestinationSyncConfig(source.SyncTaskList[i]);
            }
        }
        if (source.IsAllowedSync != null) {
            this.IsAllowedSync = new Boolean(source.IsAllowedSync);
        }
        if (source.QpsLimit != null) {
            this.QpsLimit = new Long(source.QpsLimit);
        }
        if (source.QpsTotalLimit != null) {
            this.QpsTotalLimit = new Long(source.QpsTotalLimit);
        }
        if (source.RegionsQps != null) {
            this.RegionsQps = new RegionQps[source.RegionsQps.length];
            for (int i = 0; i < source.RegionsQps.length; i++) {
                this.RegionsQps[i] = new RegionQps(source.RegionsQps[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceEnabled", this.ServiceEnabled);
        this.setParamSimple(map, prefix + "InvalidType", this.InvalidType);
        this.setParamSimple(map, prefix + "UserLevel", this.UserLevel);
        this.setParamSimple(map, prefix + "ProExpireTime", this.ProExpireTime);
        this.setParamSimple(map, prefix + "ProRenewFlag", this.ProRenewFlag);
        this.setParamSimple(map, prefix + "ProResourceId", this.ProResourceId);
        this.setParamSimple(map, prefix + "ExclusiveVSMEnabled", this.ExclusiveVSMEnabled);
        this.setParamSimple(map, prefix + "ExclusiveHSMEnabled", this.ExclusiveHSMEnabled);
        this.setParamSimple(map, prefix + "SubscriptionInfo", this.SubscriptionInfo);
        this.setParamSimple(map, prefix + "CmkUserCount", this.CmkUserCount);
        this.setParamSimple(map, prefix + "CmkLimit", this.CmkLimit);
        this.setParamArrayObj(map, prefix + "ExclusiveHSMList.", this.ExclusiveHSMList);
        this.setParamSimple(map, prefix + "IsAllowedDataKeyHosted", this.IsAllowedDataKeyHosted);
        this.setParamSimple(map, prefix + "DataKeyLimit", this.DataKeyLimit);
        this.setParamSimple(map, prefix + "FreeDataKeyLimit", this.FreeDataKeyLimit);
        this.setParamSimple(map, prefix + "DataKeyUsedCount", this.DataKeyUsedCount);
        this.setParamArrayObj(map, prefix + "SyncTaskList.", this.SyncTaskList);
        this.setParamSimple(map, prefix + "IsAllowedSync", this.IsAllowedSync);
        this.setParamSimple(map, prefix + "QpsLimit", this.QpsLimit);
        this.setParamSimple(map, prefix + "QpsTotalLimit", this.QpsTotalLimit);
        this.setParamArrayObj(map, prefix + "RegionsQps.", this.RegionsQps);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

