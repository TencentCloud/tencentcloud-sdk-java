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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceModelData extends AbstractModel {

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 物模型分支路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * 物模型数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IotModel")
    @Expose
    private String IotModel;

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 物模型分支路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branch 物模型分支路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 物模型分支路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branch 物模型分支路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get 物模型数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IotModel 物模型数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIotModel() {
        return this.IotModel;
    }

    /**
     * Set 物模型数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param IotModel 物模型数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIotModel(String IotModel) {
        this.IotModel = IotModel;
    }

    public DeviceModelData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceModelData(DeviceModelData source) {
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
        if (source.IotModel != null) {
            this.IotModel = new String(source.IotModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "IotModel", this.IotModel);

    }
}

