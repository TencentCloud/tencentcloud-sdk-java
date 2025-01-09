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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TWeCallLicenseInfo extends AbstractModel {

    /**
    * voip类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TWeCallType")
    @Expose
    private String TWeCallType;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 已使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
     * Get voip类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TWeCallType voip类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTWeCallType() {
        return this.TWeCallType;
    }

    /**
     * Set voip类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TWeCallType voip类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTWeCallType(String TWeCallType) {
        this.TWeCallType = TWeCallType;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNum 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNum 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 已使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedNum 已使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set 已使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedNum 已使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    public TWeCallLicenseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TWeCallLicenseInfo(TWeCallLicenseInfo source) {
        if (source.TWeCallType != null) {
            this.TWeCallType = new String(source.TWeCallType);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TWeCallType", this.TWeCallType);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);

    }
}

