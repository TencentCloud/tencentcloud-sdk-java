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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcFwJoinInstanceType extends AbstractModel {

    /**
    * 接入实例类型，VPC、DIRECTCONNECT、 VPNGW 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * 接入的对应网络实例类型的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get 接入实例类型，VPC、DIRECTCONNECT、 VPNGW 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinType 接入实例类型，VPC、DIRECTCONNECT、 VPNGW 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set 接入实例类型，VPC、DIRECTCONNECT、 VPNGW 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinType 接入实例类型，VPC、DIRECTCONNECT、 VPNGW 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    /**
     * Get 接入的对应网络实例类型的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Num 接入的对应网络实例类型的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 接入的对应网络实例类型的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Num 接入的对应网络实例类型的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public VpcFwJoinInstanceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcFwJoinInstanceType(VpcFwJoinInstanceType source) {
        if (source.JoinType != null) {
            this.JoinType = new String(source.JoinType);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JoinType", this.JoinType);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

