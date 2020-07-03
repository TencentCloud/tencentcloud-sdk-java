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
package com.tencentcloudapi.iottid.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadDeviceUniqueCodeResponse extends AbstractModel{

    /**
    * 本次已上传数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 重复的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExistedCodeSet")
    @Expose
    private String [] ExistedCodeSet;

    /**
    * 剩余可上传数量
    */
    @SerializedName("LeftQuantity")
    @Expose
    private Long LeftQuantity;

    /**
    * 错误的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IllegalCodeSet")
    @Expose
    private String [] IllegalCodeSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本次已上传数量 
     * @return Count 本次已上传数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 本次已上传数量
     * @param Count 本次已上传数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 重复的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExistedCodeSet 重复的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExistedCodeSet() {
        return this.ExistedCodeSet;
    }

    /**
     * Set 重复的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExistedCodeSet 重复的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExistedCodeSet(String [] ExistedCodeSet) {
        this.ExistedCodeSet = ExistedCodeSet;
    }

    /**
     * Get 剩余可上传数量 
     * @return LeftQuantity 剩余可上传数量
     */
    public Long getLeftQuantity() {
        return this.LeftQuantity;
    }

    /**
     * Set 剩余可上传数量
     * @param LeftQuantity 剩余可上传数量
     */
    public void setLeftQuantity(Long LeftQuantity) {
        this.LeftQuantity = LeftQuantity;
    }

    /**
     * Get 错误的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IllegalCodeSet 错误的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIllegalCodeSet() {
        return this.IllegalCodeSet;
    }

    /**
     * Set 错误的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IllegalCodeSet 错误的硬件唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIllegalCodeSet(String [] IllegalCodeSet) {
        this.IllegalCodeSet = IllegalCodeSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "ExistedCodeSet.", this.ExistedCodeSet);
        this.setParamSimple(map, prefix + "LeftQuantity", this.LeftQuantity);
        this.setParamArraySimple(map, prefix + "IllegalCodeSet.", this.IllegalCodeSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

