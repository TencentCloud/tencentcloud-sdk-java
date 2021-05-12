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

public class AdvancedAuthentication extends AbstractModel{

    /**
    * 防盗链配置开关，on或off，开启时必须且只能配置一种模式，其余模式为null。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 时间戳防盗链高级版模式A配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeA")
    @Expose
    private AdvancedAuthenticationTypeA TypeA;

    /**
    * 时间戳防盗链高级版模式B配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeB")
    @Expose
    private AdvancedAuthenticationTypeB TypeB;

    /**
    * 时间戳防盗链高级版模式C配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeC")
    @Expose
    private AdvancedAuthenticationTypeC TypeC;

    /**
    * 时间戳防盗链高级版模式D配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeD")
    @Expose
    private AdvancedAuthenticationTypeD TypeD;

    /**
    * 时间戳防盗链高级版模式E配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeE")
    @Expose
    private AdvancedAuthenticationTypeE TypeE;

    /**
    * 时间戳防盗链高级版模式F配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeF")
    @Expose
    private AdvancedAuthenticationTypeF TypeF;

    /**
     * Get 防盗链配置开关，on或off，开启时必须且只能配置一种模式，其余模式为null。 
     * @return Switch 防盗链配置开关，on或off，开启时必须且只能配置一种模式，其余模式为null。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 防盗链配置开关，on或off，开启时必须且只能配置一种模式，其余模式为null。
     * @param Switch 防盗链配置开关，on或off，开启时必须且只能配置一种模式，其余模式为null。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 时间戳防盗链高级版模式A配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeA 时间戳防盗链高级版模式A配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedAuthenticationTypeA getTypeA() {
        return this.TypeA;
    }

    /**
     * Set 时间戳防盗链高级版模式A配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeA 时间戳防盗链高级版模式A配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeA(AdvancedAuthenticationTypeA TypeA) {
        this.TypeA = TypeA;
    }

    /**
     * Get 时间戳防盗链高级版模式B配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeB 时间戳防盗链高级版模式B配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedAuthenticationTypeB getTypeB() {
        return this.TypeB;
    }

    /**
     * Set 时间戳防盗链高级版模式B配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeB 时间戳防盗链高级版模式B配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeB(AdvancedAuthenticationTypeB TypeB) {
        this.TypeB = TypeB;
    }

    /**
     * Get 时间戳防盗链高级版模式C配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeC 时间戳防盗链高级版模式C配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedAuthenticationTypeC getTypeC() {
        return this.TypeC;
    }

    /**
     * Set 时间戳防盗链高级版模式C配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeC 时间戳防盗链高级版模式C配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeC(AdvancedAuthenticationTypeC TypeC) {
        this.TypeC = TypeC;
    }

    /**
     * Get 时间戳防盗链高级版模式D配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeD 时间戳防盗链高级版模式D配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedAuthenticationTypeD getTypeD() {
        return this.TypeD;
    }

    /**
     * Set 时间戳防盗链高级版模式D配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeD 时间戳防盗链高级版模式D配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeD(AdvancedAuthenticationTypeD TypeD) {
        this.TypeD = TypeD;
    }

    /**
     * Get 时间戳防盗链高级版模式E配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeE 时间戳防盗链高级版模式E配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedAuthenticationTypeE getTypeE() {
        return this.TypeE;
    }

    /**
     * Set 时间戳防盗链高级版模式E配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeE 时间戳防盗链高级版模式E配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeE(AdvancedAuthenticationTypeE TypeE) {
        this.TypeE = TypeE;
    }

    /**
     * Get 时间戳防盗链高级版模式F配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeF 时间戳防盗链高级版模式F配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedAuthenticationTypeF getTypeF() {
        return this.TypeF;
    }

    /**
     * Set 时间戳防盗链高级版模式F配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeF 时间戳防盗链高级版模式F配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeF(AdvancedAuthenticationTypeF TypeF) {
        this.TypeF = TypeF;
    }

    public AdvancedAuthentication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedAuthentication(AdvancedAuthentication source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.TypeA != null) {
            this.TypeA = new AdvancedAuthenticationTypeA(source.TypeA);
        }
        if (source.TypeB != null) {
            this.TypeB = new AdvancedAuthenticationTypeB(source.TypeB);
        }
        if (source.TypeC != null) {
            this.TypeC = new AdvancedAuthenticationTypeC(source.TypeC);
        }
        if (source.TypeD != null) {
            this.TypeD = new AdvancedAuthenticationTypeD(source.TypeD);
        }
        if (source.TypeE != null) {
            this.TypeE = new AdvancedAuthenticationTypeE(source.TypeE);
        }
        if (source.TypeF != null) {
            this.TypeF = new AdvancedAuthenticationTypeF(source.TypeF);
        }
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
        this.setParamObj(map, prefix + "TypeE.", this.TypeE);
        this.setParamObj(map, prefix + "TypeF.", this.TypeF);

    }
}

