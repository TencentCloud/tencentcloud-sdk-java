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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReverseShellEventDescription extends AbstractModel{

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 解决方案
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 事件备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 目标地址
    */
    @SerializedName("DstAddress")
    @Expose
    private String DstAddress;

    /**
    * 事件最后一次处理的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
     * Get 描述信息 
     * @return Description 描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
     * @param Description 描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 解决方案 
     * @return Solution 解决方案
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 解决方案
     * @param Solution 解决方案
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get 事件备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 事件备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 事件备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 事件备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 目标地址 
     * @return DstAddress 目标地址
     */
    public String getDstAddress() {
        return this.DstAddress;
    }

    /**
     * Set 目标地址
     * @param DstAddress 目标地址
     */
    public void setDstAddress(String DstAddress) {
        this.DstAddress = DstAddress;
    }

    /**
     * Get 事件最后一次处理的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationTime 事件最后一次处理的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set 事件最后一次处理的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationTime 事件最后一次处理的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    public ReverseShellEventDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReverseShellEventDescription(ReverseShellEventDescription source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DstAddress != null) {
            this.DstAddress = new String(source.DstAddress);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DstAddress", this.DstAddress);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);

    }
}

