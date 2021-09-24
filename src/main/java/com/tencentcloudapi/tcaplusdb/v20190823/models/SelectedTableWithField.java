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
    * 待创建索引、缓写、数据订阅的字段列表
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
    * ckafka实例信息
    */
    @SerializedName("KafkaInfo")
    @Expose
    private KafkaInfo KafkaInfo;

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
     * Get 待创建索引、缓写、数据订阅的字段列表 
     * @return SelectedFields 待创建索引、缓写、数据订阅的字段列表
     */
    public FieldInfo [] getSelectedFields() {
        return this.SelectedFields;
    }

    /**
     * Set 待创建索引、缓写、数据订阅的字段列表
     * @param SelectedFields 待创建索引、缓写、数据订阅的字段列表
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
     * Get ckafka实例信息 
     * @return KafkaInfo ckafka实例信息
     */
    public KafkaInfo getKafkaInfo() {
        return this.KafkaInfo;
    }

    /**
     * Set ckafka实例信息
     * @param KafkaInfo ckafka实例信息
     */
    public void setKafkaInfo(KafkaInfo KafkaInfo) {
        this.KafkaInfo = KafkaInfo;
    }

    public SelectedTableWithField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SelectedTableWithField(SelectedTableWithField source) {
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableInstanceId != null) {
            this.TableInstanceId = new String(source.TableInstanceId);
        }
        if (source.TableIdlType != null) {
            this.TableIdlType = new String(source.TableIdlType);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.SelectedFields != null) {
            this.SelectedFields = new FieldInfo[source.SelectedFields.length];
            for (int i = 0; i < source.SelectedFields.length; i++) {
                this.SelectedFields[i] = new FieldInfo(source.SelectedFields[i]);
            }
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.KafkaInfo != null) {
            this.KafkaInfo = new KafkaInfo(source.KafkaInfo);
        }
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
        this.setParamObj(map, prefix + "KafkaInfo.", this.KafkaInfo);

    }
}

