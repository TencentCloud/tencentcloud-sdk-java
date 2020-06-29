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

public class SelectedTableWithField extends AbstractModel{

    /**
    * 表所属表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表格名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表实例ID
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 表格描述语言类型：`PROTO`或`TDR`
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * 表格数据结构类型：`GENERIC`或`LIST`
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 待创建索引的字段列表
    */
    @SerializedName("SelectedFields")
    @Expose
    private FieldInfo [] SelectedFields;

    /**
    * 索引分片数
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
     * Get 表所属表格组ID 
     * @return TableGroupId 表所属表格组ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表所属表格组ID
     * @param TableGroupId 表所属表格组ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表格名称 
     * @return TableName 表格名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名称
     * @param TableName 表格名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表实例ID 
     * @return TableInstanceId 表实例ID
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 表实例ID
     * @param TableInstanceId 表实例ID
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 表格描述语言类型：`PROTO`或`TDR` 
     * @return TableIdlType 表格描述语言类型：`PROTO`或`TDR`
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set 表格描述语言类型：`PROTO`或`TDR`
     * @param TableIdlType 表格描述语言类型：`PROTO`或`TDR`
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get 表格数据结构类型：`GENERIC`或`LIST` 
     * @return TableType 表格数据结构类型：`GENERIC`或`LIST`
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表格数据结构类型：`GENERIC`或`LIST`
     * @param TableType 表格数据结构类型：`GENERIC`或`LIST`
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 待创建索引的字段列表 
     * @return SelectedFields 待创建索引的字段列表
     */
    public FieldInfo [] getSelectedFields() {
        return this.SelectedFields;
    }

    /**
     * Set 待创建索引的字段列表
     * @param SelectedFields 待创建索引的字段列表
     */
    public void setSelectedFields(FieldInfo [] SelectedFields) {
        this.SelectedFields = SelectedFields;
    }

    /**
     * Get 索引分片数 
     * @return ShardNum 索引分片数
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 索引分片数
     * @param ShardNum 索引分片数
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamArrayObj(map, prefix + "SelectedFields.", this.SelectedFields);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);

    }
}

