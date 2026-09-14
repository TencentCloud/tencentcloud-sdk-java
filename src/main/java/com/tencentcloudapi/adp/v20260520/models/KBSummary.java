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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBSummary extends AbstractModel {

    /**
    * <p>关联的应用列表，仅共享知识库返回</p>
    */
    @SerializedName("AppList")
    @Expose
    private Identity [] AppList;

    /**
    * <p>创建时间（Unix 秒）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private Operator Creator;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>文档数</p>
    */
    @SerializedName("DocCount")
    @Expose
    private Long DocCount;

    /**
    * <p>是否超量</p>
    */
    @SerializedName("IsExceeded")
    @Expose
    private Boolean IsExceeded;

    /**
    * <p>知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>类型：1=默认知识库，2=共享知识库<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>默认知识库</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>共享知识库</td></tr></tbody></table></p>
    */
    @SerializedName("KbType")
    @Expose
    private Long KbType;

    /**
    * <p>最后操作人，仅共享知识库返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperator")
    @Expose
    private Operator LatestOperator;

    /**
    * <p>知识库名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>处理中状态列表</p>
    */
    @SerializedName("ProcessingFlagList")
    @Expose
    private Long [] ProcessingFlagList;

    /**
    * <p>共享子类型：1=普通，2=公众号<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>普通</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>公众号</td></tr></tbody></table></p>
    */
    @SerializedName("SharedSubType")
    @Expose
    private Long SharedSubType;

    /**
    * <p>更新时间（Unix 秒）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>关联的应用列表，仅共享知识库返回</p> 
     * @return AppList <p>关联的应用列表，仅共享知识库返回</p>
     */
    public Identity [] getAppList() {
        return this.AppList;
    }

    /**
     * Set <p>关联的应用列表，仅共享知识库返回</p>
     * @param AppList <p>关联的应用列表，仅共享知识库返回</p>
     */
    public void setAppList(Identity [] AppList) {
        this.AppList = AppList;
    }

    /**
     * Get <p>创建时间（Unix 秒）</p> 
     * @return CreateTime <p>创建时间（Unix 秒）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（Unix 秒）</p>
     * @param CreateTime <p>创建时间（Unix 秒）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Operator getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(Operator Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>文档数</p> 
     * @return DocCount <p>文档数</p>
     */
    public Long getDocCount() {
        return this.DocCount;
    }

    /**
     * Set <p>文档数</p>
     * @param DocCount <p>文档数</p>
     */
    public void setDocCount(Long DocCount) {
        this.DocCount = DocCount;
    }

    /**
     * Get <p>是否超量</p> 
     * @return IsExceeded <p>是否超量</p>
     */
    public Boolean getIsExceeded() {
        return this.IsExceeded;
    }

    /**
     * Set <p>是否超量</p>
     * @param IsExceeded <p>是否超量</p>
     */
    public void setIsExceeded(Boolean IsExceeded) {
        this.IsExceeded = IsExceeded;
    }

    /**
     * Get <p>知识库 ID</p> 
     * @return KbId <p>知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>知识库 ID</p>
     * @param KbId <p>知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>类型：1=默认知识库，2=共享知识库<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>默认知识库</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>共享知识库</td></tr></tbody></table></p> 
     * @return KbType <p>类型：1=默认知识库，2=共享知识库<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>默认知识库</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>共享知识库</td></tr></tbody></table></p>
     */
    public Long getKbType() {
        return this.KbType;
    }

    /**
     * Set <p>类型：1=默认知识库，2=共享知识库<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>默认知识库</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>共享知识库</td></tr></tbody></table></p>
     * @param KbType <p>类型：1=默认知识库，2=共享知识库<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_TYPE_DEFAULT</td><td>1</td><td>默认知识库</td></tr><tr><td>KB_TYPE_SHARED</td><td>2</td><td>共享知识库</td></tr></tbody></table></p>
     */
    public void setKbType(Long KbType) {
        this.KbType = KbType;
    }

    /**
     * Get <p>最后操作人，仅共享知识库返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperator <p>最后操作人，仅共享知识库返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Operator getLatestOperator() {
        return this.LatestOperator;
    }

    /**
     * Set <p>最后操作人，仅共享知识库返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperator <p>最后操作人，仅共享知识库返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperator(Operator LatestOperator) {
        this.LatestOperator = LatestOperator;
    }

    /**
     * Get <p>知识库名称</p> 
     * @return Name <p>知识库名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>知识库名称</p>
     * @param Name <p>知识库名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>处理中状态列表</p> 
     * @return ProcessingFlagList <p>处理中状态列表</p>
     */
    public Long [] getProcessingFlagList() {
        return this.ProcessingFlagList;
    }

    /**
     * Set <p>处理中状态列表</p>
     * @param ProcessingFlagList <p>处理中状态列表</p>
     */
    public void setProcessingFlagList(Long [] ProcessingFlagList) {
        this.ProcessingFlagList = ProcessingFlagList;
    }

    /**
     * Get <p>共享子类型：1=普通，2=公众号<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>普通</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>公众号</td></tr></tbody></table></p> 
     * @return SharedSubType <p>共享子类型：1=普通，2=公众号<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>普通</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>公众号</td></tr></tbody></table></p>
     */
    public Long getSharedSubType() {
        return this.SharedSubType;
    }

    /**
     * Set <p>共享子类型：1=普通，2=公众号<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>普通</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>公众号</td></tr></tbody></table></p>
     * @param SharedSubType <p>共享子类型：1=普通，2=公众号<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARED_KB_SUB_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SHARED_KB_SUB_TYPE_NORMAL</td><td>1</td><td>普通</td></tr><tr><td>SHARED_KB_SUB_TYPE_PUBLIC_ACCOUNT</td><td>2</td><td>公众号</td></tr></tbody></table></p>
     */
    public void setSharedSubType(Long SharedSubType) {
        this.SharedSubType = SharedSubType;
    }

    /**
     * Get <p>更新时间（Unix 秒）</p> 
     * @return UpdateTime <p>更新时间（Unix 秒）</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（Unix 秒）</p>
     * @param UpdateTime <p>更新时间（Unix 秒）</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public KBSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBSummary(KBSummary source) {
        if (source.AppList != null) {
            this.AppList = new Identity[source.AppList.length];
            for (int i = 0; i < source.AppList.length; i++) {
                this.AppList[i] = new Identity(source.AppList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new Operator(source.Creator);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DocCount != null) {
            this.DocCount = new Long(source.DocCount);
        }
        if (source.IsExceeded != null) {
            this.IsExceeded = new Boolean(source.IsExceeded);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.KbType != null) {
            this.KbType = new Long(source.KbType);
        }
        if (source.LatestOperator != null) {
            this.LatestOperator = new Operator(source.LatestOperator);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProcessingFlagList != null) {
            this.ProcessingFlagList = new Long[source.ProcessingFlagList.length];
            for (int i = 0; i < source.ProcessingFlagList.length; i++) {
                this.ProcessingFlagList[i] = new Long(source.ProcessingFlagList[i]);
            }
        }
        if (source.SharedSubType != null) {
            this.SharedSubType = new Long(source.SharedSubType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AppList.", this.AppList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DocCount", this.DocCount);
        this.setParamSimple(map, prefix + "IsExceeded", this.IsExceeded);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "KbType", this.KbType);
        this.setParamObj(map, prefix + "LatestOperator.", this.LatestOperator);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "ProcessingFlagList.", this.ProcessingFlagList);
        this.setParamSimple(map, prefix + "SharedSubType", this.SharedSubType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

