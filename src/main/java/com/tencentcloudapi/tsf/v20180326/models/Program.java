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

public class Program extends AbstractModel{

    /**
    * 数据集ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * 数据集名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * 数据集描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramDesc")
    @Expose
    private String ProgramDesc;

    /**
    * 删除标识，true: 可以删除; false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

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
    * 数据项列表，无值时返回空数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramItemList")
    @Expose
    private ProgramItem [] ProgramItemList;

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

    /**
     * Get 数据集名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramName 数据集名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set 数据集名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramName 数据集名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get 数据集描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramDesc 数据集描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgramDesc() {
        return this.ProgramDesc;
    }

    /**
     * Set 数据集描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramDesc 数据集描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramDesc(String ProgramDesc) {
        this.ProgramDesc = ProgramDesc;
    }

    /**
     * Get 删除标识，true: 可以删除; false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteFlag 删除标识，true: 可以删除; false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set 删除标识，true: 可以删除; false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteFlag 删除标识，true: 可以删除; false: 不可删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
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
     * Get 数据项列表，无值时返回空数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramItemList 数据项列表，无值时返回空数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProgramItem [] getProgramItemList() {
        return this.ProgramItemList;
    }

    /**
     * Set 数据项列表，无值时返回空数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramItemList 数据项列表，无值时返回空数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramItemList(ProgramItem [] ProgramItemList) {
        this.ProgramItemList = ProgramItemList;
    }

    public Program() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Program(Program source) {
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
        if (source.ProgramDesc != null) {
            this.ProgramDesc = new String(source.ProgramDesc);
        }
        if (source.DeleteFlag != null) {
            this.DeleteFlag = new Boolean(source.DeleteFlag);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new Long(source.CreationTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.ProgramItemList != null) {
            this.ProgramItemList = new ProgramItem[source.ProgramItemList.length];
            for (int i = 0; i < source.ProgramItemList.length; i++) {
                this.ProgramItemList[i] = new ProgramItem(source.ProgramItemList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "ProgramDesc", this.ProgramDesc);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamArrayObj(map, prefix + "ProgramItemList.", this.ProgramItemList);

    }
}

