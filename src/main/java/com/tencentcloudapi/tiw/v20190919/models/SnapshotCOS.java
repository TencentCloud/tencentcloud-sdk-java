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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotCOS extends AbstractModel{

    /**
    * cos所在腾讯云帐号uin
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * cos所在地区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * cos存储桶名称
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 板书文件存储根目录
    */
    @SerializedName("TargetDir")
    @Expose
    private String TargetDir;

    /**
    * CDN加速域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get cos所在腾讯云帐号uin 
     * @return Uin cos所在腾讯云帐号uin
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set cos所在腾讯云帐号uin
     * @param Uin cos所在腾讯云帐号uin
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get cos所在地区 
     * @return Region cos所在地区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos所在地区
     * @param Region cos所在地区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get cos存储桶名称 
     * @return Bucket cos存储桶名称
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set cos存储桶名称
     * @param Bucket cos存储桶名称
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 板书文件存储根目录 
     * @return TargetDir 板书文件存储根目录
     */
    public String getTargetDir() {
        return this.TargetDir;
    }

    /**
     * Set 板书文件存储根目录
     * @param TargetDir 板书文件存储根目录
     */
    public void setTargetDir(String TargetDir) {
        this.TargetDir = TargetDir;
    }

    /**
     * Get CDN加速域名 
     * @return Domain CDN加速域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set CDN加速域名
     * @param Domain CDN加速域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public SnapshotCOS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotCOS(SnapshotCOS source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.TargetDir != null) {
            this.TargetDir = new String(source.TargetDir);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "TargetDir", this.TargetDir);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

