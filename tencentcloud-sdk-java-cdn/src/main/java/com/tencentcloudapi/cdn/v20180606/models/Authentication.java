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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Authentication extends AbstractModel{

    /**
    * 防盗链配置开关
on：开启
off：关闭
开启时必须且只配置一种模式，其余模式需要设置为 null
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 时间戳防盗链模式 A 配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeA")
    @Expose
    private AuthenticationTypeA TypeA;

    /**
    * 时间戳防盗链模式 B 配置（模式 B 后台升级中，暂时不支持配置）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeB")
    @Expose
    private AuthenticationTypeB TypeB;

    /**
    * 时间戳防盗链模式 C 配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeC")
    @Expose
    private AuthenticationTypeC TypeC;

    /**
    * 时间戳防盗链模式 D 配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeD")
    @Expose
    private AuthenticationTypeD TypeD;

    /**
     * Get 防盗链配置开关
on：开启
off：关闭
开启时必须且只配置一种模式，其余模式需要设置为 null 
     * @return Switch 防盗链配置开关
on：开启
off：关闭
开启时必须且只配置一种模式，其余模式需要设置为 null
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 防盗链配置开关
on：开启
off：关闭
开启时必须且只配置一种模式，其余模式需要设置为 null
     * @param Switch 防盗链配置开关
on：开启
off：关闭
开启时必须且只配置一种模式，其余模式需要设置为 null
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 时间戳防盗链模式 A 配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeA 时间戳防盗链模式 A 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthenticationTypeA getTypeA() {
        return this.TypeA;
    }

    /**
     * Set 时间戳防盗链模式 A 配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeA 时间戳防盗链模式 A 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeA(AuthenticationTypeA TypeA) {
        this.TypeA = TypeA;
    }

    /**
     * Get 时间戳防盗链模式 B 配置（模式 B 后台升级中，暂时不支持配置）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeB 时间戳防盗链模式 B 配置（模式 B 后台升级中，暂时不支持配置）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthenticationTypeB getTypeB() {
        return this.TypeB;
    }

    /**
     * Set 时间戳防盗链模式 B 配置（模式 B 后台升级中，暂时不支持配置）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeB 时间戳防盗链模式 B 配置（模式 B 后台升级中，暂时不支持配置）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeB(AuthenticationTypeB TypeB) {
        this.TypeB = TypeB;
    }

    /**
     * Get 时间戳防盗链模式 C 配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeC 时间戳防盗链模式 C 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthenticationTypeC getTypeC() {
        return this.TypeC;
    }

    /**
     * Set 时间戳防盗链模式 C 配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeC 时间戳防盗链模式 C 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeC(AuthenticationTypeC TypeC) {
        this.TypeC = TypeC;
    }

    /**
     * Get 时间戳防盗链模式 D 配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeD 时间戳防盗链模式 D 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthenticationTypeD getTypeD() {
        return this.TypeD;
    }

    /**
     * Set 时间戳防盗链模式 D 配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeD 时间戳防盗链模式 D 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeD(AuthenticationTypeD TypeD) {
        this.TypeD = TypeD;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "TypeA.", this.TypeA);
        this.setParamObj(map, prefix + "TypeB.", this.TypeB);
        this.setParamObj(map, prefix + "TypeC.", this.TypeC);
        this.setParamObj(map, prefix + "TypeD.", this.TypeD);

    }
}

