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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModelEvaluationWorkOrderRequest extends AbstractModel {

    /**
    * 设备名称及型号
    */
    @SerializedName("ModelSet")
    @Expose
    private ModelVersion [] ModelSet;

    /**
    * 园区ID
    */
    @SerializedName("CampusId")
    @Expose
    private Long CampusId;

    /**
    * 只支持传入 server 和 netDevice
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 设备名称及型号 
     * @return ModelSet 设备名称及型号
     */
    public ModelVersion [] getModelSet() {
        return this.ModelSet;
    }

    /**
     * Set 设备名称及型号
     * @param ModelSet 设备名称及型号
     */
    public void setModelSet(ModelVersion [] ModelSet) {
        this.ModelSet = ModelSet;
    }

    /**
     * Get 园区ID 
     * @return CampusId 园区ID
     */
    public Long getCampusId() {
        return this.CampusId;
    }

    /**
     * Set 园区ID
     * @param CampusId 园区ID
     */
    public void setCampusId(Long CampusId) {
        this.CampusId = CampusId;
    }

    /**
     * Get 只支持传入 server 和 netDevice 
     * @return DeviceType 只支持传入 server 和 netDevice
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 只支持传入 server 和 netDevice
     * @param DeviceType 只支持传入 server 和 netDevice
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateModelEvaluationWorkOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelEvaluationWorkOrderRequest(CreateModelEvaluationWorkOrderRequest source) {
        if (source.ModelSet != null) {
            this.ModelSet = new ModelVersion[source.ModelSet.length];
            for (int i = 0; i < source.ModelSet.length; i++) {
                this.ModelSet[i] = new ModelVersion(source.ModelSet[i]);
            }
        }
        if (source.CampusId != null) {
            this.CampusId = new Long(source.CampusId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ModelSet.", this.ModelSet);
        this.setParamSimple(map, prefix + "CampusId", this.CampusId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

