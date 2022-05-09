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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProgramItem extends AbstractModel{

    /**
    * 数据项ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramItemId")
    @Expose
    private String ProgramItemId;

    /**
    * 资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * 数据值列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueList")
    @Expose
    private String [] ValueList;

    /**
    * 全选标识，true: 全选；false: 非全选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private Long CreationTime;

    /**
    * 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * 删除标识，true: 可删除；false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

    /**
    * 数据集ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
     * Get 数据项ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramItemId 数据项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgramItemId() {
        return this.ProgramItemId;
    }

    /**
     * Set 数据项ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramItemId 数据项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramItemId(String ProgramItemId) {
        this.ProgramItemId = ProgramItemId;
    }

    /**
     * Get 资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set 资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 数据值列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueList 数据值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set 数据值列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueList 数据值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueList(String [] ValueList) {
        this.ValueList = ValueList;
    }

    /**
     * Get 全选标识，true: 全选；false: 非全选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAll 全选标识，true: 全选；false: 非全选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set 全选标识，true: 全选；false: 非全选
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAll 全选标识，true: 全选；false: 非全选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(Long CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 删除标识，true: 可删除；false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteFlag 删除标识，true: 可删除；false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set 删除标识，true: 可删除；false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteFlag 删除标识，true: 可删除；false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * Get 数据集ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramId 数据集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set 数据集ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramId 数据集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    public ProgramItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramItem(ProgramItem source) {
        if (source.ProgramItemId != null) {
            this.ProgramItemId = new String(source.ProgramItemId);
        }
        if (source.Resource != null) {
            this.Resource = new Resource(source.Resource);
        }
        if (source.ValueList != null) {
            this.ValueList = new String[source.ValueList.length];
            for (int i = 0; i < source.ValueList.length; i++) {
                this.ValueList[i] = new String(source.ValueList[i]);
            }
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new Long(source.CreationTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.DeleteFlag != null) {
            this.DeleteFlag = new Boolean(source.DeleteFlag);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramItemId", this.ProgramItemId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArraySimple(map, prefix + "ValueList.", this.ValueList);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);

    }
}

