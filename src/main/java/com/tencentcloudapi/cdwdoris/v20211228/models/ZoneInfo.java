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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * 可用区名称，例如"ap-guangzhou-1"
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 可用区描述信息，例如“广州一区”
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 可用区唯一标记
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Encryptid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encrypt")
    @Expose
    private Long Encrypt;

    /**
     * Get 可用区名称，例如"ap-guangzhou-1" 
     * @return Name 可用区名称，例如"ap-guangzhou-1"
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 可用区名称，例如"ap-guangzhou-1"
     * @param Name 可用区名称，例如"ap-guangzhou-1"
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 可用区描述信息，例如“广州一区” 
     * @return Desc 可用区描述信息，例如“广州一区”
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 可用区描述信息，例如“广州一区”
     * @param Desc 可用区描述信息，例如“广州一区”
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 可用区唯一标记 
     * @return ZoneId 可用区唯一标记
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区唯一标记
     * @param ZoneId 可用区唯一标记
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Encryptid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encrypt Encryptid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Encryptid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encrypt Encryptid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncrypt(Long Encrypt) {
        this.Encrypt = Encrypt;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Long(source.Encrypt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);

    }
}

