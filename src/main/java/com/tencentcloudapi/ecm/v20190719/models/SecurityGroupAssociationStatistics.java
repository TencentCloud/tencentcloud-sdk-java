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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupAssociationStatistics extends AbstractModel {

    /**
    * 安全组实例ID。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * ECM实例数。
    */
    @SerializedName("ECM")
    @Expose
    private Long ECM;

    /**
    * ECM模块数。
    */
    @SerializedName("Module")
    @Expose
    private Long Module;

    /**
    * 弹性网卡实例数。
    */
    @SerializedName("ENI")
    @Expose
    private Long ENI;

    /**
    * 被安全组引用数。
    */
    @SerializedName("SG")
    @Expose
    private Long SG;

    /**
    * 负载均衡实例数。
    */
    @SerializedName("CLB")
    @Expose
    private Long CLB;

    /**
    * 全量实例的绑定统计。
    */
    @SerializedName("InstanceStatistics")
    @Expose
    private InstanceStatistic [] InstanceStatistics;

    /**
    * 所有资源的总计数（不包含被安全组引用数）。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 安全组实例ID。 
     * @return SecurityGroupId 安全组实例ID。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组实例ID。
     * @param SecurityGroupId 安全组实例ID。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get ECM实例数。 
     * @return ECM ECM实例数。
     */
    public Long getECM() {
        return this.ECM;
    }

    /**
     * Set ECM实例数。
     * @param ECM ECM实例数。
     */
    public void setECM(Long ECM) {
        this.ECM = ECM;
    }

    /**
     * Get ECM模块数。 
     * @return Module ECM模块数。
     */
    public Long getModule() {
        return this.Module;
    }

    /**
     * Set ECM模块数。
     * @param Module ECM模块数。
     */
    public void setModule(Long Module) {
        this.Module = Module;
    }

    /**
     * Get 弹性网卡实例数。 
     * @return ENI 弹性网卡实例数。
     */
    public Long getENI() {
        return this.ENI;
    }

    /**
     * Set 弹性网卡实例数。
     * @param ENI 弹性网卡实例数。
     */
    public void setENI(Long ENI) {
        this.ENI = ENI;
    }

    /**
     * Get 被安全组引用数。 
     * @return SG 被安全组引用数。
     */
    public Long getSG() {
        return this.SG;
    }

    /**
     * Set 被安全组引用数。
     * @param SG 被安全组引用数。
     */
    public void setSG(Long SG) {
        this.SG = SG;
    }

    /**
     * Get 负载均衡实例数。 
     * @return CLB 负载均衡实例数。
     */
    public Long getCLB() {
        return this.CLB;
    }

    /**
     * Set 负载均衡实例数。
     * @param CLB 负载均衡实例数。
     */
    public void setCLB(Long CLB) {
        this.CLB = CLB;
    }

    /**
     * Get 全量实例的绑定统计。 
     * @return InstanceStatistics 全量实例的绑定统计。
     */
    public InstanceStatistic [] getInstanceStatistics() {
        return this.InstanceStatistics;
    }

    /**
     * Set 全量实例的绑定统计。
     * @param InstanceStatistics 全量实例的绑定统计。
     */
    public void setInstanceStatistics(InstanceStatistic [] InstanceStatistics) {
        this.InstanceStatistics = InstanceStatistics;
    }

    /**
     * Get 所有资源的总计数（不包含被安全组引用数）。 
     * @return TotalCount 所有资源的总计数（不包含被安全组引用数）。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 所有资源的总计数（不包含被安全组引用数）。
     * @param TotalCount 所有资源的总计数（不包含被安全组引用数）。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public SecurityGroupAssociationStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupAssociationStatistics(SecurityGroupAssociationStatistics source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.ECM != null) {
            this.ECM = new Long(source.ECM);
        }
        if (source.Module != null) {
            this.Module = new Long(source.Module);
        }
        if (source.ENI != null) {
            this.ENI = new Long(source.ENI);
        }
        if (source.SG != null) {
            this.SG = new Long(source.SG);
        }
        if (source.CLB != null) {
            this.CLB = new Long(source.CLB);
        }
        if (source.InstanceStatistics != null) {
            this.InstanceStatistics = new InstanceStatistic[source.InstanceStatistics.length];
            for (int i = 0; i < source.InstanceStatistics.length; i++) {
                this.InstanceStatistics[i] = new InstanceStatistic(source.InstanceStatistics[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "ECM", this.ECM);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ENI", this.ENI);
        this.setParamSimple(map, prefix + "SG", this.SG);
        this.setParamSimple(map, prefix + "CLB", this.CLB);
        this.setParamArrayObj(map, prefix + "InstanceStatistics.", this.InstanceStatistics);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

