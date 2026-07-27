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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRumLogExportV2Request extends AbstractModel {

    /**
    * <p>Name（string，必填）：导出任务名称标识，需要在使用API创建导出任务时填写。此字段为后续能力扩展预留，不在查询结果中返回。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>查询日志开始时间(必填)</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：https://cloud.tencent.com/document/product/248/87223</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * <p>查询日志结束时间(必填)</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>注意：这个字段必选，不能为空！选择要导出哪些字段的参数，对应日志的列，可查看文档：https://cloud.tencent.com/document/product/248/87223</p><p>枚举值：</p><ul><li>level： 日志类型</li><li>url： URL</li><li>ip： 用户终端IP</li><li>version： 版本</li></ul>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
     * Get <p>Name（string，必填）：导出任务名称标识，需要在使用API创建导出任务时填写。此字段为后续能力扩展预留，不在查询结果中返回。</p> 
     * @return Name <p>Name（string，必填）：导出任务名称标识，需要在使用API创建导出任务时填写。此字段为后续能力扩展预留，不在查询结果中返回。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name（string，必填）：导出任务名称标识，需要在使用API创建导出任务时填写。此字段为后续能力扩展预留，不在查询结果中返回。</p>
     * @param Name <p>Name（string，必填）：导出任务名称标识，需要在使用API创建导出任务时填写。此字段为后续能力扩展预留，不在查询结果中返回。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>查询日志开始时间(必填)</p> 
     * @return StartTime <p>查询日志开始时间(必填)</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询日志开始时间(必填)</p>
     * @param StartTime <p>查询日志开始时间(必填)</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：https://cloud.tencent.com/document/product/248/87223</p> 
     * @return Filter <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：https://cloud.tencent.com/document/product/248/87223</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：https://cloud.tencent.com/document/product/248/87223</p>
     * @param Filter <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：https://cloud.tencent.com/document/product/248/87223</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>查询日志结束时间(必填)</p> 
     * @return EndTime <p>查询日志结束时间(必填)</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询日志结束时间(必填)</p>
     * @param EndTime <p>查询日志结束时间(必填)</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ID <p>项目ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>项目ID</p>
     * @param ID <p>项目ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>注意：这个字段必选，不能为空！选择要导出哪些字段的参数，对应日志的列，可查看文档：https://cloud.tencent.com/document/product/248/87223</p><p>枚举值：</p><ul><li>level： 日志类型</li><li>url： URL</li><li>ip： 用户终端IP</li><li>version： 版本</li></ul> 
     * @return Fields <p>注意：这个字段必选，不能为空！选择要导出哪些字段的参数，对应日志的列，可查看文档：https://cloud.tencent.com/document/product/248/87223</p><p>枚举值：</p><ul><li>level： 日志类型</li><li>url： URL</li><li>ip： 用户终端IP</li><li>version： 版本</li></ul>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>注意：这个字段必选，不能为空！选择要导出哪些字段的参数，对应日志的列，可查看文档：https://cloud.tencent.com/document/product/248/87223</p><p>枚举值：</p><ul><li>level： 日志类型</li><li>url： URL</li><li>ip： 用户终端IP</li><li>version： 版本</li></ul>
     * @param Fields <p>注意：这个字段必选，不能为空！选择要导出哪些字段的参数，对应日志的列，可查看文档：https://cloud.tencent.com/document/product/248/87223</p><p>枚举值：</p><ul><li>level： 日志类型</li><li>url： URL</li><li>ip： 用户终端IP</li><li>version： 版本</li></ul>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    public DescribeRumLogExportV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumLogExportV2Request(DescribeRumLogExportV2Request source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);

    }
}

