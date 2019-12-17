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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpcPeerConnectionRequest extends AbstractModel{

    /**
    * 本端VPC唯一ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 对端VPC唯一ID
    */
    @SerializedName("PeerVpcId")
    @Expose
    private String PeerVpcId;

    /**
    * 对端地域，取值范围为gz,sh,bj,hk,cd,de,sh_bm,gz_bm,bj_bm,cq_bm等
    */
    @SerializedName("PeerRegion")
    @Expose
    private String PeerRegion;

    /**
    * 对等连接名称
    */
    @SerializedName("VpcPeerConnectionName")
    @Expose
    private String VpcPeerConnectionName;

    /**
    * 对端账户OwnerUin（默认值为本端账户）
    */
    @SerializedName("PeerUin")
    @Expose
    private String PeerUin;

    /**
    * 跨地域必传，带宽上限值
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get 本端VPC唯一ID 
     * @return VpcId 本端VPC唯一ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 本端VPC唯一ID
     * @param VpcId 本端VPC唯一ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 对端VPC唯一ID 
     * @return PeerVpcId 对端VPC唯一ID
     */
    public String getPeerVpcId() {
        return this.PeerVpcId;
    }

    /**
     * Set 对端VPC唯一ID
     * @param PeerVpcId 对端VPC唯一ID
     */
    public void setPeerVpcId(String PeerVpcId) {
        this.PeerVpcId = PeerVpcId;
    }

    /**
     * Get 对端地域，取值范围为gz,sh,bj,hk,cd,de,sh_bm,gz_bm,bj_bm,cq_bm等 
     * @return PeerRegion 对端地域，取值范围为gz,sh,bj,hk,cd,de,sh_bm,gz_bm,bj_bm,cq_bm等
     */
    public String getPeerRegion() {
        return this.PeerRegion;
    }

    /**
     * Set 对端地域，取值范围为gz,sh,bj,hk,cd,de,sh_bm,gz_bm,bj_bm,cq_bm等
     * @param PeerRegion 对端地域，取值范围为gz,sh,bj,hk,cd,de,sh_bm,gz_bm,bj_bm,cq_bm等
     */
    public void setPeerRegion(String PeerRegion) {
        this.PeerRegion = PeerRegion;
    }

    /**
     * Get 对等连接名称 
     * @return VpcPeerConnectionName 对等连接名称
     */
    public String getVpcPeerConnectionName() {
        return this.VpcPeerConnectionName;
    }

    /**
     * Set 对等连接名称
     * @param VpcPeerConnectionName 对等连接名称
     */
    public void setVpcPeerConnectionName(String VpcPeerConnectionName) {
        this.VpcPeerConnectionName = VpcPeerConnectionName;
    }

    /**
     * Get 对端账户OwnerUin（默认值为本端账户） 
     * @return PeerUin 对端账户OwnerUin（默认值为本端账户）
     */
    public String getPeerUin() {
        return this.PeerUin;
    }

    /**
     * Set 对端账户OwnerUin（默认值为本端账户）
     * @param PeerUin 对端账户OwnerUin（默认值为本端账户）
     */
    public void setPeerUin(String PeerUin) {
        this.PeerUin = PeerUin;
    }

    /**
     * Get 跨地域必传，带宽上限值 
     * @return Bandwidth 跨地域必传，带宽上限值
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 跨地域必传，带宽上限值
     * @param Bandwidth 跨地域必传，带宽上限值
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "PeerVpcId", this.PeerVpcId);
        this.setParamSimple(map, prefix + "PeerRegion", this.PeerRegion);
        this.setParamSimple(map, prefix + "VpcPeerConnectionName", this.VpcPeerConnectionName);
        this.setParamSimple(map, prefix + "PeerUin", this.PeerUin);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

