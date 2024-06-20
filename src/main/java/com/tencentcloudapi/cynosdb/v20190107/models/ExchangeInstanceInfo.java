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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExchangeInstanceInfo extends AbstractModel {

    /**
    * 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcInstanceInfo")
    @Expose
    private RollbackInstanceInfo SrcInstanceInfo;

    /**
    * 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstInstanceInfo")
    @Expose
    private RollbackInstanceInfo DstInstanceInfo;

    /**
     * Get 源实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcInstanceInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RollbackInstanceInfo getSrcInstanceInfo() {
        return this.SrcInstanceInfo;
    }

    /**
     * Set 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcInstanceInfo 源实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcInstanceInfo(RollbackInstanceInfo SrcInstanceInfo) {
        this.SrcInstanceInfo = SrcInstanceInfo;
    }

    /**
     * Get 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstInstanceInfo 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RollbackInstanceInfo getDstInstanceInfo() {
        return this.DstInstanceInfo;
    }

    /**
     * Set 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstInstanceInfo 目标实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstInstanceInfo(RollbackInstanceInfo DstInstanceInfo) {
        this.DstInstanceInfo = DstInstanceInfo;
    }

    public ExchangeInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExchangeInstanceInfo(ExchangeInstanceInfo source) {
        if (source.SrcInstanceInfo != null) {
            this.SrcInstanceInfo = new RollbackInstanceInfo(source.SrcInstanceInfo);
        }
        if (source.DstInstanceInfo != null) {
            this.DstInstanceInfo = new RollbackInstanceInfo(source.DstInstanceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SrcInstanceInfo.", this.SrcInstanceInfo);
        this.setParamObj(map, prefix + "DstInstanceInfo.", this.DstInstanceInfo);

    }
}

