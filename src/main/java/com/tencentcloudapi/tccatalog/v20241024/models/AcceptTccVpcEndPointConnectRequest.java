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
package com.tencentcloudapi.tccatalog.v20241024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AcceptTccVpcEndPointConnectRequest extends AbstractModel {

    /**
    * 终端节点服务Id
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 终端节点id
    */
    @SerializedName("EndPointId")
    @Expose
    private String [] EndPointId;

    /**
    * 是否接受连接
    */
    @SerializedName("AcceptFlag")
    @Expose
    private Boolean AcceptFlag;

    /**
     * Get 终端节点服务Id 
     * @return EndPointServiceId 终端节点服务Id
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务Id
     * @param EndPointServiceId 终端节点服务Id
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 终端节点id 
     * @return EndPointId 终端节点id
     */
    public String [] getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点id
     * @param EndPointId 终端节点id
     */
    public void setEndPointId(String [] EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get 是否接受连接 
     * @return AcceptFlag 是否接受连接
     */
    public Boolean getAcceptFlag() {
        return this.AcceptFlag;
    }

    /**
     * Set 是否接受连接
     * @param AcceptFlag 是否接受连接
     */
    public void setAcceptFlag(Boolean AcceptFlag) {
        this.AcceptFlag = AcceptFlag;
    }

    public AcceptTccVpcEndPointConnectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcceptTccVpcEndPointConnectRequest(AcceptTccVpcEndPointConnectRequest source) {
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

