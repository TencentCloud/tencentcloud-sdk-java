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

public class ModifyDBParametersRequest extends AbstractModel {

    /**
    * Instance 名字
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * node参数
    */
    @SerializedName("NodeConfigParams")
    @Expose
    private NodeConfigParams [] NodeConfigParams;

    /**
     * Get Instance 名字 
     * @return InstanceId Instance 名字
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance 名字
     * @param InstanceId Instance 名字
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get node参数 
     * @return NodeConfigParams node参数
     */
    public NodeConfigParams [] getNodeConfigParams() {
        return this.NodeConfigParams;
    }

    /**
     * Set node参数
     * @param NodeConfigParams node参数
     */
    public void setNodeConfigParams(NodeConfigParams [] NodeConfigParams) {
        this.NodeConfigParams = NodeConfigParams;
    }

    public ModifyDBParametersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBParametersRequest(ModifyDBParametersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeConfigParams != null) {
            this.NodeConfigParams = new NodeConfigParams[source.NodeConfigParams.length];
            for (int i = 0; i < source.NodeConfigParams.length; i++) {
                this.NodeConfigParams[i] = new NodeConfigParams(source.NodeConfigParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "NodeConfigParams.", this.NodeConfigParams);

    }
}

