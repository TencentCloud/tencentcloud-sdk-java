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

public class CreateDataRetrievalRequest extends AbstractModel {

    /**
    * <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取 示例值：cfs-xxxxxx</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>数据检索名称 示例值：DataDive</p>
    */
    @SerializedName("DataRetrievalName")
    @Expose
    private String DataRetrievalName;

    /**
    * <p>聚合检索条件 示例值：from entries|where size &gt;4096</p>
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
    * <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一 示例值：1</p>
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一 示例值：2,3</p>
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * <p>重复时间点,0-23，小时 示例值：1,3,5</p>
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
     * Get <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取 示例值：cfs-xxxxxx</p> 
     * @return FileSystemId <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取 示例值：cfs-xxxxxx</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取 示例值：cfs-xxxxxx</p>
     * @param FileSystemId <p>文件系统实例 ID，通过查询文件系统 DescribeCfsFileSystems 获取 示例值：cfs-xxxxxx</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>数据检索名称 示例值：DataDive</p> 
     * @return DataRetrievalName <p>数据检索名称 示例值：DataDive</p>
     */
    public String getDataRetrievalName() {
        return this.DataRetrievalName;
    }

    /**
     * Set <p>数据检索名称 示例值：DataDive</p>
     * @param DataRetrievalName <p>数据检索名称 示例值：DataDive</p>
     */
    public void setDataRetrievalName(String DataRetrievalName) {
        this.DataRetrievalName = DataRetrievalName;
    }

    /**
     * Get <p>聚合检索条件 示例值：from entries|where size &gt;4096</p> 
     * @return CompoundCondition <p>聚合检索条件 示例值：from entries|where size &gt;4096</p>
     */
    public String getCompoundCondition() {
        return this.CompoundCondition;
    }

    /**
     * Set <p>聚合检索条件 示例值：from entries|where size &gt;4096</p>
     * @param CompoundCondition <p>聚合检索条件 示例值：from entries|where size &gt;4096</p>
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
     * Get <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一 示例值：1</p> 
     * @return DayOfMonth <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一 示例值：1</p>
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一 示例值：1</p>
     * @param DayOfMonth <p>数据检索按月重复，每月1-31号，选择一天，每月将在这一天自动创建快照；例如1 代表1号；与DayOfWeek二选一 示例值：1</p>
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一 示例值：2,3</p> 
     * @return DayOfWeek <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一 示例值：2,3</p>
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一 示例值：2,3</p>
     * @param DayOfWeek <p>数据检索重复日期，星期一到星期日。 1代表星期一、7代表星期天，与DayOfMonth，二选一 示例值：2,3</p>
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get <p>重复时间点,0-23，小时 示例值：1,3,5</p> 
     * @return Hour <p>重复时间点,0-23，小时 示例值：1,3,5</p>
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set <p>重复时间点,0-23，小时 示例值：1,3,5</p>
     * @param Hour <p>重复时间点,0-23，小时 示例值：1,3,5</p>
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    public CreateDataRetrievalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataRetrievalRequest(CreateDataRetrievalRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.DataRetrievalName != null) {
            this.DataRetrievalName = new String(source.DataRetrievalName);
        }
        if (source.CompoundCondition != null) {
            this.CompoundCondition = new String(source.CompoundCondition);
        }
        if (source.QueryCondition != null) {
            this.QueryCondition = new String(source.QueryCondition);
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new String(source.DayOfMonth);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "DataRetrievalName", this.DataRetrievalName);
        this.setParamSimple(map, prefix + "CompoundCondition", this.CompoundCondition);
        this.setParamSimple(map, prefix + "QueryCondition", this.QueryCondition);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "Hour", this.Hour);

    }
}

