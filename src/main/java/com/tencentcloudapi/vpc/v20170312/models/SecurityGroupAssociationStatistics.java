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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupAssociationStatistics  extends AbstractModel{

    /**
    * 安全组实例ID。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 云主机实例数。
    */
    @SerializedName("CVM")
    @Expose
    private Integer CVM;

    /**
    * 数据库实例数。
    */
    @SerializedName("CDB")
    @Expose
    private Integer CDB;

    /**
    * 弹性网卡实例数。
    */
    @SerializedName("ENI")
    @Expose
    private Integer ENI;

    /**
    * 被安全组引用数。
    */
    @SerializedName("SG")
    @Expose
    private Integer SG;

    /**
    * 负载均衡实例数。
    */
    @SerializedName("CLB")
    @Expose
    private Integer CLB;

    /**
    * 全量实例的绑定统计。
    */
    @SerializedName("InstanceStatistics")
    @Expose
    private InstanceStatistic [] InstanceStatistics;

    /**
     * 获取安全组实例ID。
     * @return SecurityGroupId 安全组实例ID。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置安全组实例ID。
     * @param SecurityGroupId 安全组实例ID。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * 获取云主机实例数。
     * @return CVM 云主机实例数。
     */
    public Integer getCVM() {
        return this.CVM;
    }

    /**
     * 设置云主机实例数。
     * @param CVM 云主机实例数。
     */
    public void setCVM(Integer CVM) {
        this.CVM = CVM;
    }

    /**
     * 获取数据库实例数。
     * @return CDB 数据库实例数。
     */
    public Integer getCDB() {
        return this.CDB;
    }

    /**
     * 设置数据库实例数。
     * @param CDB 数据库实例数。
     */
    public void setCDB(Integer CDB) {
        this.CDB = CDB;
    }

    /**
     * 获取弹性网卡实例数。
     * @return ENI 弹性网卡实例数。
     */
    public Integer getENI() {
        return this.ENI;
    }

    /**
     * 设置弹性网卡实例数。
     * @param ENI 弹性网卡实例数。
     */
    public void setENI(Integer ENI) {
        this.ENI = ENI;
    }

    /**
     * 获取被安全组引用数。
     * @return SG 被安全组引用数。
     */
    public Integer getSG() {
        return this.SG;
    }

    /**
     * 设置被安全组引用数。
     * @param SG 被安全组引用数。
     */
    public void setSG(Integer SG) {
        this.SG = SG;
    }

    /**
     * 获取负载均衡实例数。
     * @return CLB 负载均衡实例数。
     */
    public Integer getCLB() {
        return this.CLB;
    }

    /**
     * 设置负载均衡实例数。
     * @param CLB 负载均衡实例数。
     */
    public void setCLB(Integer CLB) {
        this.CLB = CLB;
    }

    /**
     * 获取全量实例的绑定统计。
     * @return InstanceStatistics 全量实例的绑定统计。
     */
    public InstanceStatistic [] getInstanceStatistics() {
        return this.InstanceStatistics;
    }

    /**
     * 设置全量实例的绑定统计。
     * @param InstanceStatistics 全量实例的绑定统计。
     */
    public void setInstanceStatistics(InstanceStatistic [] InstanceStatistics) {
        this.InstanceStatistics = InstanceStatistics;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "CVM", this.CVM);
        this.setParamSimple(map, prefix + "CDB", this.CDB);
        this.setParamSimple(map, prefix + "ENI", this.ENI);
        this.setParamSimple(map, prefix + "SG", this.SG);
        this.setParamSimple(map, prefix + "CLB", this.CLB);
        this.setParamArrayObj(map, prefix + "InstanceStatistics.", this.InstanceStatistics);

    }
}

