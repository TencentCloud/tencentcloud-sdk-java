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
    * <p>开始时间戳（毫秒级）</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * <p>结束时间戳（毫秒级）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>任务类型<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_MediaStream：音视频体验</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>待排序字段<br>可以填写 ProbeTime 拨测时间排序<br>也可填写SelectedFields 中的选中字段</p>
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * <p>true表示升序</p>
    */
    @SerializedName("Ascending")
    @Expose
    private Boolean Ascending;

    /**
    * <p>选中字段，如ProbeTime、TransferTime、TransferSize等。</p>
    */
    @SerializedName("SelectedFields")
    @Expose
    private String [] SelectedFields;

    /**
    * <p>起始取数位置</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>取数数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskID")
    @Expose
    private String [] TaskID;

    /**
    * <p>拨测点运营商</p><p>这里实际按拨测结果中的运营商来填写即可</p><p>电信：中国电信<br>移动：中国移动<br>联通：中国联通</p>
    */
    @SerializedName("Operators")
    @Expose
    private String [] Operators;

    /**
    * <p>拨测点地区</p><p>这里实际按拨测结果中的地区来填写即可</p><p>国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海</p><p>境外一般是国家名，如澳大利亚、新加坡</p>
    */
    @SerializedName("Districts")
    @Expose
    private String [] Districts;

    /**
    * <p>错误类型</p>
    */
    @SerializedName("ErrorTypes")
    @Expose
    private String [] ErrorTypes;

    /**
    * <p>城市<br>这里实际按拨测结果中的城市来填写即可</p><p>示例：</p><p>深圳市<br>武汉市<br>首尔<br>多伦多</p>
    */
    @SerializedName("City")
    @Expose
    private String [] City;

    /**
    * <p>es scroll查询id</p>
    */
    @SerializedName("ScrollID")
    @Expose
    private String ScrollID;

    /**
    * <p>详情数据下载</p>
    */
    @SerializedName("QueryFlag")
    @Expose
    private String QueryFlag;

    /**
     * Get <p>开始时间戳（毫秒级）</p> 
     * @return BeginTime <p>开始时间戳（毫秒级）</p>
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>开始时间戳（毫秒级）</p>
     * @param BeginTime <p>开始时间戳（毫秒级）</p>
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>结束时间戳（毫秒级）</p> 
     * @return EndTime <p>结束时间戳（毫秒级）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间戳（毫秒级）</p>
     * @param EndTime <p>结束时间戳（毫秒级）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>任务类型<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_MediaStream：音视频体验</p> 
     * @return TaskType <p>任务类型<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_MediaStream：音视频体验</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_MediaStream：音视频体验</p>
     * @param TaskType <p>任务类型<br>AnalyzeTaskType_Network：网络质量<br>AnalyzeTaskType_Browse：页面性能<br>AnalyzeTaskType_UploadDownload：文件传输（含文件上传、文件下载）<br>AnalyzeTaskType_Transport：端口性能<br>AnalyzeTaskType_MediaStream：音视频体验</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>待排序字段<br>可以填写 ProbeTime 拨测时间排序<br>也可填写SelectedFields 中的选中字段</p> 
     * @return SortField <p>待排序字段<br>可以填写 ProbeTime 拨测时间排序<br>也可填写SelectedFields 中的选中字段</p>
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set <p>待排序字段<br>可以填写 ProbeTime 拨测时间排序<br>也可填写SelectedFields 中的选中字段</p>
     * @param SortField <p>待排序字段<br>可以填写 ProbeTime 拨测时间排序<br>也可填写SelectedFields 中的选中字段</p>
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get <p>true表示升序</p> 
     * @return Ascending <p>true表示升序</p>
     */
    public Boolean getAscending() {
        return this.Ascending;
    }

    /**
     * Set <p>true表示升序</p>
     * @param Ascending <p>true表示升序</p>
     */
    public void setAscending(Boolean Ascending) {
        this.Ascending = Ascending;
    }

    /**
     * Get <p>选中字段，如ProbeTime、TransferTime、TransferSize等。</p> 
     * @return SelectedFields <p>选中字段，如ProbeTime、TransferTime、TransferSize等。</p>
     */
    public String [] getSelectedFields() {
        return this.SelectedFields;
    }

    /**
     * Set <p>选中字段，如ProbeTime、TransferTime、TransferSize等。</p>
     * @param SelectedFields <p>选中字段，如ProbeTime、TransferTime、TransferSize等。</p>
     */
    public void setSelectedFields(String [] SelectedFields) {
        this.SelectedFields = SelectedFields;
    }

    /**
     * Get <p>起始取数位置</p> 
     * @return Offset <p>起始取数位置</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>起始取数位置</p>
     * @param Offset <p>起始取数位置</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>取数数量</p> 
     * @return Limit <p>取数数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>取数数量</p>
     * @param Limit <p>取数数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>任务ID</p> 
     * @return TaskID <p>任务ID</p>
     */
    public String [] getTaskID() {
        return this.TaskID;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskID <p>任务ID</p>
     */
    public void setTaskID(String [] TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get <p>拨测点运营商</p><p>这里实际按拨测结果中的运营商来填写即可</p><p>电信：中国电信<br>移动：中国移动<br>联通：中国联通</p> 
     * @return Operators <p>拨测点运营商</p><p>这里实际按拨测结果中的运营商来填写即可</p><p>电信：中国电信<br>移动：中国移动<br>联通：中国联通</p>
     */
    public String [] getOperators() {
        return this.Operators;
    }

    /**
     * Set <p>拨测点运营商</p><p>这里实际按拨测结果中的运营商来填写即可</p><p>电信：中国电信<br>移动：中国移动<br>联通：中国联通</p>
     * @param Operators <p>拨测点运营商</p><p>这里实际按拨测结果中的运营商来填写即可</p><p>电信：中国电信<br>移动：中国移动<br>联通：中国联通</p>
     */
    public void setOperators(String [] Operators) {
        this.Operators = Operators;
    }

    /**
     * Get <p>拨测点地区</p><p>这里实际按拨测结果中的地区来填写即可</p><p>国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海</p><p>境外一般是国家名，如澳大利亚、新加坡</p> 
     * @return Districts <p>拨测点地区</p><p>这里实际按拨测结果中的地区来填写即可</p><p>国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海</p><p>境外一般是国家名，如澳大利亚、新加坡</p>
     */
    public String [] getDistricts() {
        return this.Districts;
    }

    /**
     * Set <p>拨测点地区</p><p>这里实际按拨测结果中的地区来填写即可</p><p>国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海</p><p>境外一般是国家名，如澳大利亚、新加坡</p>
     * @param Districts <p>拨测点地区</p><p>这里实际按拨测结果中的地区来填写即可</p><p>国内一般是省级单位，如广东、广西、中国香港；直辖市则填北京、上海</p><p>境外一般是国家名，如澳大利亚、新加坡</p>
     */
    public void setDistricts(String [] Districts) {
        this.Districts = Districts;
    }

    /**
     * Get <p>错误类型</p> 
     * @return ErrorTypes <p>错误类型</p>
     */
    public String [] getErrorTypes() {
        return this.ErrorTypes;
    }

    /**
     * Set <p>错误类型</p>
     * @param ErrorTypes <p>错误类型</p>
     */
    public void setErrorTypes(String [] ErrorTypes) {
        this.ErrorTypes = ErrorTypes;
    }

    /**
     * Get <p>城市<br>这里实际按拨测结果中的城市来填写即可</p><p>示例：</p><p>深圳市<br>武汉市<br>首尔<br>多伦多</p> 
     * @return City <p>城市<br>这里实际按拨测结果中的城市来填写即可</p><p>示例：</p><p>深圳市<br>武汉市<br>首尔<br>多伦多</p>
     */
    public String [] getCity() {
        return this.City;
    }

    /**
     * Set <p>城市<br>这里实际按拨测结果中的城市来填写即可</p><p>示例：</p><p>深圳市<br>武汉市<br>首尔<br>多伦多</p>
     * @param City <p>城市<br>这里实际按拨测结果中的城市来填写即可</p><p>示例：</p><p>深圳市<br>武汉市<br>首尔<br>多伦多</p>
     */
    public void setCity(String [] City) {
        this.City = City;
    }

    /**
     * Get <p>es scroll查询id</p> 
     * @return ScrollID <p>es scroll查询id</p>
     */
    public String getScrollID() {
        return this.ScrollID;
    }

    /**
     * Set <p>es scroll查询id</p>
     * @param ScrollID <p>es scroll查询id</p>
     */
    public void setScrollID(String ScrollID) {
        this.ScrollID = ScrollID;
    }

    /**
     * Get <p>详情数据下载</p> 
     * @return QueryFlag <p>详情数据下载</p>
     */
    public String getQueryFlag() {
        return this.QueryFlag;
    }

    /**
     * Set <p>详情数据下载</p>
     * @param QueryFlag <p>详情数据下载</p>
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

