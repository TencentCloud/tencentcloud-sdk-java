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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreExecuteFileSettings extends AbstractModel{

    /**
    * 脚本在COS上路径，已废弃
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 执行脚本参数
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * COS的Bucket名称，已废弃
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS的Region名称，已废弃
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * COS的Domain数据，已废弃
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 执行顺序
    */
    @SerializedName("RunOrder")
    @Expose
    private Long RunOrder;

    /**
    * resourceAfter 或 clusterAfter
    */
    @SerializedName("WhenRun")
    @Expose
    private String WhenRun;

    /**
    * 脚本文件名，已废弃
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
    * 脚本的cos地址
    */
    @SerializedName("CosFileURI")
    @Expose
    private String CosFileURI;

    /**
    * cos的SecretId
    */
    @SerializedName("CosSecretId")
    @Expose
    private String CosSecretId;

    /**
    * Cos的SecretKey
    */
    @SerializedName("CosSecretKey")
    @Expose
    private String CosSecretKey;

    /**
    * cos的appid，已废弃
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get 脚本在COS上路径，已废弃 
     * @return Path 脚本在COS上路径，已废弃
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 脚本在COS上路径，已废弃
     * @param Path 脚本在COS上路径，已废弃
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 执行脚本参数 
     * @return Args 执行脚本参数
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set 执行脚本参数
     * @param Args 执行脚本参数
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * Get COS的Bucket名称，已废弃 
     * @return Bucket COS的Bucket名称，已废弃
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS的Bucket名称，已废弃
     * @param Bucket COS的Bucket名称，已废弃
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS的Region名称，已废弃 
     * @return Region COS的Region名称，已废弃
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set COS的Region名称，已废弃
     * @param Region COS的Region名称，已废弃
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get COS的Domain数据，已废弃 
     * @return Domain COS的Domain数据，已废弃
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set COS的Domain数据，已废弃
     * @param Domain COS的Domain数据，已废弃
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 执行顺序 
     * @return RunOrder 执行顺序
     */
    public Long getRunOrder() {
        return this.RunOrder;
    }

    /**
     * Set 执行顺序
     * @param RunOrder 执行顺序
     */
    public void setRunOrder(Long RunOrder) {
        this.RunOrder = RunOrder;
    }

    /**
     * Get resourceAfter 或 clusterAfter 
     * @return WhenRun resourceAfter 或 clusterAfter
     */
    public String getWhenRun() {
        return this.WhenRun;
    }

    /**
     * Set resourceAfter 或 clusterAfter
     * @param WhenRun resourceAfter 或 clusterAfter
     */
    public void setWhenRun(String WhenRun) {
        this.WhenRun = WhenRun;
    }

    /**
     * Get 脚本文件名，已废弃 
     * @return CosFileName 脚本文件名，已废弃
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set 脚本文件名，已废弃
     * @param CosFileName 脚本文件名，已废弃
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    /**
     * Get 脚本的cos地址 
     * @return CosFileURI 脚本的cos地址
     */
    public String getCosFileURI() {
        return this.CosFileURI;
    }

    /**
     * Set 脚本的cos地址
     * @param CosFileURI 脚本的cos地址
     */
    public void setCosFileURI(String CosFileURI) {
        this.CosFileURI = CosFileURI;
    }

    /**
     * Get cos的SecretId 
     * @return CosSecretId cos的SecretId
     */
    public String getCosSecretId() {
        return this.CosSecretId;
    }

    /**
     * Set cos的SecretId
     * @param CosSecretId cos的SecretId
     */
    public void setCosSecretId(String CosSecretId) {
        this.CosSecretId = CosSecretId;
    }

    /**
     * Get Cos的SecretKey 
     * @return CosSecretKey Cos的SecretKey
     */
    public String getCosSecretKey() {
        return this.CosSecretKey;
    }

    /**
     * Set Cos的SecretKey
     * @param CosSecretKey Cos的SecretKey
     */
    public void setCosSecretKey(String CosSecretKey) {
        this.CosSecretKey = CosSecretKey;
    }

    /**
     * Get cos的appid，已废弃 
     * @return AppId cos的appid，已废弃
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set cos的appid，已废弃
     * @param AppId cos的appid，已废弃
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RunOrder", this.RunOrder);
        this.setParamSimple(map, prefix + "WhenRun", this.WhenRun);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);
        this.setParamSimple(map, prefix + "CosFileURI", this.CosFileURI);
        this.setParamSimple(map, prefix + "CosSecretId", this.CosSecretId);
        this.setParamSimple(map, prefix + "CosSecretKey", this.CosSecretKey);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

