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

public class TaskInfo extends AbstractModel{

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
    private Long Status;

    /**
    * 任务创建时间，Unix 时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 最后任务更新时间，Unix 时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 返回的错误码
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
    * 返回的错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get 任务类型，目前取值为 “UpdateShadow” 或者 “PublishMessage” 
     * @return Type 任务类型，目前取值为 “UpdateShadow” 或者 “PublishMessage”
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型，目前取值为 “UpdateShadow” 或者 “PublishMessage”
     * @param Type 任务类型，目前取值为 “UpdateShadow” 或者 “PublishMessage”
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 任务 ID 
     * @return Id 任务 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 任务 ID
     * @param Id 任务 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 产品 ID 
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID
     * @param ProductId 产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 状态。1表示等待处理，2表示调度处理中，3表示已完成，4表示失败，5表示已取消 
     * @return Status 状态。1表示等待处理，2表示调度处理中，3表示已完成，4表示失败，5表示已取消
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。1表示等待处理，2表示调度处理中，3表示已完成，4表示失败，5表示已取消
     * @param Status 状态。1表示等待处理，2表示调度处理中，3表示已完成，4表示失败，5表示已取消
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务创建时间，Unix 时间戳 
     * @return CreateTime 任务创建时间，Unix 时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间，Unix 时间戳
     * @param CreateTime 任务创建时间，Unix 时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后任务更新时间，Unix 时间戳 
     * @return UpdateTime 最后任务更新时间，Unix 时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后任务更新时间，Unix 时间戳
     * @param UpdateTime 最后任务更新时间，Unix 时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 返回的错误码 
     * @return RetCode 返回的错误码
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set 返回的错误码
     * @param RetCode 返回的错误码
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get 返回的错误信息 
     * @return ErrMsg 返回的错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 返回的错误信息
     * @param ErrMsg 返回的错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

