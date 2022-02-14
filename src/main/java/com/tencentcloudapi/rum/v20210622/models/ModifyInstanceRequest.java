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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceRequest extends AbstractModel{

    /**
    * 要修改的实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 新的实例名称(长度最大不超过255)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 新的实例描述(长度最大不超过1024)
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
     * Get 要修改的实例id 
     * @return InstanceId 要修改的实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 要修改的实例id
     * @param InstanceId 要修改的实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 新的实例名称(长度最大不超过255) 
     * @return InstanceName 新的实例名称(长度最大不超过255)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 新的实例名称(长度最大不超过255)
     * @param InstanceName 新的实例名称(长度最大不超过255)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 新的实例描述(长度最大不超过1024) 
     * @return InstanceDesc 新的实例描述(长度最大不超过1024)
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set 新的实例描述(长度最大不超过1024)
     * @param InstanceDesc 新的实例描述(长度最大不超过1024)
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceDesc != null) {
            this.InstanceDesc = new String(source.InstanceDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);

    }
}

