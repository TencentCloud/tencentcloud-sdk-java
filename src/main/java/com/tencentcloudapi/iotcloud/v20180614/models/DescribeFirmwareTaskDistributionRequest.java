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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirmwareTaskDistributionRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 固件版本号
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
    * 固件升级任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 固件版本号 
     * @return FirmwareVersion 固件版本号
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set 固件版本号
     * @param FirmwareVersion 固件版本号
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Get 固件升级任务ID 
     * @return TaskId 固件升级任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 固件升级任务ID
     * @param TaskId 固件升级任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeFirmwareTaskDistributionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirmwareTaskDistributionRequest(DescribeFirmwareTaskDistributionRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.FirmwareVersion != null) {
            this.FirmwareVersion = new String(source.FirmwareVersion);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "FirmwareVersion", this.FirmwareVersion);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

