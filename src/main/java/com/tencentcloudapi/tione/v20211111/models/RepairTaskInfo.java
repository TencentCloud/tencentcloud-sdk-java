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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepairTaskInfo extends AbstractModel {

    /**
    * <p>维修任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务类型ID<br>// - <code>101</code>：实例运行隐患<br>    // - <code>102</code>：实例运行异常<br>    // - <code>103</code>：实例硬盘异常<br>    // - <code>104</code>：实例网络连接异常<br>    // - <code>105</code>：实例运行预警<br>    // - <code>106</code>：实例硬盘预警<br>    // - <code>107</code>：实例维护升级</p>
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * <p>任务类型中文名</p>
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务详情</p>
    */
    @SerializedName("TaskDetail")
    @Expose
    private String TaskDetail;

    /**
    * <p>产品类型，支持取值：<br>    //<br>    // - <code>CVM</code>：云服务器<br>    // - <code>CDH</code>：专用宿主机<br>    // - <code>CPM2.0</code>：裸金属云服务器</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>维修任务ID</p> 
     * @return TaskId <p>维修任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>维修任务ID</p>
     * @param TaskId <p>维修任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务类型ID<br>// - <code>101</code>：实例运行隐患<br>    // - <code>102</code>：实例运行异常<br>    // - <code>103</code>：实例硬盘异常<br>    // - <code>104</code>：实例网络连接异常<br>    // - <code>105</code>：实例运行预警<br>    // - <code>106</code>：实例硬盘预警<br>    // - <code>107</code>：实例维护升级</p> 
     * @return TaskTypeId <p>任务类型ID<br>// - <code>101</code>：实例运行隐患<br>    // - <code>102</code>：实例运行异常<br>    // - <code>103</code>：实例硬盘异常<br>    // - <code>104</code>：实例网络连接异常<br>    // - <code>105</code>：实例运行预警<br>    // - <code>106</code>：实例硬盘预警<br>    // - <code>107</code>：实例维护升级</p>
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set <p>任务类型ID<br>// - <code>101</code>：实例运行隐患<br>    // - <code>102</code>：实例运行异常<br>    // - <code>103</code>：实例硬盘异常<br>    // - <code>104</code>：实例网络连接异常<br>    // - <code>105</code>：实例运行预警<br>    // - <code>106</code>：实例硬盘预警<br>    // - <code>107</code>：实例维护升级</p>
     * @param TaskTypeId <p>任务类型ID<br>// - <code>101</code>：实例运行隐患<br>    // - <code>102</code>：实例运行异常<br>    // - <code>103</code>：实例硬盘异常<br>    // - <code>104</code>：实例网络连接异常<br>    // - <code>105</code>：实例运行预警<br>    // - <code>106</code>：实例硬盘预警<br>    // - <code>107</code>：实例维护升级</p>
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get <p>任务类型中文名</p> 
     * @return TaskTypeName <p>任务类型中文名</p>
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set <p>任务类型中文名</p>
     * @param TaskTypeName <p>任务类型中文名</p>
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreateTime <p>任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreateTime <p>任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务详情</p> 
     * @return TaskDetail <p>任务详情</p>
     */
    public String getTaskDetail() {
        return this.TaskDetail;
    }

    /**
     * Set <p>任务详情</p>
     * @param TaskDetail <p>任务详情</p>
     */
    public void setTaskDetail(String TaskDetail) {
        this.TaskDetail = TaskDetail;
    }

    /**
     * Get <p>产品类型，支持取值：<br>    //<br>    // - <code>CVM</code>：云服务器<br>    // - <code>CDH</code>：专用宿主机<br>    // - <code>CPM2.0</code>：裸金属云服务器</p> 
     * @return Product <p>产品类型，支持取值：<br>    //<br>    // - <code>CVM</code>：云服务器<br>    // - <code>CDH</code>：专用宿主机<br>    // - <code>CPM2.0</code>：裸金属云服务器</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品类型，支持取值：<br>    //<br>    // - <code>CVM</code>：云服务器<br>    // - <code>CDH</code>：专用宿主机<br>    // - <code>CPM2.0</code>：裸金属云服务器</p>
     * @param Product <p>产品类型，支持取值：<br>    //<br>    // - <code>CVM</code>：云服务器<br>    // - <code>CDH</code>：专用宿主机<br>    // - <code>CPM2.0</code>：裸金属云服务器</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public RepairTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepairTaskInfo(RepairTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeName != null) {
            this.TaskTypeName = new String(source.TaskTypeName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TaskDetail != null) {
            this.TaskDetail = new String(source.TaskDetail);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeName", this.TaskTypeName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TaskDetail", this.TaskDetail);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

