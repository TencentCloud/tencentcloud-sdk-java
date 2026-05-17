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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosInvokeIpVpcInfo extends AbstractModel {

    /**
    * vpc所属uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * vpc所属appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * vpcid信息
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
     * Get vpc所属uin 
     * @return Uin vpc所属uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set vpc所属uin
     * @param Uin vpc所属uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get vpc所属appid 
     * @return AppId vpc所属appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set vpc所属appid
     * @param AppId vpc所属appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 昵称 
     * @return NickName 昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
     * @param NickName 昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get vpcid信息 
     * @return VpcId vpcid信息
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcid信息
     * @param VpcId vpcid信息
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc名称 
     * @return VpcName vpc名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc名称
     * @param VpcName vpc名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    public CosInvokeIpVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosInvokeIpVpcInfo(CosInvokeIpVpcInfo source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);

    }
}

