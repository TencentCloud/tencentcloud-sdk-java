/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MainlandTravelPermitBackInfos extends AbstractModel {

    /**
    * String	证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 卡证背面的中文姓名	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 卡证背面的身份证号码	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IDNumber")
    @Expose
    private String IDNumber;

    /**
    * 历史通行证号码	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HistoryNumber")
    @Expose
    private String HistoryNumber;

    /**
     * Get String	证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type String	证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set String	证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type String	证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 卡证背面的中文姓名	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 卡证背面的中文姓名	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 卡证背面的中文姓名	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 卡证背面的中文姓名	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 卡证背面的身份证号码	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IDNumber 卡证背面的身份证号码	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIDNumber() {
        return this.IDNumber;
    }

    /**
     * Set 卡证背面的身份证号码	
注意：此字段可能返回 null，表示取不到有效值。
     * @param IDNumber 卡证背面的身份证号码	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    /**
     * Get 历史通行证号码	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HistoryNumber 历史通行证号码	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHistoryNumber() {
        return this.HistoryNumber;
    }

    /**
     * Set 历史通行证号码	
注意：此字段可能返回 null，表示取不到有效值。
     * @param HistoryNumber 历史通行证号码	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistoryNumber(String HistoryNumber) {
        this.HistoryNumber = HistoryNumber;
    }

    public MainlandTravelPermitBackInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MainlandTravelPermitBackInfos(MainlandTravelPermitBackInfos source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IDNumber != null) {
            this.IDNumber = new String(source.IDNumber);
        }
        if (source.HistoryNumber != null) {
            this.HistoryNumber = new String(source.HistoryNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IDNumber", this.IDNumber);
        this.setParamSimple(map, prefix + "HistoryNumber", this.HistoryNumber);

    }
}

