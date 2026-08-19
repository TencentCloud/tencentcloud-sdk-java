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

public class EdrAlertCountItem extends AbstractModel {

    /**
    * <p>查询实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>总告警条数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>病毒木马（VIRUS_TROJAN）数量</p>
    */
    @SerializedName("VirusTrojanCount")
    @Expose
    private Long VirusTrojanCount;

    /**
    * <p>异常登录（ABNORMAL_LOGIN）数量</p>
    */
    @SerializedName("AbnormalLoginCount")
    @Expose
    private Long AbnormalLoginCount;

    /**
    * <p>主机行为（HOST_BEHAVIOR）数量</p>
    */
    @SerializedName("HostBehaviorCount")
    @Expose
    private Long HostBehaviorCount;

    /**
    * <p>网络行为（NETWORK_BEHAVIOR）数量</p>
    */
    @SerializedName("NetworkBehaviorCount")
    @Expose
    private Long NetworkBehaviorCount;

    /**
    * <p>存在告警的主机数量（仅 GlobalCount 模式有值）</p>
    */
    @SerializedName("InstancesCount")
    @Expose
    private Long InstancesCount;

    /**
     * Get <p>查询实例ID</p> 
     * @return InstanceId <p>查询实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>查询实例ID</p>
     * @param InstanceId <p>查询实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>总告警条数</p> 
     * @return TotalCount <p>总告警条数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总告警条数</p>
     * @param TotalCount <p>总告警条数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>病毒木马（VIRUS_TROJAN）数量</p> 
     * @return VirusTrojanCount <p>病毒木马（VIRUS_TROJAN）数量</p>
     */
    public Long getVirusTrojanCount() {
        return this.VirusTrojanCount;
    }

    /**
     * Set <p>病毒木马（VIRUS_TROJAN）数量</p>
     * @param VirusTrojanCount <p>病毒木马（VIRUS_TROJAN）数量</p>
     */
    public void setVirusTrojanCount(Long VirusTrojanCount) {
        this.VirusTrojanCount = VirusTrojanCount;
    }

    /**
     * Get <p>异常登录（ABNORMAL_LOGIN）数量</p> 
     * @return AbnormalLoginCount <p>异常登录（ABNORMAL_LOGIN）数量</p>
     */
    public Long getAbnormalLoginCount() {
        return this.AbnormalLoginCount;
    }

    /**
     * Set <p>异常登录（ABNORMAL_LOGIN）数量</p>
     * @param AbnormalLoginCount <p>异常登录（ABNORMAL_LOGIN）数量</p>
     */
    public void setAbnormalLoginCount(Long AbnormalLoginCount) {
        this.AbnormalLoginCount = AbnormalLoginCount;
    }

    /**
     * Get <p>主机行为（HOST_BEHAVIOR）数量</p> 
     * @return HostBehaviorCount <p>主机行为（HOST_BEHAVIOR）数量</p>
     */
    public Long getHostBehaviorCount() {
        return this.HostBehaviorCount;
    }

    /**
     * Set <p>主机行为（HOST_BEHAVIOR）数量</p>
     * @param HostBehaviorCount <p>主机行为（HOST_BEHAVIOR）数量</p>
     */
    public void setHostBehaviorCount(Long HostBehaviorCount) {
        this.HostBehaviorCount = HostBehaviorCount;
    }

    /**
     * Get <p>网络行为（NETWORK_BEHAVIOR）数量</p> 
     * @return NetworkBehaviorCount <p>网络行为（NETWORK_BEHAVIOR）数量</p>
     */
    public Long getNetworkBehaviorCount() {
        return this.NetworkBehaviorCount;
    }

    /**
     * Set <p>网络行为（NETWORK_BEHAVIOR）数量</p>
     * @param NetworkBehaviorCount <p>网络行为（NETWORK_BEHAVIOR）数量</p>
     */
    public void setNetworkBehaviorCount(Long NetworkBehaviorCount) {
        this.NetworkBehaviorCount = NetworkBehaviorCount;
    }

    /**
     * Get <p>存在告警的主机数量（仅 GlobalCount 模式有值）</p> 
     * @return InstancesCount <p>存在告警的主机数量（仅 GlobalCount 模式有值）</p>
     */
    public Long getInstancesCount() {
        return this.InstancesCount;
    }

    /**
     * Set <p>存在告警的主机数量（仅 GlobalCount 模式有值）</p>
     * @param InstancesCount <p>存在告警的主机数量（仅 GlobalCount 模式有值）</p>
     */
    public void setInstancesCount(Long InstancesCount) {
        this.InstancesCount = InstancesCount;
    }

    public EdrAlertCountItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertCountItem(EdrAlertCountItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VirusTrojanCount != null) {
            this.VirusTrojanCount = new Long(source.VirusTrojanCount);
        }
        if (source.AbnormalLoginCount != null) {
            this.AbnormalLoginCount = new Long(source.AbnormalLoginCount);
        }
        if (source.HostBehaviorCount != null) {
            this.HostBehaviorCount = new Long(source.HostBehaviorCount);
        }
        if (source.NetworkBehaviorCount != null) {
            this.NetworkBehaviorCount = new Long(source.NetworkBehaviorCount);
        }
        if (source.InstancesCount != null) {
            this.InstancesCount = new Long(source.InstancesCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "VirusTrojanCount", this.VirusTrojanCount);
        this.setParamSimple(map, prefix + "AbnormalLoginCount", this.AbnormalLoginCount);
        this.setParamSimple(map, prefix + "HostBehaviorCount", this.HostBehaviorCount);
        this.setParamSimple(map, prefix + "NetworkBehaviorCount", this.NetworkBehaviorCount);
        this.setParamSimple(map, prefix + "InstancesCount", this.InstancesCount);

    }
}

