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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushTask extends AbstractModel{

    /**
    * 预热任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 预热 URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 预热任务状态
fail：预热失败
done：预热成功
process：预热中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 预热进度百分比
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 预热任务提交时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 预热区域
mainland：境内
overseas：境外
global：全球
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 预热任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 预热任务 ID 
     * @return TaskId 预热任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 预热任务 ID
     * @param TaskId 预热任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 预热 URL 
     * @return Url 预热 URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 预热 URL
     * @param Url 预热 URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 预热任务状态
fail：预热失败
done：预热成功
process：预热中 
     * @return Status 预热任务状态
fail：预热失败
done：预热成功
process：预热中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 预热任务状态
fail：预热失败
done：预热成功
process：预热中
     * @param Status 预热任务状态
fail：预热失败
done：预热成功
process：预热中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 预热进度百分比 
     * @return Percent 预热进度百分比
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 预热进度百分比
     * @param Percent 预热进度百分比
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 预热任务提交时间 
     * @return CreateTime 预热任务提交时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 预热任务提交时间
     * @param CreateTime 预热任务提交时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 预热区域
mainland：境内
overseas：境外
global：全球 
     * @return Area 预热区域
mainland：境内
overseas：境外
global：全球
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 预热区域
mainland：境内
overseas：境外
global：全球
     * @param Area 预热区域
mainland：境内
overseas：境外
global：全球
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 预热任务更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 预热任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 预热任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 预热任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

