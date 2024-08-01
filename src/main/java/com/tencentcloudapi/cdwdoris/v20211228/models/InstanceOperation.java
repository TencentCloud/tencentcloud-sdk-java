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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceOperation extends AbstractModel {

    /**
    * 操作名称，例如“create_instance"、“scaleout_instance”等
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 操作结果，“Success"表示成功，”Fail"表示失败
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 操作名称描述，例如“创建”，“修改集群名称”等
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 操作级别，例如“Critical", "Normal"等
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 操作级别描述，例如“高危”，“一般”等
    */
    @SerializedName("LevelDesc")
    @Expose
    private String LevelDesc;

    /**
    * 操作开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 操作结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 操作结果描述，例如“成功”，“失败”
    */
    @SerializedName("ResultDesc")
    @Expose
    private String ResultDesc;

    /**
    * 操作用户ID
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * 操作对应的jobid
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 操作明细
    */
    @SerializedName("OperationDetail")
    @Expose
    private String OperationDetail;

    /**
     * Get 操作名称，例如“create_instance"、“scaleout_instance”等 
     * @return Name 操作名称，例如“create_instance"、“scaleout_instance”等
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 操作名称，例如“create_instance"、“scaleout_instance”等
     * @param Name 操作名称，例如“create_instance"、“scaleout_instance”等
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 操作结果，“Success"表示成功，”Fail"表示失败 
     * @return Result 操作结果，“Success"表示成功，”Fail"表示失败
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 操作结果，“Success"表示成功，”Fail"表示失败
     * @param Result 操作结果，“Success"表示成功，”Fail"表示失败
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 操作名称描述，例如“创建”，“修改集群名称”等 
     * @return Desc 操作名称描述，例如“创建”，“修改集群名称”等
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 操作名称描述，例如“创建”，“修改集群名称”等
     * @param Desc 操作名称描述，例如“创建”，“修改集群名称”等
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 操作级别，例如“Critical", "Normal"等 
     * @return Level 操作级别，例如“Critical", "Normal"等
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 操作级别，例如“Critical", "Normal"等
     * @param Level 操作级别，例如“Critical", "Normal"等
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 操作级别描述，例如“高危”，“一般”等 
     * @return LevelDesc 操作级别描述，例如“高危”，“一般”等
     */
    public String getLevelDesc() {
        return this.LevelDesc;
    }

    /**
     * Set 操作级别描述，例如“高危”，“一般”等
     * @param LevelDesc 操作级别描述，例如“高危”，“一般”等
     */
    public void setLevelDesc(String LevelDesc) {
        this.LevelDesc = LevelDesc;
    }

    /**
     * Get 操作开始时间 
     * @return StartTime 操作开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 操作开始时间
     * @param StartTime 操作开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 操作结束时间 
     * @return EndTime 操作结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 操作结束时间
     * @param EndTime 操作结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 操作结果描述，例如“成功”，“失败” 
     * @return ResultDesc 操作结果描述，例如“成功”，“失败”
     */
    public String getResultDesc() {
        return this.ResultDesc;
    }

    /**
     * Set 操作结果描述，例如“成功”，“失败”
     * @param ResultDesc 操作结果描述，例如“成功”，“失败”
     */
    public void setResultDesc(String ResultDesc) {
        this.ResultDesc = ResultDesc;
    }

    /**
     * Get 操作用户ID 
     * @return OperateUin 操作用户ID
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作用户ID
     * @param OperateUin 操作用户ID
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 操作对应的jobid 
     * @return JobId 操作对应的jobid
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 操作对应的jobid
     * @param JobId 操作对应的jobid
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 操作明细 
     * @return OperationDetail 操作明细
     */
    public String getOperationDetail() {
        return this.OperationDetail;
    }

    /**
     * Set 操作明细
     * @param OperationDetail 操作明细
     */
    public void setOperationDetail(String OperationDetail) {
        this.OperationDetail = OperationDetail;
    }

    public InstanceOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceOperation(InstanceOperation source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.LevelDesc != null) {
            this.LevelDesc = new String(source.LevelDesc);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ResultDesc != null) {
            this.ResultDesc = new String(source.ResultDesc);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.OperationDetail != null) {
            this.OperationDetail = new String(source.OperationDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "LevelDesc", this.LevelDesc);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ResultDesc", this.ResultDesc);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "OperationDetail", this.OperationDetail);

    }
}

