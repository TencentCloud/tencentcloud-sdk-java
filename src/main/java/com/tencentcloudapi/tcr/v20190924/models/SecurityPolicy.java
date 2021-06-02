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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicy extends AbstractModel{

    /**
    * 策略索引
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Long PolicyIndex;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 运行访问的公网IP地址端
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 安全策略的版本
    */
    @SerializedName("PolicyVersion")
    @Expose
    private String PolicyVersion;

    /**
     * Get 策略索引 
     * @return PolicyIndex 策略索引
     */
    public Long getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * Set 策略索引
     * @param PolicyIndex 策略索引
     */
    public void setPolicyIndex(Long PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 运行访问的公网IP地址端 
     * @return CidrBlock 运行访问的公网IP地址端
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 运行访问的公网IP地址端
     * @param CidrBlock 运行访问的公网IP地址端
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 安全策略的版本 
     * @return PolicyVersion 安全策略的版本
     */
    public String getPolicyVersion() {
        return this.PolicyVersion;
    }

    /**
     * Set 安全策略的版本
     * @param PolicyVersion 安全策略的版本
     */
    public void setPolicyVersion(String PolicyVersion) {
        this.PolicyVersion = PolicyVersion;
    }

    public SecurityPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicy(SecurityPolicy source) {
        if (source.PolicyIndex != null) {
            this.PolicyIndex = new Long(source.PolicyIndex);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.PolicyVersion != null) {
            this.PolicyVersion = new String(source.PolicyVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyIndex", this.PolicyIndex);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "PolicyVersion", this.PolicyVersion);

    }
}

