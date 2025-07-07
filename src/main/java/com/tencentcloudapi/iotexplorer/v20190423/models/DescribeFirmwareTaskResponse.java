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

public class DescribeFirmwareTaskResponse extends AbstractModel {

    /**
    * 固件任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 固件任务状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 固件任务创建时间，单位：秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 固件任务升级类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级）
    */
    @SerializedName("UpgradeMode")
    @Expose
    private String UpgradeMode;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回
    */
    @SerializedName("OriginalVersion")
    @Expose
    private String OriginalVersion;

    /**
    * 创建账号ID
    */
    @SerializedName("CreateUserId")
    @Expose
    private Long CreateUserId;

    /**
    * 创建账号ID昵称
    */
    @SerializedName("CreatorNickName")
    @Expose
    private String CreatorNickName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 固件任务ID 
     * @return TaskId 固件任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 固件任务ID
     * @param TaskId 固件任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 固件任务状态 
     * @return Status 固件任务状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 固件任务状态
     * @param Status 固件任务状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 固件任务创建时间，单位：秒 
     * @return CreateTime 固件任务创建时间，单位：秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 固件任务创建时间，单位：秒
     * @param CreateTime 固件任务创建时间，单位：秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 固件任务升级类型 
     * @return Type 固件任务升级类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 固件任务升级类型
     * @param Type 固件任务升级类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级） 
     * @return UpgradeMode 固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级）
     */
    public String getUpgradeMode() {
        return this.UpgradeMode;
    }

    /**
     * Set 固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级）
     * @param UpgradeMode 固件任务升级模式。originalVersion（按版本号升级）、filename（提交文件升级）、devicenames（按设备名称升级）
     */
    public void setUpgradeMode(String UpgradeMode) {
        this.UpgradeMode = UpgradeMode;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回 
     * @return OriginalVersion 原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回
     */
    public String getOriginalVersion() {
        return this.OriginalVersion;
    }

    /**
     * Set 原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回
     * @param OriginalVersion 原始固件版本号，在UpgradeMode是originalVersion升级模式下会返回
     */
    public void setOriginalVersion(String OriginalVersion) {
        this.OriginalVersion = OriginalVersion;
    }

    /**
     * Get 创建账号ID 
     * @return CreateUserId 创建账号ID
     */
    public Long getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set 创建账号ID
     * @param CreateUserId 创建账号ID
     */
    public void setCreateUserId(Long CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get 创建账号ID昵称 
     * @return CreatorNickName 创建账号ID昵称
     */
    public String getCreatorNickName() {
        return this.CreatorNickName;
    }

    /**
     * Set 创建账号ID昵称
     * @param CreatorNickName 创建账号ID昵称
     */
    public void setCreatorNickName(String CreatorNickName) {
        this.CreatorNickName = CreatorNickName;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFirmwareTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirmwareTaskResponse(DescribeFirmwareTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.UpgradeMode != null) {
            this.UpgradeMode = new String(source.UpgradeMode);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.OriginalVersion != null) {
            this.OriginalVersion = new String(source.OriginalVersion);
        }
        if (source.CreateUserId != null) {
            this.CreateUserId = new Long(source.CreateUserId);
        }
        if (source.CreatorNickName != null) {
            this.CreatorNickName = new String(source.CreatorNickName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "UpgradeMode", this.UpgradeMode);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "OriginalVersion", this.OriginalVersion);
        this.setParamSimple(map, prefix + "CreateUserId", this.CreateUserId);
        this.setParamSimple(map, prefix + "CreatorNickName", this.CreatorNickName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

