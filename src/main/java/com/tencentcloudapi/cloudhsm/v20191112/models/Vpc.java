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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vpc extends AbstractModel {

    /**
    * Vpc名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 是否为默认VPC
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
     * Get Vpc名称 
     * @return VpcName Vpc名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set Vpc名称
     * @param VpcName Vpc名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VpcId 
     * @return VpcId VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcId
     * @param VpcId VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 是否为默认VPC 
     * @return IsDefault 是否为默认VPC
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认VPC
     * @param IsDefault 是否为默认VPC
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public Vpc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Vpc(Vpc source) {
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

