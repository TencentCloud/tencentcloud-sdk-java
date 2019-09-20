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

public class PreExecuteFileSettings  extends AbstractModel{

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
    private Integer RunOrder;

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
     * 获取脚本在COS上路径，已废弃
     * @return Path 脚本在COS上路径，已废弃
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * 设置脚本在COS上路径，已废弃
     * @param Path 脚本在COS上路径，已废弃
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * 获取执行脚本参数
     * @return Args 执行脚本参数
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * 设置执行脚本参数
     * @param Args 执行脚本参数
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * 获取COS的Bucket名称，已废弃
     * @return Bucket COS的Bucket名称，已废弃
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * 设置COS的Bucket名称，已废弃
     * @param Bucket COS的Bucket名称，已废弃
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * 获取COS的Region名称，已废弃
     * @return Region COS的Region名称，已废弃
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置COS的Region名称，已废弃
     * @param Region COS的Region名称，已废弃
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取COS的Domain数据，已废弃
     * @return Domain COS的Domain数据，已废弃
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置COS的Domain数据，已废弃
     * @param Domain COS的Domain数据，已废弃
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取执行顺序
     * @return RunOrder 执行顺序
     */
    public Integer getRunOrder() {
        return this.RunOrder;
    }

    /**
     * 设置执行顺序
     * @param RunOrder 执行顺序
     */
    public void setRunOrder(Integer RunOrder) {
        this.RunOrder = RunOrder;
    }

    /**
     * 获取resourceAfter 或 clusterAfter
     * @return WhenRun resourceAfter 或 clusterAfter
     */
    public String getWhenRun() {
        return this.WhenRun;
    }

    /**
     * 设置resourceAfter 或 clusterAfter
     * @param WhenRun resourceAfter 或 clusterAfter
     */
    public void setWhenRun(String WhenRun) {
        this.WhenRun = WhenRun;
    }

    /**
     * 获取脚本文件名，已废弃
     * @return CosFileName 脚本文件名，已废弃
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * 设置脚本文件名，已废弃
     * @param CosFileName 脚本文件名，已废弃
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    /**
     * 获取脚本的cos地址
     * @return CosFileURI 脚本的cos地址
     */
    public String getCosFileURI() {
        return this.CosFileURI;
    }

    /**
     * 设置脚本的cos地址
     * @param CosFileURI 脚本的cos地址
     */
    public void setCosFileURI(String CosFileURI) {
        this.CosFileURI = CosFileURI;
    }

    /**
     * 获取cos的SecretId
     * @return CosSecretId cos的SecretId
     */
    public String getCosSecretId() {
        return this.CosSecretId;
    }

    /**
     * 设置cos的SecretId
     * @param CosSecretId cos的SecretId
     */
    public void setCosSecretId(String CosSecretId) {
        this.CosSecretId = CosSecretId;
    }

    /**
     * 获取Cos的SecretKey
     * @return CosSecretKey Cos的SecretKey
     */
    public String getCosSecretKey() {
        return this.CosSecretKey;
    }

    /**
     * 设置Cos的SecretKey
     * @param CosSecretKey Cos的SecretKey
     */
    public void setCosSecretKey(String CosSecretKey) {
        this.CosSecretKey = CosSecretKey;
    }

    /**
     * 获取cos的appid，已废弃
     * @return AppId cos的appid，已废弃
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * 设置cos的appid，已废弃
     * @param AppId cos的appid，已废弃
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * 内部实现，用户禁止调用
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

