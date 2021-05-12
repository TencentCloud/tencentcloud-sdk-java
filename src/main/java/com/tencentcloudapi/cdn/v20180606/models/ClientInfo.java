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

public class ClientInfo extends AbstractModel{

    /**
    * 省份。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProvName")
    @Expose
    private String ProvName;

    /**
    * 国家。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 运营商。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * 客户端IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get 省份。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProvName 省份。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvName() {
        return this.ProvName;
    }

    /**
     * Set 省份。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProvName 省份。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvName(String ProvName) {
        this.ProvName = ProvName;
    }

    /**
     * Get 国家。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Country 国家。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Country 国家。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 运营商。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IspName 运营商。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set 运营商。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IspName 运营商。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get 客户端IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 客户端IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 客户端IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 客户端IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public ClientInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientInfo(ClientInfo source) {
        if (source.ProvName != null) {
            this.ProvName = new String(source.ProvName);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.IspName != null) {
            this.IspName = new String(source.IspName);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProvName", this.ProvName);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

