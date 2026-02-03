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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableMappingObject extends AbstractModel {

    /**
    * 源端实例Id
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 映射数据库名称
    */
    @SerializedName("MapDatabaseName")
    @Expose
    private String MapDatabaseName;

    /**
    * 映射表名
    */
    @SerializedName("MapTableName")
    @Expose
    private String MapTableName;

    /**
    * 同步状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 同步进度
    */
    @SerializedName("Process")
    @Expose
    private Float Process;

    /**
    * 延迟
    */
    @SerializedName("Lag")
    @Expose
    private Long Lag;

    /**
    * 消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 是否为主表
    */
    @SerializedName("IsPrimary")
    @Expose
    private Boolean IsPrimary;

    /**
    * 虚拟列填充值
    */
    @SerializedName("VirtualColValue")
    @Expose
    private String VirtualColValue;

    /**
     * Get 源端实例Id 
     * @return SrcInstanceId 源端实例Id
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set 源端实例Id
     * @param SrcInstanceId 源端实例Id
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get 数据库名称 
     * @return DatabaseName 数据库名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
     * @param DatabaseName 数据库名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表名 
     * @return TableName 表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
     * @param TableName 表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 映射数据库名称 
     * @return MapDatabaseName 映射数据库名称
     */
    public String getMapDatabaseName() {
        return this.MapDatabaseName;
    }

    /**
     * Set 映射数据库名称
     * @param MapDatabaseName 映射数据库名称
     */
    public void setMapDatabaseName(String MapDatabaseName) {
        this.MapDatabaseName = MapDatabaseName;
    }

    /**
     * Get 映射表名 
     * @return MapTableName 映射表名
     */
    public String getMapTableName() {
        return this.MapTableName;
    }

    /**
     * Set 映射表名
     * @param MapTableName 映射表名
     */
    public void setMapTableName(String MapTableName) {
        this.MapTableName = MapTableName;
    }

    /**
     * Get 同步状态 
     * @return Status 同步状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 同步状态
     * @param Status 同步状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 同步进度 
     * @return Process 同步进度
     */
    public Float getProcess() {
        return this.Process;
    }

    /**
     * Set 同步进度
     * @param Process 同步进度
     */
    public void setProcess(Float Process) {
        this.Process = Process;
    }

    /**
     * Get 延迟 
     * @return Lag 延迟
     */
    public Long getLag() {
        return this.Lag;
    }

    /**
     * Set 延迟
     * @param Lag 延迟
     */
    public void setLag(Long Lag) {
        this.Lag = Lag;
    }

    /**
     * Get 消息 
     * @return Message 消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 消息
     * @param Message 消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 是否为主表 
     * @return IsPrimary 是否为主表
     */
    public Boolean getIsPrimary() {
        return this.IsPrimary;
    }

    /**
     * Set 是否为主表
     * @param IsPrimary 是否为主表
     */
    public void setIsPrimary(Boolean IsPrimary) {
        this.IsPrimary = IsPrimary;
    }

    /**
     * Get 虚拟列填充值 
     * @return VirtualColValue 虚拟列填充值
     */
    public String getVirtualColValue() {
        return this.VirtualColValue;
    }

    /**
     * Set 虚拟列填充值
     * @param VirtualColValue 虚拟列填充值
     */
    public void setVirtualColValue(String VirtualColValue) {
        this.VirtualColValue = VirtualColValue;
    }

    public TableMappingObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableMappingObject(TableMappingObject source) {
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.MapDatabaseName != null) {
            this.MapDatabaseName = new String(source.MapDatabaseName);
        }
        if (source.MapTableName != null) {
            this.MapTableName = new String(source.MapTableName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Process != null) {
            this.Process = new Float(source.Process);
        }
        if (source.Lag != null) {
            this.Lag = new Long(source.Lag);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.IsPrimary != null) {
            this.IsPrimary = new Boolean(source.IsPrimary);
        }
        if (source.VirtualColValue != null) {
            this.VirtualColValue = new String(source.VirtualColValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "MapDatabaseName", this.MapDatabaseName);
        this.setParamSimple(map, prefix + "MapTableName", this.MapTableName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Process", this.Process);
        this.setParamSimple(map, prefix + "Lag", this.Lag);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "IsPrimary", this.IsPrimary);
        this.setParamSimple(map, prefix + "VirtualColValue", this.VirtualColValue);

    }
}

