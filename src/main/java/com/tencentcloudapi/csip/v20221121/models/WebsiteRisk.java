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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebsiteRisk extends AbstractModel{

    /**
    * 影响资产
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 最近识别时间
    */
    @SerializedName("RecentTime")
    @Expose
    private String RecentTime;

    /**
    * 首次识别时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 状态，0未处理、1已处置、2已忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资产唯一id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 前端索引
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 风险链接
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 风险文件地址
    */
    @SerializedName("URLPath")
    @Expose
    private String URLPath;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 类型
    */
    @SerializedName("DetectEngine")
    @Expose
    private String DetectEngine;

    /**
    * 结果描述
    */
    @SerializedName("ResultDescribe")
    @Expose
    private String ResultDescribe;

    /**
    * 源地址url
    */
    @SerializedName("SourceURL")
    @Expose
    private String SourceURL;

    /**
    * 源文件地址
    */
    @SerializedName("SourceURLPath")
    @Expose
    private String SourceURLPath;

    /**
     * Get 影响资产 
     * @return AffectAsset 影响资产
     */
    public String getAffectAsset() {
        return this.AffectAsset;
    }

    /**
     * Set 影响资产
     * @param AffectAsset 影响资产
     */
    public void setAffectAsset(String AffectAsset) {
        this.AffectAsset = AffectAsset;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 最近识别时间 
     * @return RecentTime 最近识别时间
     */
    public String getRecentTime() {
        return this.RecentTime;
    }

    /**
     * Set 最近识别时间
     * @param RecentTime 最近识别时间
     */
    public void setRecentTime(String RecentTime) {
        this.RecentTime = RecentTime;
    }

    /**
     * Get 首次识别时间 
     * @return FirstTime 首次识别时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次识别时间
     * @param FirstTime 首次识别时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 状态，0未处理、1已处置、2已忽略 
     * @return Status 状态，0未处理、1已处置、2已忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，0未处理、1已处置、2已忽略
     * @param Status 状态，0未处理、1已处置、2已忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资产唯一id 
     * @return Id 资产唯一id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资产唯一id
     * @param Id 资产唯一id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 前端索引 
     * @return Index 前端索引
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 前端索引
     * @param Index 前端索引
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nick 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nick 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 风险链接 
     * @return URL 风险链接
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 风险链接
     * @param URL 风险链接
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 风险文件地址 
     * @return URLPath 风险文件地址
     */
    public String getURLPath() {
        return this.URLPath;
    }

    /**
     * Set 风险文件地址
     * @param URLPath 风险文件地址
     */
    public void setURLPath(String URLPath) {
        this.URLPath = URLPath;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 类型 
     * @return DetectEngine 类型
     */
    public String getDetectEngine() {
        return this.DetectEngine;
    }

    /**
     * Set 类型
     * @param DetectEngine 类型
     */
    public void setDetectEngine(String DetectEngine) {
        this.DetectEngine = DetectEngine;
    }

    /**
     * Get 结果描述 
     * @return ResultDescribe 结果描述
     */
    public String getResultDescribe() {
        return this.ResultDescribe;
    }

    /**
     * Set 结果描述
     * @param ResultDescribe 结果描述
     */
    public void setResultDescribe(String ResultDescribe) {
        this.ResultDescribe = ResultDescribe;
    }

    /**
     * Get 源地址url 
     * @return SourceURL 源地址url
     */
    public String getSourceURL() {
        return this.SourceURL;
    }

    /**
     * Set 源地址url
     * @param SourceURL 源地址url
     */
    public void setSourceURL(String SourceURL) {
        this.SourceURL = SourceURL;
    }

    /**
     * Get 源文件地址 
     * @return SourceURLPath 源文件地址
     */
    public String getSourceURLPath() {
        return this.SourceURLPath;
    }

    /**
     * Set 源文件地址
     * @param SourceURLPath 源文件地址
     */
    public void setSourceURLPath(String SourceURLPath) {
        this.SourceURLPath = SourceURLPath;
    }

    public WebsiteRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebsiteRisk(WebsiteRisk source) {
        if (source.AffectAsset != null) {
            this.AffectAsset = new String(source.AffectAsset);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.RecentTime != null) {
            this.RecentTime = new String(source.RecentTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.URLPath != null) {
            this.URLPath = new String(source.URLPath);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DetectEngine != null) {
            this.DetectEngine = new String(source.DetectEngine);
        }
        if (source.ResultDescribe != null) {
            this.ResultDescribe = new String(source.ResultDescribe);
        }
        if (source.SourceURL != null) {
            this.SourceURL = new String(source.SourceURL);
        }
        if (source.SourceURLPath != null) {
            this.SourceURLPath = new String(source.SourceURLPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectAsset", this.AffectAsset);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "URLPath", this.URLPath);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DetectEngine", this.DetectEngine);
        this.setParamSimple(map, prefix + "ResultDescribe", this.ResultDescribe);
        this.setParamSimple(map, prefix + "SourceURL", this.SourceURL);
        this.setParamSimple(map, prefix + "SourceURLPath", this.SourceURLPath);

    }
}

