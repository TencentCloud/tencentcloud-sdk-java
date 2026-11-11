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

public class ModifyClusterAuditLogStatusRequest extends AbstractModel {

    /**
    * <p>审计日志开关，审计日志目标状态：true-开启，false-关闭。开启要求集群已开启防护，关闭不要求。</p>
    */
    @SerializedName("AuditLogSwitch")
    @Expose
    private Boolean AuditLogSwitch;

    /**
    * <p>集群资产 id（已废弃）</p>
    */
    @SerializedName("ClusterAssetId")
    @Expose
    private String ClusterAssetId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 被调用的集团账号的成员id
    */
    @SerializedName("OperatedMemberId")
    @Expose
    private String [] OperatedMemberId;

    /**
    * <p>集群 CA 证书 MD5 列表，集群的唯一标识，支持单个或批量修改</p>
    */
    @SerializedName("ClusterCaMD5List")
    @Expose
    private String [] ClusterCaMD5List;

    /**
     * Get <p>审计日志开关，审计日志目标状态：true-开启，false-关闭。开启要求集群已开启防护，关闭不要求。</p> 
     * @return AuditLogSwitch <p>审计日志开关，审计日志目标状态：true-开启，false-关闭。开启要求集群已开启防护，关闭不要求。</p>
     */
    public Boolean getAuditLogSwitch() {
        return this.AuditLogSwitch;
    }

    /**
     * Set <p>审计日志开关，审计日志目标状态：true-开启，false-关闭。开启要求集群已开启防护，关闭不要求。</p>
     * @param AuditLogSwitch <p>审计日志开关，审计日志目标状态：true-开启，false-关闭。开启要求集群已开启防护，关闭不要求。</p>
     */
    public void setAuditLogSwitch(Boolean AuditLogSwitch) {
        this.AuditLogSwitch = AuditLogSwitch;
    }

    /**
     * Get <p>集群资产 id（已废弃）</p> 
     * @return ClusterAssetId <p>集群资产 id（已废弃）</p>
     */
    public String getClusterAssetId() {
        return this.ClusterAssetId;
    }

    /**
     * Set <p>集群资产 id（已废弃）</p>
     * @param ClusterAssetId <p>集群资产 id（已废弃）</p>
     */
    public void setClusterAssetId(String ClusterAssetId) {
        this.ClusterAssetId = ClusterAssetId;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 被调用的集团账号的成员id 
     * @return OperatedMemberId 被调用的集团账号的成员id
     */
    public String [] getOperatedMemberId() {
        return this.OperatedMemberId;
    }

    /**
     * Set 被调用的集团账号的成员id
     * @param OperatedMemberId 被调用的集团账号的成员id
     */
    public void setOperatedMemberId(String [] OperatedMemberId) {
        this.OperatedMemberId = OperatedMemberId;
    }

    /**
     * Get <p>集群 CA 证书 MD5 列表，集群的唯一标识，支持单个或批量修改</p> 
     * @return ClusterCaMD5List <p>集群 CA 证书 MD5 列表，集群的唯一标识，支持单个或批量修改</p>
     */
    public String [] getClusterCaMD5List() {
        return this.ClusterCaMD5List;
    }

    /**
     * Set <p>集群 CA 证书 MD5 列表，集群的唯一标识，支持单个或批量修改</p>
     * @param ClusterCaMD5List <p>集群 CA 证书 MD5 列表，集群的唯一标识，支持单个或批量修改</p>
     */
    public void setClusterCaMD5List(String [] ClusterCaMD5List) {
        this.ClusterCaMD5List = ClusterCaMD5List;
    }

    public ModifyClusterAuditLogStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterAuditLogStatusRequest(ModifyClusterAuditLogStatusRequest source) {
        if (source.AuditLogSwitch != null) {
            this.AuditLogSwitch = new Boolean(source.AuditLogSwitch);
        }
        if (source.ClusterAssetId != null) {
            this.ClusterAssetId = new String(source.ClusterAssetId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.OperatedMemberId != null) {
            this.OperatedMemberId = new String[source.OperatedMemberId.length];
            for (int i = 0; i < source.OperatedMemberId.length; i++) {
                this.OperatedMemberId[i] = new String(source.OperatedMemberId[i]);
            }
        }
        if (source.ClusterCaMD5List != null) {
            this.ClusterCaMD5List = new String[source.ClusterCaMD5List.length];
            for (int i = 0; i < source.ClusterCaMD5List.length; i++) {
                this.ClusterCaMD5List[i] = new String(source.ClusterCaMD5List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditLogSwitch", this.AuditLogSwitch);
        this.setParamSimple(map, prefix + "ClusterAssetId", this.ClusterAssetId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "OperatedMemberId.", this.OperatedMemberId);
        this.setParamArraySimple(map, prefix + "ClusterCaMD5List.", this.ClusterCaMD5List);

    }
}

