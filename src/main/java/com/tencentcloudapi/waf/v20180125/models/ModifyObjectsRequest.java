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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyObjectsRequest extends AbstractModel {

    /**
    * 修改对象标识
    */
    @SerializedName("ObjectId")
    @Expose
    private String [] ObjectId;

    /**
    * 改动作类型:InstanceId绑定实例；UnbindInstance解绑实例。
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * 新的实例ID，如果和已绑定的实例相同认为修改成功
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 对象列表，仅跨账号接入使用
    */
    @SerializedName("Objects")
    @Expose
    private Object [] Objects;

    /**
     * Get 修改对象标识 
     * @return ObjectId 修改对象标识
     */
    public String [] getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 修改对象标识
     * @param ObjectId 修改对象标识
     */
    public void setObjectId(String [] ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 改动作类型:InstanceId绑定实例；UnbindInstance解绑实例。 
     * @return OpType 改动作类型:InstanceId绑定实例；UnbindInstance解绑实例。
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set 改动作类型:InstanceId绑定实例；UnbindInstance解绑实例。
     * @param OpType 改动作类型:InstanceId绑定实例；UnbindInstance解绑实例。
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
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

    /**
     * Get 对象列表，仅跨账号接入使用 
     * @return Objects 对象列表，仅跨账号接入使用
     */
    public Object [] getObjects() {
        return this.Objects;
    }

    /**
     * Set 对象列表，仅跨账号接入使用
     * @param Objects 对象列表，仅跨账号接入使用
     */
    public void setObjects(Object [] Objects) {
        this.Objects = Objects;
    }

    public ModifyObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyObjectsRequest(ModifyObjectsRequest source) {
        if (source.ObjectId != null) {
            this.ObjectId = new String[source.ObjectId.length];
            for (int i = 0; i < source.ObjectId.length; i++) {
                this.ObjectId[i] = new String(source.ObjectId[i]);
            }
        }
        if (source.OpType != null) {
            this.OpType = new String(source.OpType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Objects != null) {
            this.Objects = new Object[source.Objects.length];
            for (int i = 0; i < source.Objects.length; i++) {
                this.Objects[i] = new Object(source.Objects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ObjectId.", this.ObjectId);
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Objects.", this.Objects);

    }
}

