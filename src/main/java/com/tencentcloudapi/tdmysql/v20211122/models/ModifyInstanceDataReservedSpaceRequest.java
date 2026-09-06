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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceDataReservedSpaceRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>拟修改的目标保留空间大小</p><p>单位：GB</p>
    */
    @SerializedName("ReservedSpaceGB")
    @Expose
    private Float ReservedSpaceGB;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>拟修改的目标保留空间大小</p><p>单位：GB</p> 
     * @return ReservedSpaceGB <p>拟修改的目标保留空间大小</p><p>单位：GB</p>
     */
    public Float getReservedSpaceGB() {
        return this.ReservedSpaceGB;
    }

    /**
     * Set <p>拟修改的目标保留空间大小</p><p>单位：GB</p>
     * @param ReservedSpaceGB <p>拟修改的目标保留空间大小</p><p>单位：GB</p>
     */
    public void setReservedSpaceGB(Float ReservedSpaceGB) {
        this.ReservedSpaceGB = ReservedSpaceGB;
    }

    public ModifyInstanceDataReservedSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceDataReservedSpaceRequest(ModifyInstanceDataReservedSpaceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReservedSpaceGB != null) {
            this.ReservedSpaceGB = new Float(source.ReservedSpaceGB);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReservedSpaceGB", this.ReservedSpaceGB);

    }
}

