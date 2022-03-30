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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManualBackupInstanceRequest extends AbstractModel{

    /**
    * 待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份的备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 保存天数。0代表指定默认保留时间
    */
    @SerializedName("StorageDays")
    @Expose
    private Long StorageDays;

    /**
     * Get 待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。 
     * @return InstanceId 待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。
     * @param InstanceId 待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份的备注信息 
     * @return Remark 备份的备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备份的备注信息
     * @param Remark 备份的备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 保存天数。0代表指定默认保留时间 
     * @return StorageDays 保存天数。0代表指定默认保留时间
     */
    public Long getStorageDays() {
        return this.StorageDays;
    }

    /**
     * Set 保存天数。0代表指定默认保留时间
     * @param StorageDays 保存天数。0代表指定默认保留时间
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

