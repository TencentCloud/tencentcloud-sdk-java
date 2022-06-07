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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChainData extends AbstractModel{

    /**
    * 区块hash
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockHash")
    @Expose
    private String BlockHash;

    /**
    * 区块高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockHeight")
    @Expose
    private String BlockHeight;

    /**
    * 区块时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockTime")
    @Expose
    private String BlockTime;

    /**
     * Get 区块hash
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockHash 区块hash
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockHash() {
        return this.BlockHash;
    }

    /**
     * Set 区块hash
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockHash 区块hash
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockHash(String BlockHash) {
        this.BlockHash = BlockHash;
    }

    /**
     * Get 区块高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockHeight 区块高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockHeight() {
        return this.BlockHeight;
    }

    /**
     * Set 区块高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockHeight 区块高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockHeight(String BlockHeight) {
        this.BlockHeight = BlockHeight;
    }

    /**
     * Get 区块时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockTime 区块时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlockTime() {
        return this.BlockTime;
    }

    /**
     * Set 区块时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockTime 区块时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockTime(String BlockTime) {
        this.BlockTime = BlockTime;
    }

    public ChainData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChainData(ChainData source) {
        if (source.BlockHash != null) {
            this.BlockHash = new String(source.BlockHash);
        }
        if (source.BlockHeight != null) {
            this.BlockHeight = new String(source.BlockHeight);
        }
        if (source.BlockTime != null) {
            this.BlockTime = new String(source.BlockTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockHash", this.BlockHash);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);

    }
}

