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

public class TWeCallInfo extends AbstractModel {

    /**
    * Sn信息，SN格式：产品ID_设备名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * 小程序ID，参数已弃用，不用传参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 激活数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveNum")
    @Expose
    private Long ActiveNum;

    /**
     * Get Sn信息，SN格式：产品ID_设备名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sn Sn信息，SN格式：产品ID_设备名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set Sn信息，SN格式：产品ID_设备名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sn Sn信息，SN格式：产品ID_设备名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get 小程序ID，参数已弃用，不用传参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId 小程序ID，参数已弃用，不用传参
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 小程序ID，参数已弃用，不用传参
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId 小程序ID，参数已弃用，不用传参
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 激活数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveNum 激活数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getActiveNum() {
        return this.ActiveNum;
    }

    /**
     * Set 激活数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveNum 激活数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setActiveNum(Long ActiveNum) {
        this.ActiveNum = ActiveNum;
    }

    public TWeCallInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TWeCallInfo(TWeCallInfo source) {
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ActiveNum != null) {
            this.ActiveNum = new Long(source.ActiveNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sn", this.Sn);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ActiveNum", this.ActiveNum);

    }
}

