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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyObjectRequest extends AbstractModel{

    /**
    * 修改对象标识
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 改动作类型:Status修改开关，InstanceId绑定实例
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * 新的Waf开关状态，如果和已有状态相同认为修改成功
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 新的实例ID，如果和已绑定的实例相同认为修改成功
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 修改对象标识 
     * @return ObjectId 修改对象标识
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 修改对象标识
     * @param ObjectId 修改对象标识
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 改动作类型:Status修改开关，InstanceId绑定实例 
     * @return OpType 改动作类型:Status修改开关，InstanceId绑定实例
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set 改动作类型:Status修改开关，InstanceId绑定实例
     * @param OpType 改动作类型:Status修改开关，InstanceId绑定实例
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get 新的Waf开关状态，如果和已有状态相同认为修改成功 
     * @return Status 新的Waf开关状态，如果和已有状态相同认为修改成功
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 新的Waf开关状态，如果和已有状态相同认为修改成功
     * @param Status 新的Waf开关状态，如果和已有状态相同认为修改成功
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 新的实例ID，如果和已绑定的实例相同认为修改成功 
     * @return InstanceId 新的实例ID，如果和已绑定的实例相同认为修改成功
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 新的实例ID，如果和已绑定的实例相同认为修改成功
     * @param InstanceId 新的实例ID，如果和已绑定的实例相同认为修改成功
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ModifyObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyObjectRequest(ModifyObjectRequest source) {
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.OpType != null) {
            this.OpType = new String(source.OpType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

