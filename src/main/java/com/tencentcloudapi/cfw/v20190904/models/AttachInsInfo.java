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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachInsInfo extends AbstractModel {

    /**
    * 实例对象可以是cvm类型:ins-ad21xuds1形式;路由表类型:rtb-da12daxd形式;vpc类型:vpc-1dxdad2d形式
    */
    @SerializedName("InsId")
    @Expose
    private String InsId;

    /**
    * 实例对象名称
    */
    @SerializedName("InsName")
    @Expose
    private String InsName;

    /**
    * 实例的cidr
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
     * Get 实例对象可以是cvm类型:ins-ad21xuds1形式;路由表类型:rtb-da12daxd形式;vpc类型:vpc-1dxdad2d形式 
     * @return InsId 实例对象可以是cvm类型:ins-ad21xuds1形式;路由表类型:rtb-da12daxd形式;vpc类型:vpc-1dxdad2d形式
     */
    public String getInsId() {
        return this.InsId;
    }

    /**
     * Set 实例对象可以是cvm类型:ins-ad21xuds1形式;路由表类型:rtb-da12daxd形式;vpc类型:vpc-1dxdad2d形式
     * @param InsId 实例对象可以是cvm类型:ins-ad21xuds1形式;路由表类型:rtb-da12daxd形式;vpc类型:vpc-1dxdad2d形式
     */
    public void setInsId(String InsId) {
        this.InsId = InsId;
    }

    /**
     * Get 实例对象名称 
     * @return InsName 实例对象名称
     */
    public String getInsName() {
        return this.InsName;
    }

    /**
     * Set 实例对象名称
     * @param InsName 实例对象名称
     */
    public void setInsName(String InsName) {
        this.InsName = InsName;
    }

    /**
     * Get 实例的cidr 
     * @return Cidr 实例的cidr
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set 实例的cidr
     * @param Cidr 实例的cidr
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    public AttachInsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachInsInfo(AttachInsInfo source) {
        if (source.InsId != null) {
            this.InsId = new String(source.InsId);
        }
        if (source.InsName != null) {
            this.InsName = new String(source.InsName);
        }
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InsId", this.InsId);
        this.setParamSimple(map, prefix + "InsName", this.InsName);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);

    }
}

