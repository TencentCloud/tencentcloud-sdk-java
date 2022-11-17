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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDeployInfoResponse extends AbstractModel{

    /**
    * 合约CNS地址
    */
    @SerializedName("Hash")
    @Expose
    private String Hash;

    /**
    * 合约主群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署机构DID
    */
    @SerializedName("DeployDid")
    @Expose
    private String DeployDid;

    /**
    * TDID SDK版本
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * TDID 合约版本
    */
    @SerializedName("ContractVersion")
    @Expose
    private String ContractVersion;

    /**
    * 区块链节点版本
    */
    @SerializedName("BlockVersion")
    @Expose
    private String BlockVersion;

    /**
    * 区块链节点IP
    */
    @SerializedName("BlockIp")
    @Expose
    private String BlockIp;

    /**
    * DID合约地址
    */
    @SerializedName("DidAddress")
    @Expose
    private String DidAddress;

    /**
    * CPT合约地址
    */
    @SerializedName("CptAddress")
    @Expose
    private String CptAddress;

    /**
    * Authority Issuer地址
    */
    @SerializedName("AuthorityAddress")
    @Expose
    private String AuthorityAddress;

    /**
    * Evidence合约地址
    */
    @SerializedName("EvidenceAddress")
    @Expose
    private String EvidenceAddress;

    /**
    * Specific Issuer合约地址
    */
    @SerializedName("SpecificAddress")
    @Expose
    private String SpecificAddress;

    /**
    * 链ID
    */
    @SerializedName("ChainId")
    @Expose
    private String ChainId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合约CNS地址 
     * @return Hash 合约CNS地址
     */
    public String getHash() {
        return this.Hash;
    }

    /**
     * Set 合约CNS地址
     * @param Hash 合约CNS地址
     */
    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    /**
     * Get 合约主群组ID 
     * @return GroupId 合约主群组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 合约主群组ID
     * @param GroupId 合约主群组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 部署机构DID 
     * @return DeployDid 部署机构DID
     */
    public String getDeployDid() {
        return this.DeployDid;
    }

    /**
     * Set 部署机构DID
     * @param DeployDid 部署机构DID
     */
    public void setDeployDid(String DeployDid) {
        this.DeployDid = DeployDid;
    }

    /**
     * Get TDID SDK版本 
     * @return SdkVersion TDID SDK版本
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set TDID SDK版本
     * @param SdkVersion TDID SDK版本
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get TDID 合约版本 
     * @return ContractVersion TDID 合约版本
     */
    public String getContractVersion() {
        return this.ContractVersion;
    }

    /**
     * Set TDID 合约版本
     * @param ContractVersion TDID 合约版本
     */
    public void setContractVersion(String ContractVersion) {
        this.ContractVersion = ContractVersion;
    }

    /**
     * Get 区块链节点版本 
     * @return BlockVersion 区块链节点版本
     */
    public String getBlockVersion() {
        return this.BlockVersion;
    }

    /**
     * Set 区块链节点版本
     * @param BlockVersion 区块链节点版本
     */
    public void setBlockVersion(String BlockVersion) {
        this.BlockVersion = BlockVersion;
    }

    /**
     * Get 区块链节点IP 
     * @return BlockIp 区块链节点IP
     */
    public String getBlockIp() {
        return this.BlockIp;
    }

    /**
     * Set 区块链节点IP
     * @param BlockIp 区块链节点IP
     */
    public void setBlockIp(String BlockIp) {
        this.BlockIp = BlockIp;
    }

    /**
     * Get DID合约地址 
     * @return DidAddress DID合约地址
     */
    public String getDidAddress() {
        return this.DidAddress;
    }

    /**
     * Set DID合约地址
     * @param DidAddress DID合约地址
     */
    public void setDidAddress(String DidAddress) {
        this.DidAddress = DidAddress;
    }

    /**
     * Get CPT合约地址 
     * @return CptAddress CPT合约地址
     */
    public String getCptAddress() {
        return this.CptAddress;
    }

    /**
     * Set CPT合约地址
     * @param CptAddress CPT合约地址
     */
    public void setCptAddress(String CptAddress) {
        this.CptAddress = CptAddress;
    }

    /**
     * Get Authority Issuer地址 
     * @return AuthorityAddress Authority Issuer地址
     */
    public String getAuthorityAddress() {
        return this.AuthorityAddress;
    }

    /**
     * Set Authority Issuer地址
     * @param AuthorityAddress Authority Issuer地址
     */
    public void setAuthorityAddress(String AuthorityAddress) {
        this.AuthorityAddress = AuthorityAddress;
    }

    /**
     * Get Evidence合约地址 
     * @return EvidenceAddress Evidence合约地址
     */
    public String getEvidenceAddress() {
        return this.EvidenceAddress;
    }

    /**
     * Set Evidence合约地址
     * @param EvidenceAddress Evidence合约地址
     */
    public void setEvidenceAddress(String EvidenceAddress) {
        this.EvidenceAddress = EvidenceAddress;
    }

    /**
     * Get Specific Issuer合约地址 
     * @return SpecificAddress Specific Issuer合约地址
     */
    public String getSpecificAddress() {
        return this.SpecificAddress;
    }

    /**
     * Set Specific Issuer合约地址
     * @param SpecificAddress Specific Issuer合约地址
     */
    public void setSpecificAddress(String SpecificAddress) {
        this.SpecificAddress = SpecificAddress;
    }

    /**
     * Get 链ID 
     * @return ChainId 链ID
     */
    public String getChainId() {
        return this.ChainId;
    }

    /**
     * Set 链ID
     * @param ChainId 链ID
     */
    public void setChainId(String ChainId) {
        this.ChainId = ChainId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetDeployInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDeployInfoResponse(GetDeployInfoResponse source) {
        if (source.Hash != null) {
            this.Hash = new String(source.Hash);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.DeployDid != null) {
            this.DeployDid = new String(source.DeployDid);
        }
        if (source.SdkVersion != null) {
            this.SdkVersion = new String(source.SdkVersion);
        }
        if (source.ContractVersion != null) {
            this.ContractVersion = new String(source.ContractVersion);
        }
        if (source.BlockVersion != null) {
            this.BlockVersion = new String(source.BlockVersion);
        }
        if (source.BlockIp != null) {
            this.BlockIp = new String(source.BlockIp);
        }
        if (source.DidAddress != null) {
            this.DidAddress = new String(source.DidAddress);
        }
        if (source.CptAddress != null) {
            this.CptAddress = new String(source.CptAddress);
        }
        if (source.AuthorityAddress != null) {
            this.AuthorityAddress = new String(source.AuthorityAddress);
        }
        if (source.EvidenceAddress != null) {
            this.EvidenceAddress = new String(source.EvidenceAddress);
        }
        if (source.SpecificAddress != null) {
            this.SpecificAddress = new String(source.SpecificAddress);
        }
        if (source.ChainId != null) {
            this.ChainId = new String(source.ChainId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hash", this.Hash);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DeployDid", this.DeployDid);
        this.setParamSimple(map, prefix + "SdkVersion", this.SdkVersion);
        this.setParamSimple(map, prefix + "ContractVersion", this.ContractVersion);
        this.setParamSimple(map, prefix + "BlockVersion", this.BlockVersion);
        this.setParamSimple(map, prefix + "BlockIp", this.BlockIp);
        this.setParamSimple(map, prefix + "DidAddress", this.DidAddress);
        this.setParamSimple(map, prefix + "CptAddress", this.CptAddress);
        this.setParamSimple(map, prefix + "AuthorityAddress", this.AuthorityAddress);
        this.setParamSimple(map, prefix + "EvidenceAddress", this.EvidenceAddress);
        this.setParamSimple(map, prefix + "SpecificAddress", this.SpecificAddress);
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

