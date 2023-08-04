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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAITaskResultRequest extends AbstractModel{

    /**
    * AI 任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 桶内文件的路径。
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * AI 任务识别类型。可选值为 Facemask(口罩识别)、Chefhat(厨师帽识别)、Smoking(抽烟检测)、Chefcloth(厨师服识别)、PhoneCall(接打电话识别)、Pet(宠物识别)、Body(人体识别)和 Car(车辆车牌识别)
    */
    @SerializedName("DetectType")
    @Expose
    private String DetectType;

    /**
    * 开始时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 页码。默认为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页 AI 识别结果数量。可选值1～100，默认为10（按时间倒序显示识别结果）
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get AI 任务 ID 
     * @return TaskId AI 任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set AI 任务 ID
     * @param TaskId AI 任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 通道ID 
     * @return ChannelId 通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID
     * @param ChannelId 通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 桶内文件的路径。 
     * @return Object 桶内文件的路径。
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set 桶内文件的路径。
     * @param Object 桶内文件的路径。
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get AI 任务识别类型。可选值为 Facemask(口罩识别)、Chefhat(厨师帽识别)、Smoking(抽烟检测)、Chefcloth(厨师服识别)、PhoneCall(接打电话识别)、Pet(宠物识别)、Body(人体识别)和 Car(车辆车牌识别) 
     * @return DetectType AI 任务识别类型。可选值为 Facemask(口罩识别)、Chefhat(厨师帽识别)、Smoking(抽烟检测)、Chefcloth(厨师服识别)、PhoneCall(接打电话识别)、Pet(宠物识别)、Body(人体识别)和 Car(车辆车牌识别)
     */
    public String getDetectType() {
        return this.DetectType;
    }

    /**
     * Set AI 任务识别类型。可选值为 Facemask(口罩识别)、Chefhat(厨师帽识别)、Smoking(抽烟检测)、Chefcloth(厨师服识别)、PhoneCall(接打电话识别)、Pet(宠物识别)、Body(人体识别)和 Car(车辆车牌识别)
     * @param DetectType AI 任务识别类型。可选值为 Facemask(口罩识别)、Chefhat(厨师帽识别)、Smoking(抽烟检测)、Chefcloth(厨师服识别)、PhoneCall(接打电话识别)、Pet(宠物识别)、Body(人体识别)和 Car(车辆车牌识别)
     */
    public void setDetectType(String DetectType) {
        this.DetectType = DetectType;
    }

    /**
     * Get 开始时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天 
     * @return BeginTime 开始时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天
     * @param BeginTime 开始时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天 
     * @return EndTime 结束时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天
     * @param EndTime 结束时间时间。秒级时间戳。开始时间和结束时间跨度小于等于30天
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 页码。默认为1 
     * @return PageNumber 页码。默认为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码。默认为1
     * @param PageNumber 页码。默认为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页 AI 识别结果数量。可选值1～100，默认为10（按时间倒序显示识别结果） 
     * @return PageSize 每页 AI 识别结果数量。可选值1～100，默认为10（按时间倒序显示识别结果）
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页 AI 识别结果数量。可选值1～100，默认为10（按时间倒序显示识别结果）
     * @param PageSize 每页 AI 识别结果数量。可选值1～100，默认为10（按时间倒序显示识别结果）
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeAITaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAITaskResultRequest(DescribeAITaskResultRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
        if (source.DetectType != null) {
            this.DetectType = new String(source.DetectType);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "DetectType", this.DetectType);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

