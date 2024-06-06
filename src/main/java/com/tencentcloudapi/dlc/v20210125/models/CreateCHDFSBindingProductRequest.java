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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCHDFSBindingProductRequest extends AbstractModel {

    /**
    * 需要绑定的元数据加速桶名
    */
    @SerializedName("MountPoint")
    @Expose
    private String MountPoint;

    /**
    * 桶的类型，分为cos和lakefs
    */
    @SerializedName("BucketType")
    @Expose
    private String BucketType;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 引擎名称，ProductName选择DLC产品时，必传此参数。其他产品可不传
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * vpc信息，产品名称为other时必传此参数
    */
    @SerializedName("VpcInfo")
    @Expose
    private VpcInfo [] VpcInfo;

    /**
     * Get 需要绑定的元数据加速桶名 
     * @return MountPoint 需要绑定的元数据加速桶名
     */
    public String getMountPoint() {
        return this.MountPoint;
    }

    /**
     * Set 需要绑定的元数据加速桶名
     * @param MountPoint 需要绑定的元数据加速桶名
     */
    public void setMountPoint(String MountPoint) {
        this.MountPoint = MountPoint;
    }

    /**
     * Get 桶的类型，分为cos和lakefs 
     * @return BucketType 桶的类型，分为cos和lakefs
     */
    public String getBucketType() {
        return this.BucketType;
    }

    /**
     * Set 桶的类型，分为cos和lakefs
     * @param BucketType 桶的类型，分为cos和lakefs
     */
    public void setBucketType(String BucketType) {
        this.BucketType = BucketType;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 引擎名称，ProductName选择DLC产品时，必传此参数。其他产品可不传 
     * @return EngineName 引擎名称，ProductName选择DLC产品时，必传此参数。其他产品可不传
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 引擎名称，ProductName选择DLC产品时，必传此参数。其他产品可不传
     * @param EngineName 引擎名称，ProductName选择DLC产品时，必传此参数。其他产品可不传
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get vpc信息，产品名称为other时必传此参数 
     * @return VpcInfo vpc信息，产品名称为other时必传此参数
     */
    public VpcInfo [] getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set vpc信息，产品名称为other时必传此参数
     * @param VpcInfo vpc信息，产品名称为other时必传此参数
     */
    public void setVpcInfo(VpcInfo [] VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    public CreateCHDFSBindingProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCHDFSBindingProductRequest(CreateCHDFSBindingProductRequest source) {
        if (source.MountPoint != null) {
            this.MountPoint = new String(source.MountPoint);
        }
        if (source.BucketType != null) {
            this.BucketType = new String(source.BucketType);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new VpcInfo[source.VpcInfo.length];
            for (int i = 0; i < source.VpcInfo.length; i++) {
                this.VpcInfo[i] = new VpcInfo(source.VpcInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPoint", this.MountPoint);
        this.setParamSimple(map, prefix + "BucketType", this.BucketType);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamArrayObj(map, prefix + "VpcInfo.", this.VpcInfo);

    }
}

