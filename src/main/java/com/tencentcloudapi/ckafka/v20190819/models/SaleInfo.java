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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaleInfo extends AbstractModel{

    /**
    * 手动设置的flag标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Flag")
    @Expose
    private Boolean Flag;

    /**
    * ckakfa版本号(1.1.1/2.4.2/0.10.2)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 专业版、标准版标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 售罄标志：true售罄
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoldOut")
    @Expose
    private Boolean SoldOut;

    /**
     * Get 手动设置的flag标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Flag 手动设置的flag标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getFlag() {
        return this.Flag;
    }

    /**
     * Set 手动设置的flag标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param Flag 手动设置的flag标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }

    /**
     * Get ckakfa版本号(1.1.1/2.4.2/0.10.2)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version ckakfa版本号(1.1.1/2.4.2/0.10.2)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set ckakfa版本号(1.1.1/2.4.2/0.10.2)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version ckakfa版本号(1.1.1/2.4.2/0.10.2)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 专业版、标准版标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Platform 专业版、标准版标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 专业版、标准版标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param Platform 专业版、标准版标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 售罄标志：true售罄
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoldOut 售罄标志：true售罄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSoldOut() {
        return this.SoldOut;
    }

    /**
     * Set 售罄标志：true售罄
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoldOut 售罄标志：true售罄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoldOut(Boolean SoldOut) {
        this.SoldOut = SoldOut;
    }

    public SaleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaleInfo(SaleInfo source) {
        if (source.Flag != null) {
            this.Flag = new Boolean(source.Flag);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.SoldOut != null) {
            this.SoldOut = new Boolean(source.SoldOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SoldOut", this.SoldOut);

    }
}

