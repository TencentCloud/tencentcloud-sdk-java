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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CFGViewCFGRisk extends AbstractModel {

    /**
    * 影响资产
    */
    @SerializedName("NoHandleCount")
    @Expose
    private Long NoHandleCount;

    /**
    * 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。
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
    @SerializedName("AffectAssetCount")
    @Expose
    private Long AffectAssetCount;

    /**
    * 资产唯一id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资产子类型
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 前端索引
    */
    @SerializedName("Index")
    @Expose
    private String Index;

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
    * 配置名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFGName")
    @Expose
    private String CFGName;

    /**
    * 检查类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFGSTD")
    @Expose
    private String CFGSTD;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFGDescribe")
    @Expose
    private String CFGDescribe;

    /**
    * 修复建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFGFix")
    @Expose
    private String CFGFix;

    /**
    * 帮助文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFGHelpURL")
    @Expose
    private String CFGHelpURL;

    /**
     * Get 影响资产 
     * @return NoHandleCount 影响资产
     */
    public Long getNoHandleCount() {
        return this.NoHandleCount;
    }

    /**
     * Set 影响资产
     * @param NoHandleCount 影响资产
     */
    public void setNoHandleCount(Long NoHandleCount) {
        this.NoHandleCount = NoHandleCount;
    }

    /**
     * Get 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。 
     * @return Level 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。
     * @param Level 风险等级，low-低危，high-高危，middle-中危，info-提示，extreme-严重。
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
     * @return AffectAssetCount 状态，0未处理、1已处置、2已忽略
     */
    public Long getAffectAssetCount() {
        return this.AffectAssetCount;
    }

    /**
     * Set 状态，0未处理、1已处置、2已忽略
     * @param AffectAssetCount 状态，0未处理、1已处置、2已忽略
     */
    public void setAffectAssetCount(Long AffectAssetCount) {
        this.AffectAssetCount = AffectAssetCount;
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
     * Get 资产子类型 
     * @return From 资产子类型
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 资产子类型
     * @param From 资产子类型
     */
    public void setFrom(String From) {
        this.From = From;
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
     * Get 配置名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFGName 配置名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCFGName() {
        return this.CFGName;
    }

    /**
     * Set 配置名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFGName 配置名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFGName(String CFGName) {
        this.CFGName = CFGName;
    }

    /**
     * Get 检查类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckType 检查类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 检查类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckType 检查类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFGSTD -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCFGSTD() {
        return this.CFGSTD;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFGSTD -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFGSTD(String CFGSTD) {
        this.CFGSTD = CFGSTD;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFGDescribe 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCFGDescribe() {
        return this.CFGDescribe;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFGDescribe 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFGDescribe(String CFGDescribe) {
        this.CFGDescribe = CFGDescribe;
    }

    /**
     * Get 修复建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFGFix 修复建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCFGFix() {
        return this.CFGFix;
    }

    /**
     * Set 修复建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFGFix 修复建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFGFix(String CFGFix) {
        this.CFGFix = CFGFix;
    }

    /**
     * Get 帮助文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFGHelpURL 帮助文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCFGHelpURL() {
        return this.CFGHelpURL;
    }

    /**
     * Set 帮助文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFGHelpURL 帮助文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFGHelpURL(String CFGHelpURL) {
        this.CFGHelpURL = CFGHelpURL;
    }

    public CFGViewCFGRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFGViewCFGRisk(CFGViewCFGRisk source) {
        if (source.NoHandleCount != null) {
            this.NoHandleCount = new Long(source.NoHandleCount);
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
        if (source.AffectAssetCount != null) {
            this.AffectAssetCount = new Long(source.AffectAssetCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
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
        if (source.CFGName != null) {
            this.CFGName = new String(source.CFGName);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.CFGSTD != null) {
            this.CFGSTD = new String(source.CFGSTD);
        }
        if (source.CFGDescribe != null) {
            this.CFGDescribe = new String(source.CFGDescribe);
        }
        if (source.CFGFix != null) {
            this.CFGFix = new String(source.CFGFix);
        }
        if (source.CFGHelpURL != null) {
            this.CFGHelpURL = new String(source.CFGHelpURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoHandleCount", this.NoHandleCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "AffectAssetCount", this.AffectAssetCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CFGName", this.CFGName);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "CFGSTD", this.CFGSTD);
        this.setParamSimple(map, prefix + "CFGDescribe", this.CFGDescribe);
        this.setParamSimple(map, prefix + "CFGFix", this.CFGFix);
        this.setParamSimple(map, prefix + "CFGHelpURL", this.CFGHelpURL);

    }
}

