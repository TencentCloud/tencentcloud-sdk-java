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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTDEMBusinessSystemRequest extends AbstractModel {

    /**
    * <p>业务系统 ID（必填）</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>业务系统名称（可选）</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>业务系统描述（可选）</p>
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
     * Get <p>业务系统 ID（必填）</p> 
     * @return InstanceId <p>业务系统 ID（必填）</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统 ID（必填）</p>
     * @param InstanceId <p>业务系统 ID（必填）</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>业务系统名称（可选）</p> 
     * @return InstanceName <p>业务系统名称（可选）</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>业务系统名称（可选）</p>
     * @param InstanceName <p>业务系统名称（可选）</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>业务系统描述（可选）</p> 
     * @return InstanceDesc <p>业务系统描述（可选）</p>
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set <p>业务系统描述（可选）</p>
     * @param InstanceDesc <p>业务系统描述（可选）</p>
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    public ModifyTDEMBusinessSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTDEMBusinessSystemRequest(ModifyTDEMBusinessSystemRequest source) {
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

