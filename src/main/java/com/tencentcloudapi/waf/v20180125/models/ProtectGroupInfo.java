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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectGroupInfo extends AbstractModel {

    /**
    * <p>防护对象组ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>防护对象组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>防护对象组备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>防护对象组中绑定的域名详情</p>
    */
    @SerializedName("Domains")
    @Expose
    private ProtectGroupDomainInfo [] Domains;

    /**
    * <p>关联的批量规则数</p>
    */
    @SerializedName("RuleNum")
    @Expose
    private Long RuleNum;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("TagInfos")
    @Expose
    private TagInfo [] TagInfos;

    /**
    * <p>是否绑定了模板</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoundTemplate")
    @Expose
    private Boolean BoundTemplate;

    /**
     * Get <p>防护对象组ID</p> 
     * @return ID <p>防护对象组ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>防护对象组ID</p>
     * @param ID <p>防护对象组ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>防护对象组名称</p> 
     * @return Name <p>防护对象组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>防护对象组名称</p>
     * @param Name <p>防护对象组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>防护对象组备注</p> 
     * @return Remark <p>防护对象组备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>防护对象组备注</p>
     * @param Remark <p>防护对象组备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>防护对象组中绑定的域名详情</p> 
     * @return Domains <p>防护对象组中绑定的域名详情</p>
     */
    public ProtectGroupDomainInfo [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>防护对象组中绑定的域名详情</p>
     * @param Domains <p>防护对象组中绑定的域名详情</p>
     */
    public void setDomains(ProtectGroupDomainInfo [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>关联的批量规则数</p> 
     * @return RuleNum <p>关联的批量规则数</p>
     */
    public Long getRuleNum() {
        return this.RuleNum;
    }

    /**
     * Set <p>关联的批量规则数</p>
     * @param RuleNum <p>关联的批量规则数</p>
     */
    public void setRuleNum(Long RuleNum) {
        this.RuleNum = RuleNum;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>标签信息</p> 
     * @return TagInfos <p>标签信息</p>
     */
    public TagInfo [] getTagInfos() {
        return this.TagInfos;
    }

    /**
     * Set <p>标签信息</p>
     * @param TagInfos <p>标签信息</p>
     */
    public void setTagInfos(TagInfo [] TagInfos) {
        this.TagInfos = TagInfos;
    }

    /**
     * Get <p>是否绑定了模板</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoundTemplate <p>是否绑定了模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBoundTemplate() {
        return this.BoundTemplate;
    }

    /**
     * Set <p>是否绑定了模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BoundTemplate <p>是否绑定了模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoundTemplate(Boolean BoundTemplate) {
        this.BoundTemplate = BoundTemplate;
    }

    public ProtectGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectGroupInfo(ProtectGroupInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Domains != null) {
            this.Domains = new ProtectGroupDomainInfo[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new ProtectGroupDomainInfo(source.Domains[i]);
            }
        }
        if (source.RuleNum != null) {
            this.RuleNum = new Long(source.RuleNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TagInfos != null) {
            this.TagInfos = new TagInfo[source.TagInfos.length];
            for (int i = 0; i < source.TagInfos.length; i++) {
                this.TagInfos[i] = new TagInfo(source.TagInfos[i]);
            }
        }
        if (source.BoundTemplate != null) {
            this.BoundTemplate = new Boolean(source.BoundTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "RuleNum", this.RuleNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "TagInfos.", this.TagInfos);
        this.setParamSimple(map, prefix + "BoundTemplate", this.BoundTemplate);

    }
}

