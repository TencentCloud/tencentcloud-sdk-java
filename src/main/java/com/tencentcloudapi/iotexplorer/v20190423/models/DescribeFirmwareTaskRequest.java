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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirmwareTaskRequest extends AbstractModel {

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * <p>固件版本号</p>
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
    * <p>固件任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get <p>产品ID</p> 
     * @return ProductID <p>产品ID</p>
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set <p>产品ID</p>
     * @param ProductID <p>产品ID</p>
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get <p>固件版本号</p> 
     * @return FirmwareVersion <p>固件版本号</p>
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set <p>固件版本号</p>
     * @param FirmwareVersion <p>固件版本号</p>
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Get <p>固件任务ID</p> 
     * @return TaskId <p>固件任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>固件任务ID</p>
     * @param TaskId <p>固件任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeFirmwareTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirmwareTaskRequest(DescribeFirmwareTaskRequest source) {
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

