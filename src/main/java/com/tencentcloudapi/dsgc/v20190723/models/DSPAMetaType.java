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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DSPAMetaType extends AbstractModel {

    /**
    * 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * 支持的此元数据类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
    * 此元数据类型支持的授权类型：
account    -- 账户名密码授权，账户的最高只读权限需要由用户自行赋予；
automatic -- 一键授权，由DSPA自动生成账户名密码并自动在实例中给账户名赋予最高只读权限；
如果此列表为空，表明此类资源不支持以上的授权机制，无法通过后台进行授权。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportedAuthTypes")
    @Expose
    private String [] SupportedAuthTypes;

    /**
     * Get 元数据类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaType 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaType 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get 支持的此元数据类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regions 支持的此元数据类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set 支持的此元数据类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regions 支持的此元数据类型的地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get 此元数据类型支持的授权类型：
account    -- 账户名密码授权，账户的最高只读权限需要由用户自行赋予；
automatic -- 一键授权，由DSPA自动生成账户名密码并自动在实例中给账户名赋予最高只读权限；
如果此列表为空，表明此类资源不支持以上的授权机制，无法通过后台进行授权。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportedAuthTypes 此元数据类型支持的授权类型：
account    -- 账户名密码授权，账户的最高只读权限需要由用户自行赋予；
automatic -- 一键授权，由DSPA自动生成账户名密码并自动在实例中给账户名赋予最高只读权限；
如果此列表为空，表明此类资源不支持以上的授权机制，无法通过后台进行授权。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportedAuthTypes() {
        return this.SupportedAuthTypes;
    }

    /**
     * Set 此元数据类型支持的授权类型：
account    -- 账户名密码授权，账户的最高只读权限需要由用户自行赋予；
automatic -- 一键授权，由DSPA自动生成账户名密码并自动在实例中给账户名赋予最高只读权限；
如果此列表为空，表明此类资源不支持以上的授权机制，无法通过后台进行授权。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportedAuthTypes 此元数据类型支持的授权类型：
account    -- 账户名密码授权，账户的最高只读权限需要由用户自行赋予；
automatic -- 一键授权，由DSPA自动生成账户名密码并自动在实例中给账户名赋予最高只读权限；
如果此列表为空，表明此类资源不支持以上的授权机制，无法通过后台进行授权。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportedAuthTypes(String [] SupportedAuthTypes) {
        this.SupportedAuthTypes = SupportedAuthTypes;
    }

    public DSPAMetaType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DSPAMetaType(DSPAMetaType source) {
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
        if (source.SupportedAuthTypes != null) {
            this.SupportedAuthTypes = new String[source.SupportedAuthTypes.length];
            for (int i = 0; i < source.SupportedAuthTypes.length; i++) {
                this.SupportedAuthTypes[i] = new String(source.SupportedAuthTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);
        this.setParamArraySimple(map, prefix + "SupportedAuthTypes.", this.SupportedAuthTypes);

    }
}

