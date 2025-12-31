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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchError extends AbstractModel {

    /**
    * 开关唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrIns")
    @Expose
    private String ErrIns;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 错误类型区分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrKey")
    @Expose
    private String ErrKey;

    /**
    * 错误时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
     * Get 开关唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrIns 开关唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrIns() {
        return this.ErrIns;
    }

    /**
     * Set 开关唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrIns 开关唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrIns(String ErrIns) {
        this.ErrIns = ErrIns;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 错误类型区分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrKey 错误类型区分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrKey() {
        return this.ErrKey;
    }

    /**
     * Set 错误类型区分
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrKey 错误类型区分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrKey(String ErrKey) {
        this.ErrKey = ErrKey;
    }

    /**
     * Get 错误时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 错误时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 错误时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 错误时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    public SwitchError() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchError(SwitchError source) {
        if (source.ErrIns != null) {
            this.ErrIns = new String(source.ErrIns);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.ErrKey != null) {
            this.ErrKey = new String(source.ErrKey);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrIns", this.ErrIns);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "ErrKey", this.ErrKey);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

