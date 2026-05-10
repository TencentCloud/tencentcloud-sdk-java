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
    * <p>存储类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>对象存储桶名称</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>存储连接地址</p>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>存储连接用户密码</p>
    */
    @SerializedName("KeyID")
    @Expose
    private String KeyID;

    /**
    * <p>存储挂载目的目录</p>
    */
    @SerializedName("DstPath")
    @Expose
    private String DstPath;

    /**
    * <p>存储挂载源目录</p>
    */
    @SerializedName("SrcPath")
    @Expose
    private String SrcPath;

    /**
    * <p>cfs 实例ip</p>
    */
    @SerializedName("MountIP")
    @Expose
    private String MountIP;

    /**
    * <p>默认读写</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * <p>CFS 实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>存储类型</p> 
     * @return Type <p>存储类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>存储类型</p>
     * @param Type <p>存储类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>对象存储桶名称</p> 
     * @return BucketName <p>对象存储桶名称</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>对象存储桶名称</p>
     * @param BucketName <p>对象存储桶名称</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>存储连接地址</p> 
     * @return Endpoint <p>存储连接地址</p>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>存储连接地址</p>
     * @param Endpoint <p>存储连接地址</p>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>存储连接用户密码</p> 
     * @return KeyID <p>存储连接用户密码</p>
     */
    public String getKeyID() {
        return this.KeyID;
    }

    /**
     * Set <p>存储连接用户密码</p>
     * @param KeyID <p>存储连接用户密码</p>
     */
    public void setKeyID(String KeyID) {
        this.KeyID = KeyID;
    }

    /**
     * Get <p>存储挂载目的目录</p> 
     * @return DstPath <p>存储挂载目的目录</p>
     */
    public String getDstPath() {
        return this.DstPath;
    }

    /**
     * Set <p>存储挂载目的目录</p>
     * @param DstPath <p>存储挂载目的目录</p>
     */
    public void setDstPath(String DstPath) {
        this.DstPath = DstPath;
    }

    /**
     * Get <p>存储挂载源目录</p> 
     * @return SrcPath <p>存储挂载源目录</p>
     */
    public String getSrcPath() {
        return this.SrcPath;
    }

    /**
     * Set <p>存储挂载源目录</p>
     * @param SrcPath <p>存储挂载源目录</p>
     */
    public void setSrcPath(String SrcPath) {
        this.SrcPath = SrcPath;
    }

    /**
     * Get <p>cfs 实例ip</p> 
     * @return MountIP <p>cfs 实例ip</p>
     */
    public String getMountIP() {
        return this.MountIP;
    }

    /**
     * Set <p>cfs 实例ip</p>
     * @param MountIP <p>cfs 实例ip</p>
     */
    public void setMountIP(String MountIP) {
        this.MountIP = MountIP;
    }

    /**
     * Get <p>默认读写</p> 
     * @return ReadOnly <p>默认读写</p>
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>默认读写</p>
     * @param ReadOnly <p>默认读写</p>
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get <p>CFS 实例 ID</p> 
     * @return InstanceId <p>CFS 实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>CFS 实例 ID</p>
     * @param InstanceId <p>CFS 实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
        if (source.MountIP != null) {
            this.MountIP = new String(source.MountIP);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "MountIP", this.MountIP);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

