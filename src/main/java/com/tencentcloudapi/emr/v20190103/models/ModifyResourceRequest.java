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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 计费类型
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 变配CPU
    */
    @SerializedName("NewCpu")
    @Expose
    private Long NewCpu;

    /**
    * 变配内存
    */
    @SerializedName("NewMem")
    @Expose
    private Long NewMem;

    /**
    * Token
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 变配机器规格
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 节点ID列表
    */
    @SerializedName("ResourceIdList")
    @Expose
    private String [] ResourceIdList;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 计费类型 
     * @return PayMode 计费类型
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费类型
     * @param PayMode 计费类型
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 变配CPU 
     * @return NewCpu 变配CPU
     */
    public Long getNewCpu() {
        return this.NewCpu;
    }

    /**
     * Set 变配CPU
     * @param NewCpu 变配CPU
     */
    public void setNewCpu(Long NewCpu) {
        this.NewCpu = NewCpu;
    }

    /**
     * Get 变配内存 
     * @return NewMem 变配内存
     */
    public Long getNewMem() {
        return this.NewMem;
    }

    /**
     * Set 变配内存
     * @param NewMem 变配内存
     */
    public void setNewMem(Long NewMem) {
        this.NewMem = NewMem;
    }

    /**
     * Get Token 
     * @return ClientToken Token
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Token
     * @param ClientToken Token
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 变配机器规格 
     * @return InstanceType 变配机器规格
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 变配机器规格
     * @param InstanceType 变配机器规格
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 节点ID列表 
     * @return ResourceIdList 节点ID列表
     */
    public String [] getResourceIdList() {
        return this.ResourceIdList;
    }

    /**
     * Set 节点ID列表
     * @param ResourceIdList 节点ID列表
     */
    public void setResourceIdList(String [] ResourceIdList) {
        this.ResourceIdList = ResourceIdList;
    }

    public ModifyResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceRequest(ModifyResourceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.NewCpu != null) {
            this.NewCpu = new Long(source.NewCpu);
        }
        if (source.NewMem != null) {
            this.NewMem = new Long(source.NewMem);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ResourceIdList != null) {
            this.ResourceIdList = new String[source.ResourceIdList.length];
            for (int i = 0; i < source.ResourceIdList.length; i++) {
                this.ResourceIdList[i] = new String(source.ResourceIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "NewCpu", this.NewCpu);
        this.setParamSimple(map, prefix + "NewMem", this.NewMem);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "ResourceIdList.", this.ResourceIdList);

    }
}

