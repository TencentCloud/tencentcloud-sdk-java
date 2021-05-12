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
package com.tencentcloudapi.btoe.v20210303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHashDepositNoSealResponse extends AbstractModel{

    /**
    * 透传字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 存证编码
    */
    @SerializedName("EvidenceId")
    @Expose
    private String EvidenceId;

    /**
    * 上链时间
    */
    @SerializedName("EvidenceTime")
    @Expose
    private String EvidenceTime;

    /**
    * 区块链交易哈希
    */
    @SerializedName("EvidenceTxHash")
    @Expose
    private String EvidenceTxHash;

    /**
    * 区块高度
    */
    @SerializedName("BlockchainHeight")
    @Expose
    private Long BlockchainHeight;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 透传字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessId 透传字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 透传字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessId 透传字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 存证编码 
     * @return EvidenceId 存证编码
     */
    public String getEvidenceId() {
        return this.EvidenceId;
    }

    /**
     * Set 存证编码
     * @param EvidenceId 存证编码
     */
    public void setEvidenceId(String EvidenceId) {
        this.EvidenceId = EvidenceId;
    }

    /**
     * Get 上链时间 
     * @return EvidenceTime 上链时间
     */
    public String getEvidenceTime() {
        return this.EvidenceTime;
    }

    /**
     * Set 上链时间
     * @param EvidenceTime 上链时间
     */
    public void setEvidenceTime(String EvidenceTime) {
        this.EvidenceTime = EvidenceTime;
    }

    /**
     * Get 区块链交易哈希 
     * @return EvidenceTxHash 区块链交易哈希
     */
    public String getEvidenceTxHash() {
        return this.EvidenceTxHash;
    }

    /**
     * Set 区块链交易哈希
     * @param EvidenceTxHash 区块链交易哈希
     */
    public void setEvidenceTxHash(String EvidenceTxHash) {
        this.EvidenceTxHash = EvidenceTxHash;
    }

    /**
     * Get 区块高度 
     * @return BlockchainHeight 区块高度
     */
    public Long getBlockchainHeight() {
        return this.BlockchainHeight;
    }

    /**
     * Set 区块高度
     * @param BlockchainHeight 区块高度
     */
    public void setBlockchainHeight(Long BlockchainHeight) {
        this.BlockchainHeight = BlockchainHeight;
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

    public CreateHashDepositNoSealResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHashDepositNoSealResponse(CreateHashDepositNoSealResponse source) {
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.EvidenceId != null) {
            this.EvidenceId = new String(source.EvidenceId);
        }
        if (source.EvidenceTime != null) {
            this.EvidenceTime = new String(source.EvidenceTime);
        }
        if (source.EvidenceTxHash != null) {
            this.EvidenceTxHash = new String(source.EvidenceTxHash);
        }
        if (source.BlockchainHeight != null) {
            this.BlockchainHeight = new Long(source.BlockchainHeight);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "EvidenceId", this.EvidenceId);
        this.setParamSimple(map, prefix + "EvidenceTime", this.EvidenceTime);
        this.setParamSimple(map, prefix + "EvidenceTxHash", this.EvidenceTxHash);
        this.setParamSimple(map, prefix + "BlockchainHeight", this.BlockchainHeight);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

