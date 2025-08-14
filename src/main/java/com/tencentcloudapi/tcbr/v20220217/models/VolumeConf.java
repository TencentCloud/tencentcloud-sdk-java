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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeConf extends AbstractModel {

    /**
    * 存储类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 对象存储桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 存储连接地址
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 存储连接用户密码
    */
    @SerializedName("KeyID")
    @Expose
    private String KeyID;

    /**
    * 存储挂载目的目录
    */
    @SerializedName("DstPath")
    @Expose
    private String DstPath;

    /**
    * 存储挂载源目录
    */
    @SerializedName("SrcPath")
    @Expose
    private String SrcPath;

    /**
     * Get 存储类型 
     * @return Type 存储类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 存储类型
     * @param Type 存储类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 对象存储桶名称 
     * @return BucketName 对象存储桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 对象存储桶名称
     * @param BucketName 对象存储桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 存储连接地址 
     * @return Endpoint 存储连接地址
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 存储连接地址
     * @param Endpoint 存储连接地址
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 存储连接用户密码 
     * @return KeyID 存储连接用户密码
     */
    public String getKeyID() {
        return this.KeyID;
    }

    /**
     * Set 存储连接用户密码
     * @param KeyID 存储连接用户密码
     */
    public void setKeyID(String KeyID) {
        this.KeyID = KeyID;
    }

    /**
     * Get 存储挂载目的目录 
     * @return DstPath 存储挂载目的目录
     */
    public String getDstPath() {
        return this.DstPath;
    }

    /**
     * Set 存储挂载目的目录
     * @param DstPath 存储挂载目的目录
     */
    public void setDstPath(String DstPath) {
        this.DstPath = DstPath;
    }

    /**
     * Get 存储挂载源目录 
     * @return SrcPath 存储挂载源目录
     */
    public String getSrcPath() {
        return this.SrcPath;
    }

    /**
     * Set 存储挂载源目录
     * @param SrcPath 存储挂载源目录
     */
    public void setSrcPath(String SrcPath) {
        this.SrcPath = SrcPath;
    }

    public VolumeConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeConf(VolumeConf source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.KeyID != null) {
            this.KeyID = new String(source.KeyID);
        }
        if (source.DstPath != null) {
            this.DstPath = new String(source.DstPath);
        }
        if (source.SrcPath != null) {
            this.SrcPath = new String(source.SrcPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "KeyID", this.KeyID);
        this.setParamSimple(map, prefix + "DstPath", this.DstPath);
        this.setParamSimple(map, prefix + "SrcPath", this.SrcPath);

    }
}

