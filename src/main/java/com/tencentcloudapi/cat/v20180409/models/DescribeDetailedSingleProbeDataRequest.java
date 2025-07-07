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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDetailedSingleProbeDataRequest extends AbstractModel {

    /**
    * 开始时间戳（毫秒级）
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 结束时间戳（毫秒级）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 任务类型
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能
AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_MediaStream：音视频体验
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 待排序字段
可以填写 ProbeTime 拨测时间排序
也可填写SelectedFields 中的选中字段
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * true表示升序
    */
    @SerializedName("Ascending")
    @Expose
    private Boolean Ascending;

    /**
    * 选中字段，如ProbeTime、TransferTime、TransferSize等。
    */
    @SerializedName("SelectedFields")
    @Expose
    private String [] SelectedFields;

    /**
    * 起始取数位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 取数数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 任务ID
    */
    @SerializedName("TaskID")
    @Expose
    private String [] TaskID;

    /**
    * 拨测点运营商
	
这里实际按拨测结果中的运营商来填写即可

电信：中国电信
移动：中国移动
联通：中国联通
    */
    @SerializedName("Operators")
    @Expose
    private String [] Operators;

    /**
    * 拨测点地区
	
这里实际按拨测结果中的地区来填写即可

国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海

境外一般是国家名，如澳大利亚、新加坡
    */
    @SerializedName("Districts")
    @Expose
    private String [] Districts;

    /**
    * 错误类型
    */
    @SerializedName("ErrorTypes")
    @Expose
    private String [] ErrorTypes;

    /**
    * 城市
这里实际按拨测结果中的城市来填写即可

示例：

深圳市
武汉市
首尔
多伦多
    */
    @SerializedName("City")
    @Expose
    private String [] City;

    /**
    * es scroll查询id
    */
    @SerializedName("ScrollID")
    @Expose
    private String ScrollID;

    /**
    * 详情数据下载
    */
    @SerializedName("QueryFlag")
    @Expose
    private String QueryFlag;

    /**
     * Get 开始时间戳（毫秒级） 
     * @return BeginTime 开始时间戳（毫秒级）
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间戳（毫秒级）
     * @param BeginTime 开始时间戳（毫秒级）
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间戳（毫秒级） 
     * @return EndTime 结束时间戳（毫秒级）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳（毫秒级）
     * @param EndTime 结束时间戳（毫秒级）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务类型
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能
AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_MediaStream：音视频体验 
     * @return TaskType 任务类型
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能
AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_MediaStream：音视频体验
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能
AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_MediaStream：音视频体验
     * @param TaskType 任务类型
AnalyzeTaskType_Network：网络质量
AnalyzeTaskType_Browse：页面性能
AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）
AnalyzeTaskType_Transport：端口性能
AnalyzeTaskType_MediaStream：音视频体验
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 待排序字段
可以填写 ProbeTime 拨测时间排序
也可填写SelectedFields 中的选中字段 
     * @return SortField 待排序字段
可以填写 ProbeTime 拨测时间排序
也可填写SelectedFields 中的选中字段
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 待排序字段
可以填写 ProbeTime 拨测时间排序
也可填写SelectedFields 中的选中字段
     * @param SortField 待排序字段
可以填写 ProbeTime 拨测时间排序
也可填写SelectedFields 中的选中字段
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get true表示升序 
     * @return Ascending true表示升序
     */
    public Boolean getAscending() {
        return this.Ascending;
    }

    /**
     * Set true表示升序
     * @param Ascending true表示升序
     */
    public void setAscending(Boolean Ascending) {
        this.Ascending = Ascending;
    }

    /**
     * Get 选中字段，如ProbeTime、TransferTime、TransferSize等。 
     * @return SelectedFields 选中字段，如ProbeTime、TransferTime、TransferSize等。
     */
    public String [] getSelectedFields() {
        return this.SelectedFields;
    }

    /**
     * Set 选中字段，如ProbeTime、TransferTime、TransferSize等。
     * @param SelectedFields 选中字段，如ProbeTime、TransferTime、TransferSize等。
     */
    public void setSelectedFields(String [] SelectedFields) {
        this.SelectedFields = SelectedFields;
    }

    /**
     * Get 起始取数位置 
     * @return Offset 起始取数位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始取数位置
     * @param Offset 起始取数位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 取数数量 
     * @return Limit 取数数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 取数数量
     * @param Limit 取数数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 任务ID 
     * @return TaskID 任务ID
     */
    public String [] getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务ID
     * @param TaskID 任务ID
     */
    public void setTaskID(String [] TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 拨测点运营商
	
这里实际按拨测结果中的运营商来填写即可

电信：中国电信
移动：中国移动
联通：中国联通 
     * @return Operators 拨测点运营商
	
这里实际按拨测结果中的运营商来填写即可

电信：中国电信
移动：中国移动
联通：中国联通
     */
    public String [] getOperators() {
        return this.Operators;
    }

    /**
     * Set 拨测点运营商
	
这里实际按拨测结果中的运营商来填写即可

电信：中国电信
移动：中国移动
联通：中国联通
     * @param Operators 拨测点运营商
	
这里实际按拨测结果中的运营商来填写即可

电信：中国电信
移动：中国移动
联通：中国联通
     */
    public void setOperators(String [] Operators) {
        this.Operators = Operators;
    }

    /**
     * Get 拨测点地区
	
这里实际按拨测结果中的地区来填写即可

国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海

境外一般是国家名，如澳大利亚、新加坡 
     * @return Districts 拨测点地区
	
这里实际按拨测结果中的地区来填写即可

国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海

境外一般是国家名，如澳大利亚、新加坡
     */
    public String [] getDistricts() {
        return this.Districts;
    }

    /**
     * Set 拨测点地区
	
这里实际按拨测结果中的地区来填写即可

国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海

境外一般是国家名，如澳大利亚、新加坡
     * @param Districts 拨测点地区
	
这里实际按拨测结果中的地区来填写即可

国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海

境外一般是国家名，如澳大利亚、新加坡
     */
    public void setDistricts(String [] Districts) {
        this.Districts = Districts;
    }

    /**
     * Get 错误类型 
     * @return ErrorTypes 错误类型
     */
    public String [] getErrorTypes() {
        return this.ErrorTypes;
    }

    /**
     * Set 错误类型
     * @param ErrorTypes 错误类型
     */
    public void setErrorTypes(String [] ErrorTypes) {
        this.ErrorTypes = ErrorTypes;
    }

    /**
     * Get 城市
这里实际按拨测结果中的城市来填写即可

示例：

深圳市
武汉市
首尔
多伦多 
     * @return City 城市
这里实际按拨测结果中的城市来填写即可

示例：

深圳市
武汉市
首尔
多伦多
     */
    public String [] getCity() {
        return this.City;
    }

    /**
     * Set 城市
这里实际按拨测结果中的城市来填写即可

示例：

深圳市
武汉市
首尔
多伦多
     * @param City 城市
这里实际按拨测结果中的城市来填写即可

示例：

深圳市
武汉市
首尔
多伦多
     */
    public void setCity(String [] City) {
        this.City = City;
    }

    /**
     * Get es scroll查询id 
     * @return ScrollID es scroll查询id
     */
    public String getScrollID() {
        return this.ScrollID;
    }

    /**
     * Set es scroll查询id
     * @param ScrollID es scroll查询id
     */
    public void setScrollID(String ScrollID) {
        this.ScrollID = ScrollID;
    }

    /**
     * Get 详情数据下载 
     * @return QueryFlag 详情数据下载
     */
    public String getQueryFlag() {
        return this.QueryFlag;
    }

    /**
     * Set 详情数据下载
     * @param QueryFlag 详情数据下载
     */
    public void setQueryFlag(String QueryFlag) {
        this.QueryFlag = QueryFlag;
    }

    public DescribeDetailedSingleProbeDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDetailedSingleProbeDataRequest(DescribeDetailedSingleProbeDataRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.Ascending != null) {
            this.Ascending = new Boolean(source.Ascending);
        }
        if (source.SelectedFields != null) {
            this.SelectedFields = new String[source.SelectedFields.length];
            for (int i = 0; i < source.SelectedFields.length; i++) {
                this.SelectedFields[i] = new String(source.SelectedFields[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TaskID != null) {
            this.TaskID = new String[source.TaskID.length];
            for (int i = 0; i < source.TaskID.length; i++) {
                this.TaskID[i] = new String(source.TaskID[i]);
            }
        }
        if (source.Operators != null) {
            this.Operators = new String[source.Operators.length];
            for (int i = 0; i < source.Operators.length; i++) {
                this.Operators[i] = new String(source.Operators[i]);
            }
        }
        if (source.Districts != null) {
            this.Districts = new String[source.Districts.length];
            for (int i = 0; i < source.Districts.length; i++) {
                this.Districts[i] = new String(source.Districts[i]);
            }
        }
        if (source.ErrorTypes != null) {
            this.ErrorTypes = new String[source.ErrorTypes.length];
            for (int i = 0; i < source.ErrorTypes.length; i++) {
                this.ErrorTypes[i] = new String(source.ErrorTypes[i]);
            }
        }
        if (source.City != null) {
            this.City = new String[source.City.length];
            for (int i = 0; i < source.City.length; i++) {
                this.City[i] = new String(source.City[i]);
            }
        }
        if (source.ScrollID != null) {
            this.ScrollID = new String(source.ScrollID);
        }
        if (source.QueryFlag != null) {
            this.QueryFlag = new String(source.QueryFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "Ascending", this.Ascending);
        this.setParamArraySimple(map, prefix + "SelectedFields.", this.SelectedFields);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "TaskID.", this.TaskID);
        this.setParamArraySimple(map, prefix + "Operators.", this.Operators);
        this.setParamArraySimple(map, prefix + "Districts.", this.Districts);
        this.setParamArraySimple(map, prefix + "ErrorTypes.", this.ErrorTypes);
        this.setParamArraySimple(map, prefix + "City.", this.City);
        this.setParamSimple(map, prefix + "ScrollID", this.ScrollID);
        this.setParamSimple(map, prefix + "QueryFlag", this.QueryFlag);

    }
}

