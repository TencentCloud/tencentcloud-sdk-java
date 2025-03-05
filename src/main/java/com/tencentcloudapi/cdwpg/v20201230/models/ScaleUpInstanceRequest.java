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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleUpInstanceRequest extends AbstractModel {

    /**
    * 集群唯一ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 变更资源类型
    */
    @SerializedName("Case")
    @Expose
    private String Case;

    /**
    * 修改的参数
    */
    @SerializedName("ModifySpec")
    @Expose
    private CNResourceSpec ModifySpec;

    /**
    * 集群名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 集群唯一ID 
     * @return InstanceId 集群唯一ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群唯一ID
     * @param InstanceId 集群唯一ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 变更资源类型 
     * @return Case 变更资源类型
     */
    public String getCase() {
        return this.Case;
    }

    /**
     * Set 变更资源类型
     * @param Case 变更资源类型
     */
    public void setCase(String Case) {
        this.Case = Case;
    }

    /**
     * Get 修改的参数 
     * @return ModifySpec 修改的参数
     */
    public CNResourceSpec getModifySpec() {
        return this.ModifySpec;
    }

    /**
     * Set 修改的参数
     * @param ModifySpec 修改的参数
     */
    public void setModifySpec(CNResourceSpec ModifySpec) {
        this.ModifySpec = ModifySpec;
    }

    /**
     * Get 集群名称 
     * @return InstanceName 集群名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 集群名称
     * @param InstanceName 集群名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public ScaleUpInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleUpInstanceRequest(ScaleUpInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Case != null) {
            this.Case = new String(source.Case);
        }
        if (source.ModifySpec != null) {
            this.ModifySpec = new CNResourceSpec(source.ModifySpec);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Case", this.Case);
        this.setParamObj(map, prefix + "ModifySpec.", this.ModifySpec);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

