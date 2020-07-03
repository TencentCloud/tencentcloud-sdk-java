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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagsInfoOfTable extends AbstractModel{

    /**
    * 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 表格名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表格组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfoUnit [] Tags;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
     * Get 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableInstanceId 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableInstanceId 表格实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 表格名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表格组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGroupId 表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGroupId 表格组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfoUnit [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagInfoUnit [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Error.", this.Error);

    }
}

