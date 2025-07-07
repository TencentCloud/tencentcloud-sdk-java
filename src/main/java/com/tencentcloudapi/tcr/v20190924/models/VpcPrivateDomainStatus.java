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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcPrivateDomainStatus extends AbstractModel {

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * unique vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ENABLE代表已经开启，DISABLE代表未开启，ERROR代表查询出错
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get unique vpc id 
     * @return VpcId unique vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set unique vpc id
     * @param VpcId unique vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ENABLE代表已经开启，DISABLE代表未开启，ERROR代表查询出错 
     * @return Status ENABLE代表已经开启，DISABLE代表未开启，ERROR代表查询出错
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set ENABLE代表已经开启，DISABLE代表未开启，ERROR代表查询出错
     * @param Status ENABLE代表已经开启，DISABLE代表未开启，ERROR代表查询出错
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public VpcPrivateDomainStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcPrivateDomainStatus(VpcPrivateDomainStatus source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

