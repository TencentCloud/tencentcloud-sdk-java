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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataRetrievalTaskInfo extends AbstractModel {

    /**
    * <p>数据检索任务ID<br>示例值：dataretrievaltask-123456</p>
    */
    @SerializedName("DataRetrievalTaskID")
    @Expose
    private String DataRetrievalTaskID;

    /**
    * <p>迁移任务id<br>示例值：migrate-001</p>
    */
    @SerializedName("DataRetrievalId")
    @Expose
    private String DataRetrievalId;

    /**
    * <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取示例值：cfs-xxxxxx</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>聚合检索条件<br>示例值：from entries|where size &gt;4096</p>
    */
    @SerializedName("CompoundCondition")
    @Expose
    private String CompoundCondition;

    /**
    * <p>列表检索条件</p>
    */
    @SerializedName("QueryCondition")
    @Expose
    private String QueryCondition;

    /**
    * <p>创建时间<br>示例值：2023-01-09 15:03:57</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务状态<br>已完成：completed<br>排队中：waiting<br>进行中：running<br>失败：failed</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>文件数量<br>示例：1000</p>
    */
    @SerializedName("FileNum")
    @Expose
    private Long FileNum;

    /**
    * <p>目录数量<br>示例：1000</p>
    */
    @SerializedName("DirNum")
    @Expose
    private Long DirNum;

    /**
    * <p>总文件大小，单位KiB<br>示例：1024</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>文件清单下载地址<br>示例值：https://xx-12345.cos.ap-shanghai.myqcloud.com/list.csv</p>
    */
    @SerializedName("FileList")
    @Expose
    private String FileList;

    /**
    * <p>检索错误提示。默认：Null，当Status为failed时，将提示信息展示给用户。</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
     * Get <p>数据检索任务ID<br>示例值：dataretrievaltask-123456</p> 
     * @return DataRetrievalTaskID <p>数据检索任务ID<br>示例值：dataretrievaltask-123456</p>
     */
    public String getDataRetrievalTaskID() {
        return this.DataRetrievalTaskID;
    }

    /**
     * Set <p>数据检索任务ID<br>示例值：dataretrievaltask-123456</p>
     * @param DataRetrievalTaskID <p>数据检索任务ID<br>示例值：dataretrievaltask-123456</p>
     */
    public void setDataRetrievalTaskID(String DataRetrievalTaskID) {
        this.DataRetrievalTaskID = DataRetrievalTaskID;
    }

    /**
     * Get <p>迁移任务id<br>示例值：migrate-001</p> 
     * @return DataRetrievalId <p>迁移任务id<br>示例值：migrate-001</p>
     */
    public String getDataRetrievalId() {
        return this.DataRetrievalId;
    }

    /**
     * Set <p>迁移任务id<br>示例值：migrate-001</p>
     * @param DataRetrievalId <p>迁移任务id<br>示例值：migrate-001</p>
     */
    public void setDataRetrievalId(String DataRetrievalId) {
        this.DataRetrievalId = DataRetrievalId;
    }

    /**
     * Get <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取示例值：cfs-xxxxxx</p> 
     * @return FileSystemId <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取示例值：cfs-xxxxxx</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取示例值：cfs-xxxxxx</p>
     * @param FileSystemId <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取示例值：cfs-xxxxxx</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>聚合检索条件<br>示例值：from entries|where size &gt;4096</p> 
     * @return CompoundCondition <p>聚合检索条件<br>示例值：from entries|where size &gt;4096</p>
     */
    public String getCompoundCondition() {
        return this.CompoundCondition;
    }

    /**
     * Set <p>聚合检索条件<br>示例值：from entries|where size &gt;4096</p>
     * @param CompoundCondition <p>聚合检索条件<br>示例值：from entries|where size &gt;4096</p>
     */
    public void setCompoundCondition(String CompoundCondition) {
        this.CompoundCondition = CompoundCondition;
    }

    /**
     * Get <p>列表检索条件</p> 
     * @return QueryCondition <p>列表检索条件</p>
     */
    public String getQueryCondition() {
        return this.QueryCondition;
    }

    /**
     * Set <p>列表检索条件</p>
     * @param QueryCondition <p>列表检索条件</p>
     */
    public void setQueryCondition(String QueryCondition) {
        this.QueryCondition = QueryCondition;
    }

    /**
     * Get <p>创建时间<br>示例值：2023-01-09 15:03:57</p> 
     * @return CreateTime <p>创建时间<br>示例值：2023-01-09 15:03:57</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间<br>示例值：2023-01-09 15:03:57</p>
     * @param CreateTime <p>创建时间<br>示例值：2023-01-09 15:03:57</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务状态<br>已完成：completed<br>排队中：waiting<br>进行中：running<br>失败：failed</p> 
     * @return State <p>任务状态<br>已完成：completed<br>排队中：waiting<br>进行中：running<br>失败：failed</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>任务状态<br>已完成：completed<br>排队中：waiting<br>进行中：running<br>失败：failed</p>
     * @param State <p>任务状态<br>已完成：completed<br>排队中：waiting<br>进行中：running<br>失败：failed</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>文件数量<br>示例：1000</p> 
     * @return FileNum <p>文件数量<br>示例：1000</p>
     */
    public Long getFileNum() {
        return this.FileNum;
    }

    /**
     * Set <p>文件数量<br>示例：1000</p>
     * @param FileNum <p>文件数量<br>示例：1000</p>
     */
    public void setFileNum(Long FileNum) {
        this.FileNum = FileNum;
    }

    /**
     * Get <p>目录数量<br>示例：1000</p> 
     * @return DirNum <p>目录数量<br>示例：1000</p>
     */
    public Long getDirNum() {
        return this.DirNum;
    }

    /**
     * Set <p>目录数量<br>示例：1000</p>
     * @param DirNum <p>目录数量<br>示例：1000</p>
     */
    public void setDirNum(Long DirNum) {
        this.DirNum = DirNum;
    }

    /**
     * Get <p>总文件大小，单位KiB<br>示例：1024</p> 
     * @return Size <p>总文件大小，单位KiB<br>示例：1024</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>总文件大小，单位KiB<br>示例：1024</p>
     * @param Size <p>总文件大小，单位KiB<br>示例：1024</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>文件清单下载地址<br>示例值：https://xx-12345.cos.ap-shanghai.myqcloud.com/list.csv</p> 
     * @return FileList <p>文件清单下载地址<br>示例值：https://xx-12345.cos.ap-shanghai.myqcloud.com/list.csv</p>
     */
    public String getFileList() {
        return this.FileList;
    }

    /**
     * Set <p>文件清单下载地址<br>示例值：https://xx-12345.cos.ap-shanghai.myqcloud.com/list.csv</p>
     * @param FileList <p>文件清单下载地址<br>示例值：https://xx-12345.cos.ap-shanghai.myqcloud.com/list.csv</p>
     */
    public void setFileList(String FileList) {
        this.FileList = FileList;
    }

    /**
     * Get <p>检索错误提示。默认：Null，当Status为failed时，将提示信息展示给用户。</p> 
     * @return ErrorInfo <p>检索错误提示。默认：Null，当Status为failed时，将提示信息展示给用户。</p>
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>检索错误提示。默认：Null，当Status为failed时，将提示信息展示给用户。</p>
     * @param ErrorInfo <p>检索错误提示。默认：Null，当Status为failed时，将提示信息展示给用户。</p>
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    public DataRetrievalTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataRetrievalTaskInfo(DataRetrievalTaskInfo source) {
        if (source.DataRetrievalTaskID != null) {
            this.DataRetrievalTaskID = new String(source.DataRetrievalTaskID);
        }
        if (source.DataRetrievalId != null) {
            this.DataRetrievalId = new String(source.DataRetrievalId);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.CompoundCondition != null) {
            this.CompoundCondition = new String(source.CompoundCondition);
        }
        if (source.QueryCondition != null) {
            this.QueryCondition = new String(source.QueryCondition);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.FileNum != null) {
            this.FileNum = new Long(source.FileNum);
        }
        if (source.DirNum != null) {
            this.DirNum = new Long(source.DirNum);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.FileList != null) {
            this.FileList = new String(source.FileList);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataRetrievalTaskID", this.DataRetrievalTaskID);
        this.setParamSimple(map, prefix + "DataRetrievalId", this.DataRetrievalId);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "CompoundCondition", this.CompoundCondition);
        this.setParamSimple(map, prefix + "QueryCondition", this.QueryCondition);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "FileNum", this.FileNum);
        this.setParamSimple(map, prefix + "DirNum", this.DirNum);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "FileList", this.FileList);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);

    }
}

