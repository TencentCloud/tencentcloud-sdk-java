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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManualBackupInstanceRequest extends AbstractModel {

    /**
    * 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 手动备份任务的备注信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 备份数据的保存天数。
- 单位：天；默认值为7天；取值范围：[0.1825]。如果超过 7天，请[提交工单](https://console.cloud.tencent.com/workorder/category)申请。
- 如果不配置该参数，默认与自动备份的保留时间一致。
- 如果未设置自动备份，默认为7天。
    */
    @SerializedName("StorageDays")
    @Expose
    private Long StorageDays;

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 手动备份任务的备注信息。 
     * @return Remark 手动备份任务的备注信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 手动备份任务的备注信息。
     * @param Remark 手动备份任务的备注信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 备份数据的保存天数。
- 单位：天；默认值为7天；取值范围：[0.1825]。如果超过 7天，请[提交工单](https://console.cloud.tencent.com/workorder/category)申请。
- 如果不配置该参数，默认与自动备份的保留时间一致。
- 如果未设置自动备份，默认为7天。 
     * @return StorageDays 备份数据的保存天数。
- 单位：天；默认值为7天；取值范围：[0.1825]。如果超过 7天，请[提交工单](https://console.cloud.tencent.com/workorder/category)申请。
- 如果不配置该参数，默认与自动备份的保留时间一致。
- 如果未设置自动备份，默认为7天。
     */
    public Long getStorageDays() {
        return this.StorageDays;
    }

    /**
     * Set 备份数据的保存天数。
- 单位：天；默认值为7天；取值范围：[0.1825]。如果超过 7天，请[提交工单](https://console.cloud.tencent.com/workorder/category)申请。
- 如果不配置该参数，默认与自动备份的保留时间一致。
- 如果未设置自动备份，默认为7天。
     * @param StorageDays 备份数据的保存天数。
- 单位：天；默认值为7天；取值范围：[0.1825]。如果超过 7天，请[提交工单](https://console.cloud.tencent.com/workorder/category)申请。
- 如果不配置该参数，默认与自动备份的保留时间一致。
- 如果未设置自动备份，默认为7天。
     */
    public void setStorageDays(Long StorageDays) {
        this.StorageDays = StorageDays;
    }

    public ManualBackupInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManualBackupInstanceRequest(ManualBackupInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.StorageDays != null) {
            this.StorageDays = new Long(source.StorageDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "StorageDays", this.StorageDays);

    }
}

