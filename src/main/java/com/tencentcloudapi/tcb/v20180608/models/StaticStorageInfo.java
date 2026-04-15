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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaticStorageInfo extends AbstractModel {

    /**
    * <p>静态CDN域名</p>
    */
    @SerializedName("StaticDomain")
    @Expose
    private String StaticDomain;

    /**
    * <p>静态CDN默认文件夹，当前为根目录</p>
    */
    @SerializedName("DefaultDirName")
    @Expose
    private String DefaultDirName;

    /**
    * <p>资源状态(process/online/offline/init)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>cos所属区域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>bucket信息</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>到期时间（秒级时间戳）</p>
    */
    @SerializedName("AccessExpire")
    @Expose
    private Long AccessExpire;

    /**
    * <p>外部存储。</p>
    */
    @SerializedName("ExternalStorage")
    @Expose
    private ExternalStorage ExternalStorage;

    /**
     * Get <p>静态CDN域名</p> 
     * @return StaticDomain <p>静态CDN域名</p>
     */
    public String getStaticDomain() {
        return this.StaticDomain;
    }

    /**
     * Set <p>静态CDN域名</p>
     * @param StaticDomain <p>静态CDN域名</p>
     */
    public void setStaticDomain(String StaticDomain) {
        this.StaticDomain = StaticDomain;
    }

    /**
     * Get <p>静态CDN默认文件夹，当前为根目录</p> 
     * @return DefaultDirName <p>静态CDN默认文件夹，当前为根目录</p>
     */
    public String getDefaultDirName() {
        return this.DefaultDirName;
    }

    /**
     * Set <p>静态CDN默认文件夹，当前为根目录</p>
     * @param DefaultDirName <p>静态CDN默认文件夹，当前为根目录</p>
     */
    public void setDefaultDirName(String DefaultDirName) {
        this.DefaultDirName = DefaultDirName;
    }

    /**
     * Get <p>资源状态(process/online/offline/init)</p> 
     * @return Status <p>资源状态(process/online/offline/init)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>资源状态(process/online/offline/init)</p>
     * @param Status <p>资源状态(process/online/offline/init)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>cos所属区域</p> 
     * @return Region <p>cos所属区域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>cos所属区域</p>
     * @param Region <p>cos所属区域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>bucket信息</p> 
     * @return Bucket <p>bucket信息</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>bucket信息</p>
     * @param Bucket <p>bucket信息</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>到期时间（秒级时间戳）</p> 
     * @return AccessExpire <p>到期时间（秒级时间戳）</p>
     */
    public Long getAccessExpire() {
        return this.AccessExpire;
    }

    /**
     * Set <p>到期时间（秒级时间戳）</p>
     * @param AccessExpire <p>到期时间（秒级时间戳）</p>
     */
    public void setAccessExpire(Long AccessExpire) {
        this.AccessExpire = AccessExpire;
    }

    /**
     * Get <p>外部存储。</p> 
     * @return ExternalStorage <p>外部存储。</p>
     */
    public ExternalStorage getExternalStorage() {
        return this.ExternalStorage;
    }

    /**
     * Set <p>外部存储。</p>
     * @param ExternalStorage <p>外部存储。</p>
     */
    public void setExternalStorage(ExternalStorage ExternalStorage) {
        this.ExternalStorage = ExternalStorage;
    }

    public StaticStorageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticStorageInfo(StaticStorageInfo source) {
        if (source.StaticDomain != null) {
            this.StaticDomain = new String(source.StaticDomain);
        }
        if (source.DefaultDirName != null) {
            this.DefaultDirName = new String(source.DefaultDirName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.AccessExpire != null) {
            this.AccessExpire = new Long(source.AccessExpire);
        }
        if (source.ExternalStorage != null) {
            this.ExternalStorage = new ExternalStorage(source.ExternalStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StaticDomain", this.StaticDomain);
        this.setParamSimple(map, prefix + "DefaultDirName", this.DefaultDirName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "AccessExpire", this.AccessExpire);
        this.setParamObj(map, prefix + "ExternalStorage.", this.ExternalStorage);

    }
}

