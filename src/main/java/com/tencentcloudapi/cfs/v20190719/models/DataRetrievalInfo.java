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

public class DataRetrievalInfo extends AbstractModel {

    /**
    * <p>数据检索策略名称</p>
    */
    @SerializedName("DataRetrievalName")
    @Expose
    private String DataRetrievalName;

    /**
    * <p>迁移任务id<br>示例值：migrate-001</p>
    */
    @SerializedName("DataRetrievalId")
    @Expose
    private String DataRetrievalId;

    /**
    * <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems </p><p>获取示例值：cfs-xxxxxx</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>聚合检索条件</p>
    */
    @SerializedName("CompoundCondition")
    @Expose
    private String CompoundCondition;

    /**
    * <p>创建时间<br>示例值：2023-01-09 15:03:57</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一</p>
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一</p>
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * <p>重复时间点,0-23，小时</p>
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * <p>列表检索条件</p>
    */
    @SerializedName("QueryCondition")
    @Expose
    private String QueryCondition;

    /**
    * <p>修改时间</p><p>参数格式：2023-01-10 15:03:57</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>数据检索策略名称</p> 
     * @return DataRetrievalName <p>数据检索策略名称</p>
     */
    public String getDataRetrievalName() {
        return this.DataRetrievalName;
    }

    /**
     * Set <p>数据检索策略名称</p>
     * @param DataRetrievalName <p>数据检索策略名称</p>
     */
    public void setDataRetrievalName(String DataRetrievalName) {
        this.DataRetrievalName = DataRetrievalName;
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
     * Get <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems </p><p>获取示例值：cfs-xxxxxx</p> 
     * @return FileSystemId <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems </p><p>获取示例值：cfs-xxxxxx</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems </p><p>获取示例值：cfs-xxxxxx</p>
     * @param FileSystemId <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems </p><p>获取示例值：cfs-xxxxxx</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>聚合检索条件</p> 
     * @return CompoundCondition <p>聚合检索条件</p>
     */
    public String getCompoundCondition() {
        return this.CompoundCondition;
    }

    /**
     * Set <p>聚合检索条件</p>
     * @param CompoundCondition <p>聚合检索条件</p>
     */
    public void setCompoundCondition(String CompoundCondition) {
        this.CompoundCondition = CompoundCondition;
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
     * Get <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一</p> 
     * @return DayOfWeek <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一</p>
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一</p>
     * @param DayOfWeek <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一</p>
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一</p> 
     * @return DayOfMonth <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一</p>
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一</p>
     * @param DayOfMonth <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一</p>
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get <p>重复时间点,0-23，小时</p> 
     * @return Hour <p>重复时间点,0-23，小时</p>
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set <p>重复时间点,0-23，小时</p>
     * @param Hour <p>重复时间点,0-23，小时</p>
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
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
     * Get <p>修改时间</p><p>参数格式：2023-01-10 15:03:57</p> 
     * @return UpdateTime <p>修改时间</p><p>参数格式：2023-01-10 15:03:57</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间</p><p>参数格式：2023-01-10 15:03:57</p>
     * @param UpdateTime <p>修改时间</p><p>参数格式：2023-01-10 15:03:57</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DataRetrievalInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataRetrievalInfo(DataRetrievalInfo source) {
        if (source.DataRetrievalName != null) {
            this.DataRetrievalName = new String(source.DataRetrievalName);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new String(source.DayOfMonth);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.QueryCondition != null) {
            this.QueryCondition = new String(source.QueryCondition);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataRetrievalName", this.DataRetrievalName);
        this.setParamSimple(map, prefix + "DataRetrievalId", this.DataRetrievalId);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "CompoundCondition", this.CompoundCondition);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "QueryCondition", this.QueryCondition);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

