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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Component extends AbstractModel {

    /**
    * 第三方组件的PURL
    */
    @SerializedName("PURL")
    @Expose
    private PURL PURL;

    /**
    * 第三方组件的主页
    */
    @SerializedName("Homepage")
    @Expose
    private String Homepage;

    /**
    * 第三方组件的简介
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 第三方组件的别名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NicknameList")
    @Expose
    private String [] NicknameList;

    /**
    * 第三方组件的代码位置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeLocationList")
    @Expose
    private String [] CodeLocationList;

    /**
    * 第三方组件的许可证表达式
    */
    @SerializedName("LicenseExpression")
    @Expose
    private String LicenseExpression;

    /**
    * 第三方组件的版本信息(如果匹配到版本)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionInfo")
    @Expose
    private ComponentVersionInfo VersionInfo;

    /**
    * 第三方组件的最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 第三方组件的类型标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
     * Get 第三方组件的PURL 
     * @return PURL 第三方组件的PURL
     */
    public PURL getPURL() {
        return this.PURL;
    }

    /**
     * Set 第三方组件的PURL
     * @param PURL 第三方组件的PURL
     */
    public void setPURL(PURL PURL) {
        this.PURL = PURL;
    }

    /**
     * Get 第三方组件的主页 
     * @return Homepage 第三方组件的主页
     */
    public String getHomepage() {
        return this.Homepage;
    }

    /**
     * Set 第三方组件的主页
     * @param Homepage 第三方组件的主页
     */
    public void setHomepage(String Homepage) {
        this.Homepage = Homepage;
    }

    /**
     * Get 第三方组件的简介 
     * @return Summary 第三方组件的简介
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 第三方组件的简介
     * @param Summary 第三方组件的简介
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 第三方组件的别名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NicknameList 第三方组件的别名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNicknameList() {
        return this.NicknameList;
    }

    /**
     * Set 第三方组件的别名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NicknameList 第三方组件的别名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNicknameList(String [] NicknameList) {
        this.NicknameList = NicknameList;
    }

    /**
     * Get 第三方组件的代码位置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeLocationList 第三方组件的代码位置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCodeLocationList() {
        return this.CodeLocationList;
    }

    /**
     * Set 第三方组件的代码位置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeLocationList 第三方组件的代码位置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeLocationList(String [] CodeLocationList) {
        this.CodeLocationList = CodeLocationList;
    }

    /**
     * Get 第三方组件的许可证表达式 
     * @return LicenseExpression 第三方组件的许可证表达式
     */
    public String getLicenseExpression() {
        return this.LicenseExpression;
    }

    /**
     * Set 第三方组件的许可证表达式
     * @param LicenseExpression 第三方组件的许可证表达式
     */
    public void setLicenseExpression(String LicenseExpression) {
        this.LicenseExpression = LicenseExpression;
    }

    /**
     * Get 第三方组件的版本信息(如果匹配到版本)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionInfo 第三方组件的版本信息(如果匹配到版本)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComponentVersionInfo getVersionInfo() {
        return this.VersionInfo;
    }

    /**
     * Set 第三方组件的版本信息(如果匹配到版本)
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionInfo 第三方组件的版本信息(如果匹配到版本)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionInfo(ComponentVersionInfo VersionInfo) {
        this.VersionInfo = VersionInfo;
    }

    /**
     * Get 第三方组件的最后更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 第三方组件的最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 第三方组件的最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 第三方组件的最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 第三方组件的类型标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList 第三方组件的类型标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 第三方组件的类型标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList 第三方组件的类型标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    public Component() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Component(Component source) {
        if (source.PURL != null) {
            this.PURL = new PURL(source.PURL);
        }
        if (source.Homepage != null) {
            this.Homepage = new String(source.Homepage);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.NicknameList != null) {
            this.NicknameList = new String[source.NicknameList.length];
            for (int i = 0; i < source.NicknameList.length; i++) {
                this.NicknameList[i] = new String(source.NicknameList[i]);
            }
        }
        if (source.CodeLocationList != null) {
            this.CodeLocationList = new String[source.CodeLocationList.length];
            for (int i = 0; i < source.CodeLocationList.length; i++) {
                this.CodeLocationList[i] = new String(source.CodeLocationList[i]);
            }
        }
        if (source.LicenseExpression != null) {
            this.LicenseExpression = new String(source.LicenseExpression);
        }
        if (source.VersionInfo != null) {
            this.VersionInfo = new ComponentVersionInfo(source.VersionInfo);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PURL.", this.PURL);
        this.setParamSimple(map, prefix + "Homepage", this.Homepage);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamArraySimple(map, prefix + "NicknameList.", this.NicknameList);
        this.setParamArraySimple(map, prefix + "CodeLocationList.", this.CodeLocationList);
        this.setParamSimple(map, prefix + "LicenseExpression", this.LicenseExpression);
        this.setParamObj(map, prefix + "VersionInfo.", this.VersionInfo);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);

    }
}

