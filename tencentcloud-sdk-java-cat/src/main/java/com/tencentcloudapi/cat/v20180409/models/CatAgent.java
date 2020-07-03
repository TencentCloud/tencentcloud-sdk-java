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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CatAgent extends AbstractModel{

    /**
    * 拨测结点所在的省份（拼音缩写）
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 拨测结点所在的运营商（英文缩写）
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 拨测结点所在的省份（中文名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProvinceName")
    @Expose
    private String ProvinceName;

    /**
    * 拨测结点所在的运营商（中文名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
     * Get 拨测结点所在的省份（拼音缩写） 
     * @return Province 拨测结点所在的省份（拼音缩写）
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 拨测结点所在的省份（拼音缩写）
     * @param Province 拨测结点所在的省份（拼音缩写）
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 拨测结点所在的运营商（英文缩写） 
     * @return Isp 拨测结点所在的运营商（英文缩写）
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 拨测结点所在的运营商（英文缩写）
     * @param Isp 拨测结点所在的运营商（英文缩写）
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 拨测结点所在的省份（中文名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProvinceName 拨测结点所在的省份（中文名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * Set 拨测结点所在的省份（中文名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProvinceName 拨测结点所在的省份（中文名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    /**
     * Get 拨测结点所在的运营商（中文名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IspName 拨测结点所在的运营商（中文名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set 拨测结点所在的运营商（中文名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IspName 拨测结点所在的运营商（中文名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "ProvinceName", this.ProvinceName);
        this.setParamSimple(map, prefix + "IspName", this.IspName);

    }
}

