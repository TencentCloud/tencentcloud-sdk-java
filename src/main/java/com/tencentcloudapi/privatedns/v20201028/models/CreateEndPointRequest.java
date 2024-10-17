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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEndPointRequest extends AbstractModel {

    /**
    * 终端节点名称
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * 终端节点服务ID（vpc终端节点服务ID）
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 终端节点地域，必须要和终端节点服务所属地域一致
    */
    @SerializedName("EndPointRegion")
    @Expose
    private String EndPointRegion;

    /**
    * 终端节点ip数量
    */
    @SerializedName("IpNum")
    @Expose
    private Long IpNum;

    /**
     * Get 终端节点名称 
     * @return EndPointName 终端节点名称
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set 终端节点名称
     * @param EndPointName 终端节点名称
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get 终端节点服务ID（vpc终端节点服务ID） 
     * @return EndPointServiceId 终端节点服务ID（vpc终端节点服务ID）
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID（vpc终端节点服务ID）
     * @param EndPointServiceId 终端节点服务ID（vpc终端节点服务ID）
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 终端节点地域，必须要和终端节点服务所属地域一致 
     * @return EndPointRegion 终端节点地域，必须要和终端节点服务所属地域一致
     */
    public String getEndPointRegion() {
        return this.EndPointRegion;
    }

    /**
     * Set 终端节点地域，必须要和终端节点服务所属地域一致
     * @param EndPointRegion 终端节点地域，必须要和终端节点服务所属地域一致
     */
    public void setEndPointRegion(String EndPointRegion) {
        this.EndPointRegion = EndPointRegion;
    }

    /**
     * Get 终端节点ip数量 
     * @return IpNum 终端节点ip数量
     */
    public Long getIpNum() {
        return this.IpNum;
    }

    /**
     * Set 终端节点ip数量
     * @param IpNum 终端节点ip数量
     */
    public void setIpNum(Long IpNum) {
        this.IpNum = IpNum;
    }

    public CreateEndPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEndPointRequest(CreateEndPointRequest source) {
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointRegion != null) {
            this.EndPointRegion = new String(source.EndPointRegion);
        }
        if (source.IpNum != null) {
            this.IpNum = new Long(source.IpNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "EndPointRegion", this.EndPointRegion);
        this.setParamSimple(map, prefix + "IpNum", this.IpNum);

    }
}

