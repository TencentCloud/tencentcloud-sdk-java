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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IOSResult extends AbstractModel {

    /**
    * 加固任务结果Id
    */
    @SerializedName("ResultId")
    @Expose
    private String ResultId;

    /**
    * 用户uid
    */
    @SerializedName("OpUin")
    @Expose
    private Long OpUin;

    /**
    * 加固类型，这里为ios
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 加固状态：0等待，1成功，2任务中，3失败，4重试中
    */
    @SerializedName("EncryptState")
    @Expose
    private Long EncryptState;

    /**
    * 业务错误码
    */
    @SerializedName("EncryptErrno")
    @Expose
    private Long EncryptErrno;

    /**
    * 业务错误信息
    */
    @SerializedName("EncryptErrDesc")
    @Expose
    private String EncryptErrDesc;

    /**
    * 创建时间
    */
    @SerializedName("CreatTime")
    @Expose
    private String CreatTime;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 消耗时间
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * 加固（混淆）包结果url
    */
    @SerializedName("EncryptPkgUrl")
    @Expose
    private String EncryptPkgUrl;

    /**
     * Get 加固任务结果Id 
     * @return ResultId 加固任务结果Id
     */
    public String getResultId() {
        return this.ResultId;
    }

    /**
     * Set 加固任务结果Id
     * @param ResultId 加固任务结果Id
     */
    public void setResultId(String ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Get 用户uid 
     * @return OpUin 用户uid
     */
    public Long getOpUin() {
        return this.OpUin;
    }

    /**
     * Set 用户uid
     * @param OpUin 用户uid
     */
    public void setOpUin(Long OpUin) {
        this.OpUin = OpUin;
    }

    /**
     * Get 加固类型，这里为ios 
     * @return EncryptType 加固类型，这里为ios
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set 加固类型，这里为ios
     * @param EncryptType 加固类型，这里为ios
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 加固状态：0等待，1成功，2任务中，3失败，4重试中 
     * @return EncryptState 加固状态：0等待，1成功，2任务中，3失败，4重试中
     */
    public Long getEncryptState() {
        return this.EncryptState;
    }

    /**
     * Set 加固状态：0等待，1成功，2任务中，3失败，4重试中
     * @param EncryptState 加固状态：0等待，1成功，2任务中，3失败，4重试中
     */
    public void setEncryptState(Long EncryptState) {
        this.EncryptState = EncryptState;
    }

    /**
     * Get 业务错误码 
     * @return EncryptErrno 业务错误码
     */
    public Long getEncryptErrno() {
        return this.EncryptErrno;
    }

    /**
     * Set 业务错误码
     * @param EncryptErrno 业务错误码
     */
    public void setEncryptErrno(Long EncryptErrno) {
        this.EncryptErrno = EncryptErrno;
    }

    /**
     * Get 业务错误信息 
     * @return EncryptErrDesc 业务错误信息
     */
    public String getEncryptErrDesc() {
        return this.EncryptErrDesc;
    }

    /**
     * Set 业务错误信息
     * @param EncryptErrDesc 业务错误信息
     */
    public void setEncryptErrDesc(String EncryptErrDesc) {
        this.EncryptErrDesc = EncryptErrDesc;
    }

    /**
     * Get 创建时间 
     * @return CreatTime 创建时间
     */
    public String getCreatTime() {
        return this.CreatTime;
    }

    /**
     * Set 创建时间
     * @param CreatTime 创建时间
     */
    public void setCreatTime(String CreatTime) {
        this.CreatTime = CreatTime;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 消耗时间 
     * @return CostTime 消耗时间
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 消耗时间
     * @param CostTime 消耗时间
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 加固（混淆）包结果url 
     * @return EncryptPkgUrl 加固（混淆）包结果url
     */
    public String getEncryptPkgUrl() {
        return this.EncryptPkgUrl;
    }

    /**
     * Set 加固（混淆）包结果url
     * @param EncryptPkgUrl 加固（混淆）包结果url
     */
    public void setEncryptPkgUrl(String EncryptPkgUrl) {
        this.EncryptPkgUrl = EncryptPkgUrl;
    }

    public IOSResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IOSResult(IOSResult source) {
        if (source.ResultId != null) {
            this.ResultId = new String(source.ResultId);
        }
        if (source.OpUin != null) {
            this.OpUin = new Long(source.OpUin);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.EncryptState != null) {
            this.EncryptState = new Long(source.EncryptState);
        }
        if (source.EncryptErrno != null) {
            this.EncryptErrno = new Long(source.EncryptErrno);
        }
        if (source.EncryptErrDesc != null) {
            this.EncryptErrDesc = new String(source.EncryptErrDesc);
        }
        if (source.CreatTime != null) {
            this.CreatTime = new String(source.CreatTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
        if (source.EncryptPkgUrl != null) {
            this.EncryptPkgUrl = new String(source.EncryptPkgUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);
        this.setParamSimple(map, prefix + "OpUin", this.OpUin);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "EncryptState", this.EncryptState);
        this.setParamSimple(map, prefix + "EncryptErrno", this.EncryptErrno);
        this.setParamSimple(map, prefix + "EncryptErrDesc", this.EncryptErrDesc);
        this.setParamSimple(map, prefix + "CreatTime", this.CreatTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "EncryptPkgUrl", this.EncryptPkgUrl);

    }
}

