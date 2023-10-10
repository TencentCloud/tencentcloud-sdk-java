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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDirectConnectInstallCommandRequest extends AbstractModel{

    /**
    * 地域标示
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * Vpc的ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 命令过期时间
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
     * Get 地域标示 
     * @return RegionCode 地域标示
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地域标示
     * @param RegionCode 地域标示
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get Vpc的ID 
     * @return VpcId Vpc的ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc的ID
     * @param VpcId Vpc的ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 命令过期时间 
     * @return ExpireDate 命令过期时间
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set 命令过期时间
     * @param ExpireDate 命令过期时间
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    public DescribeDirectConnectInstallCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDirectConnectInstallCommandRequest(DescribeDirectConnectInstallCommandRequest source) {
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);

    }
}

