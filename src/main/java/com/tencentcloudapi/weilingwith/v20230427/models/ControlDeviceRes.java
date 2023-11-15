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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlDeviceRes extends AbstractModel {

    /**
    * 设备Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 指令接受, 0表示成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 控制结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 批量大于1时，可用此seq进行链路追踪
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seq")
    @Expose
    private String Seq;

    /**
     * Get 设备Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WID 设备Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WID 设备Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 指令接受, 0表示成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 指令接受, 0表示成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 指令接受, 0表示成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 指令接受, 0表示成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 控制结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 控制结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 控制结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 控制结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 批量大于1时，可用此seq进行链路追踪
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seq 批量大于1时，可用此seq进行链路追踪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeq() {
        return this.Seq;
    }

    /**
     * Set 批量大于1时，可用此seq进行链路追踪
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seq 批量大于1时，可用此seq进行链路追踪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeq(String Seq) {
        this.Seq = Seq;
    }

    public ControlDeviceRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDeviceRes(ControlDeviceRes source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Seq != null) {
            this.Seq = new String(source.Seq);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Seq", this.Seq);

    }
}

