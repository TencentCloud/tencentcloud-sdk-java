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

public class GetDataPanelResponse extends AbstractModel{

    /**
    * 区块链网络数量
    */
    @SerializedName("BlockNetworkCount")
    @Expose
    private Long BlockNetworkCount;

    /**
    * 区块链网络名称
    */
    @SerializedName("BlockNetworkName")
    @Expose
    private String BlockNetworkName;

    /**
    * 当前区块高度
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
    * 区块链网络类型
    */
    @SerializedName("BlockNetworkType")
    @Expose
    private Long BlockNetworkType;

    /**
    * did数量
    */
    @SerializedName("DidCount")
    @Expose
    private Long DidCount;

    /**
    * 凭证模版数量
    */
    @SerializedName("CptCount")
    @Expose
    private Long CptCount;

    /**
    * 已认证权威机构数量
    */
    @SerializedName("CertificatedAuthCount")
    @Expose
    private Long CertificatedAuthCount;

    /**
    * 颁发凭证数量
    */
    @SerializedName("IssueCptCount")
    @Expose
    private Long IssueCptCount;

    /**
    * 本周新增DID数量
    */
    @SerializedName("NewDidCount")
    @Expose
    private Long NewDidCount;

    /**
    * BCOS网络类型数量
    */
    @SerializedName("BcosCount")
    @Expose
    private Long BcosCount;

    /**
    * Fabric网络类型数量
    */
    @SerializedName("FabricCount")
    @Expose
    private Long FabricCount;

    /**
    * 长安链网络类型数量
    */
    @SerializedName("ChainMakerCount")
    @Expose
    private Long ChainMakerCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 区块链网络数量 
     * @return BlockNetworkCount 区块链网络数量
     */
    public Long getBlockNetworkCount() {
        return this.BlockNetworkCount;
    }

    /**
     * Set 区块链网络数量
     * @param BlockNetworkCount 区块链网络数量
     */
    public void setBlockNetworkCount(Long BlockNetworkCount) {
        this.BlockNetworkCount = BlockNetworkCount;
    }

    /**
     * Get 区块链网络名称 
     * @return BlockNetworkName 区块链网络名称
     */
    public String getBlockNetworkName() {
        return this.BlockNetworkName;
    }

    /**
     * Set 区块链网络名称
     * @param BlockNetworkName 区块链网络名称
     */
    public void setBlockNetworkName(String BlockNetworkName) {
        this.BlockNetworkName = BlockNetworkName;
    }

    /**
     * Get 当前区块高度 
     * @return BlockHeight 当前区块高度
     */
    public Long getBlockHeight() {
        return this.BlockHeight;
    }

    /**
     * Set 当前区块高度
     * @param BlockHeight 当前区块高度
     */
    public void setBlockHeight(Long BlockHeight) {
        this.BlockHeight = BlockHeight;
    }

    /**
     * Get 区块链网络类型 
     * @return BlockNetworkType 区块链网络类型
     */
    public Long getBlockNetworkType() {
        return this.BlockNetworkType;
    }

    /**
     * Set 区块链网络类型
     * @param BlockNetworkType 区块链网络类型
     */
    public void setBlockNetworkType(Long BlockNetworkType) {
        this.BlockNetworkType = BlockNetworkType;
    }

    /**
     * Get did数量 
     * @return DidCount did数量
     */
    public Long getDidCount() {
        return this.DidCount;
    }

    /**
     * Set did数量
     * @param DidCount did数量
     */
    public void setDidCount(Long DidCount) {
        this.DidCount = DidCount;
    }

    /**
     * Get 凭证模版数量 
     * @return CptCount 凭证模版数量
     */
    public Long getCptCount() {
        return this.CptCount;
    }

    /**
     * Set 凭证模版数量
     * @param CptCount 凭证模版数量
     */
    public void setCptCount(Long CptCount) {
        this.CptCount = CptCount;
    }

    /**
     * Get 已认证权威机构数量 
     * @return CertificatedAuthCount 已认证权威机构数量
     */
    public Long getCertificatedAuthCount() {
        return this.CertificatedAuthCount;
    }

    /**
     * Set 已认证权威机构数量
     * @param CertificatedAuthCount 已认证权威机构数量
     */
    public void setCertificatedAuthCount(Long CertificatedAuthCount) {
        this.CertificatedAuthCount = CertificatedAuthCount;
    }

    /**
     * Get 颁发凭证数量 
     * @return IssueCptCount 颁发凭证数量
     */
    public Long getIssueCptCount() {
        return this.IssueCptCount;
    }

    /**
     * Set 颁发凭证数量
     * @param IssueCptCount 颁发凭证数量
     */
    public void setIssueCptCount(Long IssueCptCount) {
        this.IssueCptCount = IssueCptCount;
    }

    /**
     * Get 本周新增DID数量 
     * @return NewDidCount 本周新增DID数量
     */
    public Long getNewDidCount() {
        return this.NewDidCount;
    }

    /**
     * Set 本周新增DID数量
     * @param NewDidCount 本周新增DID数量
     */
    public void setNewDidCount(Long NewDidCount) {
        this.NewDidCount = NewDidCount;
    }

    /**
     * Get BCOS网络类型数量 
     * @return BcosCount BCOS网络类型数量
     */
    public Long getBcosCount() {
        return this.BcosCount;
    }

    /**
     * Set BCOS网络类型数量
     * @param BcosCount BCOS网络类型数量
     */
    public void setBcosCount(Long BcosCount) {
        this.BcosCount = BcosCount;
    }

    /**
     * Get Fabric网络类型数量 
     * @return FabricCount Fabric网络类型数量
     */
    public Long getFabricCount() {
        return this.FabricCount;
    }

    /**
     * Set Fabric网络类型数量
     * @param FabricCount Fabric网络类型数量
     */
    public void setFabricCount(Long FabricCount) {
        this.FabricCount = FabricCount;
    }

    /**
     * Get 长安链网络类型数量 
     * @return ChainMakerCount 长安链网络类型数量
     */
    public Long getChainMakerCount() {
        return this.ChainMakerCount;
    }

    /**
     * Set 长安链网络类型数量
     * @param ChainMakerCount 长安链网络类型数量
     */
    public void setChainMakerCount(Long ChainMakerCount) {
        this.ChainMakerCount = ChainMakerCount;
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

    public GetDataPanelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDataPanelResponse(GetDataPanelResponse source) {
        if (source.BlockNetworkCount != null) {
            this.BlockNetworkCount = new Long(source.BlockNetworkCount);
        }
        if (source.BlockNetworkName != null) {
            this.BlockNetworkName = new String(source.BlockNetworkName);
        }
        if (source.BlockHeight != null) {
            this.BlockHeight = new Long(source.BlockHeight);
        }
        if (source.BlockNetworkType != null) {
            this.BlockNetworkType = new Long(source.BlockNetworkType);
        }
        if (source.DidCount != null) {
            this.DidCount = new Long(source.DidCount);
        }
        if (source.CptCount != null) {
            this.CptCount = new Long(source.CptCount);
        }
        if (source.CertificatedAuthCount != null) {
            this.CertificatedAuthCount = new Long(source.CertificatedAuthCount);
        }
        if (source.IssueCptCount != null) {
            this.IssueCptCount = new Long(source.IssueCptCount);
        }
        if (source.NewDidCount != null) {
            this.NewDidCount = new Long(source.NewDidCount);
        }
        if (source.BcosCount != null) {
            this.BcosCount = new Long(source.BcosCount);
        }
        if (source.FabricCount != null) {
            this.FabricCount = new Long(source.FabricCount);
        }
        if (source.ChainMakerCount != null) {
            this.ChainMakerCount = new Long(source.ChainMakerCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockNetworkCount", this.BlockNetworkCount);
        this.setParamSimple(map, prefix + "BlockNetworkName", this.BlockNetworkName);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "BlockNetworkType", this.BlockNetworkType);
        this.setParamSimple(map, prefix + "DidCount", this.DidCount);
        this.setParamSimple(map, prefix + "CptCount", this.CptCount);
        this.setParamSimple(map, prefix + "CertificatedAuthCount", this.CertificatedAuthCount);
        this.setParamSimple(map, prefix + "IssueCptCount", this.IssueCptCount);
        this.setParamSimple(map, prefix + "NewDidCount", this.NewDidCount);
        this.setParamSimple(map, prefix + "BcosCount", this.BcosCount);
        this.setParamSimple(map, prefix + "FabricCount", this.FabricCount);
        this.setParamSimple(map, prefix + "ChainMakerCount", this.ChainMakerCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

