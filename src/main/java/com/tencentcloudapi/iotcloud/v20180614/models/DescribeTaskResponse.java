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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskResponse  extends AbstractModel{

    /**
    * 任务类型，目前取值为 “UpdateShadow” 或者 “PublishMessage”
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 任务 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 状态。1表示等待处理，2表示调度处理中，3表示已完成，4表示失败，5表示已取消
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 任务创建时间，Unix 时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Integer CreateTime;

    /**
    * 最后任务更新时间，Unix 时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Integer UpdateTime;

    /**
    * 任务完成时间，Unix 时间戳
    */
    @SerializedName("DoneTime")
    @Expose
    private Integer DoneTime;

    /**
    * 被调度时间，Unix 时间戳
    */
    @SerializedName("ScheduleTime")
    @Expose
    private Integer ScheduleTime;

    /**
    * 返回的错误码
    */
    @SerializedName("RetCode")
    @Expose
    private Integer RetCode;

    /**
    * 返回的错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 完成任务的设备比例
    */
    @SerializedName("Percent")
    @Expose
    private Integer Percent;

    /**
    * 匹配到的需执行任务的设备数目
    */
    @SerializedName("AllDeviceCnt")
    @Expose
    private Integer AllDeviceCnt;

    /**
    * 已完成任务的设备数目
    */
    @SerializedName("DoneDeviceCnt")
    @Expose
    private Integer DoneDeviceCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务类型，目前取值为 “UpdateShadow” 或者 “PublishMessage”
     * @return Type 任务类型，目前取值为 “UpdateShadow” 或者 “PublishMessage”
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置任务类型，目前取值为 “UpdateShadow” 或者 “PublishMessage”
     * @param Type 任务类型，目前取值为 “UpdateShadow” 或者 “PublishMessage”
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取任务 ID
     * @return Id 任务 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置任务 ID
     * @param Id 任务 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取产品 ID
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品 ID
     * @param ProductId 产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取状态。1表示等待处理，2表示调度处理中，3表示已完成，4表示失败，5表示已取消
     * @return Status 状态。1表示等待处理，2表示调度处理中，3表示已完成，4表示失败，5表示已取消
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态。1表示等待处理，2表示调度处理中，3表示已完成，4表示失败，5表示已取消
     * @param Status 状态。1表示等待处理，2表示调度处理中，3表示已完成，4表示失败，5表示已取消
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取任务创建时间，Unix 时间戳
     * @return CreateTime 任务创建时间，Unix 时间戳
     */
    public Integer getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置任务创建时间，Unix 时间戳
     * @param CreateTime 任务创建时间，Unix 时间戳
     */
    public void setCreateTime(Integer CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取最后任务更新时间，Unix 时间戳
     * @return UpdateTime 最后任务更新时间，Unix 时间戳
     */
    public Integer getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置最后任务更新时间，Unix 时间戳
     * @param UpdateTime 最后任务更新时间，Unix 时间戳
     */
    public void setUpdateTime(Integer UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取任务完成时间，Unix 时间戳
     * @return DoneTime 任务完成时间，Unix 时间戳
     */
    public Integer getDoneTime() {
        return this.DoneTime;
    }

    /**
     * 设置任务完成时间，Unix 时间戳
     * @param DoneTime 任务完成时间，Unix 时间戳
     */
    public void setDoneTime(Integer DoneTime) {
        this.DoneTime = DoneTime;
    }

    /**
     * 获取被调度时间，Unix 时间戳
     * @return ScheduleTime 被调度时间，Unix 时间戳
     */
    public Integer getScheduleTime() {
        return this.ScheduleTime;
    }

    /**
     * 设置被调度时间，Unix 时间戳
     * @param ScheduleTime 被调度时间，Unix 时间戳
     */
    public void setScheduleTime(Integer ScheduleTime) {
        this.ScheduleTime = ScheduleTime;
    }

    /**
     * 获取返回的错误码
     * @return RetCode 返回的错误码
     */
    public Integer getRetCode() {
        return this.RetCode;
    }

    /**
     * 设置返回的错误码
     * @param RetCode 返回的错误码
     */
    public void setRetCode(Integer RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * 获取返回的错误信息
     * @return ErrMsg 返回的错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * 设置返回的错误信息
     * @param ErrMsg 返回的错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * 获取完成任务的设备比例
     * @return Percent 完成任务的设备比例
     */
    public Integer getPercent() {
        return this.Percent;
    }

    /**
     * 设置完成任务的设备比例
     * @param Percent 完成任务的设备比例
     */
    public void setPercent(Integer Percent) {
        this.Percent = Percent;
    }

    /**
     * 获取匹配到的需执行任务的设备数目
     * @return AllDeviceCnt 匹配到的需执行任务的设备数目
     */
    public Integer getAllDeviceCnt() {
        return this.AllDeviceCnt;
    }

    /**
     * 设置匹配到的需执行任务的设备数目
     * @param AllDeviceCnt 匹配到的需执行任务的设备数目
     */
    public void setAllDeviceCnt(Integer AllDeviceCnt) {
        this.AllDeviceCnt = AllDeviceCnt;
    }

    /**
     * 获取已完成任务的设备数目
     * @return DoneDeviceCnt 已完成任务的设备数目
     */
    public Integer getDoneDeviceCnt() {
        return this.DoneDeviceCnt;
    }

    /**
     * 设置已完成任务的设备数目
     * @param DoneDeviceCnt 已完成任务的设备数目
     */
    public void setDoneDeviceCnt(Integer DoneDeviceCnt) {
        this.DoneDeviceCnt = DoneDeviceCnt;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DoneTime", this.DoneTime);
        this.setParamSimple(map, prefix + "ScheduleTime", this.ScheduleTime);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "AllDeviceCnt", this.AllDeviceCnt);
        this.setParamSimple(map, prefix + "DoneDeviceCnt", this.DoneDeviceCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

