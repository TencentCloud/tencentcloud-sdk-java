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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KubeJarvisStateResultsItem extends AbstractModel{

    /**
    * 诊断结果级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 诊断对象名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjName")
    @Expose
    private String ObjName;

    /**
    * 诊断对象信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjInfo")
    @Expose
    private KubeJarvisStateResultObjInfo [] ObjInfo;

    /**
    * 诊断项标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 诊断项描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 诊断建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Proposal")
    @Expose
    private String Proposal;

    /**
    * 诊断建议文档链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProposalDocUrl")
    @Expose
    private String ProposalDocUrl;

    /**
    * 诊断建议文档名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProposalDocName")
    @Expose
    private String ProposalDocName;

    /**
     * Get 诊断结果级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 诊断结果级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 诊断结果级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 诊断结果级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 诊断对象名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjName 诊断对象名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjName() {
        return this.ObjName;
    }

    /**
     * Set 诊断对象名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjName 诊断对象名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjName(String ObjName) {
        this.ObjName = ObjName;
    }

    /**
     * Get 诊断对象信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjInfo 诊断对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KubeJarvisStateResultObjInfo [] getObjInfo() {
        return this.ObjInfo;
    }

    /**
     * Set 诊断对象信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjInfo 诊断对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjInfo(KubeJarvisStateResultObjInfo [] ObjInfo) {
        this.ObjInfo = ObjInfo;
    }

    /**
     * Get 诊断项标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 诊断项标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 诊断项标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 诊断项标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 诊断项描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 诊断项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 诊断项描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 诊断项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 诊断建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Proposal 诊断建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProposal() {
        return this.Proposal;
    }

    /**
     * Set 诊断建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Proposal 诊断建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProposal(String Proposal) {
        this.Proposal = Proposal;
    }

    /**
     * Get 诊断建议文档链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProposalDocUrl 诊断建议文档链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProposalDocUrl() {
        return this.ProposalDocUrl;
    }

    /**
     * Set 诊断建议文档链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProposalDocUrl 诊断建议文档链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProposalDocUrl(String ProposalDocUrl) {
        this.ProposalDocUrl = ProposalDocUrl;
    }

    /**
     * Get 诊断建议文档名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProposalDocName 诊断建议文档名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProposalDocName() {
        return this.ProposalDocName;
    }

    /**
     * Set 诊断建议文档名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProposalDocName 诊断建议文档名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProposalDocName(String ProposalDocName) {
        this.ProposalDocName = ProposalDocName;
    }

    public KubeJarvisStateResultsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KubeJarvisStateResultsItem(KubeJarvisStateResultsItem source) {
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.ObjName != null) {
            this.ObjName = new String(source.ObjName);
        }
        if (source.ObjInfo != null) {
            this.ObjInfo = new KubeJarvisStateResultObjInfo[source.ObjInfo.length];
            for (int i = 0; i < source.ObjInfo.length; i++) {
                this.ObjInfo[i] = new KubeJarvisStateResultObjInfo(source.ObjInfo[i]);
            }
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Proposal != null) {
            this.Proposal = new String(source.Proposal);
        }
        if (source.ProposalDocUrl != null) {
            this.ProposalDocUrl = new String(source.ProposalDocUrl);
        }
        if (source.ProposalDocName != null) {
            this.ProposalDocName = new String(source.ProposalDocName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ObjName", this.ObjName);
        this.setParamArrayObj(map, prefix + "ObjInfo.", this.ObjInfo);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Proposal", this.Proposal);
        this.setParamSimple(map, prefix + "ProposalDocUrl", this.ProposalDocUrl);
        this.setParamSimple(map, prefix + "ProposalDocName", this.ProposalDocName);

    }
}

