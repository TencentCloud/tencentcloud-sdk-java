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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterConfigsRequest extends AbstractModel{

    /**
    * 集群ID，例如cdwch-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置文件修改信息
    */
    @SerializedName("ModifyConfContext")
    @Expose
    private ConfigSubmitContext [] ModifyConfContext;

    /**
    * 修改原因
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 集群ID，例如cdwch-xxxx 
     * @return InstanceId 集群ID，例如cdwch-xxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID，例如cdwch-xxxx
     * @param InstanceId 集群ID，例如cdwch-xxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置文件修改信息 
     * @return ModifyConfContext 配置文件修改信息
     */
    public ConfigSubmitContext [] getModifyConfContext() {
        return this.ModifyConfContext;
    }

    /**
     * Set 配置文件修改信息
     * @param ModifyConfContext 配置文件修改信息
     */
    public void setModifyConfContext(ConfigSubmitContext [] ModifyConfContext) {
        this.ModifyConfContext = ModifyConfContext;
    }

    /**
     * Get 修改原因 
     * @return Remark 修改原因
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 修改原因
     * @param Remark 修改原因
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyClusterConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterConfigsRequest(ModifyClusterConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ModifyConfContext != null) {
            this.ModifyConfContext = new ConfigSubmitContext[source.ModifyConfContext.length];
            for (int i = 0; i < source.ModifyConfContext.length; i++) {
                this.ModifyConfContext[i] = new ConfigSubmitContext(source.ModifyConfContext[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ModifyConfContext.", this.ModifyConfContext);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

