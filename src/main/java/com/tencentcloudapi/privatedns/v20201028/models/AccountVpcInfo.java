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

public class AccountVpcInfo extends AbstractModel {

    /**
    * VpcId
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Vpc所属地区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Vpc所属账号
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * vpc资源名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
     * Get VpcId 
     * @return UniqVpcId VpcId
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VpcId
     * @param UniqVpcId VpcId
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Vpc所属地区 
     * @return Region Vpc所属地区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Vpc所属地区
     * @param Region Vpc所属地区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Vpc所属账号 
     * @return Uin Vpc所属账号
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Vpc所属账号
     * @param Uin Vpc所属账号
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get vpc资源名称 
     * @return VpcName vpc资源名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc资源名称
     * @param VpcName vpc资源名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    public AccountVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountVpcInfo(AccountVpcInfo source) {
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);

    }
}

