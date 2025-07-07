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

public class StaticStorageInfo extends AbstractModel {

    /**
    * 静态CDN域名
    */
    @SerializedName("StaticDomain")
    @Expose
    private String StaticDomain;

    /**
    * 静态CDN默认文件夹，当前为根目录
    */
    @SerializedName("DefaultDirName")
    @Expose
    private String DefaultDirName;

    /**
    * 资源状态(process/online/offline/init)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * cos所属区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * bucket信息
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
     * Get 静态CDN域名 
     * @return StaticDomain 静态CDN域名
     */
    public String getStaticDomain() {
        return this.StaticDomain;
    }

    /**
     * Set 静态CDN域名
     * @param StaticDomain 静态CDN域名
     */
    public void setStaticDomain(String StaticDomain) {
        this.StaticDomain = StaticDomain;
    }

    /**
     * Get 静态CDN默认文件夹，当前为根目录 
     * @return DefaultDirName 静态CDN默认文件夹，当前为根目录
     */
    public String getDefaultDirName() {
        return this.DefaultDirName;
    }

    /**
     * Set 静态CDN默认文件夹，当前为根目录
     * @param DefaultDirName 静态CDN默认文件夹，当前为根目录
     */
    public void setDefaultDirName(String DefaultDirName) {
        this.DefaultDirName = DefaultDirName;
    }

    /**
     * Get 资源状态(process/online/offline/init) 
     * @return Status 资源状态(process/online/offline/init)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态(process/online/offline/init)
     * @param Status 资源状态(process/online/offline/init)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get cos所属区域 
     * @return Region cos所属区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos所属区域
     * @param Region cos所属区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get bucket信息 
     * @return Bucket bucket信息
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set bucket信息
     * @param Bucket bucket信息
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
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

    }
}

