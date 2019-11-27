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

public class SelectedTableInfo  extends AbstractModel{

    /**
    * 表所属大区ID
    */
    @SerializedName("LogicZoneId")
    @Expose
    private String LogicZoneId;

    /**
    * 表名称
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
    * 表描述语言类型：`PROTO`或`TDR`
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * 表数据结构类型：`GENERIC`或`LIST`
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * LIST表元素个数
    */
    @SerializedName("ListElementNum")
    @Expose
    private Long ListElementNum;

    /**
    * 表预留容量（GB）
    */
    @SerializedName("ReservedVolume")
    @Expose
    private Long ReservedVolume;

    /**
    * 表预留读QPS
    */
    @SerializedName("ReservedReadQps")
    @Expose
    private Long ReservedReadQps;

    /**
    * 表预留写QPS
    */
    @SerializedName("ReservedWriteQps")
    @Expose
    private Long ReservedWriteQps;

    /**
    * 表备注信息
    */
    @SerializedName("Memo")
    @Expose
    private String Memo;

    /**
    * Key回档文件名，回档专用
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Key回档文件扩展名，回档专用
    */
    @SerializedName("FileExtType")
    @Expose
    private String FileExtType;

    /**
    * Key回档文件大小，回档专用
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Key回档文件内容，回档专用
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
     * 获取表所属大区ID
     * @return LogicZoneId 表所属大区ID
     */
    public String getLogicZoneId() {
        return this.LogicZoneId;
    }

    /**
     * 设置表所属大区ID
     * @param LogicZoneId 表所属大区ID
     */
    public void setLogicZoneId(String LogicZoneId) {
        this.LogicZoneId = LogicZoneId;
    }

    /**
     * 获取表名称
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * 设置表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * 获取表实例ID
     * @return TableInstanceId 表实例ID
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * 设置表实例ID
     * @param TableInstanceId 表实例ID
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * 获取表描述语言类型：`PROTO`或`TDR`
     * @return TableIdlType 表描述语言类型：`PROTO`或`TDR`
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * 设置表描述语言类型：`PROTO`或`TDR`
     * @param TableIdlType 表描述语言类型：`PROTO`或`TDR`
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * 获取表数据结构类型：`GENERIC`或`LIST`
     * @return TableType 表数据结构类型：`GENERIC`或`LIST`
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * 设置表数据结构类型：`GENERIC`或`LIST`
     * @param TableType 表数据结构类型：`GENERIC`或`LIST`
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * 获取LIST表元素个数
     * @return ListElementNum LIST表元素个数
     */
    public Long getListElementNum() {
        return this.ListElementNum;
    }

    /**
     * 设置LIST表元素个数
     * @param ListElementNum LIST表元素个数
     */
    public void setListElementNum(Long ListElementNum) {
        this.ListElementNum = ListElementNum;
    }

    /**
     * 获取表预留容量（GB）
     * @return ReservedVolume 表预留容量（GB）
     */
    public Long getReservedVolume() {
        return this.ReservedVolume;
    }

    /**
     * 设置表预留容量（GB）
     * @param ReservedVolume 表预留容量（GB）
     */
    public void setReservedVolume(Long ReservedVolume) {
        this.ReservedVolume = ReservedVolume;
    }

    /**
     * 获取表预留读QPS
     * @return ReservedReadQps 表预留读QPS
     */
    public Long getReservedReadQps() {
        return this.ReservedReadQps;
    }

    /**
     * 设置表预留读QPS
     * @param ReservedReadQps 表预留读QPS
     */
    public void setReservedReadQps(Long ReservedReadQps) {
        this.ReservedReadQps = ReservedReadQps;
    }

    /**
     * 获取表预留写QPS
     * @return ReservedWriteQps 表预留写QPS
     */
    public Long getReservedWriteQps() {
        return this.ReservedWriteQps;
    }

    /**
     * 设置表预留写QPS
     * @param ReservedWriteQps 表预留写QPS
     */
    public void setReservedWriteQps(Long ReservedWriteQps) {
        this.ReservedWriteQps = ReservedWriteQps;
    }

    /**
     * 获取表备注信息
     * @return Memo 表备注信息
     */
    public String getMemo() {
        return this.Memo;
    }

    /**
     * 设置表备注信息
     * @param Memo 表备注信息
     */
    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    /**
     * 获取Key回档文件名，回档专用
     * @return FileName Key回档文件名，回档专用
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置Key回档文件名，回档专用
     * @param FileName Key回档文件名，回档专用
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取Key回档文件扩展名，回档专用
     * @return FileExtType Key回档文件扩展名，回档专用
     */
    public String getFileExtType() {
        return this.FileExtType;
    }

    /**
     * 设置Key回档文件扩展名，回档专用
     * @param FileExtType Key回档文件扩展名，回档专用
     */
    public void setFileExtType(String FileExtType) {
        this.FileExtType = FileExtType;
    }

    /**
     * 获取Key回档文件大小，回档专用
     * @return FileSize Key回档文件大小，回档专用
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * 设置Key回档文件大小，回档专用
     * @param FileSize Key回档文件大小，回档专用
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * 获取Key回档文件内容，回档专用
     * @return FileContent Key回档文件内容，回档专用
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * 设置Key回档文件内容，回档专用
     * @param FileContent Key回档文件内容，回档专用
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogicZoneId", this.LogicZoneId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "ListElementNum", this.ListElementNum);
        this.setParamSimple(map, prefix + "ReservedVolume", this.ReservedVolume);
        this.setParamSimple(map, prefix + "ReservedReadQps", this.ReservedReadQps);
        this.setParamSimple(map, prefix + "ReservedWriteQps", this.ReservedWriteQps);
        this.setParamSimple(map, prefix + "Memo", this.Memo);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileExtType", this.FileExtType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);

    }
}

