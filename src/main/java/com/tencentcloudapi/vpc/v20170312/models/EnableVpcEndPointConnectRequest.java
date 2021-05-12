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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableVpcEndPointConnectRequest extends AbstractModel{

    /**
    * 终端节点服务ID。
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 终端节点ID。
    */
    @SerializedName("EndPointId")
    @Expose
    private String [] EndPointId;

    /**
    * 是否接受终端节点连接请求。
    */
    @SerializedName("AcceptFlag")
    @Expose
    private Boolean AcceptFlag;

    /**
     * Get 终端节点服务ID。 
     * @return EndPointServiceId 终端节点服务ID。
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID。
     * @param EndPointServiceId 终端节点服务ID。
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 终端节点ID。 
     * @return EndPointId 终端节点ID。
     */
    public String [] getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点ID。
     * @param EndPointId 终端节点ID。
     */
    public void setEndPointId(String [] EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get 是否接受终端节点连接请求。 
     * @return AcceptFlag 是否接受终端节点连接请求。
     */
    public Boolean getAcceptFlag() {
        return this.AcceptFlag;
    }

    /**
     * Set 是否接受终端节点连接请求。
     * @param AcceptFlag 是否接受终端节点连接请求。
     */
    public void setAcceptFlag(Boolean AcceptFlag) {
        this.AcceptFlag = AcceptFlag;
    }

    public EnableVpcEndPointConnectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableVpcEndPointConnectRequest(EnableVpcEndPointConnectRequest source) {
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String[source.EndPointId.length];
            for (int i = 0; i < source.EndPointId.length; i++) {
                this.EndPointId[i] = new String(source.EndPointId[i]);
            }
        }
        if (source.AcceptFlag != null) {
            this.AcceptFlag = new Boolean(source.AcceptFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamArraySimple(map, prefix + "EndPointId.", this.EndPointId);
        this.setParamSimple(map, prefix + "AcceptFlag", this.AcceptFlag);

    }
}

