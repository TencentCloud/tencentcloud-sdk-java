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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcCidrBlock extends AbstractModel {

    /**
    * 子网Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CidrId")
    @Expose
    private String CidrId;

    /**
    * 子网网段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CidrAddr")
    @Expose
    private String CidrAddr;

    /**
     * Get 子网Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CidrId 子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCidrId() {
        return this.CidrId;
    }

    /**
     * Set 子网Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CidrId 子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidrId(String CidrId) {
        this.CidrId = CidrId;
    }

    /**
     * Get 子网网段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CidrAddr 子网网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCidrAddr() {
        return this.CidrAddr;
    }

    /**
     * Set 子网网段
注意：此字段可能返回 null，表示取不到有效值。
     * @param CidrAddr 子网网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidrAddr(String CidrAddr) {
        this.CidrAddr = CidrAddr;
    }

    public VpcCidrBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcCidrBlock(VpcCidrBlock source) {
        if (source.CidrId != null) {
            this.CidrId = new String(source.CidrId);
        }
        if (source.CidrAddr != null) {
            this.CidrAddr = new String(source.CidrAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CidrId", this.CidrId);
        this.setParamSimple(map, prefix + "CidrAddr", this.CidrAddr);

    }
}

